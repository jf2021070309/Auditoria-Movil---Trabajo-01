package androidx.fragment.app;

import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.u;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.fr.b;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.x;
import com.amazon.aps.iva.jf0.h;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.m;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.fr.e eVar;
        com.amazon.aps.iva.fr.e eVar2;
        com.amazon.aps.iva.eq.b a;
        com.amazon.aps.iva.eq.a a2;
        com.amazon.aps.iva.sp.c cVar;
        Map x;
        String str;
        String str2;
        b.f fVar;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str3;
        String str4;
        String str5;
        e.h hVar;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj3;
                u.b bVar = (u.b) obj2;
                com.amazon.aps.iva.yb0.j.f(list, "$awaitingContainerChanges");
                com.amazon.aps.iva.yb0.j.f(bVar, "$operation");
                com.amazon.aps.iva.yb0.j.f((d) obj, "this$0");
                if (list.contains(bVar)) {
                    list.remove(bVar);
                    View view = bVar.c.mView;
                    u.b.EnumC0029b enumC0029b = bVar.a;
                    com.amazon.aps.iva.yb0.j.e(view, "view");
                    enumC0029b.applyState(view);
                    return;
                }
                return;
            case 1:
                SettableFuture settableFuture = (SettableFuture) obj2;
                com.amazon.aps.iva.g6.d dVar = (com.amazon.aps.iva.g6.d) obj;
                e.a aVar = ((x) obj3).e;
                try {
                    Pair U = com.amazon.aps.iva.cq.b.U(dVar);
                    U.getClass();
                    settableFuture.set(U);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 2:
                m.a aVar2 = (m.a) obj3;
                aVar2.getClass();
                int i2 = g0.a;
                com.amazon.aps.iva.v6.m mVar = aVar2.b;
                mVar.getClass();
                mVar.x((v) obj2, (com.amazon.aps.iva.a6.g) obj);
                return;
            case 3:
                com.amazon.aps.iva.b8.t tVar = (com.amazon.aps.iva.b8.t) obj3;
                p1.d dVar2 = (p1.d) obj2;
                q.e eVar3 = (q.e) obj;
                int i3 = p1.i;
                if (!tVar.g()) {
                    dVar2.d(tVar.o, eVar3);
                    return;
                }
                return;
            case 4:
                InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$5((View) obj3, (InAppMessageImmersiveBaseView) obj2, (ViewParent) obj);
                return;
            case 5:
                com.amazon.aps.iva.br.a aVar3 = (com.amazon.aps.iva.br.a) obj3;
                com.amazon.aps.iva.sp.c cVar2 = (com.amazon.aps.iva.sp.c) obj2;
                com.amazon.aps.iva.sp.c cVar3 = (com.amazon.aps.iva.sp.c) obj;
                int i4 = com.amazon.aps.iva.br.a.r;
                com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                com.amazon.aps.iva.yb0.j.f(cVar2, "$logWriter");
                com.amazon.aps.iva.yb0.j.f(cVar3, "$rumWriter");
                String str6 = aVar3.m;
                String str7 = aVar3.n;
                String str8 = aVar3.o;
                String str9 = aVar3.p;
                if (str8 != null) {
                    com.amazon.aps.iva.br.c a3 = aVar3.c.a(str8);
                    if (str6 == null) {
                        eVar2 = null;
                    } else {
                        Object a4 = aVar3.d.a(str6);
                        if (a4 instanceof com.amazon.aps.iva.fr.e) {
                            eVar = (com.amazon.aps.iva.fr.e) a4;
                        } else {
                            eVar = null;
                        }
                        eVar2 = eVar;
                    }
                    if (str7 == null) {
                        a = null;
                    } else {
                        a = aVar3.f.a(str7);
                    }
                    if (str9 == null) {
                        a2 = null;
                    } else {
                        a2 = aVar3.e.a(str9);
                    }
                    if (a3 != null) {
                        String format = String.format(Locale.US, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{a3.c}, 1));
                        com.amazon.aps.iva.yb0.j.e(format, "format(locale, this, *args)");
                        String str10 = a3.e;
                        if (eVar2 != null) {
                            e.b0 b0Var = eVar2.d;
                            com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j("session_id", b0Var.a);
                            e.b bVar2 = eVar2.b;
                            com.amazon.aps.iva.kb0.j jVar2 = new com.amazon.aps.iva.kb0.j("application_id", bVar2.a);
                            e.a0 a0Var = eVar2.f;
                            Map U2 = i0.U(jVar, jVar2, new com.amazon.aps.iva.kb0.j("view.id", a0Var.a), new com.amazon.aps.iva.kb0.j("error.stack", str10));
                            e.f fVar2 = eVar2.h;
                            if (fVar2 == null) {
                                fVar = null;
                            } else {
                                b.z valueOf = b.z.valueOf(fVar2.a.name());
                                List<e.q> list2 = fVar2.b;
                                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                                for (e.q qVar : list2) {
                                    arrayList.add(b.r.valueOf(qVar.name()));
                                }
                                e.c cVar4 = fVar2.c;
                                if (cVar4 == null) {
                                    str = null;
                                } else {
                                    str = cVar4.a;
                                }
                                if (cVar4 == null) {
                                    str2 = null;
                                } else {
                                    str2 = cVar4.b;
                                }
                                fVar = new b.f(valueOf, arrayList, new b.c(str, str2));
                            }
                            e.g gVar = eVar2.n;
                            if (gVar == null) {
                                map = null;
                            } else {
                                map = gVar.a;
                            }
                            Map<String, Object> map3 = a0.b;
                            if (map == null) {
                                map = map3;
                            }
                            e.z zVar = eVar2.g;
                            if (zVar == null) {
                                map2 = null;
                            } else {
                                map2 = zVar.d;
                            }
                            if (map2 != null) {
                                map3 = map2;
                            }
                            cVar = cVar2;
                            long c = aVar3.h.c() + a3.b;
                            b.C0276b c0276b = new b.C0276b(bVar2.a);
                            String str11 = eVar2.c;
                            b.m mVar2 = new b.m(b0Var.a, b.n.USER, null);
                            b.o oVar = (b.o) aVar3.j.c.getValue();
                            b.c0 c0Var = new b.c0(a0Var.a, a0Var.b, a0Var.c, a0Var.d, 16);
                            if (zVar == null) {
                                str3 = null;
                            } else {
                                str3 = zVar.a;
                            }
                            if (zVar == null) {
                                str4 = null;
                            } else {
                                str4 = zVar.b;
                            }
                            if (zVar == null) {
                                str5 = null;
                            } else {
                                str5 = zVar.c;
                            }
                            b.b0 b0Var2 = new b.b0(str3, str4, str5, map3);
                            com.amazon.aps.iva.aq.a aVar4 = aVar3.k;
                            cVar3.b(new com.amazon.aps.iva.fr.b(c, c0276b, str11, mVar2, oVar, c0Var, b0Var2, fVar, new b.t(aVar4.h(), aVar4.d(), aVar4.g()), new b.j(com.amazon.aps.iva.xq.e.c(aVar4.e()), aVar4.getDeviceName(), aVar4.c(), aVar4.f(), aVar4.a()), new b.h(new b.i(b.u.PLAN_1), 2), new b.g(map), new b.l(format, b.p.SOURCE, a3.e, Boolean.TRUE, a3.c, b.y.ANDROID, null, 705), null, 33536));
                            if (System.currentTimeMillis() - eVar2.a < com.amazon.aps.iva.br.a.q) {
                                e.h hVar2 = a0Var.v;
                                if (hVar2 == null) {
                                    hVar = null;
                                } else {
                                    hVar = new e.h(hVar2.a + 1);
                                }
                                if (hVar == null) {
                                    hVar = new e.h(1L);
                                }
                                e.a0 a5 = e.a0.a(a0Var, null, Boolean.FALSE, hVar, -2228225);
                                e.j jVar3 = eVar2.m;
                                cVar3.b(com.amazon.aps.iva.fr.e.a(eVar2, a5, null, new e.j(jVar3.a, jVar3.b, jVar3.c + 1), null, 12255));
                            }
                            x = U2;
                        } else {
                            cVar = cVar2;
                            x = com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j("error.stack", str10));
                        }
                        cVar.b(com.amazon.aps.iva.kq.b.a(aVar3.b, 9, format, null, x, b0.b, a3.b, null, false, false, a, a2, 64));
                    }
                }
                aVar3.o = null;
                aVar3.p = null;
                aVar3.m = null;
                aVar3.n = null;
                return;
            default:
                com.amazon.aps.iva.jf0.d dVar3 = (com.amazon.aps.iva.jf0.d) obj2;
                com.amazon.aps.iva.jf0.a0 a0Var2 = (com.amazon.aps.iva.jf0.a0) obj;
                h.a aVar5 = h.a.this;
                if (aVar5.c.isCanceled()) {
                    dVar3.onFailure(aVar5, new IOException("Canceled"));
                    return;
                } else {
                    dVar3.onResponse(aVar5, a0Var2);
                    return;
                }
        }
    }
}
