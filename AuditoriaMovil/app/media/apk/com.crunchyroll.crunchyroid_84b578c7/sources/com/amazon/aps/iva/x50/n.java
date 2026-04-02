package com.amazon.aps.iva.x50;

import android.os.Handler;
/* compiled from: DelayedCall.kt */
/* loaded from: classes2.dex */
public final class n implements m {
    public final Handler b;

    public n(Handler handler) {
        com.amazon.aps.iva.yb0.j.f(handler, "handler");
        this.b = handler;
    }

    @Override // com.amazon.aps.iva.x50.m
    public final void a() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // com.amazon.aps.iva.x50.m
    public final boolean b(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, long j) {
        return this.b.postDelayed(new com.amazon.aps.iva.v1.s(2, aVar), j);
    }

    @Override // com.amazon.aps.iva.x50.m
    public final void c(com.amazon.aps.iva.e.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "r");
        this.b.removeCallbacks(hVar);
    }

    @Override // com.amazon.aps.iva.x50.m
    public final boolean d(com.amazon.aps.iva.e.h hVar, long j) {
        com.amazon.aps.iva.yb0.j.f(hVar, "runnable");
        return this.b.postDelayed(hVar, j);
    }
}
