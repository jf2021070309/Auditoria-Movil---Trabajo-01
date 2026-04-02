package com.amazon.aps.iva.j0;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class h2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, Float> {
    public final /* synthetic */ k2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k2 k2Var) {
        super(1);
        this.h = k2Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Float invoke(Float f) {
        float floatValue = f.floatValue();
        k2 k2Var = this.h;
        float a = k2Var.a() + floatValue;
        com.amazon.aps.iva.o0.v1 v1Var = k2Var.b;
        if (a > v1Var.d()) {
            floatValue = v1Var.d() - k2Var.a();
        } else if (a < 0.0f) {
            floatValue = -k2Var.a();
        }
        k2Var.a.q(k2Var.a() + floatValue);
        return Float.valueOf(floatValue);
    }
}
