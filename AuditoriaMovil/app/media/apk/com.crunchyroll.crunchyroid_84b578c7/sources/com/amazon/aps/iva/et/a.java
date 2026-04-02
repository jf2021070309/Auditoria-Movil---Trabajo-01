package com.amazon.aps.iva.et;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.dt.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BentoDetailAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.h<RecyclerView.f0> {
    public final com.amazon.aps.iva.xh.b a;

    /* compiled from: BentoDetailAdapter.kt */
    /* renamed from: com.amazon.aps.iva.et.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0230a extends RecyclerView.f0 {
        public C0230a(h hVar) {
            super(hVar);
        }
    }

    public a(com.amazon.aps.iva.xh.b bVar) {
        j.f(bVar, "upgradeFlowRouter");
        this.a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        if (f0Var instanceof C0230a) {
            View view = ((C0230a) f0Var).itemView;
            j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.bento.BentoDetailLayout");
            ((h) view).b1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new C0230a(new h(context, this.a));
    }
}
