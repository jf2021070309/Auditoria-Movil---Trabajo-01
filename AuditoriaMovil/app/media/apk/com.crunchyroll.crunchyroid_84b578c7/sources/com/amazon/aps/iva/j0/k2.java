package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.o0.s3;
import java.util.List;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class k2 {
    public static final com.amazon.aps.iva.x0.n f;
    public final com.amazon.aps.iva.o0.v1 a;
    public final com.amazon.aps.iva.o0.v1 b;
    public com.amazon.aps.iva.e1.e c;
    public long d;
    public final com.amazon.aps.iva.o0.y1 e;

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.x0.o, k2, List<? extends Object>> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final List<? extends Object> invoke(com.amazon.aps.iva.x0.o oVar, k2 k2Var) {
            k2 k2Var2 = k2Var;
            com.amazon.aps.iva.yb0.j.f(oVar, "$this$listSaver");
            com.amazon.aps.iva.yb0.j.f(k2Var2, "it");
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Float.valueOf(k2Var2.a());
            if (((com.amazon.aps.iva.b0.f0) k2Var2.e.getValue()) == com.amazon.aps.iva.b0.f0.Vertical) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            return com.amazon.aps.iva.ee0.f1.K(objArr);
        }
    }

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Object>, k2> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final k2 invoke(List<? extends Object> list) {
            com.amazon.aps.iva.b0.f0 f0Var;
            List<? extends Object> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "restored");
            Object obj = list2.get(1);
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                f0Var = com.amazon.aps.iva.b0.f0.Vertical;
            } else {
                f0Var = com.amazon.aps.iva.b0.f0.Horizontal;
            }
            Object obj2 = list2.get(0);
            com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new k2(f0Var, ((Float) obj2).floatValue());
        }
    }

    static {
        a aVar = a.h;
        com.amazon.aps.iva.yb0.j.f(aVar, "save");
        b bVar = b.h;
        com.amazon.aps.iva.yb0.j.f(bVar, "restore");
        com.amazon.aps.iva.x0.a aVar2 = new com.amazon.aps.iva.x0.a(aVar);
        com.amazon.aps.iva.yb0.h0.e(1, bVar);
        f = com.amazon.aps.iva.x0.m.a(aVar2, bVar);
    }

    public k2(com.amazon.aps.iva.b0.f0 f0Var, float f2) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "initialOrientation");
        this.a = com.amazon.aps.iva.e.z.I(f2);
        this.b = com.amazon.aps.iva.e.z.I(0.0f);
        this.c = com.amazon.aps.iva.e1.e.e;
        this.d = com.amazon.aps.iva.c2.z.b;
        this.e = com.amazon.aps.iva.cq.b.b0(f0Var, s3.a);
    }

    public final float a() {
        return this.a.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.amazon.aps.iva.b0.f0 r9, com.amazon.aps.iva.e1.e r10, int r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "orientation"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            int r12 = r12 - r11
            float r12 = (float) r12
            com.amazon.aps.iva.o0.v1 r0 = r8.b
            r0.q(r12)
            com.amazon.aps.iva.e1.e r0 = r8.c
            float r1 = r0.a
            float r2 = r10.a
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r4
        L1b:
            com.amazon.aps.iva.o0.v1 r5 = r8.a
            r6 = 0
            float r7 = r10.b
            if (r1 == 0) goto L2d
            float r0 = r0.b
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r4
        L2b:
            if (r0 != 0) goto L6a
        L2d:
            com.amazon.aps.iva.b0.f0 r0 = com.amazon.aps.iva.b0.f0.Vertical
            if (r9 != r0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L36
            r2 = r7
        L36:
            if (r3 == 0) goto L3b
            float r9 = r10.d
            goto L3d
        L3b:
            float r9 = r10.c
        L3d:
            float r0 = r8.a()
            float r11 = (float) r11
            float r1 = r0 + r11
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto L49
            goto L53
        L49:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L55
            float r4 = r9 - r2
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L55
        L53:
            float r9 = r9 - r1
            goto L60
        L55:
            if (r3 >= 0) goto L5f
            float r9 = r9 - r2
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L5f
            float r9 = r2 - r0
            goto L60
        L5f:
            r9 = r6
        L60:
            float r11 = r8.a()
            float r11 = r11 + r9
            r5.q(r11)
            r8.c = r10
        L6a:
            float r9 = r8.a()
            float r9 = com.amazon.aps.iva.aq.j.i(r9, r6, r12)
            r5.q(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.k2.b(com.amazon.aps.iva.b0.f0, com.amazon.aps.iva.e1.e, int, int):void");
    }

    public k2() {
        this(com.amazon.aps.iva.b0.f0.Vertical, 0.0f);
    }
}
