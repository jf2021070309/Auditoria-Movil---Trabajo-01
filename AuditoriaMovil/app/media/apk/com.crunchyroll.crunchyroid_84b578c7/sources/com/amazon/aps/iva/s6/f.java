package com.amazon.aps.iva.s6;

import com.google.common.base.Predicate;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Predicate {
    public final /* synthetic */ g b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r2.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:37:0x005a, B:39:0x005e, B:41:0x0062, B:43:0x0066, B:45:0x006a, B:47:0x006e, B:49:0x0072, B:51:0x007a, B:53:0x0084, B:57:0x0090), top: B:62:0x0007 }] */
    @Override // com.google.common.base.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.s6.g r0 = r8.b
            com.amazon.aps.iva.q5.v r9 = (com.amazon.aps.iva.q5.v) r9
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            com.amazon.aps.iva.s6.g$c r2 = r0.h     // Catch: java.lang.Throwable -> L92
            boolean r2 = r2.F0     // Catch: java.lang.Throwable -> L92
            r3 = 1
            if (r2 == 0) goto L90
            boolean r2 = r0.g     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L90
            int r2 = r9.z     // Catch: java.lang.Throwable -> L92
            r4 = 2
            if (r2 <= r4) goto L90
            java.lang.String r2 = r9.m     // Catch: java.lang.Throwable -> L92
            r5 = 0
            if (r2 != 0) goto L1d
            goto L53
        L1d:
            int r6 = r2.hashCode()
            r7 = -1
            switch(r6) {
                case -2123537834: goto L46;
                case 187078296: goto L3b;
                case 187078297: goto L32;
                case 1504578661: goto L27;
                default: goto L25;
            }
        L25:
            r4 = r7
            goto L50
        L27:
            java.lang.String r4 = "audio/eac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L30
            goto L25
        L30:
            r4 = 3
            goto L50
        L32:
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L50
            goto L25
        L3b:
            java.lang.String r4 = "audio/ac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L44
            goto L25
        L44:
            r4 = r3
            goto L50
        L46:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4f
            goto L25
        L4f:
            r4 = r5
        L50:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L53;
            }
        L53:
            r2 = r5
            goto L56
        L55:
            r2 = r3
        L56:
            r4 = 32
            if (r2 == 0) goto L66
            int r2 = com.amazon.aps.iva.t5.g0.a     // Catch: java.lang.Throwable -> L92
            if (r2 < r4) goto L90
            com.amazon.aps.iva.s6.g$e r2 = r0.i     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L90
            boolean r2 = r2.b     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L90
        L66:
            int r2 = com.amazon.aps.iva.t5.g0.a     // Catch: java.lang.Throwable -> L92
            if (r2 < r4) goto L8f
            com.amazon.aps.iva.s6.g$e r2 = r0.i     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L8f
            boolean r4 = r2.b     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L8f
            android.media.Spatializer r2 = r2.a     // Catch: java.lang.Throwable -> L92
            boolean r2 = com.amazon.aps.iva.s6.l.a(r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L8f
            com.amazon.aps.iva.s6.g$e r2 = r0.i     // Catch: java.lang.Throwable -> L92
            android.media.Spatializer r2 = r2.a     // Catch: java.lang.Throwable -> L92
            boolean r2 = com.amazon.aps.iva.s6.k.a(r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L8f
            com.amazon.aps.iva.s6.g$e r2 = r0.i     // Catch: java.lang.Throwable -> L92
            com.amazon.aps.iva.q5.f r0 = r0.j     // Catch: java.lang.Throwable -> L92
            boolean r9 = r2.a(r0, r9)     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto L8f
            goto L90
        L8f:
            r3 = r5
        L90:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            return r3
        L92:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s6.f.apply(java.lang.Object):boolean");
    }
}
