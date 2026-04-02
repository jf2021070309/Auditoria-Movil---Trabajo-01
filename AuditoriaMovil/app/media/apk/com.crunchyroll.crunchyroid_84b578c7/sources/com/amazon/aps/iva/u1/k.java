package com.amazon.aps.iva.u1;

import java.util.Comparator;
/* compiled from: DepthSortedSet.kt */
/* loaded from: classes.dex */
public final class k implements Comparator<androidx.compose.ui.node.e> {
    @Override // java.util.Comparator
    public final int compare(androidx.compose.ui.node.e eVar, androidx.compose.ui.node.e eVar2) {
        androidx.compose.ui.node.e eVar3 = eVar;
        androidx.compose.ui.node.e eVar4 = eVar2;
        com.amazon.aps.iva.yb0.j.f(eVar3, "l1");
        com.amazon.aps.iva.yb0.j.f(eVar4, "l2");
        int h = com.amazon.aps.iva.yb0.j.h(eVar3.l, eVar4.l);
        if (h == 0) {
            return com.amazon.aps.iva.yb0.j.h(eVar3.hashCode(), eVar4.hashCode());
        }
        return h;
    }
}
