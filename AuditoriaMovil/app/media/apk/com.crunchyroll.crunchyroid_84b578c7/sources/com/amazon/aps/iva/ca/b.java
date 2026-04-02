package com.amazon.aps.iva.ca;
/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class b extends g<Integer> {
    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        return Integer.valueOf(l(aVar, f));
    }

    public final int l(com.amazon.aps.iva.na.a<Integer> aVar, float f) {
        Integer num;
        if (aVar.b != null && aVar.c != null) {
            com.amazon.aps.iva.na.c<A> cVar = this.e;
            Integer num2 = aVar.b;
            if (cVar != 0 && (num = (Integer) cVar.b(aVar.g, aVar.h.floatValue(), num2, aVar.c, f, e(), this.d)) != null) {
                return num.intValue();
            }
            return com.amazon.aps.iva.gr.n.s(num2.intValue(), com.amazon.aps.iva.ma.f.b(f, 0.0f, 1.0f), aVar.c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
