package com.amazon.aps.iva.c2;
/* compiled from: SpanStyle.kt */
/* loaded from: classes.dex */
public final class w {
    public static final long a = com.amazon.aps.iva.e.z.z(14);
    public static final long b = com.amazon.aps.iva.e.z.z(0);
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        int i = com.amazon.aps.iva.f1.x.h;
        c = com.amazon.aps.iva.f1.x.f;
        d = com.amazon.aps.iva.f1.x.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
        if (com.amazon.aps.iva.f1.x.c(r39, r4.b()) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.c2.u a(com.amazon.aps.iva.c2.u r38, long r39, com.amazon.aps.iva.f1.s r41, float r42, long r43, com.amazon.aps.iva.h2.y r45, com.amazon.aps.iva.h2.t r46, com.amazon.aps.iva.h2.u r47, com.amazon.aps.iva.h2.k r48, java.lang.String r49, long r50, com.amazon.aps.iva.n2.a r52, com.amazon.aps.iva.n2.l r53, com.amazon.aps.iva.j2.d r54, long r55, com.amazon.aps.iva.n2.i r57, com.amazon.aps.iva.f1.t0 r58, com.amazon.aps.iva.c2.r r59, com.amazon.aps.iva.h1.f r60) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.w.a(com.amazon.aps.iva.c2.u, long, com.amazon.aps.iva.f1.s, float, long, com.amazon.aps.iva.h2.y, com.amazon.aps.iva.h2.t, com.amazon.aps.iva.h2.u, com.amazon.aps.iva.h2.k, java.lang.String, long, com.amazon.aps.iva.n2.a, com.amazon.aps.iva.n2.l, com.amazon.aps.iva.j2.d, long, com.amazon.aps.iva.n2.i, com.amazon.aps.iva.f1.t0, com.amazon.aps.iva.c2.r, com.amazon.aps.iva.h1.f):com.amazon.aps.iva.c2.u");
    }

    public static final Object b(float f, Object obj, Object obj2) {
        if (f >= 0.5d) {
            return obj2;
        }
        return obj;
    }

    public static final long c(long j, long j2, float f) {
        boolean z;
        if (!com.amazon.aps.iva.e.z.F(j) && !com.amazon.aps.iva.e.z.F(j2)) {
            if (!com.amazon.aps.iva.e.z.F(j) && !com.amazon.aps.iva.e.z.F(j2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (com.amazon.aps.iva.o2.n.a(com.amazon.aps.iva.o2.m.b(j), com.amazon.aps.iva.o2.m.b(j2))) {
                    return com.amazon.aps.iva.e.z.L(1095216660480L & j, com.amazon.aps.iva.cq.b.Y(com.amazon.aps.iva.o2.m.c(j), com.amazon.aps.iva.o2.m.c(j2), f));
                }
                throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) com.amazon.aps.iva.o2.n.b(com.amazon.aps.iva.o2.m.b(j))) + " and " + ((Object) com.amazon.aps.iva.o2.n.b(com.amazon.aps.iva.o2.m.b(j2)))).toString());
            }
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        return ((com.amazon.aps.iva.o2.m) b(f, new com.amazon.aps.iva.o2.m(j), new com.amazon.aps.iva.o2.m(j2))).a;
    }
}
