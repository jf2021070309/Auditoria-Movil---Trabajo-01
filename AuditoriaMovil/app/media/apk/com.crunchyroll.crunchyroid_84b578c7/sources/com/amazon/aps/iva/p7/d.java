package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.t5.v;
/* compiled from: OggPacket.java */
/* loaded from: classes.dex */
public final class d {
    public final e a = new e();
    public final v b = new v(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.amazon.aps.iva.x6.i r11) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.e
            r1 = 0
            com.amazon.aps.iva.t5.v r2 = r10.b
            if (r0 == 0) goto Lc
            r10.e = r1
            r2.C(r1)
        Lc:
            boolean r0 = r10.e
            r3 = 1
            if (r0 != 0) goto La9
            int r0 = r10.c
            r4 = 255(0xff, float:3.57E-43)
            com.amazon.aps.iva.p7.e r5 = r10.a
            if (r0 >= 0) goto L5c
            r6 = -1
            boolean r0 = r5.b(r11, r6)
            if (r0 == 0) goto L5b
            boolean r0 = r5.a(r11, r3)
            if (r0 != 0) goto L28
            goto L5b
        L28:
            int r0 = r5.d
            int r6 = r5.a
            r6 = r6 & r3
            if (r6 != r3) goto L4e
            int r6 = r2.c
            if (r6 != 0) goto L4e
            r10.d = r1
            r6 = r1
        L36:
            int r7 = r10.d
            int r8 = r1 + r7
            int r9 = r5.c
            if (r8 >= r9) goto L49
            int r7 = r7 + 1
            r10.d = r7
            int[] r7 = r5.f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L36
        L49:
            int r0 = r0 + r6
            int r6 = r10.d
            int r6 = r6 + r1
            goto L4f
        L4e:
            r6 = r1
        L4f:
            r11.k(r0)     // Catch: java.io.EOFException -> L54
            r0 = r3
            goto L55
        L54:
            r0 = r1
        L55:
            if (r0 != 0) goto L58
            return r1
        L58:
            r10.c = r6
            goto L5c
        L5b:
            return r1
        L5c:
            int r0 = r10.c
            r10.d = r1
            r6 = r1
        L61:
            int r7 = r10.d
            int r8 = r0 + r7
            int r9 = r5.c
            if (r8 >= r9) goto L74
            int r7 = r7 + 1
            r10.d = r7
            int[] r7 = r5.f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L61
        L74:
            int r0 = r10.c
            int r7 = r10.d
            int r0 = r0 + r7
            if (r6 <= 0) goto La0
            int r7 = r2.c
            int r7 = r7 + r6
            r2.a(r7)
            byte[] r7 = r2.a
            int r8 = r2.c
            r11.f(r7, r8, r6, r1)     // Catch: java.io.EOFException -> L8a
            r7 = r3
            goto L8b
        L8a:
            r7 = r1
        L8b:
            if (r7 != 0) goto L8e
            return r1
        L8e:
            int r7 = r2.c
            int r7 = r7 + r6
            r2.E(r7)
            int[] r6 = r5.f
            int r7 = r0 + (-1)
            r6 = r6[r7]
            if (r6 == r4) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            r10.e = r3
        La0:
            int r3 = r5.c
            if (r0 != r3) goto La5
            r0 = -1
        La5:
            r10.c = r0
            goto Lc
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p7.d.a(com.amazon.aps.iva.x6.i):boolean");
    }
}
