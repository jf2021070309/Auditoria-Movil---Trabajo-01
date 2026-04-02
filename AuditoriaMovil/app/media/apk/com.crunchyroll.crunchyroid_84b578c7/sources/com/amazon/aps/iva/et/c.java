package com.amazon.aps.iva.et;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BentoGameDiffCallback.kt */
/* loaded from: classes2.dex */
public final class c extends n.e<com.amazon.aps.iva.xx.d> {
    public static final c a = new c();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.xx.d dVar2) {
        com.amazon.aps.iva.xx.d dVar3 = dVar;
        com.amazon.aps.iva.xx.d dVar4 = dVar2;
        j.f(dVar3, "oldItem");
        j.f(dVar4, "newItem");
        return j.a(dVar3, dVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.xx.d dVar2) {
        com.amazon.aps.iva.xx.d dVar3 = dVar;
        com.amazon.aps.iva.xx.d dVar4 = dVar2;
        j.f(dVar3, "oldItem");
        j.f(dVar4, "newItem");
        return j.a(dVar3.a, dVar4.a);
    }
}
