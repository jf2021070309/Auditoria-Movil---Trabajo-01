package com.amazon.aps.iva.rs;

import android.app.Activity;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.rs.g;
import java.io.Serializable;
/* compiled from: BillingClientLifecycleWrapper.kt */
/* loaded from: classes2.dex */
public final class d implements f {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.ss.c b;
    public final v<g> c;
    public com.amazon.aps.iva.ue0.a d;
    public final com.amazon.aps.iva.ab.a e;

    /* compiled from: BillingClientLifecycleWrapper.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingClientLifecycle", f = "BillingClientLifecycleWrapper.kt", l = {226}, m = "findUnverifiedPurchase")
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
            return d.this.g(null, this);
        }
    }

    /* compiled from: BillingClientLifecycleWrapper.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingClientLifecycle", f = "BillingClientLifecycleWrapper.kt", l = {179}, m = "getProductDetails")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public d h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return d.this.b(null, this);
        }
    }

    public d(com.amazon.aps.iva.rs.a aVar, com.amazon.aps.iva.f20.c cVar, com.amazon.aps.iva.bo.e eVar) {
        this.a = cVar;
        this.b = eVar;
        v<g> vVar = new v<>();
        this.c = vVar;
        this.d = com.amazon.aps.iva.dg.b.c(-1, null, 6);
        com.android.billingclient.api.a b2 = aVar.b(new f0(this, 5));
        this.e = b2;
        if (!b2.k()) {
            vVar.k(g.b.a);
            b2.s(new com.amazon.aps.iva.rs.b(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
    @Override // com.amazon.aps.iva.rs.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(com.amazon.aps.iva.ob0.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.rs.c
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.rs.c r0 = (com.amazon.aps.iva.rs.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.rs.c r0 = new com.amazon.aps.iva.rs.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            java.lang.String r3 = "sku"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.String r1 = r0.i
            java.lang.Object r0 = r0.h
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.rs.d r2 = (com.amazon.aps.iva.rs.d) r2
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L56
        L42:
            com.amazon.aps.iva.ab.x.i0(r8)
            r7.f()
            r0.h = r7
            r0.l = r5
            com.amazon.aps.iva.ab.a r8 = r7.e
            java.lang.Object r8 = r7.g(r8, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r7
        L56:
            com.android.billingclient.api.Purchase r8 = (com.android.billingclient.api.Purchase) r8
            if (r8 == 0) goto L95
            java.util.ArrayList r5 = r8.a()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            java.lang.String r5 = (java.lang.String) r5
            com.amazon.aps.iva.ab.a r2 = r2.e
            com.amazon.aps.iva.yb0.j.e(r5, r3)
            r0.h = r8
            r0.i = r5
            r0.l = r4
            java.lang.Object r0 = com.amazon.aps.iva.rs.i.e(r2, r5, r0)
            if (r0 != r1) goto L76
            return r1
        L76:
            r1 = r5
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            com.android.billingclient.api.d r8 = (com.android.billingclient.api.d) r8
            com.amazon.aps.iva.rs.p r2 = new com.amazon.aps.iva.rs.p
            com.amazon.aps.iva.yb0.j.e(r1, r3)
            java.lang.String r8 = r8.e
            java.lang.String r3 = "productDetails.title"
            com.amazon.aps.iva.yb0.j.e(r8, r3)
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "purchase.purchaseToken"
            com.amazon.aps.iva.yb0.j.e(r0, r3)
            r2.<init>(r1, r8, r0)
            return r2
        L95:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.d.a(com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    @Override // com.amazon.aps.iva.rs.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.rs.o> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.rs.d.b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.rs.d$b r0 = (com.amazon.aps.iva.rs.d.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.rs.d$b r0 = new com.amazon.aps.iva.rs.d$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.rs.d r10 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L42
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.h = r9
            r0.k = r3
            com.amazon.aps.iva.ab.a r11 = r9.e
            java.lang.Object r11 = com.amazon.aps.iva.rs.i.e(r11, r10, r0)
            if (r11 != r1) goto L41
            return r1
        L41:
            r10 = r9
        L42:
            com.android.billingclient.api.d r11 = (com.android.billingclient.api.d) r11
            com.amazon.aps.iva.xb0.a<java.lang.Boolean> r0 = r10.a
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.amazon.aps.iva.ss.c r1 = r10.b
            com.amazon.aps.iva.rs.m r7 = com.amazon.aps.iva.rs.i.f(r11, r0, r1)
            java.lang.String r0 = "free-trial"
            com.android.billingclient.api.d$d r0 = com.amazon.aps.iva.rs.i.g(r11, r0)
            com.amazon.aps.iva.xb0.a<java.lang.Boolean> r10 = r10.a
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r2 = 0
            if (r10 == 0) goto L72
            java.lang.String r10 = "intro-price"
            com.android.billingclient.api.d$d r10 = com.amazon.aps.iva.rs.i.g(r11, r10)
            goto L73
        L72:
            r10 = r2
        L73:
            if (r10 != 0) goto L76
            goto L77
        L76:
            r0 = r10
        L77:
            if (r0 == 0) goto L7e
            com.android.billingclient.api.d$b r10 = com.amazon.aps.iva.rs.i.c(r0)
            goto L7f
        L7e:
            r10 = r2
        L7f:
            com.android.billingclient.api.d$d r0 = com.amazon.aps.iva.rs.i.b(r11)
            if (r0 == 0) goto L90
            com.android.billingclient.api.d$b r0 = com.amazon.aps.iva.rs.i.a(r0)
            if (r0 == 0) goto L90
            com.amazon.aps.iva.rs.n r0 = com.amazon.aps.iva.rs.i.i(r0, r1)
            goto L91
        L90:
            r0 = r2
        L91:
            com.amazon.aps.iva.yb0.j.c(r0)
            com.amazon.aps.iva.rs.o r8 = new com.amazon.aps.iva.rs.o
            java.lang.String r3 = r11.c
            java.lang.String r4 = "productDetails.productId"
            com.amazon.aps.iva.yb0.j.e(r3, r4)
            java.lang.String r4 = r11.e
            java.lang.String r11 = "productDetails.title"
            com.amazon.aps.iva.yb0.j.e(r4, r11)
            if (r10 == 0) goto Lb3
            java.lang.String r10 = r10.d
            java.lang.String r11 = "freeTrialPricingPhase.billingPeriod"
            com.amazon.aps.iva.yb0.j.e(r10, r11)
            com.amazon.aps.iva.ss.b r10 = r1.a(r10)
            r5 = r10
            goto Lb4
        Lb3:
            r5 = r2
        Lb4:
            if (r7 == 0) goto Lbf
            com.amazon.aps.iva.rs.n r10 = r7.a()
            if (r10 != 0) goto Lbd
            goto Lbf
        Lbd:
            r6 = r10
            goto Lc0
        Lbf:
            r6 = r0
        Lc0:
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.d.b(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.rs.f
    public final v c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.rs.f
    public final Serializable d(Activity activity, String str, String str2, int i, com.amazon.aps.iva.ob0.d dVar) {
        return h(activity, str2, str, i, dVar);
    }

    @Override // com.amazon.aps.iva.rs.f
    public final void destroy() {
        com.amazon.aps.iva.ab.a aVar = this.e;
        if (aVar.k()) {
            aVar.f();
        }
        this.c.k(g.c.a);
    }

    @Override // com.amazon.aps.iva.rs.f
    public final Serializable e(Activity activity, String str, com.amazon.aps.iva.ob0.d dVar) {
        return h(activity, str, null, 2, dVar);
    }

    public final void f() {
        g d = this.c.d();
        if (!(d instanceof g.e)) {
            if (!(d instanceof g.d)) {
                return;
            }
            throw new h(((g.d) d).a);
        }
        throw new h(((g.e) d).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.amazon.aps.iva.ab.a r8, com.amazon.aps.iva.ob0.d<? super com.android.billingclient.api.Purchase> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.rs.d.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.rs.d$a r0 = (com.amazon.aps.iva.rs.d.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.rs.d$a r0 = new com.amazon.aps.iva.rs.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L5a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.j = r3
            com.amazon.aps.iva.ob0.i r9 = new com.amazon.aps.iva.ob0.i
            com.amazon.aps.iva.ob0.d r0 = com.amazon.aps.iva.a60.b.s(r0)
            r9.<init>(r0)
            com.amazon.aps.iva.ab.m$a r0 = new com.amazon.aps.iva.ab.m$a
            r0.<init>()
            java.lang.String r2 = "subs"
            r0.a = r2
            com.amazon.aps.iva.ab.m r2 = new com.amazon.aps.iva.ab.m
            r2.<init>(r0)
            com.amazon.aps.iva.rs.j r0 = new com.amazon.aps.iva.rs.j
            r0.<init>(r9)
            r8.p(r2, r0)
            java.lang.Object r9 = r9.a()
            if (r9 != r1) goto L5a
            return r1
        L5a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L65:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r9.next()
            r1 = r0
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            com.amazon.aps.iva.if0.c r1 = r1.c
            java.lang.String r2 = "acknowledged"
            boolean r1 = r1.optBoolean(r2, r3)
            r1 = r1 ^ r3
            if (r1 == 0) goto L65
            r8.add(r0)
            goto L65
        L81:
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L8d
            r8 = 0
            goto Lbe
        L8d:
            java.lang.Object r9 = r8.next()
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L99
        L97:
            r8 = r9
            goto Lbe
        L99:
            r0 = r9
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            com.amazon.aps.iva.if0.c r0 = r0.c
            java.lang.String r1 = "purchaseTime"
            long r2 = r0.optLong(r1)
        La4:
            java.lang.Object r0 = r8.next()
            r4 = r0
            com.android.billingclient.api.Purchase r4 = (com.android.billingclient.api.Purchase) r4
            com.amazon.aps.iva.if0.c r4 = r4.c
            long r4 = r4.optLong(r1)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lb7
            r9 = r0
            r2 = r4
        Lb7:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto La4
            goto L97
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.d.g(com.amazon.aps.iva.ab.a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188 A[EDGE_INSN: B:66:0x0188->B:52:0x0188 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(android.app.Activity r19, java.lang.String r20, java.lang.String r21, int r22, com.amazon.aps.iva.ob0.d r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.d.h(android.app.Activity, java.lang.String, java.lang.String, int, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }
}
