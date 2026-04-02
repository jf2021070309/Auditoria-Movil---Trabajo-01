package com.amazon.aps.iva.a40;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: ChangePasswordInteractor.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.a implements c {
    public final EtpAccountService b;

    /* compiled from: ChangePasswordInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.changepassword.ChangePasswordInteractorImpl", f = "ChangePasswordInteractor.kt", l = {ConnectionResult.API_DISABLED}, m = "updatePassword")
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
            return d.this.L(null, null, this);
        }
    }

    public d(EtpAccountService etpAccountService) {
        this.b = etpAccountService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    @Override // com.amazon.aps.iva.a40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.String r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.a40.d.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.a40.d$a r0 = (com.amazon.aps.iva.a40.d.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.a40.d$a r0 = new com.amazon.aps.iva.a40.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.account.model.UpdatePasswordBody r7 = new com.ellation.crunchyroll.api.etp.account.model.UpdatePasswordBody
            r7.<init>(r5, r6)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r5 = r4.b
            java.lang.Object r7 = r5.updatePassword(r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            com.amazon.aps.iva.jf0.a0 r7 = (com.amazon.aps.iva.jf0.a0) r7
            boolean r5 = r7.a()
            if (r5 == 0) goto L4d
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L4d:
            com.amazon.aps.iva.jf0.i r5 = new com.amazon.aps.iva.jf0.i
            r5.<init>(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a40.d.L(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
