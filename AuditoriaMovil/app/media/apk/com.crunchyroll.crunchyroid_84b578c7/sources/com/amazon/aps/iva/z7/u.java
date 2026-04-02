package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.e;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.x6.e {

    /* compiled from: PsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class a implements e.f {
        public final com.amazon.aps.iva.t5.b0 a;
        public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v();

        public a(com.amazon.aps.iva.t5.b0 b0Var) {
            this.a = b0Var;
        }

        @Override // com.amazon.aps.iva.x6.e.f
        public final e.C0845e a(com.amazon.aps.iva.x6.i iVar, long j) throws IOException {
            int d;
            long j2 = iVar.d;
            int min = (int) Math.min(20000L, iVar.c - j2);
            com.amazon.aps.iva.t5.v vVar = this.b;
            vVar.C(min);
            iVar.c(vVar.a, 0, min, false);
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (true) {
                int i3 = vVar.c;
                int i4 = vVar.b;
                if (i3 - i4 >= 4) {
                    if (u.d(i4, vVar.a) != 442) {
                        vVar.G(1);
                    } else {
                        vVar.G(4);
                        long c = v.c(vVar);
                        if (c != -9223372036854775807L) {
                            long b = this.a.b(c);
                            if (b > j) {
                                if (j3 == -9223372036854775807L) {
                                    return new e.C0845e(-1, b, j2);
                                }
                                return e.C0845e.a(j2 + i2);
                            } else if (100000 + b > j) {
                                return e.C0845e.a(j2 + vVar.b);
                            } else {
                                i2 = vVar.b;
                                j3 = b;
                            }
                        }
                        int i5 = vVar.c;
                        if (i5 - vVar.b < 10) {
                            vVar.F(i5);
                        } else {
                            vVar.G(9);
                            int u = vVar.u() & 7;
                            if (vVar.c - vVar.b < u) {
                                vVar.F(i5);
                            } else {
                                vVar.G(u);
                                int i6 = vVar.c;
                                int i7 = vVar.b;
                                if (i6 - i7 < 4) {
                                    vVar.F(i5);
                                } else {
                                    if (u.d(i7, vVar.a) == 443) {
                                        vVar.G(4);
                                        int z = vVar.z();
                                        if (vVar.c - vVar.b < z) {
                                            vVar.F(i5);
                                        } else {
                                            vVar.G(z);
                                        }
                                    }
                                    while (true) {
                                        int i8 = vVar.c;
                                        int i9 = vVar.b;
                                        if (i8 - i9 < 4 || (d = u.d(i9, vVar.a)) == 442 || d == 441 || (d >>> 8) != 1) {
                                            break;
                                        }
                                        vVar.G(4);
                                        if (vVar.c - vVar.b < 2) {
                                            vVar.F(i5);
                                            break;
                                        }
                                        vVar.F(Math.min(vVar.c, vVar.b + vVar.z()));
                                    }
                                }
                            }
                        }
                        i = vVar.b;
                    }
                } else if (j3 != -9223372036854775807L) {
                    return new e.C0845e(-2, j3, j2 + i);
                } else {
                    return e.C0845e.d;
                }
            }
        }

        @Override // com.amazon.aps.iva.x6.e.f
        public final void b() {
            byte[] bArr = g0.e;
            com.amazon.aps.iva.t5.v vVar = this.b;
            vVar.getClass();
            vVar.D(bArr.length, bArr);
        }
    }

    public u(com.amazon.aps.iva.t5.b0 b0Var, long j, long j2) {
        super(new e.b(), new a(b0Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }
}
