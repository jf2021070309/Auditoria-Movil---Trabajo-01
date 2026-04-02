package com.amazon.aps.iva.rx;

import com.amazon.aps.iva.co.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.n;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.application.g;
/* compiled from: UserMigrationSignInInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class d implements h {
    public final com.amazon.aps.iva.bo.a a;
    public final EtpIndexProvider b;
    public final RefreshTokenProvider c;
    public final g d;

    /* compiled from: UserMigrationSignInInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.features.usermigration.UserMigrationSignInInteractorImpl", f = "UserMigrationSignInInteractorImpl.kt", l = {18, 19, 21}, m = "signInWithFun")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public d h;
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
            return d.this.signInWithFun(null, null, this);
        }
    }

    public d(com.amazon.aps.iva.bo.d dVar, EtpIndexProvider etpIndexProvider, RefreshTokenProvider refreshTokenProvider) {
        n a2 = g.a.a();
        j.f(etpIndexProvider, "etpIndexProvider");
        j.f(refreshTokenProvider, "refreshTokenProvider");
        this.a = dVar;
        this.b = etpIndexProvider;
        this.c = refreshTokenProvider;
        this.d = a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // com.amazon.aps.iva.co.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object signInWithFun(java.lang.String r7, java.lang.String r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.rx.d.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.rx.d$a r0 = (com.amazon.aps.iva.rx.d.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.rx.d$a r0 = new com.amazon.aps.iva.rx.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.rx.d r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.io.IOException -> L82
            goto L7f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.rx.d r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.io.IOException -> L82
            goto L6b
        L41:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.rx.d r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.io.IOException -> L82
            goto L5c
        L49:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider r9 = r6.c     // Catch: java.io.IOException -> L84
            r0.h = r6     // Catch: java.io.IOException -> L84
            r0.i = r7     // Catch: java.io.IOException -> L84
            r0.l = r5     // Catch: java.io.IOException -> L84
            java.lang.Object r8 = r9.signInWithFun(r7, r8, r0)     // Catch: java.io.IOException -> L84
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r8 = r6
        L5c:
            com.amazon.aps.iva.bo.a r9 = r8.a     // Catch: java.io.IOException -> L82
            r0.h = r8     // Catch: java.io.IOException -> L82
            r0.i = r7     // Catch: java.io.IOException -> L82
            r0.l = r4     // Catch: java.io.IOException -> L82
            java.lang.Object r9 = r9.K1(r0)     // Catch: java.io.IOException -> L82
            if (r9 != r1) goto L6b
            return r1
        L6b:
            com.ellation.crunchyroll.api.etp.index.EtpIndexProvider r9 = r8.b     // Catch: java.io.IOException -> L82
            r9.invalidate()     // Catch: java.io.IOException -> L82
            com.ellation.crunchyroll.application.g r9 = r8.d     // Catch: java.io.IOException -> L82
            r0.h = r8     // Catch: java.io.IOException -> L82
            r0.i = r7     // Catch: java.io.IOException -> L82
            r0.l = r3     // Catch: java.io.IOException -> L82
            java.lang.Object r7 = r9.a(r0)     // Catch: java.io.IOException -> L82
            if (r7 != r1) goto L7f
            return r1
        L7f:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L82:
            r9 = move-exception
            goto L87
        L84:
            r8 = move-exception
            r9 = r8
            r8 = r6
        L87:
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider r8 = r8.c
            r8.signOut(r5, r9, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rx.d.signInWithFun(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
