package com.amazon.aps.iva.qi;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ni.f;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchMusicSummaryAdapter.kt */
/* loaded from: classes.dex */
public final class a extends v<g, RecyclerView.f0> {
    public final l<String, q> b;
    public final com.amazon.aps.iva.n70.d<g> c;

    public a(f.j jVar, com.amazon.aps.iva.gi.e eVar) {
        super(b.a);
        this.b = jVar;
        this.c = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        Object obj = this.a.f.get(i);
        j.e(obj, "currentList[position]");
        l<String, q> lVar = this.b;
        j.f(lVar, "onArtistClick");
        ((i) f0Var).b.U2((g) obj, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new i(new c(context, this.c));
    }
}
