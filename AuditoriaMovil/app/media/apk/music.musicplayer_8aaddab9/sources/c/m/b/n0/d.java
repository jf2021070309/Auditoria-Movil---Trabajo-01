package c.m.b.n0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.m.b.n0.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {
    public static final d a = null;

    /* renamed from: b  reason: collision with root package name */
    public static c f2393b = c.a;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(n nVar);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c a = new c(h.l.g.a, null, h.l.f.a);

        /* renamed from: b  reason: collision with root package name */
        public final Set<a> f2394b;

        /* renamed from: c  reason: collision with root package name */
        public final b f2395c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<Class<? extends Fragment>, Set<Class<? extends n>>> f2396d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<Class<? extends Fragment>, ? extends Set<Class<? extends n>>> map) {
            h.o.c.j.e(set, "flags");
            h.o.c.j.e(map, "allowedViolations");
            this.f2394b = set;
            this.f2395c = null;
            this.f2396d = new LinkedHashMap();
        }
    }

    public static final c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                h.o.c.j.d(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f2393b;
    }

    public static final void b(final c cVar, final n nVar) {
        Fragment fragment = nVar.a;
        final String name = fragment.getClass().getName();
        if (cVar.f2394b.contains(a.PENALTY_LOG)) {
            h.o.c.j.i("Policy violation in ", name);
        }
        if (cVar.f2395c != null) {
            e(fragment, new Runnable() { // from class: c.m.b.n0.a
                @Override // java.lang.Runnable
                public final void run() {
                    d.c cVar2 = d.c.this;
                    n nVar2 = nVar;
                    h.o.c.j.e(cVar2, "$policy");
                    h.o.c.j.e(nVar2, "$violation");
                    cVar2.f2395c.a(nVar2);
                }
            });
        }
        if (cVar.f2394b.contains(a.PENALTY_DEATH)) {
            e(fragment, new Runnable() { // from class: c.m.b.n0.b
                @Override // java.lang.Runnable
                public final void run() {
                    String str = name;
                    n nVar2 = nVar;
                    h.o.c.j.e(nVar2, "$violation");
                    Log.e("FragmentStrictMode", h.o.c.j.i("Policy violation with PENALTY_DEATH in ", str), nVar2);
                    throw nVar2;
                }
            });
        }
    }

    public static final void c(n nVar) {
        if (FragmentManager.L(3)) {
            h.o.c.j.i("StrictMode violation in ", nVar.a.getClass().getName());
        }
    }

    public static final void d(Fragment fragment, String str) {
        h.o.c.j.e(fragment, "fragment");
        h.o.c.j.e(str, "previousFragmentId");
        c.m.b.n0.c cVar = new c.m.b.n0.c(fragment, str);
        c(cVar);
        c a2 = a(fragment);
        if (a2.f2394b.contains(a.DETECT_FRAGMENT_REUSE) && f(a2, fragment.getClass(), c.m.b.n0.c.class)) {
            b(a2, cVar);
        }
    }

    public static final void e(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().p.f2409c;
        h.o.c.j.d(handler, "fragment.parentFragmentManager.host.handler");
        if (h.o.c.j.a(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static final boolean f(c cVar, Class<? extends Fragment> cls, Class<? extends n> cls2) {
        Set<Class<? extends n>> set = cVar.f2396d.get(cls);
        if (set == null) {
            return true;
        }
        if (!h.o.c.j.a(cls2.getSuperclass(), n.class)) {
            Class<? super Object> superclass = cls2.getSuperclass();
            h.o.c.j.e(set, "<this>");
            if (set.contains(superclass)) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
