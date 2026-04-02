package com.amazon.aps.iva.ef0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.zip.Deflater;
/* compiled from: DeflaterSink.kt */
/* loaded from: classes4.dex */
public final class j implements b0 {
    public final g b;
    public final Deflater c;
    public boolean d;

    public j(w wVar, Deflater deflater) {
        this.b = wVar;
        this.c = deflater;
    }

    public final void a(boolean z) {
        y G;
        int deflate;
        g gVar = this.b;
        e d = gVar.d();
        while (true) {
            G = d.G(1);
            Deflater deflater = this.c;
            byte[] bArr = G.a;
            if (z) {
                try {
                    int i = G.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = G.c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                G.c += deflate;
                d.c += deflate;
                gVar.o();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (G.b == G.c) {
            d.b = G.a();
            z.a(G);
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.c;
        if (this.d) {
            return;
        }
        try {
            deflater.finish();
            a(false);
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
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.b.flush();
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final e0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.b + ')';
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) throws IOException {
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        b.b(eVar.c, 0L, j);
        while (j > 0) {
            y yVar = eVar.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int min = (int) Math.min(j, yVar.c - yVar.b);
            this.c.setInput(yVar.a, yVar.b, min);
            a(false);
            long j2 = min;
            eVar.c -= j2;
            int i = yVar.b + min;
            yVar.b = i;
            if (i == yVar.c) {
                eVar.b = yVar.a();
                z.a(yVar);
            }
            j -= j2;
        }
    }
}
