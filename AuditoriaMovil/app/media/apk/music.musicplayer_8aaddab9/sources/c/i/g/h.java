package c.i.g;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import c.b.c.l;
import c.p.q;
import ch.qos.logback.classic.Level;
import e.a.c.g7;
import e.d.d.l.n;
import e.d.d.l.u;
import e.d.d.l.v;
import e.d.d.l.x;
import e.d.d.m.j.j.g0;
import e.d.d.m.j.j.h0;
import e.h.g.l0;
import e.h.g.n0;
import e.h.g.s1;
import e.h.g.x0;
import e.j.d.b0.c.g;
import e.j.d.k;
import e.j.d.r;
import e.j.d.s;
import e.j.d.w;
import h.o.c.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class h {
    public static l0 a;

    public static void A(l lVar) {
        k g2 = g();
        j.e(lVar, "activity");
        j.e(lVar, "activity");
        w.Y(q.a(lVar), null, null, new r(0, g2, lVar, -1, null, null), 3, null);
    }

    public static void B(String str, boolean z) {
        m().m(str, z);
    }

    public static void C(String str, int i2) {
        m().n(str, i2);
    }

    public static void D(String str, String str2) {
        l().p(str, str2);
    }

    public static void E(String str, String str2) {
        m().p(str, str2);
    }

    public static void F(String str) {
        m().q(str);
    }

    public static void G(Bundle bundle) {
        l.a.a.c cVar = new l.a.a.c();
        cVar.put("track", bundle.getString("track"));
        cVar.put("artist", bundle.getString("artist"));
        cVar.put("album", bundle.getString("album"));
        cVar.put("path", bundle.getString("path"));
        E("ad", cVar.b());
    }

    public static void H(Uri uri) {
        if (uri == null) {
            D("ah", "");
        } else {
            D("ah", uri.toString());
        }
    }

    public static void I(boolean z) {
        B("aa", z);
    }

    public static void J(int i2) {
        C("repeatmode", i2);
    }

    public static void K(int i2) {
        C("shufflemode", i2);
    }

    public static void L(boolean z) {
        l().m("ai", z);
    }

    public static void M(String str) {
        if (x()) {
            return;
        }
        k g2 = g();
        j.e(str, "source");
        k.l(g2, str, 0, 0, 6);
    }

    public static void N(FragmentManager fragmentManager) {
        k g2 = g();
        j.e(fragmentManager, "fm");
        k.m(g2, fragmentManager, 0, null, 6);
    }

    public static ExecutorService a(String str) {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new g0(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new h0(str, unconfigurableExecutorService, 2L, TimeUnit.SECONDS), e.a.d.a.a.k("Crashlytics Shutdown Hook for ", str)));
        return unconfigurableExecutorService;
    }

    public static void b(List<n<?>> list) {
        Set<u> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<n<?>> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                for (Set<u> set2 : hashMap.values()) {
                    for (u uVar : set2) {
                        for (e.d.d.l.w wVar : uVar.a.f7107b) {
                            if ((wVar.f7129c == 0) && (set = (Set) hashMap.get(new v(wVar.a, wVar.c(), null))) != null) {
                                for (u uVar2 : set) {
                                    uVar.f7125b.add(uVar2);
                                    uVar2.f7126c.add(uVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set3 : hashMap.values()) {
                    hashSet.addAll(set3);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    u uVar3 = (u) it2.next();
                    if (uVar3.a()) {
                        hashSet2.add(uVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    u uVar4 = (u) hashSet2.iterator().next();
                    hashSet2.remove(uVar4);
                    i2++;
                    for (u uVar5 : uVar4.f7125b) {
                        uVar5.f7126c.remove(uVar4);
                        if (uVar5.a()) {
                            hashSet2.add(uVar5);
                        }
                    }
                }
                if (i2 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    u uVar6 = (u) it3.next();
                    if (!uVar6.a() && !uVar6.f7125b.isEmpty()) {
                        arrayList.add(uVar6.a);
                    }
                }
                throw new x(arrayList);
            }
            n<?> next = it.next();
            u uVar7 = new u(next);
            for (Class<? super Object> cls : next.a) {
                boolean z = !next.g();
                v vVar = new v(cls, z, null);
                if (!hashMap.containsKey(vVar)) {
                    hashMap.put(vVar, new HashSet());
                }
                Set set4 = (Set) hashMap.get(vVar);
                if (!set4.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set4.add(uVar7);
            }
        }
    }

    public static n0<String> c() {
        String r = r("ak", "");
        if (r.length() > 0) {
            m().q("ak");
            E("ak", r);
        } else {
            r = r("ak", "");
        }
        n0<String> n0Var = new n0<>();
        if (r.length() > 0) {
            try {
                l.a.a.a aVar = (l.a.a.a) new l.a.a.e.b().e(r);
                for (int i2 = 0; i2 < aVar.size(); i2++) {
                    Object obj = aVar.get(i2);
                    String obj2 = obj instanceof String ? (String) obj : obj.toString();
                    n0Var.put(obj2, obj2);
                }
            } catch (l.a.a.e.c e2) {
                s1.l(e2, true);
                E("ak", "");
            }
        }
        return n0Var;
    }

    public static boolean d(String str, boolean z) {
        return m().d(str, z);
    }

    public static int e() {
        return h("ap", Level.TRACE_INT);
    }

    public static boolean f() {
        return d("aq", false);
    }

    public static k g() {
        return k.a.a();
    }

    public static int h(String str, int i2) {
        return m().e(str, i2);
    }

    public static boolean i() {
        return d("aa", false);
    }

    public static boolean j() {
        return d("ab", false);
    }

    public static float k() {
        return Float.parseFloat(r("al", "1.0"));
    }

    public static l0 l() {
        return l0.i(x0.f8405d, "tmp");
    }

    public static l0 m() {
        if (a == null) {
            a = l0.i(x0.f8405d, "Music");
        }
        return a;
    }

    public static boolean n() {
        return d("ai", false);
    }

    public static int o() {
        return h("repeatmode", 0);
    }

    public static Uri p() {
        String h2 = g7.h("ah", "");
        if (h2 != null && h2.length() > 0) {
            D("ah", h2);
            g7.f().q("ah");
        }
        String k2 = l().k("ah", "");
        if (k2.length() > 0) {
            return Uri.parse(k2);
        }
        L(false);
        return null;
    }

    public static int q() {
        return h("shufflemode", 0);
    }

    public static String r(String str, String str2) {
        return m().k(str, str2);
    }

    public static boolean s() {
        return d("af", false);
    }

    public static boolean t() {
        return d("ag", false);
    }

    public static boolean u() {
        return d("ah", false);
    }

    public static boolean v() {
        return l().d("ai", false);
    }

    public static boolean w() {
        return d("aj", false);
    }

    public static boolean x() {
        return g().e();
    }

    public static void y() {
        g().f();
    }

    public static boolean z(Activity activity) {
        int ordinal;
        k a2 = k.a.a();
        j.e(activity, "activity");
        e.j.d.b0.c.g gVar = a2.f8817n;
        boolean z = true;
        if (!((Boolean) gVar.f8580b.f(e.j.d.y.b.u)).booleanValue() || (ordinal = ((g.b) gVar.f8580b.e(e.j.d.y.b.o)).ordinal()) == 0) {
            z = false;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new h.e();
            }
            z = j.a(gVar.f8581c.b("rate_intent", ""), "positive");
        }
        if (z) {
            a2.f8817n.c(activity, new s(activity, a2));
            return false;
        }
        return a2.f8815l.g(activity);
    }
}
