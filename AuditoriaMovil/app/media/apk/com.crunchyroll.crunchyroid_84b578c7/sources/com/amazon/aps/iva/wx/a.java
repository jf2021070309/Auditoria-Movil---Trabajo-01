package com.amazon.aps.iva.wx;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.cy.g;
import com.amazon.aps.iva.dy.h;
import com.amazon.aps.iva.hy.f;
import com.amazon.aps.iva.jy.e;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mt.m;
import com.amazon.aps.iva.nt.o;
import com.amazon.aps.iva.vx.n;
import com.amazon.aps.iva.vx.s;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.xx.c;
import com.amazon.aps.iva.xx.g;
import com.amazon.aps.iva.xx.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yx.i;
import com.amazon.aps.iva.yx.p;
import com.amazon.aps.iva.yx.u;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HomeFeedAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends v<l, RecyclerView.f0> {
    public final q<Panel, o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> b;
    public final SparseArray<p> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ImageView imageView, f fVar, com.amazon.aps.iva.xh.b bVar, s sVar) {
        super(b.a);
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HOME;
        com.amazon.aps.iva.ws.f a = d.a.a(aVar);
        j.f(imageView, "heroImage");
        j.f(bVar, "upgradeFlowRouter");
        j.f(aVar, "screen");
        this.b = sVar;
        RecyclerView.v vVar = new RecyclerView.v();
        RecyclerView.v.a b = vVar.b(111);
        b.b = 50;
        ArrayList<RecyclerView.f0> arrayList = b.a;
        while (arrayList.size() > 50) {
            arrayList.remove(arrayList.size() - 1);
        }
        RecyclerView.v.a b2 = vVar.b(112);
        b2.b = 50;
        ArrayList<RecyclerView.f0> arrayList2 = b2.a;
        while (arrayList2.size() > 50) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        n f = i.v().f();
        Activity a2 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a2);
        com.amazon.aps.iva.ix.j a3 = f.a(a2);
        n f2 = i.v().f();
        Activity a4 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a4);
        com.amazon.aps.iva.ix.l b3 = f2.b(a4);
        j.f(a3, "showPageRouter");
        j.f(b3, "watchScreenRouter");
        com.amazon.aps.iva.kt.b bVar2 = new com.amazon.aps.iva.kt.b(a, a3, b3, sVar);
        SparseArray<p> sparseArray = new SparseArray<>();
        sparseArray.put(0, new com.amazon.aps.iva.yx.n(imageView, context));
        sparseArray.put(1, new com.amazon.aps.iva.yx.d(bVar2, new m(context)));
        DurationFormatter.Companion companion = DurationFormatter.Companion;
        sparseArray.put(2, new i(bVar2, companion.create(context), new com.amazon.aps.iva.mt.o(context, new m(context))));
        sparseArray.put(3, new com.amazon.aps.iva.yx.f(fVar.b, a));
        n f3 = i.v().f();
        Activity a5 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a5);
        com.amazon.aps.iva.ix.j a6 = f3.a(a5);
        j.f(a6, "showPageRouter");
        sparseArray.put(4, new com.amazon.aps.iva.yx.a(vVar, new e(fVar.a, new com.amazon.aps.iva.qt.b(a, a6))));
        m mVar = new m(context);
        DurationFormatter create = companion.create(context);
        n f4 = i.v().f();
        Activity a7 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a7);
        sparseArray.put(5, new com.amazon.aps.iva.yx.a(vVar, new com.amazon.aps.iva.jy.b(a, mVar, create, f4.c(a7), new com.amazon.aps.iva.rt.b(new com.amazon.aps.iva.at.c(i.v().getHasPremiumBenefit())))));
        sparseArray.put(6, new com.amazon.aps.iva.b60.o(aVar));
        sparseArray.put(7, new u());
        sparseArray.put(8, new com.amazon.aps.iva.yx.s());
        DurationFormatter create2 = companion.create(context);
        n f5 = i.v().f();
        Activity a8 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a8);
        com.amazon.aps.iva.ii.a e = f5.e(a8);
        j.f(e, "musicRouter");
        sparseArray.put(9, new com.amazon.aps.iva.yx.j(vVar, new com.amazon.aps.iva.dy.d(fVar.c, create2, new h(a, e))));
        n f6 = i.v().f();
        Activity a9 = com.amazon.aps.iva.xw.q.a(context);
        j.c(a9);
        com.amazon.aps.iva.ii.a e2 = f6.e(a9);
        j.f(e2, "musicRouter");
        sparseArray.put(10, new com.amazon.aps.iva.yx.j(vVar, new g(fVar.d, new com.amazon.aps.iva.cy.c(a, e2))));
        sparseArray.put(11, new com.amazon.aps.iva.yx.q());
        sparseArray.put(12, new com.amazon.aps.iva.yx.l(imageView, context));
        sparseArray.put(13, new com.amazon.aps.iva.dt.l(bVar));
        this.c = sparseArray;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        return ((l) this.a.f.get(i)).a().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        l lVar = (l) this.a.f.get(i);
        if (lVar instanceof c.C0868c) {
            return 0;
        }
        if (lVar instanceof c.a) {
            return 1;
        }
        if (lVar instanceof c.b) {
            return 2;
        }
        if (lVar instanceof g.c.a) {
            return 3;
        }
        if (lVar instanceof g.b) {
            return 4;
        }
        if (lVar instanceof g.a) {
            return 5;
        }
        if (lVar instanceof g.c.b) {
            return 6;
        }
        if (lVar instanceof l.b) {
            return 7;
        }
        if (lVar instanceof l.a) {
            return 8;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.o) {
            return 9;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.a) {
            return 10;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.m) {
            return 11;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.p) {
            return 12;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.e) {
            return 13;
        }
        if (lVar instanceof com.amazon.aps.iva.xx.i) {
            throw new IllegalArgumentException("EmptyItem shouldn't be handled by adapter.");
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List<Object> list) {
        j.f(f0Var, "holder");
        j.f(list, "payloads");
        if (!list.isEmpty()) {
            Object t0 = x.t0(list);
            if (t0 instanceof Panel) {
                onBindViewHolder(f0Var, i);
                return;
            } else if (t0 instanceof com.amazon.aps.iva.xx.g) {
                c cVar = f0Var instanceof c ? (c) f0Var : null;
                if (cVar != null) {
                    cVar.G((com.amazon.aps.iva.xx.g) t0);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        super.onBindViewHolder(f0Var, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        return this.c.get(i).a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        j.f(f0Var, "holder");
        if (f0Var instanceof com.amazon.aps.iva.xx.f) {
            com.amazon.aps.iva.xx.f fVar = (com.amazon.aps.iva.xx.f) f0Var;
            int bindingAdapterPosition = fVar.getBindingAdapterPosition();
            RecyclerView.p layoutManager = ((RecyclerView) fVar.c.getValue(fVar, com.amazon.aps.iva.xx.f.d[0])).getLayoutManager();
            j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            fVar.b.put(bindingAdapterPosition, ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        Object obj = this.a.f.get(f0Var.getBindingAdapterPosition());
        j.e(obj, "currentList[holder.bindingAdapterPosition]");
        this.c.get(getItemViewType(i)).b(f0Var, (l) obj);
    }
}
