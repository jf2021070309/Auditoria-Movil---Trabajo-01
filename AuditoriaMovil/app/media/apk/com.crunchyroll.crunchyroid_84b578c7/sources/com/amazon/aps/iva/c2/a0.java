package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.n2.k;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;
/* compiled from: TextStyle.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final a0 d = new a0(0, 0, null, null, 0, null, 16777215);
    public final u a;
    public final n b;
    public final s c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(com.amazon.aps.iva.c2.u r4, com.amazon.aps.iva.c2.n r5) {
        /*
            r3 = this;
            java.lang.String r0 = "spanStyle"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            com.amazon.aps.iva.c2.r r0 = r4.o
            com.amazon.aps.iva.c2.q r1 = r5.e
            if (r0 != 0) goto Lf
            if (r1 != 0) goto Lf
            r0 = 0
            goto L15
        Lf:
            com.amazon.aps.iva.c2.s r2 = new com.amazon.aps.iva.c2.s
            r2.<init>(r0, r1)
            r0 = r2
        L15:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.a0.<init>(com.amazon.aps.iva.c2.u, com.amazon.aps.iva.c2.n):void");
    }

    public static a0 a(int i, long j, long j2, long j3, s sVar, a0 a0Var, com.amazon.aps.iva.h2.k kVar, com.amazon.aps.iva.h2.y yVar, com.amazon.aps.iva.n2.h hVar) {
        long j4;
        long j5;
        com.amazon.aps.iva.h2.y yVar2;
        com.amazon.aps.iva.h2.t tVar;
        com.amazon.aps.iva.h2.u uVar;
        com.amazon.aps.iva.h2.k kVar2;
        String str;
        long j6;
        com.amazon.aps.iva.n2.a aVar;
        com.amazon.aps.iva.n2.l lVar;
        com.amazon.aps.iva.j2.d dVar;
        long j7;
        com.amazon.aps.iva.n2.i iVar;
        t0 t0Var;
        com.amazon.aps.iva.h1.f fVar;
        com.amazon.aps.iva.n2.h hVar2;
        com.amazon.aps.iva.n2.j jVar;
        long j8;
        com.amazon.aps.iva.n2.m mVar;
        s sVar2;
        com.amazon.aps.iva.n2.f fVar2;
        com.amazon.aps.iva.n2.e eVar;
        com.amazon.aps.iva.n2.d dVar2;
        com.amazon.aps.iva.n2.n nVar;
        boolean z;
        com.amazon.aps.iva.n2.k kVar3;
        r rVar;
        q qVar;
        if ((i & 1) != 0) {
            j4 = a0Var.a.b();
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            j5 = a0Var.a.b;
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            yVar2 = a0Var.a.c;
        } else {
            yVar2 = yVar;
        }
        if ((i & 8) != 0) {
            tVar = a0Var.a.d;
        } else {
            tVar = null;
        }
        if ((i & 16) != 0) {
            uVar = a0Var.a.e;
        } else {
            uVar = null;
        }
        if ((i & 32) != 0) {
            kVar2 = a0Var.a.f;
        } else {
            kVar2 = kVar;
        }
        if ((i & 64) != 0) {
            str = a0Var.a.g;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            j6 = a0Var.a.h;
        } else {
            j6 = j3;
        }
        if ((i & 256) != 0) {
            aVar = a0Var.a.i;
        } else {
            aVar = null;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            lVar = a0Var.a.j;
        } else {
            lVar = null;
        }
        if ((i & 1024) != 0) {
            dVar = a0Var.a.k;
        } else {
            dVar = null;
        }
        if ((i & 2048) != 0) {
            j7 = a0Var.a.l;
        } else {
            j7 = 0;
        }
        if ((i & 4096) != 0) {
            iVar = a0Var.a.m;
        } else {
            iVar = null;
        }
        if ((i & 8192) != 0) {
            t0Var = a0Var.a.n;
        } else {
            t0Var = null;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            fVar = a0Var.a.p;
        } else {
            fVar = null;
        }
        if ((32768 & i) != 0) {
            hVar2 = a0Var.b.a;
        } else {
            hVar2 = hVar;
        }
        if ((65536 & i) != 0) {
            jVar = a0Var.b.b;
        } else {
            jVar = null;
        }
        if ((131072 & i) != 0) {
            j8 = a0Var.b.c;
        } else {
            j8 = 0;
        }
        if ((262144 & i) != 0) {
            mVar = a0Var.b.d;
        } else {
            mVar = null;
        }
        if ((524288 & i) != 0) {
            sVar2 = a0Var.c;
        } else {
            sVar2 = sVar;
        }
        if ((1048576 & i) != 0) {
            fVar2 = a0Var.b.f;
        } else {
            fVar2 = null;
        }
        if ((2097152 & i) != 0) {
            eVar = a0Var.b.g;
        } else {
            eVar = null;
        }
        if ((4194304 & i) != 0) {
            dVar2 = a0Var.b.h;
        } else {
            dVar2 = null;
        }
        if ((i & 8388608) != 0) {
            nVar = a0Var.b.i;
        } else {
            nVar = null;
        }
        u uVar2 = a0Var.a;
        if (com.amazon.aps.iva.f1.x.c(j4, uVar2.b())) {
            kVar3 = uVar2.a;
        } else {
            if (j4 != com.amazon.aps.iva.f1.x.g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                kVar3 = new com.amazon.aps.iva.n2.c(j4);
            } else {
                kVar3 = k.b.a;
            }
        }
        com.amazon.aps.iva.n2.k kVar4 = kVar3;
        if (sVar2 != null) {
            rVar = sVar2.a;
        } else {
            rVar = null;
        }
        u uVar3 = new u(kVar4, j5, yVar2, tVar, uVar, kVar2, str, j6, aVar, lVar, dVar, j7, iVar, t0Var, rVar, fVar);
        if (sVar2 != null) {
            qVar = sVar2.b;
        } else {
            qVar = null;
        }
        return new a0(uVar3, new n(hVar2, jVar, j8, mVar, qVar, fVar2, eVar, dVar2, nVar), sVar2);
    }

    public final long b() {
        return this.a.b();
    }

    public final boolean c(a0 a0Var) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "other");
        if (this != a0Var && (!com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b) || !this.a.c(a0Var.a))) {
            return false;
        }
        return true;
    }

    public final a0 d(a0 a0Var) {
        if (a0Var != null && !com.amazon.aps.iva.yb0.j.a(a0Var, d)) {
            return new a0(this.a.e(a0Var.a), this.b.a(a0Var.b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, a0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, a0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        s sVar = this.c;
        if (sVar != null) {
            i = sVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) com.amazon.aps.iva.f1.x.i(b()));
        sb.append(", brush=");
        u uVar = this.a;
        sb.append(uVar.a());
        sb.append(", alpha=");
        sb.append(uVar.a.a());
        sb.append(", fontSize=");
        sb.append((Object) com.amazon.aps.iva.o2.m.d(uVar.b));
        sb.append(", fontWeight=");
        sb.append(uVar.c);
        sb.append(", fontStyle=");
        sb.append(uVar.d);
        sb.append(", fontSynthesis=");
        sb.append(uVar.e);
        sb.append(", fontFamily=");
        sb.append(uVar.f);
        sb.append(", fontFeatureSettings=");
        sb.append(uVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) com.amazon.aps.iva.o2.m.d(uVar.h));
        sb.append(", baselineShift=");
        sb.append(uVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(uVar.j);
        sb.append(", localeList=");
        sb.append(uVar.k);
        sb.append(", background=");
        sb.append((Object) com.amazon.aps.iva.f1.x.i(uVar.l));
        sb.append(", textDecoration=");
        sb.append(uVar.m);
        sb.append(", shadow=");
        sb.append(uVar.n);
        sb.append(", drawStyle=");
        sb.append(uVar.p);
        sb.append(", textAlign=");
        n nVar = this.b;
        sb.append(nVar.a);
        sb.append(", textDirection=");
        sb.append(nVar.b);
        sb.append(", lineHeight=");
        sb.append((Object) com.amazon.aps.iva.o2.m.d(nVar.c));
        sb.append(", textIndent=");
        sb.append(nVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(nVar.f);
        sb.append(", lineBreak=");
        sb.append(nVar.g);
        sb.append(", hyphens=");
        sb.append(nVar.h);
        sb.append(", textMotion=");
        sb.append(nVar.i);
        sb.append(')');
        return sb.toString();
    }

    public a0(u uVar, n nVar, s sVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "spanStyle");
        this.a = uVar;
        this.b = nVar;
        this.c = sVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(long r36, long r38, com.amazon.aps.iva.h2.y r40, com.amazon.aps.iva.h2.q r41, long r42, com.amazon.aps.iva.c2.s r44, int r45) {
        /*
            r35 = this;
            r0 = r45
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = com.amazon.aps.iva.f1.x.g
            r4 = r1
            goto Lc
        La:
            r4 = r36
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = com.amazon.aps.iva.o2.m.c
            r6 = r1
            goto L16
        L14:
            r6 = r38
        L16:
            r1 = r0 & 4
            if (r1 == 0) goto L1c
            r8 = 0
            goto L1e
        L1c:
            r8 = r40
        L1e:
            r9 = 0
            r10 = 0
            r1 = r0 & 32
            if (r1 == 0) goto L26
            r11 = 0
            goto L28
        L26:
            r11 = r41
        L28:
            r12 = 0
            r1 = r0 & 128(0x80, float:1.794E-43)
            r13 = 0
            if (r1 == 0) goto L32
            long r15 = com.amazon.aps.iva.o2.m.c
            goto L33
        L32:
            r15 = r13
        L33:
            r1 = 0
            r17 = 0
            r18 = 0
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L3e
            long r13 = com.amazon.aps.iva.f1.x.g
        L3e:
            r19 = r13
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L54
            long r13 = com.amazon.aps.iva.o2.m.c
            r27 = r13
            goto L56
        L54:
            r27 = r42
        L56:
            r29 = 0
            r3 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L5f
            r0 = 0
            goto L61
        L5f:
            r0 = r44
        L61:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            com.amazon.aps.iva.c2.u r13 = new com.amazon.aps.iva.c2.u
            if (r0 == 0) goto L72
            com.amazon.aps.iva.c2.r r3 = r0.a
            r24 = r3
            goto L74
        L72:
            r24 = 0
        L74:
            r3 = r13
            r2 = r13
            r13 = r15
            r15 = r1
            r16 = r17
            r17 = r18
            r18 = r19
            r20 = r21
            r21 = r22
            r22 = r24
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23)
            com.amazon.aps.iva.c2.n r1 = new com.amazon.aps.iva.c2.n
            if (r0 == 0) goto L90
            com.amazon.aps.iva.c2.q r3 = r0.b
            r30 = r3
            goto L92
        L90:
            r30 = 0
        L92:
            r24 = r1
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34)
            r3 = r35
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.a0.<init>(long, long, com.amazon.aps.iva.h2.y, com.amazon.aps.iva.h2.q, long, com.amazon.aps.iva.c2.s, int):void");
    }
}
