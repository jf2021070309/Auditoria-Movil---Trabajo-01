package com.amazon.aps.iva.kw;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.kw.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.wv.b0;
import com.amazon.aps.iva.wv.d0;
import com.amazon.aps.iva.wv.j;
import com.amazon.aps.iva.wv.k;
import com.amazon.aps.iva.wv.q;
import com.amazon.aps.iva.wv.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import java.util.List;
/* compiled from: OfflinePlayheadsSynchronizer.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.nz.e {
    public final EtpContentService a;
    public final i b;
    public final b0 c;
    public final com.amazon.aps.iva.wv.j d;
    public final q e;
    public j1 f;
    public j1 g;
    public final com.amazon.aps.iva.ze0.d h;
    public l<? super List<com.amazon.aps.iva.nz.a>, com.amazon.aps.iva.kb0.q> i;

    /* compiled from: OfflinePlayheadsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer$synchronize$2", f = "OfflinePlayheadsSynchronizer.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.ze0.d h;
        public g i;
        public int j;
        public /* synthetic */ Object k;

        /* compiled from: OfflinePlayheadsSynchronizer.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer$synchronize$2$1$1", f = "OfflinePlayheadsSynchronizer.kt", l = {39, 40}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.kw.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0459a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ g j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0459a(g gVar, com.amazon.aps.iva.ob0.d<? super C0459a> dVar) {
                super(2, dVar);
                this.j = gVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0459a c0459a = new C0459a(this.j, dVar);
                c0459a.i = obj;
                return c0459a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0459a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                g gVar;
                Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                try {
                } catch (Throwable th) {
                    x.H(th);
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            x.i0(obj);
                            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                            return com.amazon.aps.iva.kb0.q.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (g) this.i;
                    x.i0(obj);
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    gVar = this.j;
                    this.i = gVar;
                    this.h = 1;
                    if (g.d(gVar, this) == obj2) {
                        return obj2;
                    }
                }
                this.i = null;
                this.h = 2;
                gVar.getClass();
                Object p = z.p(new e(gVar, null), this);
                if (p != obj2) {
                    p = com.amazon.aps.iva.kb0.q.a;
                }
                if (p == obj2) {
                    return obj2;
                }
                com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.k = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.ze0.d dVar;
            g gVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    gVar = this.i;
                    dVar = this.h;
                    g0Var = (g0) this.k;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0Var = (g0) this.k;
                g gVar2 = g.this;
                dVar = gVar2.h;
                this.k = g0Var;
                this.h = dVar;
                this.i = gVar2;
                this.j = 1;
                if (dVar.a(null, this) == aVar) {
                    return aVar;
                }
                gVar = gVar2;
            }
            try {
                j1 j1Var = gVar.f;
                if (j1Var == null || !j1Var.isActive()) {
                    z = false;
                }
                if (!z) {
                    gVar.f = com.amazon.aps.iva.se0.i.d(g0Var, null, null, new C0459a(gVar, null), 3);
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                dVar.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                dVar.d(null);
                throw th;
            }
        }
    }

    /* compiled from: OfflinePlayheadsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer$uploadOfflinePlayheads$2", f = "OfflinePlayheadsSynchronizer.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.ze0.d h;
        public g i;
        public int j;
        public /* synthetic */ Object k;

        /* compiled from: OfflinePlayheadsSynchronizer.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer$uploadOfflinePlayheads$2$1$1", f = "OfflinePlayheadsSynchronizer.kt", l = {53}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ g j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.j = gVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                a aVar = new a(this.j, dVar);
                aVar.i = obj;
                return aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        g0 g0Var = (g0) this.i;
                        g gVar = this.j;
                        this.h = 1;
                        if (g.d(gVar, this) == aVar) {
                            return aVar;
                        }
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } catch (Throwable th) {
                    x.H(th);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.k = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.ze0.d dVar;
            g gVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    gVar = this.i;
                    dVar = this.h;
                    g0Var = (g0) this.k;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0Var = (g0) this.k;
                g gVar2 = g.this;
                dVar = gVar2.h;
                this.k = g0Var;
                this.h = dVar;
                this.i = gVar2;
                this.j = 1;
                if (dVar.a(null, this) == aVar) {
                    return aVar;
                }
                gVar = gVar2;
            }
            try {
                j1 j1Var = gVar.g;
                if (j1Var == null || !j1Var.isActive()) {
                    z = false;
                }
                if (!z) {
                    gVar.g = com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(gVar, null), 3);
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                dVar.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                dVar.d(null);
                throw th;
            }
        }
    }

    public g(CrunchyrollApplication crunchyrollApplication, EtpContentService etpContentService) {
        j jVar = i.a.a;
        if (jVar == null) {
            Context applicationContext = crunchyrollApplication.getApplicationContext();
            com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
            jVar = new j(applicationContext);
            i.a.a = jVar;
        }
        d0 d0Var = b0.a.a;
        if (d0Var == null) {
            Context applicationContext2 = crunchyrollApplication.getApplicationContext();
            com.amazon.aps.iva.yb0.j.e(applicationContext2, "context.applicationContext");
            d0Var = new d0(applicationContext2);
            b0.a.a = d0Var;
        }
        k kVar = j.a.a;
        if (kVar == null) {
            Context applicationContext3 = crunchyrollApplication.getApplicationContext();
            com.amazon.aps.iva.yb0.j.e(applicationContext3, "context.applicationContext");
            kVar = new k(applicationContext3);
            j.a.a = kVar;
        }
        r rVar = q.a.a;
        if (rVar == null) {
            Context applicationContext4 = crunchyrollApplication.getApplicationContext();
            com.amazon.aps.iva.yb0.j.e(applicationContext4, "context.applicationContext");
            rVar = new r(applicationContext4);
            q.a.a = rVar;
        }
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        this.a = etpContentService;
        this.b = jVar;
        this.c = d0Var;
        this.d = kVar;
        this.e = rVar;
        this.h = t.d();
        this.i = d.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x016f -> B:52:0x0171). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0197 -> B:57:0x019c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.amazon.aps.iva.kw.g r17, com.amazon.aps.iva.ob0.d r18) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kw.g.d(com.amazon.aps.iva.kw.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0087). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0095 -> B:25:0x0097). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.amazon.aps.iva.kw.g r10, java.util.List r11, com.amazon.aps.iva.ob0.d r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.amazon.aps.iva.kw.h
            if (r0 == 0) goto L16
            r0 = r12
            com.amazon.aps.iva.kw.h r0 = (com.amazon.aps.iva.kw.h) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.o = r1
            goto L1b
        L16:
            com.amazon.aps.iva.kw.h r0 = new com.amazon.aps.iva.kw.h
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.m
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.util.Collection r10 = r0.l
            java.util.Collection r10 = (java.util.Collection) r10
            com.ellation.crunchyroll.api.etp.content.model.Playhead r11 = r0.k
            java.util.Iterator r2 = r0.j
            java.util.Collection r4 = r0.i
            java.util.Collection r4 = (java.util.Collection) r4
            com.amazon.aps.iva.kw.g r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L87
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            com.amazon.aps.iva.ab.x.i0(r12)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r11)
            r12.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r2 = r11
            r11 = r10
            r10 = r12
        L55:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto La9
            java.lang.Object r12 = r2.next()
            com.ellation.crunchyroll.api.etp.content.model.Playhead r12 = (com.ellation.crunchyroll.api.etp.content.model.Playhead) r12
            java.util.Date r4 = r12.getLastModified()
            if (r4 != 0) goto L95
            com.amazon.aps.iva.wv.b0 r4 = r11.c
            java.lang.String r5 = r12.getContentId()
            r0.h = r11
            r6 = r10
            java.util.Collection r6 = (java.util.Collection) r6
            r0.i = r6
            r0.j = r2
            r0.k = r12
            r0.l = r6
            r0.o = r3
            java.lang.Object r4 = r4.readItem(r5, r0)
            if (r4 != r1) goto L83
            goto Lac
        L83:
            r5 = r11
            r11 = r12
            r12 = r4
            r4 = r10
        L87:
            com.amazon.aps.iva.yb0.j.c(r12)
            com.amazon.aps.iva.ig.a r12 = (com.amazon.aps.iva.ig.a) r12
            java.util.Date r12 = r12.b()
            r9 = r12
            r12 = r11
            r11 = r5
            r5 = r9
            goto L97
        L95:
            r5 = r4
            r4 = r10
        L97:
            com.amazon.aps.iva.ig.a r6 = new com.amazon.aps.iva.ig.a
            long r7 = r12.getPlayheadSec()
            java.lang.String r12 = r12.getContentId()
            r6.<init>(r7, r12, r5)
            r10.add(r6)
            r10 = r4
            goto L55
        La9:
            r1 = r10
            java.util.List r1 = (java.util.List) r1
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kw.g.e(com.amazon.aps.iva.kw.g, java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.nz.e
    public final Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = z.p(new b(null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.nz.e
    public final Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = z.p(new a(null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.nz.e
    public final void c(com.amazon.aps.iva.nz.g gVar) {
        this.i = gVar;
    }
}
