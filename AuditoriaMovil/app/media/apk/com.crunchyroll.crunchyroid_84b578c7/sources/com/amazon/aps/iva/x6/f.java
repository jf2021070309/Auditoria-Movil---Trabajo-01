package com.amazon.aps.iva.x6;
/* compiled from: CeaUtil.java */
/* loaded from: classes.dex */
public final class f {
    public static void a(long j, com.amazon.aps.iva.t5.v vVar, f0[] f0VarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (vVar.c - vVar.b > 1) {
                int i3 = 0;
                while (true) {
                    if (vVar.c - vVar.b == 0) {
                        i = -1;
                        break;
                    }
                    int u = vVar.u();
                    i3 += u;
                    if (u != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (vVar.c - vVar.b == 0) {
                        i4 = -1;
                        break;
                    }
                    int u2 = vVar.u();
                    i4 += u2;
                    if (u2 != 255) {
                        break;
                    }
                }
                int i5 = vVar.b;
                int i6 = i5 + i4;
                if (i4 != -1 && i4 <= vVar.c - i5) {
                    if (i == 4 && i4 >= 8) {
                        int u3 = vVar.u();
                        int z3 = vVar.z();
                        if (z3 == 49) {
                            i2 = vVar.e();
                        } else {
                            i2 = 0;
                        }
                        int u4 = vVar.u();
                        if (z3 == 47) {
                            vVar.G(1);
                        }
                        if (u3 == 181 && ((z3 == 49 || z3 == 47) && u4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, vVar, f0VarArr);
                        }
                    }
                } else {
                    com.amazon.aps.iva.t5.p.g();
                    i6 = vVar.c;
                }
                vVar.F(i6);
            } else {
                return;
            }
        }
    }

    public static void b(long j, com.amazon.aps.iva.t5.v vVar, f0[] f0VarArr) {
        boolean z;
        int u = vVar.u();
        if ((u & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        vVar.G(1);
        int i = (u & 31) * 3;
        int i2 = vVar.b;
        for (f0 f0Var : f0VarArr) {
            vVar.F(i2);
            f0Var.a(i, vVar);
            if (j != -9223372036854775807L) {
                f0Var.d(j, 1, i, 0, null);
            }
        }
    }
}
