package com.amazon.aps.iva.r10;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.ArrayList;
/* compiled from: HistoryInteractor.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.wy.a implements u {
    public final EtpContentService b;
    public final ArrayList c;

    /* compiled from: HistoryInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.HistoryInteractorImpl", f = "HistoryInteractor.kt", l = {40, 40}, m = "loadNextPage")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public v h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v.this.A0(0, this);
        }
    }

    /* compiled from: HistoryInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.HistoryInteractorImpl", f = "HistoryInteractor.kt", l = {46, 46}, m = "loadNextPage")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public v h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v.this.f0(null, this);
        }
    }

    public v(EtpContentService etpContentService) {
        this.b = etpContentService;
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new m(0));
        }
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0056, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.amazon.aps.iva.r10.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(int r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.content.ContentApiResponse<com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel, com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.r10.v.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.r10.v$a r0 = (com.amazon.aps.iva.r10.v.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.r10.v$a r0 = new com.amazon.aps.iva.r10.v$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.r10.v r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L49
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            com.ellation.crunchyroll.api.etp.content.EtpContentService r7 = r5.b
            java.lang.Object r7 = r7.getWatchHistory(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r7 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r7
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r6.b
            r2 = 0
            r0.h = r2
            r0.k = r3
            java.lang.Object r7 = com.amazon.aps.iva.e4.l1.s(r7, r6, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r10.v.A0(int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.r10.u
    public final Object Y0(ArrayList arrayList, com.amazon.aps.iva.ob0.d dVar) {
        Object deleteHistoryItems = this.b.deleteHistoryItems(com.amazon.aps.iva.lb0.x.B0(arrayList, ",", null, null, null, 62), dVar);
        if (deleteHistoryItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteHistoryItems;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.r10.u
    public final Object deleteHistory(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object deleteHistory = this.b.deleteHistory(dVar);
        if (deleteHistory == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteHistory;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0056, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.amazon.aps.iva.r10.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.content.ContentApiResponse<com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel, com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.r10.v.b
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.r10.v$b r0 = (com.amazon.aps.iva.r10.v.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.r10.v$b r0 = new com.amazon.aps.iva.r10.v$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.r10.v r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L49
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            com.ellation.crunchyroll.api.etp.content.EtpContentService r7 = r5.b
            java.lang.Object r7 = r7.getWatchHistory(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r7 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r7
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r6.b
            r2 = 0
            r0.h = r2
            r0.k = r3
            java.lang.Object r7 = com.amazon.aps.iva.e4.l1.s(r7, r6, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r10.v.f0(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.r10.u
    public final ArrayList j() {
        return this.c;
    }
}
