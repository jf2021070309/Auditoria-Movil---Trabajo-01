package com.bytedance.pangle.util.a;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class b {
    private static String a = "";

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
        r0 = com.bytedance.pangle.util.f.a(r13.array());
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
        r13 = "without v2 & v3 signature.";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] a(java.io.File r13) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 1
            java.nio.ByteBuffer r13 = b(r13)     // Catch: java.lang.Exception -> Ld2
            java.nio.ByteOrder r3 = r13.order()     // Catch: java.lang.Exception -> Ld2
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> Ld2
            if (r3 != r4) goto Lca
            int r3 = r13.capacity()     // Catch: java.lang.Exception -> Ld2
            int r3 = r3 + (-24)
            java.nio.ByteBuffer r3 = a(r13, r3)     // Catch: java.lang.Exception -> Ld2
            r4 = r1
        L1e:
            boolean r5 = r3.hasRemaining()     // Catch: java.lang.Exception -> Ld2
            if (r5 == 0) goto Lb8
            int r4 = r4 + r2
            int r5 = r3.remaining()     // Catch: java.lang.Exception -> Ld2
            r6 = 8
            if (r5 < r6) goto La8
            long r5 = r3.getLong()     // Catch: java.lang.Exception -> Ld2
            r7 = 4
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r8 = " size out of range: "
            java.lang.String r9 = "APK Signing Block entry #"
            if (r7 < 0) goto L90
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 > 0) goto L90
            int r5 = (int) r5
            int r6 = r3.position()     // Catch: java.lang.Exception -> Ld2
            int r6 = r6 + r5
            int r7 = r3.remaining()     // Catch: java.lang.Exception -> Ld2
            if (r5 > r7) goto L6c
            int r5 = r3.getInt()     // Catch: java.lang.Exception -> Ld2
            r7 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            if (r5 != r7) goto L5d
            java.lang.String r3 = "V3"
            com.bytedance.pangle.util.a.b.a = r3     // Catch: java.lang.Exception -> Ld2
            r3 = r2
            goto Lb9
        L5d:
            r7 = 1896449818(0x7109871a, float:6.810044E29)
            if (r5 != r7) goto L68
            java.lang.String r3 = "V2"
            com.bytedance.pangle.util.a.b.a = r3     // Catch: java.lang.Exception -> Ld2
            r3 = r2
            goto Lb9
        L68:
            r3.position(r6)     // Catch: java.lang.Exception -> Ld2
            goto L1e
        L6c:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld2
            r6.<init>(r9)     // Catch: java.lang.Exception -> Ld2
            r6.append(r4)     // Catch: java.lang.Exception -> Ld2
            r6.append(r8)     // Catch: java.lang.Exception -> Ld2
            r6.append(r5)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r4 = ", available: "
            r6.append(r4)     // Catch: java.lang.Exception -> Ld2
            int r3 = r3.remaining()     // Catch: java.lang.Exception -> Ld2
            r6.append(r3)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> Ld2
            r13.<init>(r3)     // Catch: java.lang.Exception -> Ld2
            throw r13     // Catch: java.lang.Exception -> Ld2
        L90:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld2
            r3.<init>(r9)     // Catch: java.lang.Exception -> Ld2
            r3.append(r4)     // Catch: java.lang.Exception -> Ld2
            r3.append(r8)     // Catch: java.lang.Exception -> Ld2
            r3.append(r5)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Ld2
            r13.<init>(r3)     // Catch: java.lang.Exception -> Ld2
            throw r13     // Catch: java.lang.Exception -> Ld2
        La8:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = "Insufficient data to read size of APK Signing Block entry #"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> Ld2
            r13.<init>(r3)     // Catch: java.lang.Exception -> Ld2
            throw r13     // Catch: java.lang.Exception -> Ld2
        Lb8:
            r3 = r1
        Lb9:
            if (r3 == 0) goto Lc7
            byte[] r13 = r13.array()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r13 = com.bytedance.pangle.util.f.a(r13)     // Catch: java.lang.Exception -> Ld2
            r12 = r0
            r0 = r13
            r13 = r12
            goto Ld4
        Lc7:
            java.lang.String r13 = "without v2 & v3 signature."
            goto Ld4
        Lca:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = "ByteBuffer byte order must be little endian"
            r13.<init>(r3)     // Catch: java.lang.Exception -> Ld2
            throw r13     // Catch: java.lang.Exception -> Ld2
        Ld2:
            r13 = move-exception
            r13 = r0
        Ld4:
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r1] = r0
            java.lang.String r0 = com.bytedance.pangle.util.a.b.a
            r3[r2] = r0
            r0 = 2
            r3[r0] = r13
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.a.b.a(java.io.File):java.lang.String[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:4:0x000b, B:13:0x002a, B:15:0x0041, B:20:0x0054, B:22:0x0069, B:26:0x0087, B:28:0x00ba, B:30:0x00c7, B:34:0x00db, B:36:0x00e5, B:38:0x0108, B:41:0x0118, B:42:0x0133, B:43:0x0134, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:47:0x0154, B:48:0x015b, B:49:0x015c, B:50:0x016b, B:51:0x016c, B:52:0x0173, B:53:0x0174, B:54:0x018f, B:55:0x0190, B:56:0x0197, B:57:0x0198, B:58:0x019f, B:7:0x0017, B:10:0x001e), top: B:65:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:4:0x000b, B:13:0x002a, B:15:0x0041, B:20:0x0054, B:22:0x0069, B:26:0x0087, B:28:0x00ba, B:30:0x00c7, B:34:0x00db, B:36:0x00e5, B:38:0x0108, B:41:0x0118, B:42:0x0133, B:43:0x0134, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:47:0x0154, B:48:0x015b, B:49:0x015c, B:50:0x016b, B:51:0x016c, B:52:0x0173, B:53:0x0174, B:54:0x018f, B:55:0x0190, B:56:0x0197, B:57:0x0198, B:58:0x019f, B:7:0x0017, B:10:0x001e), top: B:65:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.ByteBuffer b(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.a.b.b(java.io.File):java.nio.ByteBuffer");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i < 8) {
            throw new IllegalArgumentException("end < start: " + i + " < 8");
        }
        int capacity = byteBuffer.capacity();
        if (i > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }
}
