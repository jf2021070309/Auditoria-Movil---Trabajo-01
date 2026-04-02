package com.amazon.aps.iva.zg;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
/* compiled from: SendConfirmationEmailInteractor.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.wy.a implements l {
    public final EtpAccountService b;
    public final UserTokenInteractor c;

    /* compiled from: SendConfirmationEmailInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.emailverification.banner.SendConfirmationEmailInteractorImpl", f = "SendConfirmationEmailInteractor.kt", l = {34, 36}, m = "sendVerificationEmail")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public n h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return n.this.sendVerificationEmail(this);
        }
    }

    public n(EtpAccountService etpAccountService, UserTokenInteractor userTokenInteractor) {
        this.b = etpAccountService;
        this.c = userTokenInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable C(java.io.IOException r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.zg.m
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.zg.m r0 = (com.amazon.aps.iva.zg.m) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.zg.m r0 = new com.amazon.aps.iva.zg.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.io.IOException r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L85
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            com.amazon.aps.iva.ab.x.i0(r8)
            boolean r8 = r7 instanceof com.ellation.crunchyroll.api.etp.error.BadRequestException
            r2 = 0
            if (r8 == 0) goto L76
            r8 = r7
            com.ellation.crunchyroll.api.etp.error.BadRequestException r8 = (com.ellation.crunchyroll.api.etp.error.BadRequestException) r8
            com.ellation.crunchyroll.api.etp.error.ApiError r8 = r8.getError()
            java.util.List r8 = r8.getContexts()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r4 = r8 instanceof java.util.Collection
            if (r4 == 0) goto L54
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L54
            goto L72
        L54:
            java.util.Iterator r8 = r8.iterator()
        L58:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r8.next()
            com.ellation.crunchyroll.api.etp.error.ApiErrorContext r4 = (com.ellation.crunchyroll.api.etp.error.ApiErrorContext) r4
            java.lang.String r4 = r4.getCode()
            java.lang.String r5 = "accounts.email_verification.already_verified"
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r5)
            if (r4 == 0) goto L58
            r8 = r3
            goto L73
        L72:
            r8 = r2
        L73:
            if (r8 == 0) goto L76
            r2 = r3
        L76:
            if (r2 == 0) goto L8b
            r0.h = r7
            r0.k = r3
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor r8 = r6.c
            java.lang.Object r8 = r8.refreshJwt(r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            com.amazon.aps.iva.zg.b r8 = new com.amazon.aps.iva.zg.b
            r8.<init>(r7)
            r7 = r8
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zg.n.C(java.io.IOException, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[RETURN] */
    @Override // com.amazon.aps.iva.zg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendVerificationEmail(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.zg.n.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.zg.n$a r0 = (com.amazon.aps.iva.zg.n.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.zg.n$a r0 = new com.amazon.aps.iva.zg.n$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2e:
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L5b
        L32:
            com.amazon.aps.iva.zg.n r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.io.IOException -> L38
            goto L4a
        L38:
            r6 = move-exception
            goto L4f
        L3a:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r6 = r5.b     // Catch: java.io.IOException -> L4d
            r0.h = r5     // Catch: java.io.IOException -> L4d
            r0.k = r4     // Catch: java.io.IOException -> L4d
            java.lang.Object r6 = r6.sendVerificationEmail(r0)     // Catch: java.io.IOException -> L4d
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L4d:
            r6 = move-exception
            r2 = r5
        L4f:
            r4 = 0
            r0.h = r4
            r0.k = r3
            java.io.Serializable r6 = r2.C(r6, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zg.n.sendVerificationEmail(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
