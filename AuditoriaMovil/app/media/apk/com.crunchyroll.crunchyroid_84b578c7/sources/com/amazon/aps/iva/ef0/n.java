package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
/* compiled from: GzipSink.kt */
/* loaded from: classes4.dex */
public final class n implements b0 {
    public final w b;
    public final Deflater c;
    public final j d;
    public boolean e;
    public final CRC32 f;

    public n(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "sink");
        w wVar = new w(b0Var);
        this.b = wVar;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new j(wVar, deflater);
        this.f = new CRC32();
        e eVar = wVar.c;
        eVar.V(8075);
        eVar.L(8);
        eVar.L(0);
        eVar.O(0);
        eVar.L(0);
        eVar.L(0);
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.c;
        w wVar = this.b;
        if (this.e) {
            return;
        }
        try {
            j jVar = this.d;
            jVar.c.finish();
            jVar.a(false);
            wVar.a((int) this.f.getValue());
            wVar.a((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            wVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.e = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final e0 timeout() {
        return this.b.timeout();
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) throws IOException {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return;
            }
            y yVar = eVar.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, yVar.c - yVar.b);
                this.f.update(yVar.a, yVar.b, min);
                j2 -= min;
                yVar = yVar.f;
                com.amazon.aps.iva.yb0.j.c(yVar);
            }
            this.d.write(eVar, j);
            return;
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }
}
