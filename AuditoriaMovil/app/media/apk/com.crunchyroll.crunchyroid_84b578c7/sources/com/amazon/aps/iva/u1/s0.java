package com.amazon.aps.iva.u1;

import java.util.Comparator;
/* compiled from: OnPositionedDispatcher.kt */
/* loaded from: classes.dex */
public final class s0 implements Comparator<androidx.compose.ui.node.e> {
    public static final s0 b = new s0();

    @Override // java.util.Comparator
    public final int compare(androidx.compose.ui.node.e eVar, androidx.compose.ui.node.e eVar2) {
        androidx.compose.ui.node.e eVar3 = eVar;
        androidx.compose.ui.node.e eVar4 = eVar2;
        com.amazon.aps.iva.yb0.j.f(eVar3, "a");
        com.amazon.aps.iva.yb0.j.f(eVar4, "b");
        int h = com.amazon.aps.iva.yb0.j.h(eVar4.l, eVar3.l);
        if (h == 0) {
            return com.amazon.aps.iva.yb0.j.h(eVar3.hashCode(), eVar4.hashCode());
        }
        return h;
    }
}
