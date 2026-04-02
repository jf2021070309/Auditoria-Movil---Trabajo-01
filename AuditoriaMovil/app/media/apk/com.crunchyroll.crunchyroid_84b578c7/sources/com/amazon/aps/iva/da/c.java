package com.amazon.aps.iva.da;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.v1;
/* compiled from: LottieAnimatable.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ float m;
    public final /* synthetic */ j n;
    public final /* synthetic */ com.amazon.aps.iva.z9.h o;
    public final /* synthetic */ float p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ i s;

    /* compiled from: LottieAnimatable.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ i i;
        public final /* synthetic */ j1 j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ f m;

        /* compiled from: LottieAnimatable.kt */
        /* renamed from: com.amazon.aps.iva.da.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0194a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[i.values().length];
                iArr[i.OnIterationFinish.ordinal()] = 1;
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, j1 j1Var, int i, int i2, f fVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = iVar;
            this.j = j1Var;
            this.k = i;
            this.l = i2;
            this.m = fVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0057 -> B:23:0x005b). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r6.h
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                com.amazon.aps.iva.ab.x.i0(r7)
                r1 = r0
                r0 = r6
                goto L5b
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                com.amazon.aps.iva.ab.x.i0(r7)
                r7 = r6
            L1b:
                int[] r1 = com.amazon.aps.iva.da.c.a.C0194a.a
                com.amazon.aps.iva.da.i r3 = r7.i
                int r3 = r3.ordinal()
                r1 = r1[r3]
                if (r1 != r2) goto L33
                com.amazon.aps.iva.se0.j1 r1 = r7.j
                boolean r1 = r1.isActive()
                if (r1 == 0) goto L30
                goto L33
            L30:
                int r1 = r7.l
                goto L35
            L33:
                int r1 = r7.k
            L35:
                r7.h = r2
                com.amazon.aps.iva.da.f r3 = r7.m
                r3.getClass()
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != r4) goto L4b
                com.amazon.aps.iva.da.d r4 = new com.amazon.aps.iva.da.d
                r4.<init>(r3, r1)
                java.lang.Object r1 = com.amazon.aps.iva.z.f0.a(r4, r7)
                goto L54
            L4b:
                com.amazon.aps.iva.da.e r4 = new com.amazon.aps.iva.da.e
                r4.<init>(r3, r1)
                java.lang.Object r1 = com.amazon.aps.iva.o0.j1.b(r4, r7)
            L54:
                if (r1 != r0) goto L57
                return r0
            L57:
                r5 = r0
                r0 = r7
                r7 = r1
                r1 = r5
            L5b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L66
                com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                return r7
            L66:
                r7 = r0
                r0 = r1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.da.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LottieAnimatable.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.OnIterationFinish.ordinal()] = 1;
            iArr[i.Immediately.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, int i, int i2, boolean z, float f, j jVar, com.amazon.aps.iva.z9.h hVar, float f2, boolean z2, boolean z3, i iVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(1, dVar);
        this.i = fVar;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = f;
        this.n = jVar;
        this.o = hVar;
        this.p = f2;
        this.q = z2;
        this.r = z3;
        this.s = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ob0.g gVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        f fVar = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                fVar.n(this.j);
                int i2 = this.k;
                fVar.d.setValue(Integer.valueOf(i2));
                fVar.e.setValue(Boolean.valueOf(this.l));
                float f = this.m;
                fVar.g.setValue(Float.valueOf(f));
                fVar.f.setValue(this.n);
                y1 y1Var = fVar.j;
                com.amazon.aps.iva.z9.h hVar = this.o;
                y1Var.setValue(hVar);
                fVar.p(this.p);
                fVar.h.setValue(Boolean.valueOf(this.q));
                if (!this.r) {
                    fVar.m.setValue(Long.MIN_VALUE);
                }
                if (hVar == null) {
                    f.g(fVar, false);
                    return com.amazon.aps.iva.kb0.q.a;
                } else if (Float.isInfinite(f)) {
                    fVar.p(fVar.k());
                    f.g(fVar, false);
                    fVar.n(i2);
                    return com.amazon.aps.iva.kb0.q.a;
                } else {
                    f.g(fVar, true);
                    int i3 = b.a[this.s.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            gVar = com.amazon.aps.iva.ob0.h.b;
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    } else {
                        gVar = v1.b;
                    }
                    a aVar2 = new a(this.s, com.amazon.aps.iva.a60.b.q(getContext()), this.k, this.j, this.i, null);
                    this.h = 1;
                    if (com.amazon.aps.iva.se0.i.g(this, gVar, aVar2) == aVar) {
                        return aVar;
                    }
                }
            }
            com.amazon.aps.iva.a60.b.p(getContext());
            f.g(fVar, false);
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            f.g(fVar, false);
            throw th;
        }
    }
}
