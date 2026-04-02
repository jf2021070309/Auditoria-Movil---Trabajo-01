package com.amazon.aps.iva.dv;

import androidx.recyclerview.widget.n;
/* compiled from: CrunchylistShowItemDiffCallback.kt */
/* loaded from: classes2.dex */
public final class k extends n.e<a> {
    public static final k a = new k();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(aVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(aVar3, aVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(aVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(aVar3.a(), aVar4.a());
    }
}
