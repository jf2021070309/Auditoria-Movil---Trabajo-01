package com.amazon.aps.iva.m0;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
    public final /* synthetic */ k<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k<Object> kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Float invoke() {
        float f;
        float f2;
        k<Object> kVar = this.h;
        Float f3 = kVar.b().get(kVar.c());
        float f4 = 0.0f;
        if (f3 != null) {
            f = f3.floatValue();
        } else {
            f = 0.0f;
        }
        Float f5 = kVar.b().get(kVar.i.getValue());
        if (f5 != null) {
            f2 = f5.floatValue();
        } else {
            f2 = 0.0f;
        }
        float f6 = f2 - f;
        if (Math.abs(f6) > 1.0E-6f) {
            float f7 = (kVar.f() - f) / f6;
            if (f7 >= 1.0E-6f) {
                if (f7 <= 0.999999f) {
                    f4 = f7;
                }
            }
            return Float.valueOf(f4);
        }
        f4 = 1.0f;
        return Float.valueOf(f4);
    }
}
