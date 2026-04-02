package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.hd0.a;
import java.util.Set;
/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes4.dex */
public final class l {
    public static final Set<a.EnumC0334a> b = l1.H(a.EnumC0334a.CLASS);
    public static final Set<a.EnumC0334a> c = l1.I(a.EnumC0334a.FILE_FACADE, a.EnumC0334a.MULTIFILE_CLASS_PART);
    public static final com.amazon.aps.iva.md0.e d;
    public static final com.amazon.aps.iva.md0.e e;
    public com.amazon.aps.iva.ae0.l a;

    static {
        new com.amazon.aps.iva.md0.e(false, new int[]{1, 1, 2});
        d = new com.amazon.aps.iva.md0.e(false, new int[]{1, 1, 11});
        e = new com.amazon.aps.iva.md0.e(false, new int[]{1, 1, 13});
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (com.amazon.aps.iva.gd0.l.c.contains(r1.a) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ce0.m a(com.amazon.aps.iva.rc0.i0 r12, com.amazon.aps.iva.gd0.t r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "descriptor"
            com.amazon.aps.iva.yb0.j.f(r12, r1)
            java.lang.String r1 = "kotlinClass"
            com.amazon.aps.iva.yb0.j.f(r13, r1)
            com.amazon.aps.iva.hd0.a r1 = r13.b()
            java.lang.String[] r2 = r1.c
            if (r2 != 0) goto L16
            java.lang.String[] r2 = r1.d
        L16:
            r3 = 0
            if (r2 == 0) goto L24
            com.amazon.aps.iva.hd0.a$a r1 = r1.a
            java.util.Set<com.amazon.aps.iva.hd0.a$a> r4 = com.amazon.aps.iva.gd0.l.c
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = r3
        L25:
            if (r2 != 0) goto L28
            return r3
        L28:
            com.amazon.aps.iva.hd0.a r1 = r13.b()
            java.lang.String[] r1 = r1.e
            if (r1 != 0) goto L31
            return r3
        L31:
            com.amazon.aps.iva.kb0.j r0 = com.amazon.aps.iva.md0.h.h(r2, r1)     // Catch: java.lang.Throwable -> L36 com.amazon.aps.iva.od0.j -> L38
            goto L69
        L36:
            r0 = move-exception
            goto L4f
        L38:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r13.getLocation()     // Catch: java.lang.Throwable -> L36
            r4.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L4f:
            com.amazon.aps.iva.ae0.l r1 = r11.c()
            com.amazon.aps.iva.ae0.m r1 = r1.c
            r1.f()
            com.amazon.aps.iva.hd0.a r1 = r13.b()
            com.amazon.aps.iva.md0.e r1 = r1.b
            com.amazon.aps.iva.md0.e r2 = r11.e()
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto Laf
            r0 = r3
        L69:
            if (r0 != 0) goto L6c
            return r3
        L6c:
            A r1 = r0.b
            r5 = r1
            com.amazon.aps.iva.md0.f r5 = (com.amazon.aps.iva.md0.f) r5
            B r0 = r0.c
            r4 = r0
            com.amazon.aps.iva.id0.k r4 = (com.amazon.aps.iva.id0.k) r4
            com.amazon.aps.iva.gd0.o r7 = new com.amazon.aps.iva.gd0.o
            r11.d(r13)
            r11.f(r13)
            com.amazon.aps.iva.ce0.i r0 = r11.b(r13)
            r7.<init>(r13, r4, r5, r0)
            com.amazon.aps.iva.ce0.m r0 = new com.amazon.aps.iva.ce0.m
            com.amazon.aps.iva.hd0.a r13 = r13.b()
            com.amazon.aps.iva.md0.e r6 = r13.b
            com.amazon.aps.iva.ae0.l r8 = r11.c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "scope for "
            r13.<init>(r1)
            r13.append(r7)
            java.lang.String r1 = " in "
            r13.append(r1)
            r13.append(r12)
            java.lang.String r9 = r13.toString()
            com.amazon.aps.iva.gd0.k r10 = com.amazon.aps.iva.gd0.k.h
            r2 = r0
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        Laf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gd0.l.a(com.amazon.aps.iva.rc0.i0, com.amazon.aps.iva.gd0.t):com.amazon.aps.iva.ce0.m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r5 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ce0.i b(com.amazon.aps.iva.gd0.t r5) {
        /*
            r4 = this;
            com.amazon.aps.iva.ae0.l r0 = r4.c()
            com.amazon.aps.iva.ae0.m r0 = r0.c
            r0.e()
            com.amazon.aps.iva.hd0.a r0 = r5.b()
            int r0 = r0.g
            r1 = r0 & 64
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 == 0) goto L25
            r0 = r0 & 32
            if (r0 == 0) goto L20
            r0 = r2
            goto L21
        L20:
            r0 = r3
        L21:
            if (r0 != 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r3
        L26:
            if (r0 == 0) goto L2b
            com.amazon.aps.iva.ce0.i r5 = com.amazon.aps.iva.ce0.i.FIR_UNSTABLE
            goto L4c
        L2b:
            com.amazon.aps.iva.hd0.a r5 = r5.b()
            int r5 = r5.g
            r0 = r5 & 16
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L37:
            r0 = r3
        L38:
            if (r0 == 0) goto L44
            r5 = r5 & 32
            if (r5 == 0) goto L40
            r5 = r2
            goto L41
        L40:
            r5 = r3
        L41:
            if (r5 != 0) goto L44
            goto L45
        L44:
            r2 = r3
        L45:
            if (r2 == 0) goto L4a
            com.amazon.aps.iva.ce0.i r5 = com.amazon.aps.iva.ce0.i.IR_UNSTABLE
            goto L4c
        L4a:
            com.amazon.aps.iva.ce0.i r5 = com.amazon.aps.iva.ce0.i.STABLE
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gd0.l.b(com.amazon.aps.iva.gd0.t):com.amazon.aps.iva.ce0.i");
    }

    public final com.amazon.aps.iva.ae0.l c() {
        com.amazon.aps.iva.ae0.l lVar = this.a;
        if (lVar != null) {
            return lVar;
        }
        com.amazon.aps.iva.yb0.j.m("components");
        throw null;
    }

    public final com.amazon.aps.iva.ae0.u<com.amazon.aps.iva.md0.e> d(t tVar) {
        com.amazon.aps.iva.md0.e eVar;
        boolean z;
        c().c.f();
        if (tVar.b().b.b(e())) {
            return null;
        }
        com.amazon.aps.iva.md0.e eVar2 = tVar.b().b;
        com.amazon.aps.iva.md0.e eVar3 = com.amazon.aps.iva.md0.e.g;
        com.amazon.aps.iva.md0.e e2 = e();
        com.amazon.aps.iva.md0.e e3 = e();
        boolean z2 = tVar.b().b.f;
        e3.getClass();
        if (z2) {
            eVar = eVar3;
        } else {
            eVar = com.amazon.aps.iva.md0.e.h;
        }
        eVar.getClass();
        int i = e3.b;
        int i2 = eVar.b;
        if (i2 > i || (i2 >= i && eVar.c > e3.c)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            eVar = e3;
        }
        return new com.amazon.aps.iva.ae0.u<>(eVar2, eVar3, e2, eVar, tVar.getLocation(), tVar.i());
    }

    public final com.amazon.aps.iva.md0.e e() {
        return com.amazon.aps.iva.aq.j.E(c().c);
    }

    public final boolean f(t tVar) {
        boolean z;
        boolean z2;
        c().c.g();
        c().c.b();
        if ((tVar.b().g & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && com.amazon.aps.iva.yb0.j.a(tVar.b().b, d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (com.amazon.aps.iva.gd0.l.b.contains(r1.a) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ae0.h g(com.amazon.aps.iva.gd0.t r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Could not read data from "
            com.amazon.aps.iva.hd0.a r1 = r6.b()
            java.lang.String[] r2 = r1.c
            if (r2 != 0) goto Lc
            java.lang.String[] r2 = r1.d
        Lc:
            r3 = 0
            if (r2 == 0) goto L1a
            com.amazon.aps.iva.hd0.a$a r1 = r1.a
            java.util.Set<com.amazon.aps.iva.hd0.a$a> r4 = com.amazon.aps.iva.gd0.l.b
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            return r3
        L1e:
            com.amazon.aps.iva.hd0.a r1 = r6.b()
            java.lang.String[] r1 = r1.e
            if (r1 != 0) goto L27
            return r3
        L27:
            com.amazon.aps.iva.kb0.j r0 = com.amazon.aps.iva.md0.h.f(r2, r1)     // Catch: java.lang.Throwable -> L2c com.amazon.aps.iva.od0.j -> L2e
            goto L5f
        L2c:
            r0 = move-exception
            goto L45
        L2e:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r6.getLocation()     // Catch: java.lang.Throwable -> L2c
            r4.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L45:
            com.amazon.aps.iva.ae0.l r1 = r5.c()
            com.amazon.aps.iva.ae0.m r1 = r1.c
            r1.f()
            com.amazon.aps.iva.hd0.a r1 = r6.b()
            com.amazon.aps.iva.md0.e r1 = r1.b
            com.amazon.aps.iva.md0.e r2 = r5.e()
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto L85
            r0 = r3
        L5f:
            if (r0 != 0) goto L62
            return r3
        L62:
            A r1 = r0.b
            com.amazon.aps.iva.md0.f r1 = (com.amazon.aps.iva.md0.f) r1
            B r0 = r0.c
            com.amazon.aps.iva.id0.b r0 = (com.amazon.aps.iva.id0.b) r0
            com.amazon.aps.iva.gd0.v r2 = new com.amazon.aps.iva.gd0.v
            r5.d(r6)
            r5.f(r6)
            com.amazon.aps.iva.ce0.i r3 = r5.b(r6)
            r2.<init>(r6, r3)
            com.amazon.aps.iva.ae0.h r3 = new com.amazon.aps.iva.ae0.h
            com.amazon.aps.iva.hd0.a r6 = r6.b()
            com.amazon.aps.iva.md0.e r6 = r6.b
            r3.<init>(r1, r0, r6, r2)
            return r3
        L85:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gd0.l.g(com.amazon.aps.iva.gd0.t):com.amazon.aps.iva.ae0.h");
    }
}
