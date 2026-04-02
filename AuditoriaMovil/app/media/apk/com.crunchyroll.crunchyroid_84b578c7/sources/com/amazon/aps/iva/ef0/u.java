package com.amazon.aps.iva.ef0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.OutputStream;
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final class u implements b0 {
    public final OutputStream b;
    public final e0 c;

    public u(OutputStream outputStream, e0 e0Var) {
        this.b = outputStream;
        this.c = e0Var;
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final e0 timeout() {
        return this.c;
    }

    public final String toString() {
        return "sink(" + this.b + ')';
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) {
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        b.b(eVar.c, 0L, j);
        while (j > 0) {
            this.c.throwIfReached();
            y yVar = eVar.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int min = (int) Math.min(j, yVar.c - yVar.b);
            this.b.write(yVar.a, yVar.b, min);
            int i = yVar.b + min;
            yVar.b = i;
            long j2 = min;
            j -= j2;
            eVar.c -= j2;
            if (i == yVar.c) {
                eVar.b = yVar.a();
                z.a(yVar);
            }
        }
    }
}
