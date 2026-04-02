package com.amazon.aps.iva.s30;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.t30.r;
import com.amazon.aps.iva.x30.a0;
import com.amazon.aps.iva.x30.p;
import com.amazon.aps.iva.yb0.t;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: SearchResultAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends v<h, RecyclerView.f0> {
    public final com.amazon.aps.iva.r30.c b;
    public final DurationFormatter c;
    public final a0 d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final SparseArray<r> f;

    public g() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.nt.a aVar, com.amazon.aps.iva.gi.e eVar, DurationFormatter durationFormatter, p pVar, com.amazon.aps.iva.r30.b bVar, o oVar, int i) {
        super(b.a);
        t tVar;
        p pVar2 = (i & 16) != 0 ? null : pVar;
        if ((i & 64) != 0) {
            final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
            tVar = new t(a) { // from class: com.amazon.aps.iva.s30.f
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).R1());
                }
            };
        } else {
            tVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.yb0.j.f(tVar, "isUserPremium");
        this.b = cVar;
        this.c = durationFormatter;
        this.d = pVar2;
        this.e = tVar;
        SparseArray<r> sparseArray = new SparseArray<>();
        sparseArray.put(0, new com.amazon.aps.iva.t30.j(pVar2));
        sparseArray.put(1, new com.amazon.aps.iva.t30.d(cVar, aVar, bVar, tVar));
        sparseArray.put(3, new com.amazon.aps.iva.t30.e(cVar, aVar, bVar, tVar));
        t tVar2 = tVar;
        sparseArray.put(4, new com.amazon.aps.iva.t30.t(cVar, tVar2, oVar, durationFormatter, aVar));
        sparseArray.put(2, new com.amazon.aps.iva.t30.i(cVar, tVar2, oVar, durationFormatter, aVar));
        sparseArray.put(8, new com.amazon.aps.iva.t30.p());
        sparseArray.put(5, new com.amazon.aps.iva.t30.o(cVar, eVar, durationFormatter));
        this.f = sparseArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        h d = d(i);
        com.amazon.aps.iva.yb0.j.e(d, "super.getItem(position)");
        h hVar = d;
        if (hVar instanceof d) {
            return 0;
        }
        if (hVar instanceof c) {
            return 2;
        }
        if (hVar instanceof a) {
            return 1;
        }
        if (hVar instanceof e) {
            return 8;
        }
        if (hVar instanceof l) {
            return 3;
        }
        if (hVar instanceof m) {
            return 4;
        }
        if (hVar instanceof j) {
            return 5;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "viewHolder");
        h d = d(i);
        com.amazon.aps.iva.yb0.j.e(d, "super.getItem(position)");
        this.f.get(getItemViewType(i)).b(f0Var, d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "viewGroup");
        return this.f.get(i).a(viewGroup);
    }
}
