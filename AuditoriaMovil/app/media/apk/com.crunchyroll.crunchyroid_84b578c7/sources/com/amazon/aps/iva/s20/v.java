package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.se0.g0;
/* compiled from: UpgradeViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeViewModelImpl$loadActiveSubscription$1", f = "UpgradeViewModel.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, com.amazon.aps.iva.ob0.d<? super v> dVar) {
        super(2, dVar);
        this.i = zVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new v(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((v) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.h
            r2 = 1
            com.amazon.aps.iva.s20.z r3 = r8.i
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L2b
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.ct.j r9 = r3.d
            boolean r9 = r9.getHasPremiumBenefit()
            if (r9 == 0) goto L99
            r8.h = r2
            java.lang.Object r9 = com.amazon.aps.iva.s20.z.N8(r3, r8)
            if (r9 != r0) goto L2b
            return r0
        L2b:
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper r9 = (com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper) r9
            r3.getClass()
            r0 = 0
            if (r9 == 0) goto L38
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r1 = r9.getSource()
            goto L39
        L38:
            r1 = r0
        L39:
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r4 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource.GOOGLE_PLAY
            if (r1 != r4) goto L93
            java.lang.String r1 = r3.e
            r4 = 0
            if (r1 == 0) goto L58
            if (r9 == 0) goto L4f
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct r5 = r9.getProduct()
            if (r5 == 0) goto L4f
            java.lang.String r5 = r5.getSku()
            goto L50
        L4f:
            r5 = r0
        L50:
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r5, r1)
            if (r1 == 0) goto L58
            r1 = r2
            goto L59
        L58:
            r1 = r4
        L59:
            if (r9 == 0) goto L60
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct r5 = r9.getProduct()
            goto L61
        L60:
            r5 = r0
        L61:
            if (r5 == 0) goto L7d
            java.lang.String r6 = r5.getSku()
            java.lang.String r7 = "crunchyroll.google.premium.monthly"
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r7)
            if (r6 != 0) goto L7d
            java.lang.String r5 = r5.getSku()
            java.lang.String r6 = "crunchyroll.google.fanpack.monthly"
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r6)
            if (r5 == 0) goto L7c
            goto L7d
        L7c:
            r2 = r4
        L7d:
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L8d
            com.amazon.aps.iva.i5.v<com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct> r1 = r3.i
            if (r9 == 0) goto L89
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct r0 = r9.getProduct()
        L89:
            r1.k(r0)
            goto L99
        L8d:
            com.amazon.aps.iva.d30.b r9 = new com.amazon.aps.iva.d30.b
            r9.<init>()
            throw r9
        L93:
            com.amazon.aps.iva.d30.c r9 = new com.amazon.aps.iva.d30.c
            r9.<init>()
            throw r9
        L99:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s20.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
