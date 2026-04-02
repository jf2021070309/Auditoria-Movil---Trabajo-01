package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.x30.a0;
/* compiled from: HeaderSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class j implements r {
    public final a0 a;

    public j(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // com.amazon.aps.iva.t30.r
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new k(new com.amazon.aps.iva.w30.a(context, this.a));
    }

    @Override // com.amazon.aps.iva.t30.r
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.s30.h hVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        k kVar = (k) f0Var;
        View view = f0Var.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.search.result.header.SearchResultHeaderLayout");
        ((com.amazon.aps.iva.w30.a) view).b1((com.amazon.aps.iva.s30.d) hVar);
    }
}
