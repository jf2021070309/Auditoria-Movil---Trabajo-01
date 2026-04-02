package com.amazon.aps.iva.d20;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
/* compiled from: MaturePreferenceInteractor.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.wy.a implements j {
    public final EtpAccountService b;
    public final JwtInvalidator c;
    public final com.amazon.aps.iva.y30.h d;
    public final com.amazon.aps.iva.pm.b e;
    public final ChromecastUserStatusInteractor f;

    /* compiled from: MaturePreferenceInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.mature.MaturePreferenceInteractorImpl", f = "MaturePreferenceInteractor.kt", l = {32, 38}, m = "setMaturePreference")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public k h;
        public boolean i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return k.this.s0(false, this);
        }
    }

    public k(EtpAccountService etpAccountService, JwtInvalidator jwtInvalidator, com.amazon.aps.iva.y30.i iVar, com.amazon.aps.iva.pm.b bVar) {
        ChromecastUserStatusInteractor create = ChromecastUserStatusInteractor.Companion.create();
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(jwtInvalidator, "jwtInvalidator");
        com.amazon.aps.iva.yb0.j.f(bVar, "userProfileInteractor");
        com.amazon.aps.iva.yb0.j.f(create, "chromecastUserStatusInteractor");
        this.b = etpAccountService;
        this.c = jwtInvalidator;
        this.d = iVar;
        this.e = bVar;
        this.f = create;
    }

    @Override // com.amazon.aps.iva.d20.j
    public final boolean F0() {
        ProfileApiModel E = this.e.E();
        if (E == null || !E.isMatureContentEnabled()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // com.amazon.aps.iva.d20.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(boolean r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.d20.k.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.d20.k$a r0 = (com.amazon.aps.iva.d20.k.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.d20.k$a r0 = new com.amazon.aps.iva.d20.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            boolean r6 = r0.i
            com.amazon.aps.iva.d20.k r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            boolean r6 = r0.i
            com.amazon.aps.iva.d20.k r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L5c
        L3e:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.account.model.UpdateMaturityRatingBody r7 = new com.ellation.crunchyroll.api.etp.account.model.UpdateMaturityRatingBody
            com.ellation.crunchyroll.api.etp.account.model.MaturePreference$Companion r2 = com.ellation.crunchyroll.api.etp.account.model.MaturePreference.Companion
            com.ellation.crunchyroll.api.etp.account.model.MaturePreference r2 = r2.fromBoolean(r6)
            r7.<init>(r2)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r2 = r5.b
            java.lang.Object r7 = r2.updateMaturityRating(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r2 = r5
        L5c:
            com.amazon.aps.iva.jf0.a0 r7 = (com.amazon.aps.iva.jf0.a0) r7
            boolean r4 = r7.a()
            if (r4 == 0) goto L86
            com.amazon.aps.iva.pm.b r7 = r2.e
            r0.h = r2
            r0.i = r6
            r0.l = r3
            java.lang.Object r7 = r7.r1(r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r2
        L74:
            com.amazon.aps.iva.y30.h r7 = r0.d
            r7.I(r6)
            com.ellation.crunchyroll.api.etp.auth.JwtInvalidator r6 = r0.c
            r6.onMatureStatusChanged()
            com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor r6 = r0.f
            r6.onMaturityStatusUpdate()
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L86:
            com.amazon.aps.iva.jf0.i r6 = new com.amazon.aps.iva.jf0.i
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d20.k.s0(boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
