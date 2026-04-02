package com.amazon.aps.iva.v40;

import com.amazon.aps.iva.us.p;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
/* compiled from: SignUpInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.v40.a {
    public final com.amazon.aps.iva.bo.f b;
    public final com.ellation.crunchyroll.presentation.signing.signin.f c;
    public final NotificationSettingsInteractor d;
    public final EtpAccountService e;
    public final com.amazon.aps.iva.ys.c f;
    public final p g;
    public final com.amazon.aps.iva.zg.p h;
    public final com.amazon.aps.iva.lh.a i;
    public final com.amazon.aps.iva.kh.e j;
    public final com.amazon.aps.iva.p60.f k;

    /* compiled from: SignUpInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signup.SignUpInteractorImpl", f = "SignUpInteractor.kt", l = {107, 108, 117}, m = "signIn")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public boolean j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return b.this.C(null, null, false, this);
        }
    }

    /* compiled from: SignUpInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signup.SignUpInteractorImpl", f = "SignUpInteractor.kt", l = {79, 94}, m = "signUp")
    /* renamed from: com.amazon.aps.iva.v40.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0783b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public String i;
        public String j;
        public boolean k;
        public /* synthetic */ Object l;
        public int n;

        public C0783b(com.amazon.aps.iva.ob0.d<? super C0783b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return b.this.D0(null, null, false, this);
        }
    }

    public b(com.amazon.aps.iva.zg.p pVar, com.amazon.aps.iva.kh.e eVar, com.amazon.aps.iva.lh.b bVar, com.amazon.aps.iva.bo.f fVar, p pVar2, EtpAccountService etpAccountService, NotificationSettingsInteractor notificationSettingsInteractor, com.amazon.aps.iva.ys.c cVar, com.ellation.crunchyroll.presentation.signing.signin.f fVar2, com.amazon.aps.iva.p60.g gVar) {
        this.b = fVar;
        this.c = fVar2;
        this.d = notificationSettingsInteractor;
        this.e = etpAccountService;
        this.f = cVar;
        this.g = pVar2;
        this.h = pVar;
        this.i = bVar;
        this.j = eVar;
        this.k = gVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(10:21|22|23|24|(1:26)(1:30)|27|(1:29)|14|15|16))(1:31))(2:36|(1:38)(1:39))|32|(1:34)(10:35|22|23|24|(0)(0)|27|(0)|14|15|16)))|42|6|7|(0)(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r9.g.b(r10, new com.amazon.aps.iva.es.w("Failed to update account notification settings", com.amazon.aps.iva.ls.a.REGISTRATION, null, null, null, 60));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r9, java.lang.String r10, boolean r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.v40.b.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.v40.b$a r0 = (com.amazon.aps.iva.v40.b.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.v40.b$a r0 = new com.amazon.aps.iva.v40.b$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.amazon.aps.iva.v40.b r9 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)     // Catch: java.io.IOException -> L99
            goto Lae
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            boolean r9 = r0.j
            java.lang.String r10 = r0.i
            com.amazon.aps.iva.v40.b r11 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            r7 = r11
            r11 = r9
        L43:
            r9 = r7
            goto L78
        L45:
            boolean r11 = r0.j
            java.lang.String r9 = r0.i
            com.amazon.aps.iva.v40.b r10 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L64
        L4f:
            com.amazon.aps.iva.ab.x.i0(r12)
            r0.h = r8
            r0.i = r9
            r0.j = r11
            r0.m = r5
            com.ellation.crunchyroll.presentation.signing.signin.f r12 = r8.c
            java.lang.Object r10 = r12.signIn(r9, r10, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            r10 = r8
        L64:
            com.ellation.crunchyroll.presentation.signing.signin.f r12 = r10.c
            r0.h = r10
            r0.i = r9
            r0.j = r11
            r0.m = r4
            java.lang.Object r12 = r12.I(r9, r0)
            if (r12 != r1) goto L75
            return r1
        L75:
            r7 = r10
            r10 = r9
            goto L43
        L78:
            com.amazon.aps.iva.us.p r12 = r9.g
            com.amazon.aps.iva.bo.f r2 = r9.b
            java.lang.String r2 = r2.b()
            com.amazon.aps.iva.js.e$a r4 = com.amazon.aps.iva.js.e.a.a
            r12.c(r2, r11, r4, r10)
            com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor r10 = r9.d     // Catch: java.io.IOException -> L99
            if (r11 == 0) goto L8a
            goto L8b
        L8a:
            r5 = 0
        L8b:
            r0.h = r9     // Catch: java.io.IOException -> L99
            r11 = 0
            r0.i = r11     // Catch: java.io.IOException -> L99
            r0.m = r3     // Catch: java.io.IOException -> L99
            java.lang.Object r9 = r10.optInMarketingNotifications(r5, r0)     // Catch: java.io.IOException -> L99
            if (r9 != r1) goto Lae
            return r1
        L99:
            r10 = move-exception
            com.amazon.aps.iva.us.p r9 = r9.g
            com.amazon.aps.iva.es.w r11 = new com.amazon.aps.iva.es.w
            java.lang.String r1 = "Failed to update account notification settings"
            com.amazon.aps.iva.ls.a r2 = com.amazon.aps.iva.ls.a.REGISTRATION
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 60
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.b(r10, r11)
        Lae:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v40.b.C(java.lang.String, java.lang.String, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: IOException -> 0x0046, TryCatch #1 {IOException -> 0x0046, blocks: (B:20:0x0042, B:29:0x0082, B:31:0x008a, B:35:0x0093, B:42:0x00ac, B:43:0x00b1), top: B:51:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: IOException -> 0x0046, TRY_ENTER, TryCatch #1 {IOException -> 0x0046, blocks: (B:20:0x0042, B:29:0x0082, B:31:0x008a, B:35:0x0093, B:42:0x00ac, B:43:0x00b1), top: B:51:0x0042 }] */
    @Override // com.amazon.aps.iva.v40.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(java.lang.String r12, java.lang.String r13, boolean r14, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.amazon.aps.iva.v40.b.C0783b
            if (r0 == 0) goto L13
            r0 = r15
            com.amazon.aps.iva.v40.b$b r0 = (com.amazon.aps.iva.v40.b.C0783b) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.v40.b$b r0 = new com.amazon.aps.iva.v40.b$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.String r12 = r0.i
            com.amazon.aps.iva.v40.b r13 = r0.h
            com.amazon.aps.iva.ab.x.i0(r15)     // Catch: java.io.IOException -> L2f
            goto La4
        L2f:
            r14 = move-exception
            goto Lb8
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            boolean r14 = r0.k
            java.lang.String r13 = r0.j
            java.lang.String r12 = r0.i
            com.amazon.aps.iva.v40.b r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r15)     // Catch: java.io.IOException -> L46
            goto L82
        L46:
            r13 = move-exception
            goto Lb2
        L48:
            com.amazon.aps.iva.ab.x.i0(r15)
            com.amazon.aps.iva.p60.f r15 = r11.k     // Catch: java.io.IOException -> Lb5
            java.util.Locale r15 = r15.a()     // Catch: java.io.IOException -> Lb5
            java.lang.String r8 = r15.toLanguageTag()     // Catch: java.io.IOException -> Lb5
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r15 = r11.e     // Catch: java.io.IOException -> Lb5
            com.ellation.crunchyroll.api.etp.account.model.CreateAccountWithEmailBody r2 = new com.ellation.crunchyroll.api.etp.account.model.CreateAccountWithEmailBody     // Catch: java.io.IOException -> Lb5
            java.lang.String r5 = "systemLanguageTag"
            com.amazon.aps.iva.yb0.j.e(r8, r5)     // Catch: java.io.IOException -> Lb5
            com.amazon.aps.iva.kh.e r5 = r11.j     // Catch: java.io.IOException -> Lb5
            java.lang.String r9 = r5.getSupportedAudioLanguageTag(r8)     // Catch: java.io.IOException -> Lb5
            com.amazon.aps.iva.lh.a r5 = r11.i     // Catch: java.io.IOException -> Lb5
            java.lang.String r10 = r5.b(r8)     // Catch: java.io.IOException -> Lb5
            r5 = r2
            r6 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> Lb5
            r0.h = r11     // Catch: java.io.IOException -> Lb5
            r0.i = r12     // Catch: java.io.IOException -> Lb5
            r0.j = r13     // Catch: java.io.IOException -> Lb5
            r0.k = r14     // Catch: java.io.IOException -> Lb5
            r0.n = r4     // Catch: java.io.IOException -> Lb5
            java.lang.Object r15 = r15.createAccount(r2, r0)     // Catch: java.io.IOException -> Lb5
            if (r15 != r1) goto L81
            return r1
        L81:
            r2 = r11
        L82:
            com.amazon.aps.iva.jf0.a0 r15 = (com.amazon.aps.iva.jf0.a0) r15     // Catch: java.io.IOException -> L46
            boolean r5 = r15.a()     // Catch: java.io.IOException -> L46
            if (r5 == 0) goto Lac
            com.amazon.aps.iva.zg.p r15 = r2.h     // Catch: java.io.IOException -> L46
            r15.d()     // Catch: java.io.IOException -> L46
            if (r14 == 0) goto L92
            goto L93
        L92:
            r4 = 0
        L93:
            r0.h = r2     // Catch: java.io.IOException -> L46
            r0.i = r12     // Catch: java.io.IOException -> L46
            r14 = 0
            r0.j = r14     // Catch: java.io.IOException -> L46
            r0.n = r3     // Catch: java.io.IOException -> L46
            java.lang.Object r13 = r2.C(r12, r13, r4, r0)     // Catch: java.io.IOException -> L46
            if (r13 != r1) goto La3
            return r1
        La3:
            r13 = r2
        La4:
            com.amazon.aps.iva.ys.c r14 = r13.f     // Catch: java.io.IOException -> L2f
            r14.h2()     // Catch: java.io.IOException -> L2f
            com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a
            return r12
        Lac:
            com.amazon.aps.iva.jf0.i r13 = new com.amazon.aps.iva.jf0.i     // Catch: java.io.IOException -> L46
            r13.<init>(r15)     // Catch: java.io.IOException -> L46
            throw r13     // Catch: java.io.IOException -> L46
        Lb2:
            r14 = r13
            r13 = r2
            goto Lb8
        Lb5:
            r13 = move-exception
            r14 = r13
            r13 = r11
        Lb8:
            com.amazon.aps.iva.us.p r13 = r13.g
            java.lang.String r15 = r14.toString()
            com.amazon.aps.iva.js.e$a r0 = com.amazon.aps.iva.js.e.a.a
            r13.f(r15, r0, r12)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v40.b.D0(java.lang.String, java.lang.String, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
