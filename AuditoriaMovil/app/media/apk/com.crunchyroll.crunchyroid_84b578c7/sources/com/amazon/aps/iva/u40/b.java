package com.amazon.aps.iva.u40;

import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
/* compiled from: SignInInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.ellation.crunchyroll.presentation.signing.signin.f {
    public final com.amazon.aps.iva.bo.a b;
    public final EtpIndexProvider c;
    public final RefreshTokenProvider d;
    public final com.amazon.aps.iva.us.n e;
    public final com.ellation.crunchyroll.application.g f;

    /* compiled from: SignInInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signin.SignInInteractorImpl", f = "SignInInteractor.kt", l = {52, 54}, m = "loadUserData")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.I(null, this);
        }
    }

    /* compiled from: SignInInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signin.SignInInteractorImpl", f = "SignInInteractor.kt", l = {43}, m = "signIn")
    /* renamed from: com.amazon.aps.iva.u40.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0756b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public C0756b(com.amazon.aps.iva.ob0.d<? super C0756b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.signIn(null, null, this);
        }
    }

    public b(com.amazon.aps.iva.bo.d dVar, EtpIndexProvider etpIndexProvider, RefreshTokenProvider refreshTokenProvider, com.amazon.aps.iva.us.n nVar, com.ellation.crunchyroll.application.g gVar) {
        com.amazon.aps.iva.yb0.j.f(etpIndexProvider, "etpIndexProvider");
        com.amazon.aps.iva.yb0.j.f(refreshTokenProvider, "refreshTokenProvider");
        com.amazon.aps.iva.yb0.j.f(nVar, "loginAnalytics");
        this.b = dVar;
        this.c = etpIndexProvider;
        this.d = refreshTokenProvider;
        this.e = nVar;
        this.f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[RETURN] */
    @Override // com.ellation.crunchyroll.presentation.signing.signin.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.u40.b.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.u40.b$a r0 = (com.amazon.aps.iva.u40.b.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.u40.b$a r0 = new com.amazon.aps.iva.u40.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L43
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.u40.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L2e
            goto L6a
        L2e:
            r7 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.u40.b r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L40
            goto L56
        L40:
            r7 = move-exception
            r0 = r2
            goto L6f
        L43:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.bo.a r7 = r5.b     // Catch: java.io.IOException -> L6d
            r0.h = r5     // Catch: java.io.IOException -> L6d
            r0.i = r6     // Catch: java.io.IOException -> L6d
            r0.l = r3     // Catch: java.io.IOException -> L6d
            java.lang.Object r7 = r7.K1(r0)     // Catch: java.io.IOException -> L6d
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            com.ellation.crunchyroll.api.etp.index.EtpIndexProvider r7 = r2.c     // Catch: java.io.IOException -> L40
            r7.invalidate()     // Catch: java.io.IOException -> L40
            com.ellation.crunchyroll.application.g r7 = r2.f     // Catch: java.io.IOException -> L40
            r0.h = r2     // Catch: java.io.IOException -> L40
            r0.i = r6     // Catch: java.io.IOException -> L40
            r0.l = r4     // Catch: java.io.IOException -> L40
            java.lang.Object r6 = r7.a(r0)     // Catch: java.io.IOException -> L40
            if (r6 != r1) goto L6a
            return r1
        L6a:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L6d:
            r7 = move-exception
            r0 = r5
        L6f:
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider r1 = r0.d
            r1.signOut(r3, r7, r6)
            java.lang.String r1 = r7.toString()
            com.amazon.aps.iva.js.e$a r2 = com.amazon.aps.iva.js.e.a.a
            com.amazon.aps.iva.us.n r0 = r0.e
            r0.f(r1, r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u40.b.I(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // com.ellation.crunchyroll.presentation.signing.signin.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object signIn(java.lang.String r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.u40.b.C0756b
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.u40.b$b r0 = (com.amazon.aps.iva.u40.b.C0756b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.u40.b$b r0 = new com.amazon.aps.iva.u40.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.u40.b r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L2b
            goto L47
        L2b:
            r7 = move-exception
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider r7 = r4.d     // Catch: java.io.IOException -> L4a
            r0.h = r4     // Catch: java.io.IOException -> L4a
            r0.i = r5     // Catch: java.io.IOException -> L4a
            r0.l = r3     // Catch: java.io.IOException -> L4a
            java.lang.Object r5 = r7.signIn(r5, r6, r0)     // Catch: java.io.IOException -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L4a:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L4d:
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider r0 = r6.d
            r0.signOut(r3, r7, r5)
            java.lang.String r0 = r7.toString()
            com.amazon.aps.iva.js.e$a r1 = com.amazon.aps.iva.js.e.a.a
            com.amazon.aps.iva.us.n r6 = r6.e
            r6.f(r0, r1, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u40.b.signIn(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
