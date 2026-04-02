package com.amazon.aps.iva.ef0;
/* compiled from: PeekSource.kt */
/* loaded from: classes4.dex */
public final class v implements d0 {
    public final h b;
    public final e c;
    public y d;
    public int e;
    public boolean f;
    public long g;

    public v(h hVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(hVar, "upstream");
        this.b = hVar;
        e d = hVar.d();
        this.c = d;
        y yVar = d.b;
        this.d = yVar;
        if (yVar != null) {
            i = yVar.b;
        } else {
            i = -1;
        }
        this.e = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r7.b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    @Override // com.amazon.aps.iva.ef0.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(com.amazon.aps.iva.ef0.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L7e
            boolean r5 = r8.f
            r5 = r5 ^ r4
            if (r5 == 0) goto L72
            com.amazon.aps.iva.ef0.y r5 = r8.d
            com.amazon.aps.iva.ef0.e r6 = r8.c
            if (r5 == 0) goto L2a
            com.amazon.aps.iva.ef0.y r7 = r6.b
            if (r5 != r7) goto L2b
            int r5 = r8.e
            com.amazon.aps.iva.yb0.j.c(r7)
            int r7 = r7.b
            if (r5 != r7) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L66
            if (r2 != 0) goto L30
            return r0
        L30:
            long r0 = r8.g
            r2 = 1
            long r0 = r0 + r2
            com.amazon.aps.iva.ef0.h r2 = r8.b
            boolean r0 = r2.w(r0)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            com.amazon.aps.iva.ef0.y r0 = r8.d
            if (r0 != 0) goto L4e
            com.amazon.aps.iva.ef0.y r0 = r6.b
            if (r0 == 0) goto L4e
            r8.d = r0
            int r0 = r0.b
            r8.e = r0
        L4e:
            long r0 = r6.c
            long r2 = r8.g
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            com.amazon.aps.iva.ef0.e r2 = r8.c
            long r3 = r8.g
            r5 = r9
            r6 = r10
            r2.h(r3, r5, r6)
            long r0 = r8.g
            long r0 = r0 + r10
            r8.g = r0
            return r10
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L72:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7e:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = com.amazon.aps.iva.j0.j0.f(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.v.read(com.amazon.aps.iva.ef0.e, long):long");
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return this.b.timeout();
    }
}
