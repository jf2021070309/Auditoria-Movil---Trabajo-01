package com.amazon.aps.iva.f10;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
/* compiled from: DownloadsAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends v<com.amazon.aps.iva.d10.i, com.amazon.aps.iva.z70.a> {
    public final com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> b;
    public final com.amazon.aps.iva.d10.g c;
    public final f d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, com.amazon.aps.iva.g10.d dVar, g gVar) {
        super(a.a);
        com.amazon.aps.iva.yb0.j.f(dVar, "itemListener");
        this.b = lVar;
        this.c = dVar;
        this.d = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(1645915817, new d(this, d(i), i), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
