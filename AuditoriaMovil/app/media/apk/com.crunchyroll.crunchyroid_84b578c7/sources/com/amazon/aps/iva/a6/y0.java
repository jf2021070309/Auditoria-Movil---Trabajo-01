package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
import com.google.common.collect.ImmutableList;
/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes.dex */
public final class y0 {
    public final r0.b a = new r0.b();
    public final r0.d b = new r0.d();
    public final com.amazon.aps.iva.b6.a c;
    public final com.amazon.aps.iva.t5.l d;
    public long e;
    public int f;
    public boolean g;
    public v0 h;
    public v0 i;
    public v0 j;
    public int k;
    public Object l;
    public long m;

    public y0(com.amazon.aps.iva.b6.a aVar, com.amazon.aps.iva.t5.l lVar) {
        this.c = aVar;
        this.d = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r23.e <= r14) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.o6.v.b m(com.amazon.aps.iva.q5.r0 r16, java.lang.Object r17, long r18, long r20, com.amazon.aps.iva.q5.r0.d r22, com.amazon.aps.iva.q5.r0.b r23) {
        /*
            r0 = r16
            r1 = r18
            r3 = r22
            r4 = r17
            r5 = r23
            r0.i(r4, r5)
            int r6 = r5.d
            r0.o(r6, r3)
            int r6 = r16.c(r17)
        L16:
            com.amazon.aps.iva.q5.c r7 = r5.h
            int r7 = r7.c
            r8 = -1
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L67
            if (r7 != r9) goto L27
            boolean r11 = r5.h(r10)
            if (r11 != 0) goto L67
        L27:
            com.amazon.aps.iva.q5.c r11 = r5.h
            int r11 = r11.f
            boolean r11 = r5.i(r11)
            if (r11 == 0) goto L67
            com.amazon.aps.iva.q5.c r11 = r5.h
            long r12 = r5.e
            r14 = 0
            int r11 = r11.c(r14, r12)
            if (r11 == r8) goto L3e
            goto L67
        L3e:
            long r11 = r5.e
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L45
            goto L66
        L45:
            int r11 = r7 + (-1)
            boolean r11 = r5.h(r11)
            if (r11 == 0) goto L4f
            r11 = 2
            goto L50
        L4f:
            r11 = r9
        L50:
            int r7 = r7 - r11
            r11 = r10
        L52:
            if (r11 > r7) goto L60
            com.amazon.aps.iva.q5.c r12 = r5.h
            com.amazon.aps.iva.q5.c$a r12 = r12.a(r11)
            long r12 = r12.h
            long r14 = r14 + r12
            int r11 = r11 + 1
            goto L52
        L60:
            long r11 = r5.e
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 > 0) goto L67
        L66:
            r10 = r9
        L67:
            if (r10 == 0) goto L78
            int r7 = r3.q
            if (r6 > r7) goto L78
            r0.h(r6, r5, r9)
            java.lang.Object r4 = r5.c
            r4.getClass()
            int r6 = r6 + 1
            goto L16
        L78:
            r0.i(r4, r5)
            com.amazon.aps.iva.q5.c r0 = r5.h
            long r6 = r5.e
            int r3 = r0.c(r1, r6)
            if (r3 != r8) goto L91
            int r0 = r5.c(r1)
            com.amazon.aps.iva.o6.v$b r1 = new com.amazon.aps.iva.o6.v$b
            r6 = r20
            r1.<init>(r6, r0, r4)
            return r1
        L91:
            r6 = r20
            int r5 = r5.f(r3)
            com.amazon.aps.iva.o6.v$b r8 = new com.amazon.aps.iva.o6.v$b
            r0 = r8
            r1 = r4
            r2 = r3
            r3 = r5
            r4 = r20
            r0.<init>(r1, r2, r3, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.y0.m(com.amazon.aps.iva.q5.r0, java.lang.Object, long, long, com.amazon.aps.iva.q5.r0$d, com.amazon.aps.iva.q5.r0$b):com.amazon.aps.iva.o6.v$b");
    }

    public final v0 a() {
        v0 v0Var = this.h;
        if (v0Var == null) {
            return null;
        }
        if (v0Var == this.i) {
            this.i = v0Var.l;
        }
        v0Var.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            v0 v0Var2 = this.h;
            this.l = v0Var2.b;
            this.m = v0Var2.f.a.d;
        }
        this.h = this.h.l;
        k();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        v0 v0Var = this.h;
        com.amazon.aps.iva.cq.b.D(v0Var);
        this.l = v0Var.b;
        this.m = v0Var.f.a.d;
        while (v0Var != null) {
            v0Var.f();
            v0Var = v0Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if (r0 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.a6.w0 c(com.amazon.aps.iva.q5.r0 r26, com.amazon.aps.iva.a6.v0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.y0.c(com.amazon.aps.iva.q5.r0, com.amazon.aps.iva.a6.v0, long):com.amazon.aps.iva.a6.w0");
    }

    public final w0 d(com.amazon.aps.iva.q5.r0 r0Var, v0 v0Var, long j) {
        boolean z;
        long j2;
        long j3;
        w0 w0Var = v0Var.f;
        long j4 = (v0Var.o + w0Var.e) - j;
        if (w0Var.g) {
            return c(r0Var, v0Var, j4);
        }
        v.b bVar = w0Var.a;
        Object obj = bVar.a;
        r0.b bVar2 = this.a;
        r0Var.i(obj, bVar2);
        boolean a = bVar.a();
        Object obj2 = bVar.a;
        if (a) {
            int i = bVar.b;
            int i2 = bVar2.h.a(i).c;
            if (i2 != -1) {
                int b = bVar2.h.a(i).b(bVar.c);
                if (b < i2) {
                    return f(r0Var, bVar.a, i, b, w0Var.c, bVar.d);
                }
                long j5 = w0Var.c;
                if (j5 == -9223372036854775807L) {
                    Pair<Object, Long> l = r0Var.l(this.b, bVar2, bVar2.d, -9223372036854775807L, Math.max(0L, j4));
                    if (l != null) {
                        j5 = ((Long) l.second).longValue();
                    }
                }
                r0Var.i(obj2, bVar2);
                int i3 = bVar.b;
                long d = bVar2.d(i3);
                if (d == Long.MIN_VALUE) {
                    j3 = bVar2.e;
                } else {
                    j3 = bVar2.h.a(i3).h + d;
                }
                return g(r0Var, bVar.a, Math.max(j3, j5), w0Var.c, bVar.d);
            }
            return null;
        }
        int i4 = bVar.e;
        if (i4 != -1 && bVar2.h(i4)) {
            return c(r0Var, v0Var, j4);
        }
        int f = bVar2.f(i4);
        if (bVar2.i(i4) && bVar2.e(i4, f) == 3) {
            z = true;
        } else {
            z = false;
        }
        if (f != bVar2.h.a(i4).c && !z) {
            return f(r0Var, bVar.a, bVar.e, f, w0Var.e, bVar.d);
        }
        r0Var.i(obj2, bVar2);
        long d2 = bVar2.d(i4);
        if (d2 == Long.MIN_VALUE) {
            j2 = bVar2.e;
        } else {
            j2 = bVar2.h.a(i4).h + d2;
        }
        return g(r0Var, bVar.a, j2, w0Var.e, bVar.d);
    }

    public final w0 e(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar, long j, long j2) {
        r0Var.i(bVar.a, this.a);
        if (bVar.a()) {
            return f(r0Var, bVar.a, bVar.b, bVar.c, j, bVar.d);
        }
        return g(r0Var, bVar.a, j2, j, bVar.d);
    }

    public final w0 f(com.amazon.aps.iva.q5.r0 r0Var, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        v.b bVar = new v.b(obj, i, i2, j2);
        r0.b bVar2 = this.a;
        long b = r0Var.i(obj, bVar2).b(i, i2);
        if (i2 == bVar2.f(i)) {
            j3 = bVar2.h.d;
        } else {
            j3 = 0;
        }
        boolean i3 = bVar2.i(i);
        if (b != -9223372036854775807L && j3 >= b) {
            j4 = Math.max(0L, b - 1);
        } else {
            j4 = j3;
        }
        return new w0(bVar, j4, j, -9223372036854775807L, b, i3, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.a6.w0 g(com.amazon.aps.iva.q5.r0 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.y0.g(com.amazon.aps.iva.q5.r0, java.lang.Object, long, long, long):com.amazon.aps.iva.a6.w0");
    }

    public final w0 h(com.amazon.aps.iva.q5.r0 r0Var, w0 w0Var) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        v.b bVar = w0Var.a;
        if (!bVar.a() && bVar.e == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean j3 = j(r0Var, bVar);
        boolean i = i(r0Var, bVar, z);
        Object obj = w0Var.a.a;
        r0.b bVar2 = this.a;
        r0Var.i(obj, bVar2);
        boolean a = bVar.a();
        int i2 = bVar.e;
        if (!a && i2 != -1) {
            j = bVar2.d(i2);
        } else {
            j = -9223372036854775807L;
        }
        boolean a2 = bVar.a();
        int i3 = bVar.b;
        if (a2) {
            j2 = bVar2.b(i3, bVar.c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j2 = j;
        } else {
            j2 = bVar2.e;
        }
        if (bVar.a()) {
            z2 = bVar2.i(i3);
        } else if (i2 != -1 && bVar2.i(i2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new w0(bVar, w0Var.b, w0Var.c, j, j2, z2, z, j3, i);
    }

    public final boolean i(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar, boolean z) {
        boolean z2;
        int c = r0Var.c(bVar.a);
        if (r0Var.o(r0Var.h(c, this.a, false).d, this.b).j) {
            return false;
        }
        if (r0Var.e(c, this.a, this.b, this.f, this.g) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public final boolean j(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar) {
        boolean z;
        if (!bVar.a() && bVar.e == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Object obj = bVar.a;
        if (r0Var.o(r0Var.i(obj, this.a).d, this.b).q == r0Var.c(obj)) {
            return true;
        }
        return false;
    }

    public final void k() {
        v.b bVar;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (v0 v0Var = this.h; v0Var != null; v0Var = v0Var.l) {
            builder.add((ImmutableList.Builder) v0Var.f.a);
        }
        v0 v0Var2 = this.i;
        if (v0Var2 == null) {
            bVar = null;
        } else {
            bVar = v0Var2.f.a;
        }
        this.d.i(new x0(this, 0, builder, bVar));
    }

    public final boolean l(v0 v0Var) {
        boolean z;
        boolean z2 = false;
        if (v0Var != null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (v0Var.equals(this.j)) {
            return false;
        }
        this.j = v0Var;
        while (true) {
            v0Var = v0Var.l;
            if (v0Var == null) {
                break;
            }
            if (v0Var == this.i) {
                this.i = this.h;
                z2 = true;
            }
            v0Var.f();
            this.k--;
        }
        v0 v0Var2 = this.j;
        if (v0Var2.l != null) {
            v0Var2.b();
            v0Var2.l = null;
            v0Var2.c();
        }
        k();
        return z2;
    }

    public final v.b n(com.amazon.aps.iva.q5.r0 r0Var, Object obj, long j) {
        long j2;
        int c;
        Object obj2 = obj;
        r0.b bVar = this.a;
        int i = r0Var.i(obj2, bVar).d;
        Object obj3 = this.l;
        if (obj3 != null && (c = r0Var.c(obj3)) != -1 && r0Var.h(c, bVar, false).d == i) {
            j2 = this.m;
        } else {
            v0 v0Var = this.h;
            while (true) {
                if (v0Var != null) {
                    if (v0Var.b.equals(obj2)) {
                        j2 = v0Var.f.a.d;
                        break;
                    }
                    v0Var = v0Var.l;
                } else {
                    v0 v0Var2 = this.h;
                    while (true) {
                        if (v0Var2 != null) {
                            int c2 = r0Var.c(v0Var2.b);
                            if (c2 != -1 && r0Var.h(c2, bVar, false).d == i) {
                                j2 = v0Var2.f.a.d;
                                break;
                            }
                            v0Var2 = v0Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                }
            }
        }
        long j3 = j2;
        r0Var.i(obj2, bVar);
        int i2 = bVar.d;
        r0.d dVar = this.b;
        r0Var.o(i2, dVar);
        boolean z = false;
        for (int c3 = r0Var.c(obj); c3 >= dVar.p; c3--) {
            boolean z2 = true;
            r0Var.h(c3, bVar, true);
            com.amazon.aps.iva.q5.c cVar = bVar.h;
            if (cVar.c <= 0) {
                z2 = false;
            }
            z |= z2;
            long j4 = bVar.e;
            if (cVar.c(j4, j4) != -1) {
                obj2 = bVar.c;
                obj2.getClass();
            }
            if (z && (!z2 || bVar.e != 0)) {
                break;
            }
        }
        return m(r0Var, obj2, j, j3, this.b, this.a);
    }

    public final boolean o(com.amazon.aps.iva.q5.r0 r0Var) {
        v0 v0Var;
        v0 v0Var2 = this.h;
        if (v0Var2 == null) {
            return true;
        }
        int c = r0Var.c(v0Var2.b);
        while (true) {
            c = r0Var.e(c, this.a, this.b, this.f, this.g);
            while (true) {
                v0Var = v0Var2.l;
                if (v0Var == null || v0Var2.f.g) {
                    break;
                }
                v0Var2 = v0Var;
            }
            if (c == -1 || v0Var == null || r0Var.c(v0Var.b) != c) {
                break;
            }
            v0Var2 = v0Var;
        }
        boolean l = l(v0Var2);
        v0Var2.f = h(r0Var, v0Var2.f);
        return !l;
    }

    public final boolean p(com.amazon.aps.iva.q5.r0 r0Var, long j, long j2) {
        boolean l;
        boolean z;
        w0 w0Var;
        boolean z2;
        long j3;
        boolean z3;
        v0 v0Var = null;
        for (v0 v0Var2 = this.h; v0Var2 != null; v0Var2 = v0Var2.l) {
            w0 w0Var2 = v0Var2.f;
            if (v0Var == null) {
                w0Var = h(r0Var, w0Var2);
            } else {
                w0 d = d(r0Var, v0Var, j);
                if (d == null) {
                    l = l(v0Var);
                } else {
                    if (w0Var2.b == d.b && w0Var2.a.equals(d.a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        l = l(v0Var);
                    } else {
                        w0Var = d;
                    }
                }
                return !l;
            }
            v0Var2.f = w0Var.a(w0Var2.c);
            long j4 = w0Var2.e;
            int i = (j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1));
            long j5 = w0Var.e;
            if (i != 0 && j4 != j5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                v0Var2.h();
                if (j5 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = v0Var2.o + j5;
                }
                if (v0Var2 == this.i && !v0Var2.f.f && (j2 == Long.MIN_VALUE || j2 >= j3)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!l(v0Var2) && !z3) {
                    return true;
                }
                return false;
            }
            v0Var = v0Var2;
        }
        return true;
    }
}
