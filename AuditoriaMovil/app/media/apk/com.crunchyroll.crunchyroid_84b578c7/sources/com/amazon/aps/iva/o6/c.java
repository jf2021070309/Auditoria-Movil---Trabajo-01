package com.amazon.aps.iva.o6;
/* compiled from: BundledExtractorsAdapter.java */
/* loaded from: classes.dex */
public final class c implements c0 {
    public final com.amazon.aps.iva.x6.s a;
    public com.amazon.aps.iva.x6.n b;
    public com.amazon.aps.iva.x6.i c;

    public c(com.amazon.aps.iva.x6.s sVar) {
        this.a = sVar;
    }

    public final long a() {
        com.amazon.aps.iva.x6.i iVar = this.c;
        if (iVar != null) {
            return iVar.d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.amazon.aps.iva.w5.f r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.amazon.aps.iva.x6.p r15) throws java.io.IOException {
        /*
            r7 = this;
            com.amazon.aps.iva.x6.i r6 = new com.amazon.aps.iva.x6.i
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            com.amazon.aps.iva.x6.n r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            com.amazon.aps.iva.x6.s r8 = r7.a
            com.amazon.aps.iva.x6.n[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L21
            r8 = r8[r14]
            r7.b = r8
            goto Lae
        L21:
            int r10 = r8.length
            r0 = r14
        L23:
            if (r0 >= r10) goto L66
            r1 = r8[r0]
            boolean r2 = r1.b(r6)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            if (r2 == 0) goto L32
            r7.b = r1     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            r6.f = r14
            goto L66
        L32:
            com.amazon.aps.iva.x6.n r1 = r7.b
            if (r1 != 0) goto L5d
            long r1 = r6.d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L3d:
            r8 = move-exception
            com.amazon.aps.iva.x6.n r9 = r7.b
            if (r9 != 0) goto L4a
            long r9 = r6.d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L49
            goto L4a
        L49:
            r13 = r14
        L4a:
            com.amazon.aps.iva.cq.b.C(r13)
            r6.f = r14
            throw r8
        L50:
            com.amazon.aps.iva.x6.n r1 = r7.b
            if (r1 != 0) goto L5d
            long r1 = r6.d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L5b:
            r1 = r14
            goto L5e
        L5d:
            r1 = r13
        L5e:
            com.amazon.aps.iva.cq.b.C(r1)
            r6.f = r14
            int r0 = r0 + 1
            goto L23
        L66:
            com.amazon.aps.iva.x6.n r10 = r7.b
            if (r10 != 0) goto Lae
            com.amazon.aps.iva.o6.p0 r10 = new com.amazon.aps.iva.o6.p0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = com.amazon.aps.iva.t5.g0.a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L7a:
            int r13 = r8.length
            if (r14 >= r13) goto L97
            r13 = r8[r14]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            int r13 = r8.length
            int r13 = r13 + (-1)
            if (r14 >= r13) goto L94
            java.lang.String r13 = ", "
            r12.append(r13)
        L94:
            int r14 = r14 + 1
            goto L7a
        L97:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lae:
            com.amazon.aps.iva.x6.n r8 = r7.b
            r8.g(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.c.b(com.amazon.aps.iva.w5.f, android.net.Uri, java.util.Map, long, long, com.amazon.aps.iva.x6.p):void");
    }
}
