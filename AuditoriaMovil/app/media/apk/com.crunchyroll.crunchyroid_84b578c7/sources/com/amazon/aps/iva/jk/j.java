package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.nk.e;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.v1;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
/* loaded from: classes.dex */
public final class j implements l0.c {
    public final g0 b;
    public final u0<com.amazon.aps.iva.nk.j> c;
    public final com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> d;
    public final l0 e;
    public final com.amazon.aps.iva.p0.e f;
    public final com.amazon.aps.iva.xb0.p<Integer, String, com.amazon.aps.iva.kb0.q> g;
    public final com.amazon.aps.iva.xb0.p<Integer, String, com.amazon.aps.iva.kb0.q> h;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
    public c2 j;
    public boolean k;
    public c2 l;
    public c2 m;
    public c2 n;

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.nk.e.values().length];
            iArr[com.amazon.aps.iva.nk.e.READY.ordinal()] = 1;
            iArr[com.amazon.aps.iva.nk.e.ENDED.ordinal()] = 2;
            a = iArr;
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$this$set");
            j jVar = j.this;
            String str = jVar.c.getValue().h.a;
            u0<com.amazon.aps.iva.nk.j> u0Var = jVar.c;
            return new com.amazon.aps.iva.nk.h(u0Var.getValue().v, str, u0Var.getValue().u);
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$this$set");
            return new com.amazon.aps.iva.nk.h(null, null, null);
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.nk.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            j jVar = j.this;
            return com.amazon.aps.iva.nk.h.a(hVar2, null, jVar.c.getValue().h.a, jVar.c.getValue().u, 1);
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.nk.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "state");
            String str = hVar2.b;
            com.amazon.aps.iva.yb0.j.c(str);
            String str2 = hVar2.c;
            com.amazon.aps.iva.yb0.j.c(str2);
            j jVar = j.this;
            jVar.getClass();
            com.amazon.aps.iva.se0.i.d(jVar.b, v1.b, null, new k(jVar, str, str2, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(1);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.nk.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "state");
            j jVar = j.this;
            com.amazon.aps.iva.se0.i.d(jVar.b, null, null, new t(jVar, hVar2, this.i, null), 3);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$startContinuousSessionHeartbeat$1", f = "PlayerSessionHeartbeatListener.kt", l = {248}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public j h;
        public int i;

        public g(com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0040 -> B:16:0x0043). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r7.i
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                com.amazon.aps.iva.jk.j r1 = r7.h
                com.amazon.aps.iva.ab.x.i0(r8)
                r8 = r7
                goto L43
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                com.amazon.aps.iva.ab.x.i0(r8)
                r8 = r7
            L1c:
                com.amazon.aps.iva.jk.j r1 = com.amazon.aps.iva.jk.j.this
                com.amazon.aps.iva.se0.g0 r3 = r1.b
                boolean r3 = com.amazon.aps.iva.e.z.E(r3)
                if (r3 == 0) goto L51
                com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> r3 = r1.d
                java.lang.Object r3 = r3.getValue()
                com.amazon.aps.iva.nk.h r3 = (com.amazon.aps.iva.nk.h) r3
                com.amazon.aps.iva.qj.u r3 = r3.a
                if (r3 == 0) goto L1c
                int r3 = r3.a
                long r3 = (long) r3
                r5 = 1000(0x3e8, double:4.94E-321)
                long r3 = r3 * r5
                r8.h = r1
                r8.i = r2
                java.lang.Object r3 = com.amazon.aps.iva.ab.t.l(r3, r8)
                if (r3 != r0) goto L43
                return r0
            L43:
                r1.getClass()
                com.amazon.aps.iva.jk.s r3 = new com.amazon.aps.iva.jk.s
                r3.<init>(r1)
                com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> r1 = r1.d
                com.amazon.aps.iva.jk.j.N(r1, r3)
                goto L1c
            L51:
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(g0 g0Var, i0 i0Var, v0 v0Var, m0 m0Var, com.amazon.aps.iva.p0.e eVar, com.amazon.aps.iva.tj.c cVar, com.amazon.aps.iva.tj.d dVar, com.amazon.aps.iva.tj.e eVar2) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        com.amazon.aps.iva.yb0.j.f(v0Var, "sessionState");
        com.amazon.aps.iva.yb0.j.f(eVar, "exoplayerHelper");
        this.b = g0Var;
        this.c = i0Var;
        this.d = v0Var;
        this.e = m0Var;
        this.f = eVar;
        this.g = cVar;
        this.h = dVar;
        this.i = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(com.amazon.aps.iva.jk.j r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.amazon.aps.iva.jk.w
            if (r0 == 0) goto L16
            r0 = r9
            com.amazon.aps.iva.jk.w r0 = (com.amazon.aps.iva.jk.w) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.jk.w r0 = new com.amazon.aps.iva.jk.w
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.jk.j r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L54
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> r9 = r8.d
            java.lang.Object r9 = r9.getValue()
            com.amazon.aps.iva.nk.h r9 = (com.amazon.aps.iva.nk.h) r9
            com.amazon.aps.iva.qj.u r9 = r9.a
            if (r9 == 0) goto L5f
            int r9 = r9.f
            long r4 = (long) r9
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.h = r8
            r0.k = r3
            java.lang.Object r9 = com.amazon.aps.iva.ab.t.l(r4, r0)
            if (r9 != r1) goto L54
            goto L61
        L54:
            r8.K()
            r8.Q()
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r8 = r8.i
            r8.invoke()
        L5f:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.j.G(com.amazon.aps.iva.jk.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(com.amazon.aps.iva.jk.j r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.amazon.aps.iva.jk.x
            if (r0 == 0) goto L16
            r0 = r9
            com.amazon.aps.iva.jk.x r0 = (com.amazon.aps.iva.jk.x) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.jk.x r0 = new com.amazon.aps.iva.jk.x
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.jk.j r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L54
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> r9 = r8.d
            java.lang.Object r9 = r9.getValue()
            com.amazon.aps.iva.nk.h r9 = (com.amazon.aps.iva.nk.h) r9
            com.amazon.aps.iva.qj.u r9 = r9.a
            if (r9 == 0) goto L5f
            int r9 = r9.d
            long r4 = (long) r9
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.h = r8
            r0.k = r3
            java.lang.Object r9 = com.amazon.aps.iva.ab.t.l(r4, r0)
            if (r9 != r1) goto L54
            goto L61
        L54:
            r8.K()
            r8.Q()
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r8 = r8.i
            r8.invoke()
        L5f:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.j.I(com.amazon.aps.iva.jk.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static void N(com.amazon.aps.iva.ve0.g0 g0Var, com.amazon.aps.iva.xb0.l lVar) {
        String str;
        boolean z;
        String str2;
        boolean z2 = false;
        if (((com.amazon.aps.iva.nk.h) g0Var.getValue()).c != null && (!com.amazon.aps.iva.oe0.m.b0(str))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (((com.amazon.aps.iva.nk.h) g0Var.getValue()).b != null && (!com.amazon.aps.iva.oe0.m.b0(str2))) {
                z2 = true;
            }
            if (z2) {
                lVar.invoke(g0Var.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q5.l0.c
    public final void J(int i) {
        if (com.amazon.aps.iva.e.w.h(this.c.getValue())) {
            com.amazon.aps.iva.nk.e.Companion.getClass();
            int i2 = a.a[e.a.a(i).ordinal()];
            com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> g0Var = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    d dVar = new d();
                    com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
                    g0Var.setValue(dVar.invoke(g0Var.getValue()));
                    return;
                }
                K();
                Q();
                com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
                c cVar = c.h;
                com.amazon.aps.iva.yb0.j.f(cVar, "block");
                g0Var.setValue(cVar.invoke(g0Var.getValue()));
            } else if (!this.k) {
                b bVar = new b();
                com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
                g0Var.setValue(bVar.invoke(g0Var.getValue()));
                S();
            }
        }
    }

    public final void K() {
        c2 c2Var = this.j;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.k = false;
    }

    public final void Q() {
        N(this.d, new e());
    }

    public final void R(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        if (com.amazon.aps.iva.e.w.h(this.c.getValue())) {
            N(this.d, new f(aVar));
            return;
        }
        aVar.invoke();
    }

    public final void S() {
        c2 c2Var = this.j;
        if (c2Var != null) {
            c2Var.a(null);
        }
        c2 d2 = com.amazon.aps.iva.se0.i.d(this.b, r0.b, null, new g(null), 2);
        this.j = d2;
        d2.start();
        this.k = true;
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void g0(int i, boolean z) {
        if (com.amazon.aps.iva.e.w.h(this.c.getValue())) {
            com.amazon.aps.iva.nk.e.Companion.getClass();
            com.amazon.aps.iva.nk.e a2 = e.a.a(i);
            g0 g0Var = this.b;
            if (!z && a2 == com.amazon.aps.iva.nk.e.END_OF_MEDIA_ITEM) {
                c2 c2Var = this.l;
                if (c2Var != null) {
                    c2Var.a(null);
                }
                this.l = com.amazon.aps.iva.se0.i.d(g0Var, null, null, new n(this, null), 3);
            }
            if (!z && a2 == com.amazon.aps.iva.nk.e.IDLE) {
                c2 c2Var2 = this.m;
                if (c2Var2 != null) {
                    c2Var2.a(null);
                }
                this.m = com.amazon.aps.iva.se0.i.d(g0Var, null, null, new o(this, null), 3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r6.b, ((com.amazon.aps.iva.nk.h) r1.getValue()).b) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q5.l0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(int r5, com.amazon.aps.iva.q5.b0 r6) {
        /*
            r4 = this;
            com.amazon.aps.iva.ve0.u0<com.amazon.aps.iva.nk.j> r0 = r4.c
            java.lang.Object r1 = r0.getValue()
            com.amazon.aps.iva.nk.j r1 = (com.amazon.aps.iva.nk.j) r1
            boolean r1 = com.amazon.aps.iva.e.w.h(r1)
            if (r1 == 0) goto L5b
            if (r6 == 0) goto L5b
            com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> r1 = r4.d
            r2 = 1
            if (r5 == r2) goto L2a
            r3 = 2
            if (r5 != r3) goto L29
            java.lang.Object r5 = r1.getValue()
            com.amazon.aps.iva.nk.h r5 = (com.amazon.aps.iva.nk.h) r5
            java.lang.String r5 = r5.b
            java.lang.String r6 = r6.b
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r6, r5)
            if (r5 != 0) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L5b
            java.lang.Object r5 = r0.getValue()
            com.amazon.aps.iva.nk.j r5 = (com.amazon.aps.iva.nk.j) r5
            com.amazon.aps.iva.nk.e r5 = r5.g
            com.amazon.aps.iva.nk.e r6 = com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE
            if (r5 == r6) goto L5b
            r4.K()
            r4.Q()
            com.amazon.aps.iva.jk.l r5 = new com.amazon.aps.iva.jk.l
            r5.<init>(r4)
            java.lang.String r6 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r1, r6)
            java.lang.Object r6 = r1.getValue()
            java.lang.Object r5 = r5.invoke(r6)
            r1.setValue(r5)
            com.amazon.aps.iva.jk.m r5 = new com.amazon.aps.iva.jk.m
            r5.<init>(r4)
            r4.R(r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.j.l0(int, com.amazon.aps.iva.q5.b0):void");
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void s0(boolean z) {
        if (com.amazon.aps.iva.e.w.h(this.c.getValue()) && z) {
            c2 c2Var = this.l;
            if (c2Var != null) {
                c2Var.a(null);
            }
            c2 c2Var2 = this.m;
            if (c2Var2 != null) {
                c2Var2.a(null);
            }
        }
    }
}
