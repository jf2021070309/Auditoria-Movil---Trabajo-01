package com.amazon.aps.iva.ca;

import android.graphics.Path;
import android.graphics.PointF;
import com.amazon.aps.iva.ma.g;
/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.na.a<PointF> {
    public Path q;
    public final com.amazon.aps.iva.na.a<PointF> r;

    public i(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.na.a<PointF> aVar) {
        super(hVar, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
        this.r = aVar;
        d();
    }

    public final void d() {
        boolean z;
        T t;
        T t2 = this.c;
        T t3 = this.b;
        if (t2 != 0 && t3 != 0 && ((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) {
            z = true;
        } else {
            z = false;
        }
        if (t3 != 0 && (t = this.c) != 0 && !z) {
            PointF pointF = (PointF) t3;
            PointF pointF2 = (PointF) t;
            com.amazon.aps.iva.na.a<PointF> aVar = this.r;
            PointF pointF3 = aVar.o;
            PointF pointF4 = aVar.p;
            g.a aVar2 = com.amazon.aps.iva.ma.g.a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f = pointF.x;
                float f2 = pointF2.x;
                float f3 = pointF2.y;
                path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.q = path;
        }
    }
}
