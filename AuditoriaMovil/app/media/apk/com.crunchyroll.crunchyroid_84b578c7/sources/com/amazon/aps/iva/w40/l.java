package com.amazon.aps.iva.w40;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback;
/* compiled from: SimulcastAdapter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.j8.i<com.amazon.aps.iva.uz.h, com.amazon.aps.iva.z70.a> {
    public final com.amazon.aps.iva.n70.d<Panel> b;
    public final com.amazon.aps.iva.xb0.p<Panel, Integer, com.amazon.aps.iva.kb0.q> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.amazon.aps.iva.nt.a aVar, com.amazon.aps.iva.xb0.p pVar) {
        super(new PaginationDiffCallback());
        com.amazon.aps.iva.yb0.j.f(pVar, "onItemClick");
        this.b = aVar;
        this.c = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i < getItemCount()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 32;
        }
        com.amazon.aps.iva.uz.h d = d(i);
        if (d instanceof h.c.C0774c) {
            return 22;
        }
        if (!(d instanceof h.a) && d != null) {
            z2 = false;
        }
        if (z2) {
            return 32;
        }
        throw new IllegalArgumentException("Unsupported type ".concat(d.getClass().getSimpleName()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(1751904172, new k(this, i), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
