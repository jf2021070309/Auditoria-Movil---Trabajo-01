package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger zzel = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzem = new LibraryVersion();
    private ConcurrentHashMap<String, String> zzen = new ConcurrentHashMap<>();

    public static LibraryVersion getInstance() {
        return zzem;
    }

    protected LibraryVersion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVersion(java.lang.String r8) {
        /*
            r7 = this;
            r1 = 0
            java.lang.String r0 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r7.zzen
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L17
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r7.zzen
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
        L16:
            return r0
        L17:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r2 = "/%s.properties"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L9e
            r4 = 0
            r3[r4] = r8     // Catch: java.io.IOException -> L9e
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.io.IOException -> L9e
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r3 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r2 = r3.getResourceAsStream(r2)     // Catch: java.io.IOException -> L9e
            if (r2 == 0) goto L7f
            r0.load(r2)     // Catch: java.io.IOException -> L9e
            java.lang.String r2 = "version"
            r3 = 0
            java.lang.String r1 = r0.getProperty(r2, r3)     // Catch: java.io.IOException -> L9e
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.common.internal.LibraryVersion.zzel     // Catch: java.io.IOException -> Lc0
            java.lang.String r2 = "LibraryVersion"
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch: java.io.IOException -> Lc0
            int r3 = r3.length()     // Catch: java.io.IOException -> Lc0
            int r3 = r3 + 12
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> Lc0
            int r4 = r4.length()     // Catch: java.io.IOException -> Lc0
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc0
            r4.<init>(r3)     // Catch: java.io.IOException -> Lc0
            java.lang.StringBuilder r3 = r4.append(r8)     // Catch: java.io.IOException -> Lc0
            java.lang.String r4 = " version is "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.io.IOException -> Lc0
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.io.IOException -> Lc0
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> Lc0
            r0.v(r2, r3)     // Catch: java.io.IOException -> Lc0
            r0 = r1
        L6c:
            if (r0 != 0) goto L79
            java.lang.String r0 = "UNKNOWN"
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zzel
            java.lang.String r2 = "LibraryVersion"
            java.lang.String r3 = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used"
            r1.d(r2, r3)
        L79:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r7.zzen
            r1.put(r8, r0)
            goto L16
        L7f:
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.common.internal.LibraryVersion.zzel     // Catch: java.io.IOException -> L9e
            java.lang.String r3 = "LibraryVersion"
            java.lang.String r4 = "Failed to get app version for libraryName: "
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.io.IOException -> L9e
            int r5 = r0.length()     // Catch: java.io.IOException -> L9e
            if (r5 == 0) goto L98
            java.lang.String r0 = r4.concat(r0)     // Catch: java.io.IOException -> L9e
        L93:
            r2.e(r3, r0)     // Catch: java.io.IOException -> L9e
            r0 = r1
            goto L6c
        L98:
            java.lang.String r0 = new java.lang.String     // Catch: java.io.IOException -> L9e
            r0.<init>(r4)     // Catch: java.io.IOException -> L9e
            goto L93
        L9e:
            r0 = move-exception
            r2 = r1
            r1 = r0
        La1:
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zzel
            java.lang.String r4 = "LibraryVersion"
            java.lang.String r5 = "Failed to get app version for libraryName: "
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r6 = r0.length()
            if (r6 == 0) goto Lba
            java.lang.String r0 = r5.concat(r0)
        Lb5:
            r3.e(r4, r0, r1)
            r0 = r2
            goto L6c
        Lba:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto Lb5
        Lc0:
            r0 = move-exception
            r2 = r1
            r1 = r0
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
