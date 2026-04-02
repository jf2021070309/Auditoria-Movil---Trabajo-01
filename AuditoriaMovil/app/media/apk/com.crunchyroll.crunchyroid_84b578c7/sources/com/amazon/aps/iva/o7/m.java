package com.amazon.aps.iva.o7;

import com.amazon.aps.iva.x6.f0;
/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes.dex */
public final class m {
    public final boolean a;
    public final String b;
    public final f0.a c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r6.equals("cbc1") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.amazon.aps.iva.cq.b.t(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            com.amazon.aps.iva.x6.f0$a r5 = new com.amazon.aps.iva.x6.f0$a
            if (r6 != 0) goto L20
            goto L5d
        L20:
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L4c;
                case 3046671: goto L41;
                case 3049879: goto L36;
                case 3049895: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r2
            goto L55
        L2b:
            java.lang.String r7 = "cens"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r0 = 3
            goto L55
        L36:
            java.lang.String r7 = "cenc"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r0 = r11
            goto L55
        L41:
            java.lang.String r7 = "cbcs"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L4a
            goto L29
        L4a:
            r0 = r1
            goto L55
        L4c:
            java.lang.String r7 = "cbc1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L55
            goto L29
        L55:
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L5c;
                case 2: goto L5d;
                case 3: goto L5d;
                default: goto L58;
            }
        L58:
            com.amazon.aps.iva.t5.p.g()
            goto L5d
        L5c:
            r1 = r11
        L5d:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.m.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
