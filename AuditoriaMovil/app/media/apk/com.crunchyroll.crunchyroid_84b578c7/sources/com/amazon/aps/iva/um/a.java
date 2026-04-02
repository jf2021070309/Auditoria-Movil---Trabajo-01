package com.amazon.aps.iva.um;

import android.content.res.Configuration;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.o;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.n2.h;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.um.f;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SwitchProfileScreenContent.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: SwitchProfileScreenContent.kt */
    /* renamed from: com.amazon.aps.iva.um.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0769a extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public static final C0769a h = new C0769a();

        public C0769a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            j.f(fVar, "it");
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<f, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super f, q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(f.a.a);
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.ym.c>, i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.um.e h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.fm.a k;
        public final /* synthetic */ Configuration l;
        public final /* synthetic */ int m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<f, q> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.um.e eVar, boolean z, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.fm.a aVar, Configuration configuration, int i, com.amazon.aps.iva.xb0.l<? super f, q> lVar) {
            super(3);
            this.h = eVar;
            this.i = z;
            this.j = fVar;
            this.k = aVar;
            this.l = configuration;
            this.m = i;
            this.n = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.ym.c> aVar, i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.um.e eVar;
            String b;
            com.amazon.aps.iva.a1.f b2;
            int i2;
            com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.ym.c> aVar2 = aVar;
            i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(aVar2, "profiles");
            if ((intValue & 14) == 0) {
                if (iVar2.H(aVar2)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                intValue |= i2;
            }
            int i3 = intValue;
            if ((i3 & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.fm.a aVar3 = this.k;
                com.amazon.aps.iva.xb0.l<f, q> lVar = this.n;
                iVar2.s(733328855);
                f.a aVar4 = f.a.c;
                d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar5 = e.a.b;
                com.amazon.aps.iva.v0.a a = u.a(aVar4);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar5);
                    } else {
                        iVar2.m();
                    }
                    e.a.b bVar2 = e.a.e;
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, bVar2);
                    e.a.d dVar = e.a.d;
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, dVar);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.um.e eVar2 = this.h;
                    String str = eVar2.b;
                    iVar2.s(-698588026);
                    int i4 = this.m;
                    if (str == null) {
                        i = i4;
                        eVar = eVar2;
                        b = null;
                    } else {
                        Configuration configuration = this.l;
                        i = i4;
                        eVar = eVar2;
                        b = aVar3.b(str, configuration.screenWidthDp, configuration.screenHeightDp, iVar2, (i4 << 3) & 7168);
                    }
                    iVar2.G();
                    long j = com.amazon.aps.iva.ao.a.l;
                    com.amazon.aps.iva.ly.a.a(null, b, null, null, j, 0.0f, null, null, iVar2, 0, 237);
                    boolean z = this.i;
                    if (z) {
                        j = com.amazon.aps.iva.ao.a.u;
                    }
                    b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(this.j), com.amazon.aps.iva.ao.a.A, p0.a);
                    com.amazon.aps.iva.a1.f a2 = androidx.compose.foundation.c.a(b2, s.a.b(f1.K(new x(j), new x(com.amazon.aps.iva.ao.a.c))));
                    b.a aVar6 = a.C0097a.n;
                    a.b bVar3 = com.amazon.aps.iva.d0.a.e;
                    iVar2.s(-483455358);
                    d0 a3 = m.a(bVar3, aVar6, iVar2);
                    iVar2.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l2 = iVar2.l();
                    com.amazon.aps.iva.v0.a a4 = u.a(a2);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar5);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a3, bVar2);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l2, dVar);
                        if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S2))) {
                            b2.c(S2, iVar2, S2, c0752a);
                        }
                        a4.invoke(new x2(iVar2), iVar2, 0);
                        iVar2.s(2058660585);
                        iVar2.s(-950622916);
                        if (z) {
                            float f = 24;
                            a4.b(i.E(R.string.who_is_watching_toolbar_title, iVar2), androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.n(aVar4)), f, 71, f, 0.0f, 8), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, new h(3), 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.a, iVar2, 0, 0, 65016);
                        }
                        iVar2.G();
                        com.amazon.aps.iva.a1.f a5 = o.a(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar4)));
                        iVar2.s(1157296644);
                        boolean H = iVar2.H(lVar);
                        Object t = iVar2.t();
                        if (H || t == i.a.a) {
                            t = new com.amazon.aps.iva.um.b(lVar);
                            iVar2.n(t);
                        }
                        iVar2.G();
                        com.amazon.aps.iva.ym.b.a(aVar2, aVar3, a5, (com.amazon.aps.iva.xb0.l) t, iVar2, (i3 & 14) | ((i >> 3) & 112), 0);
                        iVar2.s(-950621774);
                        if (!((com.amazon.aps.iva.ym.c) com.amazon.aps.iva.lb0.x.t0(aVar2)).g) {
                            com.amazon.aps.iva.xm.a.a(eVar.c, aVar2.size(), lVar, iVar2, (i >> 6) & 896, 0);
                        }
                        iVar2.G();
                        com.amazon.aps.iva.cq.b.k(androidx.compose.foundation.layout.e.f(aVar4, 27), iVar2, 6);
                        iVar2.G();
                        iVar2.o();
                        iVar2.G();
                        iVar2.G();
                        iVar2.G();
                        iVar2.o();
                        iVar2.G();
                        iVar2.G();
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements r<Throwable, com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.ym.c>, i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<f, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, com.amazon.aps.iva.xb0.l lVar) {
            super(4);
            this.h = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.r
        public final q K(Throwable th, com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.ym.c> aVar, i iVar, Integer num) {
            i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(th, "$anonymous$parameter$0$");
            if ((intValue & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.xb0.a[] aVarArr = new com.amazon.aps.iva.xb0.a[1];
                iVar2.s(1157296644);
                com.amazon.aps.iva.xb0.l<f, q> lVar = this.h;
                boolean H = iVar2.H(lVar);
                Object t = iVar2.t();
                if (H || t == i.a.a) {
                    t = new com.amazon.aps.iva.um.c(lVar);
                    iVar2.n(t);
                }
                iVar2.G();
                aVarArr[0] = t;
                long j = com.amazon.aps.iva.ao.a.l;
                com.amazon.aps.iva.k60.a.a(null, 0, null, 0, j, j, null, null, null, null, aVarArr, iVar2, 0, 8, 975);
            }
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.um.e h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.fm.a j;
        public final /* synthetic */ com.amazon.aps.iva.a1.f k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<f, q> l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.um.e eVar, boolean z, com.amazon.aps.iva.fm.a aVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super f, q> lVar, int i, int i2) {
            super(2);
            this.h = eVar;
            this.i = z;
            this.j = aVar;
            this.k = fVar;
            this.l = lVar;
            this.m = i;
            this.n = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.um.e r17, boolean r18, com.amazon.aps.iva.fm.a r19, com.amazon.aps.iva.a1.f r20, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.um.f, com.amazon.aps.iva.kb0.q> r21, com.amazon.aps.iva.o0.i r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.um.a.a(com.amazon.aps.iva.um.e, boolean, com.amazon.aps.iva.fm.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
