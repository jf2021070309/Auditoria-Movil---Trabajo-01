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
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import c.i.c.t;
import c.i.d.a;
import c.m.b.a0;
import c.m.b.k0;
import c.m.b.n0.d;
import c.m.b.n0.l;
import c.m.b.o;
import c.m.b.u;
import c.m.b.v;
import c.m.b.y;
import c.m.b.z;
import c.p.e0;
import c.p.i0;
import c.p.j;
import c.p.m0;
import c.p.n;
import c.p.n0;
import c.p.p;
import c.p.r;
import c.p.w;
import c.q.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, p, n0, c.w.c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public i0 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public v<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public r mLifecycleRegistry;
    public j.b mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public c.w.b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public c.m.b.i0 mViewLifecycleOwner;
    public w<p> mViewLifecycleOwnerLiveData;
    public String mWho;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final Bundle a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ k0 a;

        public c(Fragment fragment, k0 k0Var) {
            this.a = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c();
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.m.b.r {
        public d() {
        }

        @Override // c.m.b.r
        public View b(int i2) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i2);
            }
            StringBuilder y = e.a.d.a.a.y("Fragment ");
            y.append(Fragment.this);
            y.append(" does not have a view");
            throw new IllegalStateException(y.toString());
        }

        @Override // c.m.b.r
        public boolean c() {
            return Fragment.this.mView != null;
        }
    }

    /* loaded from: classes.dex */
    public class e implements c.c.a.c.a<Void, ActivityResultRegistry> {
        public e() {
        }

        @Override // c.c.a.c.a
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            v<?> vVar = fragment.mHost;
            return vVar instanceof c.a.h.c ? ((c.a.h.c) vVar).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* loaded from: classes.dex */
    public class f implements c.c.a.c.a<Void, ActivityResultRegistry> {
        public final /* synthetic */ ActivityResultRegistry a;

        public f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.a = activityResultRegistry;
        }

        @Override // c.c.a.c.a
        public ActivityResultRegistry apply(Void r1) {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class g extends k {
        public final /* synthetic */ c.c.a.c.a a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f384b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a.h.d.a f385c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c.a.h.a f386d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c.c.a.c.a aVar, AtomicReference atomicReference, c.a.h.d.a aVar2, c.a.h.a aVar3) {
            super(null);
            this.a = aVar;
            this.f384b = atomicReference;
            this.f385c = aVar2;
            this.f386d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            this.f384b.set(((ActivityResultRegistry) this.a.apply(null)).d(Fragment.this.generateActivityResultKey(), Fragment.this, this.f385c, this.f386d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class h<I> extends c.a.h.b<I> {
        public final /* synthetic */ AtomicReference a;

        public h(Fragment fragment, AtomicReference atomicReference, c.a.h.d.a aVar) {
            this.a = atomicReference;
        }

        @Override // c.a.h.b
        public void a(I i2, c.i.c.d dVar) {
            c.a.h.b bVar = (c.a.h.b) this.a.get();
            if (bVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            bVar.a(i2, dVar);
        }

        @Override // c.a.h.b
        public void b() {
            c.a.h.b bVar = (c.a.h.b) this.a.getAndSet(null);
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f388b;

        /* renamed from: c  reason: collision with root package name */
        public int f389c;

        /* renamed from: d  reason: collision with root package name */
        public int f390d;

        /* renamed from: e  reason: collision with root package name */
        public int f391e;

        /* renamed from: f  reason: collision with root package name */
        public int f392f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f393g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f394h;

        /* renamed from: i  reason: collision with root package name */
        public Object f395i = null;

        /* renamed from: j  reason: collision with root package name */
        public Object f396j;

        /* renamed from: k  reason: collision with root package name */
        public Object f397k;

        /* renamed from: l  reason: collision with root package name */
        public Object f398l;

        /* renamed from: m  reason: collision with root package name */
        public Object f399m;

        /* renamed from: n  reason: collision with root package name */
        public Object f400n;
        public Boolean o;
        public Boolean p;
        public float q;
        public View r;
        public boolean s;

        public i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f396j = obj;
            this.f397k = null;
            this.f398l = obj;
            this.f399m = null;
            this.f400n = obj;
            this.q = 1.0f;
            this.r = null;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends RuntimeException {
        public j(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public k() {
        }

        public k(a aVar) {
        }

        public abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new y();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = j.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new w<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        j.b bVar = this.mMaxState;
        return (bVar == j.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            c.m.b.n0.d dVar = c.m.b.n0.d.a;
            h.o.c.j.e(this, "fragment");
            c.m.b.n0.h hVar = new c.m.b.n0.h(this);
            c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
            c.m.b.n0.d.c(hVar);
            d.c a2 = c.m.b.n0.d.a(this);
            if (a2.f2394b.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && c.m.b.n0.d.f(a2, getClass(), c.m.b.n0.h.class)) {
                c.m.b.n0.d.b(a2, hVar);
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
        return fragmentManager.D(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new r(this);
        this.mSavedStateRegistryController = new c.w.b(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = u.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    private <I, O> c.a.h.b<I> prepareCallInternal(c.a.h.d.a<I, O> aVar, c.c.a.c.a<Void, ActivityResultRegistry> aVar2, c.a.h.a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(aVar2, atomicReference, aVar, aVar3));
            return new h(this, atomicReference, aVar);
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.L(3)) {
            String str = "moveto RESTORE_VIEW_STATE: " + this;
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        k0 f2 = k0.f(viewGroup, fragmentManager);
        f2.h();
        if (z) {
            this.mHost.f2409c.post(new c(this, f2));
        } else {
            f2.c();
        }
    }

    public c.m.b.r createFragmentContainer() {
        return new d();
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
            c.q.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(e.a.d.a.a.k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f402c.d(str);
    }

    public String generateActivityResultKey() {
        StringBuilder y = e.a.d.a.a.y("fragment_");
        y.append(this.mWho);
        y.append("_rq#");
        y.append(this.mNextLocalRequestCode.getAndIncrement());
        return y.toString();
    }

    public final o getActivity() {
        v<?> vVar = this.mHost;
        if (vVar == null) {
            return null;
        }
        return (o) vVar.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        v<?> vVar = this.mHost;
        if (vVar == null) {
            return null;
        }
        return vVar.f2408b;
    }

    public i0 getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.L(3)) {
                    StringBuilder y = e.a.d.a.a.y("Could not find Application instance from Context ");
                    y.append(requireContext().getApplicationContext());
                    y.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    y.toString();
                }
                this.mDefaultFactory = new e0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f388b;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f395i;
    }

    public t getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f389c;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f397k;
    }

    public t getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.r;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        v<?> vVar = this.mHost;
        if (vVar == null) {
            return null;
        }
        return vVar.d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        v<?> vVar = this.mHost;
        if (vVar != null) {
            LayoutInflater e2 = vVar.e();
            c.i.a.Y(e2, this.mChildFragmentManager.f405f);
            return e2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // c.p.p
    public c.p.j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public c.q.a.a getLoaderManager() {
        return c.q.a.a.b(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f392f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.a;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f390d;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f391e;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.q;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f398l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        c.m.b.n0.d dVar = c.m.b.n0.d.a;
        h.o.c.j.e(this, "fragment");
        c.m.b.n0.f fVar = new c.m.b.n0.f(this);
        c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
        c.m.b.n0.d.c(fVar);
        d.c a2 = c.m.b.n0.d.a(this);
        if (a2.f2394b.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && c.m.b.n0.d.f(a2, getClass(), c.m.b.n0.f.class)) {
            c.m.b.n0.d.b(a2, fVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f396j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // c.w.c
    public final c.w.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2831b;
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f399m;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f400n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f393g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f394h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
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
        c.m.b.n0.d dVar = c.m.b.n0.d.a;
        h.o.c.j.e(this, "fragment");
        c.m.b.n0.g gVar = new c.m.b.n0.g(this);
        c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
        c.m.b.n0.d.c(gVar);
        d.c a2 = c.m.b.n0.d.a(this);
        if (a2.f2394b.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && c.m.b.n0.d.f(a2, getClass(), c.m.b.n0.g.class)) {
            c.m.b.n0.d.b(a2, gVar);
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

    public p getViewLifecycleOwner() {
        c.m.b.i0 i0Var = this.mViewLifecycleOwner;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<p> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // c.p.n0
    public m0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != j.b.INITIALIZED.ordinal()) {
                z zVar = this.mFragmentManager.H;
                m0 m0Var = zVar.f2417f.get(this.mWho);
                if (m0Var == null) {
                    m0 m0Var2 = new m0();
                    zVar.f2417f.put(this.mWho, m0Var2);
                    return m0Var2;
                }
                return m0Var;
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
        this.mChildFragmentManager = new y();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            Objects.requireNonNull(fragmentManager);
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.N(this.mParentFragment));
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.P();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.L(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent;
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        v<?> vVar = this.mHost;
        Activity activity = vVar == null ? null : vVar.a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.o >= 1) {
            return;
        }
        fragmentManager.j();
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

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
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

    public void onDestroyOptionsMenu() {
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

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        v<?> vVar = this.mHost;
        Activity activity = vVar == null ? null : vVar.a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.A = false;
        fragmentManager.B = false;
        fragmentManager.H.f2420i = false;
        fragmentManager.u(4);
    }

    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f2408b);
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator<a0> it2 = fragmentManager.f413n.iterator();
        while (it2.hasNext()) {
            it2.next().a(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.A = false;
        fragmentManager2.B = false;
        fragmentManager2.H.f2420i = false;
        fragmentManager2.u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.h(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new n() { // from class: androidx.fragment.app.Fragment.5
            @Override // c.p.n
            public void c(p pVar, j.a aVar) {
                View view;
                if (aVar != j.a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(j.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.k(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new c.m.b.i0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f2368b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
        this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
        this.mView.setTag(R.id.view_tree_saved_state_registry_owner, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.e(j.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            c.m.b.i0 i0Var = this.mViewLifecycleOwner;
            i0Var.b();
            if (i0Var.f2368b.f2467c.isAtLeast(j.b.CREATED)) {
                this.mViewLifecycleOwner.a(j.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        b.c cVar = ((c.q.a.b) c.q.a.a.b(this)).f2477b;
        int g2 = cVar.f2484d.g();
        for (int i2 = 0; i2 < g2; i2++) {
            cVar.f2484d.j(i2).k();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.C) {
            return;
        }
        fragmentManager.l();
        this.mChildFragmentManager = new y();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.n(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(j.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(j.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.s(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.t(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean O = this.mFragmentManager.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != O) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(O);
            onPrimaryNavigationFragmentChanged(O);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.g0();
            fragmentManager.r(fragmentManager.s);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onResume()"));
        }
        r rVar = this.mLifecycleRegistry;
        j.a aVar = j.a.ON_RESUME;
        rVar.e(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.A = false;
        fragmentManager.B = false;
        fragmentManager.H.f2420i = false;
        fragmentManager.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
        Parcelable Y = this.mChildFragmentManager.Y();
        if (Y != null) {
            bundle.putParcelable("android:support:fragments", Y);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onStart()"));
        }
        r rVar = this.mLifecycleRegistry;
        j.a aVar = j.a.ON_START;
        rVar.e(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.A = false;
        fragmentManager.B = false;
        fragmentManager.H.f2420i = false;
        fragmentManager.u(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.B = true;
        fragmentManager.H.f2420i = true;
        fragmentManager.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(j.a.ON_STOP);
        }
        this.mLifecycleRegistry.e(j.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().s = true;
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        ensureAnimationInfo().s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handler = fragmentManager != null ? fragmentManager.p.f2409c : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> c.a.h.b<I> registerForActivityResult(c.a.h.d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, c.a.h.a<O> aVar2) {
        return prepareCallInternal(aVar, new f(this, activityResultRegistry), aVar2);
    }

    public final <I, O> c.a.h.b<I> registerForActivityResult(c.a.h.d.a<I, O> aVar, c.a.h.a<O> aVar2) {
        return prepareCallInternal(aVar, new e(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost == null) {
            throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.x == null) {
            Objects.requireNonNull(parentFragmentManager.p);
            return;
        }
        parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        parentFragmentManager.x.a(strArr, null);
    }

    public final o requireActivity() {
        o activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to a context."));
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
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " is not attached to any Fragment or host"));
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
        throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.X(parcelable);
        this.mChildFragmentManager.j();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            c.m.b.i0 i0Var = this.mViewLifecycleOwner;
            i0Var.f2369c.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new c.m.b.m0(e.a.d.a.a.j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(j.a.ON_CREATE);
        }
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
        ensureAnimationInfo().f388b = i2;
        ensureAnimationInfo().f389c = i3;
        ensureAnimationInfo().f390d = i4;
        ensureAnimationInfo().f391e = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(t tVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f395i = obj;
    }

    public void setExitSharedElementCallback(t tVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f397k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().r = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.g();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = (savedState == null || (r2 = savedState.a) == null) ? null : null;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.g();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f392f = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().q = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f398l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        c.m.b.n0.d dVar = c.m.b.n0.d.a;
        h.o.c.j.e(this, "fragment");
        c.m.b.n0.j jVar = new c.m.b.n0.j(this);
        c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
        c.m.b.n0.d.c(jVar);
        d.c a2 = c.m.b.n0.d.a(this);
        if (a2.f2394b.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && c.m.b.n0.d.f(a2, getClass(), c.m.b.n0.j.class)) {
            c.m.b.n0.d.b(a2, jVar);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.H.c(this);
        } else {
            fragmentManager.H.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f396j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f399m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.f393g = arrayList;
        iVar.f394h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f400n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        if (fragment != null) {
            c.m.b.n0.d dVar = c.m.b.n0.d.a;
            h.o.c.j.e(this, "violatingFragment");
            h.o.c.j.e(fragment, "targetFragment");
            c.m.b.n0.k kVar = new c.m.b.n0.k(this, fragment, i2);
            c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
            c.m.b.n0.d.c(kVar);
            d.c a2 = c.m.b.n0.d.a(this);
            if (a2.f2394b.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && c.m.b.n0.d.f(a2, getClass(), c.m.b.n0.k.class)) {
                c.m.b.n0.d.b(a2, kVar);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(e.a.d.a.a.j("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        c.m.b.n0.d dVar = c.m.b.n0.d.a;
        h.o.c.j.e(this, "fragment");
        l lVar = new l(this, z);
        c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
        c.m.b.n0.d.c(lVar);
        d.c a2 = c.m.b.n0.d.a(this);
        if (a2.f2394b.contains(d.a.DETECT_SET_USER_VISIBLE_HINT) && c.m.b.n0.d.f(a2, getClass(), l.class)) {
            c.m.b.n0.d.b(a2, lVar);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.S(fragmentManager.f(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        v<?> vVar = this.mHost;
        if (vVar != null) {
            return vVar.f(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        v<?> vVar = this.mHost;
        if (vVar == null) {
            throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to Activity"));
        }
        Context context = vVar.f2408b;
        Object obj = c.i.d.a.a;
        a.C0034a.b(context, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.v != null) {
            parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.v.a(intent, null);
            return;
        }
        v<?> vVar = parentFragmentManager.p;
        Objects.requireNonNull(vVar);
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Context context = vVar.f2408b;
        Object obj = c.i.d.a.a;
        a.C0034a.b(context, intent, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(e.a.d.a.a.j("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.L(2)) {
            String str = "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.w == null) {
            v<?> vVar = parentFragmentManager.p;
            Objects.requireNonNull(vVar);
            if (i2 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = vVar.a;
            int i6 = c.i.c.c.f1944c;
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.L(2)) {
                String str2 = "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this;
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i3, i4);
        parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        if (FragmentManager.L(2)) {
            String str3 = "Fragment " + this + "is launching an IntentSender for result ";
        }
        parentFragmentManager.w.a(intentSenderRequest, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().s = false;
        } else if (Looper.myLooper() != this.mHost.f2409c.getLooper()) {
            this.mHost.f2409c.postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
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
}
