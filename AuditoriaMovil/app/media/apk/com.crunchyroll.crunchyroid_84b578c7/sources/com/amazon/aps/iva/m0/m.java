package com.amazon.aps.iva.m0;

import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Object> {
    public final /* synthetic */ k<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k<Object> kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Object invoke() {
        boolean z;
        Object a;
        k<Object> kVar = this.h;
        T value = kVar.n.getValue();
        if (value == 0) {
            float d = kVar.d();
            if (!Float.isNaN(d)) {
                Object c = kVar.c();
                Map<Object, Float> b = kVar.b();
                Float f = b.get(c);
                if (f != null && f.floatValue() == d) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && f != null) {
                    if (f.floatValue() < d) {
                        a = j.a(b, d, true);
                    } else {
                        a = j.a(b, d, false);
                    }
                    return a;
                }
                return c;
            }
            return kVar.c();
        }
        return value;
    }
}
