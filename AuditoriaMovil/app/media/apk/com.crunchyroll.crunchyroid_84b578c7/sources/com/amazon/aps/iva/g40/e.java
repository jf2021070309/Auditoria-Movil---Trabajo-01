package com.amazon.aps.iva.g40;

import com.amazon.aps.iva.i5.s;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct;
import com.google.ads.AdSize;
/* compiled from: PremiumMembershipViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.membership.premium.viewmodel.PremiumMembershipViewModelImpl$membershipInfo$1", f = "PremiumMembershipViewModel.kt", l = {52, 53, AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<s<com.amazon.aps.iva.ez.g<? extends SubscriptionProduct>>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public s h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.k = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.k, dVar);
        eVar.j = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(s<com.amazon.aps.iva.ez.g<? extends SubscriptionProduct>> sVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(sVar, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0021, B:24:0x0058, B:26:0x0062, B:27:0x0067, B:28:0x0081, B:14:0x002b, B:21:0x0049, B:17:0x0039), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0021, B:24:0x0058, B:26:0x0062, B:27:0x0067, B:28:0x0081, B:14:0x002b, B:21:0x0049, B:17:0x0039), top: B:36:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.i5.s] */
    /* JADX WARN: Type inference failed for: r1v11 */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r7.i
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L98
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.j
            com.amazon.aps.iva.i5.s r1 = (com.amazon.aps.iva.i5.s) r1
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> L82
            goto L58
        L25:
            com.amazon.aps.iva.i5.s r1 = r7.h
            java.lang.Object r4 = r7.j
            com.amazon.aps.iva.g40.g r4 = (com.amazon.aps.iva.g40.g) r4
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> L82
            goto L49
        L2f:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.Object r8 = r7.j
            r1 = r8
            com.amazon.aps.iva.i5.s r1 = (com.amazon.aps.iva.i5.s) r1
            com.amazon.aps.iva.g40.g r8 = r7.k
            com.amazon.aps.iva.ve.l r6 = r8.c     // Catch: java.lang.Throwable -> L82
            r7.j = r8     // Catch: java.lang.Throwable -> L82
            r7.h = r1     // Catch: java.lang.Throwable -> L82
            r7.i = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r4 = r6.b(r7)     // Catch: java.lang.Throwable -> L82
            if (r4 != r0) goto L48
            return r0
        L48:
            r4 = r8
        L49:
            com.amazon.aps.iva.e40.g r8 = r4.b     // Catch: java.lang.Throwable -> L82
            r7.j = r1     // Catch: java.lang.Throwable -> L82
            r7.h = r5     // Catch: java.lang.Throwable -> L82
            r7.i = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r8.p(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 != r0) goto L58
            return r0
        L58:
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper r8 = (com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper) r8     // Catch: java.lang.Throwable -> L82
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r3 = r8.getSource()     // Catch: java.lang.Throwable -> L82
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r4 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource.GOOGLE_PLAY     // Catch: java.lang.Throwable -> L82
            if (r3 != r4) goto L67
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct r8 = r8.getProduct()     // Catch: java.lang.Throwable -> L82
            goto L87
        L67:
            com.amazon.aps.iva.rs.h r3 = new com.amazon.aps.iva.rs.h     // Catch: java.lang.Throwable -> L82
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductSource r8 = r8.getSource()     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r4.<init>()     // Catch: java.lang.Throwable -> L82
            r4.append(r8)     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = " not supported"
            r4.append(r8)     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L82
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L82
            throw r3     // Catch: java.lang.Throwable -> L82
        L82:
            r8 = move-exception
            com.amazon.aps.iva.kb0.k$a r8 = com.amazon.aps.iva.ab.x.H(r8)
        L87:
            com.amazon.aps.iva.ez.g r8 = com.amazon.aps.iva.ez.h.e(r8)
            r7.j = r5
            r7.h = r5
            r7.i = r2
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L98
            return r0
        L98:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g40.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
