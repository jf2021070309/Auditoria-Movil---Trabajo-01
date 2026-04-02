package com.amazon.aps.iva.q40;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p40.i;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SimilarAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends v<h, com.amazon.aps.iva.z70.a> {
    public final com.amazon.aps.iva.n70.d<Panel> b;
    public final p<Panel, Integer, q> c;

    public d(com.amazon.aps.iva.nt.a aVar, i iVar) {
        super(e.a);
        this.b = aVar;
        this.c = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (((h) this.a.f.get(i)) instanceof h.a) {
            return 100;
        }
        return 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(316274755, new c(this, i), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
