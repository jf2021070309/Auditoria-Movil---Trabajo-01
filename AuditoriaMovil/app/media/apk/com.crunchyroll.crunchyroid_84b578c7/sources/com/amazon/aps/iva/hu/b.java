package com.amazon.aps.iva.hu;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.List;
/* compiled from: LocalCommentsAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends v<x, com.amazon.aps.iva.fu.a> implements com.amazon.aps.iva.au.a {
    public final com.amazon.aps.iva.au.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EventDispatcher eventDispatcher, com.amazon.aps.iva.au.f fVar) {
        super(com.amazon.aps.iva.zt.a.a);
        j.f(eventDispatcher, "eventDispatcher");
        j.f(fVar, "viewTypeProvider");
        this.b = new com.amazon.aps.iva.au.b(this, eventDispatcher, fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        String str;
        x item = getItem(i);
        if (item != null && (str = item.b) != null) {
            return Long.parseLong(str);
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        com.amazon.aps.iva.au.b bVar = this.b;
        return bVar.c.a(bVar.a.getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.fu.a aVar = (com.amazon.aps.iva.fu.a) f0Var;
        j.f(aVar, "holder");
        this.b.a(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        this.b.getClass();
        return com.amazon.aps.iva.au.b.c(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List list) {
        com.amazon.aps.iva.fu.a aVar = (com.amazon.aps.iva.fu.a) f0Var;
        j.f(aVar, "holder");
        j.f(list, "payloads");
        this.b.b(aVar, i, list, new a(this, aVar, i, list));
    }
}
