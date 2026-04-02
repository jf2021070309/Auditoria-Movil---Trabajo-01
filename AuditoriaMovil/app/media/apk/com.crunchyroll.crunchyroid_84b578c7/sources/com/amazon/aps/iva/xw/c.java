package com.amazon.aps.iva.xw;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: AdapterExtensions.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.j {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> a;
    public final /* synthetic */ RecyclerView.h<Object> b;

    public c(androidx.recyclerview.widget.v vVar, com.amazon.aps.iva.xb0.l lVar) {
        this.a = lVar;
        this.b = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void onItemRangeInserted(int i, int i2) {
        super.onItemRangeInserted(i, i2);
        this.a.invoke(Integer.valueOf(i));
        this.b.unregisterAdapterDataObserver(this);
    }
}
