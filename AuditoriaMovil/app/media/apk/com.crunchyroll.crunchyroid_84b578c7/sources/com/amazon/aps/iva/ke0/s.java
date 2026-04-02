package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ke0.n;
import com.amazon.aps.iva.ke0.u;
import com.amazon.aps.iva.ke0.w;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.c1;
import java.util.Arrays;
import java.util.List;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public final class s extends com.amazon.aps.iva.ke0.b {
    public static final s a = new s();
    public static final List<k> b;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.v, String> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(com.amazon.aps.iva.oc0.v vVar) {
            boolean z;
            com.amazon.aps.iva.oc0.v vVar2 = vVar;
            com.amazon.aps.iva.yb0.j.f(vVar2, "$this$$receiver");
            List<c1> f = vVar2.f();
            com.amazon.aps.iva.yb0.j.e(f, "valueParameters");
            c1 c1Var = (c1) x.E0(f);
            boolean z2 = false;
            if (c1Var != null) {
                if (!com.amazon.aps.iva.ud0.b.a(c1Var) && c1Var.p0() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            s sVar = s.a;
            if (!z2) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.v, String> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(com.amazon.aps.iva.oc0.v r9) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ke0.s.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.v, String> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
            if (r8 == false) goto L28;
         */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(com.amazon.aps.iva.oc0.v r8) {
            /*
                r7 = this;
                com.amazon.aps.iva.oc0.v r8 = (com.amazon.aps.iva.oc0.v) r8
                java.lang.String r0 = "$this$$receiver"
                com.amazon.aps.iva.yb0.j.f(r8, r0)
                com.amazon.aps.iva.oc0.q0 r0 = r8.J()
                if (r0 != 0) goto L11
                com.amazon.aps.iva.oc0.q0 r0 = r8.M()
            L11:
                com.amazon.aps.iva.ke0.s r1 = com.amazon.aps.iva.ke0.s.a
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L77
                com.amazon.aps.iva.ee0.e0 r4 = r8.getReturnType()
                if (r4 == 0) goto L2b
                com.amazon.aps.iva.ee0.e0 r5 = r0.getType()
                java.lang.String r6 = "receiver.type"
                com.amazon.aps.iva.yb0.j.e(r5, r6)
                boolean r4 = com.amazon.aps.iva.da0.a.r(r4, r5)
                goto L2c
            L2b:
                r4 = r3
            L2c:
                if (r4 != 0) goto L76
                r1.getClass()
                com.amazon.aps.iva.yd0.g r0 = r0.getValue()
                java.lang.String r1 = "receiver.value"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                boolean r1 = r0 instanceof com.amazon.aps.iva.yd0.e
                if (r1 != 0) goto L3f
                goto L73
            L3f:
                com.amazon.aps.iva.yd0.e r0 = (com.amazon.aps.iva.yd0.e) r0
                com.amazon.aps.iva.oc0.e r0 = r0.a
                boolean r1 = r0.g0()
                if (r1 != 0) goto L4a
                goto L73
            L4a:
                com.amazon.aps.iva.nd0.b r1 = com.amazon.aps.iva.ud0.b.f(r0)
                if (r1 != 0) goto L51
                goto L73
            L51:
                com.amazon.aps.iva.oc0.c0 r0 = com.amazon.aps.iva.ud0.b.j(r0)
                com.amazon.aps.iva.oc0.h r0 = com.amazon.aps.iva.oc0.u.b(r0, r1)
                boolean r1 = r0 instanceof com.amazon.aps.iva.oc0.x0
                if (r1 == 0) goto L60
                com.amazon.aps.iva.oc0.x0 r0 = (com.amazon.aps.iva.oc0.x0) r0
                goto L61
            L60:
                r0 = r2
            L61:
                if (r0 != 0) goto L64
                goto L73
            L64:
                com.amazon.aps.iva.ee0.e0 r8 = r8.getReturnType()
                if (r8 == 0) goto L73
                com.amazon.aps.iva.ee0.m0 r0 = r0.G()
                boolean r8 = com.amazon.aps.iva.da0.a.r(r8, r0)
                goto L74
            L73:
                r8 = r3
            L74:
                if (r8 == 0) goto L77
            L76:
                r3 = 1
            L77:
                if (r3 != 0) goto L7b
                java.lang.String r2 = "receiver must be a supertype of the return type"
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ke0.s.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        com.amazon.aps.iva.nd0.f fVar = t.i;
        n.b bVar = n.b.b;
        k kVar = new k(fVar, new f[]{bVar, new w.a(1)});
        k kVar2 = new k(t.j, new f[]{bVar, new w.a(2)}, a.h);
        com.amazon.aps.iva.nd0.f fVar2 = t.a;
        p pVar = p.a;
        m mVar = m.a;
        k kVar3 = new k(fVar2, new f[]{bVar, pVar, new w.a(2), mVar});
        k kVar4 = new k(t.b, new f[]{bVar, pVar, new w.a(3), mVar});
        k kVar5 = new k(t.c, new f[]{bVar, pVar, new w.b(), mVar});
        k kVar6 = new k(t.g, new f[]{bVar});
        com.amazon.aps.iva.nd0.f fVar3 = t.f;
        w.d dVar = w.d.b;
        u.a aVar = u.a.c;
        k kVar7 = new k(fVar3, new f[]{bVar, dVar, pVar, aVar});
        com.amazon.aps.iva.nd0.f fVar4 = t.h;
        w.c cVar = w.c.b;
        k kVar8 = new k(fVar4, new f[]{bVar, cVar});
        k kVar9 = new k(t.k, new f[]{bVar, cVar});
        k kVar10 = new k(t.l, new f[]{bVar, cVar, aVar});
        k kVar11 = new k(t.p, new f[]{bVar, dVar, pVar});
        k kVar12 = new k(t.q, new f[]{bVar, dVar, pVar});
        k kVar13 = new k(t.d, new f[]{n.a.b}, b.h);
        k kVar14 = new k(t.e, new f[]{bVar, u.b.c, dVar, pVar});
        k kVar15 = new k(t.t, new f[]{bVar, dVar, pVar});
        k kVar16 = new k(t.s, new f[]{bVar, cVar});
        k kVar17 = new k(f1.K(t.n, t.o), new f[]{bVar}, c.h);
        k kVar18 = new k(t.v, new f[]{bVar, u.c.c, dVar, pVar});
        com.amazon.aps.iva.oe0.f fVar5 = t.m;
        i iVar = i.h;
        com.amazon.aps.iva.yb0.j.f(fVar5, "regex");
        com.amazon.aps.iva.yb0.j.f(iVar, "additionalChecks");
        b = f1.K(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, new k(null, fVar5, null, iVar, (f[]) Arrays.copyOf(new f[]{bVar, cVar}, 2)));
    }
}
