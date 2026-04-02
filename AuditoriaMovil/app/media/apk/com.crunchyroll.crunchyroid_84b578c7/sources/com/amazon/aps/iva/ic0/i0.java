package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ic0.h0;
/* compiled from: KPropertyImpl.kt */
/* loaded from: classes4.dex */
public final class i0 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.jc0.f a(com.amazon.aps.iva.ic0.h0.a r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.i0.a(com.amazon.aps.iva.ic0.h0$a, boolean):com.amazon.aps.iva.jc0.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.jc0.g<java.lang.reflect.Field> b(com.amazon.aps.iva.ic0.h0.a<?, ?> r3, boolean r4, java.lang.reflect.Field r5) {
        /*
            com.amazon.aps.iva.ic0.h0 r0 = r3.s()
            com.amazon.aps.iva.oc0.n0 r0 = r0.o()
            com.amazon.aps.iva.oc0.k r1 = r0.d()
            java.lang.String r2 = "containingDeclaration"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            boolean r2 = com.amazon.aps.iva.qd0.i.l(r1)
            if (r2 != 0) goto L18
            goto L3c
        L18:
            com.amazon.aps.iva.oc0.k r1 = r1.d()
            com.amazon.aps.iva.oc0.f r2 = com.amazon.aps.iva.oc0.f.INTERFACE
            boolean r2 = com.amazon.aps.iva.qd0.i.n(r1, r2)
            if (r2 != 0) goto L2c
            com.amazon.aps.iva.oc0.f r2 = com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS
            boolean r1 = com.amazon.aps.iva.qd0.i.n(r1, r2)
            if (r1 == 0) goto L3a
        L2c:
            boolean r1 = r0 instanceof com.amazon.aps.iva.ce0.n
            if (r1 == 0) goto L3c
            com.amazon.aps.iva.ce0.n r0 = (com.amazon.aps.iva.ce0.n) r0
            com.amazon.aps.iva.id0.m r0 = r0.C
            boolean r0 = com.amazon.aps.iva.md0.h.d(r0)
            if (r0 == 0) goto L3c
        L3a:
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L9f
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L4a
            goto L9f
        L4a:
            com.amazon.aps.iva.ic0.h0 r0 = r3.s()
            com.amazon.aps.iva.oc0.n0 r0 = r0.o()
            com.amazon.aps.iva.pc0.h r0 = r0.getAnnotations()
            com.amazon.aps.iva.nd0.c r1 = com.amazon.aps.iva.ic0.v0.a
            boolean r0 = r0.A(r1)
            if (r0 == 0) goto L8d
            if (r4 == 0) goto L73
            boolean r3 = r3.q()
            if (r3 == 0) goto L6d
            com.amazon.aps.iva.jc0.g$e$b r3 = new com.amazon.aps.iva.jc0.g$e$b
            r3.<init>(r5)
            goto Ld5
        L6d:
            com.amazon.aps.iva.jc0.g$e$d r3 = new com.amazon.aps.iva.jc0.g$e$d
            r3.<init>(r5)
            goto Ld5
        L73:
            boolean r4 = r3.q()
            if (r4 == 0) goto L83
            com.amazon.aps.iva.jc0.g$f$b r4 = new com.amazon.aps.iva.jc0.g$f$b
            boolean r3 = c(r3)
            r4.<init>(r5, r3)
            goto Ld4
        L83:
            com.amazon.aps.iva.jc0.g$f$d r4 = new com.amazon.aps.iva.jc0.g$f$d
            boolean r3 = c(r3)
            r4.<init>(r5, r3)
            goto Ld4
        L8d:
            if (r4 == 0) goto L95
            com.amazon.aps.iva.jc0.g$e$e r3 = new com.amazon.aps.iva.jc0.g$e$e
            r3.<init>(r5)
            goto Ld5
        L95:
            com.amazon.aps.iva.jc0.g$f$e r4 = new com.amazon.aps.iva.jc0.g$f$e
            boolean r3 = c(r3)
            r4.<init>(r5, r3)
            goto Ld4
        L9f:
            if (r4 == 0) goto Lb7
            boolean r4 = r3.q()
            if (r4 == 0) goto Lb1
            com.amazon.aps.iva.jc0.g$e$a r4 = new com.amazon.aps.iva.jc0.g$e$a
            java.lang.Object r3 = d(r3)
            r4.<init>(r5, r3)
            goto Ld4
        Lb1:
            com.amazon.aps.iva.jc0.g$e$c r3 = new com.amazon.aps.iva.jc0.g$e$c
            r3.<init>(r5)
            goto Ld5
        Lb7:
            boolean r4 = r3.q()
            if (r4 == 0) goto Lcb
            com.amazon.aps.iva.jc0.g$f$a r4 = new com.amazon.aps.iva.jc0.g$f$a
            boolean r0 = c(r3)
            java.lang.Object r3 = d(r3)
            r4.<init>(r5, r0, r3)
            goto Ld4
        Lcb:
            com.amazon.aps.iva.jc0.g$f$c r4 = new com.amazon.aps.iva.jc0.g$f$c
            boolean r3 = c(r3)
            r4.<init>(r5, r3)
        Ld4:
            r3 = r4
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.i0.b(com.amazon.aps.iva.ic0.h0$a, boolean, java.lang.reflect.Field):com.amazon.aps.iva.jc0.g");
    }

    public static final boolean c(h0.a<?, ?> aVar) {
        return !s1.g(aVar.s().o().getType());
    }

    public static final Object d(h0.a<?, ?> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        h0<?> s = aVar.s();
        return f1.q(s.j, s.o());
    }
}
