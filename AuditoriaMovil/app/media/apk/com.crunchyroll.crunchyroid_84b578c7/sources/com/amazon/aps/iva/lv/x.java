package com.amazon.aps.iva.lv;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomLists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: CrunchylistsViewModel.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.ez.b implements w {
    public final e b;
    public final ArrayList c;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x>> d;

    /* compiled from: CrunchylistsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchyliststab.CrunchylistsViewModelImpl$loadCrunchylists$1", f = "CrunchylistsViewModel.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            x xVar = x.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    e eVar = xVar.b;
                    this.h = 1;
                    obj = eVar.getCustomLists(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                xVar.d.k(new g.c(com.amazon.aps.iva.e.w.U((CustomLists) obj, xVar.c), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, xVar.d);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, int i) {
        super(fVar);
        com.amazon.aps.iva.yb0.j.f(fVar, "interactor");
        this.b = fVar;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new com.amazon.aps.iva.nv.a(j0.d("randomUUID().toString()")));
        }
        this.c = arrayList;
        this.d = new com.amazon.aps.iva.i5.v<>();
        X();
    }

    @Override // com.amazon.aps.iva.lv.w
    public final void X() {
        com.amazon.aps.iva.ez.h.c(this.d, new com.amazon.aps.iva.yu.x(this.c, 0));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.lv.w
    public final void Z1(com.amazon.aps.iva.nv.e eVar, int i) {
        g.c<com.amazon.aps.iva.yu.x> a2;
        com.amazon.aps.iva.yu.x xVar;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x>> vVar = this.d;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x> d = vVar.d();
        if (d != null && (a2 = d.a()) != null && (xVar = a2.a) != null) {
            ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(xVar.a);
            if (i >= 0 && i < Z0.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Z0.add(i, eVar);
            } else {
                Z0.add(eVar);
            }
            vVar.k(new g.c(new com.amazon.aps.iva.yu.x(Z0, xVar.b), null));
        }
    }

    @Override // com.amazon.aps.iva.lv.w
    public final boolean n() {
        g.c<com.amazon.aps.iva.yu.x> a2;
        com.amazon.aps.iva.yu.x xVar;
        List<com.amazon.aps.iva.nv.b> list;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x> d = this.d.d();
        if (d == null || (a2 = d.a()) == null || (xVar = a2.a) == null || (list = xVar.a) == null) {
            return true;
        }
        List<com.amazon.aps.iva.nv.b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (com.amazon.aps.iva.nv.b bVar : list2) {
            if (!(bVar instanceof com.amazon.aps.iva.nv.a)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.lv.w
    public final void n2(com.amazon.aps.iva.nv.e eVar) {
        g.c<com.amazon.aps.iva.yu.x> a2;
        com.amazon.aps.iva.yu.x xVar;
        Object obj;
        String str;
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x>> vVar = this.d;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x> d = vVar.d();
        if (d != null && (a2 = d.a()) != null && (xVar = a2.a) != null) {
            ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(xVar.a);
            Iterator it = com.amazon.aps.iva.lb0.x.d1(Z0).iterator();
            while (true) {
                e0 e0Var = (e0) it;
                if (e0Var.hasNext()) {
                    obj = e0Var.next();
                    com.amazon.aps.iva.nv.e eVar2 = (com.amazon.aps.iva.nv.e) ((c0) obj).b;
                    if (eVar2 != null) {
                        str = eVar2.d;
                    } else {
                        str = null;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(eVar.d, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c0 c0Var = (c0) obj;
            if (c0Var != null) {
                Z0.set(c0Var.a, eVar);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            vVar.k(new g.c(new com.amazon.aps.iva.yu.x(Z0, xVar.b), null));
        }
    }

    @Override // com.amazon.aps.iva.lv.w
    public final com.amazon.aps.iva.i5.v s() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.lv.w
    public final void x0(com.amazon.aps.iva.nv.e eVar) {
        g.c<com.amazon.aps.iva.yu.x> a2;
        com.amazon.aps.iva.yu.x xVar;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x>> vVar = this.d;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.yu.x> d = vVar.d();
        if (d != null && (a2 = d.a()) != null && (xVar = a2.a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : xVar.a) {
                com.amazon.aps.iva.nv.b bVar = (com.amazon.aps.iva.nv.b) obj;
                if ((bVar instanceof com.amazon.aps.iva.nv.e) && com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.nv.e) bVar).d, eVar.d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(obj);
                }
            }
            vVar.k(new g.c(new com.amazon.aps.iva.yu.x(arrayList, xVar.b), null));
        }
    }
}
