package com.amazon.aps.iva.d30;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.rs.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: CrPlusSubscriptionProductsViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.ez.b implements d {
    public final com.amazon.aps.iva.rs.f b;
    public final com.amazon.aps.iva.b30.a c;
    public final com.amazon.aps.iva.rs.k d;
    public final com.amazon.aps.iva.f20.h e;
    public String f;
    public final com.amazon.aps.iva.wh.c g;
    public final com.amazon.aps.iva.xb0.a<q> h;
    public final com.amazon.aps.iva.i20.e i;
    public final v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> j;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> k;
    public final v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> l;

    /* compiled from: CrPlusSubscriptionProductsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl$handleBillingConnectionStatus$1", f = "CrPlusSubscriptionProductsViewModel.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public v h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.i5.v] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> vVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    vVar = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                e eVar = e.this;
                v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> vVar2 = eVar.l;
                this.h = vVar2;
                this.i = 1;
                obj = e.N8(eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                vVar = vVar2;
            }
            vVar.k(obj);
            return q.a;
        }
    }

    /* compiled from: CrPlusSubscriptionProductsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl$launchSubscriptionFlow$1", f = "CrPlusSubscriptionProductsViewModel.kt", l = {89, 90}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public com.amazon.aps.iva.fs.b h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ com.amazon.aps.iva.b30.c l;
        public final /* synthetic */ com.amazon.aps.iva.fs.b m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.b30.c cVar, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.l = cVar;
            this.m = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.l, this.m, dVar);
            bVar.j = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            Throwable a;
            com.amazon.aps.iva.fs.b bVar;
            e eVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            e eVar2 = e.this;
            try {
            } catch (Throwable th) {
                H = x.H(th);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        H = (com.amazon.aps.iva.wh.a) obj;
                        a = com.amazon.aps.iva.kb0.k.a(H);
                        if (a != null && !(a instanceof com.amazon.aps.iva.b30.q)) {
                            eVar2.i.d(a);
                        }
                        eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = this.h;
                eVar = (e) this.j;
                x.i0(obj);
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.j;
                com.amazon.aps.iva.b30.c cVar = this.l;
                bVar = this.m;
                com.amazon.aps.iva.rs.k kVar = eVar2.d;
                com.amazon.aps.iva.yb0.j.c(cVar);
                String str = cVar.b;
                this.j = eVar2;
                this.h = bVar;
                this.i = 1;
                obj = kVar.c(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar = eVar2;
            }
            this.j = null;
            this.h = null;
            this.i = 2;
            obj = e.O8(eVar, (com.amazon.aps.iva.rs.p) obj, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
            H = (com.amazon.aps.iva.wh.a) obj;
            a = com.amazon.aps.iva.kb0.k.a(H);
            if (a != null) {
                eVar2.i.d(a);
            }
            eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
            return q.a;
        }
    }

    /* compiled from: CrPlusSubscriptionProductsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl$launchUpgradeFlow$1", f = "CrPlusSubscriptionProductsViewModel.kt", l = {106, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public com.amazon.aps.iva.fs.b h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ String l;
        public final /* synthetic */ com.amazon.aps.iva.fs.b m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.l = str;
            this.m = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(this.l, this.m, dVar);
            cVar.j = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            Throwable a;
            com.amazon.aps.iva.fs.b bVar;
            e eVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            e eVar2 = e.this;
            try {
            } catch (Throwable th) {
                H = x.H(th);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        H = (com.amazon.aps.iva.wh.a) obj;
                        a = com.amazon.aps.iva.kb0.k.a(H);
                        if (a != null && !(a instanceof com.amazon.aps.iva.b30.q)) {
                            eVar2.i.d(a);
                        }
                        eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = this.h;
                eVar = (e) this.j;
                x.i0(obj);
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.j;
                String str = this.l;
                bVar = this.m;
                com.amazon.aps.iva.rs.k kVar = eVar2.d;
                com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = eVar2.k.d();
                com.amazon.aps.iva.yb0.j.c(d);
                String str2 = d.b.b;
                this.j = eVar2;
                this.h = bVar;
                this.i = 1;
                obj = kVar.b(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar = eVar2;
            }
            this.j = null;
            this.h = null;
            this.i = 2;
            obj = e.O8(eVar, (com.amazon.aps.iva.rs.p) obj, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
            H = (com.amazon.aps.iva.wh.a) obj;
            a = com.amazon.aps.iva.kb0.k.a(H);
            if (a != null) {
                eVar2.i.d(a);
            }
            eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
            return q.a;
        }
    }

    public e() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.rs.f fVar, com.amazon.aps.iva.b30.a aVar, com.amazon.aps.iva.rs.k kVar, com.amazon.aps.iva.f20.h hVar, String str, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.i20.e eVar, int i) {
        super(aVar, hVar);
        str = (i & 16) != 0 ? "crunchyroll.google.fanpack.monthly" : str;
        com.amazon.aps.iva.wh.c cVar = null;
        if ((i & 32) != 0) {
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                cVar = iVar.j().invoke();
            } else {
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.f(fVar, "billingLifecycle");
        com.amazon.aps.iva.yb0.j.f(aVar, "subscriptionInteractor");
        com.amazon.aps.iva.yb0.j.f(kVar, "billingFlowLauncher");
        com.amazon.aps.iva.yb0.j.f(hVar, "subscriptionVerifyInteractor");
        com.amazon.aps.iva.yb0.j.f(str, "preselectedTierSku");
        com.amazon.aps.iva.yb0.j.f(cVar, "preselectedTierConfig");
        com.amazon.aps.iva.yb0.j.f(eVar, "analytics");
        this.b = fVar;
        this.c = aVar;
        this.d = kVar;
        this.e = hVar;
        this.f = str;
        this.g = cVar;
        this.h = aVar2;
        this.i = eVar;
        this.j = new v<>();
        this.k = new v<>();
        this.l = d0.c(fVar.c(), new h(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N8(com.amazon.aps.iva.d30.e r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.d30.g
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.d30.g r0 = (com.amazon.aps.iva.d30.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            com.amazon.aps.iva.d30.g r0 = new com.amazon.aps.iva.d30.g
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            com.amazon.aps.iva.d30.e r5 = r0.i
            com.amazon.aps.iva.d30.e r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r5 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<java.util.List<com.amazon.aps.iva.b30.c>>> r6 = r5.l
            com.amazon.aps.iva.ez.h.c(r6, r3)
            com.amazon.aps.iva.b30.a r6 = r5.c     // Catch: java.lang.Throwable -> L5a
            r0.h = r5     // Catch: java.lang.Throwable -> L5a
            r0.i = r5     // Catch: java.lang.Throwable -> L5a
            r0.l = r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r6.e0(r0)     // Catch: java.lang.Throwable -> L5a
            if (r6 != r1) goto L50
            goto L8a
        L50:
            r0 = r5
        L51:
            r1 = r6
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2f
            r5.Q8(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2f
            goto L61
        L5a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L5d:
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r5)
        L61:
            java.lang.Throwable r5 = com.amazon.aps.iva.kb0.k.a(r6)
            if (r5 == 0) goto L86
            com.amazon.aps.iva.i20.e r6 = r0.i
            r6.g(r5)
            com.amazon.aps.iva.mf0.a$a r6 = com.amazon.aps.iva.mf0.a.a
            r6.d(r5)
            boolean r6 = r5 instanceof com.amazon.aps.iva.rs.h
            if (r6 == 0) goto L7b
            com.amazon.aps.iva.ez.g$a r1 = new com.amazon.aps.iva.ez.g$a
            r1.<init>(r3, r5)
            goto L8a
        L7b:
            com.amazon.aps.iva.ez.g$a r1 = new com.amazon.aps.iva.ez.g$a
            com.amazon.aps.iva.d30.k r5 = new com.amazon.aps.iva.d30.k
            r5.<init>()
            r1.<init>(r3, r5)
            goto L8a
        L86:
            com.amazon.aps.iva.ez.g r1 = com.amazon.aps.iva.ez.h.e(r6)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d30.e.N8(com.amazon.aps.iva.d30.e, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable O8(com.amazon.aps.iva.d30.e r11, com.amazon.aps.iva.rs.p r12, com.amazon.aps.iva.fs.b r13, com.amazon.aps.iva.ob0.d r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof com.amazon.aps.iva.d30.i
            if (r0 == 0) goto L16
            r0 = r14
            com.amazon.aps.iva.d30.i r0 = (com.amazon.aps.iva.d30.i) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            com.amazon.aps.iva.d30.i r0 = new com.amazon.aps.iva.d30.i
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            com.amazon.aps.iva.b30.c r11 = r0.i
            com.amazon.aps.iva.rs.p r12 = r0.h
            com.amazon.aps.iva.ab.x.i0(r14)
            r5 = r12
            goto L79
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            com.amazon.aps.iva.ab.x.i0(r14)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> r14 = r11.k
            java.lang.Object r14 = r14.d()
            com.amazon.aps.iva.ez.d r14 = (com.amazon.aps.iva.ez.d) r14
            if (r14 == 0) goto L4a
            T r14 = r14.b
            com.amazon.aps.iva.b30.c r14 = (com.amazon.aps.iva.b30.c) r14
            goto L4b
        L4a:
            r14 = r3
        L4b:
            if (r14 == 0) goto L50
            java.lang.String r2 = r14.b
            goto L51
        L50:
            r2 = r3
        L51:
            if (r14 == 0) goto L56
            java.lang.String r5 = r14.c
            goto L57
        L56:
            r5 = r3
        L57:
            com.amazon.aps.iva.i20.e r6 = r11.i
            r6.f(r13, r2, r5)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> r13 = r11.j
            com.amazon.aps.iva.ez.h.c(r13, r3)
            com.amazon.aps.iva.se0.v1 r13 = com.amazon.aps.iva.se0.v1.b
            com.amazon.aps.iva.d30.j r2 = new com.amazon.aps.iva.d30.j
            r2.<init>(r11, r12, r3)
            r0.h = r12
            r0.i = r14
            r0.l = r4
            java.lang.Object r11 = com.amazon.aps.iva.se0.i.g(r0, r13, r2)
            if (r11 != r1) goto L75
            goto L92
        L75:
            r5 = r12
            r10 = r14
            r14 = r11
            r11 = r10
        L79:
            com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse r14 = (com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse) r14
            com.amazon.aps.iva.wh.a r1 = new com.amazon.aps.iva.wh.a
            java.lang.String r6 = r14.getPromotionCode()
            java.lang.String r7 = r14.getPromotionType()
            if (r11 == 0) goto L89
            com.amazon.aps.iva.rs.m r3 = r11.i
        L89:
            r8 = r3
            com.ellation.crunchyroll.api.etp.externalparteners.model.PurchasePaymentState r9 = r14.getPaymentState()
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d30.e.O8(com.amazon.aps.iva.d30.e, com.amazon.aps.iva.rs.p, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void E6(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new c(str, bVar, null), 3);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData H0() {
        return this.l;
    }

    public final void P8(com.amazon.aps.iva.rs.g gVar) {
        boolean a2 = com.amazon.aps.iva.yb0.j.a(gVar, g.b.a);
        v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> vVar = this.l;
        if (a2) {
            vVar.k(new g.b(null));
        } else if (com.amazon.aps.iva.yb0.j.a(gVar, g.a.a)) {
            com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
        } else if (gVar instanceof g.d) {
            vVar.k(new g.a(null, new com.amazon.aps.iva.rs.h("Google Billing is unavailable")));
        } else {
            com.amazon.aps.iva.rs.h hVar = new com.amazon.aps.iva.rs.h("Billing operation failed");
            vVar.k(new g.a(null, hVar));
            this.i.g(hVar);
        }
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void Q7(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.b30.c cVar;
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = this.k.d();
        if (d != null) {
            cVar = d.b;
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(cVar, bVar, null), 3);
    }

    public final void Q8(List<com.amazon.aps.iva.b30.c> list) {
        Object obj;
        com.amazon.aps.iva.wh.c cVar = this.g;
        Object obj2 = null;
        if (cVar.isEnabled()) {
            List<com.amazon.aps.iva.b30.c> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.b30.c) obj).b, cVar.a().getSku())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.amazon.aps.iva.b30.c cVar2 = (com.amazon.aps.iva.b30.c) obj;
            if (cVar2 != null) {
                this.f = cVar.a().getSku();
            } else {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.b30.c) next).b, this.f)) {
                        obj2 = next;
                        break;
                    }
                }
                cVar2 = (com.amazon.aps.iva.b30.c) obj2;
                if (cVar2 == null) {
                    cVar2 = (com.amazon.aps.iva.b30.c) com.amazon.aps.iva.lb0.x.t0(list);
                }
            }
            p2(cVar2);
            return;
        }
        List<com.amazon.aps.iva.b30.c> list3 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = list3.iterator();
        while (true) {
            boolean z = true;
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((com.amazon.aps.iva.b30.c) next2).i == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next2);
            }
        }
        if (arrayList.size() == 1) {
            this.f = ((com.amazon.aps.iva.b30.c) com.amazon.aps.iva.lb0.x.t0(arrayList)).b;
        }
        Iterator<T> it4 = list3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.b30.c) next3).b, this.f)) {
                obj2 = next3;
                break;
            }
        }
        com.amazon.aps.iva.b30.c cVar3 = (com.amazon.aps.iva.b30.c) obj2;
        if (cVar3 == null) {
            cVar3 = (com.amazon.aps.iva.b30.c) com.amazon.aps.iva.lb0.x.t0(list);
        }
        p2(cVar3);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData R7() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData e1() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void n4() {
        com.amazon.aps.iva.ez.h.c(this.l, null);
        P8((com.amazon.aps.iva.rs.g) this.b.c().d());
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        this.h.invoke();
        super.onCleared();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void p2(com.amazon.aps.iva.b30.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "tier");
        this.k.k(new com.amazon.aps.iva.ez.d<>(cVar));
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void w5(com.amazon.aps.iva.fs.b bVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new f(this, str, "crunchyroll.google.premium.monthly", bVar, null), 3);
    }
}
