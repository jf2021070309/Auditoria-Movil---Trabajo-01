package com.amazon.aps.iva.yx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xx.g;
/* compiled from: ContinueWatchingItemDelegate.kt */
/* loaded from: classes2.dex */
public final class f implements p {
    public final com.amazon.aps.iva.n70.d<g> a;
    public final com.amazon.aps.iva.ws.d b;

    public f(com.amazon.aps.iva.n70.d<g> dVar, com.amazon.aps.iva.ws.d dVar2) {
        com.amazon.aps.iva.yb0.j.f(dVar, "overflowMenuProvider");
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
        if (kVar != null) {
            com.amazon.aps.iva.vx.n f = kVar.f();
            Context context2 = viewGroup.getContext();
            com.amazon.aps.iva.yb0.j.d(context2, "null cannot be cast to non-null type android.app.Activity");
            com.amazon.aps.iva.ix.l b = f.b((Activity) context2);
            com.amazon.aps.iva.ws.d dVar = this.b;
            com.amazon.aps.iva.yb0.j.f(dVar, "panelAnalytics");
            com.amazon.aps.iva.yb0.j.f(b, "watchScreenRouter");
            return new e(new com.amazon.aps.iva.mt.i(context, this.a, new com.amazon.aps.iva.mt.b(dVar, b)));
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        e eVar = (e) f0Var;
        int bindingAdapterPosition = eVar.getBindingAdapterPosition();
        com.amazon.aps.iva.mt.i iVar = eVar.b;
        iVar.setPositionOfFeed$home_feed_release(bindingAdapterPosition);
        iVar.setItems$home_feed_release(((g.c.a) lVar).i);
    }
}
