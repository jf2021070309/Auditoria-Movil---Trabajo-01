package com.amazon.aps.iva.jm;

import androidx.recyclerview.widget.n;
/* compiled from: AvatarCollectionAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends n.e<d> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(d dVar, d dVar2) {
        d dVar3 = dVar;
        d dVar4 = dVar2;
        com.amazon.aps.iva.yb0.j.f(dVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(dVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(dVar3, dVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(d dVar, d dVar2) {
        d dVar3 = dVar;
        d dVar4 = dVar2;
        com.amazon.aps.iva.yb0.j.f(dVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(dVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(dVar3.a(), dVar4.a());
    }
}
