package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.g9.c;
import com.amazon.aps.iva.g9.d;
import com.amazon.aps.iva.g9.e;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.x.b;
import com.amazon.aps.iva.x.f;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h<d> implements e {
    public final g a;
    public final FragmentManager b;
    public final f<Fragment> c;
    public final f<Fragment.m> d;
    public final f<Integer> e;
    public b f;
    public boolean g;
    public boolean h;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.j {
        public a(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public androidx.viewpager2.adapter.a a;
        public androidx.viewpager2.adapter.b b;
        public j c;
        public ViewPager2 d;
        public long e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z) {
            boolean z2;
            int currentItem;
            boolean z3;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.b.L() || this.d.getScrollState() != 0) {
                return;
            }
            f<Fragment> fVar = fragmentStateAdapter.c;
            if (fVar.h() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || fragmentStateAdapter.getItemCount() == 0 || (currentItem = this.d.getCurrentItem()) >= fragmentStateAdapter.getItemCount()) {
                return;
            }
            long j = currentItem;
            if (j == this.e && !z) {
                return;
            }
            Fragment fragment = null;
            Fragment fragment2 = (Fragment) fVar.d(j, null);
            if (fragment2 != null && fragment2.isAdded()) {
                this.e = j;
                FragmentManager fragmentManager = fragmentStateAdapter.b;
                androidx.fragment.app.a a = defpackage.b.a(fragmentManager, fragmentManager);
                for (int i = 0; i < fVar.h(); i++) {
                    long e = fVar.e(i);
                    Fragment i2 = fVar.i(i);
                    if (i2.isAdded()) {
                        if (e != this.e) {
                            a.n(i2, g.b.STARTED);
                        } else {
                            fragment = i2;
                        }
                        if (e == this.e) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i2.setMenuVisibility(z3);
                    }
                }
                if (fragment != null) {
                    a.n(fragment, g.b.RESUMED);
                }
                if (!a.c.isEmpty()) {
                    a.k();
                }
            }
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        g lifecycle = fragment.getLifecycle();
        this.c = new f<>();
        this.d = new f<>();
        this.e = new f<>();
        this.g = false;
        this.h = false;
        this.b = childFragmentManager;
        this.a = lifecycle;
        super.setHasStableIds(true);
    }

    public static void d(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // com.amazon.aps.iva.g9.e
    public final Bundle a() {
        f<Fragment> fVar = this.c;
        int h = fVar.h();
        f<Fragment.m> fVar2 = this.d;
        Bundle bundle = new Bundle(fVar2.h() + h);
        for (int i = 0; i < fVar.h(); i++) {
            long e = fVar.e(i);
            Fragment fragment = (Fragment) fVar.d(e, null);
            if (fragment != null && fragment.isAdded()) {
                this.b.S(bundle, j0.f("f#", e), fragment);
            }
        }
        for (int i2 = 0; i2 < fVar2.h(); i2++) {
            long e2 = fVar2.e(i2);
            if (e(e2)) {
                bundle.putParcelable(j0.f("s#", e2), (Parcelable) fVar2.d(e2, null));
            }
        }
        return bundle;
    }

    @Override // com.amazon.aps.iva.g9.e
    public final void c(Parcelable parcelable) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        f<Fragment.m> fVar = this.d;
        boolean z5 = false;
        if (fVar.h() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f<Fragment> fVar2 = this.c;
            if (fVar2.h() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long parseLong = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = this.b;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment A = fragmentManager.A(string);
                            if (A != null) {
                                fragment = A;
                            } else {
                                fragmentManager.g0(new IllegalStateException(com.amazon.aps.iva.c.b.a("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                        }
                        fVar2.f(parseLong, fragment);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            Fragment.m mVar = (Fragment.m) bundle.getParcelable(str);
                            if (e(parseLong2)) {
                                fVar.f(parseLong2, mVar);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (fVar2.h() == 0) {
                    z5 = true;
                }
                if (!z5) {
                    this.h = true;
                    this.g = true;
                    f();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.a.addObserver(new j() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.j
                        public final void U2(o oVar, g.a aVar) {
                            if (aVar == g.a.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                oVar.getLifecycle().removeObserver(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final boolean e(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    public final void f() {
        f<Fragment> fVar;
        f<Integer> fVar2;
        boolean z;
        Fragment fragment;
        View view;
        if (this.h && !this.b.L()) {
            com.amazon.aps.iva.x.b bVar = new com.amazon.aps.iva.x.b();
            int i = 0;
            while (true) {
                fVar = this.c;
                int h = fVar.h();
                fVar2 = this.e;
                if (i >= h) {
                    break;
                }
                long e = fVar.e(i);
                if (!e(e)) {
                    bVar.add(Long.valueOf(e));
                    fVar2.g(e);
                }
                i++;
            }
            if (!this.g) {
                this.h = false;
                for (int i2 = 0; i2 < fVar.h(); i2++) {
                    long e2 = fVar.e(i2);
                    if (fVar2.b) {
                        fVar2.c();
                    }
                    boolean z2 = true;
                    if (k0.f(fVar2.c, fVar2.e, e2) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && ((fragment = (Fragment) fVar.d(e2, null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        z2 = false;
                    }
                    if (!z2) {
                        bVar.add(Long.valueOf(e2));
                    }
                }
            }
            b.a aVar = new b.a();
            while (aVar.hasNext()) {
                i(((Long) aVar.next()).longValue());
            }
        }
    }

    public final Long g(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            f<Integer> fVar = this.e;
            if (i2 < fVar.h()) {
                if (fVar.i(i2).intValue() == i) {
                    if (l == null) {
                        l = Long.valueOf(fVar.e(i2));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i2++;
            } else {
                return l;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        return i;
    }

    public final void h(final d dVar) {
        Fragment fragment = (Fragment) this.c.d(dVar.getItemId(), null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) dVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = fragment.isAdded();
            FragmentManager fragmentManager = this.b;
            if (isAdded && view == null) {
                fragmentManager.n.a.add(new l.a(new com.amazon.aps.iva.g9.b(this, fragment, frameLayout), false));
                return;
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    d(view, frameLayout);
                    return;
                }
                return;
            } else if (fragment.isAdded()) {
                d(view, frameLayout);
                return;
            } else if (!fragmentManager.L()) {
                fragmentManager.n.a.add(new l.a(new com.amazon.aps.iva.g9.b(this, fragment, frameLayout), false));
                fragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.d(0, fragment, "f" + dVar.getItemId(), 1);
                aVar.n(fragment, g.b.STARTED);
                aVar.k();
                this.f.b(false);
                return;
            } else if (fragmentManager.I) {
                return;
            } else {
                this.a.addObserver(new j() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.j
                    public final void U2(o oVar, g.a aVar2) {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        if (fragmentStateAdapter.b.L()) {
                            return;
                        }
                        oVar.getLifecycle().removeObserver(this);
                        d dVar2 = dVar;
                        WeakHashMap<View, r0> weakHashMap = g0.a;
                        if (g0.g.b((FrameLayout) dVar2.itemView)) {
                            fragmentStateAdapter.h(dVar2);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void i(long j) {
        ViewParent parent;
        f<Fragment> fVar = this.c;
        Fragment fragment = (Fragment) fVar.d(j, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean e = e(j);
        f<Fragment.m> fVar2 = this.d;
        if (!e) {
            fVar2.g(j);
        }
        if (!fragment.isAdded()) {
            fVar.g(j);
            return;
        }
        FragmentManager fragmentManager = this.b;
        if (fragmentManager.L()) {
            this.h = true;
            return;
        }
        if (fragment.isAdded() && e(j)) {
            fVar2.f(j, fragmentManager.X(fragment));
        }
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.m(fragment);
        aVar.k();
        fVar.g(j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            final b bVar = new b();
            this.f = bVar;
            bVar.d = b.a(recyclerView);
            androidx.viewpager2.adapter.a aVar = new androidx.viewpager2.adapter.a(bVar);
            bVar.a = aVar;
            bVar.d.d.a.add(aVar);
            androidx.viewpager2.adapter.b bVar2 = new androidx.viewpager2.adapter.b(bVar);
            bVar.b = bVar2;
            registerAdapterDataObserver(bVar2);
            j jVar = new j() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar2) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.c = jVar;
            this.a.addObserver(jVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(d dVar, int i) {
        boolean z;
        d dVar2 = dVar;
        long itemId = dVar2.getItemId();
        int id = ((FrameLayout) dVar2.itemView).getId();
        Long g = g(id);
        f<Integer> fVar = this.e;
        if (g != null && g.longValue() != itemId) {
            i(g.longValue());
            fVar.g(g.longValue());
        }
        fVar.f(itemId, Integer.valueOf(id));
        long j = i;
        f<Fragment> fVar2 = this.c;
        if (fVar2.b) {
            fVar2.c();
        }
        if (k0.f(fVar2.c, fVar2.e, j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Fragment fragment = ((com.amazon.aps.iva.ry.a) this).i.p().get(i);
            fragment.setInitialSavedState((Fragment.m) this.d.d(j, null));
            fVar2.f(j, fragment);
        }
        FrameLayout frameLayout = (FrameLayout) dVar2.itemView;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new com.amazon.aps.iva.g9.a(this, frameLayout, dVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final d onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = d.b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, r0> weakHashMap = g0.a;
        frameLayout.setId(g0.e.a());
        frameLayout.setSaveEnabled(false);
        return new d(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f;
        bVar.getClass();
        ViewPager2 a2 = b.a(recyclerView);
        a2.d.a.remove(bVar.a);
        androidx.viewpager2.adapter.b bVar2 = bVar.b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.unregisterAdapterDataObserver(bVar2);
        fragmentStateAdapter.a.removeObserver(bVar.c);
        bVar.d = null;
        this.f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(d dVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(d dVar) {
        h(dVar);
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(d dVar) {
        Long g = g(((FrameLayout) dVar.itemView).getId());
        if (g != null) {
            i(g.longValue());
            this.e.g(g.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
