package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
final class b implements BufferedSink {
    public final Buffer a = new Buffer();
    public final Sink b;
    boolean c;

    b(Sink sink) {
        if (sink == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = sink;
    }

    @Override // okio.BufferedSink
    public Buffer buffer() {
        return this.a;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.write(buffer, j);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeUtf8(str);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeUtf8(str, i, i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeUtf8CodePoint(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeString(str, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, int i, int i2, Charset charset) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeString(str, i, i2, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.write(bArr);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.write(bArr, i, i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = source.read(this.a, 8192L);
            if (read != -1) {
                j += read;
                emitCompleteSegments();
            } else {
                return j;
            }
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink write(Source source, long j) {
        while (j > 0) {
            long read = source.read(this.a, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeByte(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeShort(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShortLe(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeShortLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeIntLe(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLong(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLongLe(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeLongLe(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeDecimalLong(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeDecimalLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.writeHexadecimalUnsignedLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink emitCompleteSegments() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long completeSegmentByteCount = this.a.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.b.write(this.a, completeSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public BufferedSink emit() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long size = this.a.size();
        if (size > 0) {
            this.b.write(this.a, size);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.b.1
            @Override // java.io.OutputStream
            public void write(int i) {
                if (b.this.c) {
                    throw new IOException("closed");
                }
                b.this.a.writeByte((int) ((byte) i));
                b.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                if (b.this.c) {
                    throw new IOException("closed");
                }
                b.this.a.write(bArr, i, i2);
                b.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                if (!b.this.c) {
                    b.this.flush();
                }
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                b.this.close();
            }

            public String toString() {
                return b.this + ".outputStream()";
            }
        };
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            this.b.write(this.a, this.a.b);
        }
        this.b.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.write(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                g.a(th);
            }
        }
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.b.timeout();
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }
}
