package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.e4.t0;
/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class d extends g<Float> {
    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        return Float.valueOf(m(aVar, f));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(com.amazon.aps.iva.na.a<Float> aVar, float f) {
        Float f2;
        if (aVar.b != null && aVar.c != null) {
            com.amazon.aps.iva.na.c<A> cVar = this.e;
            Float f3 = aVar.b;
            if (cVar != 0 && (f2 = (Float) cVar.b(aVar.g, aVar.h.floatValue(), f3, aVar.c, f, e(), this.d)) != null) {
                return f2.floatValue();
            }
            if (aVar.i == -3987645.8f) {
                aVar.i = f3.floatValue();
            }
            float f4 = aVar.i;
            if (aVar.j == -3987645.8f) {
                aVar.j = aVar.c.floatValue();
            }
            float f5 = aVar.j;
            PointF pointF = com.amazon.aps.iva.ma.f.a;
            return t0.a(f5, f4, f, f4);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
