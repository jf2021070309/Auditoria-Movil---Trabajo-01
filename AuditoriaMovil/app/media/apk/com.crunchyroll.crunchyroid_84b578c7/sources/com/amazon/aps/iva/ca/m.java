package com.amazon.aps.iva.ca;

import android.graphics.Path;
import android.graphics.PointF;
import com.amazon.aps.iva.e4.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class m extends a<com.amazon.aps.iva.ha.m, Path> {
    public final com.amazon.aps.iva.ha.m i;
    public final Path j;
    public List<com.amazon.aps.iva.ba.r> k;

    public m(List<com.amazon.aps.iva.na.a<com.amazon.aps.iva.ha.m>> list) {
        super(list);
        this.i = new com.amazon.aps.iva.ha.m();
        this.j = new Path();
    }

    @Override // com.amazon.aps.iva.ca.a
    public final Path g(com.amazon.aps.iva.na.a<com.amazon.aps.iva.ha.m> aVar, float f) {
        boolean z;
        com.amazon.aps.iva.ha.m mVar = aVar.b;
        com.amazon.aps.iva.ha.m mVar2 = aVar.c;
        com.amazon.aps.iva.ha.m mVar3 = this.i;
        if (mVar3.b == null) {
            mVar3.b = new PointF();
        }
        int i = 0;
        if (!mVar.c && !mVar2.c) {
            z = false;
        } else {
            z = true;
        }
        mVar3.c = z;
        ArrayList arrayList = mVar.a;
        int size = arrayList.size();
        int size2 = mVar2.a.size();
        ArrayList arrayList2 = mVar2.a;
        if (size != size2) {
            com.amazon.aps.iva.ma.c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = mVar3.a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new com.amazon.aps.iva.fa.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = mVar.b;
        PointF pointF2 = mVar2.b;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = com.amazon.aps.iva.ma.f.a;
        float a = t0.a(f3, f2, f, f2);
        float f4 = pointF.y;
        mVar3.a(a, ((pointF2.y - f4) * f) + f4);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            com.amazon.aps.iva.fa.a aVar2 = (com.amazon.aps.iva.fa.a) arrayList.get(size5);
            com.amazon.aps.iva.fa.a aVar3 = (com.amazon.aps.iva.fa.a) arrayList2.get(size5);
            PointF pointF4 = aVar2.a;
            PointF pointF5 = aVar3.a;
            float f5 = pointF4.x;
            float a2 = t0.a(pointF5.x, f5, f, f5);
            float f6 = pointF4.y;
            ((com.amazon.aps.iva.fa.a) arrayList3.get(size5)).a.set(a2, t0.a(pointF5.y, f6, f, f6));
            PointF pointF6 = aVar2.b;
            float f7 = pointF6.x;
            PointF pointF7 = aVar3.b;
            float a3 = t0.a(pointF7.x, f7, f, f7);
            float f8 = pointF6.y;
            ((com.amazon.aps.iva.fa.a) arrayList3.get(size5)).b.set(a3, t0.a(pointF7.y, f8, f, f8));
            PointF pointF8 = aVar2.c;
            float f9 = pointF8.x;
            PointF pointF9 = aVar3.c;
            float a4 = t0.a(pointF9.x, f9, f, f9);
            float f10 = pointF8.y;
            ((com.amazon.aps.iva.fa.a) arrayList3.get(size5)).c.set(a4, t0.a(pointF9.y, f10, f, f10));
        }
        List<com.amazon.aps.iva.ba.r> list = this.k;
        if (list != null) {
            for (int size6 = list.size() - 1; size6 >= 0; size6--) {
                mVar3 = this.k.get(size6).e(mVar3);
            }
        }
        Path path = this.j;
        path.reset();
        PointF pointF10 = mVar3.b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = com.amazon.aps.iva.ma.f.a;
        pointF11.set(pointF10.x, pointF10.y);
        while (true) {
            ArrayList arrayList4 = mVar3.a;
            if (i >= arrayList4.size()) {
                break;
            }
            com.amazon.aps.iva.fa.a aVar4 = (com.amazon.aps.iva.fa.a) arrayList4.get(i);
            PointF pointF12 = aVar4.a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar4.b;
            PointF pointF14 = aVar4.c;
            if (equals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
            i++;
        }
        if (mVar3.c) {
            path.close();
        }
        return path;
    }
}
