package com.amazon.aps.iva.yx;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: CollectionItemDelegate.kt */
/* loaded from: classes2.dex */
public final class a implements p {
    public final RecyclerView.v a;
    public final com.amazon.aps.iva.jy.a<com.amazon.aps.iva.iy.g> b;
    public final SparseIntArray c = new SparseIntArray();

    /* JADX WARN: Multi-variable type inference failed */
    public a(RecyclerView.v vVar, com.amazon.aps.iva.jy.a<? extends com.amazon.aps.iva.iy.g> aVar) {
        this.a = vVar;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new b(this.c, new com.amazon.aps.iva.iy.c(context, this.a, this.b));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        b bVar = (b) f0Var;
        View view = bVar.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.smoothcarousel.SmoothCarouselLayout");
        ((com.amazon.aps.iva.iy.c) view).G(bVar.getBindingAdapterPosition(), (com.amazon.aps.iva.xx.g) lVar);
        bVar.b1();
    }
}
