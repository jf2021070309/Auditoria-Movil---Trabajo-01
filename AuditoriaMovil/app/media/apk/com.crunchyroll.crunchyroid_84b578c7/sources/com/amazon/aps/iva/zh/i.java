package com.amazon.aps.iva.zh;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: ArtistInteractor.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.wy.a implements h {
    public final EtpContentService b;
    public final com.amazon.aps.iva.l50.a c;

    /* compiled from: ArtistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistInteractorImpl", f = "ArtistInteractor.kt", l = {31}, m = "loadArtistInfo")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public i h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return i.this.b0(this);
        }
    }

    /* compiled from: ArtistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistInteractorImpl", f = "ArtistInteractor.kt", l = {40}, m = "loadConcerts")
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
            return i.this.a0(this);
        }
    }

    /* compiled from: ArtistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistInteractorImpl", f = "ArtistInteractor.kt", l = {36}, m = "loadMusicVideos")
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
            return i.this.S0(this);
        }
    }

    public i(EtpContentService etpContentService, com.amazon.aps.iva.l50.a aVar) {
        this.b = etpContentService;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.zh.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.model.music.MusicVideo>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.zh.i.c
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.zh.i$c r0 = (com.amazon.aps.iva.zh.i.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.zh.i$c r0 = new com.amazon.aps.iva.zh.i$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.l50.a r5 = r4.c
            java.lang.String r5 = r5.b
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r4.b
            java.lang.Object r5 = r2.getArtistMusicVideos(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r5
            java.util.List r5 = r5.getData()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zh.i.S0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.zh.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.model.music.MusicConcert>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.zh.i.b
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.zh.i$b r0 = (com.amazon.aps.iva.zh.i.b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.zh.i$b r0 = new com.amazon.aps.iva.zh.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.l50.a r5 = r4.c
            java.lang.String r5 = r5.b
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r4.b
            java.lang.Object r5 = r2.getArtistMusicConcerts(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r5
            java.util.List r5 = r5.getData()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zh.i.a0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.amazon.aps.iva.zh.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.music.Artist> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.zh.i.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.zh.i$a r0 = (com.amazon.aps.iva.zh.i.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.zh.i$a r0 = new com.amazon.aps.iva.zh.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.zh.i r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.l50.a r5 = r4.c
            java.lang.String r5 = r5.b
            r0.h = r4
            r0.k = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r4.b
            java.lang.Object r5 = r2.getArtists(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r5
            java.util.List r5 = r5.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.v0(r5)
            com.ellation.crunchyroll.model.music.Artist r5 = (com.ellation.crunchyroll.model.music.Artist) r5
            if (r5 == 0) goto L55
            return r5
        L55:
            java.io.IOException r5 = new java.io.IOException
            com.amazon.aps.iva.l50.a r0 = r0.c
            java.lang.String r0 = r0.b
            java.lang.String r1 = "No artist returned for "
            java.lang.String r0 = com.amazon.aps.iva.oa.a.a(r1, r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zh.i.b0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
