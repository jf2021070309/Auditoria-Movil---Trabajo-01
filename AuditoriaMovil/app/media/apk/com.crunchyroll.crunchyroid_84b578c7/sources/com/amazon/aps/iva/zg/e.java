package com.amazon.aps.iva.zg;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.se0.g0;
import java.io.IOException;
/* compiled from: EmailVerificationBannerHandler.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final l a;
    public final com.amazon.aps.iva.xb0.a<String> b;
    public final com.amazon.aps.iva.yg.h c;
    public final com.amazon.aps.iva.t50.c d;
    public final g0 e;
    public boolean f = true;
    public final v<j> g = new v<>();
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<String>>> h = new v<>();

    /* compiled from: EmailVerificationBannerHandler.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.emailverification.banner.EmailVerificationBannerHandlerImpl$verifyEmail$1", f = "EmailVerificationBannerHandler.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public e h;
        public String i;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            String str;
            e eVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            e eVar2 = e.this;
            try {
            } catch (IOException e) {
                eVar2.f = true;
                if (!(e instanceof b)) {
                    eVar2.g.i(com.amazon.aps.iva.zg.a.e);
                }
                eVar2.h.i(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            if (i != 0) {
                if (i == 1) {
                    str = this.i;
                    eVar = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                String invoke = eVar2.b.invoke();
                if (invoke != null) {
                    l lVar = eVar2.a;
                    this.h = eVar2;
                    this.i = invoke;
                    this.j = 1;
                    if (lVar.sendVerificationEmail(this) == aVar) {
                        return aVar;
                    }
                    str = invoke;
                    eVar = eVar2;
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            eVar.h.i(new com.amazon.aps.iva.ez.d<>(new g.c(str, null)));
            eVar.c.b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(n nVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.yg.j jVar, com.amazon.aps.iva.t50.c cVar, g0 g0Var) {
        this.a = nVar;
        this.b = aVar;
        this.c = jVar;
        this.d = cVar;
        this.e = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // com.amazon.aps.iva.zg.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<? extends com.ellation.crunchyroll.api.AccountPendingRestrictions> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "userAccountState"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.ellation.crunchyroll.api.AccountPendingRestrictions r0 = com.ellation.crunchyroll.api.AccountPendingRestrictions.VERIFY_EMAIL
            boolean r9 = r9.contains(r0)
            com.amazon.aps.iva.yg.h r0 = r8.c
            com.amazon.aps.iva.zg.r r1 = com.amazon.aps.iva.zg.r.e
            r2 = 1
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.zg.j> r3 = r8.g
            if (r9 == 0) goto L63
            java.lang.Object r9 = r3.d()
            com.amazon.aps.iva.zg.q r4 = com.amazon.aps.iva.zg.q.e
            boolean r9 = com.amazon.aps.iva.yb0.j.a(r9, r4)
            if (r9 != 0) goto L75
            com.amazon.aps.iva.yg.k r9 = r0.f()
            if (r9 == 0) goto L4a
            com.amazon.aps.iva.yg.k r9 = r0.f()
            if (r9 == 0) goto L35
            long r4 = r9.b()
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            goto L36
        L35:
            r9 = 0
        L36:
            com.amazon.aps.iva.yb0.j.c(r9)
            long r4 = r9.longValue()
            com.amazon.aps.iva.t50.c r9 = r8.d
            long r6 = r9.a()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L48
            goto L4a
        L48:
            r9 = 0
            goto L4b
        L4a:
            r9 = r2
        L4b:
            if (r9 == 0) goto L5f
            java.lang.Object r9 = r3.d()
            com.amazon.aps.iva.zg.a r0 = com.amazon.aps.iva.zg.a.e
            boolean r9 = com.amazon.aps.iva.yb0.j.a(r9, r0)
            if (r9 != 0) goto L5b
            r8.f = r2
        L5b:
            r3.i(r0)
            goto L75
        L5f:
            r3.i(r1)
            goto L75
        L63:
            java.lang.Object r9 = r3.d()
            boolean r9 = com.amazon.aps.iva.yb0.j.a(r9, r1)
            if (r9 != 0) goto L6f
            r8.f = r2
        L6f:
            r3.i(r1)
            r0.clear()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zg.e.a(java.util.List):void");
    }

    @Override // com.amazon.aps.iva.zg.d
    public final v b() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.zg.d
    public final v c() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.zg.p
    public final void d() {
        this.f = true;
        this.g.i(q.e);
        this.c.e();
    }

    @Override // com.amazon.aps.iva.zg.d
    public final void e() {
        this.f = false;
    }

    @Override // com.amazon.aps.iva.zg.d
    public final void f() {
        v<j> vVar = this.g;
        j d = vVar.d();
        boolean a2 = com.amazon.aps.iva.yb0.j.a(d, q.e);
        r rVar = r.e;
        if (a2) {
            this.f = true;
            vVar.i(rVar);
            this.c.b();
        } else if (com.amazon.aps.iva.yb0.j.a(d, com.amazon.aps.iva.zg.a.e)) {
            this.f = true;
            vVar.i(rVar);
            com.amazon.aps.iva.se0.i.d(this.e, null, null, new a(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.zg.d
    public final void g() {
        this.f = true;
        this.g.i(r.e);
        this.c.a();
    }

    @Override // com.amazon.aps.iva.zg.d
    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        j d = this.g.d();
        if (d != null) {
            return d.d;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.zg.p
    public final void onSignOut() {
        this.g.i(r.e);
        this.c.clear();
    }
}
