package com.amazon.aps.iva.h30;

import android.content.Context;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b1;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.g1;
import com.amazon.aps.iva.d0.i1;
import com.amazon.aps.iva.d0.j0;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.d0.y1;
import com.amazon.aps.iva.da.l;
import com.amazon.aps.iva.da.s;
import com.amazon.aps.iva.da.t;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: BentoCheckoutSuccessScreen.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* renamed from: com.amazon.aps.iva.h30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0319a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0319a h = new C0319a();

        public C0319a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "bento_success_title");
            return q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "bento_success_subtitle");
            return q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.k, com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ j h;
        public final /* synthetic */ com.amazon.aps.iva.xh.a i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, com.amazon.aps.iva.xh.a aVar, int i) {
            super(3);
            this.h = jVar;
            this.i = aVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(com.amazon.aps.iva.d0.k kVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f o;
            int i;
            com.amazon.aps.iva.d0.k kVar2 = kVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$BoxWithConstraints");
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
                int i2 = this.j;
                j jVar = this.h;
                if (compare < 0) {
                    iVar2.s(-1235259899);
                    com.amazon.aps.iva.a1.f f = androidx.compose.foundation.layout.d.f(aVar, 16, 12);
                    a.h g = com.amazon.aps.iva.d0.a.g(8);
                    com.amazon.aps.iva.xh.a aVar2 = this.i;
                    iVar2.s(-483455358);
                    d0 a = com.amazon.aps.iva.d0.m.a(g, a.C0097a.m, iVar2);
                    iVar2.s(-1323940314);
                    int S = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l = iVar2.l();
                    com.amazon.aps.iva.u1.e.o0.getClass();
                    e.a aVar3 = e.a.b;
                    com.amazon.aps.iva.v0.a a2 = u.a(f);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar3);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                        e.a.C0752a c0752a = e.a.f;
                        if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                            b2.c(S, iVar2, S, c0752a);
                        }
                        a2.invoke(new x2(iVar2), iVar2, 0);
                        iVar2.s(2058660585);
                        a.c(aVar2, new com.amazon.aps.iva.h30.b(jVar), androidx.compose.foundation.layout.e.e(aVar), iVar2, (i2 & 14) | 384, 0);
                        a.d(new com.amazon.aps.iva.h30.c(jVar), androidx.compose.foundation.layout.e.e(aVar), iVar2, 48, 0);
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
                    iVar2.s(-1235259233);
                    com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.d.f(aVar, 16, 12);
                    b1 b1Var = b1.Max;
                    com.amazon.aps.iva.yb0.j.f(f2, "<this>");
                    com.amazon.aps.iva.yb0.j.f(b1Var, "intrinsicSize");
                    int i3 = j0.a.a[b1Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            o = f2.o(g1.c);
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    } else {
                        o = f2.o(i1.c);
                    }
                    a.h g2 = com.amazon.aps.iva.d0.a.g(8);
                    com.amazon.aps.iva.xh.a aVar4 = this.i;
                    iVar2.s(693286680);
                    d0 a3 = v1.a(g2, a.C0097a.j, iVar2);
                    iVar2.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l2 = iVar2.l();
                    com.amazon.aps.iva.u1.e.o0.getClass();
                    e.a aVar5 = e.a.b;
                    com.amazon.aps.iva.v0.a a4 = u.a(o);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar5);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a3, e.a.e);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l2, e.a.d);
                        e.a.C0752a c0752a2 = e.a.f;
                        if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S2))) {
                            b2.c(S2, iVar2, S2, c0752a2);
                        }
                        com.amazon.aps.iva.b8.i.c(0, a4, new x2(iVar2), iVar2, 2058660585);
                        y1 y1Var = y1.a;
                        float f3 = 320;
                        a.c(aVar4, new com.amazon.aps.iva.h30.d(jVar), y1Var.b(androidx.compose.foundation.layout.e.m(aVar, f3, 0.0f, 2), true), iVar2, i2 & 14, 0);
                        a.d(new com.amazon.aps.iva.h30.e(jVar), y1Var.b(androidx.compose.foundation.layout.e.m(aVar, f3, 0.0f, 2), true), iVar2, 0, 0);
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

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.xh.a h;
        public final /* synthetic */ j i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.xh.a aVar, j jVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = jVar;
            this.j = fVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            a.b(this.h, iVar, I, this.j);
            return q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessScreen.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.xh.a.values().length];
            try {
                iArr[com.amazon.aps.iva.xh.a.BENTO_GAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.xh.a.BENTO_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.xh.a r57, com.amazon.aps.iva.h30.j r58, com.amazon.aps.iva.a1.f r59, com.amazon.aps.iva.o0.i r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h30.a.a(com.amazon.aps.iva.xh.a, com.amazon.aps.iva.h30.j, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        com.amazon.aps.iva.a1.f fVar2;
        int i3;
        int i4;
        f.a aVar;
        com.amazon.aps.iva.o0.j g = iVar.g(-1564903111);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            fVar2 = fVar;
        } else if ((i & 14) == 0) {
            Object obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
            fVar2 = obj;
        } else {
            fVar2 = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = fVar2;
            }
            e0.b bVar = e0.a;
            l.e eVar = new l.e();
            g.s(1388713460);
            s sVar = new s(null);
            Context context = (Context) g.i(androidx.compose.ui.platform.d.b);
            g.s(-3686930);
            boolean H = g.H(eVar);
            Object e0 = g.e0();
            Object obj2 = i.a.a;
            if (H || e0 == obj2) {
                e0 = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.da.k());
                g.K0(e0);
            }
            g.U(false);
            q1 q1Var = (q1) e0;
            g.s(-3686552);
            boolean H2 = g.H(eVar) | g.H("__LottieInternalDefaultCacheKey__");
            Object e02 = g.e0();
            if (H2 || e02 == obj2) {
                g.K0(x.Z(context, eVar, "__LottieInternalDefaultCacheKey__", true));
            }
            g.U(false);
            x0.d(eVar, "__LottieInternalDefaultCacheKey__", new t(sVar, context, eVar, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", q1Var, null), g);
            g.U(false);
            com.amazon.aps.iva.da.g.a((com.amazon.aps.iva.z9.h) ((com.amazon.aps.iva.da.k) q1Var.getValue()).getValue(), aVar, false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, null, g, ((i3 << 3) & 112) | 1572872, 0, 262076);
            fVar2 = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new e(fVar2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.amazon.aps.iva.xh.a r15, com.amazon.aps.iva.xb0.l r16, com.amazon.aps.iva.a1.f r17, com.amazon.aps.iva.o0.i r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h30.a.c(com.amazon.aps.iva.xh.a, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void d(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.o0.j g = iVar.g(-1174772846);
        if ((i2 & 1) != 0) {
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
            com.amazon.aps.iva.zn.a.g(defpackage.i.E(R.string.bento_success_maybe_latter_cta, g), lVar, o.a(androidx.compose.foundation.layout.e.f(fVar, 40), false, h.h), 0L, g, (i3 << 3) & 112, 8);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new i(lVar, fVar, i, i2);
        }
    }
}
