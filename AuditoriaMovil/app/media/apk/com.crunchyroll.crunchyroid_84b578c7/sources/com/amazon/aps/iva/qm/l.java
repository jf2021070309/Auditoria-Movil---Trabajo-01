package com.amazon.aps.iva.qm;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.SetUsernameBody;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
/* compiled from: ProfileActivationInteractor.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.wy.a implements k {
    public final EtpAccountService b;
    public final JwtInvalidator c;

    /* compiled from: ProfileActivationInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationInteractorImpl", f = "ProfileActivationInteractor.kt", l = {30}, m = "getUsernames")
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
            return l.this.getUsernames(this);
        }
    }

    public l(EtpAccountService etpAccountService, JwtInvalidator jwtInvalidator) {
        this.b = etpAccountService;
        this.c = jwtInvalidator;
    }

    @Override // com.amazon.aps.iva.qm.k
    public final Object W0(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object username = this.b.setUsername(new SetUsernameBody(str), dVar);
        if (username == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return username;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.qm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUsernames(com.amazon.aps.iva.ob0.d<? super java.util.List<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.qm.l.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.qm.l$a r0 = (com.amazon.aps.iva.qm.l.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.qm.l$a r0 = new com.amazon.aps.iva.qm.l$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r5 = r4.b
            java.lang.Object r5 = r5.getUsernames(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.account.model.UsernamesResponse r5 = (com.ellation.crunchyroll.api.etp.account.model.UsernamesResponse) r5
            java.util.List r5 = r5.getUsernames()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qm.l.getUsernames(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.qm.k
    public final void l0() {
        this.c.onUsernameSet();
    }
}
