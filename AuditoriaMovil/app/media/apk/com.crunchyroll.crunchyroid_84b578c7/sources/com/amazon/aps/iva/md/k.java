package com.amazon.aps.iva.md;

import android.content.Context;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.h2.t;
import com.amazon.aps.iva.h2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: DeleteAccountScreen.kt */
/* loaded from: classes.dex */
public final class k {
    public static final void a(int i, com.amazon.aps.iva.o0.i iVar, String str) {
        int i2;
        com.amazon.aps.iva.a1.f b;
        q1 q1Var;
        boolean z;
        int i3;
        com.amazon.aps.iva.yb0.j.f(str, "externalUrl");
        com.amazon.aps.iva.o0.j g = iVar.g(-1611476450);
        if ((i & 14) == 0) {
            if (g.H(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            Context context = (Context) g.i(androidx.compose.ui.platform.d.b);
            f.a aVar = f.a.c;
            b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(aVar), com.amazon.aps.iva.ao.a.u, p0.a);
            com.amazon.aps.iva.a1.f r = com.amazon.aps.iva.n1.c.r(b, com.amazon.aps.iva.n1.c.l(g));
            g.s(-483455358);
            d0 a = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = u.a(r);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                a2.invoke(new x2(g), g, 0);
                g.s(2058660585);
                g.s(-492369756);
                Object e0 = g.e0();
                i.a.C0550a c0550a = i.a.a;
                if (e0 == c0550a) {
                    e0 = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
                    g.K0(e0);
                }
                g.U(false);
                q1 q1Var2 = (q1) e0;
                String E = defpackage.i.E(R.string.account_deletion_support, g);
                String E2 = defpackage.i.E(R.string.account_deletion_support_url, g);
                String E3 = defpackage.i.E(R.string.account_deletion_privacy, g);
                String E4 = defpackage.i.E(R.string.account_deletion_privacy_url, g);
                g.s(1256757726);
                b.a aVar3 = new b.a();
                StringBuilder sb = aVar3.b;
                g.s(1256757761);
                y yVar = y.i;
                int e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, yVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    sb.append(defpackage.i.E(R.string.account_deletion_copy_part_1, g));
                    q qVar = q.a;
                    aVar3.c(e);
                    g.U(false);
                    sb.append(defpackage.i.E(R.string.account_deletion_copy_part_2, g));
                    g.s(1256758010);
                    e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, yVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        sb.append(defpackage.i.E(R.string.account_deletion_copy_part_3, g));
                        aVar3.c(e);
                        g.U(false);
                        g.s(1256758180);
                        e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, yVar, new t(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523));
                        try {
                            sb.append(defpackage.i.E(R.string.account_deletion_copy_part_4, g));
                            aVar3.c(e);
                            g.U(false);
                            g.s(1256758468);
                            e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, yVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                            try {
                                sb.append(defpackage.i.E(R.string.account_deletion_copy_part_5, g));
                                aVar3.c(e);
                                g.U(false);
                                sb.append(defpackage.i.E(R.string.account_deletion_copy_part_6, g));
                                g.s(1256758717);
                                e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, com.amazon.aps.iva.n2.i.c, null, 61439));
                                try {
                                    sb.append(defpackage.i.E(R.string.account_deletion_copy_part_7, g));
                                    aVar3.c(e);
                                    g.U(false);
                                    sb.append(defpackage.i.E(R.string.account_deletion_copy_part_8, g));
                                    long j = com.amazon.aps.iva.ao.a.a;
                                    e = aVar3.e(new com.amazon.aps.iva.c2.u(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                    try {
                                        aVar3.d(E, E);
                                        sb.append(E);
                                        aVar3.c(e);
                                        sb.append(defpackage.i.E(R.string.account_deletion_copy_part_9, g));
                                        g.s(1256759248);
                                        e = aVar3.e(new com.amazon.aps.iva.c2.u(0L, 0L, yVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                                        try {
                                            sb.append(defpackage.i.E(R.string.account_deletion_copy_part_10, g));
                                            aVar3.c(e);
                                            g.U(false);
                                            sb.append(defpackage.i.E(R.string.account_deletion_copy_part_11, g));
                                            e = aVar3.e(new com.amazon.aps.iva.c2.u(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                            try {
                                                aVar3.d(E3, E3);
                                                sb.append(E3);
                                                aVar3.c(e);
                                                sb.append(".");
                                                com.amazon.aps.iva.c2.b f = aVar3.f();
                                                g.U(false);
                                                float f2 = 16;
                                                com.amazon.aps.iva.j0.h.a(f, androidx.compose.foundation.layout.d.e(aVar, f2), new a0(com.amazon.aps.iva.ao.a.i, z.z(16), null, new com.amazon.aps.iva.h2.q(com.amazon.aps.iva.lb0.m.B(new com.amazon.aps.iva.h2.j[]{w.d(R.font.lato_medium)})), 0L, null, 16777180), false, 0, 0, null, new d(f, E, E2, E3, E4, context), g, 48, 120);
                                                g.s(1256760722);
                                                if (((Boolean) q1Var2.getValue()).booleanValue()) {
                                                    String E5 = defpackage.i.E(R.string.account_deletion_delete, g);
                                                    String E6 = defpackage.i.E(R.string.account_deletion_dialog_copy, g);
                                                    String E7 = defpackage.i.E(R.string.account_deletion_continue, g);
                                                    String E8 = defpackage.i.E(R.string.account_deletion_not_now, g);
                                                    e eVar = new e(context, str, q1Var2);
                                                    g.s(1157296644);
                                                    boolean H = g.H(q1Var2);
                                                    Object e02 = g.e0();
                                                    if (H || e02 == c0550a) {
                                                        e02 = new f(q1Var2);
                                                        g.K0(e02);
                                                    }
                                                    z = false;
                                                    g.U(false);
                                                    com.amazon.aps.iva.xb0.a aVar4 = (com.amazon.aps.iva.xb0.a) e02;
                                                    com.amazon.aps.iva.a1.f a3 = o.a(aVar, false, g.h);
                                                    g.s(1157296644);
                                                    boolean H2 = g.H(q1Var2);
                                                    Object e03 = g.e0();
                                                    if (H2 || e03 == c0550a) {
                                                        e03 = new h(q1Var2);
                                                        g.K0(e03);
                                                    }
                                                    g.U(false);
                                                    q1Var = q1Var2;
                                                    com.amazon.aps.iva.g70.a.a(E5, E6, E7, E8, eVar, aVar4, a3, (com.amazon.aps.iva.xb0.a) e03, g, 0, 0);
                                                } else {
                                                    q1Var = q1Var2;
                                                    z = false;
                                                }
                                                g.U(z);
                                                String upperCase = defpackage.i.E(R.string.account_deletion_continue, g).toUpperCase(Locale.ROOT);
                                                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                                com.amazon.aps.iva.a1.f h = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.e.e(aVar), f2, 8, f2, 10);
                                                g.s(1157296644);
                                                q1 q1Var3 = q1Var;
                                                boolean H3 = g.H(q1Var3);
                                                Object e04 = g.e0();
                                                if (H3 || e04 == c0550a) {
                                                    e04 = new i(q1Var3);
                                                    g.K0(e04);
                                                }
                                                g.U(z);
                                                com.amazon.aps.iva.zn.a.d((l) e04, upperCase, h, false, null, g, 384, 24);
                                                defpackage.c.c(g, z, true, z, z);
                                                e0.b bVar2 = e0.a;
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new j(str, i);
        }
    }
}
