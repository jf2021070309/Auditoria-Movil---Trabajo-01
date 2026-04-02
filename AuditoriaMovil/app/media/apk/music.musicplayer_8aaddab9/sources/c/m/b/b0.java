package c.m.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import c.i.k.d0;
import c.m.b.k0;
import c.m.b.n0.d;
import c.p.j;
import c.p.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class b0 {
    public final x a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f2308b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f2309c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2310d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2311e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public a(b0 b0Var, View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            c.i.k.d0.y(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public b0(x xVar, c0 c0Var, Fragment fragment) {
        this.a = xVar;
        this.f2308b = c0Var;
        this.f2309c = fragment;
    }

    public b0(x xVar, c0 c0Var, Fragment fragment, FragmentState fragmentState) {
        this.a = xVar;
        this.f2308b = c0Var;
        this.f2309c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f440m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    public b0(x xVar, c0 c0Var, ClassLoader classLoader, u uVar, FragmentState fragmentState) {
        this.a = xVar;
        this.f2308b = c0Var;
        Fragment a2 = uVar.a(classLoader, fragmentState.a);
        Bundle bundle = fragmentState.f437j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(fragmentState.f437j);
        a2.mWho = fragmentState.f429b;
        a2.mFromLayout = fragmentState.f430c;
        a2.mRestored = true;
        a2.mFragmentId = fragmentState.f431d;
        a2.mContainerId = fragmentState.f432e;
        a2.mTag = fragmentState.f433f;
        a2.mRetainInstance = fragmentState.f434g;
        a2.mRemoving = fragmentState.f435h;
        a2.mDetached = fragmentState.f436i;
        a2.mHidden = fragmentState.f438k;
        a2.mMaxState = j.b.values()[fragmentState.f439l];
        Bundle bundle2 = fragmentState.f440m;
        if (bundle2 != null) {
            a2.mSavedFragmentState = bundle2;
        } else {
            a2.mSavedFragmentState = new Bundle();
        }
        this.f2309c = a2;
        if (FragmentManager.L(2)) {
            String str = "Instantiated fragment " + a2;
        }
    }

    public void a() {
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("moveto ACTIVITY_CREATED: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        x xVar = this.a;
        Fragment fragment2 = this.f2309c;
        xVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        View view;
        View view2;
        c0 c0Var = this.f2308b;
        Fragment fragment = this.f2309c;
        Objects.requireNonNull(c0Var);
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = c0Var.a.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= c0Var.a.size()) {
                            break;
                        }
                        Fragment fragment2 = c0Var.a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = c0Var.a.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        Fragment fragment4 = this.f2309c;
        fragment4.mContainer.addView(fragment4.mView, i2);
    }

    public void c() {
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("moveto ATTACHED: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        Fragment fragment2 = fragment.mTarget;
        b0 b0Var = null;
        if (fragment2 != null) {
            b0 g2 = this.f2308b.g(fragment2.mWho);
            if (g2 == null) {
                StringBuilder y2 = e.a.d.a.a.y("Fragment ");
                y2.append(this.f2309c);
                y2.append(" declared target fragment ");
                y2.append(this.f2309c.mTarget);
                y2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(y2.toString());
            }
            Fragment fragment3 = this.f2309c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            b0Var = g2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (b0Var = this.f2308b.g(str)) == null) {
                StringBuilder y3 = e.a.d.a.a.y("Fragment ");
                y3.append(this.f2309c);
                y3.append(" declared target fragment ");
                throw new IllegalStateException(e.a.d.a.a.r(y3, this.f2309c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (b0Var != null) {
            b0Var.k();
        }
        Fragment fragment4 = this.f2309c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.p;
        fragment4.mParentFragment = fragmentManager.r;
        this.a.g(fragment4, false);
        this.f2309c.performAttach();
        this.a.b(this.f2309c, false);
    }

    public int d() {
        Fragment fragment = this.f2309c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.f2311e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        Fragment fragment2 = this.f2309c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i2 = Math.max(this.f2311e, 2);
                View view = this.f2309c.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f2311e < 4 ? Math.min(i2, fragment2.mState) : Math.min(i2, 1);
            }
        }
        if (!this.f2309c.mAdded) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.f2309c;
        ViewGroup viewGroup = fragment3.mContainer;
        k0.d.b bVar = null;
        k0.d dVar = null;
        if (viewGroup != null) {
            k0 f2 = k0.f(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(f2);
            k0.d d2 = f2.d(this.f2309c);
            k0.d.b bVar2 = d2 != null ? d2.f2383b : null;
            Fragment fragment4 = this.f2309c;
            Iterator<k0.d> it = f2.f2377c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k0.d next = it.next();
                if (next.f2384c.equals(fragment4) && !next.f2387f) {
                    dVar = next;
                    break;
                }
            }
            bVar = (dVar == null || !(bVar2 == null || bVar2 == k0.d.b.NONE)) ? bVar2 : dVar.f2383b;
        }
        if (bVar == k0.d.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar == k0.d.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment5 = this.f2309c;
            if (fragment5.mRemoving) {
                i2 = fragment5.isInBackStack() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment6 = this.f2309c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.L(2)) {
            StringBuilder z = e.a.d.a.a.z("computeExpectedState() of ", i2, " for ");
            z.append(this.f2309c);
            z.toString();
        }
        return i2;
    }

    public void e() {
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("moveto CREATED: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f2309c.mState = 1;
            return;
        }
        this.a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f2309c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        x xVar = this.a;
        Fragment fragment3 = this.f2309c;
        xVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String str;
        if (this.f2309c.mFromLayout) {
            return;
        }
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("moveto CREATE_VIEW: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f2309c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    StringBuilder y2 = e.a.d.a.a.y("Cannot create fragment ");
                    y2.append(this.f2309c);
                    y2.append(" for a container view with no id");
                    throw new IllegalArgumentException(y2.toString());
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.q.b(i2);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2309c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f2309c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder y3 = e.a.d.a.a.y("No view found for id 0x");
                        y3.append(Integer.toHexString(this.f2309c.mContainerId));
                        y3.append(" (");
                        y3.append(str);
                        y3.append(") for fragment ");
                        y3.append(this.f2309c);
                        throw new IllegalArgumentException(y3.toString());
                    }
                } else if (!(viewGroup instanceof s)) {
                    Fragment fragment4 = this.f2309c;
                    c.m.b.n0.d dVar = c.m.b.n0.d.a;
                    h.o.c.j.e(fragment4, "fragment");
                    h.o.c.j.e(viewGroup, "container");
                    c.m.b.n0.o oVar = new c.m.b.n0.o(fragment4, viewGroup);
                    c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
                    c.m.b.n0.d.c(oVar);
                    d.c a2 = c.m.b.n0.d.a(fragment4);
                    if (a2.f2394b.contains(d.a.DETECT_WRONG_FRAGMENT_CONTAINER) && c.m.b.n0.d.f(a2, fragment4.getClass(), c.m.b.n0.o.class)) {
                        c.m.b.n0.d.b(a2, oVar);
                    }
                }
            }
        }
        Fragment fragment5 = this.f2309c;
        fragment5.mContainer = viewGroup;
        fragment5.performCreateView(performGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
        View view = this.f2309c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment6 = this.f2309c;
            fragment6.mView.setTag(R.id.fragment_container_view_tag, fragment6);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment7 = this.f2309c;
            if (fragment7.mHidden) {
                fragment7.mView.setVisibility(8);
            }
            View view2 = this.f2309c.mView;
            AtomicInteger atomicInteger = c.i.k.d0.a;
            if (d0.f.b(view2)) {
                c.i.k.d0.y(this.f2309c.mView);
            } else {
                View view3 = this.f2309c.mView;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            this.f2309c.performViewCreated();
            x xVar = this.a;
            Fragment fragment8 = this.f2309c;
            xVar.m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
            int visibility = this.f2309c.mView.getVisibility();
            this.f2309c.setPostOnViewCreatedAlpha(this.f2309c.mView.getAlpha());
            Fragment fragment9 = this.f2309c;
            if (fragment9.mContainer != null && visibility == 0) {
                View findFocus = fragment9.mView.findFocus();
                if (findFocus != null) {
                    this.f2309c.setFocusedView(findFocus);
                    if (FragmentManager.L(2)) {
                        String str2 = "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2309c;
                    }
                }
                this.f2309c.mView.setAlpha(0.0f);
            }
        }
        this.f2309c.mState = 2;
    }

    public void g() {
        Fragment c2;
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("movefrom CREATED: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f2309c;
            if (!fragment2.mBeingSaved) {
                this.f2308b.l(fragment2.mWho, null);
            }
        }
        if (!(z2 || this.f2308b.f2314d.g(this.f2309c))) {
            String str = this.f2309c.mTargetWho;
            if (str != null && (c2 = this.f2308b.c(str)) != null && c2.mRetainInstance) {
                this.f2309c.mTarget = c2;
            }
            this.f2309c.mState = 0;
            return;
        }
        v<?> vVar = this.f2309c.mHost;
        if (vVar instanceof n0) {
            z = this.f2308b.f2314d.f2419h;
        } else {
            Context context = vVar.f2408b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z2 && !this.f2309c.mBeingSaved) || z) {
            this.f2308b.f2314d.d(this.f2309c);
        }
        this.f2309c.performDestroy();
        this.a.d(this.f2309c, false);
        Iterator it = ((ArrayList) this.f2308b.e()).iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var != null) {
                Fragment fragment3 = b0Var.f2309c;
                if (this.f2309c.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.f2309c;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.f2309c;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.f2308b.c(str2);
        }
        this.f2308b.j(this);
    }

    public void h() {
        View view;
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("movefrom CREATE_VIEW: ");
            y.append(this.f2309c);
            y.toString();
        }
        Fragment fragment = this.f2309c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f2309c.performDestroyView();
        this.a.n(this.f2309c, false);
        Fragment fragment2 = this.f2309c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.h(null);
        this.f2309c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("movefrom ATTACHED: ");
            y.append(this.f2309c);
            y.toString();
        }
        this.f2309c.performDetach();
        boolean z = false;
        this.a.e(this.f2309c, false);
        Fragment fragment = this.f2309c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f2308b.f2314d.g(this.f2309c)) {
            if (FragmentManager.L(3)) {
                StringBuilder y2 = e.a.d.a.a.y("initState called for fragment: ");
                y2.append(this.f2309c);
                y2.toString();
            }
            this.f2309c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f2309c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.L(3)) {
                StringBuilder y = e.a.d.a.a.y("moveto CREATE_VIEW: ");
                y.append(this.f2309c);
                y.toString();
            }
            Fragment fragment2 = this.f2309c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f2309c.mSavedFragmentState);
            View view = this.f2309c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2309c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2309c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f2309c.performViewCreated();
                x xVar = this.a;
                Fragment fragment5 = this.f2309c;
                xVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f2309c.mState = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2310d) {
            if (FragmentManager.L(2)) {
                StringBuilder y = e.a.d.a.a.y("Ignoring re-entrant call to moveToExpectedState() for ");
                y.append(this.f2309c);
                y.toString();
                return;
            }
            return;
        }
        try {
            this.f2310d = true;
            boolean z = false;
            while (true) {
                int d2 = d();
                Fragment fragment = this.f2309c;
                int i2 = fragment.mState;
                if (d2 == i2) {
                    if (!z && i2 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f2309c.mBeingSaved) {
                        if (FragmentManager.L(3)) {
                            String str = "Cleaning up state of never attached fragment: " + this.f2309c;
                        }
                        this.f2308b.f2314d.d(this.f2309c);
                        this.f2308b.j(this);
                        if (FragmentManager.L(3)) {
                            String str2 = "initState called for fragment: " + this.f2309c;
                        }
                        this.f2309c.initState();
                    }
                    Fragment fragment2 = this.f2309c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            k0 f2 = k0.f(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f2309c.mHidden) {
                                Objects.requireNonNull(f2);
                                if (FragmentManager.L(2)) {
                                    String str3 = "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f2309c;
                                }
                                f2.a(k0.d.c.GONE, k0.d.b.NONE, this);
                            } else {
                                Objects.requireNonNull(f2);
                                if (FragmentManager.L(2)) {
                                    String str4 = "SpecialEffectsController: Enqueuing show operation for fragment " + this.f2309c;
                                }
                                f2.a(k0.d.c.VISIBLE, k0.d.b.NONE, this);
                            }
                        }
                        Fragment fragment3 = this.f2309c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            Objects.requireNonNull(fragmentManager);
                            if (fragment3.mAdded && fragmentManager.M(fragment3)) {
                                fragmentManager.z = true;
                            }
                        }
                        Fragment fragment4 = this.f2309c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f2309c.mChildFragmentManager.o();
                    }
                    return;
                }
                if (d2 > i2) {
                    switch (i2 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                k0 f3 = k0.f(viewGroup3, fragment.getParentFragmentManager());
                                k0.d.c from = k0.d.c.from(this.f2309c.mView.getVisibility());
                                Objects.requireNonNull(f3);
                                if (FragmentManager.L(2)) {
                                    String str5 = "SpecialEffectsController: Enqueuing add operation for fragment " + this.f2309c;
                                }
                                f3.a(from, k0.d.b.ADDING, this);
                            }
                            this.f2309c.mState = 4;
                            continue;
                        case 5:
                            if (FragmentManager.L(3)) {
                                String str6 = "moveto STARTED: " + this.f2309c;
                            }
                            this.f2309c.performStart();
                            this.a.k(this.f2309c, false);
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            m();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (this.f2308b.f2313c.get(fragment.mWho) == null) {
                                    n();
                                }
                            }
                            g();
                            continue;
                        case 1:
                            h();
                            this.f2309c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.L(3)) {
                                String str7 = "movefrom ACTIVITY_CREATED: " + this.f2309c;
                            }
                            Fragment fragment5 = this.f2309c;
                            if (fragment5.mBeingSaved) {
                                n();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                o();
                            }
                            Fragment fragment6 = this.f2309c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                k0 f4 = k0.f(viewGroup2, fragment6.getParentFragmentManager());
                                Objects.requireNonNull(f4);
                                if (FragmentManager.L(2)) {
                                    String str8 = "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f2309c;
                                }
                                f4.a(k0.d.c.REMOVED, k0.d.b.REMOVING, this);
                            }
                            this.f2309c.mState = 3;
                            continue;
                        case 4:
                            if (FragmentManager.L(3)) {
                                String str9 = "movefrom STARTED: " + this.f2309c;
                            }
                            this.f2309c.performStop();
                            this.a.l(this.f2309c, false);
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            if (FragmentManager.L(3)) {
                                String str10 = "movefrom RESUMED: " + this.f2309c;
                            }
                            this.f2309c.performPause();
                            this.a.f(this.f2309c, false);
                            continue;
                        default:
                            continue;
                    }
                }
                z = true;
            }
        } finally {
            this.f2310d = false;
        }
    }

    public void l(ClassLoader classLoader) {
        Bundle bundle = this.f2309c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2309c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2309c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2309c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f2309c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2309c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f2309c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2309c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void m() {
        if (FragmentManager.L(3)) {
            StringBuilder y = e.a.d.a.a.y("moveto RESUMED: ");
            y.append(this.f2309c);
            y.toString();
        }
        View focusedView = this.f2309c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f2309c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f2309c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (FragmentManager.L(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f2309c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f2309c.mView.findFocus());
                    sb.toString();
                }
            }
        }
        this.f2309c.setFocusedView(null);
        this.f2309c.performResume();
        this.a.i(this.f2309c, false);
        Fragment fragment = this.f2309c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void n() {
        FragmentState fragmentState = new FragmentState(this.f2309c);
        Fragment fragment = this.f2309c;
        if (fragment.mState <= -1 || fragmentState.f440m != null) {
            fragmentState.f440m = fragment.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            this.f2309c.performSaveInstanceState(bundle);
            this.a.j(this.f2309c, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f2309c.mView != null) {
                o();
            }
            if (this.f2309c.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f2309c.mSavedViewState);
            }
            if (this.f2309c.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f2309c.mSavedViewRegistryState);
            }
            if (!this.f2309c.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f2309c.mUserVisibleHint);
            }
            fragmentState.f440m = bundle;
            if (this.f2309c.mTargetWho != null) {
                if (bundle == null) {
                    fragmentState.f440m = new Bundle();
                }
                fragmentState.f440m.putString("android:target_state", this.f2309c.mTargetWho);
                int i2 = this.f2309c.mTargetRequestCode;
                if (i2 != 0) {
                    fragmentState.f440m.putInt("android:target_req_state", i2);
                }
            }
        }
        this.f2308b.l(this.f2309c.mWho, fragmentState);
    }

    public void o() {
        if (this.f2309c.mView == null) {
            return;
        }
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Saving view state for fragment ");
            y.append(this.f2309c);
            y.append(" with view ");
            y.append(this.f2309c.mView);
            y.toString();
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2309c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2309c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2309c.mViewLifecycleOwner.f2369c.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2309c.mSavedViewRegistryState = bundle;
    }
}
