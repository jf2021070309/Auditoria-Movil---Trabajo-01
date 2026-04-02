package com.amazon.aps.iva.lo;

import com.amazon.aps.iva.wy.i;
/* compiled from: WatchScreenNextAssetInteractor.kt */
/* loaded from: classes2.dex */
public final class a extends i implements f {
    public final String b;
    public final com.amazon.aps.iva.ug.a c;

    /* compiled from: WatchScreenNextAssetInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.OfflineWatchScreenNextAssetInteractorImpl", f = "WatchScreenNextAssetInteractor.kt", l = {57}, m = "getNextAsset")
    /* renamed from: com.amazon.aps.iva.lo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0491a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public /* synthetic */ Object i;
        public int k;

        public C0491a(com.amazon.aps.iva.ob0.d<? super C0491a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    public a(String str, com.amazon.aps.iva.ug.a aVar) {
        this.b = str;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.lo.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.PlayableAsset> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.lo.a.C0491a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.lo.a$a r0 = (com.amazon.aps.iva.lo.a.C0491a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.lo.a$a r0 = new com.amazon.aps.iva.lo.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.ug.a r6 = r4.c
            java.lang.String r2 = r4.b
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r0 = r6.iterator()
            r1 = 0
        L4a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            com.ellation.crunchyroll.model.PlayableAsset r2 = (com.ellation.crunchyroll.model.PlayableAsset) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r5)
            if (r2 == 0) goto L61
            goto L65
        L61:
            int r1 = r1 + 1
            goto L4a
        L64:
            r1 = -1
        L65:
            int r1 = r1 + r3
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.w0(r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lo.a.c(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
