package com.amazon.aps.iva.x6;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import com.google.common.primitives.SignedBytes;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: Ac4Util.java */
/* loaded from: classes.dex */
public final class c {
    public static final int[] a = {CastStatusCodes.CANCELED, CastStatusCodes.AUTHENTICATION_FAILED, 1920, 1601, 1600, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1000, 960, 800, 800, 480, MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, 2048};

    /* compiled from: Ac4Util.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static void a(int i, com.amazon.aps.iva.t5.v vVar) {
        vVar.C(7);
        byte[] bArr = vVar.a;
        bArr[0] = -84;
        bArr[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.x6.c.a b(com.amazon.aps.iva.t5.u r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.r(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            int r9 = r9.i(r3)
            int[] r8 = com.amazon.aps.iva.x6.c.a
            if (r5 != r7) goto L65
            r7 = 13
            if (r9 != r7) goto L65
            r9 = r8[r9]
            goto L92
        L65:
            if (r5 != r6) goto L91
            r6 = 14
            if (r9 >= r6) goto L91
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L89
            r7 = 11
            if (r2 == r1) goto L84
            if (r2 == r4) goto L89
            if (r2 == r3) goto L7d
            goto L8f
        L7d:
            if (r9 == r4) goto L8d
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L84:
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L89:
            if (r9 == r4) goto L8d
            if (r9 != r8) goto L8f
        L8d:
            int r6 = r6 + 1
        L8f:
            r9 = r6
            goto L92
        L91:
            r9 = 0
        L92:
            com.amazon.aps.iva.x6.c$a r1 = new com.amazon.aps.iva.x6.c$a
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x6.c.b(com.amazon.aps.iva.t5.u):com.amazon.aps.iva.x6.c$a");
    }
}
