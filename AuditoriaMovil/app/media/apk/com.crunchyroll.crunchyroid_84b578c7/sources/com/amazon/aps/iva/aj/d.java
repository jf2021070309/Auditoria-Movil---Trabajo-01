package com.amazon.aps.iva.aj;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: MaturityRestrictionsInteractorImpl.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.a implements c {
    public final EtpAccountService b;
    public final com.amazon.aps.iva.pm.b c;

    /* compiled from: MaturityRestrictionsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.parentalcontrols.MaturityRestrictionsInteractorImpl", f = "MaturityRestrictionsInteractorImpl.kt", l = {19, 25}, m = "updateExtendedMaturityRating")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public d h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return d.this.g0(null, this);
        }
    }

    public d(EtpAccountService etpAccountService, com.amazon.aps.iva.pm.b bVar) {
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(bVar, "userProfileInteractor");
        this.b = etpAccountService;
        this.c = bVar;
    }

    public final String C() {
        ProfileApiModel E = this.c.E();
        if (E != null) {
            return E.getExtendedMaturityRatingBrazil();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    @Override // com.amazon.aps.iva.aj.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.aj.d.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.aj.d$a r0 = (com.amazon.aps.iva.aj.d.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.aj.d$a r0 = new com.amazon.aps.iva.aj.d$a
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
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.aj.d r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L53
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.account.model.UpdateExtendedMaturityBody r7 = new com.ellation.crunchyroll.api.etp.account.model.UpdateExtendedMaturityBody
            com.ellation.crunchyroll.api.etp.account.model.ProfileExtendedMaturityRating r2 = new com.ellation.crunchyroll.api.etp.account.model.ProfileExtendedMaturityRating
            r2.<init>(r6)
            r7.<init>(r2)
            r0.h = r5
            r0.k = r4
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r6 = r5.b
            java.lang.Object r7 = r6.updateExtendedMaturityRating(r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r5
        L53:
            com.amazon.aps.iva.jf0.a0 r7 = (com.amazon.aps.iva.jf0.a0) r7
            boolean r2 = r7.a()
            if (r2 == 0) goto L6c
            com.amazon.aps.iva.pm.b r6 = r6.c
            r7 = 0
            r0.h = r7
            r0.k = r3
            java.lang.Object r6 = r6.r1(r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L6c:
            com.amazon.aps.iva.jf0.i r6 = new com.amazon.aps.iva.jf0.i
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.aj.d.g0(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
