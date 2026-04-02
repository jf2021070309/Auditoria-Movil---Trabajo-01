package com.amazon.aps.iva.x5;

import java.io.File;
import java.util.regex.Pattern;
/* compiled from: SimpleCacheSpan.java */
/* loaded from: classes.dex */
public final class s extends h {
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (r16.renameTo(r1) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.x5.s a(java.io.File r16, long r17, long r19, com.amazon.aps.iva.x5.k r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.s.a(java.io.File, long, long, com.amazon.aps.iva.x5.k):com.amazon.aps.iva.x5.s");
    }

    public static File b(File file, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        sb.append(".");
        return new File(file, com.amazon.aps.iva.c.b.b(sb, j3, ".v3.exo"));
    }
}
