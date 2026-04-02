package com.amazon.aps.iva.m20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c30.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.rs.m;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import java.util.List;
/* compiled from: UpsellTiersAdapter.kt */
/* loaded from: classes2.dex */
public final class j extends RecyclerView.h<a> {
    public final List<com.amazon.aps.iva.n20.f> a;
    public final l<Integer, q> b;

    /* compiled from: UpsellTiersAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.f0 {
        public final com.amazon.aps.iva.n20.a b;

        public a(com.amazon.aps.iva.n20.a aVar) {
            super(aVar);
            this.b = aVar;
        }
    }

    public j(List list, UpsellCarouselLayout.b bVar) {
        com.amazon.aps.iva.yb0.j.f(list, "tiers");
        this.a = list;
        this.b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(a aVar, final int i) {
        a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "holder");
        com.amazon.aps.iva.n20.f fVar = this.a.get(i);
        com.amazon.aps.iva.yb0.j.f(fVar, "model");
        final l<Integer, q> lVar = this.b;
        com.amazon.aps.iva.yb0.j.f(lVar, "onClick");
        com.amazon.aps.iva.n20.a aVar3 = aVar2.b;
        aVar3.getClass();
        com.amazon.aps.iva.n20.d dVar = aVar3.c;
        dVar.getClass();
        dVar.getView().setTitle(fVar.b);
        dVar.getView().setHeaderImage(fVar.f);
        m mVar = fVar.d;
        com.amazon.aps.iva.n20.e eVar = fVar.c;
        if (mVar != null) {
            dVar.getView().Ac();
            dVar.getView().xc(eVar.a, mVar.b().f, mVar.b().e);
            dVar.getView().Ab(mVar.b().f, mVar.b().e);
            dVar.getView().u8();
            boolean z = true;
            if (mVar instanceof m.b.c) {
                dVar.getView().setPrice(mVar.b().b);
                com.amazon.aps.iva.n20.g view = dVar.getView();
                int i2 = mVar.b().f;
                int i3 = mVar.b().e.b;
                long j = mVar.b().c;
                if (i2 <= 1) {
                    j /= i3;
                }
                long j2 = eVar.b;
                view.W6((int) (((j2 - j) * 100) / j2), mVar.b().f, mVar.b().e);
            } else {
                if (!(mVar instanceof m.b.C0682b)) {
                    z = mVar instanceof m.b.a;
                }
                if (z) {
                    dVar.getView().setPrice(mVar.b().b);
                    dVar.getView().F6(mVar.b().f, mVar.b().e);
                } else if (mVar instanceof m.a) {
                    dVar.getView().xa(mVar.b().d);
                    dVar.getView().I4(mVar.b().f, mVar.b().e);
                }
            }
        } else {
            dVar.getView().M4();
            dVar.getView().setPrice(eVar.a);
            com.amazon.aps.iva.n20.b bVar = new com.amazon.aps.iva.n20.b(dVar.getView());
            com.amazon.aps.iva.n20.c cVar = new com.amazon.aps.iva.n20.c(dVar.getView());
            com.amazon.aps.iva.c30.a aVar4 = eVar.d;
            com.amazon.aps.iva.yb0.j.f(aVar4, "<this>");
            com.amazon.aps.iva.yb0.j.f(com.amazon.aps.iva.c30.d.h, "showInDays");
            if (aVar4 instanceof a.C0161a) {
                q qVar = q.a;
            } else if (aVar4 instanceof a.b) {
                bVar.invoke();
            } else if (aVar4 instanceof a.c) {
                cVar.invoke();
            }
            Integer num = fVar.g;
            if (num != null) {
                dVar.getView().u8();
                dVar.getView().setTierLabel(num.intValue());
            } else {
                dVar.getView().mb();
            }
        }
        if (!dVar.b) {
            dVar.getView().bh();
        }
        dVar.getView().O8();
        dVar.getView().setPerks(fVar.e);
        aVar3.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.m20.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l lVar2 = lVar;
                com.amazon.aps.iva.yb0.j.f(lVar2, "$onClick");
                lVar2.invoke(Integer.valueOf(i));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new a(new com.amazon.aps.iva.n20.a(context));
    }
}
