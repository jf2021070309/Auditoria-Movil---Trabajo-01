package com.amazon.aps.iva.m0;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Object> {
    public final /* synthetic */ k<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k<Object> kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Object invoke() {
        Object c;
        k<Object> kVar = this.h;
        T value = kVar.n.getValue();
        if (value == 0) {
            float d = kVar.d();
            if (!Float.isNaN(d)) {
                c = kVar.a(d, 0.0f, kVar.c());
            } else {
                c = kVar.c();
            }
            return c;
        }
        return value;
    }
}
