package com.amazon.aps.iva.m0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
    public final /* synthetic */ k<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k<Object> kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Float invoke() {
        Float valueOf;
        float f;
        Iterator<T> it = this.h.b().entrySet().iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        }
        if (valueOf != null) {
            f = valueOf.floatValue();
        } else {
            f = Float.NEGATIVE_INFINITY;
        }
        return Float.valueOf(f);
    }
}
