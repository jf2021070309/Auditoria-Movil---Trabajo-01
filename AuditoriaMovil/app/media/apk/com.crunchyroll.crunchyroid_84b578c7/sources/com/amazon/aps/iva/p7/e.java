package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.v;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: OggPageHeader.java */
/* loaded from: classes.dex */
public final class e {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final v g = new v(255);

    public final boolean a(com.amazon.aps.iva.x6.i iVar, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        v vVar = this.g;
        vVar.C(27);
        try {
            z2 = iVar.c(vVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (!z2 || vVar.v() != 1332176723) {
            return false;
        }
        if (vVar.u() != 0) {
            if (z) {
                return false;
            }
            throw h0.c("unsupported bit stream revision");
        }
        this.a = vVar.u();
        this.b = vVar.i();
        vVar.k();
        vVar.k();
        vVar.k();
        int u = vVar.u();
        this.c = u;
        this.d = u + 27;
        vVar.C(u);
        try {
            z3 = iVar.c(vVar.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (z) {
                z3 = false;
            } else {
                throw e2;
            }
        }
        if (!z3) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int u2 = vVar.u();
            this.f[i] = u2;
            this.e += u2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r10.d >= r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10.q(1) == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.amazon.aps.iva.x6.i r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r10.d
            long r2 = r10.h()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            com.amazon.aps.iva.cq.b.t(r0)
            com.amazon.aps.iva.t5.v r0 = r9.g
            r3 = 4
            r0.C(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.a
            boolean r5 = r10.c(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.F(r1)
            long r4 = r0.v()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f = r1
            return r2
        L42:
            r10.k(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.q(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p7.e.b(com.amazon.aps.iva.x6.i, long):boolean");
    }
}
