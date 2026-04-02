package com.amazon.aps.iva.n7;

import com.amazon.aps.iva.i7.l;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.b0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.m;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import com.amazon.aps.iva.x6.x;
import com.amazon.aps.iva.x6.z;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: Mp3Extractor.java */
/* loaded from: classes.dex */
public final class d implements n {
    public static final com.amazon.aps.iva.g1.e u = new com.amazon.aps.iva.g1.e(5);
    public final int a;
    public final long b;
    public final v c;
    public final b0.a d;
    public final x e;
    public final z f;
    public final m g;
    public p h;
    public f0 i;
    public f0 j;
    public int k;
    public com.amazon.aps.iva.q5.f0 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public e q;
    public boolean r;
    public boolean s;
    public long t;

    public d() {
        this(0);
    }

    public static long d(com.amazon.aps.iva.q5.f0 f0Var) {
        if (f0Var != null) {
            int c = f0Var.c();
            for (int i = 0; i < c; i++) {
                f0.b b = f0Var.b(i);
                if (b instanceof l) {
                    l lVar = (l) b;
                    if (lVar.b.equals("TLEN")) {
                        return g0.Q(Long.parseLong(lVar.d.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final a a(i iVar, boolean z) throws IOException {
        v vVar = this.c;
        iVar.c(vVar.a, 0, 4, false);
        vVar.F(0);
        this.d.a(vVar.e());
        return new a(iVar.c, iVar.d, this.d, z);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        return f((i) oVar, true);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        e eVar = this.q;
        if ((eVar instanceof b) && !((b) eVar).b(j2)) {
            this.s = true;
            this.j = this.g;
        }
    }

    public final boolean e(i iVar) throws IOException {
        e eVar = this.q;
        if (eVar != null) {
            long e = eVar.e();
            if (e != -1 && iVar.h() > e - 4) {
                return true;
            }
        }
        try {
            return !iVar.c(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
        if (r19 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
        r18.k(r4 + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
        r18.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
        r17.k = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.amazon.aps.iva.x6.i r18, boolean r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f = r3
            long r4 = r1.d
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L42
            int r4 = r0.a
            r4 = r4 & 8
            if (r4 != 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L26
            r4 = r6
            goto L28
        L26:
            com.amazon.aps.iva.g1.e r4 = com.amazon.aps.iva.n7.d.u
        L28:
            com.amazon.aps.iva.x6.z r7 = r0.f
            com.amazon.aps.iva.q5.f0 r4 = r7.a(r1, r4)
            r0.l = r4
            if (r4 == 0) goto L37
            com.amazon.aps.iva.x6.x r7 = r0.e
            r7.b(r4)
        L37:
            long r7 = r18.h()
            int r4 = (int) r7
            if (r19 != 0) goto L43
            r1.k(r4)
            goto L43
        L42:
            r4 = r3
        L43:
            r7 = r3
            r8 = r7
            r9 = r8
        L46:
            boolean r10 = r17.e(r18)
            if (r10 == 0) goto L55
            if (r8 <= 0) goto L4f
            goto La7
        L4f:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L55:
            com.amazon.aps.iva.t5.v r10 = r0.c
            r10.F(r3)
            int r10 = r10.e()
            if (r7 == 0) goto L73
            long r11 = (long) r7
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L70
            r11 = r5
            goto L71
        L70:
            r11 = r3
        L71:
            if (r11 == 0) goto L7a
        L73:
            int r11 = com.amazon.aps.iva.x6.b0.a(r10)
            r12 = -1
            if (r11 != r12) goto L99
        L7a:
            int r7 = r9 + 1
            if (r9 != r2) goto L88
            if (r19 == 0) goto L81
            return r3
        L81:
            java.lang.String r1 = "Searched too many bytes."
            com.amazon.aps.iva.q5.h0 r1 = com.amazon.aps.iva.q5.h0.a(r1, r6)
            throw r1
        L88:
            if (r19 == 0) goto L92
            r1.f = r3
            int r8 = r4 + r7
            r1.m(r8, r3)
            goto L95
        L92:
            r1.k(r5)
        L95:
            r8 = r3
            r9 = r7
            r7 = r8
            goto L46
        L99:
            int r8 = r8 + 1
            if (r8 != r5) goto La4
            com.amazon.aps.iva.x6.b0$a r7 = r0.d
            r7.a(r10)
            r7 = r10
            goto Lb3
        La4:
            r10 = 4
            if (r8 != r10) goto Lb3
        La7:
            if (r19 == 0) goto Lae
            int r4 = r4 + r9
            r1.k(r4)
            goto Lb0
        Lae:
            r1.f = r3
        Lb0:
            r0.k = r7
            return r5
        Lb3:
            int r11 = r11 + (-4)
            r1.m(r11, r3)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n7.d.f(com.amazon.aps.iva.x6.i, boolean):boolean");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.h = pVar;
        com.amazon.aps.iva.x6.f0 r = pVar.r(0, 1);
        this.i = r;
        this.j = r;
        this.h.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r8 != 1231971951) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r39, com.amazon.aps.iva.x6.c0 r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n7.d.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    public d(int i) {
        this(-9223372036854775807L);
    }

    public d(long j) {
        this.a = 0;
        this.b = j;
        this.c = new v(10);
        this.d = new b0.a();
        this.e = new x();
        this.m = -9223372036854775807L;
        this.f = new z();
        m mVar = new m();
        this.g = mVar;
        this.j = mVar;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
