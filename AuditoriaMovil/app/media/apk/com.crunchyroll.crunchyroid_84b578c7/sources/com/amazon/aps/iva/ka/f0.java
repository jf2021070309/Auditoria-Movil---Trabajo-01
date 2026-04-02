package com.amazon.aps.iva.ka;

import android.graphics.PointF;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public final class f0 implements l0<com.amazon.aps.iva.ha.m> {
    public static final f0 a = new f0();
    public static final c.a b = c.a.a("c", "v", "i", "o");

    @Override // com.amazon.aps.iva.ka.l0
    public final com.amazon.aps.iva.ha.m a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        if (cVar.t() == c.b.BEGIN_ARRAY) {
            cVar.a();
        }
        cVar.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (cVar.k()) {
            int x = cVar.x(b);
            if (x != 0) {
                if (x != 1) {
                    if (x != 2) {
                        if (x != 3) {
                            cVar.y();
                            cVar.A();
                        } else {
                            arrayList3 = s.c(cVar, f);
                        }
                    } else {
                        arrayList2 = s.c(cVar, f);
                    }
                } else {
                    arrayList = s.c(cVar, f);
                }
            } else {
                z = cVar.m();
            }
        }
        cVar.h();
        if (cVar.t() == c.b.END_ARRAY) {
            cVar.f();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new com.amazon.aps.iva.ha.m(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                arrayList4.add(new com.amazon.aps.iva.fa.a(com.amazon.aps.iva.ma.f.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), com.amazon.aps.iva.ma.f.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                arrayList4.add(new com.amazon.aps.iva.fa.a(com.amazon.aps.iva.ma.f.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), com.amazon.aps.iva.ma.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new com.amazon.aps.iva.ha.m(pointF, z, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
