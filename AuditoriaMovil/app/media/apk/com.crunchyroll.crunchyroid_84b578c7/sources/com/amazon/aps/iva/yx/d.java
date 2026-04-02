package com.amazon.aps.iva.yx;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.o0.e0;
/* compiled from: PanelItemDelegate.kt */
/* loaded from: classes2.dex */
public final class d implements p {
    public final com.amazon.aps.iva.kt.a a;
    public final com.amazon.aps.iva.mt.l b;

    /* compiled from: PanelItemDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ RecyclerView.f0 h;
        public final /* synthetic */ com.amazon.aps.iva.xx.l i;
        public final /* synthetic */ d j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar, d dVar) {
            super(2);
            this.h = f0Var;
            this.i = lVar;
            this.j = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 183052941, new c(this.h, this.i, this.j)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public d(com.amazon.aps.iva.kt.b bVar, com.amazon.aps.iva.mt.m mVar) {
        this.a = bVar;
        this.b = mVar;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(1435090074, new a(f0Var, lVar, this), true));
    }
}
