package com.amazon.aps.iva.iy;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: SmoothCarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends v<Panel, RecyclerView.f0> {
    public final com.amazon.aps.iva.jy.a<g> b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.amazon.aps.iva.jy.a<? extends g> aVar, int i) {
        super(b.a);
        j.f(aVar, "itemDelegate");
        this.b = aVar;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        return ((Panel) this.a.f.get(i)).getId().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        return this.b.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List<Object> list) {
        j.f(f0Var, "holder");
        j.f(list, "payloads");
        if (!list.isEmpty()) {
            Object t0 = x.t0(list);
            j.d(t0, "null cannot be cast to non-null type com.ellation.crunchyroll.model.Panel");
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            int i2 = this.c;
            this.b.getClass();
            ((g) f0Var).U2((Panel) t0, a.C0423a.a(k.COLLECTION, i2, bindingAdapterPosition, null, null, 56));
            return;
        }
        onBindViewHolder(f0Var, f0Var.getBindingAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        Object obj = this.a.f.get(i);
        j.e(obj, "currentList[position]");
        int i2 = this.c;
        this.b.getClass();
        ((g) f0Var).b1((Panel) obj, a.C0423a.a(k.COLLECTION, i2, i, null, null, 56));
    }
}
