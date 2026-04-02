package com.amazon.aps.iva.kl;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.y.f1;
import com.amazon.aps.iva.y.g0;
import com.amazon.aps.iva.y.p0;
import com.amazon.aps.iva.y.s0;
import com.amazon.aps.iva.y.x;
import com.amazon.aps.iva.z.k1;
import com.amazon.aps.iva.z.m1;
import com.google.android.gms.cast.MediaError;
/* compiled from: UpNextBanner.kt */
/* loaded from: classes2.dex */
public final class i {

    /* compiled from: UpNextBanner.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ k h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, com.amazon.aps.iva.a1.f fVar) {
            super(2);
            this.h = kVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                k kVar = this.h;
                q1 b = com.amazon.aps.iva.j5.b.b(kVar.I7(), iVar2);
                boolean booleanValue = ((Boolean) com.amazon.aps.iva.j5.b.b(kVar.isVisible(), iVar2).getValue()).booleanValue();
                k1 d = com.amazon.aps.iva.z.k.d(250, 0, null, 6);
                m1 m1Var = g0.a;
                com.amazon.aps.iva.kl.a aVar = com.amazon.aps.iva.kl.a.h;
                com.amazon.aps.iva.yb0.j.f(aVar, "initialOffsetX");
                x.c(booleanValue, null, new s0(new com.amazon.aps.iva.y.k1(null, new f1(d, new p0(aVar)), null, null, 13)).b(g0.b(null, 3)), g0.c(com.amazon.aps.iva.z.k.d(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, 0, null, 6), 2), null, com.amazon.aps.iva.v0.b.b(iVar2, -1229033143, new h(b, this.i, kVar)), iVar2, 200064, 18);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpNextBanner.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ k h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = kVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            i.a(this.h, this.i, iVar, I, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(k kVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(kVar, "viewModel");
        com.amazon.aps.iva.o0.j g = iVar.g(1192208516);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(kVar)) {
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
            if (g.H(fVar)) {
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
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(g, -1031840655, new a(kVar, fVar)), g, 6);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(kVar, fVar, i, i2);
        }
    }
}
