package com.amazon.aps.iva.fe;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import java.io.IOException;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: OtpViewModel.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.ez.b implements q {
    public final f b;
    public final UserTokenInteractor c;
    public final x d;
    public final com.amazon.aps.iva.de.b e;
    public final com.amazon.aps.iva.bo.a f;
    public final EtpIndexProvider g;
    public final RefreshTokenProvider h;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> i;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<Integer>>> j;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>>> k;

    /* compiled from: OtpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.screen.OtpViewModelImpl$resendSignInOtp$1", f = "OtpViewModel.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            t tVar = t.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    f fVar = tVar.b;
                    String str = this.j;
                    this.h = 1;
                    if (fVar.L1(str, this) == aVar) {
                        return aVar;
                    }
                }
                tVar.d.start();
            } catch (IOException e) {
                tVar.j.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: OtpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.screen.OtpViewModelImpl$resendSignUpOtp$1", f = "OtpViewModel.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            t tVar = t.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    f fVar = tVar.b;
                    String str = this.j;
                    this.h = 1;
                    if (fVar.C1(str, this) == aVar) {
                        return aVar;
                    }
                }
                tVar.d.start();
            } catch (IOException e) {
                tVar.j.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: OtpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.screen.OtpViewModelImpl", f = "OtpViewModel.kt", l = {95, 96, 98}, m = "signIn")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public t h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return t.this.O8(null, null, this);
        }
    }

    /* compiled from: OtpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.screen.OtpViewModelImpl$verifyOtp$1", f = "OtpViewModel.kt", l = {BaseNCodec.MIME_CHUNK_SIZE, 78}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ t j;
        public final /* synthetic */ String k;
        public final /* synthetic */ String l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, t tVar, String str, String str2, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.i = z;
            this.j = tVar;
            this.k = str;
            this.l = str2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            t tVar = this.j;
            try {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    boolean z = this.i;
                    String str = this.l;
                    String str2 = this.k;
                    if (z) {
                        this.h = 1;
                        if (t.N8(tVar, str2, str, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        this.h = 2;
                        if (tVar.O8(str2, str, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                tVar.k.k(new com.amazon.aps.iva.ez.d<>(new g.c(com.amazon.aps.iva.kb0.q.a, null)));
            } catch (IOException e) {
                RefreshTokenProvider.DefaultImpls.signOut$default(tVar.h, true, e, null, 4, null);
                tVar.k.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g gVar, UserTokenInteractor userTokenInteractor, y yVar, com.amazon.aps.iva.de.c cVar, com.amazon.aps.iva.bo.a aVar, EtpIndexProvider etpIndexProvider, RefreshTokenProvider refreshTokenProvider, com.amazon.aps.iva.xb0.l lVar) {
        super(gVar, aVar);
        com.amazon.aps.iva.yb0.j.f(userTokenInteractor, "userTokenInteractor");
        com.amazon.aps.iva.yb0.j.f(cVar, "phoneSignInMessageMonitor");
        com.amazon.aps.iva.yb0.j.f(aVar, "userDataInteractor");
        com.amazon.aps.iva.yb0.j.f(etpIndexProvider, "etpIndexProvider");
        com.amazon.aps.iva.yb0.j.f(refreshTokenProvider, "refreshTokenProvider");
        com.amazon.aps.iva.yb0.j.f(lVar, "onSignIn");
        this.b = gVar;
        this.c = userTokenInteractor;
        this.d = yVar;
        this.e = cVar;
        this.f = aVar;
        this.g = etpIndexProvider;
        this.h = refreshTokenProvider;
        this.i = lVar;
        this.j = new com.amazon.aps.iva.i5.v<>();
        this.k = new com.amazon.aps.iva.i5.v<>();
        r rVar = new r(this);
        s sVar = new s(this);
        yVar.b = rVar;
        yVar.a = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N8(com.amazon.aps.iva.fe.t r5, java.lang.String r6, java.lang.String r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof com.amazon.aps.iva.fe.u
            if (r0 == 0) goto L16
            r0 = r8
            com.amazon.aps.iva.fe.u r0 = (com.amazon.aps.iva.fe.u) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.m = r1
            goto L1b
        L16:
            com.amazon.aps.iva.fe.u r0 = new com.amazon.aps.iva.fe.u
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.amazon.aps.iva.fe.t r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L65
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            java.lang.String r7 = r0.j
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.fe.t r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L55
        L41:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r5
            r0.i = r6
            r0.j = r7
            r0.m = r4
            com.amazon.aps.iva.fe.f r8 = r5.b
            java.lang.Object r8 = r8.H0(r6, r7, r0)
            if (r8 != r1) goto L55
            goto L75
        L55:
            r0.h = r5
            r8 = 0
            r0.i = r8
            r0.j = r8
            r0.m = r3
            java.lang.Object r6 = r5.O8(r6, r7, r0)
            if (r6 != r1) goto L65
            goto L75
        L65:
            com.amazon.aps.iva.de.b r5 = r5.e
            com.amazon.aps.iva.i5.v r5 = r5.a()
            com.amazon.aps.iva.ez.d r6 = new com.amazon.aps.iva.ez.d
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            r6.<init>(r1)
            r5.i(r6)
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fe.t.N8(com.amazon.aps.iva.fe.t, java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.fe.q
    public final void J5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(str, null), 3);
    }

    @Override // com.amazon.aps.iva.fe.q
    public final void J6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(str, null), 3);
    }

    @Override // com.amazon.aps.iva.fe.q
    public final com.amazon.aps.iva.i5.v L5() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O8(java.lang.String r7, java.lang.String r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.fe.t.c
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.fe.t$c r0 = (com.amazon.aps.iva.fe.t.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.fe.t$c r0 = new com.amazon.aps.iva.fe.t$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.amazon.aps.iva.fe.t r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L5f
        L3b:
            com.amazon.aps.iva.fe.t r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L52
        L41:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r6
            r0.k = r5
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor r9 = r6.c
            java.lang.Object r7 = r9.signInWithPhone(r7, r8, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r7 = r6
        L52:
            com.amazon.aps.iva.bo.a r8 = r7.f
            r0.h = r7
            r0.k = r4
            java.lang.Object r8 = r8.K1(r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            com.ellation.crunchyroll.api.etp.index.EtpIndexProvider r8 = r7.g
            r8.invalidate()
            r8 = 0
            r0.h = r8
            r0.k = r3
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r7 = r7.i
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fe.t.O8(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.fe.q
    public final void p3(String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        com.amazon.aps.iva.yb0.j.f(str2, "otp");
        com.amazon.aps.iva.ez.h.d(this.k);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new d(z, this, str, str2, null), 3);
    }

    @Override // com.amazon.aps.iva.fe.q
    public final com.amazon.aps.iva.i5.v z6() {
        return this.k;
    }
}
