package com.amazon.aps.iva.et;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BentoGameAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends v<com.amazon.aps.iva.xx.d, e> {
    public final int b;

    public b(int i) {
        super(c.a);
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        e eVar = (e) f0Var;
        j.f(eVar, "holder");
        if (eVar instanceof f) {
            com.amazon.aps.iva.jt.a a = a.C0423a.a(k.CARD, this.b, i, null, null, 56);
            Object obj = this.a.f.get(i);
            j.e(obj, "currentList[position]");
            View view = ((f) eVar).itemView;
            j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.cards.small.bento.BentoCardLayout");
            ((com.amazon.aps.iva.pt.c) view).U2((com.amazon.aps.iva.xx.d) obj, a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new f(new com.amazon.aps.iva.pt.c(context));
    }
}
