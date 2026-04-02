package com.amazon.aps.iva.y6;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.h;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: AmrExtractor.java */
/* loaded from: classes.dex */
public final class b implements n {
    public static final int[] q;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public p l;
    public f0 m;
    public d0 n;
    public boolean o;
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] r = g0.H("#!AMR\n");
    public static final byte[] s = g0.H("#!AMR-WB\n");
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        t = iArr[8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.amazon.aps.iva.x6.i r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r6.f = r0
            byte[] r1 = r5.a
            r2 = 1
            r6.c(r1, r0, r2, r0)
            r6 = r1[r0]
            r1 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r1 > 0) goto L6e
            int r6 = r6 >> 3
            r1 = 15
            r6 = r6 & r1
            if (r6 < 0) goto L3a
            if (r6 > r1) goto L3a
            boolean r1 = r5.c
            if (r1 == 0) goto L27
            r4 = 10
            if (r6 < r4) goto L25
            r4 = 13
            if (r6 <= r4) goto L27
        L25:
            r4 = r2
            goto L28
        L27:
            r4 = r0
        L28:
            if (r4 != 0) goto L39
            if (r1 != 0) goto L36
            r1 = 12
            if (r6 < r1) goto L34
            r1 = 14
            if (r6 <= r1) goto L36
        L34:
            r1 = r2
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 == 0) goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal AMR "
            r0.<init>(r1)
            boolean r1 = r5.c
            if (r1 == 0) goto L4a
            java.lang.String r1 = "WB"
            goto L4c
        L4a:
            java.lang.String r1 = "NB"
        L4c:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.amazon.aps.iva.q5.h0 r6 = com.amazon.aps.iva.q5.h0.a(r6, r3)
            throw r6
        L60:
            boolean r0 = r5.c
            if (r0 == 0) goto L69
            int[] r0 = com.amazon.aps.iva.y6.b.q
            r6 = r0[r6]
            goto L6d
        L69:
            int[] r0 = com.amazon.aps.iva.y6.b.p
            r6 = r0[r6]
        L6d:
            return r6
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.amazon.aps.iva.q5.h0 r6 = com.amazon.aps.iva.q5.h0.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y6.b.a(com.amazon.aps.iva.x6.i):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        return d((i) oVar);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            d0 d0Var = this.n;
            if (d0Var instanceof h) {
                h hVar = (h) d0Var;
                this.k = ((Math.max(0L, j - hVar.b) * 8) * 1000000) / hVar.e;
                return;
            }
        }
        this.k = 0L;
    }

    public final boolean d(i iVar) throws IOException {
        iVar.f = 0;
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        iVar.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            iVar.k(bArr.length);
            return true;
        }
        iVar.f = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        iVar.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        iVar.k(bArr3.length);
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.l = pVar;
        this.m = pVar.r(0, 1);
        pVar.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r18, com.amazon.aps.iva.x6.c0 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y6.b.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
