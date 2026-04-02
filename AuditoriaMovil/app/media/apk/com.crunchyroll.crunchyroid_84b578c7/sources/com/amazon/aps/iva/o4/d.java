package com.amazon.aps.iva.o4;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.x;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class d {
    public static final b a = b.c;

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b c = new b();
        public final Set<a> a = b0.b;
        public final LinkedHashMap b = new LinkedHashMap();
    }

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                com.amazon.aps.iva.yb0.j.e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(b bVar, m mVar) {
        Fragment fragment = mVar.b;
        String name = fragment.getClass().getName();
        a aVar = a.PENALTY_LOG;
        Set<a> set = bVar.a;
        set.contains(aVar);
        if (set.contains(a.PENALTY_DEATH)) {
            c cVar = new c(0, name, mVar);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().v.d;
                com.amazon.aps.iva.yb0.j.e(handler, "fragment.parentFragmentManager.host.handler");
                if (com.amazon.aps.iva.yb0.j.a(handler.getLooper(), Looper.myLooper())) {
                    cVar.run();
                    return;
                } else {
                    handler.post(cVar);
                    return;
                }
            }
            cVar.run();
        }
    }

    public static void c(m mVar) {
        if (FragmentManager.H(3)) {
            mVar.b.getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.yb0.j.f(str, "previousFragmentId");
        com.amazon.aps.iva.o4.a aVar = new com.amazon.aps.iva.o4.a(fragment, str);
        c(aVar);
        b a2 = a(fragment);
        if (a2.a.contains(a.DETECT_FRAGMENT_REUSE) && e(a2, fragment.getClass(), com.amazon.aps.iva.o4.a.class)) {
            b(a2, aVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!com.amazon.aps.iva.yb0.j.a(cls2.getSuperclass(), m.class) && x.m0(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
