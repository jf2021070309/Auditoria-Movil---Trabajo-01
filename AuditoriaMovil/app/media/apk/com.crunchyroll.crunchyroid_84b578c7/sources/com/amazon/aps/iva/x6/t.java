package com.amazon.aps.iva.x6;
/* compiled from: FlacFrameReader.java */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: FlacFrameReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public long a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
        if (r7 == r18.f) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
        if ((r17.u() * 1000) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
        if (r4 == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.amazon.aps.iva.t5.v r17, com.amazon.aps.iva.x6.w r18, int r19, com.amazon.aps.iva.x6.t.a r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x6.t.a(com.amazon.aps.iva.t5.v, com.amazon.aps.iva.x6.w, int, com.amazon.aps.iva.x6.t$a):boolean");
    }

    public static int b(int i, com.amazon.aps.iva.t5.v vVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return vVar.u() + 1;
            case 7:
                return vVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
