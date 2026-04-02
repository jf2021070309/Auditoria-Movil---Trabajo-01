package com.amazon.aps.iva.nw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.sv.b0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: RenewContentInteractor.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.nw.a {
    public final EtpContentService b;
    public final com.amazon.aps.iva.ew.d c;
    public final com.amazon.aps.iva.zv.a d;
    public final e e;
    public final p<String, com.amazon.aps.iva.ob0.d<? super q>, Object> f;

    /* compiled from: RenewContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.renew.RenewContentInteractorImpl$renewContentIds$2", f = "RenewContentInteractor.kt", l = {MediaError.DetailedErrorCode.MEDIA_NETWORK}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public c h;
        public com.amazon.aps.iva.xb0.l i;
        public Iterator j;
        public int k;
        public /* synthetic */ Object l;
        public final /* synthetic */ List<String> m;
        public final /* synthetic */ c n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> o;
        public final /* synthetic */ p<String, Boolean, q> p;

        /* compiled from: RenewContentInteractor.kt */
        /* renamed from: com.amazon.aps.iva.nw.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0546a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0546a(com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar) {
                super(1);
                this.h = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                Throwable th2 = th;
                if (th2 != null) {
                    this.h.invoke(th2);
                }
                return q.a;
            }
        }

        /* compiled from: RenewContentInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.renew.RenewContentInteractorImpl$renewContentIds$2$contentRenewJob$1", f = "RenewContentInteractor.kt", l = {71, 72, 94}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.k<? extends List<? extends com.amazon.aps.iva.kb0.k<? extends q>>>>, Object> {
            public Object h;
            public com.amazon.aps.iva.kb0.a i;
            public Object j;
            public g0 k;
            public int l;
            public /* synthetic */ Object m;
            public final /* synthetic */ c n;
            public final /* synthetic */ List<String> o;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> p;
            public final /* synthetic */ p<String, Boolean, q> q;

            /* compiled from: RenewContentInteractor.kt */
            /* renamed from: com.amazon.aps.iva.nw.c$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0547a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
                public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> h;
                public final /* synthetic */ p<String, Boolean, q> i;
                public final /* synthetic */ Panel j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0547a(com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar, p<? super String, ? super Boolean, q> pVar, Panel panel) {
                    super(1);
                    this.h = lVar;
                    this.i = pVar;
                    this.j = panel;
                }

                @Override // com.amazon.aps.iva.xb0.l
                public final q invoke(Throwable th) {
                    Throwable th2 = th;
                    if (th2 != null) {
                        this.h.invoke(th2);
                    } else {
                        Panel panel = this.j;
                        this.i.invoke(panel.getId(), Boolean.valueOf(panel.isAvailableOffline()));
                    }
                    return q.a;
                }
            }

            /* compiled from: RenewContentInteractor.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.renew.RenewContentInteractorImpl$renewContentIds$2$contentRenewJob$1$1$1$licenseRenewJob$1", f = "RenewContentInteractor.kt", l = {79, 80}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.nw.c$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0548b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.k<? extends q>>, Object> {
                public c h;
                public int i;
                public /* synthetic */ Object j;
                public final /* synthetic */ Panel k;
                public final /* synthetic */ c l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0548b(Panel panel, c cVar, com.amazon.aps.iva.ob0.d<? super C0548b> dVar) {
                    super(2, dVar);
                    this.k = panel;
                    this.l = cVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    C0548b c0548b = new C0548b(this.k, this.l, dVar);
                    c0548b.j = obj;
                    return c0548b;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.k<? extends q>> dVar) {
                    return ((C0548b) create(g0Var, dVar)).invokeSuspend(q.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
                @Override // com.amazon.aps.iva.qb0.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                        int r1 = r6.i
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L5b
                        goto L5d
                    L10:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L18:
                        com.amazon.aps.iva.nw.c r1 = r6.h
                        java.lang.Object r3 = r6.j
                        com.ellation.crunchyroll.model.Panel r3 = (com.ellation.crunchyroll.model.Panel) r3
                        com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L5b
                        goto L47
                    L22:
                        com.amazon.aps.iva.ab.x.i0(r7)
                        java.lang.Object r7 = r6.j
                        com.amazon.aps.iva.se0.g0 r7 = (com.amazon.aps.iva.se0.g0) r7
                        com.ellation.crunchyroll.model.Panel r7 = r6.k
                        com.amazon.aps.iva.nw.c r1 = r6.l
                        boolean r4 = r7.isAvailableOffline()     // Catch: java.lang.Throwable -> L5b
                        if (r4 == 0) goto L5d
                        com.amazon.aps.iva.xb0.p<java.lang.String, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r4 = r1.f     // Catch: java.lang.Throwable -> L5b
                        java.lang.String r5 = r7.getId()     // Catch: java.lang.Throwable -> L5b
                        r6.j = r7     // Catch: java.lang.Throwable -> L5b
                        r6.h = r1     // Catch: java.lang.Throwable -> L5b
                        r6.i = r3     // Catch: java.lang.Throwable -> L5b
                        java.lang.Object r3 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L5b
                        if (r3 != r0) goto L46
                        return r0
                    L46:
                        r3 = r7
                    L47:
                        com.amazon.aps.iva.ew.d r7 = r1.c     // Catch: java.lang.Throwable -> L5b
                        java.lang.String r1 = r3.getId()     // Catch: java.lang.Throwable -> L5b
                        r3 = 0
                        r6.j = r3     // Catch: java.lang.Throwable -> L5b
                        r6.h = r3     // Catch: java.lang.Throwable -> L5b
                        r6.i = r2     // Catch: java.lang.Throwable -> L5b
                        java.lang.Object r7 = r7.P1(r1, r6)     // Catch: java.lang.Throwable -> L5b
                        if (r7 != r0) goto L5d
                        return r0
                    L5b:
                        r7 = move-exception
                        goto L60
                    L5d:
                        com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L5b
                        goto L64
                    L60:
                        com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
                    L64:
                        com.amazon.aps.iva.kb0.k r0 = new com.amazon.aps.iva.kb0.k
                        r0.<init>(r7)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nw.c.a.b.C0548b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, List list, com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.l lVar, p pVar) {
                super(2, dVar);
                this.n = cVar;
                this.o = list;
                this.p = lVar;
                this.q = pVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                b bVar = new b(this.n, this.o, dVar, this.p, this.q);
                bVar.m = obj;
                return bVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.k<? extends List<? extends com.amazon.aps.iva.kb0.k<? extends q>>>> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x00ed, LOOP:0: B:26:0x00b2->B:28:0x00b8, LOOP_END, TryCatch #0 {all -> 0x00ed, blocks: (B:7:0x0012, B:32:0x00ea, B:12:0x0031, B:25:0x009d, B:26:0x00b2, B:28:0x00b8, B:29:0x00d9, B:15:0x004c, B:22:0x0078, B:18:0x005f), top: B:38:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[RETURN] */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nw.c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, List list, com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.l lVar, p pVar) {
            super(2, dVar);
            this.m = list;
            this.n = cVar;
            this.o = lVar;
            this.p = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.n, this.m, dVar, this.o, this.p);
            aVar.l = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            m0<? extends com.amazon.aps.iva.kb0.k<? extends Object>> b2;
            Iterator it;
            c cVar;
            com.amazon.aps.iva.xb0.l<Throwable, q> lVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.k;
            if (i != 0) {
                if (i == 1) {
                    it = this.j;
                    lVar = this.i;
                    cVar = this.h;
                    b2 = (m0) this.l;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                b2 = com.amazon.aps.iva.se0.i.b((g0) this.l, null, null, new b(this.n, this.m, null, this.o, this.p), 3);
                it = this.m.iterator();
                cVar = this.n;
                lVar = this.o;
            }
            while (it.hasNext()) {
                cVar.e.c((String) it.next(), b2, new C0546a(lVar));
                this.l = b2;
                this.h = cVar;
                this.i = lVar;
                this.j = it;
                this.k = 1;
                if (b2.K(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public c(EtpContentService etpContentService, com.amazon.aps.iva.ew.e eVar, com.amazon.aps.iva.zv.a aVar, e eVar2, b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        com.amazon.aps.iva.yb0.j.f(aVar, "benefitsProvider");
        this.b = etpContentService;
        this.c = eVar;
        this.d = aVar;
        this.e = eVar2;
        this.f = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.amazon.aps.iva.nw.c r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.amazon.aps.iva.nw.d
            if (r0 == 0) goto L16
            r0 = r5
            com.amazon.aps.iva.nw.d r0 = (com.amazon.aps.iva.nw.d) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.nw.d r0 = new com.amazon.aps.iva.nw.d
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.j = r3
            com.amazon.aps.iva.zv.a r4 = r4.d
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L40
            goto L4a
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L4b
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L4a:
            return r1
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Offline Viewing benefit not found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nw.c.C(com.amazon.aps.iva.nw.c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.amazon.aps.iva.xb0.l] */
    @Override // com.amazon.aps.iva.nw.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(com.amazon.aps.iva.ob0.d r8, com.ellation.crunchyroll.downloading.DownloadsManagerImpl.t.a r9, com.ellation.crunchyroll.downloading.DownloadsManagerImpl.t.b r10, com.ellation.crunchyroll.downloading.DownloadsManagerImpl.t.c r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.nw.b
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.nw.b r0 = (com.amazon.aps.iva.nw.b) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.nw.b r0 = new com.amazon.aps.iva.nw.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L86
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.amazon.aps.iva.xb0.p r11 = r0.k
            com.amazon.aps.iva.xb0.l r10 = r0.j
            com.amazon.aps.iva.xb0.l r9 = r0.i
            com.amazon.aps.iva.nw.c r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L55
        L3e:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r7
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.n = r4
            com.amazon.aps.iva.ew.d r8 = r7.c
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r7
        L55:
            java.util.List r8 = (java.util.List) r8
            r5 = r8
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r6 = r5.isEmpty()
            r4 = r4 ^ r6
            if (r4 == 0) goto L89
            r9.invoke(r8)
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r5.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r9 = 0
            r0.h = r9
            r0.i = r9
            r0.j = r9
            r0.k = r9
            r0.n = r3
            java.lang.Object r8 = r2.y0(r11, r10, r8, r0)
            if (r8 != r1) goto L86
            return r1
        L86:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        L89:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nw.c.D(com.amazon.aps.iva.ob0.d, com.ellation.crunchyroll.downloading.DownloadsManagerImpl$t$a, com.ellation.crunchyroll.downloading.DownloadsManagerImpl$t$b, com.ellation.crunchyroll.downloading.DownloadsManagerImpl$t$c):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.nw.a
    public final void a() {
        this.e.a();
    }

    @Override // com.amazon.aps.iva.nw.a
    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.e.b(str);
    }

    @Override // com.amazon.aps.iva.nw.a
    public final Object h0(String str, DownloadsManagerImpl.u.a aVar, DownloadsManagerImpl.u.b bVar, com.amazon.aps.iva.ob0.d dVar) {
        Object y0 = y0(aVar, bVar, new String[]{str}, dVar);
        if (y0 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return y0;
        }
        return q.a;
    }

    public final Object y0(p<? super String, ? super Boolean, q> pVar, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar, String[] strArr, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!this.e.d(str)) {
                arrayList.add(str);
            }
        }
        Object p = z.p(new a(this, arrayList, null, lVar, pVar), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return q.a;
    }
}
