package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import c.a.f;
import c.a.h.d.a;
import c.i.c.c;
import c.i.c.d;
import c.i.c.h;
import c.i.k.k;
import c.p.c0;
import c.p.e0;
import c.p.i0;
import c.p.j;
import c.p.m0;
import c.p.n;
import c.p.n0;
import c.p.p;
import c.p.r;
import c.t.m;
import c.w.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ComponentActivity extends h implements p, n0, c.w.c, f, c.a.h.c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final c.a.g.a mContextAwareHelper;
    private i0 mDefaultFactory;
    private final r mLifecycleRegistry;
    private final k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final c.w.b mSavedStateRegistryController;
    private m0 mViewModelStore;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a.C0011a f78b;

            public a(int i2, a.C0011a c0011a) {
                this.a = i2;
                this.f78b = c0011a;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.a.h.a<?> aVar;
                b bVar = b.this;
                int i2 = this.a;
                Object obj = this.f78b.a;
                String str = bVar.f93b.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                ActivityResultRegistry.c<?> cVar = bVar.f97f.get(str);
                if (cVar == null || (aVar = cVar.a) == null) {
                    bVar.f99h.remove(str);
                    bVar.f98g.put(str, obj);
                } else if (bVar.f96e.remove(str)) {
                    aVar.a(obj);
                }
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0001b implements Runnable {
            public final /* synthetic */ int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f80b;

            public RunnableC0001b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.a = i2;
                this.f80b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f80b));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void b(int i2, c.a.h.d.a<I, O> aVar, I i3, d dVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0011a<O> b2 = aVar.b(componentActivity, i3);
            if (b2 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b2));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else if (dVar != null) {
                throw null;
            } else {
                bundle = null;
            }
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                    int i4 = c.i.c.c.f1944c;
                    componentActivity.startActivityForResult(a2, i2, bundle);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = intentSenderRequest.a;
                    Intent intent = intentSenderRequest.f109b;
                    int i5 = intentSenderRequest.f110c;
                    int i6 = intentSenderRequest.f111d;
                    int i7 = c.i.c.c.f1944c;
                    componentActivity.startIntentSenderForResult(intentSender, i2, intent, i5, i6, 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0001b(i2, e2));
                    return;
                }
            }
            String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            int i8 = c.i.c.c.f1944c;
            for (String str : stringArrayExtra) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(e.a.d.a.a.r(e.a.d.a.a.y("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (componentActivity instanceof c.b) {
                    ((c.b) componentActivity).validateRequestPermissionsRequestCode(i2);
                }
                componentActivity.requestPermissions(stringArrayExtra, i2);
            } else if (componentActivity instanceof c.a) {
                new Handler(Looper.getMainLooper()).post(new c.i.c.a(stringArrayExtra, componentActivity, i2));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public m0 f82b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new c.a.g.a();
        this.mMenuHostHelper = new k(new Runnable() { // from class: c.a.a
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new r(this);
        this.mSavedStateRegistryController = new c.w.b(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.3
            @Override // c.p.n
            public void c(p pVar, j.a aVar) {
                if (aVar == j.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.4
            @Override // c.p.n
            public void c(p pVar, j.a aVar) {
                if (aVar == j.a.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.f685b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.5
            @Override // c.p.n
            public void c(p pVar, j.a aVar) {
                ComponentActivity.this.ensureViewModelStore();
                r rVar = (r) ComponentActivity.this.getLifecycle();
                rVar.d("removeObserver");
                rVar.f2466b.e(this);
            }
        });
        if (i2 <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new a.b() { // from class: c.a.c
            @Override // c.w.a.b
            public final Bundle a() {
                return ComponentActivity.this.r();
            }
        });
        addOnContextAvailableListener(new c.a.g.b() { // from class: c.a.b
            @Override // c.a.g.b
            public final void a(Context context) {
                ComponentActivity.this.s(context);
            }
        });
    }

    public ComponentActivity(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(c.i.k.n nVar) {
        k kVar = this.mMenuHostHelper;
        kVar.f2188b.add(nVar);
        kVar.a.run();
    }

    public void addMenuProvider(final c.i.k.n nVar, p pVar) {
        final k kVar = this.mMenuHostHelper;
        kVar.f2188b.add(nVar);
        kVar.a.run();
        j lifecycle = pVar.getLifecycle();
        k.a remove = kVar.f2189c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        kVar.f2189c.put(nVar, new k.a(lifecycle, new n() { // from class: c.i.k.b
            @Override // c.p.n
            public final void c(c.p.p pVar2, j.a aVar) {
                k kVar2 = k.this;
                n nVar2 = nVar;
                Objects.requireNonNull(kVar2);
                if (aVar == j.a.ON_DESTROY) {
                    kVar2.a(nVar2);
                }
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final c.i.k.n nVar, p pVar, final j.b bVar) {
        final k kVar = this.mMenuHostHelper;
        Objects.requireNonNull(kVar);
        j lifecycle = pVar.getLifecycle();
        k.a remove = kVar.f2189c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        kVar.f2189c.put(nVar, new k.a(lifecycle, new n() { // from class: c.i.k.a
            @Override // c.p.n
            public final void c(c.p.p pVar2, j.a aVar) {
                k kVar2 = k.this;
                j.b bVar2 = bVar;
                n nVar2 = nVar;
                Objects.requireNonNull(kVar2);
                if (aVar == j.a.upTo(bVar2)) {
                    kVar2.f2188b.add(nVar2);
                    kVar2.a.run();
                } else if (aVar == j.a.ON_DESTROY) {
                    kVar2.a(nVar2);
                } else if (aVar == j.a.downFrom(bVar2)) {
                    kVar2.f2188b.remove(nVar2);
                    kVar2.a.run();
                }
            }
        }));
    }

    public final void addOnContextAvailableListener(c.a.g.b bVar) {
        c.a.g.a aVar = this.mContextAwareHelper;
        if (aVar.f685b != null) {
            bVar.a(aVar.f685b);
        }
        aVar.a.add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.f82b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new m0();
            }
        }
    }

    @Override // c.a.h.c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public i0 getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new e0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // c.i.c.h, c.p.p
    public j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // c.a.f
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // c.w.c
    public final c.w.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2831b;
    }

    @Override // c.p.n0
    public m0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.mActivityResultRegistry.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.a();
    }

    @Override // c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.a(bundle);
        c.a.g.a aVar = this.mContextAwareHelper;
        aVar.f685b = this;
        for (c.a.g.b bVar : aVar.a) {
            bVar.a(this);
        }
        super.onCreate(bundle);
        c0.c(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        k kVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<c.i.k.n> it = kVar.f2188b.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        Iterator<c.i.k.n> it = this.mMenuHostHelper.f2188b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        m0 m0Var = this.mViewModelStore;
        if (m0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            m0Var = cVar.f82b;
        }
        if (m0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = onRetainCustomNonConfigurationInstance;
        cVar2.f82b = m0Var;
        return cVar2;
    }

    @Override // c.i.c.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        j lifecycle = getLifecycle();
        if (lifecycle instanceof r) {
            ((r) lifecycle).i(j.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f685b;
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
        Objects.requireNonNull(activityResultRegistry);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.f94c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.f94c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f96e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f99h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.a);
        return bundle;
    }

    public final <I, O> c.a.h.b<I> registerForActivityResult(c.a.h.d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, c.a.h.a<O> aVar2) {
        StringBuilder y = e.a.d.a.a.y("activity_rq#");
        y.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.d(y.toString(), this, aVar, aVar2);
    }

    public final <I, O> c.a.h.b<I> registerForActivityResult(c.a.h.d.a<I, O> aVar, c.a.h.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void removeMenuProvider(c.i.k.n nVar) {
        this.mMenuHostHelper.a(nVar);
    }

    public final void removeOnContextAvailableListener(c.a.g.b bVar) {
        this.mContextAwareHelper.a.remove(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (m.t()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19) {
                super.reportFullyDrawn();
            } else if (i2 == 19 && c.i.d.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void s(Context context) {
        Bundle a2 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
            Objects.requireNonNull(activityResultRegistry);
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            activityResultRegistry.f96e = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            activityResultRegistry.a = (Random) a2.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            activityResultRegistry.f99h.putAll(a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                String str = stringArrayList.get(i2);
                if (activityResultRegistry.f94c.containsKey(str)) {
                    Integer remove = activityResultRegistry.f94c.remove(str);
                    if (!activityResultRegistry.f99h.containsKey(str)) {
                        activityResultRegistry.f93b.remove(remove);
                    }
                }
                int intValue = integerArrayList.get(i2).intValue();
                String str2 = stringArrayList.get(i2);
                activityResultRegistry.f93b.put(Integer.valueOf(intValue), str2);
                activityResultRegistry.f94c.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
