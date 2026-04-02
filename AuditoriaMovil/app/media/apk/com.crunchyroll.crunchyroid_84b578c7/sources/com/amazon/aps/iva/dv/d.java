package com.amazon.aps.iva.dv;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.cv.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.q.c0;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends v<com.amazon.aps.iva.dv.a, RecyclerView.f0> implements com.amazon.aps.iva.r70.d {
    public final com.amazon.aps.iva.ev.i b;
    public final t c;
    public final com.amazon.aps.iva.fv.a d;
    public final q e;

    /* compiled from: CrunchylistAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.dv.a h;
        public final /* synthetic */ d i;
        public final /* synthetic */ RecyclerView.f0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.dv.a aVar, d dVar, RecyclerView.f0 f0Var) {
            super(3);
            this.h = aVar;
            this.i = dVar;
            this.j = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q> aVar2 = aVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            if ((intValue & 14) == 0) {
                if (iVar2.v(aVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            int i2 = intValue;
            if ((i2 & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -1771756296, new c(this.h, this.i, this.j, aVar2, i2)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;
        public final /* synthetic */ RecyclerView.f0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, RecyclerView.f0 f0Var) {
            super(3);
            this.i = i;
            this.j = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.kb0.q> aVar2 = aVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            if ((intValue & 14) == 0) {
                if (iVar2.v(aVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            int i2 = intValue;
            if ((i2 & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 710995520, new e(d.this, this.i, this.j, aVar2, i2)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ev.i iVar, com.amazon.aps.iva.cv.k kVar, com.amazon.aps.iva.fv.b bVar) {
        super(k.a);
        com.amazon.aps.iva.yb0.j.f(kVar, "showItemListener");
        this.b = iVar;
        this.c = kVar;
        this.d = bVar;
        this.e = new q(new com.amazon.aps.iva.r70.c(this));
    }

    @Override // com.amazon.aps.iva.r70.d
    public final void b(int i, int i2) {
        Collection collection = this.a.f;
        com.amazon.aps.iva.yb0.j.e(collection, "currentList");
        ArrayList Z0 = x.Z0(collection);
        Z0.remove(i);
        Z0.add(i2, (com.amazon.aps.iva.dv.a) Z0.get(i));
        e(Z0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        com.amazon.aps.iva.dv.a d = d(i);
        if (d instanceof m) {
            return 502;
        }
        if (d instanceof g) {
            return 501;
        }
        if (d instanceof f) {
            return 503;
        }
        throw new IllegalArgumentException("Model not supported!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof j) {
            com.amazon.aps.iva.dv.a aVar = (com.amazon.aps.iva.dv.a) this.a.f.get(i);
            if (aVar instanceof g) {
                ((j) f0Var).H6(aVar, com.amazon.aps.iva.v0.b.c(818753157, new a(aVar, this, f0Var), true));
            } else if (aVar instanceof f) {
                com.amazon.aps.iva.v0.a aVar2 = com.amazon.aps.iva.dv.b.b;
                int i2 = j.g;
                ((j) f0Var).H6(null, aVar2);
            } else if (aVar instanceof m) {
                j jVar = (j) f0Var;
                com.amazon.aps.iva.v0.a c = com.amazon.aps.iva.v0.b.c(-890451827, new b(i, f0Var), true);
                int i3 = j.g;
                jVar.H6(null, c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        com.amazon.aps.iva.fv.a aVar = this.d;
        q qVar = this.e;
        switch (i) {
            case 501:
                Context context = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context, "parent.context");
                return new j(context, qVar, aVar);
            case 502:
                Context context2 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context2, "parent.context");
                return new j(context2, qVar, aVar);
            case 503:
                Context context3 = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context3, "parent.context");
                return new j(context3, qVar, aVar);
            default:
                throw new IllegalArgumentException(c0.a("Unsupported view type ", i));
        }
    }
}
