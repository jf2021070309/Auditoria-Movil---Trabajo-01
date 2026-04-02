package okio;

import com.flurry.android.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
final class c implements BufferedSource {
    public final Buffer a = new Buffer();
    public final Source b;
    boolean c;

    c(Source source) {
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.b = source;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this.a;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
            return -1L;
        }
        return this.a.read(buffer, Math.min(j, this.a.b));
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.a.exhausted() && this.b.read(this.a, 8192L) == -1;
    }

    @Override // okio.BufferedSource
    public void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.a.b < j) {
            if (this.b.read(this.a, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        require(1L);
        return this.a.readByte();
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        this.a.writeAll(this.b);
        return this.a.readByteString();
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) {
        require(j);
        return this.a.readByteString(j);
    }

    @Override // okio.BufferedSource
    public int select(Options options) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            int a = this.a.a(options);
            if (a == -1) {
                return -1;
            }
            int size = options.a[a].size();
            if (size <= this.a.b) {
                this.a.skip(size);
                return a;
            }
        } while (this.b.read(this.a, 8192L) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        this.a.writeAll(this.b);
        return this.a.readByteArray();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) {
        require(j);
        return this.a.readByteArray(j);
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) {
        try {
            require(bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.a.b > 0) {
                int read = this.a.read(bArr, i, (int) this.a.b);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i, int i2) {
        g.a(bArr.length, i, i2);
        if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
            return -1;
        }
        return this.a.read(bArr, i, (int) Math.min(i2, this.a.b));
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j) {
        try {
            require(j);
            this.a.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(this.a);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.b.read(this.a, 8192L) != -1) {
            long completeSegmentByteCount = this.a.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.a, completeSegmentByteCount);
            }
        }
        if (this.a.size() > 0) {
            long size = j + this.a.size();
            sink.write(this.a, this.a.size());
            return size;
        }
        return j;
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        this.a.writeAll(this.b);
        return this.a.readUtf8();
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j) {
        require(j);
        return this.a.readUtf8(j);
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.a.writeAll(this.b);
        return this.a.readString(charset);
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) {
        require(j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return this.a.readString(j, charset);
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            if (this.a.b != 0) {
                return readUtf8(this.a.b);
            }
            return null;
        }
        return this.a.a(indexOf);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            Buffer buffer = new Buffer();
            this.a.copyTo(buffer, 0L, Math.min(32L, this.a.size()));
            throw new EOFException("\\n not found: size=" + this.a.size() + " content=" + buffer.readByteString().hex() + "…");
        }
        return this.a.a(indexOf);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
        require(1L);
        byte b = this.a.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.a.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        require(2L);
        return this.a.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
        require(2L);
        return this.a.readShortLe();
    }

    @Override // okio.BufferedSource
    public int readInt() {
        require(4L);
        return this.a.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
        require(4L);
        return this.a.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        require(8L);
        return this.a.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
        require(8L);
        return this.a.readLongLe();
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
        require(1L);
        for (int i = 0; request(i + 1); i++) {
            byte b = this.a.getByte(i);
            if ((b < 48 || b > 57) && (i != 0 || b != 45)) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b)));
                }
                return this.a.readDecimalLong();
            }
        }
        return this.a.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
        require(1L);
        for (int i = 0; request(i + 1); i++) {
            byte b = this.a.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b)));
                }
                return this.a.readHexadecimalUnsignedLong();
            }
        }
        return this.a.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.a.size());
            this.a.skip(min);
            j -= min;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.a.indexOf(b, j);
            if (indexOf == -1) {
                long j2 = this.a.b;
                if (this.b.read(this.a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            } else {
                return indexOf;
            }
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) {
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.a.indexOf(byteString, j);
            if (indexOf == -1) {
                long j2 = this.a.b;
                if (this.b.read(this.a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, (j2 - byteString.size()) + 1);
            } else {
                return indexOf;
            }
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.a.indexOfElement(byteString, j);
            if (indexOfElement == -1) {
                long j2 = this.a.b;
                if (this.b.read(this.a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            } else {
                return indexOfElement;
            }
        }
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString) {
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!request(1 + j2) || this.a.getByte(j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.c.1
            @Override // java.io.InputStream
            public int read() {
                if (c.this.c) {
                    throw new IOException("closed");
                }
                if (c.this.a.b == 0 && c.this.b.read(c.this.a, 8192L) == -1) {
                    return -1;
                }
                return c.this.a.readByte() & Constants.UNKNOWN;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                if (c.this.c) {
                    throw new IOException("closed");
                }
                g.a(bArr.length, i, i2);
                if (c.this.a.b == 0 && c.this.b.read(c.this.a, 8192L) == -1) {
                    return -1;
                }
                return c.this.a.read(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() {
                if (c.this.c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c.this.a.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c.this.close();
            }

            public String toString() {
                return c.this + ".inputStream()";
            }
        };
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.clear();
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.b.timeout();
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }
}
