package com.amazon.aps.iva.ma;

import android.graphics.PointF;
import com.amazon.aps.iva.ba.j;
import java.util.ArrayList;
/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public final class f {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2, j jVar) {
        if (eVar.a(i, jVar.getName())) {
            String name = jVar.getName();
            eVar2.getClass();
            com.amazon.aps.iva.fa.e eVar3 = new com.amazon.aps.iva.fa.e(eVar2);
            eVar3.a.add(name);
            com.amazon.aps.iva.fa.e eVar4 = new com.amazon.aps.iva.fa.e(eVar3);
            eVar4.b = jVar;
            arrayList.add(eVar4);
        }
    }
}
