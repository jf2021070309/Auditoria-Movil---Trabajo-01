package com.amazon.aps.iva.ca;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class j extends g<PointF> {
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public i l;

    public j(List<? extends com.amazon.aps.iva.na.a<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        PointF pointF;
        i iVar = (i) aVar;
        Path path = iVar.q;
        if (path == null) {
            return (PointF) aVar.b;
        }
        com.amazon.aps.iva.na.c<A> cVar = this.e;
        if (cVar == 0 || (pointF = (PointF) cVar.b(iVar.g, iVar.h.floatValue(), (PointF) iVar.b, (PointF) iVar.c, e(), f, this.d)) == null) {
            i iVar2 = this.l;
            PathMeasure pathMeasure = this.k;
            if (iVar2 != iVar) {
                pathMeasure.setPath(path, false);
                this.l = iVar;
            }
            float[] fArr = this.j;
            pathMeasure.getPosTan(pathMeasure.getLength() * f, fArr, null);
            PointF pointF2 = this.i;
            pointF2.set(fArr[0], fArr[1]);
            return pointF2;
        }
        return pointF;
    }
}
