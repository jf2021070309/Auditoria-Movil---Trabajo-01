package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.z.a1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class v0 extends a1 {
    public final com.amazon.aps.iva.z.a1<f0>.a<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.z.n> c;
    public final com.amazon.aps.iva.z.a1<f0>.a<com.amazon.aps.iva.o2.h, com.amazon.aps.iva.z.n> d;
    public final p3<a0> e;
    public final p3<a0> f;
    public final p3<com.amazon.aps.iva.a1.a> g;
    public com.amazon.aps.iva.a1.a h;
    public final w0 i;

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
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ long i;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.s1.u0 u0Var, long j, long j2) {
            super(1);
            this.h = u0Var;
            this.i = j;
            this.j = j2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            int i = com.amazon.aps.iva.o2.h.c;
            long j = this.i;
            long j2 = this.j;
            int b = com.amazon.aps.iva.o2.h.b(j);
            com.amazon.aps.iva.s1.u0 u0Var = this.h;
            u0.a.c(u0Var, ((int) (j2 >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j2) + b, 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f0, com.amazon.aps.iva.o2.j> {
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(1);
            this.i = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o2.j invoke(f0 f0Var) {
            long j;
            long j2;
            f0 f0Var2 = f0Var;
            com.amazon.aps.iva.yb0.j.f(f0Var2, "it");
            v0 v0Var = v0.this;
            v0Var.getClass();
            a0 value = v0Var.e.getValue();
            long j3 = this.i;
            if (value != null) {
                j = value.b.invoke(new com.amazon.aps.iva.o2.j(j3)).a;
            } else {
                j = j3;
            }
            a0 value2 = v0Var.f.getValue();
            if (value2 != null) {
                j2 = value2.b.invoke(new com.amazon.aps.iva.o2.j(j3)).a;
            } else {
                j2 = j3;
            }
            int i = a.a[f0Var2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        j3 = j2;
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    j3 = j;
                }
            }
            return new com.amazon.aps.iva.o2.j(j3);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a1.b<f0>, com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h>> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h> invoke(a1.b<f0> bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "$this$animate");
            return g0.d;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f0, com.amazon.aps.iva.o2.h> {
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(1);
            this.i = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o2.h invoke(f0 f0Var) {
            long j;
            f0 f0Var2 = f0Var;
            com.amazon.aps.iva.yb0.j.f(f0Var2, "it");
            long j2 = this.i;
            v0 v0Var = v0.this;
            v0Var.getClass();
            if (v0Var.h == null) {
                j = com.amazon.aps.iva.o2.h.b;
            } else {
                p3<com.amazon.aps.iva.a1.a> p3Var = v0Var.g;
                if (p3Var.getValue() == null) {
                    j = com.amazon.aps.iva.o2.h.b;
                } else if (com.amazon.aps.iva.yb0.j.a(v0Var.h, p3Var.getValue())) {
                    j = com.amazon.aps.iva.o2.h.b;
                } else {
                    int i = a.a[f0Var2.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                a0 value = v0Var.f.getValue();
                                if (value != null) {
                                    long j3 = value.b.invoke(new com.amazon.aps.iva.o2.j(j2)).a;
                                    com.amazon.aps.iva.a1.a value2 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.c(value2);
                                    com.amazon.aps.iva.a1.a aVar = value2;
                                    com.amazon.aps.iva.o2.l lVar = com.amazon.aps.iva.o2.l.Ltr;
                                    long a = aVar.a(j2, j3, lVar);
                                    com.amazon.aps.iva.a1.a aVar2 = v0Var.h;
                                    com.amazon.aps.iva.yb0.j.c(aVar2);
                                    long a2 = aVar2.a(j2, j3, lVar);
                                    j = com.amazon.aps.iva.e.w.e(((int) (a >> 32)) - ((int) (a2 >> 32)), com.amazon.aps.iva.o2.h.b(a) - com.amazon.aps.iva.o2.h.b(a2));
                                } else {
                                    j = com.amazon.aps.iva.o2.h.b;
                                }
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                        } else {
                            j = com.amazon.aps.iva.o2.h.b;
                        }
                    } else {
                        j = com.amazon.aps.iva.o2.h.b;
                    }
                }
            }
            return new com.amazon.aps.iva.o2.h(j);
        }
    }

    public v0(a1.a aVar, a1.a aVar2, p3 p3Var, p3 p3Var2, q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "sizeAnimation");
        com.amazon.aps.iva.yb0.j.f(aVar2, "offsetAnimation");
        com.amazon.aps.iva.yb0.j.f(p3Var, "expand");
        com.amazon.aps.iva.yb0.j.f(p3Var2, "shrink");
        this.c = aVar;
        this.d = aVar2;
        this.e = p3Var;
        this.f = p3Var2;
        this.g = q1Var;
        this.i = new w0(this);
    }

    @Override // com.amazon.aps.iva.s1.v
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        long j2;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        long a2 = com.amazon.aps.iva.o2.k.a(V.b, V.c);
        long j3 = ((com.amazon.aps.iva.o2.j) this.c.a(this.i, new c(a2)).getValue()).a;
        long j4 = ((com.amazon.aps.iva.o2.h) this.d.a(d.h, new e(a2)).getValue()).a;
        com.amazon.aps.iva.a1.a aVar = this.h;
        if (aVar != null) {
            j2 = aVar.a(a2, j3, com.amazon.aps.iva.o2.l.Ltr);
        } else {
            j2 = com.amazon.aps.iva.o2.h.b;
        }
        return f0Var.F0((int) (j3 >> 32), com.amazon.aps.iva.o2.j.b(j3), com.amazon.aps.iva.lb0.a0.b, new b(V, j2, j4));
    }
}
