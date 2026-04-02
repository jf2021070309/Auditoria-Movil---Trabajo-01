package com.amazon.aps.iva.s1;

import java.util.ArrayList;
import java.util.List;
/* compiled from: MeasurePolicy.kt */
/* loaded from: classes.dex */
public interface d0 {
    default int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new g((l) list.get(i2), n.Min, o.Width));
        }
        return d(new p(oVar, oVar.i.t), arrayList, com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }

    default int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new g((l) list.get(i2), n.Min, o.Height));
        }
        return d(new p(oVar, oVar.i.t), arrayList, com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    default int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new g((l) list.get(i2), n.Max, o.Height));
        }
        return d(new p(oVar, oVar.i.t), arrayList, com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    e0 d(f0 f0Var, List<? extends c0> list, long j);

    default int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new g((l) list.get(i2), n.Max, o.Width));
        }
        return d(new p(oVar, oVar.i.t), arrayList, com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }
}
