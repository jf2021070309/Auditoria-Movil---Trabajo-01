package com.amazon.aps.iva.uz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.tz.y0;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.browse.BrowseAllTitleView;
import com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback;
/* compiled from: BrowseAllAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.j8.i<h, RecyclerView.f0> {
    public final y0 b;
    public final com.amazon.aps.iva.n70.d<Panel> c;
    public final p<Panel, Integer, q> d;

    /* compiled from: BrowseAllAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ h h;
        public final /* synthetic */ c i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, c cVar, h hVar) {
            super(2);
            this.h = hVar;
            this.i = cVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                h hVar = this.h;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 826701547, new com.amazon.aps.iva.uz.b(this.j, this.i, hVar)), iVar2, 6);
            }
            return q.a;
        }
    }

    /* compiled from: BrowseAllAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ h h;
        public final /* synthetic */ c i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, c cVar, h hVar) {
            super(2);
            this.h = hVar;
            this.i = cVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                h hVar = this.h;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 1773868490, new e(this.j, this.i, hVar)), iVar2, 6);
            }
            return q.a;
        }
    }

    /* compiled from: BrowseAllAdapter.kt */
    /* renamed from: com.amazon.aps.iva.uz.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0773c extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ h h;
        public final /* synthetic */ c i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0773c(int i, c cVar, h hVar) {
            super(2);
            this.h = hVar;
            this.i = cVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                h hVar = this.h;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -1573931863, new g(this.j, this.i, hVar)), iVar2, 6);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y0 y0Var, com.amazon.aps.iva.nt.a aVar, p pVar) {
        super(new PaginationDiffCallback());
        com.amazon.aps.iva.yb0.j.f(y0Var, "browseSectionIndexer");
        com.amazon.aps.iva.yb0.j.f(pVar, "onItemClick");
        this.b = y0Var;
        this.c = aVar;
        this.d = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        h d = d(i);
        if (d instanceof h.d) {
            return 10;
        }
        if (d instanceof h.b) {
            return 11;
        }
        if (d instanceof h.c.a) {
            return 21;
        }
        if (d instanceof h.c.C0774c) {
            return 22;
        }
        if (d instanceof h.c.b) {
            return 23;
        }
        if (!(d instanceof h.a)) {
            if (d == null) {
                y0 y0Var = this.b;
                if (y0Var.c(i)) {
                    return 31;
                }
                if (y0Var.b(i)) {
                    return 10;
                }
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
        return 32;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        h d = d(i);
        if (d instanceof h.d) {
            View view = ((k) f0Var).itemView;
            com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.BrowseAllTitleView");
            ((BrowseAllTitleView) view).U2((h.d) d);
        } else if (d instanceof h.b) {
            View view2 = f0Var.itemView;
            com.amazon.aps.iva.yb0.j.d(view2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view2).setText(((h.b) d).b);
        } else if (d instanceof h.c.a) {
            ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(1598820542, new a(i, this, d), true));
        } else if (d instanceof h.c.C0774c) {
            ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-1748979811, new b(i, this, d), true));
        } else if (d instanceof h.c.b) {
            ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-801812868, new C0773c(i, this, d), true));
        } else if (d instanceof h.a) {
            ((com.amazon.aps.iva.z70.a) f0Var).b1(j.b);
        } else if (d == null) {
            y0 y0Var = this.b;
            if (y0Var.b(i)) {
                h.d d2 = y0Var.d(i);
                View view3 = ((k) f0Var).itemView;
                com.amazon.aps.iva.yb0.j.d(view3, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.BrowseAllTitleView");
                ((BrowseAllTitleView) view3).U2(d2);
                return;
            }
            ((com.amazon.aps.iva.z70.a) f0Var).b1(j.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        if (i != 10) {
            if (i != 11) {
                Context context = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context, "parent.context");
                return new com.amazon.aps.iva.z70.a(context);
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_all_title, viewGroup, false);
            com.amazon.aps.iva.yb0.j.e(inflate, "from(parent.context)\n   …all_title, parent, false)");
            return new k(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_all_prefixed_title, viewGroup, false);
        com.amazon.aps.iva.yb0.j.e(inflate2, "from(parent.context)\n   …xed_title, parent, false)");
        return new k(inflate2);
    }
}
