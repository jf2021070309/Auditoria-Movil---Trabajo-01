package com.amazon.aps.iva.gl;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.y.y;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PlayerTapToSeekOverlay.kt */
/* loaded from: classes2.dex */
public final class j {

    /* compiled from: PlayerTapToSeekOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p3<Long> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1 q1Var) {
            super(3);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(y yVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2;
            com.amazon.aps.iva.o0.i iVar3 = iVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(yVar, "$this$AnimatedVisibility");
            e0.b bVar = e0.a;
            f.a aVar = f.a.c;
            com.amazon.aps.iva.a1.f d = androidx.compose.foundation.layout.e.d(aVar);
            com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
            iVar3.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, iVar3);
            iVar3.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar3);
            c2 l = iVar3.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(d);
            if (iVar3.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar3.z();
                if (iVar3.e()) {
                    iVar3.w(aVar2);
                } else {
                    iVar3.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar3, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar3, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar3.e() || !com.amazon.aps.iva.yb0.j.a(iVar3.t(), Integer.valueOf(S))) {
                    b2.c(S, iVar3, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar3), iVar3, 2058660585);
                androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                j.b(null, g.h, h.h, null, iVar3, 432, 9);
                iVar3.s(1969468705);
                p3<Long> p3Var = this.h;
                if (p3Var.getValue().longValue() > 0) {
                    com.amazon.aps.iva.a1.f b = androidx.compose.foundation.layout.c.b(bVar3.c(com.amazon.aps.iva.a2.o.a(aVar, false, i.h), a.C0097a.f), com.amazon.aps.iva.cq.b.N(R.dimen.video_controls_center_horizontal_margin, iVar3) * (-1), 0.0f, 2);
                    iVar2 = iVar3;
                    a4.b(defpackage.i.F(R.string.format_double_tap_to_seek_backward, new Object[]{p3Var.getValue()}, iVar3), b, com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.d, iVar2, 0, 0, 65528);
                } else {
                    iVar2 = iVar3;
                }
                iVar2.G();
                iVar2.G();
                iVar2.o();
                iVar2.G();
                iVar2.G();
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.cq.b.W();
            throw null;
        }
    }

    /* compiled from: PlayerTapToSeekOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p3<Long> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(3);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(y yVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2;
            com.amazon.aps.iva.o0.i iVar3 = iVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(yVar, "$this$AnimatedVisibility");
            e0.b bVar = e0.a;
            f.a aVar = f.a.c;
            com.amazon.aps.iva.a1.f d = androidx.compose.foundation.layout.e.d(aVar);
            com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
            iVar3.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, iVar3);
            iVar3.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar3);
            c2 l = iVar3.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(d);
            if (iVar3.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar3.z();
                if (iVar3.e()) {
                    iVar3.w(aVar2);
                } else {
                    iVar3.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar3, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar3, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar3.e() || !com.amazon.aps.iva.yb0.j.a(iVar3.t(), Integer.valueOf(S))) {
                    b2.c(S, iVar3, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar3), iVar3, 2058660585);
                androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                j.b(k.h, null, null, l.h, iVar3, 3078, 6);
                iVar3.s(1969470406);
                p3<Long> p3Var = this.h;
                if (p3Var.getValue().longValue() > 0) {
                    com.amazon.aps.iva.a1.f b = androidx.compose.foundation.layout.c.b(bVar3.c(com.amazon.aps.iva.a2.o.a(aVar, false, m.h), a.C0097a.d), com.amazon.aps.iva.cq.b.N(R.dimen.video_controls_center_horizontal_margin, iVar3), 0.0f, 2);
                    iVar2 = iVar3;
                    a4.b(defpackage.i.F(R.string.format_double_tap_to_seek_forward, new Object[]{p3Var.getValue()}, iVar3), b, com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.d, iVar2, 0, 0, 65528);
                } else {
                    iVar2 = iVar3;
                }
                iVar2.G();
                iVar2.G();
                iVar2.o();
                iVar2.G();
                iVar2.G();
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.cq.b.W();
            throw null;
        }
    }

    /* compiled from: PlayerTapToSeekOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ v h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v vVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = vVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            j.a(this.h, this.i, iVar, I, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r3.e0(), java.lang.Integer.valueOf(r7)) == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.gl.v r25, com.amazon.aps.iva.a1.f r26, com.amazon.aps.iva.o0.i r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gl.j.a(com.amazon.aps.iva.gl.v, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, com.amazon.aps.iva.xb0.l lVar3, com.amazon.aps.iva.xb0.l lVar4, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        com.amazon.aps.iva.o0.j g = iVar.g(1084309991);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.v(lVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.v(lVar2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (g.v(lVar3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (g.v(lVar4)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            if (i8 != 0) {
                lVar = n.h;
            }
            if (i9 != 0) {
                lVar2 = o.h;
            }
            if (i10 != 0) {
                lVar3 = p.h;
            }
            if (i11 != 0) {
                lVar4 = q.h;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.a1.f C = com.amazon.aps.iva.ff0.b.C(androidx.compose.foundation.layout.e.d(f.a.c), 1.0f, 1.5f);
            Object[] objArr = {lVar, lVar2, lVar3, lVar4};
            g.s(-568225417);
            boolean z = false;
            for (int i12 = 0; i12 < 4; i12++) {
                z |= g.H(objArr[i12]);
            }
            Object e0 = g.e0();
            if (z || e0 == i.a.a) {
                e0 = new r(lVar, lVar2, lVar3, lVar4);
                g.K0(e0);
            }
            g.U(false);
            com.amazon.aps.iva.a0.q.a(C, (com.amazon.aps.iva.xb0.l) e0, g, 6);
            e0.b bVar2 = e0.a;
        }
        com.amazon.aps.iva.xb0.l lVar5 = lVar;
        com.amazon.aps.iva.xb0.l lVar6 = lVar2;
        com.amazon.aps.iva.xb0.l lVar7 = lVar3;
        com.amazon.aps.iva.xb0.l lVar8 = lVar4;
        j2 X = g.X();
        if (X != null) {
            X.d = new s(lVar5, lVar6, lVar7, lVar8, i, i2);
        }
    }
}
