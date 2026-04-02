package c.m.b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class x {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f2412b;

    /* loaded from: classes.dex */
    public static final class a {
        public final FragmentManager.j a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2413b;

        public a(FragmentManager.j jVar, boolean z) {
            this.a = jVar;
            this.f2413b = z;
        }
    }

    public x(FragmentManager fragmentManager) {
        this.f2412b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f2412b;
        Context context = fragmentManager.p.f2408b;
        Fragment fragment2 = fragmentManager.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f2412b;
        Context context = fragmentManager.p.f2408b;
        Fragment fragment2 = fragmentManager.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                next.a.a(this.f2412b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                next.a.b(this.f2412b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2412b.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f412m.n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f2413b) {
                next.a.c(this.f2412b, fragment);
            }
        }
    }
}
