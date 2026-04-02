package com.amazon.aps.iva.q10;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.p10.b;
import com.amazon.aps.iva.q10.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: SubgenreCarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.h<com.amazon.aps.iva.z70.a> {
    public final List<e> a;
    public final com.amazon.aps.iva.n70.d<Panel> b;
    public final com.amazon.aps.iva.xb0.a<q> c;
    public final p<Panel, Integer, q> d;
    public final m e;

    public d(List list, com.amazon.aps.iva.n70.d dVar, b.a aVar, b.C0593b c0593b, m mVar) {
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        j.f(dVar, "menuProvider");
        this.a = list;
        this.b = dVar;
        this.c = aVar;
        this.d = c0593b;
        this.e = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        e eVar = this.a.get(i);
        if (eVar instanceof e.c) {
            return 1012;
        }
        if (eVar instanceof e.d) {
            return 1013;
        }
        if (eVar instanceof e.b) {
            return 1014;
        }
        if (eVar instanceof e.a) {
            return 1015;
        }
        throw new h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(com.amazon.aps.iva.z70.a aVar, int i) {
        com.amazon.aps.iva.z70.a aVar2 = aVar;
        j.f(aVar2, "holder");
        aVar2.b1(com.amazon.aps.iva.v0.b.c(-1807452657, new c(this, i), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final com.amazon.aps.iva.z70.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
