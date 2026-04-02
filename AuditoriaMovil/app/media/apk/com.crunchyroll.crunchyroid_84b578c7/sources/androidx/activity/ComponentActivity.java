package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.a;
import com.amazon.aps.iva.c3.a;
import com.amazon.aps.iva.c3.a0;
import com.amazon.aps.iva.c3.c0;
import com.amazon.aps.iva.c3.i;
import com.amazon.aps.iva.c3.z;
import com.amazon.aps.iva.e.h;
import com.amazon.aps.iva.e.l;
import com.amazon.aps.iva.e.v;
import com.amazon.aps.iva.h.g;
import com.amazon.aps.iva.i.a;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.j0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.p3.n;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ComponentActivity extends i implements h0, androidx.lifecycle.e, com.amazon.aps.iva.s8.c, v, com.amazon.aps.iva.h.f, com.amazon.aps.iva.d3.b, com.amazon.aps.iva.d3.c, z, a0, com.amazon.aps.iva.p3.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.a mActivityResultRegistry;
    private int mContentLayoutId;
    final com.amazon.aps.iva.g.a mContextAwareHelper;
    private u.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final l mFullyDrawnReporter;
    private final k mLifecycleRegistry;
    private final com.amazon.aps.iva.p3.l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<com.amazon.aps.iva.o3.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<com.amazon.aps.iva.o3.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<com.amazon.aps.iva.o3.a<c0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<com.amazon.aps.iva.o3.a<Integer>> mOnTrimMemoryListeners;
    final e mReportFullyDrawnExecutor;
    final com.amazon.aps.iva.s8.b mSavedStateRegistryController;
    private g0 mViewModelStore;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.a {
        public a() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.a
        public final void b(int i, com.amazon.aps.iva.i.a aVar, Object obj) {
            Bundle bundle;
            String[] strArr;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0348a b = aVar.b(componentActivity, obj);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new androidx.activity.a(this, i, b));
                return;
            }
            Intent a = aVar.a(componentActivity, obj);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i2 = com.amazon.aps.iva.c3.a.a;
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i3])) {
                        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i3));
                        }
                    } else {
                        throw new IllegalArgumentException(defpackage.b.c(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[stringArrayExtra.length - size];
                } else {
                    strArr = stringArrayExtra;
                }
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                            if (!hashSet.contains(Integer.valueOf(i5))) {
                                strArr[i4] = stringArrayExtra[i5];
                                i4++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (componentActivity instanceof a.f) {
                    ((a.f) componentActivity).validateRequestPermissionsRequestCode(i);
                }
                a.c.b(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                g gVar = (g) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = gVar.b;
                    Intent intent = gVar.c;
                    int i6 = gVar.d;
                    int i7 = gVar.e;
                    int i8 = com.amazon.aps.iva.c3.a.a;
                    a.C0160a.c(componentActivity, intentSender, i, intent, i6, i7, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.b(this, i, e));
                }
            } else {
                int i9 = com.amazon.aps.iva.c3.a.a;
                a.C0160a.b(componentActivity, a, i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e;
            } catch (NullPointerException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public Object a;
        public g0 b;
    }

    /* loaded from: classes.dex */
    public interface e extends Executor {
        void D(View view);
    }

    /* loaded from: classes.dex */
    public class f implements e, ViewTreeObserver.OnDrawListener, Runnable {
        public Runnable c;
        public final long b = SystemClock.uptimeMillis() + NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
        public boolean d = false;

        public f() {
            ComponentActivity.this = r5;
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void D(View view) {
            if (!this.d) {
                this.d = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public final void a() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.d) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new h(this, 0));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
                this.c = null;
                l lVar = ComponentActivity.this.mFullyDrawnReporter;
                synchronized (lVar.c) {
                    z = lVar.d;
                }
                if (z) {
                    this.d = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.b) {
                this.d = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.amazon.aps.iva.e.e] */
    public ComponentActivity() {
        this.mContextAwareHelper = new com.amazon.aps.iva.g.a();
        this.mMenuHostHelper = new com.amazon.aps.iva.p3.l(new com.amazon.aps.iva.e.d(this, 0));
        this.mLifecycleRegistry = new k(this);
        com.amazon.aps.iva.s8.b bVar = new com.amazon.aps.iva.s8.b(this);
        this.mSavedStateRegistryController = bVar;
        this.mOnBackPressedDispatcher = null;
        e createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new l(createFullyDrawnExecutor, new com.amazon.aps.iva.xb0.a() { // from class: com.amazon.aps.iva.e.e
            @Override // com.amazon.aps.iva.xb0.a
            public final Object invoke() {
                com.amazon.aps.iva.kb0.q lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            getLifecycle().addObserver(new j() { // from class: androidx.activity.ComponentActivity.2
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar) {
                    View view;
                    if (aVar == g.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().addObserver(new j() { // from class: androidx.activity.ComponentActivity.3
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar) {
                    if (aVar == g.a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ((f) ComponentActivity.this.mReportFullyDrawnExecutor).a();
                    }
                }
            });
            getLifecycle().addObserver(new j() { // from class: androidx.activity.ComponentActivity.4
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().removeObserver(this);
                }
            });
            bVar.a();
            q.b(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new a.b() { // from class: com.amazon.aps.iva.e.f
                @Override // androidx.savedstate.a.b
                public final Bundle a() {
                    Bundle lambda$new$1;
                    lambda$new$1 = ComponentActivity.this.lambda$new$1();
                    return lambda$new$1;
                }
            });
            addOnContextAvailableListener(new com.amazon.aps.iva.e.g(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private e createFullyDrawnExecutor() {
        return new f();
    }

    public /* synthetic */ com.amazon.aps.iva.kb0.q lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        androidx.activity.result.a aVar = this.mActivityResultRegistry;
        aVar.getClass();
        HashMap hashMap = aVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(aVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) aVar.g.clone());
        return bundle;
    }

    public void lambda$new$2(Context context) {
        Bundle a2 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            androidx.activity.result.a aVar = this.mActivityResultRegistry;
            aVar.getClass();
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                aVar.d = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = aVar.g;
                bundle2.putAll(bundle);
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    HashMap hashMap = aVar.b;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = aVar.a;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.D(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // com.amazon.aps.iva.p3.i
    public void addMenuProvider(n nVar) {
        com.amazon.aps.iva.p3.l lVar = this.mMenuHostHelper;
        lVar.b.add(nVar);
        lVar.a.run();
    }

    @Override // com.amazon.aps.iva.d3.b
    public final void addOnConfigurationChangedListener(com.amazon.aps.iva.o3.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(com.amazon.aps.iva.g.b bVar) {
        com.amazon.aps.iva.g.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        com.amazon.aps.iva.yb0.j.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = aVar.b;
        if (context != null) {
            bVar.a(context);
        }
        aVar.a.add(bVar);
    }

    @Override // com.amazon.aps.iva.c3.z
    public final void addOnMultiWindowModeChangedListener(com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(com.amazon.aps.iva.o3.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // com.amazon.aps.iva.c3.a0
    public final void addOnPictureInPictureModeChangedListener(com.amazon.aps.iva.o3.a<c0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // com.amazon.aps.iva.d3.c
    public final void addOnTrimMemoryListener(com.amazon.aps.iva.o3.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new g0();
            }
        }
    }

    @Override // com.amazon.aps.iva.h.f
    public final androidx.activity.result.a getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.e
    public com.amazon.aps.iva.k5.a getDefaultViewModelCreationExtras() {
        com.amazon.aps.iva.k5.c cVar = new com.amazon.aps.iva.k5.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.a;
        if (application != null) {
            linkedHashMap.put(t.a, getApplication());
        }
        linkedHashMap.put(q.a, this);
        linkedHashMap.put(q.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(q.c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.e
    public u.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new r(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    public l getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.c3.i, com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // com.amazon.aps.iva.e.v
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b());
            getLifecycle().addObserver(new j() { // from class: androidx.activity.ComponentActivity.6
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar) {
                    if (aVar == g.a.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        OnBackPressedDispatcher onBackPressedDispatcher = ComponentActivity.this.mOnBackPressedDispatcher;
                        OnBackInvokedDispatcher a2 = c.a((ComponentActivity) oVar);
                        onBackPressedDispatcher.getClass();
                        com.amazon.aps.iva.yb0.j.f(a2, "invoker");
                        onBackPressedDispatcher.f = a2;
                        onBackPressedDispatcher.d(onBackPressedDispatcher.h);
                    }
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // com.amazon.aps.iva.s8.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    @Override // com.amazon.aps.iva.i5.h0
    public g0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        i0.b(getWindow().getDecorView(), this);
        j0.b(getWindow().getDecorView(), this);
        com.amazon.aps.iva.s8.d.b(getWindow().getDecorView(), this);
        com.amazon.aps.iva.e.z.O(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        com.amazon.aps.iva.yb0.j.f(decorView, "<this>");
        decorView.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<com.amazon.aps.iva.o3.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    @Override // com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        com.amazon.aps.iva.g.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        aVar.b = this;
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = androidx.lifecycle.o.c;
        o.b.b(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            com.amazon.aps.iva.p3.l lVar = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<n> it = lVar.b.iterator();
            while (it.hasNext()) {
                it.next().d(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<n> it = this.mMenuHostHelper.b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new com.amazon.aps.iva.c3.k(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<com.amazon.aps.iva.o3.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<n> it = this.mMenuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<com.amazon.aps.iva.o3.a<c0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new c0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator<n> it = this.mMenuHostHelper.b.iterator();
            while (it.hasNext()) {
                it.next().b(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        g0 g0Var = this.mViewModelStore;
        if (g0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            g0Var = dVar.b;
        }
        if (g0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.a = onRetainCustomNonConfigurationInstance;
        dVar2.b = g0Var;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.c3.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.g lifecycle = getLifecycle();
        if (lifecycle instanceof k) {
            ((k) lifecycle).e(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<com.amazon.aps.iva.o3.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    public final <I, O> com.amazon.aps.iva.h.c<I> registerForActivityResult(com.amazon.aps.iva.i.a<I, O> aVar, androidx.activity.result.a aVar2, com.amazon.aps.iva.h.b<O> bVar) {
        return aVar2.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // com.amazon.aps.iva.p3.i
    public void removeMenuProvider(n nVar) {
        this.mMenuHostHelper.c(nVar);
    }

    @Override // com.amazon.aps.iva.d3.b
    public final void removeOnConfigurationChangedListener(com.amazon.aps.iva.o3.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(com.amazon.aps.iva.g.b bVar) {
        com.amazon.aps.iva.g.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        com.amazon.aps.iva.yb0.j.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        aVar.a.remove(bVar);
    }

    @Override // com.amazon.aps.iva.c3.z
    public final void removeOnMultiWindowModeChangedListener(com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(com.amazon.aps.iva.o3.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // com.amazon.aps.iva.c3.a0
    public final void removeOnPictureInPictureModeChangedListener(com.amazon.aps.iva.o3.a<c0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // com.amazon.aps.iva.d3.c
    public final void removeOnTrimMemoryListener(com.amazon.aps.iva.o3.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (com.amazon.aps.iva.z8.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            l lVar = this.mFullyDrawnReporter;
            synchronized (lVar.c) {
                lVar.d = true;
                Iterator it = lVar.e.iterator();
                while (it.hasNext()) {
                    ((com.amazon.aps.iva.xb0.a) it.next()).invoke();
                }
                lVar.e.clear();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.D(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new com.amazon.aps.iva.c3.k(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<com.amazon.aps.iva.o3.a<c0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new c0(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> com.amazon.aps.iva.h.c<I> registerForActivityResult(com.amazon.aps.iva.i.a<I, O> aVar, com.amazon.aps.iva.h.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.D(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(n nVar, com.amazon.aps.iva.i5.o oVar) {
        this.mMenuHostHelper.a(nVar, oVar);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(n nVar, com.amazon.aps.iva.i5.o oVar, g.b bVar) {
        this.mMenuHostHelper.b(nVar, oVar, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.D(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
