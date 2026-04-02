package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.e4.t0;
import java.util.List;
/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class k extends g<PointF> {
    public final PointF i;

    public k(List<com.amazon.aps.iva.na.a<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        return h(aVar, f, f, f);
    }

    @Override // com.amazon.aps.iva.ca.a
    /* renamed from: l */
    public final PointF h(com.amazon.aps.iva.na.a<PointF> aVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.b;
        if (pointF3 != null && (pointF = aVar.c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            com.amazon.aps.iva.na.c<A> cVar = this.e;
            if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.g, aVar.h.floatValue(), pointF4, pointF5, f, e(), this.d)) != null) {
                return pointF2;
            }
            PointF pointF6 = this.i;
            float f4 = pointF4.x;
            float a = t0.a(pointF5.x, f4, f2, f4);
            float f5 = pointF4.y;
            pointF6.set(a, ((pointF5.y - f5) * f3) + f5);
            return pointF6;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
