package com.amazon.aps.iva.ru;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.List;
/* compiled from: CommentRepliesParentAdapter.kt */
/* loaded from: classes2.dex */
public final class t extends androidx.recyclerview.widget.v<com.amazon.aps.iva.du.x, com.amazon.aps.iva.fu.a> implements com.amazon.aps.iva.au.a {
    public final com.amazon.aps.iva.au.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher) {
        super(com.amazon.aps.iva.zt.a.a);
        com.amazon.aps.iva.yb0.j.f(eventDispatcher, "eventDispatcher");
        this.b = new com.amazon.aps.iva.au.b(this, eventDispatcher, new com.amazon.aps.iva.au.f(12003));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        String str;
        com.amazon.aps.iva.du.x item = getItem(i);
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
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        this.b.a(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        this.b.getClass();
        return com.amazon.aps.iva.au.b.c(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List list) {
        com.amazon.aps.iva.fu.a aVar = (com.amazon.aps.iva.fu.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        com.amazon.aps.iva.yb0.j.f(list, "payloads");
        this.b.b(aVar, i, list, new s(this, aVar, i, list));
    }
}
