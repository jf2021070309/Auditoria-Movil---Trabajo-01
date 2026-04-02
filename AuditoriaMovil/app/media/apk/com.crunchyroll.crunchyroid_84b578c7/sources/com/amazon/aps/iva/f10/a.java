package com.amazon.aps.iva.f10;

import androidx.recyclerview.widget.n;
/* compiled from: DownloadsAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends n.e<com.amazon.aps.iva.d10.i> {
    public static final a a = new a();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(com.amazon.aps.iva.d10.i iVar, com.amazon.aps.iva.d10.i iVar2) {
        com.amazon.aps.iva.d10.i iVar3 = iVar;
        com.amazon.aps.iva.d10.i iVar4 = iVar2;
        com.amazon.aps.iva.yb0.j.f(iVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(iVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(iVar3, iVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(com.amazon.aps.iva.d10.i iVar, com.amazon.aps.iva.d10.i iVar2) {
        com.amazon.aps.iva.d10.i iVar3 = iVar;
        com.amazon.aps.iva.d10.i iVar4 = iVar2;
        com.amazon.aps.iva.yb0.j.f(iVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(iVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(iVar3.b(), iVar4.b());
    }
}
