package com.amazon.aps.iva.o7;

import com.amazon.aps.iva.o7.a;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.g0;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
/* compiled from: Mp4Extractor.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.x6.n, d0 {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final v b;
    public final v c;
    public final v d;
    public final v e;
    public final ArrayDeque<a.C0558a> f;
    public final j g;
    public final ArrayList h;
    public int i;
    public int j;
    public long k;
    public int l;
    public v m;
    public int n;
    public int o;
    public int p;
    public int q;
    public p r;
    public a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public com.amazon.aps.iva.j7.a x;

    /* compiled from: Mp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final l a;
        public final o b;
        public final f0 c;
        public final g0 d;
        public int e;

        public a(l lVar, o oVar, f0 f0Var) {
            g0 g0Var;
            this.a = lVar;
            this.b = oVar;
            this.c = f0Var;
            if ("audio/true-hd".equals(lVar.f.m)) {
                g0Var = new g0();
            } else {
                g0Var = null;
            }
            this.d = g0Var;
        }
    }

    public h() {
        this(0);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        boolean z;
        if ((this.a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return k.a(oVar, false, z);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        a[] aVarArr;
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j == 0) {
            if (this.i != 3) {
                this.i = 0;
                this.l = 0;
                return;
            }
            j jVar = this.g;
            jVar.a.clear();
            jVar.b = 0;
            this.h.clear();
            return;
        }
        for (a aVar : this.s) {
            o oVar = aVar.b;
            int f = com.amazon.aps.iva.t5.g0.f(oVar.f, j2, false);
            while (true) {
                if (f >= 0) {
                    if ((oVar.g[f] & 1) != 0) {
                        break;
                    }
                    f--;
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = oVar.a(j2);
            }
            aVar.e = f;
            g0 g0Var = aVar.d;
            if (g0Var != null) {
                g0Var.b = false;
                g0Var.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8 A[EDGE_INSN: B:70:0x00d8->B:62:0x00d8 ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.x6.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.x6.d0.a d(long r17) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.h.d(long):com.amazon.aps.iva.x6.d0$a");
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.r = pVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:366:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x066d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0006 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r37, com.amazon.aps.iva.x6.c0 r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.h.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
        r24 = r6.e();
        r3 = r6.e();
        r26 = r0;
        r6.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
        if (r3 != 1835360622) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cf, code lost:
        r8 = r6.p(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d9, code lost:
        if (r3 != 1851878757) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01db, code lost:
        r10 = r6.p(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
        if (r3 != 1684108385) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e7, code lost:
        r15 = r24;
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01eb, code lost:
        r6.G(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f0, code lost:
        r0 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f3, code lost:
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f5, code lost:
        if (r8 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f7, code lost:
        if (r10 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fa, code lost:
        if (r12 != (-1)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fe, code lost:
        r6.F(r12);
        r6.G(16);
        r10 = new com.amazon.aps.iva.i7.i(r8, r10, r6.p(r15 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
        r26 = r0;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021a, code lost:
        r26 = r0;
        r19 = r3;
        r0 = 16777215 & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0225, code lost:
        if (r0 != 6516084) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0227, code lost:
        r10 = com.amazon.aps.iva.o7.f.a(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0230, code lost:
        if (r0 == 7233901) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
        if (r0 != 7631467) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023c, code lost:
        if (r0 == 6516589) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0241, code lost:
        if (r0 != 7828084) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0247, code lost:
        if (r0 != 6578553) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0249, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0253, code lost:
        if (r0 != 4280916) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0255, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025f, code lost:
        if (r0 != 7630703) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0261, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026b, code lost:
        if (r0 != 6384738) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026d, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0277, code lost:
        if (r0 != 7108978) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0279, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0283, code lost:
        if (r0 != 6776174) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0285, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028d, code lost:
        if (r0 != 6779504) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x028f, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0296, code lost:
        com.amazon.aps.iva.o7.a.a(r10);
        com.amazon.aps.iva.t5.p.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029c, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x029e, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a5, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ae, code lost:
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b0, code lost:
        r9.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b3, code lost:
        r3 = r19;
        r0 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02be, code lost:
        r6.F(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c1, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c2, code lost:
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c8, code lost:
        if (r9.isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02cb, code lost:
        r19 = new com.amazon.aps.iva.q5.f0(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        r6.F(r3);
        r3 = r3 + r10;
        r6.G(r15);
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r10 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r10 >= r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        r13 = r6.e() + r10;
        r10 = r6.e();
        r15 = (r10 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r15 == 169) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r15 != 253) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (r10 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
        r8 = com.amazon.aps.iva.o7.f.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
        if (r8 <= 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (r8 > 192) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
        r8 = com.amazon.aps.iva.o7.f.a[r8 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
        if (r8 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
        r10 = new com.amazon.aps.iva.i7.l("TCON", null, com.google.common.collect.ImmutableList.of(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
        com.amazon.aps.iva.t5.p.g();
        r26 = r0;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
        if (r10 != 1684632427) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r10 = com.amazon.aps.iva.o7.f.c(r10, r6, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
        r26 = r0;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
        if (r10 != 1953655662) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
        r10 = com.amazon.aps.iva.o7.f.c(r10, r6, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
        if (r10 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
        r10 = com.amazon.aps.iva.o7.f.e(r10, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0118, code lost:
        if (r10 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
        r10 = com.amazon.aps.iva.o7.f.e(r10, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0125, code lost:
        if (r10 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
        r10 = com.amazon.aps.iva.o7.f.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
        if (r10 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
        if (r10 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
        if (r10 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0153, code lost:
        if (r10 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
        if (r10 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0161, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
        if (r10 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
        if (r10 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0179, code lost:
        r10 = com.amazon.aps.iva.o7.f.e(r10, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
        if (r10 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0187, code lost:
        r10 = com.amazon.aps.iva.o7.f.e(r10, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0194, code lost:
        if (r10 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0196, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
        if (r10 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
        r10 = com.amazon.aps.iva.o7.f.d(r10, r6, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
        if (r10 != 757935405) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b0, code lost:
        r19 = r3;
        r8 = null;
        r10 = null;
        r12 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b6, code lost:
        r3 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
        if (r3 >= r13) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0617 A[LOOP:12: B:312:0x0614->B:314:0x0617, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r28) throws com.amazon.aps.iva.q5.h0 {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.h.j(long):void");
    }

    public h(int i) {
        this.a = 0;
        this.i = 0;
        this.g = new j();
        this.h = new ArrayList();
        this.e = new v(16);
        this.f = new ArrayDeque<>();
        this.b = new v(com.amazon.aps.iva.u5.d.a);
        this.c = new v(4);
        this.d = new v();
        this.n = -1;
        this.r = p.t0;
        this.s = new a[0];
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
