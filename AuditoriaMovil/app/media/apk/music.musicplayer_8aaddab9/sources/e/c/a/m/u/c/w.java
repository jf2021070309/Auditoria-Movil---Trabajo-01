package e.c.a.m.u.c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class w extends FilterInputStream {
    public volatile byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5895b;

    /* renamed from: c  reason: collision with root package name */
    public int f5896c;

    /* renamed from: d  reason: collision with root package name */
    public int f5897d;

    /* renamed from: e  reason: collision with root package name */
    public int f5898e;

    /* renamed from: f  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5899f;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, e.c.a.m.s.c0.b bVar) {
        super(inputStream);
        this.f5897d = -1;
        this.f5899f = bVar;
        this.a = (byte[]) bVar.e(65536, byte[].class);
    }

    public static IOException f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f5897d;
        if (i2 != -1) {
            int i3 = this.f5898e - i2;
            int i4 = this.f5896c;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f5895b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5899f.e(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f5899f.d(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f5898e - this.f5897d;
                this.f5898e = i5;
                this.f5897d = 0;
                this.f5895b = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f5898e;
                if (read > 0) {
                    i6 += read;
                }
                this.f5895b = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f5897d = -1;
            this.f5898e = 0;
            this.f5895b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a == null || inputStream == null) {
            f();
            throw null;
        }
        return (this.f5895b - this.f5898e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.a != null) {
            this.f5899f.d(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f5896c = Math.max(this.f5896c, i2);
        this.f5897d = this.f5898e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            f();
            throw null;
        } else if (this.f5898e < this.f5895b || a(inputStream, bArr) != -1) {
            if (bArr != this.a && (bArr = this.a) == null) {
                f();
                throw null;
            }
            int i2 = this.f5895b;
            int i3 = this.f5898e;
            if (i2 - i3 > 0) {
                this.f5898e = i3 + 1;
                return bArr[i3] & 255;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            f();
            throw null;
        } else if (i3 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                f();
                throw null;
            }
            int i6 = this.f5898e;
            int i7 = this.f5895b;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f5898e += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f5897d == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i4 != i3 ? i3 - i4 : -1;
                } else {
                    if (bArr2 != this.a && (bArr2 = this.a) == null) {
                        f();
                        throw null;
                    }
                    int i9 = this.f5895b;
                    int i10 = this.f5898e;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f5898e += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        }
    }

    public synchronized void release() {
        if (this.a != null) {
            this.f5899f.d(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f5897d;
        if (-1 == i2) {
            throw new a("Mark has been invalidated, pos: " + this.f5898e + " markLimit: " + this.f5896c);
        }
        this.f5898e = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            f();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            f();
            throw null;
        }
        int i2 = this.f5895b;
        int i3 = this.f5898e;
        if (i2 - i3 >= j2) {
            this.f5898e = (int) (i3 + j2);
            return j2;
        }
        long j3 = i2 - i3;
        this.f5898e = i2;
        if (this.f5897d == -1 || j2 > this.f5896c) {
            return j3 + inputStream.skip(j2 - j3);
        } else if (a(inputStream, bArr) == -1) {
            return j3;
        } else {
            int i4 = this.f5895b;
            int i5 = this.f5898e;
            if (i4 - i5 >= j2 - j3) {
                this.f5898e = (int) ((i5 + j2) - j3);
                return j2;
            }
            long j4 = (j3 + i4) - i5;
            this.f5898e = i4;
            return j4;
        }
    }
}
