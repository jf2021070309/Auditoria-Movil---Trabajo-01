package com.fyber.inneractive.sdk.player.c.j.a;

import java.io.File;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends g {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static File a(File file, int i2, long j, long j2) {
        return new File(file, i2 + "." + j + "." + j2 + ".v3.exo");
    }

    public static l a(String str, long j) {
        return new l(str, j, -1L, -9223372036854775807L, null);
    }

    public static l b(String str, long j) {
        return new l(str, j, -1L, -9223372036854775807L, null);
    }

    public static l a(String str, long j, long j2) {
        return new l(str, j, j2, -9223372036854775807L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r16.renameTo(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.c.j.a.l a(java.io.File r16, com.fyber.inneractive.sdk.player.c.j.a.i r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L6e
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = com.fyber.inneractive.sdk.player.c.j.a.l.h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.fyber.inneractive.sdk.player.c.k.t.h(r1)
            if (r1 != 0) goto L3f
            goto L39
        L2d:
            java.util.regex.Pattern r2 = com.fyber.inneractive.sdk.player.c.j.a.l.g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L3b
        L39:
            r1 = r6
            goto L64
        L3b:
            java.lang.String r1 = r2.group(r5)
        L3f:
            java.io.File r7 = r16.getParentFile()
            int r8 = r0.c(r1)
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L64
            goto L39
        L64:
            if (r1 != 0) goto L67
            return r6
        L67:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L71
        L6e:
            r2 = r16
            r15 = r2
        L71:
            java.util.regex.Pattern r2 = com.fyber.inneractive.sdk.player.c.j.a.l.i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L7e
            return r6
        L7e:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray<java.lang.String> r0 = r0.b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L96
            return r6
        L96:
            com.fyber.inneractive.sdk.player.c.j.a.l r0 = new com.fyber.inneractive.sdk.player.c.j.a.l
            java.lang.String r2 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r2)
            java.lang.String r1 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r1)
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.j.a.l.a(java.io.File, com.fyber.inneractive.sdk.player.c.j.a.i):com.fyber.inneractive.sdk.player.c.j.a.l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }
}
