package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ad0.d;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.l0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes4.dex */
public final class g {
    public final com.amazon.aps.iva.ad0.d a = d.a.a;

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final e0 a;
        public final int b;

        public a(u1 u1Var, int i) {
            this.a = u1Var;
            this.b = i;
        }
    }

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public final m0 a;
        public final int b;
        public final boolean c;

        public b(m0 m0Var, int i, boolean z) {
            this.a = m0Var;
            this.b = i;
            this.c = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.fd0.g.b a(com.amazon.aps.iva.ee0.m0 r18, com.amazon.aps.iva.fd0.b r19, int r20, com.amazon.aps.iva.fd0.w r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fd0.g.a(com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.fd0.b, int, com.amazon.aps.iva.fd0.w, boolean, boolean):com.amazon.aps.iva.fd0.g$b");
    }

    public final a b(u1 u1Var, com.amazon.aps.iva.fd0.b bVar, int i, boolean z) {
        e0 e0Var;
        u1 u1Var2 = null;
        if (l1.D(u1Var)) {
            return new a(null, 1);
        }
        if (u1Var instanceof com.amazon.aps.iva.ee0.y) {
            boolean z2 = u1Var instanceof l0;
            com.amazon.aps.iva.ee0.y yVar = (com.amazon.aps.iva.ee0.y) u1Var;
            b a2 = a(yVar.c, bVar, i, w.FLEXIBLE_LOWER, z2, z);
            b a3 = a(yVar.d, bVar, i, w.FLEXIBLE_UPPER, z2, z);
            m0 m0Var = a3.a;
            m0 m0Var2 = a2.a;
            if (m0Var2 != null || m0Var != null) {
                if (!a2.c && !a3.c) {
                    m0 m0Var3 = yVar.d;
                    m0 m0Var4 = yVar.c;
                    m0 m0Var5 = m0Var2;
                    if (z2) {
                        m0 m0Var6 = m0Var2;
                        if (m0Var2 == null) {
                            m0Var6 = m0Var4;
                        }
                        if (m0Var == null) {
                            m0Var = m0Var3;
                        }
                        u1Var2 = new com.amazon.aps.iva.cd0.h(m0Var6, m0Var);
                    } else {
                        if (m0Var2 == null) {
                            m0Var5 = m0Var4;
                        }
                        if (m0Var == null) {
                            m0Var = m0Var3;
                        }
                        u1Var2 = f0.c(m0Var5, m0Var);
                    }
                } else {
                    if (m0Var != null) {
                        if (m0Var2 == null) {
                            m0Var2 = m0Var;
                        }
                        e0Var = f0.c(m0Var2, m0Var);
                    } else {
                        com.amazon.aps.iva.yb0.j.c(m0Var2);
                        e0Var = m0Var2;
                    }
                    u1Var2 = com.amazon.aps.iva.dg.b.K(u1Var, e0Var);
                }
            }
            return new a(u1Var2, a2.b);
        } else if (u1Var instanceof m0) {
            b a4 = a((m0) u1Var, bVar, i, w.INFLEXIBLE, false, z);
            boolean z3 = a4.c;
            u1 u1Var3 = a4.a;
            if (z3) {
                u1Var3 = com.amazon.aps.iva.dg.b.K(u1Var, u1Var3);
            }
            return new a(u1Var3, a4.b);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }
}
