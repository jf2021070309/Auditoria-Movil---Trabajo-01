package com.amazon.aps.iva.s30;

import androidx.recyclerview.widget.n;
/* compiled from: SearchResultAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends n.e<h> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        com.amazon.aps.iva.yb0.j.f(hVar3, "first");
        com.amazon.aps.iva.yb0.j.f(hVar4, "second");
        return hVar3.equals(hVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        com.amazon.aps.iva.yb0.j.f(hVar3, "first");
        com.amazon.aps.iva.yb0.j.f(hVar4, "second");
        return com.amazon.aps.iva.yb0.j.a(hVar3.a, hVar4.a);
    }
}
