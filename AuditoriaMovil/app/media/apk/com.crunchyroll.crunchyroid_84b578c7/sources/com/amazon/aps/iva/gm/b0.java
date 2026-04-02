package com.amazon.aps.iva.gm;

import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
/* compiled from: AssetsInteractor.kt */
/* loaded from: classes2.dex */
public final class b0 implements a0 {
    public final DigitalAssetManagementService b;
    public final com.amazon.aps.iva.p60.f c;

    /* compiled from: AssetsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.assetselection.AssetsInteractorImpl", f = "AssetsInteractor.kt", l = {38}, m = "getAssets")
    /* loaded from: classes2.dex */
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
            return b0.this.c0(null, this);
        }
    }

    public b0(DigitalAssetManagementService digitalAssetManagementService, com.amazon.aps.iva.p60.g gVar) {
        this.b = digitalAssetManagementService;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.gm.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(com.ellation.crunchyroll.api.etp.assets.model.AssetType r5, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.etp.assets.model.AvatarCollection>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.gm.b0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.gm.b0$a r0 = (com.amazon.aps.iva.gm.b0.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.gm.b0$a r0 = new com.amazon.aps.iva.gm.b0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.p60.f r6 = r4.c
            java.util.Locale r6 = r6.a()
            java.lang.String r6 = r6.toLanguageTag()
            java.lang.String r2 = "localeProvider.locale.toLanguageTag()"
            com.amazon.aps.iva.yb0.j.e(r6, r2)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService r2 = r4.b
            java.lang.Object r6 = r2.getAvatars(r6, r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r6 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r6
            java.util.List r5 = r6.getItems()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gm.b0.c0(com.ellation.crunchyroll.api.etp.assets.model.AssetType, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }
}
