package c.m.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.i.g.a;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class k0 {
    public final ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f2376b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f2377c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2378d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2379e = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k0.this.f2376b.contains(this.a)) {
                c cVar = this.a;
                cVar.a.applyState(cVar.f2384c.mView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.f2376b.remove(this.a);
            k0.this.f2377c.remove(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final b0 f2382h;

        public c(d.c cVar, d.b bVar, b0 b0Var, c.i.g.a aVar) {
            super(cVar, bVar, b0Var.f2309c, aVar);
            this.f2382h = b0Var;
        }

        @Override // c.m.b.k0.d
        public void b() {
            super.b();
            this.f2382h.k();
        }

        @Override // c.m.b.k0.d
        public void d() {
            d.b bVar = this.f2383b;
            if (bVar != d.b.ADDING) {
                if (bVar == d.b.REMOVING) {
                    Fragment fragment = this.f2382h.f2309c;
                    View requireView = fragment.requireView();
                    if (FragmentManager.L(2)) {
                        StringBuilder y = e.a.d.a.a.y("Clearing focus ");
                        y.append(requireView.findFocus());
                        y.append(" on view ");
                        y.append(requireView);
                        y.append(" for Fragment ");
                        y.append(fragment);
                        y.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.f2382h.f2309c;
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (FragmentManager.L(2)) {
                    String str = "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2;
                }
            }
            View requireView2 = this.f2384c.requireView();
            if (requireView2.getParent() == null) {
                this.f2382h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public c a;

        /* renamed from: b  reason: collision with root package name */
        public b f2383b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f2384c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f2385d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<c.i.g.a> f2386e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2387f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2388g = false;

        /* loaded from: classes.dex */
        public class a implements a.InterfaceC0036a {
            public a() {
            }

            @Override // c.i.g.a.InterfaceC0036a
            public void a() {
                d.this.a();
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i2) {
                if (i2 != 0) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(e.a.d.a.a.e("Unknown visibility ", i2));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.L(2)) {
                            String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.L(2)) {
                        String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (FragmentManager.L(2)) {
                        String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
                    }
                    view.setVisibility(8);
                } else if (ordinal != 3) {
                } else {
                    if (FragmentManager.L(2)) {
                        String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                    }
                    view.setVisibility(4);
                }
            }
        }

        public d(c cVar, b bVar, Fragment fragment, c.i.g.a aVar) {
            this.a = cVar;
            this.f2383b = bVar;
            this.f2384c = fragment;
            aVar.b(new a());
        }

        public final void a() {
            if (this.f2387f) {
                return;
            }
            this.f2387f = true;
            if (this.f2386e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f2386e).iterator();
            while (it.hasNext()) {
                ((c.i.g.a) it.next()).a();
            }
        }

        public void b() {
            if (this.f2388g) {
                return;
            }
            if (FragmentManager.L(2)) {
                String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.f2388g = true;
            for (Runnable runnable : this.f2385d) {
                runnable.run();
            }
        }

        public final void c(c cVar, b bVar) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                if (this.a != c.REMOVED) {
                    if (FragmentManager.L(2)) {
                        StringBuilder y = e.a.d.a.a.y("SpecialEffectsController: For fragment ");
                        y.append(this.f2384c);
                        y.append(" mFinalState = ");
                        y.append(this.a);
                        y.append(" -> ");
                        y.append(cVar);
                        y.append(". ");
                        y.toString();
                    }
                    this.a = cVar;
                }
            } else if (ordinal == 1) {
                if (this.a == c.REMOVED) {
                    if (FragmentManager.L(2)) {
                        StringBuilder y2 = e.a.d.a.a.y("SpecialEffectsController: For fragment ");
                        y2.append(this.f2384c);
                        y2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        y2.append(this.f2383b);
                        y2.append(" to ADDING.");
                        y2.toString();
                    }
                    this.a = c.VISIBLE;
                    this.f2383b = b.ADDING;
                }
            } else if (ordinal != 2) {
            } else {
                if (FragmentManager.L(2)) {
                    StringBuilder y3 = e.a.d.a.a.y("SpecialEffectsController: For fragment ");
                    y3.append(this.f2384c);
                    y3.append(" mFinalState = ");
                    y3.append(this.a);
                    y3.append(" -> REMOVED. mLifecycleImpact  = ");
                    y3.append(this.f2383b);
                    y3.append(" to REMOVING.");
                    y3.toString();
                }
                this.a = c.REMOVED;
                this.f2383b = b.REMOVING;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder A = e.a.d.a.a.A("Operation ", "{");
            A.append(Integer.toHexString(System.identityHashCode(this)));
            A.append("} ");
            A.append("{");
            A.append("mFinalState = ");
            A.append(this.a);
            A.append("} ");
            A.append("{");
            A.append("mLifecycleImpact = ");
            A.append(this.f2383b);
            A.append("} ");
            A.append("{");
            A.append("mFragment = ");
            A.append(this.f2384c);
            A.append("}");
            return A.toString();
        }
    }

    public k0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static k0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.J());
    }

    public static k0 g(ViewGroup viewGroup, l0 l0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof k0) {
            return (k0) tag;
        }
        Objects.requireNonNull((FragmentManager.c) l0Var);
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public final void a(d.c cVar, d.b bVar, b0 b0Var) {
        synchronized (this.f2376b) {
            c.i.g.a aVar = new c.i.g.a();
            d d2 = d(b0Var.f2309c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, b0Var, aVar);
            this.f2376b.add(cVar2);
            cVar2.f2385d.add(new a(cVar2));
            cVar2.f2385d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z);

    public void c() {
        if (this.f2379e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (!d0.f.b(viewGroup)) {
            e();
            this.f2378d = false;
            return;
        }
        synchronized (this.f2376b) {
            if (!this.f2376b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2377c);
                this.f2377c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (FragmentManager.L(2)) {
                        String str = "SpecialEffectsController: Cancelling operation " + dVar;
                    }
                    dVar.a();
                    if (!dVar.f2388g) {
                        this.f2377c.add(dVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f2376b);
                this.f2376b.clear();
                this.f2377c.addAll(arrayList2);
                FragmentManager.L(2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).d();
                }
                b(arrayList2, this.f2378d);
                this.f2378d = false;
                FragmentManager.L(2);
            }
        }
    }

    public final d d(Fragment fragment) {
        Iterator<d> it = this.f2376b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f2384c.equals(fragment) && !next.f2387f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        FragmentManager.L(2);
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        boolean b2 = d0.f.b(viewGroup);
        synchronized (this.f2376b) {
            i();
            Iterator<d> it = this.f2376b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f2377c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (FragmentManager.L(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b2) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    sb.toString();
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.f2376b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (FragmentManager.L(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b2) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    sb2.toString();
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f2376b) {
            i();
            this.f2379e = false;
            int size = this.f2376b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.f2376b.get(size);
                d.c from = d.c.from(dVar.f2384c.mView);
                d.c cVar = dVar.a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && from != cVar2) {
                    this.f2379e = dVar.f2384c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.f2376b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f2383b == d.b.ADDING) {
                next.c(d.c.from(next.f2384c.requireView().getVisibility()), d.b.NONE);
            }
        }
    }
}
