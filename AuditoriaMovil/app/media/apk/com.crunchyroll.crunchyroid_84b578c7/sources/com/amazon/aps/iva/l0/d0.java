package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.j0.g1;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.j0.v0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: TextFieldSelectionManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {820}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ g1 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = g1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h = 1;
                Object p = com.amazon.aps.iva.e.z.p(new v0((com.amazon.aps.iva.p1.f0) this.i, this.j, null), this);
                if (p != obj2) {
                    p = com.amazon.aps.iva.kb0.q.a;
                }
                if (p == obj2) {
                    return obj2;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.n2.g i;
        public final /* synthetic */ c0 j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, com.amazon.aps.iva.n2.g gVar, c0 c0Var, int i) {
            super(2);
            this.h = z;
            this.i = gVar;
            this.j = c0Var;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.n2.g gVar = this.i;
            c0 c0Var = this.j;
            d0.a(this.h, gVar, c0Var, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.j0.h0.values().length];
            try {
                iArr[com.amazon.aps.iva.j0.h0.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.j0.h0.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.j0.h0.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(boolean z, com.amazon.aps.iva.n2.g gVar, c0 c0Var, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(gVar, "direction");
        com.amazon.aps.iva.yb0.j.f(c0Var, "manager");
        com.amazon.aps.iva.o0.j g = iVar.g(-1344558920);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        Boolean valueOf = Boolean.valueOf(z);
        g.s(511388516);
        boolean H = g.H(valueOf) | g.H(c0Var);
        Object e0 = g.e0();
        if (H || e0 == i.a.a) {
            e0 = new b0(c0Var, z);
            g.K0(e0);
        }
        g.U(false);
        g1 g1Var = (g1) e0;
        int i2 = i << 3;
        com.amazon.aps.iva.l0.a.c(c0Var.i(z), z, gVar, com.amazon.aps.iva.c2.z.f(c0Var.j().b), com.amazon.aps.iva.p1.l0.a(f.a.c, g1Var, new a(g1Var, null)), null, g, (i2 & 112) | 196608 | (i2 & 896));
        j2 X = g.X();
        if (X != null) {
            X.d = new b(z, gVar, c0Var, i);
        }
    }

    public static final boolean b(c0 c0Var, boolean z) {
        com.amazon.aps.iva.s1.q qVar;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        p2 p2Var = c0Var.d;
        if (p2Var == null || (qVar = p2Var.g) == null) {
            return false;
        }
        com.amazon.aps.iva.e1.e d = com.amazon.aps.iva.gd0.j.d(qVar);
        long v = qVar.v(com.amazon.aps.iva.e1.d.d(d.a, d.b));
        long v2 = qVar.v(com.amazon.aps.iva.e1.d.d(d.c, d.d));
        float c2 = com.amazon.aps.iva.e1.c.c(v);
        float d2 = com.amazon.aps.iva.e1.c.d(v);
        float c3 = com.amazon.aps.iva.e1.c.c(v2);
        float d3 = com.amazon.aps.iva.e1.c.d(v2);
        long i = c0Var.i(z);
        float c4 = com.amazon.aps.iva.e1.c.c(i);
        if (c2 <= c4 && c4 <= c3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        float d4 = com.amazon.aps.iva.e1.c.d(i);
        if (d2 <= d4 && d4 <= d3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return true;
    }
}
