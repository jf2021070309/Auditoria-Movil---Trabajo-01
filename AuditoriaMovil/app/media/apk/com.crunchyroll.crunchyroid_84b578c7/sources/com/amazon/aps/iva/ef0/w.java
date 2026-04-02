package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.ef0.e;
import com.google.android.gms.cast.MediaStatus;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
/* compiled from: RealBufferedSink.kt */
/* loaded from: classes4.dex */
public final class w implements g {
    public final b0 b;
    public final e c;
    public boolean d;

    public w(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "sink");
        this.b = b0Var;
        this.c = new e();
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g J(int i, byte[] bArr, int i2) {
        com.amazon.aps.iva.yb0.j.f(bArr, FirebaseAnalytics.Param.SOURCE);
        if (!this.d) {
            this.c.H(i, bArr, i2);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g Q(long j) {
        if (!this.d) {
            this.c.M(j);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g S(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "byteString");
        if (!this.d) {
            this.c.I(iVar);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void a(int i) {
        if (!this.d) {
            e eVar = this.c;
            eVar.getClass();
            e.a aVar = b.a;
            eVar.O(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            o();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b0 b0Var = this.b;
        if (!this.d) {
            try {
                e eVar = this.c;
                long j = eVar.c;
                if (j > 0) {
                    b0Var.write(eVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                b0Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final e d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ef0.g, com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() {
        if (!this.d) {
            e eVar = this.c;
            long j = eVar.c;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            b0 b0Var = this.b;
            if (i > 0) {
                b0Var.write(eVar, j);
            }
            b0Var.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g g0(long j) {
        if (!this.d) {
            this.c.N(j);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g j() {
        if (!this.d) {
            e eVar = this.c;
            long j = eVar.c;
            if (j > 0) {
                this.b.write(eVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g o() {
        if (!this.d) {
            e eVar = this.c;
            long f = eVar.f();
            if (f > 0) {
                this.b.write(eVar, f);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final long r(d0 d0Var) {
        long j = 0;
        while (true) {
            long read = d0Var.read(this.c, MediaStatus.COMMAND_PLAYBACK_RATE);
            if (read != -1) {
                j += read;
                o();
            } else {
                return j;
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final e0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g u(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "string");
        if (!this.d) {
            this.c.c0(str);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        com.amazon.aps.iva.yb0.j.f(byteBuffer, FirebaseAnalytics.Param.SOURCE);
        if (!this.d) {
            int write = this.c.write(byteBuffer);
            o();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g writeByte(int i) {
        if (!this.d) {
            this.c.L(i);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g writeInt(int i) {
        if (!this.d) {
            this.c.O(i);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g writeShort(int i) {
        if (!this.d) {
            this.c.V(i);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) {
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        if (!this.d) {
            this.c.write(eVar, j);
            o();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g write(byte[] bArr) {
        com.amazon.aps.iva.yb0.j.f(bArr, FirebaseAnalytics.Param.SOURCE);
        if (!this.d) {
            this.c.K(bArr);
            o();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
