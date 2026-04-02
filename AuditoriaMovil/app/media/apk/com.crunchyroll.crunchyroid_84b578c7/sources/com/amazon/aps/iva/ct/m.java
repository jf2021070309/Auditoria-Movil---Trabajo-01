package com.amazon.aps.iva.ct;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import java.util.Date;
import java.util.List;
/* compiled from: UserBenefitsSynchronizer.kt */
/* loaded from: classes2.dex */
public final class m implements l, com.amazon.aps.iva.ys.d {
    public final g b;
    public final com.amazon.aps.iva.xb0.a<q> c;
    public final j d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final g0 f;
    public final com.amazon.aps.iva.ob0.g g;
    public final e h;
    public final LifecycleAwareState<q> i;
    public long j;
    public final v<com.amazon.aps.iva.ez.g<List<Benefit>>> k;

    /* compiled from: UserBenefitsSynchronizer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "it");
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: UserBenefitsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.benefits.UserBenefitsSynchronizerImpl$onAppResume$1", f = "UserBenefitsSynchronizer.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
            return q.a;
        }
    }

    /* compiled from: UserBenefitsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.benefits.UserBenefitsSynchronizerImpl", f = "UserBenefitsSynchronizer.kt", l = {70}, m = "synchronize")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public m h;
        public List i;
        public v j;
        public /* synthetic */ Object k;
        public int m;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    /* compiled from: UserBenefitsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.benefits.UserBenefitsSynchronizerImpl$synchronize$2$1", f = "UserBenefitsSynchronizer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            LifecycleAwareState<q> lifecycleAwareState = m.this.i;
            q qVar = q.a;
            lifecycleAwareState.b(qVar);
            return qVar;
        }
    }

    public m(com.ellation.crunchyroll.application.d dVar, f fVar, h hVar, k kVar, t1 t1Var, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        d1 d1Var = d1.b;
        this.b = hVar;
        this.c = aVar;
        this.d = kVar;
        this.e = aVar2;
        this.f = d1Var;
        this.g = t1Var;
        this.h = fVar;
        this.i = new LifecycleAwareState<>();
        this.j = new Date().getTime();
        this.k = new v<>();
        dVar.Lf(this);
    }

    @Override // com.amazon.aps.iva.ct.l
    public final void H5() {
        this.d.clear();
    }

    @Override // com.amazon.aps.iva.ct.i
    public final LiveData V3() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.ct.d
    public final void a(o oVar, com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.i.a(oVar.getLifecycle(), new a(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:12:0x002c, B:23:0x0070, B:25:0x008f, B:26:0x00a1), top: B:37:0x002c }] */
    @Override // com.amazon.aps.iva.ct.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.ct.m.c
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.ct.m$c r0 = (com.amazon.aps.iva.ct.m.c) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.ct.m$c r0 = new com.amazon.aps.iva.ct.m$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            com.amazon.aps.iva.i5.v r1 = r0.j
            java.util.List r2 = r0.i
            java.util.List r2 = (java.util.List) r2
            com.amazon.aps.iva.ct.m r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> Lad
            goto L70
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.xb0.a<java.lang.Boolean> r8 = r7.e
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lbe
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<java.util.List<com.ellation.crunchyroll.api.etp.subscription.model.Benefit>>> r8 = r7.k
            com.amazon.aps.iva.ez.g$b r2 = new com.amazon.aps.iva.ez.g$b
            r2.<init>(r3)
            r8.i(r2)
            com.amazon.aps.iva.ct.j r2 = r7.d     // Catch: java.lang.Throwable -> Laf
            java.util.List r2 = r2.R0()     // Catch: java.lang.Throwable -> Laf
            com.amazon.aps.iva.ct.g r5 = r7.b     // Catch: java.lang.Throwable -> Laf
            r0.h = r7     // Catch: java.lang.Throwable -> Laf
            r6 = r2
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Laf
            r0.i = r6     // Catch: java.lang.Throwable -> Laf
            r0.j = r8     // Catch: java.lang.Throwable -> Laf
            r0.m = r4     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r5.m0(r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r1 = r8
            r8 = r0
            r0 = r7
        L70:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lad
            com.amazon.aps.iva.ct.j r4 = r0.d     // Catch: java.lang.Throwable -> Lad
            r4.clear()     // Catch: java.lang.Throwable -> Lad
            com.amazon.aps.iva.ct.j r4 = r0.d     // Catch: java.lang.Throwable -> Lad
            r4.n1(r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> Lad
            java.util.Set r2 = com.amazon.aps.iva.lb0.x.c1(r2)     // Catch: java.lang.Throwable -> Lad
            r4 = r8
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> Lad
            java.util.Set r4 = com.amazon.aps.iva.lb0.x.c1(r4)     // Catch: java.lang.Throwable -> Lad
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r4)     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto La1
            com.amazon.aps.iva.se0.g0 r2 = r0.f     // Catch: java.lang.Throwable -> Lad
            com.amazon.aps.iva.ob0.g r4 = r0.g     // Catch: java.lang.Throwable -> Lad
            com.amazon.aps.iva.ct.m$d r5 = new com.amazon.aps.iva.ct.m$d     // Catch: java.lang.Throwable -> Lad
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lad
            r6 = 2
            com.amazon.aps.iva.se0.i.d(r2, r4, r3, r5, r6)     // Catch: java.lang.Throwable -> Lad
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r2 = r0.c     // Catch: java.lang.Throwable -> Lad
            r2.invoke()     // Catch: java.lang.Throwable -> Lad
        La1:
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> Lad
            r2.<init>()     // Catch: java.lang.Throwable -> Lad
            long r2 = r2.getTime()     // Catch: java.lang.Throwable -> Lad
            r0.j = r2     // Catch: java.lang.Throwable -> Lad
            goto Lb6
        Lad:
            r8 = move-exception
            goto Lb2
        Laf:
            r0 = move-exception
            r1 = r8
            r8 = r0
        Lb2:
            com.amazon.aps.iva.kb0.k$a r8 = com.amazon.aps.iva.ab.x.H(r8)
        Lb6:
            com.amazon.aps.iva.ez.g r8 = com.amazon.aps.iva.ez.h.e(r8)
            r1.i(r8)
            goto Lc1
        Lbe:
            r7.H5()
        Lc1:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ct.m.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (new Date().getTime() - this.j >= this.h.a()) {
            com.amazon.aps.iva.se0.i.d(this.f, null, null, new b(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
