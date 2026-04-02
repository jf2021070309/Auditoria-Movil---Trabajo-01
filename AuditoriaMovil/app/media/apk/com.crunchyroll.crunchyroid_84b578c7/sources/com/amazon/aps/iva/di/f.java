package com.amazon.aps.iva.di;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: FeaturedMusicInteractor.kt */
/* loaded from: classes.dex */
public final class f implements e {
    public final EtpContentService a;

    /* compiled from: FeaturedMusicInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.featuredmusic.FeaturedMusicInteractorImpl", f = "FeaturedMusicInteractor.kt", l = {22}, m = "getFeaturedMusicData")
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
            return f.this.a(null, this);
        }
    }

    public f(EtpContentService etpContentService) {
        this.a = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.amazon.aps.iva.di.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.model.music.MusicVideo>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.di.f.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.di.f$a r0 = (com.amazon.aps.iva.di.f.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.di.f$a r0 = new com.amazon.aps.iva.di.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.a     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            r0.j = r3     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            java.lang.Object r6 = r6.getFeaturedMusicVideos(r5, r0)     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            java.util.List r5 = r6.getData()     // Catch: com.ellation.crunchyroll.api.etp.error.NotFoundException -> L44
            goto L46
        L44:
            com.amazon.aps.iva.lb0.z r5 = com.amazon.aps.iva.lb0.z.b
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.di.f.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
