package com.amazon.aps.iva.cg;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
/* compiled from: DeepLinkDataInteractor.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.cg.f {
    public final EtpContentService b;
    public final SubscriptionProcessorService c;

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {47}, m = "getArtist")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.J(null, this);
        }
    }

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {55}, m = "getMusicConcert")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.w0(null, this);
        }
    }

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {51}, m = "getMusicVideo")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.T0(null, this);
        }
    }

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {39}, m = "getPanel")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.u0(null, this);
        }
    }

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {43}, m = "getSeason")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.getSeason(null, this);
        }
    }

    /* compiled from: DeepLinkDataInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataInteractorImpl", f = "DeepLinkDataInteractor.kt", l = {60}, m = "getUserSubscription")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return g.this.getUserSubscription(this);
        }
    }

    public g(EtpContentService etpContentService, SubscriptionProcessorService subscriptionProcessorService) {
        this.b = etpContentService;
        this.c = subscriptionProcessorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.music.Artist> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.cg.g.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.cg.g$a r0 = (com.amazon.aps.iva.cg.g.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$a r0 = new com.amazon.aps.iva.cg.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.getArtists(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r5 = r6.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.J(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.music.MusicVideo> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.cg.g.c
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.cg.g$c r0 = (com.amazon.aps.iva.cg.g.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$c r0 = new com.amazon.aps.iva.cg.g$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.getMusicVideos(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r5 = r6.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.T0(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSeason(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.cms.model.Season> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.cg.g.e
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.cg.g$e r0 = (com.amazon.aps.iva.cg.g.e) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$e r0 = new com.amazon.aps.iva.cg.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.getSeason(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r5 = r6.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.getSeason(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserSubscription(com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.cg.g.f
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.cg.g$f r0 = (com.amazon.aps.iva.cg.g.f) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$f r0 = new com.amazon.aps.iva.cg.g$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.io.IOException -> L63
            goto L3e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService r6 = r5.c     // Catch: java.io.IOException -> L63
            r0.j = r4     // Catch: java.io.IOException -> L63
            java.lang.Object r6 = r6.getUserSubscription(r0)     // Catch: java.io.IOException -> L63
            if (r6 != r1) goto L3e
            return r1
        L3e:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r6 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r6     // Catch: java.io.IOException -> L63
            java.util.List r6 = r6.getItems()     // Catch: java.io.IOException -> L63
            java.util.List r6 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductKt.getOrderedSubscriptions(r6)     // Catch: java.io.IOException -> L63
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper r1 = (com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper) r1
            boolean r1 = r1.isCancelled()
            r1 = r1 ^ r4
            if (r1 == 0) goto L4e
            r3 = r0
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.getUserSubscription(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(com.amazon.aps.iva.cg.a0 r8, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.Panel> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.cg.g.d
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.cg.g$d r0 = (com.amazon.aps.iva.cg.g.d) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$d r0 = new com.amazon.aps.iva.cg.g$d
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.h
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r4.j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L44
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r7.b
            java.lang.String r8 = r8.e
            r3 = 0
            r5 = 2
            r6 = 0
            r4.j = r2
            r2 = r8
            java.lang.Object r9 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getPanels$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L44
            return r0
        L44:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r9 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r9
            java.util.List r8 = r9.getData()
            java.lang.Object r8 = com.amazon.aps.iva.lb0.x.t0(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.u0(com.amazon.aps.iva.cg.a0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.cg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.music.MusicConcert> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.cg.g.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.cg.g$b r0 = (com.amazon.aps.iva.cg.g.b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.cg.g$b r0 = new com.amazon.aps.iva.cg.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b
            java.lang.Object r6 = r6.getMusicConcerts(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r5 = r6.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cg.g.w0(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
