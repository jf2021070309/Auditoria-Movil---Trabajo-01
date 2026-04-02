package com.amazon.aps.iva.zu;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nv.e;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yu.f;
/* compiled from: AddToCrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends v<com.amazon.aps.iva.nv.b, RecyclerView.f0> {
    public final l<e, q> b;

    public a(f fVar) {
        super(com.amazon.aps.iva.mv.b.a);
        this.b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        Object obj = this.a.f.get(i);
        j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchyliststab.list.item.CrunchylistItemUiModel");
        e eVar = (e) obj;
        l<e, q> lVar = this.b;
        j.f(lVar, "onCrunchylistItemClick");
        com.amazon.aps.iva.av.b bVar = ((c) f0Var).b;
        bVar.getClass();
        com.amazon.aps.iva.av.a aVar = bVar.b;
        aVar.getClass();
        aVar.getView().L1(eVar.e);
        aVar.getView().K0(eVar.f);
        ((ConstraintLayout) bVar.c.c).setOnClickListener(new com.amazon.aps.iva.bc.a(2, lVar, eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new c(new com.amazon.aps.iva.av.b(context, null, 0));
    }
}
