package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<p> h;
    public final /* synthetic */ f0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.amazon.aps.iva.fc0.m mVar, f0 f0Var) {
        super(0);
        this.h = mVar;
        this.i = f0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Float invoke() {
        float a;
        p invoke = this.h.invoke();
        f0 f0Var = this.i;
        if (f0Var.b()) {
            a = invoke.b() + 1.0f;
        } else {
            a = f0Var.a();
        }
        return Float.valueOf(a);
    }
}
