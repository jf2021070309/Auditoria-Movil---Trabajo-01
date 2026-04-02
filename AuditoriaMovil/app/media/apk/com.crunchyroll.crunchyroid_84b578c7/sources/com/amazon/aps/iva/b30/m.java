package com.amazon.aps.iva.b30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ys.n;
/* compiled from: UnverifiedPurchaseMonitor.kt */
/* loaded from: classes2.dex */
public final class m implements com.amazon.aps.iva.wh.e {
    public final com.amazon.aps.iva.rs.f b;
    public final com.amazon.aps.iva.f20.h c;
    public final com.amazon.aps.iva.g30.c d;
    public final g0 e;
    public final com.amazon.aps.iva.xb0.a<Boolean> f;
    public final v<com.amazon.aps.iva.wh.a> g = new v<>();

    /* compiled from: UnverifiedPurchaseMonitor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.UnverifiedPurchaseMonitorImpl", f = "UnverifiedPurchaseMonitor.kt", l = {73, 75}, m = "checkPurchases")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public m h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    /* compiled from: UnverifiedPurchaseMonitor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.UnverifiedPurchaseMonitorImpl$onAppResume$1", f = "UnverifiedPurchaseMonitor.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                if (m.this.b(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public m(com.amazon.aps.iva.rs.f fVar, com.amazon.aps.iva.sz.b bVar, com.amazon.aps.iva.g30.d dVar, g0 g0Var, com.amazon.aps.iva.yw.p pVar) {
        this.b = fVar;
        this.c = bVar;
        this.d = dVar;
        this.e = g0Var;
        this.f = pVar;
    }

    @Override // com.amazon.aps.iva.wh.e
    public final void F2(androidx.fragment.app.h hVar, com.amazon.aps.iva.g30.e eVar) {
        this.g.e(hVar, new p(new n(eVar, this)));
    }

    @Override // com.amazon.aps.iva.wh.e
    public final Object W1(n.a aVar) {
        Object b2 = b(aVar);
        if (b2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return b2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.wh.f
    public final boolean a() {
        if (this.g.d() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|(1:17)|18|19)(2:22|23))(2:24|25))(3:32|33|(1:35)(1:36))|26|(2:28|(1:30)(2:31|13))|14|15|(0)|18|19))|40|6|7|(0)(0)|26|(0)|14|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        r7 = com.amazon.aps.iva.ab.x.H(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:13:0x0028, B:31:0x0066, B:34:0x0070, B:18:0x0036, B:25:0x004b, B:27:0x004f, B:21:0x003d), top: B:42:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.b30.m.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.b30.m$a r0 = (com.amazon.aps.iva.b30.m.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b30.m$a r0 = new com.amazon.aps.iva.b30.m$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.b30.m r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L6e
            goto L66
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.amazon.aps.iva.b30.m r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L6e
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.rs.f r7 = r6.b     // Catch: java.lang.Throwable -> L6e
            r0.h = r6     // Catch: java.lang.Throwable -> L6e
            r0.k = r4     // Catch: java.lang.Throwable -> L6e
            java.io.Serializable r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L6e
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            com.amazon.aps.iva.rs.p r7 = (com.amazon.aps.iva.rs.p) r7     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L70
            r0.h = r2     // Catch: java.lang.Throwable -> L6e
            r0.k = r3     // Catch: java.lang.Throwable -> L6e
            r2.getClass()     // Catch: java.lang.Throwable -> L6e
            com.amazon.aps.iva.se0.v1 r3 = com.amazon.aps.iva.se0.v1.b     // Catch: java.lang.Throwable -> L6e
            com.amazon.aps.iva.b30.o r4 = new com.amazon.aps.iva.b30.o     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            r4.<init>(r2, r7, r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = com.amazon.aps.iva.se0.i.g(r0, r3, r4)     // Catch: java.lang.Throwable -> L6e
            if (r7 != r1) goto L65
            return r1
        L65:
            r0 = r2
        L66:
            com.amazon.aps.iva.wh.a r7 = (com.amazon.aps.iva.wh.a) r7     // Catch: java.lang.Throwable -> L6e
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.wh.a> r0 = r0.g     // Catch: java.lang.Throwable -> L6e
            r0.i(r7)     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r7 = move-exception
            goto L73
        L70:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L6e
            goto L77
        L73:
            com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
        L77:
            java.lang.Throwable r7 = com.amazon.aps.iva.kb0.k.a(r7)
            if (r7 == 0) goto L82
            com.amazon.aps.iva.mf0.a$a r0 = com.amazon.aps.iva.mf0.a.a
            r0.d(r7)
        L82:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b30.m.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (this.f.invoke().booleanValue()) {
            com.amazon.aps.iva.se0.i.d(this.e, null, null, new b(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
