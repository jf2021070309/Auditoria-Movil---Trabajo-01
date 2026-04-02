package com.amazon.aps.iva.dt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yx.p;
/* compiled from: BentoItemDelegate.kt */
/* loaded from: classes2.dex */
public final class l implements p {
    public final com.amazon.aps.iva.xh.b a;

    public l(com.amazon.aps.iva.xh.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "upgradeFlowRouter");
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new e(new a(context, this.a));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        e eVar = (e) f0Var;
        int bindingAdapterPosition = eVar.getBindingAdapterPosition();
        View view = eVar.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.bento.BentoCarouselView");
        ((d) view).Qf((com.amazon.aps.iva.xx.e) lVar, bindingAdapterPosition);
    }
}
