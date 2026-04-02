package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.a0.g1;
import com.amazon.aps.iva.g0.i;
import com.amazon.aps.iva.se0.j1;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
/* compiled from: ContentInViewModifier.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.g0.h, com.amazon.aps.iva.s1.p0, com.amazon.aps.iva.s1.o0 {
    public final com.amazon.aps.iva.se0.g0 c;
    public final f0 d;
    public final t0 e;
    public final boolean f;
    public final com.amazon.aps.iva.b0.b g;
    public com.amazon.aps.iva.s1.q h;
    public com.amazon.aps.iva.s1.q i;
    public com.amazon.aps.iva.e1.e j;
    public boolean k;
    public long l;
    public boolean m;
    public final e1 n;
    public final com.amazon.aps.iva.a1.f o;

    /* compiled from: ContentInViewModifier.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> a;
        public final com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> b;

        public a(i.a.C0282a.C0283a c0283a, com.amazon.aps.iva.se0.n nVar) {
            this.a = c0283a;
            this.b = nVar;
        }

        public final String toString() {
            com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> mVar = this.b;
            com.amazon.aps.iva.se0.f0 f0Var = (com.amazon.aps.iva.se0.f0) mVar.getContext().get(com.amazon.aps.iva.se0.f0.b);
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            com.amazon.aps.iva.ab.x.x(16);
            String num = Integer.toString(hashCode, 16);
            com.amazon.aps.iva.yb0.j.e(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            sb.append("(currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(mVar);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.b0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0121c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: ContentInViewModifier.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", l = {198}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.b0.c$c$a */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ c j;
            public final /* synthetic */ j1 k;

            /* compiled from: ContentInViewModifier.kt */
            /* renamed from: com.amazon.aps.iva.b0.c$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0122a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, com.amazon.aps.iva.kb0.q> {
                public final /* synthetic */ c h;
                public final /* synthetic */ n0 i;
                public final /* synthetic */ j1 j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0122a(c cVar, n0 n0Var, j1 j1Var) {
                    super(1);
                    this.h = cVar;
                    this.i = n0Var;
                    this.j = j1Var;
                }

                @Override // com.amazon.aps.iva.xb0.l
                public final com.amazon.aps.iva.kb0.q invoke(Float f) {
                    float f2;
                    float floatValue = f.floatValue();
                    if (this.h.f) {
                        f2 = 1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    float a = this.i.a(f2 * floatValue) * f2;
                    if (a < floatValue) {
                        this.j.a(com.amazon.aps.iva.e.z.h("Scroll animation cancelled because scroll was not consumed (" + a + " < " + floatValue + ')', null));
                    }
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }

            /* compiled from: ContentInViewModifier.kt */
            /* renamed from: com.amazon.aps.iva.b0.c$c$a$b */
            /* loaded from: classes.dex */
            public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
                public final /* synthetic */ c h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(c cVar) {
                    super(0);
                    this.h = cVar;
                }

                @Override // com.amazon.aps.iva.xb0.a
                public final com.amazon.aps.iva.kb0.q invoke() {
                    boolean z;
                    boolean a;
                    c cVar = this.h;
                    com.amazon.aps.iva.b0.b bVar = cVar.g;
                    while (true) {
                        z = true;
                        if (!bVar.a.j()) {
                            break;
                        }
                        com.amazon.aps.iva.p0.f<a> fVar = bVar.a;
                        if (!fVar.i()) {
                            com.amazon.aps.iva.e1.e invoke = fVar.b[fVar.d - 1].a.invoke();
                            if (invoke == null) {
                                a = true;
                            } else {
                                a = com.amazon.aps.iva.e1.c.a(cVar.C(cVar.l, invoke), com.amazon.aps.iva.e1.c.b);
                            }
                            if (!a) {
                                break;
                            }
                            fVar.l(fVar.d - 1).b.resumeWith(com.amazon.aps.iva.kb0.q.a);
                        } else {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                    }
                    if (cVar.k) {
                        com.amazon.aps.iva.e1.e y = cVar.y();
                        if (y == null || !com.amazon.aps.iva.e1.c.a(cVar.C(cVar.l, y), com.amazon.aps.iva.e1.c.b)) {
                            z = false;
                        }
                        if (z) {
                            cVar.k = false;
                        }
                    }
                    cVar.n.d = c.x(cVar);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, j1 j1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.j = cVar;
                this.k = j1Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                a aVar = new a(this.j, this.k, dVar);
                aVar.i = obj;
                return aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    c cVar = this.j;
                    cVar.n.d = c.x(cVar);
                    C0122a c0122a = new C0122a(cVar, (n0) this.i, this.k);
                    b bVar = new b(cVar);
                    this.h = 1;
                    if (cVar.n.a(c0122a, bVar, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public C0121c(com.amazon.aps.iva.ob0.d<? super C0121c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0121c c0121c = new C0121c(dVar);
            c0121c.i = obj;
            return c0121c;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((C0121c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object f;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            CancellationException cancellationException = null;
            c cVar = c.this;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        j1 q = com.amazon.aps.iva.a60.b.q(((com.amazon.aps.iva.se0.g0) this.i).getCoroutineContext());
                        cVar.m = true;
                        t0 t0Var = cVar.e;
                        a aVar2 = new a(cVar, q, null);
                        this.h = 1;
                        f = t0Var.f(g1.Default, aVar2, this);
                        if (f == aVar) {
                            return aVar;
                        }
                    }
                    cVar.g.b();
                    cVar.m = false;
                    cVar.g.a(null);
                    cVar.k = false;
                    return com.amazon.aps.iva.kb0.q.a;
                } catch (CancellationException e) {
                    cancellationException = e;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                cVar.m = false;
                cVar.g.a(cancellationException);
                cVar.k = false;
                throw th;
            }
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.s1.q qVar) {
            c.this.i = qVar;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c(com.amazon.aps.iva.se0.g0 g0Var, f0 f0Var, t0 t0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        com.amazon.aps.iva.yb0.j.f(t0Var, "scrollState");
        this.c = g0Var;
        this.d = f0Var;
        this.e = t0Var;
        this.f = z;
        this.g = new com.amazon.aps.iva.b0.b();
        this.l = 0L;
        this.n = new e1();
        this.o = androidx.compose.foundation.relocation.b.a(androidx.compose.foundation.k.a(this, new d()), this);
    }

    public static float B(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) >= Math.abs(f4)) {
            return f4;
        }
        return f;
    }

    public static final float x(c cVar) {
        com.amazon.aps.iva.e1.e eVar;
        int compare;
        if (!com.amazon.aps.iva.o2.j.a(cVar.l, 0L)) {
            com.amazon.aps.iva.p0.f<a> fVar = cVar.g.a;
            int i = fVar.d;
            f0 f0Var = cVar.d;
            com.amazon.aps.iva.e1.e eVar2 = null;
            if (i > 0) {
                int i2 = i - 1;
                a[] aVarArr = fVar.b;
                eVar = null;
                do {
                    com.amazon.aps.iva.e1.e invoke = aVarArr[i2].a.invoke();
                    if (invoke != null) {
                        long d2 = com.amazon.aps.iva.ab.r.d(invoke.c - invoke.a, invoke.d - invoke.b);
                        long b2 = com.amazon.aps.iva.o2.k.b(cVar.l);
                        int i3 = b.a[f0Var.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                compare = Float.compare(com.amazon.aps.iva.e1.g.d(d2), com.amazon.aps.iva.e1.g.d(b2));
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                        } else {
                            compare = Float.compare(com.amazon.aps.iva.e1.g.b(d2), com.amazon.aps.iva.e1.g.b(b2));
                        }
                        if (compare > 0) {
                            break;
                        }
                        eVar = invoke;
                    }
                    i2--;
                } while (i2 >= 0);
            } else {
                eVar = null;
            }
            if (eVar == null) {
                if (cVar.k) {
                    eVar2 = cVar.y();
                }
                if (eVar2 != null) {
                    eVar = eVar2;
                }
            }
            long b3 = com.amazon.aps.iva.o2.k.b(cVar.l);
            int i4 = b.a[f0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return B(eVar.a, eVar.c, com.amazon.aps.iva.e1.g.d(b3));
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return B(eVar.b, eVar.d, com.amazon.aps.iva.e1.g.b(b3));
        }
        return 0.0f;
    }

    public final void A() {
        if (!this.m) {
            com.amazon.aps.iva.se0.i.d(this.c, null, com.amazon.aps.iva.se0.h0.UNDISPATCHED, new C0121c(null), 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final long C(long j, com.amazon.aps.iva.e1.e eVar) {
        long b2 = com.amazon.aps.iva.o2.k.b(j);
        int i = b.a[this.d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                float d2 = com.amazon.aps.iva.e1.g.d(b2);
                return com.amazon.aps.iva.e1.d.d(B(eVar.a, eVar.c, d2), 0.0f);
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        float b3 = com.amazon.aps.iva.e1.g.b(b2);
        return com.amazon.aps.iva.e1.d.d(0.0f, B(eVar.b, eVar.d, b3));
    }

    @Override // com.amazon.aps.iva.s1.p0
    public final void i(long j) {
        int h;
        com.amazon.aps.iva.e1.e y;
        long j2 = this.l;
        this.l = j;
        int i = b.a[this.d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                h = com.amazon.aps.iva.yb0.j.h((int) (j >> 32), (int) (j2 >> 32));
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            h = com.amazon.aps.iva.yb0.j.h(com.amazon.aps.iva.o2.j.b(j), com.amazon.aps.iva.o2.j.b(j2));
        }
        if (h < 0 && (y = y()) != null) {
            com.amazon.aps.iva.e1.e eVar = this.j;
            if (eVar == null) {
                eVar = y;
            }
            if (!this.m && !this.k) {
                long C = C(j2, eVar);
                long j3 = com.amazon.aps.iva.e1.c.b;
                if (com.amazon.aps.iva.e1.c.a(C, j3) && !com.amazon.aps.iva.e1.c.a(C(j, y), j3)) {
                    this.k = true;
                    A();
                }
            }
            this.j = y;
        }
    }

    @Override // com.amazon.aps.iva.g0.h
    public final Object l(i.a.C0282a.C0283a c0283a, com.amazon.aps.iva.ob0.d dVar) {
        boolean z;
        com.amazon.aps.iva.e1.e eVar = (com.amazon.aps.iva.e1.e) c0283a.invoke();
        boolean z2 = false;
        if (eVar != null && !com.amazon.aps.iva.e1.c.a(C(this.l, eVar), com.amazon.aps.iva.e1.c.b)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        a aVar = new a(c0283a, nVar);
        com.amazon.aps.iva.b0.b bVar = this.g;
        bVar.getClass();
        com.amazon.aps.iva.e1.e invoke = c0283a.invoke();
        if (invoke == null) {
            nVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
        } else {
            nVar.w(new com.amazon.aps.iva.b0.a(bVar, aVar));
            com.amazon.aps.iva.p0.f<a> fVar = bVar.a;
            int i = new com.amazon.aps.iva.ec0.j(0, fVar.d - 1).c;
            if (i >= 0) {
                while (true) {
                    com.amazon.aps.iva.e1.e invoke2 = fVar.b[i].a.invoke();
                    if (invoke2 != null) {
                        com.amazon.aps.iva.e1.e b2 = invoke.b(invoke2);
                        if (com.amazon.aps.iva.yb0.j.a(b2, invoke)) {
                            fVar.a(i + 1, aVar);
                            break;
                        } else if (!com.amazon.aps.iva.yb0.j.a(b2, invoke2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int i2 = fVar.d - 1;
                            if (i2 <= i) {
                                while (true) {
                                    fVar.b[i].b.J(cancellationException);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    if (i == 0) {
                        break;
                    }
                    i--;
                }
            }
            fVar.a(0, aVar);
            z2 = true;
        }
        if (z2 && !this.m) {
            A();
        }
        Object q = nVar.q();
        if (q == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.g0.h
    public final com.amazon.aps.iva.e1.e p(com.amazon.aps.iva.e1.e eVar) {
        if (!com.amazon.aps.iva.o2.j.a(this.l, 0L)) {
            long C = C(this.l, eVar);
            return eVar.d(com.amazon.aps.iva.e1.d.d(-com.amazon.aps.iva.e1.c.c(C), -com.amazon.aps.iva.e1.c.d(C)));
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // com.amazon.aps.iva.s1.o0
    public final void v(androidx.compose.ui.node.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinates");
        this.h = oVar;
    }

    public final com.amazon.aps.iva.e1.e y() {
        com.amazon.aps.iva.s1.q qVar;
        com.amazon.aps.iva.s1.q qVar2 = this.h;
        if (qVar2 != null) {
            if (!qVar2.l()) {
                qVar2 = null;
            }
            if (qVar2 != null && (qVar = this.i) != null) {
                if (!qVar.l()) {
                    qVar = null;
                }
                if (qVar != null) {
                    return qVar2.f(qVar, false);
                }
            }
        }
        return null;
    }
}
