package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: WatchlistItemToggleViewModel.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.ez.b implements w, g0 {
    public final com.amazon.aps.iva.h50.a b;
    public final String c;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<WatchlistStatus>> e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> f;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> g;

    /* compiled from: WatchlistItemToggleViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.WatchlistItemToggleViewModelImpl$addToWatchlist$1", f = "WatchlistItemToggleViewModel.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public int i;
        public /* synthetic */ Object j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.j = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r7.i
                r2 = 0
                com.amazon.aps.iva.h50.x r3 = com.amazon.aps.iva.h50.x.this
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 != r4) goto L16
                com.amazon.aps.iva.i5.v r0 = r7.h
                java.lang.Object r1 = r7.j
                com.amazon.aps.iva.h50.x r1 = (com.amazon.aps.iva.h50.x) r1
                com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> L4e
                goto L3f
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                com.amazon.aps.iva.ab.x.i0(r8)
                java.lang.Object r8 = r7.j
                com.amazon.aps.iva.se0.g0 r8 = (com.amazon.aps.iva.se0.g0) r8
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> r8 = r3.f
                com.amazon.aps.iva.ez.h.d(r8)
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> r8 = r3.f
                com.amazon.aps.iva.h50.a r1 = r3.b     // Catch: java.lang.Throwable -> L50
                java.lang.String r5 = r3.c     // Catch: java.lang.Throwable -> L50
                r7.j = r3     // Catch: java.lang.Throwable -> L50
                r7.h = r8     // Catch: java.lang.Throwable -> L50
                r7.i = r4     // Catch: java.lang.Throwable -> L50
                java.lang.Object r1 = r1.l(r5, r7)     // Catch: java.lang.Throwable -> L50
                if (r1 != r0) goto L3d
                return r0
            L3d:
                r0 = r8
                r1 = r3
            L3f:
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus>> r8 = r1.e     // Catch: java.lang.Throwable -> L4e
                com.amazon.aps.iva.ez.g$c r1 = new com.amazon.aps.iva.ez.g$c     // Catch: java.lang.Throwable -> L4e
                com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r4 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST     // Catch: java.lang.Throwable -> L4e
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L4e
                r8.k(r1)     // Catch: java.lang.Throwable -> L4e
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r8 = move-exception
                goto L54
            L50:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L54:
                com.amazon.aps.iva.kb0.k$a r8 = com.amazon.aps.iva.ab.x.H(r8)
            L58:
                java.lang.Throwable r1 = com.amazon.aps.iva.kb0.k.a(r8)
                if (r1 != 0) goto L5f
                goto L78
            L5f:
                boolean r8 = r1 instanceof com.ellation.crunchyroll.api.etp.error.ConflictException     // Catch: java.lang.Throwable -> L73
                if (r8 == 0) goto L72
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus>> r8 = r3.e     // Catch: java.lang.Throwable -> L73
                com.amazon.aps.iva.ez.g$c r1 = new com.amazon.aps.iva.ez.g$c     // Catch: java.lang.Throwable -> L73
                com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r3 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST     // Catch: java.lang.Throwable -> L73
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L73
                r8.k(r1)     // Catch: java.lang.Throwable -> L73
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L73
                goto L78
            L72:
                throw r1     // Catch: java.lang.Throwable -> L73
            L73:
                r8 = move-exception
                com.amazon.aps.iva.kb0.k$a r8 = com.amazon.aps.iva.ab.x.H(r8)
            L78:
                com.amazon.aps.iva.ez.g r8 = com.amazon.aps.iva.ez.h.e(r8)
                com.amazon.aps.iva.ez.d r1 = new com.amazon.aps.iva.ez.d
                r1.<init>(r8)
                r0.k(r1)
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h50.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WatchlistItemToggleViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.WatchlistItemToggleViewModelImpl$loadWatchlistItemStatus$1", f = "WatchlistItemToggleViewModel.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<WatchlistStatus>> vVar;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<WatchlistStatus>> vVar2;
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    vVar2 = (com.amazon.aps.iva.i5.v) this.i;
                    try {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } catch (Throwable th) {
                        th = th;
                        vVar = vVar2;
                        H = com.amazon.aps.iva.ab.x.H(th);
                        vVar2 = vVar;
                        vVar2.k(com.amazon.aps.iva.ez.h.e(H));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                x xVar = x.this;
                com.amazon.aps.iva.ez.h.c(xVar.e, null);
                vVar = xVar.e;
                try {
                    com.amazon.aps.iva.h50.a aVar2 = xVar.b;
                    String str = xVar.c;
                    this.i = vVar;
                    this.h = 1;
                    obj = aVar2.t1(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar2 = vVar;
                } catch (Throwable th2) {
                    th = th2;
                    H = com.amazon.aps.iva.ab.x.H(th);
                    vVar2 = vVar;
                    vVar2.k(com.amazon.aps.iva.ez.h.e(H));
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            H = (WatchlistStatus) obj;
            vVar2.k(com.amazon.aps.iva.ez.h.e(H));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistItemToggleViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.WatchlistItemToggleViewModelImpl$removeFromWatchlist$1", f = "WatchlistItemToggleViewModel.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public int i;
        public /* synthetic */ Object j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.j = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            x xVar;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> vVar;
            Throwable th;
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    vVar = this.h;
                    xVar = (x) this.j;
                    try {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        H = com.amazon.aps.iva.ab.x.H(th);
                        vVar.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.ez.h.e(H)));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.j;
                xVar = x.this;
                com.amazon.aps.iva.ez.h.d(xVar.g);
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> vVar2 = xVar.g;
                try {
                    com.amazon.aps.iva.h50.a aVar2 = xVar.b;
                    String str = xVar.c;
                    this.j = xVar;
                    this.h = vVar2;
                    this.i = 1;
                    if (aVar2.s(str, this) == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                } catch (Throwable th3) {
                    vVar = vVar2;
                    th = th3;
                    H = com.amazon.aps.iva.ab.x.H(th);
                    vVar.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.ez.h.e(H)));
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            xVar.e.k(new g.c(WatchlistStatus.NOT_IN_WATCHLIST, null));
            H = com.amazon.aps.iva.kb0.q.a;
            vVar.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.ez.h.e(H)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.h50.b bVar, String str) {
        super(bVar);
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        this.b = bVar;
        this.c = str;
        this.d = z.j();
        this.e = new com.amazon.aps.iva.i5.v<>();
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.h50.w
    public final void Z3() {
        com.amazon.aps.iva.se0.i.d(this, null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.h50.w
    public final void b5() {
        if (this.e.d() == null) {
            com.amazon.aps.iva.se0.i.d(this, null, null, new b(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.d.b;
    }

    @Override // com.amazon.aps.iva.h50.w
    public final com.amazon.aps.iva.i5.v k4() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        z.l(this, null);
    }

    @Override // com.amazon.aps.iva.h50.w
    public final void p7() {
        com.amazon.aps.iva.se0.i.d(this, null, null, new c(null), 3);
    }
}
