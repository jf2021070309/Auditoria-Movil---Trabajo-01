package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.b50.f0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: EtpWatchlistInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.i implements com.amazon.aps.iva.h50.a {
    public final EtpContentService b;
    public final com.amazon.aps.iva.b60.m c;
    public final com.ellation.crunchyroll.watchlist.a d;

    /* compiled from: EtpWatchlistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.EtpWatchlistInteractorImpl", f = "EtpWatchlistInteractor.kt", l = {60}, m = "addToWatchlist")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.l(null, this);
        }
    }

    /* compiled from: EtpWatchlistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.EtpWatchlistInteractorImpl", f = "EtpWatchlistInteractor.kt", l = {69}, m = "removeFromWatchlist")
    /* renamed from: com.amazon.aps.iva.h50.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0325b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public C0325b(com.amazon.aps.iva.ob0.d<? super C0325b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.s(null, this);
        }
    }

    public b(EtpContentService etpContentService, com.amazon.aps.iva.b60.n nVar, com.ellation.crunchyroll.watchlist.a aVar) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        com.amazon.aps.iva.yb0.j.f(nVar, "watchlistItemAnalytics");
        this.b = etpContentService;
        this.c = nVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // com.amazon.aps.iva.h50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.h50.b.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.h50.b$a r0 = (com.amazon.aps.iva.h50.b.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.h50.b$a r0 = new com.amazon.aps.iva.h50.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.h50.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.content.model.WatchlistItemBody r6 = new com.ellation.crunchyroll.api.etp.content.model.WatchlistItemBody
            r6.<init>(r5)
            r0.h = r4
            r0.i = r5
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r4.b
            java.lang.Object r6 = r2.addWatchlistItem(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            com.amazon.aps.iva.jf0.a0 r6 = (com.amazon.aps.iva.jf0.a0) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L5f
            com.ellation.crunchyroll.watchlist.a r6 = r0.d
            com.amazon.aps.iva.b60.j r0 = new com.amazon.aps.iva.b60.j
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r1 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST
            r0.<init>(r5, r1)
            r6.b(r0)
        L5f:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h50.b.l(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.h50.a
    public final void p1(Panel panel, boolean z, com.amazon.aps.iva.d50.a aVar, com.amazon.aps.iva.d50.b bVar) {
        com.amazon.aps.iva.yb0.j.f(panel, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.se0.i.d(this, null, null, new f(bVar, this, panel, z, aVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.amazon.aps.iva.h50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.h50.b.C0325b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.h50.b$b r0 = (com.amazon.aps.iva.h50.b.C0325b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.h50.b$b r0 = new com.amazon.aps.iva.h50.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.h50.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.i = r5
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.deleteWatchlistItem(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.amazon.aps.iva.jf0.a0 r6 = (com.amazon.aps.iva.jf0.a0) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L5a
            com.ellation.crunchyroll.watchlist.a r6 = r0.d
            com.amazon.aps.iva.b60.j r0 = new com.amazon.aps.iva.b60.j
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r1 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.NOT_IN_WATCHLIST
            r0.<init>(r5, r1)
            r6.b(r0)
        L5a:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h50.b.s(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:18:0x0056->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // com.amazon.aps.iva.h50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum t1(java.lang.String r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.h50.c
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.h50.c r0 = (com.amazon.aps.iva.h50.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.h50.c r0 = new com.amazon.aps.iva.h50.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.k = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.getWatchlistItems(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r6 = r6.getData()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = com.amazon.aps.iva.lb0.r.Y(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L56:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            com.ellation.crunchyroll.api.etp.content.model.WatchlistItem r1 = (com.ellation.crunchyroll.api.etp.content.model.WatchlistItem) r1
            java.lang.String r1 = r1.getId()
            r0.add(r1)
            goto L56
        L6a:
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L73
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r5 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST
            goto L75
        L73:
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r5 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.NOT_IN_WATCHLIST
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h50.b.t1(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Enum");
    }

    @Override // com.amazon.aps.iva.h50.a
    public final void y1(String str, f0.c cVar, f0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        launchCatching(this, new d(this, str, null), new e(cVar, this, str), dVar);
    }
}
