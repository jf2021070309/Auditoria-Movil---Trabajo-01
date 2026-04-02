package com.amazon.aps.iva.q30;

import androidx.recyclerview.widget.n;
/* compiled from: RecentSearchesDiffCallback.kt */
/* loaded from: classes2.dex */
public final class j extends n.e<b> {
    public static final j a = new j();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        com.amazon.aps.iva.yb0.j.f(bVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(bVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(bVar3, bVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        com.amazon.aps.iva.yb0.j.f(bVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(bVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(bVar3.a(), bVar4.a());
    }
}
