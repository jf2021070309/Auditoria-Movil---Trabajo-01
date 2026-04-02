package com.amazon.aps.iva.c60;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.b60.p;
import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchlistCarouselViewAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends v<s, com.amazon.aps.iva.z70.a> {
    public final com.amazon.aps.iva.b60.a b;
    public final n c;
    public final h d;
    public final com.amazon.aps.iva.ws.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.b60.d dVar, n nVar, h hVar) {
        super(e.a);
        j.f(aVar, "screen");
        j.f(dVar, "moreClickedListener");
        j.f(nVar, "watchScreenRouter");
        j.f(hVar, "showPageRouter");
        this.b = dVar;
        this.c = nVar;
        this.d = hVar;
        this.e = d.a.a(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        androidx.recyclerview.widget.d<T> dVar = this.a;
        s sVar = (s) dVar.f.get(i);
        if (sVar instanceof k) {
            return 1010;
        }
        if (sVar instanceof p) {
            return 2020;
        }
        Object obj = dVar.f.get(i);
        throw new IllegalArgumentException("Unsupported view type " + obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(1153067539, new c(this, aVar), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
