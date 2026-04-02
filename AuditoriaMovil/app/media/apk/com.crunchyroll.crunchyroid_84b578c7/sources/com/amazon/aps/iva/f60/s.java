package com.amazon.aps.iva.f60;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: WatchlistItemToggleInteractor.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.wy.i implements r {
    public final EtpContentService b;
    public final com.ellation.crunchyroll.watchlist.a c;

    /* compiled from: WatchlistItemToggleInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.watchlisttoggle.WatchlistItemToggleInteractorImpl", f = "WatchlistItemToggleInteractor.kt", l = {32}, m = "addToWatchlist")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public s h;
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
            return s.this.l(null, this);
        }
    }

    /* compiled from: WatchlistItemToggleInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.watchlisttoggle.WatchlistItemToggleInteractorImpl", f = "WatchlistItemToggleInteractor.kt", l = {41}, m = "removeFromWatchlist")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public s h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return s.this.s(null, this);
        }
    }

    public s(EtpContentService etpContentService, com.ellation.crunchyroll.watchlist.a aVar) {
        this.b = etpContentService;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // com.amazon.aps.iva.f60.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.f60.s.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.f60.s$a r0 = (com.amazon.aps.iva.f60.s.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.f60.s$a r0 = new com.amazon.aps.iva.f60.s$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.f60.s r0 = r0.h
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
            com.ellation.crunchyroll.watchlist.a r6 = r0.c
            com.amazon.aps.iva.b60.j r0 = new com.amazon.aps.iva.b60.j
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r1 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST
            r0.<init>(r5, r1)
            r6.b(r0)
        L5f:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f60.s.l(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.amazon.aps.iva.f60.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.f60.s.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.f60.s$b r0 = (com.amazon.aps.iva.f60.s.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.f60.s$b r0 = new com.amazon.aps.iva.f60.s$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.f60.s r0 = r0.h
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
            com.ellation.crunchyroll.watchlist.a r6 = r0.c
            com.amazon.aps.iva.b60.j r0 = new com.amazon.aps.iva.b60.j
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r1 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.NOT_IN_WATCHLIST
            r0.<init>(r5, r1)
            r6.b(r0)
        L5a:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f60.s.s(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
