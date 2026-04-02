package com.amazon.aps.iva.tz;

import android.content.Intent;
/* compiled from: BrowsePresenter.kt */
/* loaded from: classes2.dex */
public final class x0 extends com.amazon.aps.iva.wy.b<c1> implements w0 {
    public final b1 b;
    public final com.amazon.aps.iva.vz.b c;

    public x0(r0 r0Var, b1 b1Var, com.amazon.aps.iva.vz.c cVar) {
        super(r0Var, new com.amazon.aps.iva.wy.j[0]);
        this.b = b1Var;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        b1 b1Var = this.b;
        if (b1Var != null) {
            getView().Vh(b1Var);
        }
        this.c.c();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.c.onNewIntent(intent);
    }
}
