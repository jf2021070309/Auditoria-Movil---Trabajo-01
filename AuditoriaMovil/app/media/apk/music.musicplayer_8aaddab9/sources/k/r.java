package k;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class r implements g {
    public final x a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9637b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9638c;

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            r rVar = r.this;
            if (rVar.f9638c) {
                throw new IOException("closed");
            }
            return (int) Math.min(rVar.f9637b.f9620b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            r rVar = r.this;
            if (rVar.f9638c) {
                throw new IOException("closed");
            }
            d dVar = rVar.f9637b;
            if (dVar.f9620b == 0 && rVar.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return r.this.f9637b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            h.o.c.j.e(bArr, "data");
            if (r.this.f9638c) {
                throw new IOException("closed");
            }
            a0.b(bArr.length, i2, i3);
            r rVar = r.this;
            d dVar = rVar.f9637b;
            if (dVar.f9620b == 0 && rVar.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return r.this.f9637b.read(bArr, i2, i3);
        }

        public String toString() {
            return r.this + ".inputStream()";
        }
    }

    public r(x xVar) {
        h.o.c.j.e(xVar, "source");
        this.a = xVar;
        this.f9637b = new d();
    }

    @Override // k.g
    public boolean C(long j2, h hVar) {
        h.o.c.j.e(hVar, "bytes");
        int i2 = hVar.i();
        h.o.c.j.e(hVar, "bytes");
        if (!this.f9638c) {
            if (j2 >= 0 && i2 >= 0 && hVar.i() - 0 >= i2) {
                if (i2 <= 0) {
                    return true;
                }
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    long j3 = i3 + j2;
                    if (!G(1 + j3) || this.f9637b.r(j3) != hVar.v(i3 + 0)) {
                        break;
                    } else if (i4 >= i2) {
                        return true;
                    } else {
                        i3 = i4;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public boolean G(long j2) {
        d dVar;
        if (j2 >= 0) {
            if (!this.f9638c) {
                do {
                    dVar = this.f9637b;
                    if (dVar.f9620b >= j2) {
                        return true;
                    }
                } while (this.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount < 0: ", Long.valueOf(j2)).toString());
    }

    @Override // k.g
    public String J() {
        return w(Long.MAX_VALUE);
    }

    @Override // k.g
    public byte[] L(long j2) {
        if (G(j2)) {
            return this.f9637b.L(j2);
        }
        throw new EOFException();
    }

    @Override // k.x
    public long S(d dVar, long j2) {
        h.o.c.j.e(dVar, "sink");
        if (j2 >= 0) {
            if (true ^ this.f9638c) {
                d dVar2 = this.f9637b;
                if (dVar2.f9620b == 0 && this.a.S(dVar2, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                return this.f9637b.S(dVar, Math.min(j2, this.f9637b.f9620b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount < 0: ", Long.valueOf(j2)).toString());
    }

    @Override // k.g
    public long U(v vVar) {
        h.o.c.j.e(vVar, "sink");
        long j2 = 0;
        while (this.a.S(this.f9637b, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
            long f2 = this.f9637b.f();
            if (f2 > 0) {
                j2 += f2;
                ((d) vVar).E(this.f9637b, f2);
            }
        }
        d dVar = this.f9637b;
        long j3 = dVar.f9620b;
        if (j3 > 0) {
            long j4 = j2 + j3;
            ((d) vVar).E(dVar, j3);
            return j4;
        }
        return j2;
    }

    @Override // k.g
    public void Y(long j2) {
        if (!G(j2)) {
            throw new EOFException();
        }
    }

    public long a(byte b2, long j2, long j3) {
        boolean z = true;
        if (!this.f9638c) {
            if (!((0 > j2 || j2 > j3) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
            }
            while (j2 < j3) {
                long u = this.f9637b.u(b2, j2, j3);
                if (u != -1) {
                    return u;
                }
                d dVar = this.f9637b;
                long j4 = dVar.f9620b;
                if (j4 >= j3 || this.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j2 = Math.max(j2, j4);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g, k.f
    public d b() {
        return this.f9637b;
    }

    @Override // k.g
    public long b0() {
        byte r;
        Y(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!G(i3)) {
                break;
            }
            r = this.f9637b.r(i2);
            if ((r < ((byte) 48) || r > ((byte) 57)) && ((r < ((byte) 97) || r > ((byte) FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)) && (r < ((byte) 65) || r > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            e.j.d.w.o(16);
            e.j.d.w.o(16);
            String num = Integer.toString(r, 16);
            h.o.c.j.d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(h.o.c.j.i("Expected leading [0-9a-fA-F] character but was 0x", num));
        }
        return this.f9637b.b0();
    }

    @Override // k.x
    public y c() {
        return this.a.c();
    }

    @Override // k.g
    public InputStream c0() {
        return new a();
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9638c) {
            return;
        }
        this.f9638c = true;
        this.a.close();
        d dVar = this.f9637b;
        dVar.skip(dVar.f9620b);
    }

    public void f(byte[] bArr) {
        h.o.c.j.e(bArr, "sink");
        try {
            Y(bArr.length);
            this.f9637b.B(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                d dVar = this.f9637b;
                long j2 = dVar.f9620b;
                if (j2 <= 0) {
                    throw e2;
                }
                int read = dVar.read(bArr, i2, (int) j2);
                if (read == -1) {
                    throw new AssertionError();
                }
                i2 += read;
            }
        }
    }

    @Override // k.g
    public h g(long j2) {
        if (G(j2)) {
            return this.f9637b.g(j2);
        }
        throw new EOFException();
    }

    public int h() {
        Y(4L);
        int readInt = this.f9637b.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9638c;
    }

    @Override // k.g
    public d o() {
        return this.f9637b;
    }

    @Override // k.g
    public boolean p() {
        if (!this.f9638c) {
            return this.f9637b.p() && this.a.S(this.f9637b, FileAppender.DEFAULT_BUFFER_SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        h.o.c.j.e(byteBuffer, "sink");
        d dVar = this.f9637b;
        if (dVar.f9620b == 0 && this.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.f9637b.read(byteBuffer);
    }

    @Override // k.g
    public byte readByte() {
        Y(1L);
        return this.f9637b.readByte();
    }

    @Override // k.g
    public int readInt() {
        Y(4L);
        return this.f9637b.readInt();
    }

    @Override // k.g
    public short readShort() {
        Y(2L);
        return this.f9637b.readShort();
    }

    @Override // k.g
    public void skip(long j2) {
        if (!(!this.f9638c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            d dVar = this.f9637b;
            if (dVar.f9620b == 0 && this.a.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.f9637b.f9620b);
            this.f9637b.skip(min);
            j2 -= min;
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("buffer(");
        y.append(this.a);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }

    @Override // k.g
    public String w(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long a2 = a(b2, 0L, j3);
            if (a2 != -1) {
                return k.b0.a.a(this.f9637b, a2);
            }
            if (j3 < Long.MAX_VALUE && G(j3) && this.f9637b.r(j3 - 1) == ((byte) 13) && G(1 + j3) && this.f9637b.r(j3) == b2) {
                return k.b0.a.a(this.f9637b, j3);
            }
            d dVar = new d();
            d dVar2 = this.f9637b;
            dVar2.m(dVar, 0L, Math.min(32, dVar2.f9620b));
            StringBuilder y = e.a.d.a.a.y("\\n not found: limit=");
            y.append(Math.min(this.f9637b.f9620b, j2));
            y.append(" content=");
            y.append(dVar.z().t());
            y.append((char) 8230);
            throw new EOFException(y.toString());
        }
        throw new IllegalArgumentException(h.o.c.j.i("limit < 0: ", Long.valueOf(j2)).toString());
    }
}
