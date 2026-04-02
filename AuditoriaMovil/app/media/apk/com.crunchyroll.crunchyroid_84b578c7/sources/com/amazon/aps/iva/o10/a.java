package com.amazon.aps.iva.o10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n10.b;
import com.amazon.aps.iva.n10.o;
import com.amazon.aps.iva.n10.p;
import com.amazon.aps.iva.n70.d;
import com.amazon.aps.iva.o10.b;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q10.e;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GenreFeedAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends v<com.amazon.aps.iva.n10.b, b> {
    public final d<Panel> b;
    public final l<com.amazon.aps.iva.p10.a, q> c;
    public final r<Panel, Integer, Integer, String, q> d;

    public a(com.amazon.aps.iva.nt.a aVar, o oVar, p pVar) {
        super(new PaginationDiffCallback());
        this.b = aVar;
        this.c = oVar;
        this.d = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        boolean z;
        com.amazon.aps.iva.n10.b d = d(i);
        if (d instanceof b.d) {
            return 1014;
        }
        boolean z2 = true;
        if (d instanceof b.c.a) {
            z = true;
        } else {
            z = d instanceof b.a;
        }
        if (z) {
            return 1013;
        }
        if (!(d instanceof b.c.C0525b)) {
            z2 = d instanceof b.C0524b;
        }
        if (z2) {
            return 1012;
        }
        throw new IllegalArgumentException("Unsupported type ".concat(d.getClass().getSimpleName()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        e eVar;
        b bVar = (b) f0Var;
        j.f(bVar, "holderFeed");
        com.amazon.aps.iva.n10.b d = d(i);
        if (d instanceof b.d) {
            b.d dVar = (b.d) d;
            j.f(dVar, "genreFeedDescriptionAdapterItem");
            View view = ((b.a) bVar).itemView;
            j.d(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(dVar.d);
        } else if (d instanceof b.c.a) {
            b.c cVar = (b.c) bVar;
            b.c.a aVar = (b.c.a) d;
            j.f(aVar, "<this>");
            com.amazon.aps.iva.n10.a aVar2 = aVar.c;
            int i2 = aVar2.b;
            List<Panel> list = aVar2.a;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (Panel panel : list) {
                arrayList.add(new e.c(panel));
            }
            com.amazon.aps.iva.p10.a aVar3 = new com.amazon.aps.iva.p10.a(i2, arrayList, null, null, aVar.e, 12);
            View view2 = cVar.itemView;
            j.d(view2, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.genre.carousel.SubgenreCarouselLayout");
            ((com.amazon.aps.iva.p10.b) view2).G(aVar3, i);
        } else if (d instanceof b.c.C0525b) {
            b.C0553b c0553b = (b.C0553b) bVar;
            b.c.C0525b c0525b = (b.c.C0525b) d;
            j.f(c0525b, "<this>");
            com.amazon.aps.iva.n10.a aVar4 = c0525b.c;
            int i3 = aVar4.b;
            List<Panel> list2 = aVar4.a;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
            for (Panel panel2 : list2) {
                arrayList2.add(new e.c(panel2));
            }
            com.amazon.aps.iva.p10.a aVar5 = new com.amazon.aps.iva.p10.a(i3, arrayList2, c0525b.e, w.R(c0525b.f), null, 16);
            View view3 = c0553b.itemView;
            j.d(view3, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.genre.carousel.SubgenreCarouselLayout");
            ((com.amazon.aps.iva.p10.b) view3).G(aVar5, i);
        } else {
            int i4 = 0;
            if (d instanceof b.a) {
                b.c cVar2 = (b.c) bVar;
                b.a aVar6 = (b.a) d;
                j.f(aVar6, "<this>");
                int i5 = aVar6.d;
                ArrayList arrayList3 = new ArrayList(i5);
                while (i4 < i5) {
                    if (aVar6.c == com.amazon.aps.iva.a00.b.NewlyAdded) {
                        eVar = e.a.a;
                    } else {
                        eVar = e.b.a;
                    }
                    arrayList3.add(eVar);
                    i4++;
                }
                com.amazon.aps.iva.p10.a aVar7 = new com.amazon.aps.iva.p10.a(i5, arrayList3, null, null, aVar6.c, 12);
                View view4 = cVar2.itemView;
                j.d(view4, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.genre.carousel.SubgenreCarouselLayout");
                ((com.amazon.aps.iva.p10.b) view4).G(aVar7, i);
            } else if (d instanceof b.C0524b) {
                b.C0553b c0553b2 = (b.C0553b) bVar;
                b.C0524b c0524b = (b.C0524b) d;
                j.f(c0524b, "<this>");
                int i6 = c0524b.c;
                ArrayList arrayList4 = new ArrayList(i6);
                while (i4 < i6) {
                    arrayList4.add(e.b.a);
                    i4++;
                }
                com.amazon.aps.iva.p10.a aVar8 = new com.amazon.aps.iva.p10.a(i6, arrayList4, null, null, null, 28);
                View view5 = c0553b2.itemView;
                j.d(view5, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.genre.carousel.SubgenreCarouselLayout");
                ((com.amazon.aps.iva.p10.b) view5).G(aVar8, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        r<Panel, Integer, Integer, String, q> rVar = this.d;
        d<Panel> dVar = this.b;
        l<com.amazon.aps.iva.p10.a, q> lVar = this.c;
        switch (i) {
            case 1012:
                Context context = viewGroup.getContext();
                j.e(context, "parent.context");
                return new b.C0553b(new com.amazon.aps.iva.p10.b(context, lVar, dVar, rVar));
            case 1013:
                Context context2 = viewGroup.getContext();
                j.e(context2, "parent.context");
                return new b.c(new com.amazon.aps.iva.p10.b(context2, lVar, dVar, rVar));
            case 1014:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_genre_description, viewGroup, false);
                j.e(inflate, "from(parent.context).inf…  false\n                )");
                return new b.a(inflate);
            default:
                throw new IllegalArgumentException(c0.a("Unsupported view type ", i));
        }
    }
}
