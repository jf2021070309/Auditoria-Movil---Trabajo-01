package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public final class l {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final FragmentManager.l a;
        public final boolean b;

        public a(FragmentManager.l lVar, boolean z) {
            this.a = lVar;
            this.b = z;
        }
    }

    public l(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public final void a(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(fragmentManager, fragment);
            }
        }
    }

    public final void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.v.c;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(fragmentManager, fragment, context);
            }
        }
    }

    public final void c(boolean z) {
        Fragment fragment = this.b.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.c(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public final void d(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(fragmentManager, fragment);
            }
        }
    }

    public final void e(boolean z) {
        Fragment fragment = this.b.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.e(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public final void f(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(fragmentManager, fragment);
            }
        }
    }

    public final void g(boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.v.c;
        Fragment fragment = fragmentManager.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.g(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public final void h(boolean z) {
        Fragment fragment = this.b.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.h(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public final void i(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(fragmentManager, fragment);
            }
        }
    }

    public final void j(boolean z) {
        Fragment fragment = this.b.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.j(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public final void k(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(fragmentManager, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(fragmentManager, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(boolean z) {
        Fragment fragment = this.b.x;
        if (fragment != null) {
            fragment.getParentFragmentManager().n.n(true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }
}
