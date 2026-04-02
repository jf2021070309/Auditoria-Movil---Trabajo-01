package com.amazon.aps.iva.ee0;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes4.dex */
public abstract class e1 extends m1 {
    public static final a b = new a();

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final m1 a(e0 e0Var) {
            return b(e0Var.I0(), e0Var.G0());
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r2.O() == true) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.ee0.m1 b(com.amazon.aps.iva.ee0.c1 r6, java.util.List<? extends com.amazon.aps.iva.ee0.j1> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "typeConstructor"
                com.amazon.aps.iva.yb0.j.f(r6, r0)
                java.lang.String r0 = "arguments"
                com.amazon.aps.iva.yb0.j.f(r7, r0)
                java.util.List r0 = r6.getParameters()
                java.lang.String r1 = "typeConstructor.parameters"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.Object r2 = com.amazon.aps.iva.lb0.x.E0(r0)
                com.amazon.aps.iva.oc0.y0 r2 = (com.amazon.aps.iva.oc0.y0) r2
                r3 = 0
                if (r2 == 0) goto L24
                boolean r2 = r2.O()
                r4 = 1
                if (r2 != r4) goto L24
                goto L25
            L24:
                r4 = r3
            L25:
                if (r4 == 0) goto L61
                java.util.List r6 = r6.getParameters()
                com.amazon.aps.iva.yb0.j.e(r6, r1)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = com.amazon.aps.iva.lb0.r.Y(r6)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L3d:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r6.next()
                com.amazon.aps.iva.oc0.y0 r1 = (com.amazon.aps.iva.oc0.y0) r1
                com.amazon.aps.iva.ee0.c1 r1 = r1.h()
                r0.add(r1)
                goto L3d
            L51:
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r6 = com.amazon.aps.iva.lb0.x.e1(r0, r7)
                java.util.Map r6 = com.amazon.aps.iva.lb0.i0.Z(r6)
                com.amazon.aps.iva.ee0.d1 r7 = new com.amazon.aps.iva.ee0.d1
                r7.<init>(r6, r3)
                return r7
            L61:
                com.amazon.aps.iva.ee0.b0 r6 = new com.amazon.aps.iva.ee0.b0
                java.util.Collection r0 = (java.util.Collection) r0
                com.amazon.aps.iva.oc0.y0[] r1 = new com.amazon.aps.iva.oc0.y0[r3]
                java.lang.Object[] r0 = r0.toArray(r1)
                com.amazon.aps.iva.oc0.y0[] r0 = (com.amazon.aps.iva.oc0.y0[]) r0
                java.util.Collection r7 = (java.util.Collection) r7
                com.amazon.aps.iva.ee0.j1[] r1 = new com.amazon.aps.iva.ee0.j1[r3]
                java.lang.Object[] r7 = r7.toArray(r1)
                com.amazon.aps.iva.ee0.j1[] r7 = (com.amazon.aps.iva.ee0.j1[]) r7
                r6.<init>(r0, r7, r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.e1.a.b(com.amazon.aps.iva.ee0.c1, java.util.List):com.amazon.aps.iva.ee0.m1");
        }
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final j1 d(e0 e0Var) {
        return g(e0Var.I0());
    }

    public abstract j1 g(c1 c1Var);
}
