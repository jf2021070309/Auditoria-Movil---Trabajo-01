package com.amazon.aps.iva.vo;
/* compiled from: OfflineWatchScreenEpisodesInteractor.kt */
/* loaded from: classes2.dex */
public final class a implements e {
    public final com.amazon.aps.iva.bp.b b;
    public final com.amazon.aps.iva.lo.f c;

    /* compiled from: OfflineWatchScreenEpisodesInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.interactor.OfflineWatchScreenEpisodesInteractor", f = "OfflineWatchScreenEpisodesInteractor.kt", l = {11, 12}, m = "loadAssetsList")
    /* renamed from: com.amazon.aps.iva.vo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0806a extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public C0806a(com.amazon.aps.iva.ob0.d<? super C0806a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    public a(com.amazon.aps.iva.bp.b bVar, com.amazon.aps.iva.lo.f fVar) {
        this.b = bVar;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.amazon.aps.iva.vo.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.vo.c> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.vo.a.C0806a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.vo.a$a r0 = (com.amazon.aps.iva.vo.a.C0806a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vo.a$a r0 = new com.amazon.aps.iva.vo.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            com.amazon.aps.iva.lb0.a0 r3 = com.amazon.aps.iva.lb0.a0.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.h
            com.ellation.crunchyroll.model.PlayableAsset r8 = (com.ellation.crunchyroll.model.PlayableAsset) r8
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L6d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.h
            com.amazon.aps.iva.vo.a r8 = (com.amazon.aps.iva.vo.a) r8
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L51
        L40:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r7
            r0.k = r5
            com.amazon.aps.iva.lo.f r9 = r7.c
            java.lang.Object r9 = r9.c(r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r8 = r7
        L51:
            com.ellation.crunchyroll.model.PlayableAsset r9 = (com.ellation.crunchyroll.model.PlayableAsset) r9
            if (r9 == 0) goto L72
            com.amazon.aps.iva.bp.b r8 = r8.b
            java.lang.String r2 = r9.getId()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r0.h = r9
            r0.k = r4
            java.lang.Object r8 = r8.o(r2, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r6 = r9
            r9 = r8
            r8 = r6
        L6d:
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L74
            r9 = r8
        L72:
            r8 = r9
            r9 = r3
        L74:
            com.amazon.aps.iva.vo.c r0 = new com.amazon.aps.iva.vo.c
            java.util.List r8 = com.amazon.aps.iva.ee0.f1.L(r8)
            r0.<init>(r8, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vo.a.d(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
