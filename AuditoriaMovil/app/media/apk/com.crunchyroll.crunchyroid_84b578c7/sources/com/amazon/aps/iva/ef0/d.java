package com.amazon.aps.iva.ef0;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: Okio.kt */
/* loaded from: classes4.dex */
public final class d implements b0 {
    @Override // com.amazon.aps.iva.ef0.b0
    public final e0 timeout() {
        return e0.NONE;
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) {
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        eVar.e(j);
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() {
    }
}
