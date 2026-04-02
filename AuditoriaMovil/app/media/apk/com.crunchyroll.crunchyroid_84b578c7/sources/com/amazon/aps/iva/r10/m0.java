package com.amazon.aps.iva.r10;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.r10.c0;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/* compiled from: HistoryViewModel.kt */
/* loaded from: classes2.dex */
public final class m0 extends com.amazon.aps.iva.ez.b implements l0 {
    public final u b;
    public final com.amazon.aps.iva.t10.b c;
    public final com.amazon.aps.iva.r10.c d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> e;
    public final com.amazon.aps.iva.i5.v<c0> f;
    public final com.amazon.aps.iva.i5.u g;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> h;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> i;
    public final ArrayList j;
    public final ArrayList k;
    public String l;
    public int m;
    public j0 n;

    /* compiled from: HistoryViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>>, Object> {
        public a(u uVar) {
            super(2, uVar, u.class, "loadNextPage", "loadNextPage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar) {
            return ((u) this.receiver).f0(str, dVar);
        }
    }

    /* compiled from: HistoryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            m0.this.f.i(c0.a.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.t10.e, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.t10.e eVar) {
            com.amazon.aps.iva.t10.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "it");
            String str = eVar2.a;
            m0 m0Var = m0.this;
            m0Var.l = str;
            m0Var.m = eVar2.b;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            m0.this.f.i(c0.b.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.HistoryViewModelImpl$deleteHistory$1", f = "HistoryViewModel.kt", l = {177}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            m0 m0Var = m0.this;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        u uVar = m0Var.b;
                        this.h = 1;
                        if (uVar.deleteHistory(this) == aVar) {
                            return aVar;
                        }
                    }
                    m0Var.d.o(m0Var.m);
                    m0Var.i.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
                } catch (IOException e) {
                    m0Var.e.k(new g.c(m0Var.N8(new com.amazon.aps.iva.t10.d(com.amazon.aps.iva.lb0.x.X0(m0Var.k), m0Var.l), m0Var.n), null));
                    m0Var.h.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
                    m0Var.d.C(e);
                }
                m0Var.k.clear();
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                m0Var.k.clear();
                throw th;
            }
        }
    }

    /* compiled from: HistoryViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.HistoryViewModelImpl$loadWatchHistory$1", f = "HistoryViewModel.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            m0 m0Var = m0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    u uVar = m0Var.b;
                    this.h = 1;
                    obj = uVar.A0(20, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ContentApiResponse contentApiResponse = (ContentApiResponse) obj;
                m0Var.m = contentApiResponse.getTotal();
                m0Var.e.k(new g.c(m0Var.N8(new com.amazon.aps.iva.t10.d(f1.X(contentApiResponse.getData(), m0Var.b.j(), m0Var.n), ((WatchHistoryMetadata) contentApiResponse.getMeta()).getNextPage()), m0Var.n), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, m0Var.e);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.HistoryViewModelImpl$removeItems$1", f = "HistoryViewModel.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ List<l> j;

        /* compiled from: HistoryViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q0, Boolean> {
            public final /* synthetic */ l h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar) {
                super(1);
                this.h = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Boolean invoke(q0 q0Var) {
                q0 q0Var2 = q0Var;
                com.amazon.aps.iva.yb0.j.f(q0Var2, "it");
                return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(q0Var2.b.getContentId(), this.h.getContentId()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<l> list, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.j = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            List<l> list = this.j;
            m0 m0Var = m0.this;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        u uVar = m0Var.b;
                        List<l> list2 = list;
                        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                        for (l lVar : list2) {
                            arrayList.add(lVar.getContentId());
                        }
                        this.h = 1;
                        if (uVar.Y0(arrayList, this) == aVar) {
                            return aVar;
                        }
                    }
                    m0Var.b0();
                    m0Var.d.l(list.size());
                    for (l lVar2 : list) {
                        ArrayList arrayList2 = m0Var.j;
                        final a aVar2 = new a(lVar2);
                        arrayList2.removeIf(new Predicate() { // from class: com.amazon.aps.iva.r10.n0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return ((Boolean) aVar2.invoke(obj2)).booleanValue();
                            }
                        });
                    }
                } catch (IOException e) {
                    m0Var.M6(list);
                    m0Var.h.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
                    m0Var.d.n(e);
                    for (l lVar3 : list) {
                        ArrayList arrayList3 = m0Var.j;
                        final a aVar3 = new a(lVar3);
                        arrayList3.removeIf(new Predicate() { // from class: com.amazon.aps.iva.r10.n0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return ((Boolean) aVar3.invoke(obj2)).booleanValue();
                            }
                        });
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                for (l lVar4 : list) {
                    ArrayList arrayList4 = m0Var.j;
                    final a aVar4 = new a(lVar4);
                    arrayList4.removeIf(new Predicate() { // from class: com.amazon.aps.iva.r10.n0
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) aVar4.invoke(obj2)).booleanValue();
                        }
                    });
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v vVar, com.amazon.aps.iva.r10.e eVar) {
        super(vVar);
        com.amazon.aps.iva.t10.c cVar = com.amazon.aps.iva.t10.c.a;
        com.amazon.aps.iva.yb0.j.f(eVar, "analytics");
        this.b = vVar;
        this.c = cVar;
        this.d = eVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar2 = new com.amazon.aps.iva.i5.v<>();
        this.e = vVar2;
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = com.amazon.aps.iva.i5.d0.b(vVar2, o0.h);
        this.h = new com.amazon.aps.iva.i5.v<>();
        this.i = new com.amazon.aps.iva.i5.v<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.n = j0.DISABLED;
        d2();
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final com.amazon.aps.iva.i5.u A1() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final boolean G1() {
        return this.e.d() instanceof g.a;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final com.amazon.aps.iva.i5.v G3() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void I6(List<l> list) {
        ArrayList arrayList;
        List list2;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    a0 a0Var = (a0) obj;
                    if ((a0Var instanceof l) && list.contains(a0Var)) {
                        this.j.add(new q0(i, (l) a0Var));
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            arrayList.removeAll(list);
        }
        if (arrayList != null) {
            list2 = com.amazon.aps.iva.lb0.x.X0(arrayList);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = com.amazon.aps.iva.lb0.z.b;
        }
        vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(list2, this.l), this.n), null));
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void M6(List<l> list) {
        ArrayList arrayList;
        List list2;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = this.j;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            if (arrayList != null) {
                int i = q0Var.a;
                int size = arrayList.size();
                l lVar = q0Var.b;
                if (i < size) {
                    arrayList.add(q0Var.a, lVar);
                } else {
                    arrayList.add(lVar);
                }
            }
        }
        arrayList2.clear();
        if (arrayList != null) {
            list2 = com.amazon.aps.iva.lb0.x.X0(arrayList);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = com.amazon.aps.iva.lb0.z.b;
        }
        vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(list2, this.l), this.n), null));
    }

    public final com.amazon.aps.iva.j8.h<a0> N8(com.amazon.aps.iva.t10.d dVar, j0 j0Var) {
        return this.c.a(new a(this.b), dVar, com.amazon.aps.iva.e.w.D(this), new b0(this.f), new b(), new c(), new d(), j0Var);
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void b0() {
        ArrayList arrayList;
        List list;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    a0 a0Var = (a0) obj;
                    if (a0Var instanceof l) {
                        l lVar = (l) a0Var;
                        if (lVar.c == j0.SELECTED) {
                            arrayList.set(i, l.a(lVar, j0.DESELECTED));
                        }
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            list = com.amazon.aps.iva.lb0.x.X0(arrayList);
        } else {
            list = null;
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(list, this.l), this.n), null));
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void d2() {
        this.e.k(new g.b(N8(new com.amazon.aps.iva.t10.d(this.b.j(), null), j0.DISABLED)));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new f(null), 3);
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final com.amazon.aps.iva.i5.v f8() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void g7() {
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            this.k.addAll(hVar);
        }
        this.j.clear();
        vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(com.amazon.aps.iva.lb0.z.b, null), this.n), null));
        this.d.H();
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new e(null), 3);
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void i7(l lVar) {
        ArrayList arrayList;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.yb0.j.f(lVar, "item");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int indexOf = arrayList.indexOf(lVar);
            j0 j0Var = j0.SELECTED;
            if (lVar.c == j0Var) {
                j0Var = j0.DESELECTED;
            }
            arrayList.set(indexOf, l.a(lVar, j0Var));
            vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(com.amazon.aps.iva.lb0.x.X0(arrayList), this.l), this.n), null));
        }
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final boolean m6() {
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = this.e.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            return hVar.isEmpty();
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final com.amazon.aps.iva.i5.v p6() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void u() {
        ArrayList arrayList;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        this.n = j0.DISABLED;
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    a0 a0Var = (a0) obj;
                    if (a0Var instanceof l) {
                        arrayList.set(i, l.a((l) a0Var, j0.DISABLED));
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(com.amazon.aps.iva.lb0.x.X0(arrayList), this.l), this.n), null));
        }
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void u6(List<l> list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.d.t();
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new g(list, null), 3);
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final com.amazon.aps.iva.i5.v w1() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.r10.l0
    public final void z() {
        ArrayList arrayList;
        g.c<com.amazon.aps.iva.j8.h<a0>> a2;
        com.amazon.aps.iva.j8.h<a0> hVar;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null && (hVar = a2.a) != null) {
            arrayList = com.amazon.aps.iva.lb0.x.Z0(hVar);
        } else {
            arrayList = null;
        }
        this.n = j0.DESELECTED;
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    a0 a0Var = (a0) obj;
                    if (a0Var instanceof l) {
                        arrayList.set(i, l.a((l) a0Var, j0.DESELECTED));
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            vVar.k(new g.c(N8(new com.amazon.aps.iva.t10.d(com.amazon.aps.iva.lb0.x.X0(arrayList), this.l), this.n), null));
        }
    }
}
