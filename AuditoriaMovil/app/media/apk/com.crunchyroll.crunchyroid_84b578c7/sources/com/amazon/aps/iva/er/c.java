package com.amazon.aps.iva.er;

import java.io.File;
/* compiled from: MemoryVitalReader.kt */
/* loaded from: classes2.dex */
public final class c implements i {
    public static final File b = new File("/proc/self/status");
    public static final com.amazon.aps.iva.oe0.f c = new com.amazon.aps.iva.oe0.f("VmRSS:\\s+(\\d+) kB");
    public final File a;

    public c() {
        File file = b;
        com.amazon.aps.iva.yb0.j.f(file, "statusFile");
        this.a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.er.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Double a() {
        /*
            r5 = this;
            java.io.File r0 = r5.a
            boolean r1 = com.amazon.aps.iva.tp.b.b(r0)
            r2 = 0
            if (r1 == 0) goto L90
            boolean r1 = com.amazon.aps.iva.tp.b.a(r0)
            if (r1 != 0) goto L11
            goto L90
        L11:
            java.nio.charset.Charset r1 = com.amazon.aps.iva.oe0.a.b
            java.lang.String r3 = "charset"
            com.amazon.aps.iva.yb0.j.f(r1, r3)
            boolean r3 = com.amazon.aps.iva.tp.b.b(r0)
            if (r3 == 0) goto L30
            boolean r3 = com.amazon.aps.iva.tp.b.a(r0)
            if (r3 == 0) goto L30
            com.amazon.aps.iva.tp.i r3 = new com.amazon.aps.iva.tp.i
            r3.<init>(r1)
            java.lang.Object r0 = com.amazon.aps.iva.tp.b.f(r0, r2, r3)
            java.util.List r0 = (java.util.List) r0
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 != 0) goto L34
            goto L7b
        L34:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.amazon.aps.iva.oe0.f r4 = com.amazon.aps.iva.er.c.c
            com.amazon.aps.iva.oe0.e r3 = r4.a(r3)
            if (r3 != 0) goto L55
            r3 = r2
            goto L6c
        L55:
            com.amazon.aps.iva.oe0.d r4 = r3.c
            if (r4 != 0) goto L60
            com.amazon.aps.iva.oe0.d r4 = new com.amazon.aps.iva.oe0.d
            r4.<init>(r3)
            r3.c = r4
        L60:
            com.amazon.aps.iva.oe0.d r3 = r3.c
            com.amazon.aps.iva.yb0.j.c(r3)
            r4 = 1
            java.lang.Object r3 = com.amazon.aps.iva.lb0.x.w0(r4, r3)
            java.lang.String r3 = (java.lang.String) r3
        L6c:
            if (r3 != 0) goto L6f
            goto L3f
        L6f:
            r1.add(r3)
            goto L3f
        L73:
            java.lang.Object r0 = com.amazon.aps.iva.lb0.x.v0(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L7d
        L7b:
            r0 = r2
            goto L81
        L7d:
            java.lang.Double r0 = com.amazon.aps.iva.oe0.l.V(r0)
        L81:
            if (r0 != 0) goto L84
            goto L90
        L84:
            double r0 = r0.doubleValue()
            r2 = 1000(0x3e8, float:1.401E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.er.c.a():java.lang.Double");
    }
}
