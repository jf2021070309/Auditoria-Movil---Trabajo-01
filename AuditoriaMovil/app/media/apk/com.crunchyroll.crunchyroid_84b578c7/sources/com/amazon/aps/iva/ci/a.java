package com.amazon.aps.iva.ci;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: MusicAssetCard.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: MusicAssetCard.kt */
    /* renamed from: com.amazon.aps.iva.ci.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0174a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0174a h = new C0174a();

        public C0174a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "genre");
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.fi.a h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.fi.a aVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            com.amazon.aps.iva.a1.f fVar = this.i;
            int i = this.k;
            a.a(this.h, fVar, iVar, I, i);
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.fi.a h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.fi.a aVar, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar2, int i) {
            super(2);
            this.h = aVar;
            this.i = aVar2;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            a.b(this.h, this.i, iVar, I);
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "music_asset_card");
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "artist_name");
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "asset_title");
            return q.a;
        }
    }

    /* compiled from: MusicAssetCard.kt */
    /* loaded from: classes.dex */
    public static final class h extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.fi.a h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> i;
        public final /* synthetic */ DurationFormatter j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> l;
        public final /* synthetic */ com.amazon.aps.iva.a1.f m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.fi.a aVar, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar2, DurationFormatter durationFormatter, boolean z, com.amazon.aps.iva.xb0.a<q> aVar3, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = aVar2;
            this.j = durationFormatter;
            this.k = z;
            this.l = aVar3;
            this.m = fVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.c(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.fi.a r30, com.amazon.aps.iva.a1.f r31, com.amazon.aps.iva.o0.i r32, int r33, int r34) {
        /*
            r0 = r30
            r1 = r33
            r2 = r34
            r3 = -465982939(0xffffffffe439aa25, float:-1.3699631E22)
            r4 = r32
            com.amazon.aps.iva.o0.j r3 = r4.g(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L16
            r4 = r1 | 6
            goto L26
        L16:
            r4 = r1 & 14
            if (r4 != 0) goto L25
            boolean r4 = r3.H(r0)
            if (r4 == 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 2
        L23:
            r4 = r4 | r1
            goto L26
        L25:
            r4 = r1
        L26:
            r5 = r2 & 2
            if (r5 == 0) goto L2d
            r4 = r4 | 48
            goto L40
        L2d:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L40
            r6 = r31
            boolean r7 = r3.H(r6)
            if (r7 == 0) goto L3c
            r7 = 32
            goto L3e
        L3c:
            r7 = 16
        L3e:
            r4 = r4 | r7
            goto L42
        L40:
            r6 = r31
        L42:
            r4 = r4 & 91
            r7 = 18
            if (r4 != r7) goto L53
            boolean r4 = r3.h()
            if (r4 != 0) goto L4f
            goto L53
        L4f:
            r3.A()
            goto L97
        L53:
            if (r5 == 0) goto L5a
            com.amazon.aps.iva.a1.f$a r4 = com.amazon.aps.iva.a1.f.a.c
            r29 = r4
            goto L5c
        L5a:
            r29 = r6
        L5c:
            com.amazon.aps.iva.o0.e0$b r4 = com.amazon.aps.iva.o0.e0.a
            com.amazon.aps.iva.a1.f r4 = androidx.compose.foundation.layout.e.n(r29)
            r5 = 0
            com.amazon.aps.iva.ci.a$a r6 = com.amazon.aps.iva.ci.a.C0174a.h
            com.amazon.aps.iva.a1.f r5 = com.amazon.aps.iva.a2.o.a(r4, r5, r6)
            java.lang.String r4 = r0.g
            if (r4 != 0) goto L6f
            java.lang.String r4 = ""
        L6f:
            com.amazon.aps.iva.c2.a0 r24 = com.amazon.aps.iva.ao.b.o
            long r6 = com.amazon.aps.iva.ao.a.j
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 65528(0xfff8, float:9.1824E-41)
            r25 = r3
            com.amazon.aps.iva.m0.a4.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6 = r29
        L97:
            com.amazon.aps.iva.o0.j2 r3 = r3.X()
            if (r3 != 0) goto L9e
            goto La5
        L9e:
            com.amazon.aps.iva.ci.a$b r4 = new com.amazon.aps.iva.ci.a$b
            r4.<init>(r0, r6, r1, r2)
            r3.d = r4
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ci.a.a(com.amazon.aps.iva.fi.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.fi.a aVar, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar2, i iVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g2 = iVar.g(-1447495157);
        if ((i & 14) == 0) {
            if (g2.H(aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g2.H(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && g2.h()) {
            g2.A();
        } else {
            e0.b bVar = e0.a;
            f.a aVar3 = f.a.c;
            com.amazon.aps.iva.a1.f i5 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar3)), 0.0f, 6, 0.0f, 0.0f, 13);
            g2.s(693286680);
            d0 a = v1.a(com.amazon.aps.iva.d0.a.a, a.C0097a.j, g2);
            g2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g2);
            c2 P = g2.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar4 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = u.a(i5);
            if (g2.a instanceof com.amazon.aps.iva.o0.d) {
                g2.z();
                if (g2.M) {
                    g2.w(aVar4);
                } else {
                    g2.m();
                }
                com.amazon.aps.iva.cq.b.k0(g2, a, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g2, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g2.M || !j.a(g2.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g2, S, c0752a);
                }
                defpackage.b.d(0, a2, new x2(g2), g2, 2058660585);
                com.amazon.aps.iva.a1.f i6 = androidx.compose.foundation.layout.d.i(aVar3, 0.0f, 4, 8, 0.0f, 9);
                j.f(i6, "<this>");
                if (1.0f > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a(aVar, i6.o(new LayoutWeightElement(true)), g2, Image.$stable | 0 | 0 | LabelUiModel.$stable | (i2 & 14), 0);
                    com.amazon.aps.iva.n70.c.b(aVar2, androidx.compose.foundation.layout.e.j(aVar3, 24), 0L, 0, 0, 0, 0, g2, ((i2 >> 3) & 14) | 48, 124);
                    defpackage.c.c(g2, false, true, false, false);
                } else {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g2.X();
        if (X != null) {
            X.d = new c(aVar, aVar2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r0.e0(), java.lang.Integer.valueOf(r4)) == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.amazon.aps.iva.fi.a r57, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r58, com.ellation.crunchyroll.ui.duration.DurationFormatter r59, boolean r60, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r61, com.amazon.aps.iva.a1.f r62, com.amazon.aps.iva.o0.i r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ci.a.c(com.amazon.aps.iva.fi.a, com.amazon.aps.iva.pe0.a, com.ellation.crunchyroll.ui.duration.DurationFormatter, boolean, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
