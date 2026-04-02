package com.amazon.aps.iva.v1;

import android.content.Context;
/* compiled from: AndroidCompositionLocals.android.kt */
/* loaded from: classes.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ p0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Context context, p0 p0Var) {
        super(1);
        this.h = context;
        this.i = p0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        Context context = this.h;
        Context applicationContext = context.getApplicationContext();
        p0 p0Var = this.i;
        applicationContext.registerComponentCallbacks(p0Var);
        return new n0(context, p0Var);
    }
}
