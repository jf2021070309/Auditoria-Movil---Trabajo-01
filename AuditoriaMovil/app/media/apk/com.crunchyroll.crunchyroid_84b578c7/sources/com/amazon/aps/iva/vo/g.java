package com.amazon.aps.iva.vo;
/* compiled from: WatchScreenMoviesInteractor.kt */
/* loaded from: classes2.dex */
public final class g implements e {
    public final com.amazon.aps.iva.bp.b b;

    /* compiled from: WatchScreenMoviesInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.interactor.WatchScreenMoviesInteractor", f = "WatchScreenMoviesInteractor.kt", l = {9, 10}, m = "loadAssetsList")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public Object h;
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
            return g.this.d(null, this);
        }
    }

    public g(com.amazon.aps.iva.bp.b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // com.amazon.aps.iva.vo.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.vo.c> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.vo.g.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.vo.g$a r0 = (com.amazon.aps.iva.vo.g.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.vo.g$a r0 = new com.amazon.aps.iva.vo.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.h
            java.lang.String r6 = (java.lang.String) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r6 = r0.i
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.vo.g r2 = (com.amazon.aps.iva.vo.g) r2
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L53
        L40:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.bp.b r7 = r5.b
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            com.ellation.crunchyroll.model.ContentContainer r7 = (com.ellation.crunchyroll.model.ContentContainer) r7
            com.amazon.aps.iva.bp.b r2 = r2.b
            r0.h = r6
            r4 = 0
            r0.i = r4
            r0.l = r3
            java.lang.Object r7 = r2.g(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            com.amazon.aps.iva.vo.c r7 = (com.amazon.aps.iva.vo.c) r7
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r0 = r7.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.ellation.crunchyroll.model.PlayableAsset r3 = (com.ellation.crunchyroll.model.PlayableAsset) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r3, r6)
            if (r3 != 0) goto L74
            r1.add(r2)
            goto L74
        L8f:
            com.amazon.aps.iva.vo.c r6 = com.amazon.aps.iva.vo.c.a(r7, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vo.g.d(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
