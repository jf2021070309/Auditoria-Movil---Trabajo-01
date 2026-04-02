package com.amazon.aps.iva.y;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.o0.v1;
import com.amazon.aps.iva.z.a2;
import com.amazon.aps.iva.z.l1;
import com.amazon.aps.iva.z.m1;
import com.amazon.aps.iva.z.n1;
import java.util.Map;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class g0 {
    public static final m1 a = n1.a(a.h, b.h);
    public static final v1 b = com.amazon.aps.iva.e.z.I(1.0f);
    public static final com.amazon.aps.iva.z.u0<Float> c = com.amazon.aps.iva.z.k.c(400.0f, null, 5);
    public static final com.amazon.aps.iva.z.u0<com.amazon.aps.iva.o2.h> d;
    public static final com.amazon.aps.iva.z.u0<com.amazon.aps.iva.o2.j> e;

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f1.b1, com.amazon.aps.iva.z.n> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.z.n invoke(com.amazon.aps.iva.f1.b1 b1Var) {
            long j = b1Var.a;
            return new com.amazon.aps.iva.z.n(Float.intBitsToFloat((int) (j >> 32)), com.amazon.aps.iva.f1.b1.a(j));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.z.n, com.amazon.aps.iva.f1.b1> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f1.b1 invoke(com.amazon.aps.iva.z.n nVar) {
            com.amazon.aps.iva.z.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            return new com.amazon.aps.iva.f1.b1((Float.floatToIntBits(nVar2.a) << 32) | (Float.floatToIntBits(nVar2.b) & 4294967295L));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {
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

    static {
        int i = com.amazon.aps.iva.o2.h.c;
        d = com.amazon.aps.iva.z.k.c(400.0f, new com.amazon.aps.iva.o2.h(com.amazon.aps.iva.e.w.e(1, 1)), 1);
        e = com.amazon.aps.iva.z.k.c(400.0f, new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(1, 1)), 1);
    }

    public static s0 a() {
        Map<l1<?, ?>, Float> map = a2.a;
        com.amazon.aps.iva.z.u0 c2 = com.amazon.aps.iva.z.k.c(400.0f, new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(1, 1)), 1);
        com.amazon.aps.iva.a1.b bVar = a.C0097a.i;
        m0 m0Var = m0.h;
        com.amazon.aps.iva.yb0.j.f(m0Var, "initialSize");
        return new s0(new k1(null, null, new a0(c2, bVar, m0Var, true), null, 11));
    }

    public static s0 b(com.amazon.aps.iva.z.k1 k1Var, int i) {
        com.amazon.aps.iva.z.z zVar = k1Var;
        if ((i & 1) != 0) {
            zVar = com.amazon.aps.iva.z.k.c(400.0f, null, 5);
        }
        com.amazon.aps.iva.yb0.j.f(zVar, "animationSpec");
        return new s0(new k1(new x0(0.0f, zVar), null, null, null, 14));
    }

    public static u0 c(com.amazon.aps.iva.z.k1 k1Var, int i) {
        com.amazon.aps.iva.z.z zVar = k1Var;
        if ((i & 1) != 0) {
            zVar = com.amazon.aps.iva.z.k.c(400.0f, null, 5);
        }
        com.amazon.aps.iva.yb0.j.f(zVar, "animationSpec");
        return new u0(new k1(new x0(0.0f, zVar), null, null, null, 14));
    }

    public static u0 d() {
        Map<l1<?, ?>, Float> map = a2.a;
        com.amazon.aps.iva.z.u0 c2 = com.amazon.aps.iva.z.k.c(400.0f, new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(1, 1)), 1);
        com.amazon.aps.iva.a1.b bVar = a.C0097a.i;
        o0 o0Var = o0.h;
        com.amazon.aps.iva.yb0.j.f(o0Var, "targetSize");
        return new u0(new k1(null, null, new a0(c2, bVar, o0Var, true), null, 11));
    }
}
