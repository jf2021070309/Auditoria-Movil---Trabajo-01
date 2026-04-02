package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import com.amazon.aps.iva.c3.a;
import com.amazon.aps.iva.c3.f0;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.j0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.m5.b;
import com.amazon.aps.iva.o4.d;
import com.amazon.aps.iva.q.e1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, com.amazon.aps.iva.i5.o, h0, androidx.lifecycle.e, com.amazon.aps.iva.s8.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    u.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    com.amazon.aps.iva.n4.n<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.k mLifecycleRegistry;
    g.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    com.amazon.aps.iva.s8.b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    s mViewLifecycleOwner;
    v<com.amazon.aps.iva.i5.o> mViewLifecycleOwnerLiveData;
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends com.amazon.aps.iva.h.c<I> {
        public final /* synthetic */ AtomicReference a;

        public a(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // com.amazon.aps.iva.h.c
        public final void a(Object obj) {
            com.amazon.aps.iva.h.c cVar = (com.amazon.aps.iva.h.c) this.a.get();
            if (cVar != null) {
                cVar.a(obj);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class c extends l {
        public c() {
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Bundle bundle;
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a();
            androidx.lifecycle.q.b(fragment);
            Bundle bundle2 = fragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            fragment.mSavedStateRegistryController.b(bundle);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ u b;

        public e(u uVar) {
            this.b = uVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.c();
        }
    }

    /* loaded from: classes.dex */
    public class f extends com.amazon.aps.iva.n4.l {
        public f() {
        }

        @Override // com.amazon.aps.iva.n4.l
        public final View r(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException(defpackage.c.a("Fragment ", fragment, " does not have a view"));
        }

        @Override // com.amazon.aps.iva.n4.l
        public final boolean y() {
            if (Fragment.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements com.amazon.aps.iva.t.a<Void, androidx.activity.result.a> {
        public g() {
        }

        @Override // com.amazon.aps.iva.t.a
        public final Object apply() {
            Fragment fragment = Fragment.this;
            com.amazon.aps.iva.n4.n<?> nVar = fragment.mHost;
            if (nVar instanceof com.amazon.aps.iva.h.f) {
                return ((com.amazon.aps.iva.h.f) nVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* loaded from: classes.dex */
    public class h implements com.amazon.aps.iva.t.a<Void, androidx.activity.result.a> {
        public final /* synthetic */ androidx.activity.result.a a;

        public h(androidx.activity.result.a aVar) {
            this.a = aVar;
        }

        @Override // com.amazon.aps.iva.t.a
        public final Object apply() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class i extends l {
        public final /* synthetic */ com.amazon.aps.iva.t.a a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ com.amazon.aps.iva.i.a c;
        public final /* synthetic */ com.amazon.aps.iva.h.b d;

        public i(com.amazon.aps.iva.t.a aVar, AtomicReference atomicReference, com.amazon.aps.iva.i.a aVar2, com.amazon.aps.iva.h.b bVar) {
            this.a = aVar;
            this.b = atomicReference;
            this.c = aVar2;
            this.d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            this.b.set(((androidx.activity.result.a) this.a.apply()).c(fragment.generateActivityResultKey(), fragment, this.c, this.d));
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ArrayList<String> g;
        public ArrayList<String> h;
        public Object i = null;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Boolean o;
        public Boolean p;
        public f0 q;
        public f0 r;
        public float s;
        public View t;
        public boolean u;

        public j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.m = null;
            this.n = obj;
            this.q = null;
            this.r = null;
            this.s = 1.0f;
            this.t = null;
        }
    }

    /* loaded from: classes.dex */
    public static class k extends RuntimeException {
        public k(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new com.amazon.aps.iva.n4.t();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = g.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new v<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        g.b bVar = this.mMaxState;
        if (bVar != g.b.INITIALIZED && this.mParentFragment != null) {
            return Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return bVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mSavedStateRegistryController = new com.amazon.aps.iva.s8.b(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        s sVar = this.mViewLifecycleOwner;
        sVar.g.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> com.amazon.aps.iva.h.c<I> prepareCallInternal(com.amazon.aps.iva.i.a<I, O> aVar, com.amazon.aps.iva.t.a<Void, androidx.activity.result.a> aVar2, com.amazon.aps.iva.h.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new i(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference);
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.u = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            u f2 = u.f(viewGroup, fragmentManager);
            f2.g();
            if (z) {
                this.mHost.d.post(new e(f2));
            } else {
                f2.c();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public com.amazon.aps.iva.n4.l createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            com.amazon.aps.iva.m5.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(com.amazon.aps.iva.c80.a.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.h getActivity() {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar == null) {
            return null;
        }
        return (androidx.fragment.app.h) nVar.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (bool = jVar.p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (bool = jVar.o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar == null) {
            return null;
        }
        return nVar.c;
    }

    @Override // androidx.lifecycle.e
    public com.amazon.aps.iva.k5.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && FragmentManager.H(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        com.amazon.aps.iva.k5.c cVar = new com.amazon.aps.iva.k5.c(0);
        LinkedHashMap linkedHashMap = cVar.a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.t.a, application);
        }
        linkedHashMap.put(androidx.lifecycle.q.a, this);
        linkedHashMap.put(androidx.lifecycle.q.b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.q.c, getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.e
    public u.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.H(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.mDefaultFactory = new androidx.lifecycle.r(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.b;
    }

    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.i;
    }

    public f0 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.q;
    }

    public int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.c;
    }

    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.k;
    }

    public f0 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.r;
    }

    public View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar == null) {
            return null;
        }
        return nVar.G();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public com.amazon.aps.iva.m5.a getLoaderManager() {
        return com.amazon.aps.iva.m5.a.a(this);
    }

    public int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.a;
    }

    public int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.d;
    }

    public int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.s;
    }

    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        d.b bVar = com.amazon.aps.iva.o4.d.a;
        com.amazon.aps.iva.o4.f fVar = new com.amazon.aps.iva.o4.f(this);
        com.amazon.aps.iva.o4.d.c(fVar);
        d.b a2 = com.amazon.aps.iva.o4.d.a(this);
        if (a2.a.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.f.class)) {
            com.amazon.aps.iva.o4.d.b(a2, fVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // com.amazon.aps.iva.s8.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.m;
    }

    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (arrayList = jVar.g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (arrayList = jVar.h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        d.b bVar = com.amazon.aps.iva.o4.d.a;
        com.amazon.aps.iva.o4.g gVar = new com.amazon.aps.iva.o4.g(this);
        com.amazon.aps.iva.o4.d.c(gVar);
        d.b a2 = com.amazon.aps.iva.o4.d.a(this);
        if (a2.a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.g.class)) {
            com.amazon.aps.iva.o4.d.b(a2, gVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public com.amazon.aps.iva.i5.o getViewLifecycleOwner() {
        s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException(defpackage.c.a("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public LiveData<com.amazon.aps.iva.i5.o> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // com.amazon.aps.iva.i5.h0
    public g0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != g.b.INITIALIZED.ordinal()) {
                HashMap<String, g0> hashMap = this.mFragmentManager.N.d;
                g0 g0Var = hashMap.get(this.mWho);
                if (g0Var == null) {
                    g0 g0Var2 = new g0();
                    hashMap.put(this.mWho, g0Var2);
                    return g0Var2;
                }
                return g0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new com.amazon.aps.iva.n4.t();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean isHidden;
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null) {
                isHidden = false;
            } else {
                isHidden = fragment.isHidden();
            }
            if (!isHidden) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null) {
                isMenuVisible = true;
            } else {
                isMenuVisible = fragment.isMenuVisible();
            }
            if (isMenuVisible) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.L();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.N();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.H(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        Activity activity = nVar == null ? null : nVar.b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.u >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(1);
        }
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        Activity activity = nVar == null ? null : nVar.b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(4);
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.c);
        if (this.mCalled) {
            Iterator<com.amazon.aps.iva.n4.u> it2 = this.mFragmentManager.o.iterator();
            while (it2.hasNext()) {
                it2.next().g(this);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(0);
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.i(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new androidx.lifecycle.j() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.j
            public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
                View view;
                if (aVar == g.a.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.c(g.a.ON_CREATE);
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.N();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new s(this, getViewModelStore(), new e1(this, 1));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.r();
            if (FragmentManager.H(3)) {
                Objects.toString(this.mView);
                toString();
            }
            i0.b(this.mView, this.mViewLifecycleOwner);
            j0.b(this.mView, this.mViewLifecycleOwner);
            com.amazon.aps.iva.s8.d.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.c(g.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onDestroy()"));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            s sVar = this.mViewLifecycleOwner;
            sVar.r();
            if (sVar.f.c.isAtLeast(g.b.CREATED)) {
                this.mViewLifecycleOwner.g(g.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            com.amazon.aps.iva.x.i<b.a> iVar = com.amazon.aps.iva.m5.a.a(this).b.b;
            int g2 = iVar.g();
            for (int i2 = 0; i2 < g2; i2++) {
                iVar.h(i2).getClass();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.I) {
                fragmentManager.k();
                this.mChildFragmentManager = new com.amazon.aps.iva.n4.t();
                return;
            }
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.o(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.p(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.g(g.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.c(g.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onPause()"));
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean K = FragmentManager.K(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != K) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(K);
            onPrimaryNavigationFragmentChanged(K);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.i0();
            fragmentManager.q(fragmentManager.y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.k kVar = this.mLifecycleRegistry;
            g.a aVar = g.a.ON_RESUME;
            kVar.c(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.f.c(aVar);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(7);
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.k kVar = this.mLifecycleRegistry;
            g.a aVar = g.a.ON_START;
            kVar.c(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.f.c(aVar);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(5);
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = true;
        fragmentManager.N.g = true;
        fragmentManager.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.g(g.a.ON_STOP);
        }
        this.mLifecycleRegistry.c(g.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onStop()"));
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    public final <I, O> com.amazon.aps.iva.h.c<I> registerForActivityResult(com.amazon.aps.iva.i.a<I, O> aVar, com.amazon.aps.iva.h.b<O> bVar) {
        return prepareCallInternal(aVar, new g(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.D != null) {
                parentFragmentManager.E.addLast(new FragmentManager.m(this.mWho, i2));
                parentFragmentManager.D.a(strArr);
                return;
            }
            parentFragmentManager.v.getClass();
            return;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to Activity"));
    }

    public final androidx.fragment.app.h requireActivity() {
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(defpackage.c.a("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.V(bundle);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.G = false;
            fragmentManager.H = false;
            fragmentManager.N.g = false;
            fragmentManager.t(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.g(g.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new com.amazon.aps.iva.n4.h0(defpackage.c.a("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().b = i2;
        ensureAnimationInfo().c = i3;
        ensureAnimationInfo().d = i4;
        ensureAnimationInfo().e = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(f0 f0Var) {
        ensureAnimationInfo().q = f0Var;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(f0 f0Var) {
        ensureAnimationInfo().r = f0Var;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.m0();
            }
        }
    }

    public void setInitialSavedState(m mVar) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (mVar == null || (r2 = mVar.b) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.m0();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().s = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        d.b bVar = com.amazon.aps.iva.o4.d.a;
        com.amazon.aps.iva.o4.j jVar = new com.amazon.aps.iva.o4.j(this);
        com.amazon.aps.iva.o4.d.c(jVar);
        d.b a2 = com.amazon.aps.iva.o4.d.a(this);
        if (a2.a.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.j.class)) {
            com.amazon.aps.iva.o4.d.b(a2, jVar);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.N.N8(this);
                return;
            } else {
                fragmentManager.N.P8(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.g = arrayList;
        jVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            d.b bVar = com.amazon.aps.iva.o4.d.a;
            com.amazon.aps.iva.o4.k kVar = new com.amazon.aps.iva.o4.k(this, fragment, i2);
            com.amazon.aps.iva.o4.d.c(kVar);
            d.b a2 = com.amazon.aps.iva.o4.d.a(this);
            if (a2.a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.k.class)) {
                com.amazon.aps.iva.o4.d.b(a2, kVar);
            }
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException(defpackage.c.a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        d.b bVar = com.amazon.aps.iva.o4.d.a;
        com.amazon.aps.iva.o4.l lVar = new com.amazon.aps.iva.o4.l(this, z);
        com.amazon.aps.iva.o4.d.c(lVar);
        d.b a2 = com.amazon.aps.iva.o4.d.a(this);
        if (a2.a.contains(d.a.DETECT_SET_USER_VISIBLE_HINT) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.l.class)) {
            com.amazon.aps.iva.o4.d.b(a2, lVar);
        }
        boolean z2 = true;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            p f2 = fragmentManager.f(this);
            Fragment fragment = f2.c;
            if (fragment.mDeferStart) {
                if (fragmentManager.b) {
                    fragmentManager.J = true;
                } else {
                    fragment.mDeferStart = false;
                    f2.i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar != null) {
            return nVar.h0(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost != null) {
            if (FragmentManager.H(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.C != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (FragmentManager.H(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                } else {
                    intent2 = intent;
                }
                com.amazon.aps.iva.yb0.j.f(intentSender, "intentSender");
                com.amazon.aps.iva.h.g gVar = new com.amazon.aps.iva.h.g(intentSender, intent2, i3, i4);
                parentFragmentManager.E.addLast(new FragmentManager.m(this.mWho, i2));
                if (FragmentManager.H(2)) {
                    toString();
                }
                parentFragmentManager.C.a(gVar);
                return;
            }
            com.amazon.aps.iva.n4.n<?> nVar = parentFragmentManager.v;
            if (i2 == -1) {
                Activity activity = nVar.b;
                int i6 = com.amazon.aps.iva.c3.a.a;
                a.C0160a.c(activity, intentSender, i2, intent, i3, i4, i5, bundle);
                return;
            }
            nVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().u) {
            if (this.mHost == null) {
                ensureAnimationInfo().u = false;
            } else if (Looper.myLooper() != this.mHost.d.getLooper()) {
                this.mHost.d.postAtFrontOfQueue(new d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public final Bundle b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new m[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }
        }

        public m(Bundle bundle) {
            this.b = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.b);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            d.b bVar = com.amazon.aps.iva.o4.d.a;
            com.amazon.aps.iva.o4.h hVar = new com.amazon.aps.iva.o4.h(this);
            com.amazon.aps.iva.o4.d.c(hVar);
            d.b a2 = com.amazon.aps.iva.o4.d.a(this);
            if (a2.a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && com.amazon.aps.iva.o4.d.e(a2, getClass(), com.amazon.aps.iva.o4.h.class)) {
                com.amazon.aps.iva.o4.d.b(a2, hVar);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.A(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.j.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new k(defpackage.e.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new k(defpackage.e.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new k(defpackage.e.e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new k(defpackage.e.e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        ensureAnimationInfo().u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.v.d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> com.amazon.aps.iva.h.c<I> registerForActivityResult(com.amazon.aps.iva.i.a<I, O> aVar, androidx.activity.result.a aVar2, com.amazon.aps.iva.h.b<O> bVar) {
        return prepareCallInternal(aVar, new h(aVar2), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar != null) {
            com.amazon.aps.iva.d3.a.startActivity(nVar.c, intent, bundle);
            return;
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.B != null) {
                parentFragmentManager.E.addLast(new FragmentManager.m(this.mWho, i2));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.B.a(intent);
                return;
            }
            com.amazon.aps.iva.n4.n<?> nVar = parentFragmentManager.v;
            if (i2 == -1) {
                com.amazon.aps.iva.d3.a.startActivity(nVar.c, intent, bundle);
                return;
            } else {
                nVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(defpackage.c.a("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        com.amazon.aps.iva.n4.n<?> nVar = this.mHost;
        if (nVar != null) {
            LayoutInflater Z = nVar.Z();
            Z.setFactory2(this.mChildFragmentManager.f);
            return Z;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    private void restoreViewState() {
        if (FragmentManager.H(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }
}
