package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.z.a1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class g1 extends a1 {
    public final com.amazon.aps.iva.z.a1<f0>.a<com.amazon.aps.iva.o2.h, com.amazon.aps.iva.z.n> c;
    public final p3<f1> d;
    public final p3<f1> e;
    public final c f;

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 i;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.s1.u0 u0Var, long j) {
            super(1);
            this.i = u0Var;
            this.j = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            g1 g1Var = g1.this;
            u0.a.k(aVar2, this.i, ((com.amazon.aps.iva.o2.h) g1Var.c.a(g1Var.f, new h1(g1Var, this.j)).getValue()).a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a1.b<f0>, com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h>> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h> invoke(a1.b<f0> bVar) {
            com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h> zVar;
            com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h> zVar2;
            a1.b<f0> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$null");
            f0 f0Var = f0.PreEnter;
            f0 f0Var2 = f0.Visible;
            boolean b = bVar2.b(f0Var, f0Var2);
            g1 g1Var = g1.this;
            if (b) {
                f1 value = g1Var.d.getValue();
                if (value == null || (zVar2 = value.b) == null) {
                    return g0.d;
                }
                return zVar2;
            } else if (bVar2.b(f0Var2, f0.PostExit)) {
                f1 value2 = g1Var.e.getValue();
                if (value2 == null || (zVar = value2.b) == null) {
                    return g0.d;
                }
                return zVar;
            } else {
                return g0.d;
            }
        }
    }

    public g1(com.amazon.aps.iva.z.a1<f0>.a<com.amazon.aps.iva.o2.h, com.amazon.aps.iva.z.n> aVar, p3<f1> p3Var, p3<f1> p3Var2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "lazyAnimation");
        com.amazon.aps.iva.yb0.j.f(p3Var, "slideIn");
        com.amazon.aps.iva.yb0.j.f(p3Var2, "slideOut");
        this.c = aVar;
        this.d = p3Var;
        this.e = p3Var2;
        this.f = new c();
    }

    @Override // com.amazon.aps.iva.s1.v
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        long a2 = com.amazon.aps.iva.o2.k.a(V.b, V.c);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new b(V, a2));
    }
}
