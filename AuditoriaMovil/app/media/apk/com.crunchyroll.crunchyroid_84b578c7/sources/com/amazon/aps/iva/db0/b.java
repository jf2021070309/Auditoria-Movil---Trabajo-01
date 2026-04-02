package com.amazon.aps.iva.db0;

import java.util.logging.Logger;
/* compiled from: MetadataParser.java */
/* loaded from: classes4.dex */
public final class b {
    public static final Logger b = Logger.getLogger(b.class.getName());
    public final boolean a = false;

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0064: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:34:0x0064 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.io.InputStream r9) {
        /*
            r8 = this;
            java.util.logging.Logger r0 = com.amazon.aps.iva.db0.b.b
            java.lang.String r1 = "Error closing input stream (ignored)"
            if (r9 != 0) goto L19
            boolean r9 = r8.a
            if (r9 != 0) goto L11
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r9 = (java.util.List) r9
            return r9
        L11:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Source cannot be null"
            r9.<init>(r0)
            throw r9
        L19:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            int r4 = r3.readInt()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r5 = 0
        L29:
            if (r5 >= r4) goto L39
            com.amazon.aps.iva.ab0.f r6 = new com.amazon.aps.iva.ab0.f     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r6.<init>()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r6.readExternal(r3)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r2.add(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            int r5 = r5 + 1
            goto L29
        L39:
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            if (r4 != 0) goto L4a
            r3.close()     // Catch: java.io.IOException -> L43
            goto L49
        L43:
            r9 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r9)
        L49:
            return r2
        L4a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            throw r2     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L52:
            r2 = move-exception
            goto L64
        L54:
            r2 = move-exception
            goto L5c
        L56:
            r3 = move-exception
            goto L67
        L58:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L5c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L64:
            r7 = r3
            r3 = r2
            r2 = r7
        L67:
            if (r2 == 0) goto L74
            r2.close()     // Catch: java.io.IOException -> L6d
            goto L7e
        L6d:
            r9 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r0.log(r2, r1, r9)
            goto L7e
        L74:
            r9.close()     // Catch: java.io.IOException -> L78
            goto L7e
        L78:
            r9 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r0.log(r2, r1, r9)
        L7e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.db0.b.a(java.io.InputStream):java.util.List");
    }
}
