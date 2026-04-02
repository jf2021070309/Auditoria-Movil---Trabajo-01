package k;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class q implements f {
    public final v a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9635b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9636c;

    public q(v vVar) {
        h.o.c.j.e(vVar, "sink");
        this.a = vVar;
        this.f9635b = new d();
    }

    @Override // k.f
    public f D(byte[] bArr, int i2, int i3) {
        h.o.c.j.e(bArr, "source");
        if (!this.f9636c) {
            this.f9635b.f0(bArr, i2, i3);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.v
    public void E(d dVar, long j2) {
        h.o.c.j.e(dVar, "source");
        if (!(!this.f9636c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9635b.E(dVar, j2);
        a();
    }

    @Override // k.f
    public f F(long j2) {
        if (!this.f9636c) {
            this.f9635b.F(j2);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f O(byte[] bArr) {
        h.o.c.j.e(bArr, "source");
        if (!this.f9636c) {
            this.f9635b.e0(bArr);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f P(h hVar) {
        h.o.c.j.e(hVar, "byteString");
        if (!this.f9636c) {
            this.f9635b.d0(hVar);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f Z(long j2) {
        if (!this.f9636c) {
            this.f9635b.Z(j2);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f a() {
        if (!this.f9636c) {
            long f2 = this.f9635b.f();
            if (f2 > 0) {
                this.a.E(this.f9635b, f2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public d b() {
        return this.f9635b;
    }

    @Override // k.v
    public y c() {
        return this.a.c();
    }

    @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9636c) {
            return;
        }
        Throwable th = null;
        try {
            d dVar = this.f9635b;
            long j2 = dVar.f9620b;
            if (j2 > 0) {
                this.a.E(dVar, j2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f9636c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // k.f, k.v, java.io.Flushable
    public void flush() {
        if (!(!this.f9636c)) {
            throw new IllegalStateException("closed".toString());
        }
        d dVar = this.f9635b;
        long j2 = dVar.f9620b;
        if (j2 > 0) {
            this.a.E(dVar, j2);
        }
        this.a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9636c;
    }

    @Override // k.f
    public f j(int i2) {
        if (!this.f9636c) {
            this.f9635b.l0(i2);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f k(int i2) {
        if (!this.f9636c) {
            this.f9635b.k0(i2);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f q(int i2) {
        if (!this.f9636c) {
            this.f9635b.h0(i2);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("buffer(");
        y.append(this.a);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        h.o.c.j.e(byteBuffer, "source");
        if (!this.f9636c) {
            int write = this.f9635b.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.f
    public f x(String str) {
        h.o.c.j.e(str, "string");
        if (!this.f9636c) {
            this.f9635b.m0(str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
