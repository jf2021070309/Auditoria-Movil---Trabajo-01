package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.b50.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.c2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: WatchlistViewModel.kt */
/* loaded from: classes2.dex */
public final class f0 extends com.amazon.aps.iva.ez.b implements e0 {
    public final com.amazon.aps.iva.b60.m b;
    public final n c;
    public final com.amazon.aps.iva.h50.a d;
    public final com.amazon.aps.iva.e60.c e;
    public final com.amazon.aps.iva.mn.i f;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<List<com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.mn.g>>> g;
    public final ArrayList<com.amazon.aps.iva.b60.s> h;
    public com.amazon.aps.iva.mn.g i;
    public c2 j;

    /* compiled from: WatchlistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.WatchlistViewModelImpl$fetchNextPage$1", f = "WatchlistViewModel.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: WatchlistViewModel.kt */
        /* renamed from: com.amazon.aps.iva.b50.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0131a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ f0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0131a(f0 f0Var) {
                super(1);
                this.h = f0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.b60.s> list) {
                List<? extends com.amazon.aps.iva.b60.s> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
                this.h.N8(list2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: WatchlistViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ f0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f0 f0Var) {
                super(1);
                this.h = f0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.b60.s> list) {
                List<? extends com.amazon.aps.iva.b60.s> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
                this.h.N8(list2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Map map;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            f0 f0Var = f0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    n nVar = f0Var.c;
                    com.amazon.aps.iva.mn.g gVar = f0Var.i;
                    if (gVar != null) {
                        map = gVar.b();
                    } else {
                        map = com.amazon.aps.iva.lb0.a0.b;
                    }
                    C0131a c0131a = new C0131a(f0Var);
                    b bVar = new b(f0Var);
                    this.h = 1;
                    obj = nVar.O0(map, c0131a, bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                List<? extends com.amazon.aps.iva.b60.s> list = (List) obj;
                f0Var.N8(list);
                f0Var.e.a(com.amazon.aps.iva.lb0.u.j0(list, com.amazon.aps.iva.b60.k.class), new g0(f0Var), h0.h);
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, f0Var.g);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.b60.s, Boolean> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.b60.s sVar) {
            boolean z;
            com.amazon.aps.iva.b60.s sVar2 = sVar;
            com.amazon.aps.iva.yb0.j.f(sVar2, "item");
            ArrayList<com.amazon.aps.iva.b60.s> arrayList = f0.this.h;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<com.amazon.aps.iva.b60.s> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (com.amazon.aps.iva.yb0.j.a(sVar2.getContentId(), it.next().getContentId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: WatchlistViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.b60.k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.b60.k kVar) {
            super(0);
            this.i = kVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            f0 f0Var = f0.this;
            ArrayList<com.amazon.aps.iva.b60.s> arrayList = f0Var.h;
            com.amazon.aps.iva.b60.k kVar = this.i;
            arrayList.remove(kVar);
            f0Var.c.Q1(kVar);
            f0Var.b.a(kVar.g);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.b60.k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.b60.k kVar) {
            super(1);
            this.i = kVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            Throwable th2 = th;
            com.amazon.aps.iva.yb0.j.f(th2, "e");
            f0 f0Var = f0.this;
            com.amazon.aps.iva.b60.k kVar = this.i;
            f0Var.m4(kVar);
            f0Var.b.b(kVar.g, th2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(z.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.amazon.aps.iva.b60.n nVar, n nVar2, com.amazon.aps.iva.h50.a aVar, com.amazon.aps.iva.e60.d dVar, com.amazon.aps.iva.mn.j jVar) {
        super(aVar);
        com.amazon.aps.iva.yb0.j.f(nVar, "watchlistItemAnalytics");
        com.amazon.aps.iva.yb0.j.f(nVar2, "watchlistInteractor");
        com.amazon.aps.iva.yb0.j.f(aVar, "etpWatchlistInteractor");
        com.amazon.aps.iva.yb0.j.f(jVar, "sortAndFiltersInteractor");
        this.b = nVar;
        this.c = nVar2;
        this.d = aVar;
        this.e = dVar;
        this.f = jVar;
        this.g = new com.amazon.aps.iva.i5.v<>();
        this.h = new ArrayList<>();
    }

    @Override // com.amazon.aps.iva.f50.d
    public final void K7(com.amazon.aps.iva.b60.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        this.d.y1(com.amazon.aps.iva.xw.f0.a(kVar.g), new c(kVar), new d(kVar));
    }

    @Override // com.amazon.aps.iva.f50.d
    public final void M4(com.amazon.aps.iva.b60.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        this.h.add(kVar);
        N8(this.c.x());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.amazon.aps.iva.b60.s] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.amazon.aps.iva.b60.k] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.amazon.aps.iva.b60.k] */
    public final void N8(List<? extends com.amazon.aps.iva.b60.s> list) {
        com.amazon.aps.iva.e60.a a2;
        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list);
        com.amazon.aps.iva.lb0.t.h0(Z0, new b());
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(Z0));
        Iterator it = Z0.iterator();
        while (it.hasNext()) {
            ?? r1 = (com.amazon.aps.iva.b60.s) it.next();
            if ((r1 instanceof com.amazon.aps.iva.b60.k) && (a2 = this.e.b().a((r1 = (com.amazon.aps.iva.b60.k) r1))) != null) {
                r1 = com.amazon.aps.iva.b60.k.a(r1, a2);
            }
            arrayList.add(r1);
        }
        this.g.k(new g.c(new com.amazon.aps.iva.kb0.j(arrayList, this.i), null));
    }

    @Override // com.amazon.aps.iva.b50.e0
    public final void h6(com.amazon.aps.iva.i5.o oVar, z.b bVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<List<com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.mn.g>>> vVar = this.g;
        if (vVar.d() == null) {
            r4();
        }
        vVar.e(oVar, new e(bVar));
    }

    @Override // com.amazon.aps.iva.b50.e0
    public final void i3(com.amazon.aps.iva.i5.o oVar, z.a aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        this.f.u0(oVar, new i0(this, aVar));
    }

    @Override // com.amazon.aps.iva.f50.d
    public final void m4(com.amazon.aps.iva.b60.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        this.h.remove(kVar);
        N8(this.c.x());
    }

    @Override // com.amazon.aps.iva.b50.e0
    public final boolean n() {
        g.c<com.amazon.aps.iva.kb0.j<List<com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.mn.g>> a2;
        com.amazon.aps.iva.kb0.j<List<com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.mn.g> jVar;
        List<com.amazon.aps.iva.b60.s> list;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<List<com.amazon.aps.iva.b60.s>, com.amazon.aps.iva.mn.g>> d2 = this.g.d();
        if (d2 == null || (a2 = d2.a()) == null || (jVar = a2.a) == null || (list = jVar.b) == null) {
            return true;
        }
        List<com.amazon.aps.iva.b60.s> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (com.amazon.aps.iva.b60.s sVar : list2) {
            if (!(sVar instanceof com.amazon.aps.iva.b60.l)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        this.c.cancelRunningApiCalls();
        w.b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0.isActive() == true) goto L5;
     */
    @Override // com.amazon.aps.iva.b50.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r4() {
        /*
            r4 = this;
            com.amazon.aps.iva.se0.c2 r0 = r4.j
            if (r0 == 0) goto Lc
            boolean r0 = r0.isActive()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L10
            return
        L10:
            com.amazon.aps.iva.se0.g0 r0 = com.amazon.aps.iva.e.w.D(r4)
            com.amazon.aps.iva.b50.f0$a r1 = new com.amazon.aps.iva.b50.f0$a
            r2 = 0
            r1.<init>(r2)
            r3 = 3
            com.amazon.aps.iva.se0.c2 r0 = com.amazon.aps.iva.se0.i.d(r0, r2, r2, r1, r3)
            r4.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b50.f0.r4():void");
    }

    @Override // com.amazon.aps.iva.b50.e0
    public final void reset() {
        this.c.clear();
        c2 c2Var = this.j;
        if (c2Var != null) {
            c2Var.a(null);
        }
    }
}
