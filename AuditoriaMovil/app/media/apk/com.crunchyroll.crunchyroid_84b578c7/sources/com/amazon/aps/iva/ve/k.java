package com.amazon.aps.iva.ve;

import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.google.ads.AdSize;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: UserBillingStatusInteractor.kt */
/* loaded from: classes.dex */
public final class k implements j {
    public final SubscriptionProcessorService a;
    public final com.amazon.aps.iva.ve.a b;
    public final com.amazon.aps.iva.me.j c;
    public final com.amazon.aps.iva.ve.b d;
    public final e e;
    public final com.amazon.aps.iva.t50.c f;

    /* compiled from: UserBillingStatusInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.billingnotifications.status.UserBillingStatusInteractorImpl", f = "UserBillingStatusInteractor.kt", l = {BaseNCodec.MIME_CHUNK_SIZE}, m = "fetchAndSaveBillingStatus")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public k h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return k.this.b(this);
        }
    }

    /* compiled from: UserBillingStatusInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.billingnotifications.status.UserBillingStatusInteractorImpl", f = "UserBillingStatusInteractor.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "fetchAndStoreBillingStatus")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public k h;
        public boolean i;
        public boolean j;
        public boolean k;
        public /* synthetic */ Object l;
        public int n;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(SubscriptionProcessorService subscriptionProcessorService, com.amazon.aps.iva.ve.a aVar, com.amazon.aps.iva.me.j jVar, c cVar, d dVar, com.amazon.aps.iva.t50.c cVar2) {
        this.a = subscriptionProcessorService;
        this.b = aVar;
        this.c = jVar;
        this.d = cVar;
        this.e = dVar;
        this.f = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    @Override // com.amazon.aps.iva.ve.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r21) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve.k.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:12:0x0026, B:21:0x0048, B:23:0x005a, B:25:0x0060, B:27:0x0067, B:29:0x006d, B:30:0x0072, B:32:0x0076, B:34:0x007c, B:38:0x0084, B:42:0x008c, B:44:0x0091, B:48:0x009a, B:50:0x009f, B:54:0x00a8, B:56:0x00ad, B:60:0x00b5, B:17:0x003a), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionThirdPartyProductWrapper> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.ve.k.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.ve.k$a r0 = (com.amazon.aps.iva.ve.k.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve.k$a r0 = new com.amazon.aps.iva.ve.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.amazon.aps.iva.ve.k r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> Lb9
            goto L48
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.ve.a r7 = r6.b
            r7.k()
            com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService r7 = r6.a     // Catch: java.io.IOException -> Lb9
            r0.h = r6     // Catch: java.io.IOException -> Lb9
            r0.k = r4     // Catch: java.io.IOException -> Lb9
            java.lang.Object r7 = r7.getUserThirdPartySubscription(r0)     // Catch: java.io.IOException -> Lb9
            if (r7 != r1) goto L47
            return r1
        L47:
            r0 = r6
        L48:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r7 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r7     // Catch: java.io.IOException -> Lb9
            java.util.List r7 = r7.getItems()     // Catch: java.io.IOException -> Lb9
            java.util.List r7 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductKt.getOrderedThirdPartySubscriptions(r7)     // Catch: java.io.IOException -> Lb9
            java.lang.Object r7 = com.amazon.aps.iva.lb0.x.v0(r7)     // Catch: java.io.IOException -> Lb9
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionThirdPartyProductWrapper r7 = (com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionThirdPartyProductWrapper) r7     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto L65
            java.util.Date r1 = r7.getInGraceExpirationDate()     // Catch: java.io.IOException -> Lb9
            if (r1 == 0) goto L65
            com.amazon.aps.iva.ve.e r2 = r0.e     // Catch: java.io.IOException -> Lb9
            r2.U6(r1)     // Catch: java.io.IOException -> Lb9
        L65:
            if (r7 == 0) goto L72
            java.util.Date r1 = r7.getExpirationDate()     // Catch: java.io.IOException -> Lb9
            if (r1 == 0) goto L72
            com.amazon.aps.iva.ve.e r2 = r0.e     // Catch: java.io.IOException -> Lb9
            r2.B2(r1)     // Catch: java.io.IOException -> Lb9
        L72:
            com.amazon.aps.iva.ve.e r0 = r0.e     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto L7b
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r1 = r7.getSource()     // Catch: java.io.IOException -> Lb9
            goto L7c
        L7b:
            r1 = r3
        L7c:
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r2 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource.GOOGLE_PLAY     // Catch: java.io.IOException -> Lb9
            r5 = 0
            if (r1 != r2) goto L83
            r1 = r4
            goto L84
        L83:
            r1 = r5
        L84:
            r0.k5(r1)     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto L8b
            r1 = r4
            goto L8c
        L8b:
            r1 = r5
        L8c:
            r0.f1(r1)     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto L99
            boolean r1 = r7.isInGrace()     // Catch: java.io.IOException -> Lb9
            if (r1 == 0) goto L99
            r1 = r4
            goto L9a
        L99:
            r1 = r5
        L9a:
            r0.B3(r1)     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto La7
            boolean r1 = r7.isOnHold()     // Catch: java.io.IOException -> Lb9
            if (r1 == 0) goto La7
            r1 = r4
            goto La8
        La7:
            r1 = r5
        La8:
            r0.H7(r1)     // Catch: java.io.IOException -> Lb9
            if (r7 == 0) goto Lb5
            boolean r1 = r7.isAutoRenewable()     // Catch: java.io.IOException -> Lb9
            if (r1 == 0) goto Lb4
            goto Lb5
        Lb4:
            r4 = r5
        Lb5:
            r0.s6(r4)     // Catch: java.io.IOException -> Lb9
            return r7
        Lb9:
            r7 = move-exception
            com.amazon.aps.iva.mf0.a$a r0 = com.amazon.aps.iva.mf0.a.a
            java.lang.String r1 = "Error getting user subscription status"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r0.c(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve.k.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
