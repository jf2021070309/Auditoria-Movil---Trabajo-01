package com.amazon.aps.iva.hl;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
import com.crunchyroll.crunchyroid.R;
/* compiled from: DownloadingIncompleteOverlay.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: DownloadingIncompleteOverlay.kt */
    /* renamed from: com.amazon.aps.iva.hl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0340a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public static final C0340a h = new C0340a();

        public C0340a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.a2.y.e(c0Var2, "downloading_incomplete_overlay");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadingIncompleteOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.a2.y.e(c0Var2, "downloading_incomplete_overlay_title");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadingIncompleteOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.a2.y.e(c0Var2, "downloading_incomplete_overlay_subtitle");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadingIncompleteOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            a.a(this.h, iVar, I, i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        com.amazon.aps.iva.o0.j g = iVar.g(-1654221788);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            f.a aVar2 = f.a.c;
            if (i5 != 0) {
                aVar = aVar2;
            } else {
                aVar = obj;
            }
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.e.m(aVar, 0.0f, 360, 1), false, C0340a.h);
            b.a aVar3 = a.C0097a.n;
            g.s(-483455358);
            com.amazon.aps.iva.s1.d0 a2 = com.amazon.aps.iva.d0.m.a(com.amazon.aps.iva.d0.a.c, aVar3, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar4 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = com.amazon.aps.iva.s1.u.a(a);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar4);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a2, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d(0, a3, new x2(g), g, 2058660585);
                com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_error, g), null, null, null, null, 0.0f, null, g, 56, 124);
                float f = 8;
                a4.b(defpackage.i.E(R.string.downloading_incomplete_overlay_title, g), com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(aVar2, null, 3), 0.0f, f, 0.0f, 0.0f, 13), false, b.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.e, g, 0, 0, 65016);
                a4.b(defpackage.i.E(R.string.downloading_incomplete_overlay_subtitle, g), com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.e.o(aVar2, null, 3), f), false, c.h), com.amazon.aps.iva.ao.a.i, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.i, g, 0, 0, 65016);
                defpackage.c.c(g, false, true, false, false);
                obj = aVar;
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new d(obj, i, i2);
        }
    }
}
