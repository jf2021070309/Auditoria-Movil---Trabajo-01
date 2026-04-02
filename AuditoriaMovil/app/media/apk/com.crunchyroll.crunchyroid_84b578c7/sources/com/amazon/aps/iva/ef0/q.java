package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final class q implements d0 {
    public final InputStream b;
    public final e0 c;

    public q(InputStream inputStream, e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(inputStream, "input");
        com.amazon.aps.iva.yb0.j.f(e0Var, "timeout");
        this.b = inputStream;
        this.c = e0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final long read(e eVar, long j) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.c.throwIfReached();
                y G = eVar.G(1);
                int read = this.b.read(G.a, G.c, (int) Math.min(j, 8192 - G.c));
                if (read == -1) {
                    if (G.b == G.c) {
                        eVar.b = G.a();
                        z.a(G);
                        return -1L;
                    }
                    return -1L;
                }
                G.c += read;
                long j2 = read;
                eVar.c += j2;
                return j2;
            } catch (AssertionError e) {
                if (r.c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return this.c;
    }

    public final String toString() {
        return "source(" + this.b + ')';
    }
}
