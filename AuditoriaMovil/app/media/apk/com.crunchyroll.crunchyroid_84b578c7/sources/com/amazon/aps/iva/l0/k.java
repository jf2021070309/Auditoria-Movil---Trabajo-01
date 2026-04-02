package com.amazon.aps.iva.l0;
/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes.dex */
public interface k {
    long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar);

    /* compiled from: SelectionAdjustment.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final C0461a a;
        public static final e b;

        /* compiled from: SelectionAdjustment.kt */
        /* renamed from: com.amazon.aps.iva.l0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0461a implements k {
            @Override // com.amazon.aps.iva.l0.k
            public final long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar) {
                boolean z2;
                if (com.amazon.aps.iva.c2.z.b(j)) {
                    if (zVar != null) {
                        z2 = com.amazon.aps.iva.c2.z.f(zVar.a);
                    } else {
                        z2 = false;
                    }
                    com.amazon.aps.iva.c2.b bVar = yVar.a.a;
                    return com.amazon.aps.iva.ab.x.J(bVar.b, (int) (j >> 32), com.amazon.aps.iva.oe0.q.n0(bVar), z, z2);
                }
                return j;
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class b implements k {
            public static int b(com.amazon.aps.iva.c2.y yVar, int i, int i2, int i3, boolean z, boolean z2) {
                int f;
                long o = yVar.o(i);
                int i4 = (int) (o >> 32);
                if (yVar.g(i4) != i2) {
                    i4 = yVar.k(i2);
                }
                if (yVar.g(com.amazon.aps.iva.c2.z.c(o)) == i2) {
                    f = com.amazon.aps.iva.c2.z.c(o);
                } else {
                    f = yVar.f(i2, false);
                }
                if (i4 == i3) {
                    return f;
                }
                if (f == i3) {
                    return i4;
                }
                int i5 = (i4 + f) / 2;
                if (z ^ z2) {
                    if (i <= i5) {
                        return i4;
                    }
                } else if (i < i5) {
                    return i4;
                }
                return f;
            }

            public static int c(com.amazon.aps.iva.c2.y yVar, int i, int i2, int i3, boolean z, boolean z2) {
                boolean z3;
                if (i == -1) {
                    return i2;
                }
                int g = yVar.g(i);
                if (g != yVar.g(i2)) {
                    return b(yVar, i, g, i3, z, z2);
                }
                long o = yVar.o(i2);
                if (i2 != ((int) (o >> 32)) && i2 != com.amazon.aps.iva.c2.z.c(o)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    return i;
                }
                return b(yVar, i, g, i3, z, z2);
            }

            @Override // com.amazon.aps.iva.l0.k
            public final long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar) {
                int c;
                int i;
                if (zVar == null) {
                    return a.a(yVar, j, new m(yVar));
                }
                boolean b = com.amazon.aps.iva.c2.z.b(j);
                long j2 = zVar.a;
                if (b) {
                    com.amazon.aps.iva.c2.b bVar = yVar.a.a;
                    return com.amazon.aps.iva.ab.x.J(bVar.b, (int) (j >> 32), com.amazon.aps.iva.oe0.q.n0(bVar), z, com.amazon.aps.iva.c2.z.f(j2));
                }
                if (z) {
                    i = c(yVar, (int) (j >> 32), (int) (j2 >> 32), com.amazon.aps.iva.c2.z.c(j), true, com.amazon.aps.iva.c2.z.f(j));
                    c = com.amazon.aps.iva.c2.z.c(j);
                } else {
                    int i2 = (int) (j >> 32);
                    c = c(yVar, com.amazon.aps.iva.c2.z.c(j), com.amazon.aps.iva.c2.z.c(j2), i2, false, com.amazon.aps.iva.c2.z.f(j));
                    i = i2;
                }
                return com.amazon.aps.iva.ab.x.f(i, c);
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class d implements k {
            @Override // com.amazon.aps.iva.l0.k
            public final long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar) {
                return a.a(yVar, j, new l(yVar.a.a));
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class e implements k {
            @Override // com.amazon.aps.iva.l0.k
            public final long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar) {
                return a.a(yVar, j, new m(yVar));
            }
        }

        static {
            new c();
            a = new C0461a();
            b = new e();
            new d();
            new b();
        }

        public static final long a(com.amazon.aps.iva.c2.y yVar, long j, com.amazon.aps.iva.xb0.l lVar) {
            boolean z;
            int i;
            int c2;
            com.amazon.aps.iva.c2.x xVar = yVar.a;
            if (xVar.a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return com.amazon.aps.iva.c2.z.b;
            }
            int n0 = com.amazon.aps.iva.oe0.q.n0(xVar.a);
            int i2 = com.amazon.aps.iva.c2.z.c;
            long j2 = ((com.amazon.aps.iva.c2.z) lVar.invoke(Integer.valueOf(com.amazon.aps.iva.aq.j.j((int) (j >> 32), 0, n0)))).a;
            long j3 = ((com.amazon.aps.iva.c2.z) lVar.invoke(Integer.valueOf(com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.c2.z.c(j), 0, n0)))).a;
            if (com.amazon.aps.iva.c2.z.f(j)) {
                i = com.amazon.aps.iva.c2.z.c(j2);
            } else {
                i = (int) (j2 >> 32);
            }
            if (com.amazon.aps.iva.c2.z.f(j)) {
                c2 = (int) (j3 >> 32);
            } else {
                c2 = com.amazon.aps.iva.c2.z.c(j3);
            }
            return com.amazon.aps.iva.ab.x.f(i, c2);
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class c implements k {
            @Override // com.amazon.aps.iva.l0.k
            public final long a(com.amazon.aps.iva.c2.y yVar, long j, boolean z, com.amazon.aps.iva.c2.z zVar) {
                return j;
            }
        }
    }
}
