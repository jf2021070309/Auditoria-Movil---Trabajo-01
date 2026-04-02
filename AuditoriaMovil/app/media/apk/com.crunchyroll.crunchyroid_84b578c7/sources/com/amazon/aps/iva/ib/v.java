package com.amazon.aps.iva.ib;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MeasureSupporter.java */
/* loaded from: classes.dex */
public final class v extends RecyclerView.j {
    public final RecyclerView.p a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public Integer f = null;
    public int g = 0;
    public Integer h = null;
    public int i = 0;

    public v(RecyclerView.p pVar) {
        this.a = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void onItemRangeRemoved(int i, int i2) {
        super.onItemRangeRemoved(i, i2);
        this.b = true;
        this.f = Integer.valueOf(this.g);
        this.h = Integer.valueOf(this.i);
    }
}
