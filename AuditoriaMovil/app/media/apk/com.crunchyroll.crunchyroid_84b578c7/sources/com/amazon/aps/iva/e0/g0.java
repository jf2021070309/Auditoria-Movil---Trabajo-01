package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.a0.g1;
import com.amazon.aps.iva.b0.t0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f0.c0;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.s1.w0;
import com.amazon.aps.iva.s1.x0;
import java.util.List;
/* compiled from: LazyListState.kt */
/* loaded from: classes.dex */
public final class g0 implements t0 {
    public static final com.amazon.aps.iva.x0.n u;
    public final f0 a;
    public final y1 b;
    public final com.amazon.aps.iva.c0.m c;
    public float d;
    public com.amazon.aps.iva.o2.c e;
    public final com.amazon.aps.iva.b0.f f;
    public final boolean g;
    public int h;
    public c0.a i;
    public boolean j;
    public w0 k;
    public final c l;
    public final com.amazon.aps.iva.f0.a m;
    public final o n;
    public final com.amazon.aps.iva.f0.f o;
    public long p;
    public final com.amazon.aps.iva.f0.b0 q;
    public final y1 r;
    public final y1 s;
    public final com.amazon.aps.iva.f0.c0 t;

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.x0.o, g0, List<? extends Integer>> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final List<? extends Integer> invoke(com.amazon.aps.iva.x0.o oVar, g0 g0Var) {
            g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(oVar, "$this$listSaver");
            com.amazon.aps.iva.yb0.j.f(g0Var2, "it");
            f0 f0Var = g0Var2.a;
            return f1.K(Integer.valueOf(f0Var.a.t()), Integer.valueOf(f0Var.b.t()));
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, g0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final g0 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "it");
            return new g0(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class c implements x0 {
        public c() {
        }

        @Override // com.amazon.aps.iva.s1.x0
        public final void m(androidx.compose.ui.node.e eVar) {
            com.amazon.aps.iva.yb0.j.f(eVar, "remeasurement");
            g0.this.k = eVar;
        }
    }

    /* compiled from: LazyListState.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {269, 270}, m = "scroll")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public g0 h;
        public g1 i;
        public com.amazon.aps.iva.xb0.p j;
        public /* synthetic */ Object k;
        public int m;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return g0.this.f(null, null, this);
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, Float> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Float invoke(Float f) {
            boolean z;
            boolean z2;
            int index;
            c0.a aVar;
            c0.a aVar2;
            float f2 = -f.floatValue();
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            g0 g0Var = g0.this;
            if ((i < 0 && !g0Var.b()) || (f2 > 0.0f && !g0Var.d())) {
                f2 = 0.0f;
            } else {
                boolean z3 = true;
                if (Math.abs(g0Var.d) <= 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float f3 = g0Var.d + f2;
                    g0Var.d = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = g0Var.d;
                        w0 w0Var = g0Var.k;
                        if (w0Var != null) {
                            w0Var.d();
                        }
                        boolean z4 = g0Var.g;
                        if (z4) {
                            float f5 = f4 - g0Var.d;
                            if (z4) {
                                y yVar = (y) g0Var.b.getValue();
                                if (!yVar.b().isEmpty()) {
                                    if (f5 < 0.0f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        index = ((j) com.amazon.aps.iva.lb0.x.D0(yVar.b())).getIndex() + 1;
                                    } else {
                                        index = ((j) com.amazon.aps.iva.lb0.x.t0(yVar.b())).getIndex() - 1;
                                    }
                                    if (index != g0Var.h) {
                                        if (index < 0 || index >= yVar.a()) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            if (g0Var.j != z2 && (aVar2 = g0Var.i) != null) {
                                                aVar2.cancel();
                                            }
                                            g0Var.j = z2;
                                            g0Var.h = index;
                                            long j = g0Var.p;
                                            c0.b bVar = g0Var.t.a;
                                            if (bVar == null || (aVar = bVar.a(index, j)) == null) {
                                                aVar = com.amazon.aps.iva.f0.c.a;
                                            }
                                            g0Var.i = aVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (Math.abs(g0Var.d) > 0.5f) {
                        f2 -= g0Var.d;
                        g0Var.d = 0.0f;
                    }
                } else {
                    throw new IllegalStateException(("entered drag with non-zero pending scroll: " + g0Var.d).toString());
                }
            }
            return Float.valueOf(-f2);
        }
    }

    static {
        a aVar = a.h;
        com.amazon.aps.iva.yb0.j.f(aVar, "save");
        b bVar = b.h;
        com.amazon.aps.iva.yb0.j.f(bVar, "restore");
        com.amazon.aps.iva.x0.a aVar2 = new com.amazon.aps.iva.x0.a(aVar);
        com.amazon.aps.iva.yb0.h0.e(1, bVar);
        u = com.amazon.aps.iva.x0.m.a(aVar2, bVar);
    }

    public g0(int i, int i2) {
        this.a = new f0(i, i2);
        this.b = com.amazon.aps.iva.cq.b.c0(com.amazon.aps.iva.e0.a.a);
        this.c = new com.amazon.aps.iva.c0.m();
        this.f = new com.amazon.aps.iva.b0.f(new e());
        this.g = true;
        this.h = -1;
        this.l = new c();
        this.m = new com.amazon.aps.iva.f0.a();
        this.n = new o();
        this.o = new com.amazon.aps.iva.f0.f();
        this.p = com.amazon.aps.iva.o2.b.b(0, 0, 15);
        this.q = new com.amazon.aps.iva.f0.b0();
        Boolean bool = Boolean.FALSE;
        this.r = com.amazon.aps.iva.cq.b.c0(bool);
        this.s = com.amazon.aps.iva.cq.b.c0(bool);
        this.t = new com.amazon.aps.iva.f0.c0();
    }

    public static Object a(g0 g0Var, int i, com.amazon.aps.iva.ob0.d dVar) {
        Object f;
        g0Var.getClass();
        f = g0Var.f(g1.Default, new h0(g0Var, i, 0, null), dVar);
        if (f != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return f;
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean b() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean c() {
        return this.f.c();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean d() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    @Override // com.amazon.aps.iva.b0.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.amazon.aps.iva.a0.g1 r6, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.b0.n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends java.lang.Object> r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.e0.g0.d
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.e0.g0$d r0 = (com.amazon.aps.iva.e0.g0.d) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.e0.g0$d r0 = new com.amazon.aps.iva.e0.g0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.xb0.p r7 = r0.j
            com.amazon.aps.iva.a0.g1 r6 = r0.i
            com.amazon.aps.iva.e0.g0 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L51
        L3c:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r5
            r0.i = r6
            r0.j = r7
            r0.m = r4
            com.amazon.aps.iva.f0.a r8 = r5.m
            java.lang.Object r8 = r8.l(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            com.amazon.aps.iva.b0.f r8 = r2.f
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r0.m = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e0.g0.f(com.amazon.aps.iva.a0.g1, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final float g(float f) {
        return this.f.g(f);
    }

    public g0() {
        this(0, 0);
    }
}
