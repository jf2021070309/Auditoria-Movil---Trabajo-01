package com.fyber.inneractive.sdk.player.c.h.a;

import com.fyber.inneractive.sdk.player.c.k.k;
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(long r16, com.fyber.inneractive.sdk.player.c.k.k r18, com.fyber.inneractive.sdk.player.c.d.n[] r19) {
        /*
            r0 = r18
            r1 = r19
        L4:
            int r2 = r18.b()
            r3 = 1
            if (r2 <= r3) goto L90
            int r2 = a(r18)
            int r4 = a(r18)
            r5 = -1
            if (r4 == r5) goto L82
            int r5 = r18.b()
            if (r4 <= r5) goto L1e
            goto L82
        L1e:
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 0
            if (r2 != r5) goto L4e
            if (r4 >= r7) goto L28
            goto L4e
        L28:
            int r2 = r0.b
            int r5 = r18.d()
            int r9 = r18.e()
            int r10 = r18.j()
            int r11 = r18.d()
            r0.c(r2)
            r2 = 181(0xb5, float:2.54E-43)
            if (r5 != r2) goto L4e
            r2 = 49
            if (r9 != r2) goto L4e
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r10 != r2) goto L4e
            if (r11 != r6) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = r8
        L4f:
            if (r2 == 0) goto L7e
            r0.d(r7)
            int r2 = r18.d()
            r2 = r2 & 31
            r0.d(r3)
            int r2 = r2 * r6
            int r3 = r0.b
            int r5 = r1.length
        L61:
            if (r8 >= r5) goto L77
            r9 = r1[r8]
            r0.c(r3)
            r9.a(r0, r2)
            r12 = 1
            r14 = 0
            r15 = 0
            r10 = r16
            r13 = r2
            r9.a(r10, r12, r13, r14, r15)
            int r8 = r8 + 1
            goto L61
        L77:
            int r2 = r2 + 10
            int r4 = r4 - r2
            r0.d(r4)
            goto L4
        L7e:
            r0.d(r4)
            goto L4
        L82:
            java.lang.String r2 = "CeaUtil"
            java.lang.String r3 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r2, r3)
            int r2 = r0.c
            r0.c(r2)
            goto L4
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.h.a.a.a(long, com.fyber.inneractive.sdk.player.c.k.k, com.fyber.inneractive.sdk.player.c.d.n[]):void");
    }

    private static int a(k kVar) {
        int i = 0;
        while (kVar.b() != 0) {
            int d = kVar.d();
            i += d;
            if (d != 255) {
                return i;
            }
        }
        return -1;
    }
}
