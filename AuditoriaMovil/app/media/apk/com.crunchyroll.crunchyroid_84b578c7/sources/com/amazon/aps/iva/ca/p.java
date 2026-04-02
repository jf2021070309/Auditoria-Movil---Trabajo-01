package com.amazon.aps.iva.ca;
/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class p extends g<com.amazon.aps.iva.fa.b> {
    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        T t;
        float floatValue;
        com.amazon.aps.iva.fa.b bVar;
        com.amazon.aps.iva.na.c<A> cVar = this.e;
        T t2 = aVar.b;
        if (cVar != 0) {
            float f2 = aVar.g;
            Float f3 = aVar.h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            com.amazon.aps.iva.fa.b bVar2 = (com.amazon.aps.iva.fa.b) t2;
            T t3 = aVar.c;
            if (t3 == 0) {
                bVar = bVar2;
            } else {
                bVar = (com.amazon.aps.iva.fa.b) t3;
            }
            return (com.amazon.aps.iva.fa.b) cVar.b(f2, floatValue, bVar2, bVar, f, d(), this.d);
        } else if (f == 1.0f && (t = aVar.c) != 0) {
            return (com.amazon.aps.iva.fa.b) t;
        } else {
            return (com.amazon.aps.iva.fa.b) t2;
        }
    }
}
