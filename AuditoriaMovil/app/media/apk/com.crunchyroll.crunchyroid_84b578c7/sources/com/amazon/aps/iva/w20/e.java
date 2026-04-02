package com.amazon.aps.iva.w20;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: MembershipCardFrontContent.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: MembershipCardFrontContent.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ com.amazon.aps.iva.v20.f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.v20.f fVar2) {
            super(2);
            this.h = fVar;
            this.i = fVar2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            com.amazon.aps.iva.a1.f b;
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.e(this.h)), com.amazon.aps.iva.ao.a.d, p0.a);
                iVar2.s(733328855);
                d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a = u.a(b);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                    androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
                    f.a aVar2 = f.a.c;
                    com.amazon.aps.iva.a1.f c2 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.e(aVar2));
                    com.amazon.aps.iva.v20.f fVar = this.i;
                    com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(fVar.f, iVar2), "", c2, null, f.a.a, 0.0f, null, iVar2, 25016, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                    iVar2.s(-1275027422);
                    Integer num2 = fVar.g;
                    if (num2 != null) {
                        float f = 60;
                        com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(num2.intValue(), iVar2), null, bVar2.c(androidx.compose.foundation.layout.d.e(androidx.compose.ui.draw.b.a(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.d.e(aVar2, 24), f), f), com.amazon.aps.iva.z1.b.a(R.drawable.membership_card_sticker_background, iVar2), null, f.a.c, 0.0f, null, 54), 10), a.C0097a.i), null, null, 0.0f, null, iVar2, 56, 120);
                    }
                    iVar2.G();
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: MembershipCardFrontContent.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.v20.f h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.v20.f fVar, com.amazon.aps.iva.a1.f fVar2, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = fVar2;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            e.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.v20.f fVar, com.amazon.aps.iva.a1.f fVar2, i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        j.f(fVar, "membershipCardUiModel");
        com.amazon.aps.iva.o0.j g = iVar.g(42866834);
        if ((i2 & 1) != 0) {
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
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar2 = f.a.c;
            }
            e0.b bVar = e0.a;
            l0.a(new h2[]{d1.k.b(com.amazon.aps.iva.o2.l.Ltr)}, com.amazon.aps.iva.v0.b.b(g, -1586545326, new a(fVar2, fVar)), g, 56);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, fVar2, i, i2);
        }
    }
}
