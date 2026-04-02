package com.amazon.aps.iva.pd;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.k;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: PersistentMessageCard.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: PersistentMessageCard.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.q<k, com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.pd.a h;
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.pd.a aVar, int i, com.amazon.aps.iva.xb0.a<q> aVar2) {
            super(3);
            this.h = aVar;
            this.i = i;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(k kVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            k kVar2 = kVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(kVar2, "$this$BoxWithConstraints");
            if ((intValue & 14) == 0) {
                if (iVar2.H(kVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                int compare = Float.compare(kVar2.a(), (float) MediaError.DetailedErrorCode.TEXT_UNKNOWN);
                f.a aVar = f.a.c;
                int i2 = this.i;
                if (compare < 0) {
                    iVar2.s(-728548253);
                    a.h g = com.amazon.aps.iva.d0.a.g(12);
                    com.amazon.aps.iva.a1.f e = androidx.compose.foundation.layout.e.e(aVar);
                    com.amazon.aps.iva.pd.a aVar2 = this.h;
                    com.amazon.aps.iva.xb0.a<q> aVar3 = this.j;
                    iVar2.s(-483455358);
                    d0 a = m.a(g, a.C0097a.m, iVar2);
                    iVar2.s(-1323940314);
                    int S = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l = iVar2.l();
                    com.amazon.aps.iva.u1.e.o0.getClass();
                    e.a aVar4 = e.a.b;
                    com.amazon.aps.iva.v0.a a2 = u.a(e);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar4);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                        e.a.C0752a c0752a = e.a.f;
                        if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S))) {
                            b2.c(S, iVar2, S, c0752a);
                        }
                        com.amazon.aps.iva.b8.i.c(0, a2, new x2(iVar2), iVar2, 2058660585);
                        f.a.c cVar = f.a.c;
                        com.amazon.aps.iva.a1.f n = androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar));
                        float f = 64;
                        com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar, f), f);
                        int i3 = i2 & 14;
                        g.b(aVar2, cVar, n, f2, iVar2, i3 | 3504, 0);
                        g.c(aVar2, aVar3, null, androidx.compose.foundation.layout.e.e(aVar), iVar2, i3 | 3072 | ((i2 >> 3) & 112), 4);
                        iVar2.G();
                        iVar2.o();
                        iVar2.G();
                        iVar2.G();
                        iVar2.G();
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                } else {
                    iVar2.s(-728547591);
                    b.C0098b c0098b = a.C0097a.k;
                    a.h g2 = com.amazon.aps.iva.d0.a.g(16);
                    com.amazon.aps.iva.a1.f e2 = androidx.compose.foundation.layout.e.e(aVar);
                    com.amazon.aps.iva.pd.a aVar5 = this.h;
                    com.amazon.aps.iva.xb0.a<q> aVar6 = this.j;
                    iVar2.s(693286680);
                    d0 a3 = v1.a(g2, c0098b, iVar2);
                    iVar2.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l2 = iVar2.l();
                    com.amazon.aps.iva.u1.e.o0.getClass();
                    e.a aVar7 = e.a.b;
                    com.amazon.aps.iva.v0.a a4 = u.a(e2);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar7);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a3, e.a.e);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l2, e.a.d);
                        e.a.C0752a c0752a2 = e.a.f;
                        if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S2))) {
                            b2.c(S2, iVar2, S2, c0752a2);
                        }
                        com.amazon.aps.iva.b8.i.c(0, a4, new x2(iVar2), iVar2, 2058660585);
                        f.a.C0691a c0691a = f.a.a;
                        com.amazon.aps.iva.a1.f f3 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar, 220), 165);
                        float f4 = 40;
                        com.amazon.aps.iva.a1.f f5 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar, f4), f4);
                        int i4 = i2 & 14;
                        g.b(aVar5, c0691a, f3, f5, iVar2, i4 | 3504, 0);
                        g.c(aVar5, aVar6, null, androidx.compose.foundation.layout.e.l(aVar, 192), iVar2, i4 | 3072 | ((i2 >> 3) & 112), 4);
                        iVar2.G();
                        iVar2.o();
                        iVar2.G();
                        iVar2.G();
                        iVar2.G();
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                }
            }
            return q.a;
        }
    }

    /* compiled from: PersistentMessageCard.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.pd.a h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.pd.a aVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.a<q> aVar2, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = aVar2;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.pd.a r13, com.amazon.aps.iva.a1.f r14, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r15, com.amazon.aps.iva.o0.i r16, int r17, int r18) {
        /*
            r1 = r13
            r4 = r17
            java.lang.String r0 = "card"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            r0 = -212858827(0xfffffffff3500835, float:-1.6481998E31)
            r2 = r16
            com.amazon.aps.iva.o0.j r0 = r2.g(r0)
            r2 = r18 & 1
            if (r2 == 0) goto L18
            r2 = r4 | 6
            goto L28
        L18:
            r2 = r4 & 14
            if (r2 != 0) goto L27
            boolean r2 = r0.H(r13)
            if (r2 == 0) goto L24
            r2 = 4
            goto L25
        L24:
            r2 = 2
        L25:
            r2 = r2 | r4
            goto L28
        L27:
            r2 = r4
        L28:
            r3 = r18 & 2
            if (r3 == 0) goto L2f
            r2 = r2 | 48
            goto L41
        L2f:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L41
            r5 = r14
            boolean r6 = r0.H(r14)
            if (r6 == 0) goto L3d
            r6 = 32
            goto L3f
        L3d:
            r6 = 16
        L3f:
            r2 = r2 | r6
            goto L42
        L41:
            r5 = r14
        L42:
            r6 = r18 & 4
            if (r6 == 0) goto L49
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L5b
        L49:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L5b
            r7 = r15
            boolean r8 = r0.v(r15)
            if (r8 == 0) goto L57
            r8 = 256(0x100, float:3.59E-43)
            goto L59
        L57:
            r8 = 128(0x80, float:1.794E-43)
        L59:
            r2 = r2 | r8
            goto L5c
        L5b:
            r7 = r15
        L5c:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L6f
            boolean r8 = r0.h()
            if (r8 != 0) goto L69
            goto L6f
        L69:
            r0.A()
            r2 = r5
            r3 = r7
            goto La2
        L6f:
            if (r3 == 0) goto L74
            com.amazon.aps.iva.a1.f$a r3 = com.amazon.aps.iva.a1.f.a.c
            goto L75
        L74:
            r3 = r5
        L75:
            if (r6 == 0) goto L7b
            com.amazon.aps.iva.pd.g$a r5 = com.amazon.aps.iva.pd.g.a.h
            r12 = r5
            goto L7c
        L7b:
            r12 = r7
        L7c:
            com.amazon.aps.iva.o0.e0$b r5 = com.amazon.aps.iva.o0.e0.a
            r5 = 12
            float r5 = (float) r5
            r6 = 0
            r7 = 1
            com.amazon.aps.iva.a1.f r5 = androidx.compose.foundation.layout.d.g(r3, r6, r5, r7)
            com.amazon.aps.iva.a1.f r5 = androidx.compose.foundation.layout.e.e(r5)
            r6 = 0
            r7 = 0
            com.amazon.aps.iva.pd.g$b r8 = new com.amazon.aps.iva.pd.g$b
            r8.<init>(r13, r2, r12)
            r2 = 710552075(0x2a5a2a0b, float:1.9376876E-13)
            com.amazon.aps.iva.v0.a r8 = com.amazon.aps.iva.v0.b.b(r0, r2, r8)
            r10 = 3072(0xc00, float:4.305E-42)
            r11 = 6
            r9 = r0
            com.amazon.aps.iva.d0.j.a(r5, r6, r7, r8, r9, r10, r11)
            r2 = r3
            r3 = r12
        La2:
            com.amazon.aps.iva.o0.j2 r6 = r0.X()
            if (r6 != 0) goto La9
            goto Lb6
        La9:
            com.amazon.aps.iva.pd.g$c r7 = new com.amazon.aps.iva.pd.g$c
            r0 = r7
            r1 = r13
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r7
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd.g.a(com.amazon.aps.iva.pd.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.amazon.aps.iva.pd.a r19, com.amazon.aps.iva.s1.f r20, com.amazon.aps.iva.a1.f r21, com.amazon.aps.iva.a1.f r22, com.amazon.aps.iva.o0.i r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd.g.b(com.amazon.aps.iva.pd.a, com.amazon.aps.iva.s1.f, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.amazon.aps.iva.pd.a r32, com.amazon.aps.iva.xb0.a r33, com.amazon.aps.iva.a1.f r34, com.amazon.aps.iva.a1.f r35, com.amazon.aps.iva.o0.i r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd.g.c(com.amazon.aps.iva.pd.a, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void d(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(-1046041871);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            f.a aVar = f.a.c;
            if (i5 != 0) {
                fVar = aVar;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
            com.amazon.aps.iva.a1.f a2 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.c.b(aVar, com.amazon.aps.iva.ao.a.l, p0.a), 1.3333334f);
            g.s(733328855);
            d0 c2 = com.amazon.aps.iva.d0.f.c(bVar2, false, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(a2);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c2, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d(0, a3, new x2(g), g, 2058660585);
                com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_missing_card_image, g), "image", fVar, bVar2, f.a.b, 0.0f, null, g, ((i3 << 6) & 896) | 27704, 96);
                defpackage.c.c(g, false, true, false, false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new h(fVar, i, i2);
        }
    }
}
