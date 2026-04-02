package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.z7.e0;
import java.util.Arrays;
/* compiled from: AdtsReader.java */
/* loaded from: classes.dex */
public final class f implements j {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public com.amazon.aps.iva.x6.f0 f;
    public com.amazon.aps.iva.x6.f0 g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public com.amazon.aps.iva.x6.f0 t;
    public long u;
    public final com.amazon.aps.iva.t5.u b = new com.amazon.aps.iva.t5.u(new byte[7]);
    public final com.amazon.aps.iva.t5.v c = new com.amazon.aps.iva.t5.v(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public f(String str, boolean z) {
        this.a = z;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0240, code lost:
        if (((r8 & 8) >> 3) == r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025d, code lost:
        if (r9[r8] != 51) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0264, code lost:
        r22.o = (r3 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026c, code lost:
        if ((r3 & 1) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026e, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0270, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0271, code lost:
        r22.k = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0275, code lost:
        if (r22.l != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0277, code lost:
        r22.h = 1;
        r22.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027c, code lost:
        r22.h = 3;
        r22.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0281, code lost:
        r23.F(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0264 A[EDGE_INSN: B:173:0x0264->B:125:0x0264 ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.z7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.t5.v r23) throws com.amazon.aps.iva.q5.h0 {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.f.a(com.amazon.aps.iva.t5.v):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.e = dVar.e;
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 1);
        this.f = r;
        this.t = r;
        if (this.a) {
            dVar.a();
            dVar.b();
            com.amazon.aps.iva.x6.f0 r2 = pVar.r(dVar.d, 5);
            this.g = r2;
            v.a aVar = new v.a();
            dVar.b();
            aVar.a = dVar.e;
            aVar.k = "application/id3";
            r2.c(new com.amazon.aps.iva.q5.v(aVar));
            return;
        }
        this.g = new com.amazon.aps.iva.x6.m();
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    public final boolean f(int i, com.amazon.aps.iva.t5.v vVar, byte[] bArr) {
        int min = Math.min(vVar.c - vVar.b, i - this.i);
        vVar.d(this.i, bArr, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}
