package com.amazon.aps.iva.b60;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xx.g;
/* compiled from: WatchlistItemDelegate.kt */
/* loaded from: classes2.dex */
public final class o implements com.amazon.aps.iva.yx.p {
    public final com.amazon.aps.iva.ls.a a;
    public final SparseIntArray b = new SparseIntArray();

    public o(com.amazon.aps.iva.ls.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new t(this.b, new c(context, this.a));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        t tVar = (t) f0Var;
        View view = tVar.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.watchlist.WatchlistCarouselView");
        ((h) view).Ah((g.c.b) ((com.amazon.aps.iva.xx.g) lVar));
        tVar.b1();
    }
}
