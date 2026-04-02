package com.amazon.aps.iva.bo;

import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UserDataInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.bo.a {
    public final com.amazon.aps.iva.jd.a b;
    public final l c;
    public final com.amazon.aps.iva.pm.b d;
    public final com.amazon.aps.iva.ve.l e;
    public final f f;
    public final com.amazon.aps.iva.xb0.a<q> g;

    /* compiled from: UserDataInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl", f = "UserDataInteractorImpl.kt", l = {41}, m = "loadUserData")
    /* loaded from: classes2.dex */
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
            return d.this.K1(this);
        }
    }

    public d(com.amazon.aps.iva.jd.a aVar, l lVar, com.amazon.aps.iva.pm.b bVar, com.amazon.aps.iva.ve.l lVar2, f fVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        j.f(aVar, "accountDataInteractor");
        j.f(lVar, "userBenefitsSynchronizer");
        j.f(bVar, "userProfileInteractor");
        j.f(lVar2, "userBillingStatusSynchronizer");
        j.f(fVar, "userState");
        j.f(aVar2, "identifyUser");
        this.b = aVar;
        this.c = lVar;
        this.d = bVar;
        this.e = lVar2;
        this.f = fVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.amazon.aps.iva.bo.d r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.amazon.aps.iva.bo.b
            if (r0 == 0) goto L16
            r0 = r5
            com.amazon.aps.iva.bo.b r0 = (com.amazon.aps.iva.bo.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.bo.b r0 = new com.amazon.aps.iva.bo.b
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.bo.d r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L44
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4
            r0.k = r3
            com.amazon.aps.iva.jd.a r5 = r4.b
            java.io.Serializable r5 = r5.v1(r0)
            if (r5 != r1) goto L44
            goto L52
        L44:
            com.ellation.crunchyroll.api.etp.account.model.AccountApiModel r5 = (com.ellation.crunchyroll.api.etp.account.model.AccountApiModel) r5
            com.amazon.aps.iva.bo.f r0 = r4.f
            r0.l0(r5)
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r4 = r4.g
            r4.invoke()
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bo.d.C(com.amazon.aps.iva.bo.d, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.bo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K1(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.bo.d.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.bo.d$a r0 = (com.amazon.aps.iva.bo.d.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.bo.d$a r0 = new com.amazon.aps.iva.bo.d$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.bo.d r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.io.IOException -> L29
            goto L4c
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4     // Catch: java.io.IOException -> L4f
            r0.k = r3     // Catch: java.io.IOException -> L4f
            com.amazon.aps.iva.bo.c r5 = new com.amazon.aps.iva.bo.c     // Catch: java.io.IOException -> L4f
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.io.IOException -> L4f
            java.lang.Object r5 = com.amazon.aps.iva.e.z.p(r5, r0)     // Catch: java.io.IOException -> L4f
            if (r5 != r1) goto L47
            goto L49
        L47:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a     // Catch: java.io.IOException -> L4f
        L49:
            if (r5 != r1) goto L4c
            return r1
        L4c:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L4f:
            r5 = move-exception
            r0 = r4
        L51:
            com.amazon.aps.iva.bo.f r1 = r0.f
            r1.n0()
            com.amazon.aps.iva.ct.l r1 = r0.c
            r1.H5()
            com.amazon.aps.iva.ve.l r0 = r0.e
            r0.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bo.d.K1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
