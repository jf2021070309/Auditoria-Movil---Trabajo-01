package com.amazon.aps.iva.n4;

import android.net.Uri;
import android.os.RemoteException;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.u;
import com.amazon.aps.iva.a6.k1;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.a6.n1;
import com.amazon.aps.iva.a6.q0;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.j6.b;
import com.amazon.aps.iva.nw.i;
import com.amazon.aps.iva.nw.k;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.b;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.t;
import com.amazon.aps.iva.v6.m;
import com.ellation.crunchyroll.api.etp.error.NotFoundException;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;
import java.util.Arrays;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.nw.k kVar;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                d.c cVar = (d.c) this.c;
                u.b bVar = (u.b) this.d;
                com.amazon.aps.iva.yb0.j.f(cVar, "$transitionInfo");
                com.amazon.aps.iva.yb0.j.f(bVar, "$operation");
                cVar.a();
                if (FragmentManager.H(2)) {
                    bVar.toString();
                    return;
                }
                return;
            case 1:
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) this.c;
                u.a aVar = (u.a) this.d;
                com.amazon.aps.iva.yb0.j.f(uVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(aVar, "$operation");
                uVar.b.remove(aVar);
                uVar.c.remove(aVar);
                return;
            case 2:
                com.amazon.aps.iva.t5.t tVar = (com.amazon.aps.iva.t5.t) this.c;
                t.a aVar2 = (t.a) this.d;
                synchronized (tVar.c) {
                    i = tVar.d;
                }
                aVar2.a(i);
                return;
            case 3:
                m0 m0Var = (m0) this.c;
                q0.d dVar = (q0.d) this.d;
                int i2 = m0Var.G - dVar.c;
                m0Var.G = i2;
                if (dVar.d) {
                    m0Var.H = dVar.e;
                    m0Var.I = true;
                }
                if (dVar.f) {
                    m0Var.J = dVar.g;
                }
                if (i2 == 0) {
                    r0 r0Var = dVar.b.a;
                    if (!m0Var.l0.a.r() && r0Var.r()) {
                        m0Var.m0 = -1;
                        m0Var.n0 = 0L;
                    }
                    if (!r0Var.r()) {
                        List asList = Arrays.asList(((n1) r0Var).o);
                        if (asList.size() == m0Var.o.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.amazon.aps.iva.cq.b.C(z2);
                        for (int i3 = 0; i3 < asList.size(); i3++) {
                            ((m0.d) m0Var.o.get(i3)).b = (r0) asList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (m0Var.I) {
                        if (dVar.b.b.equals(m0Var.l0.b) && dVar.b.d == m0Var.l0.r) {
                            z3 = false;
                        }
                        if (z3) {
                            if (!r0Var.r() && !dVar.b.b.a()) {
                                k1 k1Var = dVar.b;
                                v.b bVar2 = k1Var.b;
                                long j2 = k1Var.d;
                                Object obj = bVar2.a;
                                r0.b bVar3 = m0Var.n;
                                r0Var.i(obj, bVar3);
                                j = j2 + bVar3.f;
                            } else {
                                j = dVar.b.d;
                            }
                        }
                        z = z3;
                    } else {
                        z = false;
                    }
                    m0Var.I = false;
                    m0Var.E1(dVar.b, 1, m0Var.J, z, m0Var.H, j, -1, false);
                    return;
                }
                return;
            case 4:
                e.a aVar3 = (e.a) this.c;
                ((com.amazon.aps.iva.g6.e) this.d).a0(aVar3.a, aVar3.b);
                return;
            case 5:
                b.C0401b c0401b = (b.C0401b) this.c;
                c0401b.j = false;
                c0401b.b((Uri) this.d);
                return;
            case 6:
                com.amazon.aps.iva.p6.b bVar4 = (com.amazon.aps.iva.p6.b) this.c;
                bVar4.n.d(bVar4, bVar4.p, bVar4.q, bVar4.o, (b.d) this.d);
                return;
            case 7:
                m.a aVar4 = (m.a) this.c;
                aVar4.getClass();
                int i4 = com.amazon.aps.iva.t5.g0.a;
                aVar4.b.l((Exception) this.d);
                return;
            case 8:
                com.amazon.aps.iva.b8.t tVar2 = (com.amazon.aps.iva.b8.t) this.c;
                v1 v1Var = (v1) this.d;
                com.amazon.aps.iva.b8.m0 m0Var2 = tVar2.f;
                tVar2.o = v1Var;
                v1Var.c = tVar2.t;
                t.b bVar5 = new t.b(tVar2, v1Var);
                v1Var.u(bVar5);
                tVar2.q = bVar5;
                try {
                    m0Var2.d.x(0, null, v1Var);
                } catch (RemoteException e) {
                    com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
                }
                m0Var2.g.e(true);
                tVar2.n = v1Var.Y0();
                tVar2.e(v1Var.j0());
                return;
            case 9:
                com.amazon.aps.iva.up.f fVar = (com.amazon.aps.iva.up.f) this.c;
                List list = (List) this.d;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(list, "$data");
                fVar.a.a(list);
                return;
            case 10:
                com.amazon.aps.iva.s00.a aVar5 = (com.amazon.aps.iva.s00.a) this.c;
                com.amazon.aps.iva.nw.g gVar = (com.amazon.aps.iva.nw.g) this.d;
                com.amazon.aps.iva.yb0.j.f(aVar5, "this$0");
                com.amazon.aps.iva.yb0.j.f(gVar, "$renewException");
                com.amazon.aps.iva.nw.h hVar = new com.amazon.aps.iva.nw.h(aVar5.b, gVar);
                com.amazon.aps.iva.nw.i iVar = hVar.d;
                iVar.getClass();
                com.amazon.aps.iva.nw.g gVar2 = hVar.c;
                com.amazon.aps.iva.yb0.j.f(gVar2, "renewException");
                int i5 = i.a.a[gVar2.b.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (gVar2.getCause() instanceof NotFoundException) {
                            kVar = k.c.c;
                        } else {
                            kVar = k.b.c;
                        }
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    kVar = k.a.c;
                }
                iVar.getView().g1(kVar.a, kVar.b);
                return;
            default:
                RemovalListeners.a((RemovalListener) this.c, (RemovalNotification) this.d);
                return;
        }
    }
}
