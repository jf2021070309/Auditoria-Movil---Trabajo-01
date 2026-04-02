package com.amazon.aps.iva.a7;

import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.e;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.t;
import com.amazon.aps.iva.x6.w;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: com.amazon.aps.iva.a7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105a implements e.f {
        public final w a;
        public final int b;
        public final t.a c = new t.a();

        public C0105a(w wVar, int i) {
            this.a = wVar;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.x6.e.f
        public final e.C0845e a(i iVar, long j) throws IOException {
            long j2 = iVar.d;
            long c = c(iVar);
            long h = iVar.h();
            iVar.m(Math.max(6, this.a.c), false);
            long c2 = c(iVar);
            long h2 = iVar.h();
            if (c <= j && c2 > j) {
                return e.C0845e.a(h);
            }
            if (c2 <= j) {
                return new e.C0845e(-2, c2, h2);
            }
            return new e.C0845e(-1, c, j2);
        }

        public final long c(i iVar) throws IOException {
            long j;
            t.a aVar;
            w wVar;
            boolean a;
            int o;
            while (true) {
                long h = iVar.h();
                j = iVar.c;
                int i = (h > (j - 6) ? 1 : (h == (j - 6) ? 0 : -1));
                aVar = this.c;
                wVar = this.a;
                if (i >= 0) {
                    break;
                }
                long h2 = iVar.h();
                byte[] bArr = new byte[2];
                iVar.c(bArr, 0, 2, false);
                int i2 = ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE);
                int i3 = this.b;
                if (i2 != i3) {
                    iVar.f = 0;
                    iVar.m((int) (h2 - iVar.d), false);
                    a = false;
                } else {
                    v vVar = new v(16);
                    System.arraycopy(bArr, 0, vVar.a, 0, 2);
                    byte[] bArr2 = vVar.a;
                    int i4 = 0;
                    for (int i5 = 2; i4 < 14 && (o = iVar.o(i5 + i4, bArr2, 14 - i4)) != -1; i5 = 2) {
                        i4 += o;
                    }
                    vVar.E(i4);
                    iVar.f = 0;
                    iVar.m((int) (h2 - iVar.d), false);
                    a = t.a(vVar, wVar, i3, aVar);
                }
                if (a) {
                    break;
                }
                iVar.m(1, false);
            }
            if (iVar.h() >= j - 6) {
                iVar.m((int) (j - iVar.h()), false);
                return wVar.j;
            }
            return aVar.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.amazon.aps.iva.x6.w r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            com.amazon.aps.iva.g1.o r1 = new com.amazon.aps.iva.g1.o
            r2 = 5
            r1.<init>(r15, r2)
            com.amazon.aps.iva.a7.a$a r2 = new com.amazon.aps.iva.a7.a$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.j
            int r7 = r0.c
            int r8 = r0.d
            if (r8 <= 0) goto L26
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L3f
        L26:
            int r8 = r0.b
            int r9 = r0.a
            if (r9 != r8) goto L30
            if (r9 <= 0) goto L30
            long r8 = (long) r9
            goto L32
        L30:
            r8 = 4096(0x1000, double:2.0237E-320)
        L32:
            int r10 = r0.g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L3f:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a7.a.<init>(com.amazon.aps.iva.x6.w, int, long, long):void");
    }
}
