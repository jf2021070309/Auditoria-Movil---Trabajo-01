package com.amazon.aps.iva.nl;

import android.content.res.Configuration;
import androidx.compose.ui.node.e;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.u1.e;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
/* compiled from: AudioSettingsScreen.kt */
/* loaded from: classes2.dex */
public final class n {

    /* compiled from: AudioSettingsScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nl.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AudioSettingsScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ q h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q qVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> lVar, int i, int i2) {
            super(2);
            this.h = qVar;
            this.i = lVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            n.a(this.h, this.i, iVar, I, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(q qVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        long j;
        com.amazon.aps.iva.a1.f b2;
        com.amazon.aps.iva.yb0.j.f(qVar, "viewModel");
        com.amazon.aps.iva.o0.j g = iVar.g(-190968818);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(qVar)) {
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
            if (g.v(lVar)) {
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
                lVar = a.h;
            }
            e0.b bVar = e0.a;
            if (((Configuration) g.i(androidx.compose.ui.platform.d.a)).screenWidthDp < 600) {
                j = com.amazon.aps.iva.ao.a.u;
            } else {
                j = com.amazon.aps.iva.ao.a.v;
            }
            f.a aVar = f.a.c;
            b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar)), j, p0.a);
            g.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(b2);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                a2.invoke(new x2(g), g, 0);
                g.s(2058660585);
                LiveData<List<com.amazon.aps.iva.nl.a>> A7 = qVar.A7();
                com.amazon.aps.iva.yb0.j.f(A7, "<this>");
                g.s(-2027206144);
                q1 d = com.amazon.aps.iva.p4.f.d(A7, A7.d(), g);
                g.U(false);
                List list = (List) d.getValue();
                g.s(1559755973);
                if (list != null) {
                    f.a(x.m0(list), androidx.compose.foundation.layout.d.i(aVar, 0.0f, 0.0f, 0.0f, com.amazon.aps.iva.cq.b.N(R.dimen.player_settings_list_padding_vertical, g), 7), lVar, g, ((i3 << 3) & 896) | 8, 0);
                }
                defpackage.c.c(g, false, false, true, false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(qVar, lVar, i, i2);
        }
    }
}
