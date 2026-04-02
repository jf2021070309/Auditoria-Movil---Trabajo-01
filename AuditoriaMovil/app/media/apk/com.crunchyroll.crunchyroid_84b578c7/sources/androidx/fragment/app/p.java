package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.u;
import androidx.lifecycle.g;
import com.amazon.aps.iva.o4.d;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class p {
    public final l a;
    public final q b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            a = iArr;
            try {
                iArr[g.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public p(l lVar, q qVar, Fragment fragment) {
        this.a = lVar;
        this.b = qVar;
        this.c = fragment;
    }

    public final void a() {
        Fragment fragment;
        int i;
        View view;
        View view2;
        Fragment fragment2;
        Fragment fragment3 = this.c;
        View view3 = fragment3.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment2 = (Fragment) tag;
            } else {
                fragment2 = null;
            }
            if (fragment2 != null) {
                fragment = fragment2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        Fragment parentFragment = fragment3.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i2 = fragment3.mContainerId;
            d.b bVar = com.amazon.aps.iva.o4.d.a;
            com.amazon.aps.iva.o4.o oVar = new com.amazon.aps.iva.o4.o(fragment3, fragment, i2);
            com.amazon.aps.iva.o4.d.c(oVar);
            d.b a2 = com.amazon.aps.iva.o4.d.a(fragment3);
            if (a2.a.contains(d.a.DETECT_WRONG_NESTED_HIERARCHY) && com.amazon.aps.iva.o4.d.e(a2, fragment3.getClass(), com.amazon.aps.iva.o4.o.class)) {
                com.amazon.aps.iva.o4.d.b(a2, oVar);
            }
        }
        q qVar = this.b;
        qVar.getClass();
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = qVar.a;
            int indexOf = arrayList.indexOf(fragment3);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = arrayList.get(i3);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        i = -1;
        fragment3.mContainer.addView(fragment3.mView, i);
    }

    public final void b() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.c;
        if (H) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        p pVar = null;
        q qVar = this.b;
        if (fragment2 != null) {
            p pVar2 = qVar.b.get(fragment2.mWho);
            if (pVar2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                pVar = pVar2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (pVar = qVar.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(defpackage.b.c(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (pVar != null) {
            pVar.i();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.v;
        fragment.mParentFragment = fragmentManager.x;
        l lVar = this.a;
        lVar.g(false);
        fragment.performAttach();
        lVar.b(fragment, false);
    }

    public final int c() {
        u.b.a aVar;
        Object obj;
        int i;
        boolean z;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.e;
        int i3 = b.a[fragment.mMaxState.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        i2 = Math.min(i2, -1);
                    } else {
                        i2 = Math.min(i2, 0);
                    }
                } else {
                    i2 = Math.min(i2, 1);
                }
            } else {
                i2 = Math.min(i2, 5);
            }
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i2 = Math.max(this.e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.e < 4 ? Math.min(i2, fragment.mState) : Math.min(i2, 1);
            }
        }
        if (!fragment.mAdded) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        u.b.a aVar2 = null;
        if (viewGroup != null) {
            u f = u.f(viewGroup, fragment.getParentFragmentManager());
            f.getClass();
            u.b d = f.d(fragment);
            if (d != null) {
                aVar = d.b;
            } else {
                aVar = null;
            }
            Iterator it = f.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    u.b bVar = (u.b) obj;
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
            u.b bVar2 = (u.b) obj;
            if (bVar2 != null) {
                aVar2 = bVar2.b;
            }
            if (aVar == null) {
                i = -1;
            } else {
                i = u.c.a[aVar.ordinal()];
            }
            if (i != -1 && i != 1) {
                aVar2 = aVar;
            }
        }
        if (aVar2 == u.b.a.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (aVar2 == u.b.a.REMOVING) {
            i2 = Math.max(i2, 3);
        } else if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.H(2)) {
            Objects.toString(fragment);
        }
        return i2;
    }

    public final void d() {
        Bundle bundle;
        String str;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.H(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.w.r(i);
                    if (viewGroup == null) {
                        if (!fragment.mRestored) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        d.b bVar = com.amazon.aps.iva.o4.d.a;
                        com.amazon.aps.iva.o4.n nVar = new com.amazon.aps.iva.o4.n(fragment, viewGroup);
                        com.amazon.aps.iva.o4.d.c(nVar);
                        d.b a2 = com.amazon.aps.iva.o4.d.a(fragment);
                        if (a2.a.contains(d.a.DETECT_WRONG_FRAGMENT_CONTAINER) && com.amazon.aps.iva.o4.d.e(a2, fragment.getClass(), com.amazon.aps.iva.o4.n.class)) {
                            com.amazon.aps.iva.o4.d.b(a2, nVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(defpackage.c.a("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (fragment.mView != null) {
            if (FragmentManager.H(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(view)) {
                g0.h.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, bundle, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.H(2)) {
                        findFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r10 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.H(r0)
            androidx.fragment.app.Fragment r2 = r10.c
            if (r1 == 0) goto Lc
            java.util.Objects.toString(r2)
        Lc:
            boolean r1 = r2.mRemoving
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r2.isInBackStack()
            if (r1 != 0) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r4
        L1b:
            r5 = 0
            androidx.fragment.app.q r6 = r10.b
            if (r1 == 0) goto L29
            boolean r7 = r2.mBeingSaved
            if (r7 != 0) goto L29
            java.lang.String r7 = r2.mWho
            r6.i(r5, r7)
        L29:
            if (r1 != 0) goto L44
            androidx.fragment.app.n r7 = r6.d
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r8 = r7.b
            java.lang.String r9 = r2.mWho
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L39
        L37:
            r7 = r3
            goto L3f
        L39:
            boolean r8 = r7.e
            if (r8 == 0) goto L37
            boolean r7 = r7.f
        L3f:
            if (r7 == 0) goto L42
            goto L44
        L42:
            r7 = r4
            goto L45
        L44:
            r7 = r3
        L45:
            if (r7 == 0) goto Lb7
            com.amazon.aps.iva.n4.n<?> r7 = r2.mHost
            boolean r8 = r7 instanceof com.amazon.aps.iva.i5.h0
            if (r8 == 0) goto L52
            androidx.fragment.app.n r3 = r6.d
            boolean r3 = r3.f
            goto L5f
        L52:
            android.content.Context r7 = r7.c
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L5f
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isChangingConfigurations()
            r3 = r3 ^ r7
        L5f:
            if (r1 == 0) goto L65
            boolean r1 = r2.mBeingSaved
            if (r1 == 0) goto L67
        L65:
            if (r3 == 0) goto L7a
        L67:
            androidx.fragment.app.n r1 = r6.d
            r1.getClass()
            boolean r0 = androidx.fragment.app.FragmentManager.H(r0)
            if (r0 == 0) goto L75
            java.util.Objects.toString(r2)
        L75:
            java.lang.String r0 = r2.mWho
            r1.O8(r0)
        L7a:
            r2.performDestroy()
            androidx.fragment.app.l r0 = r10.a
            r0.d(r2, r4)
            java.util.ArrayList r0 = r6.d()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.p r1 = (androidx.fragment.app.p) r1
            if (r1 == 0) goto L8a
            java.lang.String r3 = r2.mWho
            androidx.fragment.app.Fragment r1 = r1.c
            java.lang.String r4 = r1.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8a
            r1.mTarget = r2
            r1.mTargetWho = r5
            goto L8a
        La9:
            java.lang.String r0 = r2.mTargetWho
            if (r0 == 0) goto Lb3
            androidx.fragment.app.Fragment r0 = r6.b(r0)
            r2.mTarget = r0
        Lb3:
            r6.h(r10)
            goto Lc9
        Lb7:
            java.lang.String r0 = r2.mTargetWho
            if (r0 == 0) goto Lc7
            androidx.fragment.app.Fragment r0 = r6.b(r0)
            if (r0 == 0) goto Lc7
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Lc7
            r2.mTarget = r0
        Lc7:
            r2.mState = r4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.e():void");
    }

    public final void f() {
        View view;
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.c;
        if (H) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.c;
        if (H) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        boolean z = false;
        this.a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            n nVar = this.b.d;
            if (nVar.b.containsKey(fragment.mWho) && nVar.e) {
                z2 = nVar.f;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.H(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Bundle bundle;
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.H(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle2 = fragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle), null, bundle);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, bundle, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (FragmentManager.H(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = fragment.mState;
                q qVar = this.b;
                if (c != i) {
                    l lVar = this.a;
                    if (c > i) {
                        Bundle bundle = null;
                        switch (i + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                Bundle bundle2 = fragment.mSavedFragmentState;
                                if (bundle2 != null) {
                                    bundle = bundle2.getBundle("savedInstanceState");
                                }
                                if (!fragment.mIsCreated) {
                                    lVar.h(false);
                                    fragment.performCreate(bundle);
                                    lVar.c(false);
                                    continue;
                                } else {
                                    fragment.mState = 1;
                                    fragment.restoreChildFragmentState();
                                    break;
                                }
                            case 2:
                                h();
                                d();
                                continue;
                            case 3:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                Bundle bundle3 = fragment.mSavedFragmentState;
                                if (bundle3 != null) {
                                    bundle = bundle3.getBundle("savedInstanceState");
                                }
                                fragment.performActivityCreated(bundle);
                                lVar.a(fragment, bundle, false);
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    u f = u.f(viewGroup3, fragment.getParentFragmentManager());
                                    u.b.EnumC0029b from = u.b.EnumC0029b.from(fragment.mView.getVisibility());
                                    f.getClass();
                                    com.amazon.aps.iva.yb0.j.f(from, "finalState");
                                    if (FragmentManager.H(2)) {
                                        Objects.toString(fragment);
                                    }
                                    f.a(from, u.b.a.ADDING, this);
                                }
                                fragment.mState = 4;
                                continue;
                            case 5:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                fragment.performStart();
                                lVar.k(fragment, false);
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                k();
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                g();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved) {
                                    if (qVar.c.get(fragment.mWho) == null) {
                                        qVar.i(l(), fragment.mWho);
                                    }
                                }
                                e();
                                continue;
                            case 1:
                                f();
                                fragment.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                if (fragment.mBeingSaved) {
                                    qVar.i(l(), fragment.mWho);
                                } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                    m();
                                }
                                if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                    u f2 = u.f(viewGroup2, fragment.getParentFragmentManager());
                                    f2.getClass();
                                    if (FragmentManager.H(2)) {
                                        Objects.toString(fragment);
                                    }
                                    f2.a(u.b.EnumC0029b.REMOVED, u.b.a.REMOVING, this);
                                }
                                fragment.mState = 3;
                                continue;
                            case 4:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                fragment.performStop();
                                lVar.l(fragment, false);
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                if (FragmentManager.H(3)) {
                                    Objects.toString(fragment);
                                }
                                fragment.performPause();
                                lVar.f(fragment, false);
                                continue;
                            default:
                                continue;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.H(3)) {
                            Objects.toString(fragment);
                        }
                        n nVar = qVar.d;
                        nVar.getClass();
                        if (FragmentManager.H(3)) {
                            Objects.toString(fragment);
                        }
                        nVar.O8(fragment.mWho);
                        qVar.h(this);
                        if (FragmentManager.H(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            u f3 = u.f(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                f3.getClass();
                                if (FragmentManager.H(2)) {
                                    Objects.toString(fragment);
                                }
                                f3.a(u.b.EnumC0029b.GONE, u.b.a.NONE, this);
                            } else {
                                f3.getClass();
                                if (FragmentManager.H(2)) {
                                    Objects.toString(fragment);
                                }
                                f3.a(u.b.EnumC0029b.VISIBLE, u.b.a.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.I(fragment)) {
                            fragmentManager.F = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    return;
                }
            }
        } finally {
            this.d = false;
        }
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        o oVar = (o) fragment.mSavedFragmentState.getParcelable("state");
        if (oVar != null) {
            fragment.mTargetWho = oVar.m;
            fragment.mTargetRequestCode = oVar.n;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = oVar.o;
            }
        }
        if (!fragment.mUserVisibleHint) {
            fragment.mDeferStart = true;
        }
    }

    public final void k() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.c;
        if (H) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != fragment.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                focusedView.requestFocus();
                if (FragmentManager.H(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.i(fragment, false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new o(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = fragment.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.H(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.g.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public p(l lVar, q qVar, ClassLoader classLoader, j jVar, Bundle bundle) {
        this.a = lVar;
        this.b = qVar;
        o oVar = (o) bundle.getParcelable("state");
        Fragment a2 = jVar.a(oVar.b);
        a2.mWho = oVar.c;
        a2.mFromLayout = oVar.d;
        a2.mRestored = true;
        a2.mFragmentId = oVar.e;
        a2.mContainerId = oVar.f;
        a2.mTag = oVar.g;
        a2.mRetainInstance = oVar.h;
        a2.mRemoving = oVar.i;
        a2.mDetached = oVar.j;
        a2.mHidden = oVar.k;
        a2.mMaxState = g.b.values()[oVar.l];
        a2.mTargetWho = oVar.m;
        a2.mTargetRequestCode = oVar.n;
        a2.mUserVisibleHint = oVar.o;
        this.c = a2;
        a2.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.setArguments(bundle2);
        if (FragmentManager.H(2)) {
            Objects.toString(a2);
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.b;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public p(l lVar, q qVar, Fragment fragment, Bundle bundle) {
        this.a = lVar;
        this.b = qVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
