package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.components.Component;
import com.google.firebase.components.zzf;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.internal.InternalTokenProvider;
import com.google.firebase.internal.InternalTokenResult;
import com.google.firebase.internal.zza;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class FirebaseApp {
    private final Context i;
    private final String j;
    private final FirebaseOptions k;
    private final zzf l;
    private final SharedPreferences m;
    private final Publisher n;
    private InternalTokenProvider u;
    private static final List<String> b = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> d = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    private static final List<String> e = Arrays.asList(new String[0]);
    private static final Set<String> f = Collections.emptySet();
    private static final Object g = new Object();
    private static final Executor h = new b((byte) 0);
    static final Map<String, FirebaseApp> a = new ArrayMap();
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean();
    private final List<IdTokenListener> r = new CopyOnWriteArrayList();
    private final List<BackgroundStateChangeListener> s = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> t = new CopyOnWriteArrayList();
    private IdTokenListenersCountChangedListener v = new zza();
    private final AtomicBoolean q = new AtomicBoolean(b());

    /* loaded from: classes2.dex */
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface IdTokenListener {
        void onIdTokenChanged(InternalTokenResult internalTokenResult);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface IdTokenListenersCountChangedListener {
        void onListenerCountChanged(int i);
    }

    public Context getApplicationContext() {
        c();
        return this.i;
    }

    public String getName() {
        c();
        return this.j;
    }

    public FirebaseOptions getOptions() {
        c();
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.j.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.j).add("options", this.k).toString();
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (g) {
            arrayList = new ArrayList(a.values());
        }
        return arrayList;
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (g) {
            firebaseApp = a.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        List<String> d2;
        String str2;
        synchronized (g) {
            firebaseApp = a.get(str.trim());
            if (firebaseApp == null) {
                if (d().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", d2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp initializeApp(Context context) {
        FirebaseApp initializeApp;
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                initializeApp = getInstance();
            } else {
                FirebaseOptions fromResource = FirebaseOptions.fromResource(context);
                if (fromResource == null) {
                    Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    initializeApp = null;
                } else {
                    initializeApp = initializeApp(context, fromResource);
                }
            }
        }
        return initializeApp;
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, "[DEFAULT]");
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        a.a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (g) {
            Preconditions.checkState(!a.containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, firebaseOptions);
            a.put(trim, firebaseApp);
        }
        firebaseApp.e();
        return firebaseApp;
    }

    @Deprecated
    public void setTokenProvider(InternalTokenProvider internalTokenProvider) {
        this.u = (InternalTokenProvider) Preconditions.checkNotNull(internalTokenProvider);
    }

    @Deprecated
    public void setIdTokenListenersCountChangedListener(IdTokenListenersCountChangedListener idTokenListenersCountChangedListener) {
        this.v = (IdTokenListenersCountChangedListener) Preconditions.checkNotNull(idTokenListenersCountChangedListener);
        this.v.onListenerCountChanged(this.r.size());
    }

    @Deprecated
    public Task<GetTokenResult> getToken(boolean z) {
        c();
        return this.u == null ? Tasks.forException(new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode.")) : this.u.getAccessToken(z);
    }

    @Deprecated
    public String getUid() {
        c();
        if (this.u == null) {
            throw new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode.");
        }
        return this.u.getUid();
    }

    public void delete() {
        if (this.p.compareAndSet(false, true)) {
            synchronized (g) {
                a.remove(this.j);
            }
            Iterator<FirebaseAppLifecycleListener> it = this.t.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public <T> T get(Class<T> cls) {
        c();
        return (T) this.l.get(cls);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        c();
        if (this.o.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                a(true);
            } else if (!z && isInBackground) {
                a(false);
            }
        }
    }

    public boolean isDataCollectionDefaultEnabled() {
        c();
        return this.q.get();
    }

    public void setDataCollectionDefaultEnabled(boolean z) {
        c();
        if (this.q.compareAndSet(!z, z)) {
            this.m.edit().putBoolean("firebase_data_collection_default_enabled", z).commit();
            this.n.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    private FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        this.i = (Context) Preconditions.checkNotNull(context);
        this.j = Preconditions.checkNotEmpty(str);
        this.k = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        this.m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.l = new zzf(h, Component.AnonymousClass1.zza(context).zza(), Component.of(context, Context.class, new Class[0]), Component.of(this, FirebaseApp.class, new Class[0]), Component.of(firebaseOptions, FirebaseOptions.class, new Class[0]));
        this.n = (Publisher) this.l.get(Publisher.class);
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        if (this.m.contains("firebase_data_collection_default_enabled")) {
            return this.m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.i.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException e2) {
            return true;
        }
    }

    private void c() {
        Preconditions.checkState(!this.p.get(), "FirebaseApp was deleted");
    }

    @Deprecated
    public List<IdTokenListener> getListeners() {
        c();
        return this.r;
    }

    public boolean isDefaultApp() {
        return "[DEFAULT]".equals(getName());
    }

    @Deprecated
    public void notifyIdTokenListeners(InternalTokenResult internalTokenResult) {
        Log.d("FirebaseApp", "Notifying auth state listeners.");
        int i = 0;
        for (IdTokenListener idTokenListener : this.r) {
            idTokenListener.onIdTokenChanged(internalTokenResult);
            i++;
        }
        Log.d("FirebaseApp", String.format("Notified %d auth state listeners.", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (BackgroundStateChangeListener backgroundStateChangeListener : this.s) {
            backgroundStateChangeListener.onBackgroundStateChanged(z);
        }
    }

    @Deprecated
    public void addIdTokenListener(IdTokenListener idTokenListener) {
        c();
        Preconditions.checkNotNull(idTokenListener);
        this.r.add(idTokenListener);
        this.v.onListenerCountChanged(this.r.size());
    }

    @Deprecated
    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        c();
        Preconditions.checkNotNull(idTokenListener);
        this.r.remove(idTokenListener);
        this.v.onListenerCountChanged(this.r.size());
    }

    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        c();
        if (this.o.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.s.add(backgroundStateChangeListener);
    }

    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        c();
        this.s.remove(backgroundStateChangeListener);
    }

    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        c();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.t.add(firebaseAppLifecycleListener);
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        c();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.t.remove(firebaseAppLifecycleListener);
    }

    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    private static List<String> d() {
        ArrayList arrayList = new ArrayList();
        synchronized (g) {
            for (FirebaseApp firebaseApp : a.values()) {
                arrayList.add(firebaseApp.getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean isDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.i);
        if (isDeviceProtectedStorage) {
            c.a(this.i);
        } else {
            this.l.zza(isDefaultApp());
        }
        a(FirebaseApp.class, this, b, isDeviceProtectedStorage);
        if (isDefaultApp()) {
            a(FirebaseApp.class, this, c, isDeviceProtectedStorage);
            a(Context.class, this.i, d, isDeviceProtectedStorage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                } catch (ClassNotFoundException e2) {
                    if (f.contains(str)) {
                        throw new IllegalStateException(str + " is missing, but is required. Check if it has been removed by Proguard.");
                    }
                    Log.d("FirebaseApp", str + " is not linked. Skipping initialization.");
                } catch (IllegalAccessException e3) {
                    Log.wtf("FirebaseApp", "Failed to initialize " + str, e3);
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException(str + "#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                } catch (InvocationTargetException e5) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e5);
                }
                if (e.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {
        private static AtomicReference<c> a = new AtomicReference<>();
        private final Context b;

        private c(Context context) {
            this.b = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.g) {
                for (FirebaseApp firebaseApp : FirebaseApp.a.values()) {
                    firebaseApp.e();
                }
            }
            this.b.unregisterReceiver(this);
        }

        static /* synthetic */ void a(Context context) {
            if (a.get() != null) {
                return;
            }
            c cVar = new c(context);
            if (!a.compareAndSet(null, cVar)) {
                return;
            }
            context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<a> a = new AtomicReference<>();

        private a() {
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.g) {
                Iterator it = new ArrayList(FirebaseApp.a.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.o.get()) {
                        firebaseApp.a(z);
                    }
                }
            }
        }

        static /* synthetic */ void a(Context context) {
            if (!PlatformVersion.isAtLeastIceCreamSandwich() || !(context.getApplicationContext() instanceof Application)) {
                return;
            }
            Application application = (Application) context.getApplicationContext();
            if (a.get() != null) {
                return;
            }
            a aVar = new a();
            if (!a.compareAndSet(null, aVar)) {
                return;
            }
            BackgroundDetector.initialize(application);
            BackgroundDetector.getInstance().addListener(aVar);
        }
    }

    /* loaded from: classes2.dex */
    static class b implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.post(runnable);
        }
    }
}
