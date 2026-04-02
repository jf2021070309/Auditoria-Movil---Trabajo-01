package com.ellation.crunchyroll.downloading;

import java.util.List;
/* compiled from: DownloadsDataSynchronizer.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.sv.m {
    public final com.amazon.aps.iva.sv.c a;
    public final com.amazon.aps.iva.wu.a b;
    public InternalDownloadsManager c;

    /* compiled from: DownloadsDataSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsDataSynchronizerImpl$synchronize$1", f = "DownloadsDataSynchronizer.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: DownloadsDataSynchronizer.kt */
        /* renamed from: com.ellation.crunchyroll.downloading.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0964a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ e h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0964a(e eVar) {
                super(1);
                this.h = eVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends e0> list) {
                List<? extends e0> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, "downloads");
                e eVar = this.h;
                com.amazon.aps.iva.se0.i.d(eVar.a, eVar.b.a(), null, new d(eVar, list2, null), 2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: DownloadsDataSynchronizer.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsDataSynchronizerImpl$synchronize$1$2", f = "DownloadsDataSynchronizer.kt", l = {43, 44, 45}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ e i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.i = eVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r1 = r6.h
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    com.ellation.crunchyroll.downloading.e r5 = r6.i
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L21
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    com.amazon.aps.iva.ab.x.i0(r7)
                    goto L4f
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1d:
                    com.amazon.aps.iva.ab.x.i0(r7)
                    goto L42
                L21:
                    com.amazon.aps.iva.ab.x.i0(r7)
                    goto L35
                L25:
                    com.amazon.aps.iva.ab.x.i0(r7)
                    com.ellation.crunchyroll.downloading.InternalDownloadsManager r7 = r5.b()
                    r6.h = r4
                    java.lang.Object r7 = r7.o(r6)
                    if (r7 != r0) goto L35
                    return r0
                L35:
                    com.ellation.crunchyroll.downloading.InternalDownloadsManager r7 = r5.b()
                    r6.h = r3
                    java.lang.Object r7 = r7.u(r6)
                    if (r7 != r0) goto L42
                    return r0
                L42:
                    com.ellation.crunchyroll.downloading.InternalDownloadsManager r7 = r5.b()
                    r6.h = r2
                    java.lang.Object r7 = r7.a(r6)
                    if (r7 != r0) goto L4f
                    return r0
                L4f:
                    com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.e.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
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
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                e eVar = e.this;
                eVar.b().Z(new C0964a(eVar));
                com.amazon.aps.iva.ye0.b a = eVar.b.a();
                b bVar = new b(eVar, null);
                this.h = 1;
                if (com.amazon.aps.iva.se0.i.g(this, a, bVar) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(com.amazon.aps.iva.sv.d dVar) {
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        this.a = dVar;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.sv.m
    public final void a() {
        com.amazon.aps.iva.se0.i.d(this.a, this.b.b(), null, new a(null), 2);
    }

    public final InternalDownloadsManager b() {
        InternalDownloadsManager internalDownloadsManager = this.c;
        if (internalDownloadsManager != null) {
            return internalDownloadsManager;
        }
        com.amazon.aps.iva.yb0.j.m("downloadsManager");
        throw null;
    }
}
