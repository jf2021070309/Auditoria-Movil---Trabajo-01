package com.amazon.aps.iva.cv;

import com.amazon.aps.iva.cv.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItems;
import com.ellation.crunchyroll.model.Panel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: CrunchylistViewModel.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.ez.b implements y, a0 {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] n = {com.amazon.aps.iva.k.q.a(z.class, "crunchylistItemUiModel", "getCrunchylistItemUiModel()Lcom/ellation/crunchyroll/crunchylists/crunchyliststab/list/item/CrunchylistItemUiModel;", 0)};
    public final d b;
    public final u c;
    public final g0 d;
    public final ArrayList e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.nv.e> f;
    public final com.amazon.aps.iva.xw.z g;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> h;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.qv.a>> i;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<Panel>>> j;
    public final ArrayList k;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<w>> l;
    public w m;

    /* compiled from: CrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistViewModelImpl$addToCrunchylists$1", f = "CrunchylistViewModel.kt", l = {145}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ Panel j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Panel panel, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = panel;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            Panel panel = this.j;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    d dVar = zVar.b;
                    String str = z.O8(zVar).d;
                    String id = panel.getId();
                    this.h = 1;
                    if (dVar.k(str, id, this) == aVar) {
                        return aVar;
                    }
                }
                zVar.j.k(new com.amazon.aps.iva.ez.d<>(new g.c(panel, null)));
                zVar.c.m5().k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
                String id2 = panel.getId();
                String str2 = z.O8(zVar).d;
                String uuid = UUID.randomUUID().toString();
                com.amazon.aps.iva.yb0.j.e(uuid, "randomUUID().toString()");
                z.N8(zVar, new com.amazon.aps.iva.dv.g(uuid, id2, str2, panel));
            } catch (IOException e) {
                zVar.j.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, new com.amazon.aps.iva.hv.r(panel.getTitle(), z.O8(zVar).e, e))));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistViewModelImpl$loadList$1", f = "CrunchylistViewModel.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    d dVar = zVar.b;
                    String str = z.O8(zVar).d;
                    this.h = 1;
                    obj = dVar.y(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                zVar.m = f1.h((CustomListItems) obj, zVar.e);
                zVar.l.k(new g.c(w.a(zVar.d1(), null, 0, false, 15), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, zVar.l);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistViewModelImpl$removeItem$1", f = "CrunchylistViewModel.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.dv.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.dv.a aVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.dv.a aVar2 = this.j;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    d dVar = zVar.b;
                    String c = aVar2.c();
                    String a = f0.a(((com.amazon.aps.iva.dv.g) aVar2).h);
                    this.h = 1;
                    if (dVar.k1(c, a, this) == aVar) {
                        return aVar;
                    }
                }
                zVar.c.m5().k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
                zVar.m = w.a(zVar.d1(), com.amazon.aps.iva.lb0.x.G0(zVar.d1().a, aVar2), zVar.d1().b - 1, false, 12);
                zVar.k.remove(aVar2);
                zVar.P8();
            } catch (IOException unused) {
                zVar.p4(aVar2);
                zVar.h.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, v vVar, com.amazon.aps.iva.cv.c cVar) {
        super(eVar);
        com.amazon.aps.iva.xe0.d j = com.amazon.aps.iva.e.z.j();
        com.amazon.aps.iva.yb0.j.f(eVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(vVar, "crunchylistStateMonitor");
        this.b = eVar;
        this.c = vVar;
        this.d = j;
        ArrayList arrayList = new ArrayList(100);
        for (int i = 0; i < 100; i++) {
            arrayList.add(new com.amazon.aps.iva.dv.f(0));
        }
        this.e = arrayList;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.nv.e> vVar2 = new com.amazon.aps.iva.i5.v<>(cVar.b);
        this.f = vVar2;
        this.g = new com.amazon.aps.iva.xw.z(vVar2);
        this.h = new com.amazon.aps.iva.i5.v<>();
        this.i = new com.amazon.aps.iva.i5.v<>(new com.amazon.aps.iva.ez.d(cVar.c));
        this.j = new com.amazon.aps.iva.i5.v<>();
        this.k = new ArrayList();
        this.l = new com.amazon.aps.iva.i5.v<>();
        W3();
    }

    public static final void N8(z zVar, com.amazon.aps.iva.dv.g gVar) {
        w wVar;
        g.c<w> a2;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<w>> vVar = zVar.l;
        com.amazon.aps.iva.ez.g<w> d = vVar.d();
        if (d != null && (a2 = d.a()) != null) {
            wVar = a2.a;
        } else {
            wVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(wVar);
        ArrayList M0 = com.amazon.aps.iva.lb0.x.M0(wVar.a, gVar);
        boolean z = true;
        int i = wVar.b + 1;
        if (i >= wVar.c) {
            z = false;
        }
        zVar.m = w.a(wVar, M0, i, z, 4);
        vVar.k(new g.c(zVar.d1(), null));
    }

    public static final com.amazon.aps.iva.nv.e O8(z zVar) {
        return (com.amazon.aps.iva.nv.e) zVar.g.getValue(zVar, n[0]);
    }

    @Override // com.amazon.aps.iva.cv.a0
    public final void B4(w wVar) {
        this.m = wVar;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final com.amazon.aps.iva.i5.v C4() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final com.amazon.aps.iva.i5.v E8() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void G7(com.amazon.aps.iva.dv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "item");
        if (aVar instanceof com.amazon.aps.iva.dv.g) {
            com.amazon.aps.iva.se0.i.d(this.d, null, null, new c(aVar, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.cv.y
    public final com.amazon.aps.iva.i5.v H() {
        return this.j;
    }

    public final void P8() {
        boolean z;
        w d1 = d1();
        ArrayList arrayList = this.k;
        int size = d1.b - arrayList.size();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<w>> vVar = this.l;
        w d12 = d1();
        List H0 = com.amazon.aps.iva.lb0.x.H0(d1().a, arrayList);
        if (size < d1().c) {
            z = true;
        } else {
            z = false;
        }
        vVar.k(new g.c(w.a(d12, H0, size, z, 4), null));
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void W3() {
        com.amazon.aps.iva.ez.h.c(this.l, new w(false, 0, 0, this.e));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.cv.a0
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<w>> X1() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void a(com.amazon.aps.iva.b60.j jVar, com.amazon.aps.iva.xb0.l<? super Integer, com.amazon.aps.iva.kb0.q> lVar) {
        Iterable iterable;
        g.c<w> a2;
        w wVar;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        com.amazon.aps.iva.ez.g<w> d = this.l.d();
        if (d == null || (a2 = d.a()) == null || (wVar = a2.a) == null || (iterable = wVar.a) == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            if (i >= 0) {
                com.amazon.aps.iva.dv.a aVar = (com.amazon.aps.iva.dv.a) obj;
                if (aVar instanceof com.amazon.aps.iva.dv.g) {
                    Panel panel = ((com.amazon.aps.iva.dv.g) aVar).h;
                    if (com.amazon.aps.iva.yb0.j.a(jVar.b, panel.getId())) {
                        WatchlistStatus watchlistStatus = panel.getWatchlistStatus();
                        WatchlistStatus watchlistStatus2 = jVar.c;
                        if (watchlistStatus2 != watchlistStatus) {
                            panel.setWatchlistStatus(watchlistStatus2);
                            ((p.k) lVar).invoke(Integer.valueOf(i));
                        }
                    }
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }

    @Override // com.amazon.aps.iva.cv.a0
    public final w d1() {
        w wVar = this.m;
        if (wVar != null) {
            return wVar;
        }
        com.amazon.aps.iva.yb0.j.m("actualCrunchylistShowItems");
        throw null;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final com.amazon.aps.iva.i5.v d8() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void e6(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.j.k(new com.amazon.aps.iva.ez.d<>(new g.b(null)));
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(panel, null), 3);
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void h5(com.amazon.aps.iva.dv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "item");
        this.k.add(aVar);
        P8();
    }

    @Override // com.amazon.aps.iva.cv.y
    public final com.amazon.aps.iva.i5.v o4() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void p4(com.amazon.aps.iva.dv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "item");
        this.k.remove(aVar);
        P8();
    }

    @Override // com.amazon.aps.iva.cv.y
    public final void y6(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        this.f.k(eVar);
    }
}
