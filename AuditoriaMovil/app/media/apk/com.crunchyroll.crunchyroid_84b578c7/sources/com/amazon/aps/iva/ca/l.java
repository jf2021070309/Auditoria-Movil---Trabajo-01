package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.e4.t0;
import java.util.List;
/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class l extends g<com.amazon.aps.iva.na.d> {
    public final com.amazon.aps.iva.na.d i;

    public l(List<com.amazon.aps.iva.na.a<com.amazon.aps.iva.na.d>> list) {
        super(list);
        this.i = new com.amazon.aps.iva.na.d();
    }

    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        T t;
        com.amazon.aps.iva.na.d dVar;
        T t2 = aVar.b;
        if (t2 != 0 && (t = aVar.c) != 0) {
            com.amazon.aps.iva.na.d dVar2 = (com.amazon.aps.iva.na.d) t2;
            com.amazon.aps.iva.na.d dVar3 = (com.amazon.aps.iva.na.d) t;
            com.amazon.aps.iva.na.c<A> cVar = this.e;
            if (cVar == 0 || (dVar = (com.amazon.aps.iva.na.d) cVar.b(aVar.g, aVar.h.floatValue(), dVar2, dVar3, f, e(), this.d)) == null) {
                float f2 = dVar2.a;
                float f3 = dVar3.a;
                PointF pointF = com.amazon.aps.iva.ma.f.a;
                float a = t0.a(f3, f2, f, f2);
                float f4 = dVar2.b;
                float a2 = t0.a(dVar3.b, f4, f, f4);
                com.amazon.aps.iva.na.d dVar4 = this.i;
                dVar4.a = a;
                dVar4.b = a2;
                return dVar4;
            }
            return dVar;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
