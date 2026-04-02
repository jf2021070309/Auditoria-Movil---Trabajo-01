package com.amazon.aps.iva.ay;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zx.a;
/* compiled from: FeedCarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class a<T extends com.amazon.aps.iva.zx.a> extends v<T, RecyclerView.f0> {
    public final b<T> b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b<T> bVar, int i) {
        super(bVar.c());
        j.f(bVar, "carouselDelegate");
        this.b = bVar;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        return ((com.amazon.aps.iva.zx.a) this.a.f.get(i)).getId().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        return this.b.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        Object obj = this.a.f.get(i);
        j.e(obj, "currentList[position]");
        int i2 = this.c;
        this.b.b(f0Var, (com.amazon.aps.iva.zx.a) obj, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        return this.b.a(viewGroup);
    }
}
