package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.e;
import java.io.IOException;
/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.x6.e {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class a implements e.f {
        public final com.amazon.aps.iva.t5.b0 a;
        public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v();
        public final int c;
        public final int d;

        public a(int i, com.amazon.aps.iva.t5.b0 b0Var, int i2) {
            this.c = i;
            this.a = b0Var;
            this.d = i2;
        }

        @Override // com.amazon.aps.iva.x6.e.f
        public final e.C0845e a(com.amazon.aps.iva.x6.i iVar, long j) throws IOException {
            long j2 = iVar.d;
            int min = (int) Math.min(this.d, iVar.c - j2);
            com.amazon.aps.iva.t5.v vVar = this.b;
            vVar.C(min);
            iVar.c(vVar.a, 0, min, false);
            int i = vVar.c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                int i2 = vVar.c;
                int i3 = vVar.b;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = vVar.a;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long B = com.amazon.aps.iva.ff0.b.B(i3, this.c, vVar);
                if (B != -9223372036854775807L) {
                    long b = this.a.b(B);
                    if (b > j) {
                        if (j5 == -9223372036854775807L) {
                            return new e.C0845e(-1, b, j2);
                        }
                        return e.C0845e.a(j2 + j4);
                    } else if (100000 + b > j) {
                        return e.C0845e.a(j2 + i3);
                    } else {
                        j4 = i3;
                        j5 = b;
                    }
                }
                vVar.F(i4);
                j3 = i4;
            }
            if (j5 != -9223372036854775807L) {
                return new e.C0845e(-2, j5, j2 + j3);
            }
            return e.C0845e.d;
        }

        @Override // com.amazon.aps.iva.x6.e.f
        public final void b() {
            byte[] bArr = g0.e;
            com.amazon.aps.iva.t5.v vVar = this.b;
            vVar.getClass();
            vVar.D(bArr.length, bArr);
        }
    }

    public b0(com.amazon.aps.iva.t5.b0 b0Var, long j, long j2, int i, int i2) {
        super(new e.b(), new a(i, b0Var, i2), j, j + 1, 0L, j2, 188L, 940);
    }
}
