package com.amazon.aps.iva.yx;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.zx.a;
/* compiled from: FeedCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class j<T extends com.amazon.aps.iva.zx.a> implements p {
    public final RecyclerView.v a;
    public final com.amazon.aps.iva.ay.b<T> b;
    public final SparseIntArray c = new SparseIntArray();

    public j(RecyclerView.v vVar, com.amazon.aps.iva.ay.b<T> bVar) {
        this.a = vVar;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new k(this.c, new com.amazon.aps.iva.zx.b(context, this.a, this.b));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        k kVar = (k) f0Var;
        kVar.e.G(kVar.getBindingAdapterPosition(), (com.amazon.aps.iva.xx.j) lVar);
        kVar.b1();
    }
}
