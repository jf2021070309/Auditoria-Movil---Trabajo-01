package com.amazon.aps.iva.p0;
/* compiled from: IdentityArrayIntMap.kt */
/* loaded from: classes.dex */
public final class a {
    public int a;
    public Object[] b = new Object[4];
    public int[] c = new int[4];

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        r6 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "key"
            com.amazon.aps.iva.yb0.j.f(r14, r0)
            int[] r0 = r13.c
            int r1 = r13.a
            r2 = -1
            if (r1 <= 0) goto L67
            int r1 = r1 + r2
            int r3 = java.lang.System.identityHashCode(r14)
            java.lang.Object[] r4 = r13.b
            r5 = 0
        L14:
            if (r5 > r1) goto L5d
            int r6 = r5 + r1
            int r6 = r6 >>> 1
            r7 = r4[r6]
            int r8 = java.lang.System.identityHashCode(r7)
            if (r8 >= r3) goto L25
            int r5 = r6 + 1
            goto L14
        L25:
            if (r8 <= r3) goto L2a
            int r1 = r6 + (-1)
            goto L14
        L2a:
            if (r7 != r14) goto L2d
            goto L60
        L2d:
            java.lang.Object[] r1 = r13.b
            int r4 = r13.a
            int r5 = r6 + (-1)
        L33:
            if (r2 >= r5) goto L45
            r7 = r1[r5]
            if (r7 != r14) goto L3b
            r6 = r5
            goto L60
        L3b:
            int r7 = java.lang.System.identityHashCode(r7)
            if (r7 == r3) goto L42
            goto L45
        L42:
            int r5 = r5 + (-1)
            goto L33
        L45:
            int r6 = r6 + 1
            if (r6 >= r4) goto L58
            r5 = r1[r6]
            if (r5 != r14) goto L4e
            goto L60
        L4e:
            int r5 = java.lang.System.identityHashCode(r5)
            if (r5 == r3) goto L45
            int r6 = r6 + 1
            int r1 = -r6
            goto L5b
        L58:
            int r4 = r4 + 1
            int r1 = -r4
        L5b:
            r6 = r1
            goto L60
        L5d:
            int r5 = r5 + 1
            int r6 = -r5
        L60:
            if (r6 < 0) goto L68
            r14 = r0[r6]
            r0[r6] = r15
            return r14
        L67:
            r6 = r2
        L68:
            int r6 = r6 + 1
            int r1 = -r6
            java.lang.Object[] r7 = r13.b
            int r3 = r13.a
            int r4 = r7.length
            if (r3 != r4) goto L95
            int r4 = r7.length
            int r4 = r4 * 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r7.length
            int r5 = r5 * 2
            int[] r5 = new int[r5]
            int r6 = r1 + 1
            com.amazon.aps.iva.lb0.m.F(r7, r6, r4, r1, r3)
            com.amazon.aps.iva.lb0.m.C(r6, r1, r0, r5, r3)
            r9 = 0
            r10 = 0
            r12 = 6
            r8 = r4
            r11 = r1
            com.amazon.aps.iva.lb0.m.H(r7, r8, r9, r10, r11, r12)
            r3 = 6
            com.amazon.aps.iva.lb0.m.G(r0, r5, r1, r3)
            r13.b = r4
            r13.c = r5
            goto L9d
        L95:
            int r4 = r1 + 1
            com.amazon.aps.iva.lb0.m.F(r7, r4, r7, r1, r3)
            com.amazon.aps.iva.lb0.m.C(r4, r1, r0, r0, r3)
        L9d:
            java.lang.Object[] r0 = r13.b
            r0[r1] = r14
            int[] r14 = r13.c
            r14[r1] = r15
            int r14 = r13.a
            int r14 = r14 + 1
            r13.a = r14
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p0.a.a(java.lang.Object, int):int");
    }
}
