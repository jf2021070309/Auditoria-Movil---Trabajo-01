package com.amazon.aps.iva.sv;

import android.content.Context;
import com.amazon.aps.iva.ew.b;
import com.amazon.aps.iva.kw.i;
import com.amazon.aps.iva.rw.a;
import com.amazon.aps.iva.wv.a;
import com.amazon.aps.iva.wv.b0;
import com.amazon.aps.iva.wv.d;
import com.amazon.aps.iva.wv.e0;
import com.amazon.aps.iva.wv.g;
import com.amazon.aps.iva.wv.g0;
import com.amazon.aps.iva.wv.i0;
import com.amazon.aps.iva.wv.j;
import com.amazon.aps.iva.wv.k0;
import com.amazon.aps.iva.wv.m;
import com.amazon.aps.iva.wv.n0;
import com.amazon.aps.iva.wv.o;
import com.amazon.aps.iva.wv.q;
import com.amazon.aps.iva.wv.s;
import com.amazon.aps.iva.wv.u;
import com.amazon.aps.iva.wv.x;
import com.amazon.aps.iva.zv.b;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.downloading.p;
import com.ellation.crunchyroll.downloading.q;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsRepository.kt */
/* loaded from: classes2.dex */
public interface u1 extends z1, com.amazon.aps.iva.mg.a {

    /* compiled from: DownloadsRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static v1 a() {
            Context context = b.a.a;
            if (context != null) {
                com.amazon.aps.iva.wv.y yVar = x.a.a;
                if (yVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                    yVar = new com.amazon.aps.iva.wv.y(applicationContext);
                    x.a.a = yVar;
                }
                com.amazon.aps.iva.wv.y yVar2 = yVar;
                Context context2 = b.a.a;
                if (context2 != null) {
                    com.amazon.aps.iva.wv.h hVar = g.a.a;
                    if (hVar == null) {
                        Context applicationContext2 = context2.getApplicationContext();
                        com.amazon.aps.iva.yb0.j.e(applicationContext2, "context.applicationContext");
                        hVar = new com.amazon.aps.iva.wv.h(applicationContext2);
                        g.a.a = hVar;
                    }
                    com.amazon.aps.iva.wv.h hVar2 = hVar;
                    Context context3 = b.a.a;
                    if (context3 != null) {
                        com.amazon.aps.iva.wv.t tVar = s.a.a;
                        if (tVar == null) {
                            Context applicationContext3 = context3.getApplicationContext();
                            com.amazon.aps.iva.yb0.j.e(applicationContext3, "context.applicationContext");
                            tVar = new com.amazon.aps.iva.wv.t(applicationContext3);
                            s.a.a = tVar;
                        }
                        com.amazon.aps.iva.wv.t tVar2 = tVar;
                        Context context4 = b.a.a;
                        if (context4 != null) {
                            com.amazon.aps.iva.wv.j0 j0Var = i0.a.a;
                            if (j0Var == null) {
                                Context applicationContext4 = context4.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext4, "context.applicationContext");
                                j0Var = new com.amazon.aps.iva.wv.j0(applicationContext4);
                                i0.a.a = j0Var;
                            }
                            com.amazon.aps.iva.wv.j0 j0Var2 = j0Var;
                            Context context5 = b.a.a;
                            if (context5 != null) {
                                com.amazon.aps.iva.wv.k kVar = j.a.a;
                                if (kVar == null) {
                                    Context applicationContext5 = context5.getApplicationContext();
                                    com.amazon.aps.iva.yb0.j.e(applicationContext5, "context.applicationContext");
                                    kVar = new com.amazon.aps.iva.wv.k(applicationContext5);
                                    j.a.a = kVar;
                                }
                                com.amazon.aps.iva.wv.k kVar2 = kVar;
                                Context context6 = b.a.a;
                                if (context6 != null) {
                                    com.amazon.aps.iva.wv.n nVar = m.a.a;
                                    if (nVar == null) {
                                        Context applicationContext6 = context6.getApplicationContext();
                                        com.amazon.aps.iva.yb0.j.e(applicationContext6, "context.applicationContext");
                                        nVar = new com.amazon.aps.iva.wv.n(applicationContext6);
                                        m.a.a = nVar;
                                    }
                                    com.amazon.aps.iva.wv.n nVar2 = nVar;
                                    Context context7 = b.a.a;
                                    if (context7 != null) {
                                        com.amazon.aps.iva.wv.r rVar = q.a.a;
                                        if (rVar == null) {
                                            Context applicationContext7 = context7.getApplicationContext();
                                            com.amazon.aps.iva.yb0.j.e(applicationContext7, "context.applicationContext");
                                            rVar = new com.amazon.aps.iva.wv.r(applicationContext7);
                                            q.a.a = rVar;
                                        }
                                        com.amazon.aps.iva.wv.r rVar2 = rVar;
                                        Context context8 = b.a.a;
                                        if (context8 != null) {
                                            com.amazon.aps.iva.wv.v vVar = u.a.a;
                                            if (vVar == null) {
                                                Context applicationContext8 = context8.getApplicationContext();
                                                com.amazon.aps.iva.yb0.j.e(applicationContext8, "context.applicationContext");
                                                vVar = new com.amazon.aps.iva.wv.v(applicationContext8);
                                                u.a.a = vVar;
                                            }
                                            com.amazon.aps.iva.wv.v vVar2 = vVar;
                                            Context context9 = b.a.a;
                                            if (context9 != null) {
                                                com.amazon.aps.iva.wv.d0 d0Var = b0.a.a;
                                                if (d0Var == null) {
                                                    Context applicationContext9 = context9.getApplicationContext();
                                                    com.amazon.aps.iva.yb0.j.e(applicationContext9, "context.applicationContext");
                                                    d0Var = new com.amazon.aps.iva.wv.d0(applicationContext9);
                                                    b0.a.a = d0Var;
                                                }
                                                com.amazon.aps.iva.wv.d0 d0Var2 = d0Var;
                                                Context context10 = b.a.a;
                                                if (context10 != null) {
                                                    com.amazon.aps.iva.kw.j jVar = i.a.a;
                                                    if (jVar == null) {
                                                        Context applicationContext10 = context10.getApplicationContext();
                                                        com.amazon.aps.iva.yb0.j.e(applicationContext10, "context.applicationContext");
                                                        jVar = new com.amazon.aps.iva.kw.j(applicationContext10);
                                                        i.a.a = jVar;
                                                    }
                                                    com.amazon.aps.iva.kw.j jVar2 = jVar;
                                                    Context context11 = b.a.a;
                                                    if (context11 != null) {
                                                        com.amazon.aps.iva.wv.f0 f0Var = e0.a.a;
                                                        if (f0Var == null) {
                                                            Context applicationContext11 = context11.getApplicationContext();
                                                            com.amazon.aps.iva.yb0.j.e(applicationContext11, "context.applicationContext");
                                                            f0Var = new com.amazon.aps.iva.wv.f0(applicationContext11);
                                                            e0.a.a = f0Var;
                                                        }
                                                        com.amazon.aps.iva.wv.f0 f0Var2 = f0Var;
                                                        Context context12 = b.a.a;
                                                        if (context12 != null) {
                                                            com.amazon.aps.iva.wv.h0 h0Var = g0.a.a;
                                                            if (h0Var == null) {
                                                                Context applicationContext12 = context12.getApplicationContext();
                                                                com.amazon.aps.iva.yb0.j.e(applicationContext12, "context.applicationContext");
                                                                h0Var = new com.amazon.aps.iva.wv.h0(applicationContext12);
                                                                g0.a.a = h0Var;
                                                            }
                                                            com.amazon.aps.iva.wv.h0 h0Var2 = h0Var;
                                                            Context context13 = b.a.a;
                                                            if (context13 != null) {
                                                                com.amazon.aps.iva.wv.l0 l0Var = k0.a.a;
                                                                if (l0Var == null) {
                                                                    Context applicationContext13 = context13.getApplicationContext();
                                                                    com.amazon.aps.iva.yb0.j.e(applicationContext13, "context.applicationContext");
                                                                    l0Var = new com.amazon.aps.iva.wv.l0(applicationContext13);
                                                                    k0.a.a = l0Var;
                                                                }
                                                                com.amazon.aps.iva.wv.l0 l0Var2 = l0Var;
                                                                Context context14 = b.a.a;
                                                                if (context14 != null) {
                                                                    com.amazon.aps.iva.wv.o0 o0Var = n0.a.a;
                                                                    if (o0Var == null) {
                                                                        Context applicationContext14 = context14.getApplicationContext();
                                                                        com.amazon.aps.iva.yb0.j.e(applicationContext14, "context.applicationContext");
                                                                        o0Var = new com.amazon.aps.iva.wv.o0(applicationContext14);
                                                                        n0.a.a = o0Var;
                                                                    }
                                                                    com.amazon.aps.iva.wv.o0 o0Var2 = o0Var;
                                                                    Context context15 = b.a.a;
                                                                    if (context15 != null) {
                                                                        com.amazon.aps.iva.wv.f fVar = n0.a.b;
                                                                        if (fVar == null) {
                                                                            Context applicationContext15 = context15.getApplicationContext();
                                                                            com.amazon.aps.iva.yb0.j.e(applicationContext15, "context.applicationContext");
                                                                            fVar = new com.amazon.aps.iva.wv.f(applicationContext15);
                                                                            n0.a.b = fVar;
                                                                        }
                                                                        com.amazon.aps.iva.wv.f fVar2 = fVar;
                                                                        Context context16 = b.a.a;
                                                                        if (context16 != null) {
                                                                            com.amazon.aps.iva.wv.e eVar = d.a.a;
                                                                            if (eVar == null) {
                                                                                Context applicationContext16 = context16.getApplicationContext();
                                                                                com.amazon.aps.iva.yb0.j.e(applicationContext16, "context.applicationContext");
                                                                                eVar = new com.amazon.aps.iva.wv.e(applicationContext16);
                                                                                d.a.a = eVar;
                                                                            }
                                                                            com.amazon.aps.iva.wv.e eVar2 = eVar;
                                                                            Context context17 = b.a.a;
                                                                            if (context17 != null) {
                                                                                com.amazon.aps.iva.wv.b bVar = a.C0833a.a;
                                                                                if (bVar == null) {
                                                                                    Context applicationContext17 = context17.getApplicationContext();
                                                                                    com.amazon.aps.iva.yb0.j.e(applicationContext17, "context.applicationContext");
                                                                                    bVar = new com.amazon.aps.iva.wv.b(applicationContext17);
                                                                                    a.C0833a.a = bVar;
                                                                                }
                                                                                com.amazon.aps.iva.wv.b bVar2 = bVar;
                                                                                Context context18 = b.a.a;
                                                                                if (context18 != null) {
                                                                                    com.amazon.aps.iva.ew.c cVar = b.a.a;
                                                                                    if (cVar == null) {
                                                                                        Context applicationContext18 = context18.getApplicationContext();
                                                                                        com.amazon.aps.iva.yb0.j.e(applicationContext18, "context.applicationContext");
                                                                                        cVar = new com.amazon.aps.iva.ew.c(applicationContext18);
                                                                                        b.a.a = cVar;
                                                                                    }
                                                                                    com.amazon.aps.iva.ew.c cVar2 = cVar;
                                                                                    Context context19 = b.a.a;
                                                                                    if (context19 != null) {
                                                                                        com.amazon.aps.iva.wv.p pVar = o.a.a;
                                                                                        if (pVar == null) {
                                                                                            Context applicationContext19 = context19.getApplicationContext();
                                                                                            com.amazon.aps.iva.yb0.j.e(applicationContext19, "context.applicationContext");
                                                                                            pVar = new com.amazon.aps.iva.wv.p(applicationContext19);
                                                                                            o.a.a = pVar;
                                                                                        }
                                                                                        com.amazon.aps.iva.wv.p pVar2 = pVar;
                                                                                        t1 t1Var = t1.h;
                                                                                        com.amazon.aps.iva.yb0.j.f(t1Var, "getCurrentDate");
                                                                                        return new v1(yVar2, hVar2, tVar2, j0Var2, kVar2, nVar2, rVar2, vVar2, d0Var2, jVar2, f0Var2, h0Var2, l0Var2, o0Var2, fVar2, eVar2, bVar2, cVar2, pVar2, t1Var);
                                                                                    }
                                                                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                                    throw null;
                                                                                }
                                                                                com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                                throw null;
                                                                            }
                                                                            com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                            throw null;
                                                                        }
                                                                        com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                        throw null;
                                                                    }
                                                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                    throw null;
                                                                }
                                                                com.amazon.aps.iva.yb0.j.m("internalContext");
                                                                throw null;
                                                            }
                                                            com.amazon.aps.iva.yb0.j.m("internalContext");
                                                            throw null;
                                                        }
                                                        com.amazon.aps.iva.yb0.j.m("internalContext");
                                                        throw null;
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                                    throw null;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("internalContext");
                                                throw null;
                                            }
                                            com.amazon.aps.iva.yb0.j.m("internalContext");
                                            throw null;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("internalContext");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("internalContext");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("internalContext");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("internalContext");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("internalContext");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("internalContext");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("internalContext");
            throw null;
        }
    }

    Object A(String str, q.f fVar, q.g gVar, com.amazon.aps.iva.ob0.d dVar);

    Object c(String str, p.f fVar, p.g gVar, com.amazon.aps.iva.ob0.d dVar);

    Object clear(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object d(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object e(String str, com.amazon.aps.iva.wg.b bVar, a.C0685a c0685a);

    Object k(PlayableAsset playableAsset, Streams streams, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object w(com.amazon.aps.iva.sw.b bVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);
}
