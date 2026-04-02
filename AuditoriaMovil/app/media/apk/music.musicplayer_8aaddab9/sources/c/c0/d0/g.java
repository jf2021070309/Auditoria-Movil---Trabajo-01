package c.c0.d0;

import android.text.TextUtils;
import c.c0.a0;
import c.c0.r;
import c.c0.u;
import c.c0.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class g extends x {
    public static final String a = r.e("WorkContinuationImpl");

    /* renamed from: b  reason: collision with root package name */
    public final l f1350b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1351c;

    /* renamed from: d  reason: collision with root package name */
    public final c.c0.h f1352d;

    /* renamed from: e  reason: collision with root package name */
    public final List<? extends a0> f1353e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f1354f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1357i;

    /* renamed from: j  reason: collision with root package name */
    public u f1358j;

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f1356h = null;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f1355g = new ArrayList();

    public g(l lVar, String str, c.c0.h hVar, List<? extends a0> list, List<g> list2) {
        this.f1350b = lVar;
        this.f1351c = str;
        this.f1352d = hVar;
        this.f1353e = list;
        this.f1354f = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = list.get(i2).a();
            this.f1354f.add(a2);
            this.f1355g.add(a2);
        }
    }

    public static boolean b(g gVar, Set<String> set) {
        set.addAll(gVar.f1354f);
        Set<String> c2 = c(gVar);
        for (String str : set) {
            if (((HashSet) c2).contains(str)) {
                return true;
            }
        }
        List<g> list = gVar.f1356h;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                if (b(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f1354f);
        return false;
    }

    public static Set<String> c(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.f1356h;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.f1354f);
            }
        }
        return hashSet;
    }

    public u a() {
        if (this.f1357i) {
            r.c().f(a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f1354f)), new Throwable[0]);
        } else {
            c.c0.d0.t.e eVar = new c.c0.d0.t.e(this);
            ((c.c0.d0.t.t.b) this.f1350b.f1373g).a.execute(eVar);
            this.f1358j = eVar.f1539c;
        }
        return this.f1358j;
    }
}
