package com.amazon.aps.iva.mv;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrunchylistsAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends n.e<com.amazon.aps.iva.nv.b> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(com.amazon.aps.iva.nv.b bVar, com.amazon.aps.iva.nv.b bVar2) {
        com.amazon.aps.iva.nv.b bVar3 = bVar;
        com.amazon.aps.iva.nv.b bVar4 = bVar2;
        j.f(bVar3, "oldItem");
        j.f(bVar4, "newItem");
        return j.a(bVar3, bVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(com.amazon.aps.iva.nv.b bVar, com.amazon.aps.iva.nv.b bVar2) {
        com.amazon.aps.iva.nv.b bVar3 = bVar;
        com.amazon.aps.iva.nv.b bVar4 = bVar2;
        j.f(bVar3, "oldItem");
        j.f(bVar4, "newItem");
        return j.a(bVar3.a(), bVar4.a());
    }
}
