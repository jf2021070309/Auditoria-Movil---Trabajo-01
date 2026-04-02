package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.c0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class u {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public final p h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(androidx.fragment.app.u.b.EnumC0029b r3, androidx.fragment.app.u.b.a r4, androidx.fragment.app.p r5, com.amazon.aps.iva.k3.f r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                com.amazon.aps.iva.yb0.j.f(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                com.amazon.aps.iva.yb0.j.f(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                com.amazon.aps.iva.yb0.j.f(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.c
                java.lang.String r1 = "fragmentStateManager.fragment"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.a.<init>(androidx.fragment.app.u$b$b, androidx.fragment.app.u$b$a, androidx.fragment.app.p, com.amazon.aps.iva.k3.f):void");
        }

        @Override // androidx.fragment.app.u.b
        public final void b() {
            super.b();
            this.h.i();
        }

        @Override // androidx.fragment.app.u.b
        public final void d() {
            boolean z;
            b.a aVar = this.b;
            b.a aVar2 = b.a.ADDING;
            p pVar = this.h;
            if (aVar == aVar2) {
                Fragment fragment = pVar.c;
                com.amazon.aps.iva.yb0.j.e(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.H(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View requireView = this.c.requireView();
                com.amazon.aps.iva.yb0.j.e(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    pVar.a();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            } else if (aVar == b.a.REMOVING) {
                Fragment fragment2 = pVar.c;
                com.amazon.aps.iva.yb0.j.e(fragment2, "fragmentStateManager.fragment");
                View requireView2 = fragment2.requireView();
                com.amazon.aps.iva.yb0.j.e(requireView2, "fragment.requireView()");
                if (FragmentManager.H(2)) {
                    Objects.toString(requireView2.findFocus());
                    requireView2.toString();
                    fragment2.toString();
                }
                requireView2.clearFocus();
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public u(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final u f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "container");
        com.amazon.aps.iva.yb0.j.f(fragmentManager, "fragmentManager");
        com.amazon.aps.iva.yb0.j.e(fragmentManager.G(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof u) {
            return (u) tag;
        }
        d dVar = new d(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dVar);
        return dVar;
    }

    public final void a(b.EnumC0029b enumC0029b, b.a aVar, p pVar) {
        synchronized (this.b) {
            com.amazon.aps.iva.k3.f fVar = new com.amazon.aps.iva.k3.f();
            Fragment fragment = pVar.c;
            com.amazon.aps.iva.yb0.j.e(fragment, "fragmentStateManager.fragment");
            b d = d(fragment);
            if (d != null) {
                d.c(enumC0029b, aVar);
                return;
            }
            a aVar2 = new a(enumC0029b, aVar, pVar, fVar);
            this.b.add(aVar2);
            aVar2.d.add(new t(0, this, aVar2));
            aVar2.d.add(new com.amazon.aps.iva.n4.d(1, this, aVar2));
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (!g0.g.b(viewGroup)) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList Z0 = x.Z0(this.c);
                this.c.clear();
                Iterator it = Z0.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (FragmentManager.H(2)) {
                        Objects.toString(bVar);
                    }
                    bVar.a();
                    if (!bVar.g) {
                        this.c.add(bVar);
                    }
                }
                h();
                ArrayList Z02 = x.Z0(this.b);
                this.b.clear();
                this.c.addAll(Z02);
                FragmentManager.H(2);
                Iterator it2 = Z02.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d();
                }
                b(Z02, this.d);
                this.d = false;
                FragmentManager.H(2);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final b d(Fragment fragment) {
        Object obj;
        boolean z;
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                b bVar = (b) obj;
                if (com.amazon.aps.iva.yb0.j.a(bVar.c, fragment) && !bVar.f) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b) obj;
    }

    public final void e() {
        FragmentManager.H(2);
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        boolean b2 = g0.g.b(viewGroup);
        synchronized (this.b) {
            h();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((b) it.next()).d();
            }
            Iterator it2 = x.Z0(this.c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (FragmentManager.H(2)) {
                    if (!b2) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(bVar);
                }
                bVar.a();
            }
            Iterator it3 = x.Z0(this.b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (FragmentManager.H(2)) {
                    if (!b2) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(bVar2);
                }
                bVar2.a();
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final void g() {
        boolean z;
        Fragment fragment;
        Object obj;
        boolean z2;
        synchronized (this.b) {
            h();
            ArrayList arrayList = this.b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                z = false;
                fragment = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    b bVar = (b) obj;
                    b.EnumC0029b.a aVar = b.EnumC0029b.Companion;
                    View view = bVar.c.mView;
                    com.amazon.aps.iva.yb0.j.e(view, "operation.fragment.mView");
                    aVar.getClass();
                    b.EnumC0029b a2 = b.EnumC0029b.a.a(view);
                    b.EnumC0029b enumC0029b = bVar.a;
                    b.EnumC0029b enumC0029b2 = b.EnumC0029b.VISIBLE;
                    if (enumC0029b == enumC0029b2 && a2 != enumC0029b2) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                fragment = bVar2.c;
            }
            if (fragment != null) {
                z = fragment.isPostponed();
            }
            this.e = z;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b == b.a.ADDING) {
                View requireView = bVar.c.requireView();
                com.amazon.aps.iva.yb0.j.e(requireView, "fragment.requireView()");
                b.EnumC0029b.a aVar = b.EnumC0029b.Companion;
                int visibility = requireView.getVisibility();
                aVar.getClass();
                bVar.c(b.EnumC0029b.a.b(visibility), b.a.NONE);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class b {
        public EnumC0029b a;
        public a b;
        public final Fragment c;
        public final ArrayList d;
        public final LinkedHashSet e;
        public boolean f;
        public boolean g;

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.u$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0029b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            public static final a Companion = new a();

            /* compiled from: SpecialEffectsController.kt */
            /* renamed from: androidx.fragment.app.u$b$b$a */
            /* loaded from: classes.dex */
            public static final class a {
                public static EnumC0029b a(View view) {
                    boolean z;
                    if (view.getAlpha() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && view.getVisibility() == 0) {
                        return EnumC0029b.INVISIBLE;
                    }
                    return b(view.getVisibility());
                }

                public static EnumC0029b b(int i) {
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 8) {
                                return EnumC0029b.GONE;
                            }
                            throw new IllegalArgumentException(c0.a("Unknown visibility ", i));
                        }
                        return EnumC0029b.INVISIBLE;
                    }
                    return EnumC0029b.VISIBLE;
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            /* renamed from: androidx.fragment.app.u$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0030b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnumC0029b.values().length];
                    try {
                        iArr[EnumC0029b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC0029b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC0029b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC0029b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final EnumC0029b from(int i) {
                Companion.getClass();
                return a.b(i);
            }

            public final void applyState(View view) {
                ViewGroup viewGroup;
                com.amazon.aps.iva.yb0.j.f(view, "view");
                int i = C0030b.a[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.H(2)) {
                                    view.toString();
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.H(2)) {
                            view.toString();
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.H(2)) {
                        view.toString();
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.H(2)) {
                        view.toString();
                        viewGroup.toString();
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public b(EnumC0029b enumC0029b, a aVar, Fragment fragment, com.amazon.aps.iva.k3.f fVar) {
            com.amazon.aps.iva.yb0.j.f(enumC0029b, "finalState");
            com.amazon.aps.iva.yb0.j.f(aVar, "lifecycleImpact");
            this.a = enumC0029b;
            this.b = aVar;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            fVar.b(new f0(this, 0));
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            for (com.amazon.aps.iva.k3.f fVar : x.b1(linkedHashSet)) {
                fVar.a();
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (FragmentManager.H(2)) {
                toString();
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void c(EnumC0029b enumC0029b, a aVar) {
            com.amazon.aps.iva.yb0.j.f(enumC0029b, "finalState");
            com.amazon.aps.iva.yb0.j.f(aVar, "lifecycleImpact");
            int i = c.a[aVar.ordinal()];
            Fragment fragment = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.a != EnumC0029b.REMOVED) {
                        if (FragmentManager.H(2)) {
                            Objects.toString(fragment);
                            Objects.toString(this.a);
                            enumC0029b.toString();
                        }
                        this.a = enumC0029b;
                        return;
                    }
                    return;
                }
                if (FragmentManager.H(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.a);
                    Objects.toString(this.b);
                }
                this.a = EnumC0029b.REMOVED;
                this.b = a.REMOVING;
            } else if (this.a == EnumC0029b.REMOVED) {
                if (FragmentManager.H(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.b);
                }
                this.a = EnumC0029b.VISIBLE;
                this.b = a.ADDING;
            }
        }

        public final String toString() {
            StringBuilder c2 = com.amazon.aps.iva.k.q.c("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            c2.append(this.a);
            c2.append(" lifecycleImpact = ");
            c2.append(this.b);
            c2.append(" fragment = ");
            c2.append(this.c);
            c2.append('}');
            return c2.toString();
        }

        public void d() {
        }
    }
}
