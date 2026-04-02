package com.amazon.aps.iva.pd;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: PersistentMessageEmptyState.kt */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: PersistentMessageEmptyState.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            i.a(this.h, iVar, I, i);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        com.amazon.aps.iva.a1.f b;
        j g = iVar.g(-1984720872);
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
            e0.b bVar = e0.a;
            b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.e(aVar)), com.amazon.aps.iva.ao.a.u, p0.a);
            a.b bVar2 = com.amazon.aps.iva.d0.a.e;
            b.a aVar3 = a.C0097a.n;
            g.s(-483455358);
            d0 a2 = m.a(bVar2, aVar3, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar4 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(b);
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
                float f = 220;
                com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.change_email_hime, g), "empty", androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar2, f), f), null, f.a.f, 0.0f, null, g, 25016, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                float f2 = 16;
                a4.b(defpackage.i.E(R.string.persistent_message_center_no_notifications, g), androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(aVar2, null, 3), f2, 24, f2, 0.0f, 8), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.b, g, 0, 0, 65016);
                a4.b(defpackage.i.E(R.string.persistent_messege_center_no_notifications_message, g), androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(aVar2, null, 3), f2, 8, f2, 0.0f, 8), com.amazon.aps.iva.ao.a.i, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.h, g, 0, 0, 65016);
                defpackage.c.c(g, false, true, false, false);
                obj = aVar;
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(obj, i, i2);
        }
    }
}
