package com.amazon.aps.iva.ba;

import android.graphics.PointF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public final class p implements r, a.InterfaceC0165a {
    public final d0 a;
    public final com.amazon.aps.iva.ca.a<Float, Float> b;
    public com.amazon.aps.iva.ha.m c;

    public p(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.l lVar) {
        this.a = d0Var;
        lVar.getClass();
        com.amazon.aps.iva.ca.a<Float, Float> d = lVar.a.d();
        this.b = d;
        bVar.g(d);
        d.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.r
    public final com.amazon.aps.iva.ha.m e(com.amazon.aps.iva.ha.m mVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        ArrayList arrayList;
        float f;
        int i;
        PointF pointF3;
        PointF pointF4;
        boolean z2;
        com.amazon.aps.iva.ha.m mVar2 = mVar;
        ArrayList arrayList2 = mVar2.a;
        if (arrayList2.size() <= 2) {
            return mVar2;
        }
        float floatValue = this.b.f().floatValue();
        if (floatValue == 0.0f) {
            return mVar2;
        }
        ArrayList arrayList3 = mVar2.a;
        boolean z3 = mVar2.c;
        int size = arrayList3.size() - 1;
        int i2 = 0;
        int i3 = 0;
        while (size >= 0) {
            com.amazon.aps.iva.fa.a aVar = (com.amazon.aps.iva.fa.a) arrayList3.get(size);
            int i4 = size - 1;
            com.amazon.aps.iva.fa.a aVar2 = (com.amazon.aps.iva.fa.a) arrayList3.get(d(i4, arrayList3.size()));
            if (size == 0 && !z3) {
                pointF3 = mVar2.b;
            } else {
                pointF3 = aVar2.c;
            }
            if (size == 0 && !z3) {
                pointF4 = pointF3;
            } else {
                pointF4 = aVar2.b;
            }
            PointF pointF5 = aVar.a;
            if (!mVar2.c && size == 0 && size == arrayList3.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z2) {
                i3 += 2;
            } else {
                i3++;
            }
            size = i4;
        }
        com.amazon.aps.iva.ha.m mVar3 = this.c;
        if (mVar3 == null || mVar3.a.size() != i3) {
            ArrayList arrayList4 = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList4.add(new com.amazon.aps.iva.fa.a());
            }
            this.c = new com.amazon.aps.iva.ha.m(new PointF(0.0f, 0.0f), false, arrayList4);
        }
        com.amazon.aps.iva.ha.m mVar4 = this.c;
        mVar4.c = z3;
        PointF pointF6 = mVar2.b;
        mVar4.a(pointF6.x, pointF6.y);
        ArrayList arrayList5 = mVar4.a;
        boolean z4 = mVar2.c;
        int i6 = 0;
        while (i2 < arrayList2.size()) {
            com.amazon.aps.iva.fa.a aVar3 = (com.amazon.aps.iva.fa.a) arrayList2.get(i2);
            com.amazon.aps.iva.fa.a aVar4 = (com.amazon.aps.iva.fa.a) arrayList2.get(d(i2 - 1, arrayList2.size()));
            com.amazon.aps.iva.fa.a aVar5 = (com.amazon.aps.iva.fa.a) arrayList2.get(d(i2 - 2, arrayList2.size()));
            if (i2 == 0 && !z4) {
                pointF = mVar2.b;
            } else {
                pointF = aVar4.c;
            }
            if (i2 == 0 && !z4) {
                pointF2 = pointF;
            } else {
                pointF2 = aVar4.b;
            }
            PointF pointF7 = aVar3.a;
            PointF pointF8 = aVar5.c;
            if (!mVar2.c && i2 == 0 && i2 == arrayList2.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (pointF2.equals(pointF) && pointF7.equals(pointF) && !z) {
                float f2 = pointF.x;
                float f3 = f2 - pointF8.x;
                float f4 = pointF.y;
                PointF pointF9 = aVar3.c;
                arrayList = arrayList2;
                double d = pointF9.x - f2;
                i = i2;
                float min = Math.min(floatValue / ((float) Math.hypot(f3, f4 - pointF8.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(d, pointF9.y - f4)), 0.5f);
                float f5 = pointF.x;
                float a = t0.a(pointF8.x, f5, min, f5);
                float f6 = pointF.y;
                float a2 = t0.a(pointF8.y, f6, min, f6);
                float a3 = t0.a(pointF9.x, f5, min2, f5);
                float a4 = t0.a(pointF9.y, f6, min2, f6);
                float f7 = a - ((a - f5) * 0.5519f);
                float f8 = a2 - ((a2 - f6) * 0.5519f);
                float f9 = a3 - ((a3 - f5) * 0.5519f);
                float f10 = a4 - ((a4 - f6) * 0.5519f);
                com.amazon.aps.iva.fa.a aVar6 = (com.amazon.aps.iva.fa.a) arrayList5.get(d(i6 - 1, arrayList5.size()));
                com.amazon.aps.iva.fa.a aVar7 = (com.amazon.aps.iva.fa.a) arrayList5.get(i6);
                f = floatValue;
                aVar6.b.set(a, a2);
                aVar6.c.set(a, a2);
                if (i == 0) {
                    mVar4.a(a, a2);
                }
                aVar7.a.set(f7, f8);
                i6++;
                aVar7.b.set(f9, f10);
                aVar7.c.set(a3, a4);
                ((com.amazon.aps.iva.fa.a) arrayList5.get(i6)).a.set(a3, a4);
            } else {
                arrayList = arrayList2;
                f = floatValue;
                i = i2;
                com.amazon.aps.iva.fa.a aVar8 = (com.amazon.aps.iva.fa.a) arrayList5.get(d(i6 - 1, arrayList5.size()));
                PointF pointF10 = aVar4.b;
                aVar8.b.set(pointF10.x, pointF10.y);
                PointF pointF11 = aVar4.c;
                aVar8.c.set(pointF11.x, pointF11.y);
                PointF pointF12 = aVar3.a;
                ((com.amazon.aps.iva.fa.a) arrayList5.get(i6)).a.set(pointF12.x, pointF12.y);
            }
            i6++;
            i2 = i + 1;
            mVar2 = mVar;
            arrayList2 = arrayList;
            floatValue = f;
        }
        return mVar4;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
    }
}
