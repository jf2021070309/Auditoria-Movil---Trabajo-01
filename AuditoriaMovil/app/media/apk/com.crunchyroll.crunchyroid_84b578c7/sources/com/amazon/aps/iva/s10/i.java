package com.amazon.aps.iva.s10;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.r10.a0;
import com.amazon.aps.iva.r10.d0;
import com.amazon.aps.iva.r10.m;
import com.amazon.aps.iva.r10.z;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: HistoryAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.j8.i<a0, com.amazon.aps.iva.z70.a> {
    public final p<com.amazon.aps.iva.r10.l, Integer, q> b;
    public final com.amazon.aps.iva.r10.i c;
    public final com.amazon.aps.iva.r10.j d;
    public final z e;
    public final com.amazon.aps.iva.at.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.r10.p pVar, com.amazon.aps.iva.r10.i iVar, d0 d0Var, z zVar, com.amazon.aps.iva.at.c cVar) {
        super(j.a);
        com.amazon.aps.iva.yb0.j.f(d0Var, "historyCardSelectedListener");
        this.b = pVar;
        this.c = iVar;
        this.d = d0Var;
        this.e = zVar;
        this.f = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (d(i) instanceof m) {
            return 302;
        }
        return MediaError.DetailedErrorCode.SEGMENT_NETWORK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(-1399209998, new d(aVar, this), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List list) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        com.amazon.aps.iva.yb0.j.f(list, "payloads");
        aVar.b1(com.amazon.aps.iva.v0.b.c(-890801574, new h(aVar, this), true));
    }
}
