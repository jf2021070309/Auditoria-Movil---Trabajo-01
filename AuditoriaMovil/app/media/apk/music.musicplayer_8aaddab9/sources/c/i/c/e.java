package c.i.c;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class e {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f1945b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f1946c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f1947d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f1948e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f1949f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f1950g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ c a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f1951b;

        public a(c cVar, Object obj) {
            this.a = cVar;
            this.f1951b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a = this.f1951b;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f1952b;

        public b(Application application, c cVar) {
            this.a = application;
            this.f1952b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.unregisterActivityLifecycleCallbacks(this.f1952b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f1953b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1954c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1955d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1956e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1957f = false;

        public c(Activity activity) {
            this.f1953b = activity;
            this.f1954c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1953b == activity) {
                this.f1953b = null;
                this.f1956e = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
            r5.f1957f = true;
            r5.a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onActivityPaused(android.app.Activity r6) {
            /*
                r5 = this;
                boolean r0 = r5.f1956e
                if (r0 == 0) goto L42
                boolean r0 = r5.f1957f
                if (r0 != 0) goto L42
                boolean r0 = r5.f1955d
                if (r0 != 0) goto L42
                java.lang.Object r0 = r5.a
                int r1 = r5.f1954c
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = c.i.c.e.f1946c     // Catch: java.lang.Throwable -> L33
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L33
                if (r4 != r0) goto L3b
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L21
                goto L3b
            L21:
                java.lang.reflect.Field r0 = c.i.c.e.f1945b     // Catch: java.lang.Throwable -> L33
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
                android.os.Handler r0 = c.i.c.e.f1950g     // Catch: java.lang.Throwable -> L33
                c.i.c.f r1 = new c.i.c.f     // Catch: java.lang.Throwable -> L33
                r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L33
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L33
                r2 = 1
                goto L3b
            L33:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3b:
                if (r2 == 0) goto L42
                r5.f1957f = r3
                r6 = 0
                r5.a = r6
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.i.c.e.c.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1953b == activity) {
                this.f1955d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c.i.c.e.f1950g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            c.i.c.e.a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            c.i.c.e.f1945b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r2 = r0
        L33:
            c.i.c.e.f1946c = r2
            java.lang.Class<?> r2 = c.i.c.e.a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L40
        L3e:
            r2 = r0
            goto L55
        L40:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r7[r1] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3e
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
        L55:
            c.i.c.e.f1947d = r2
            java.lang.Class<?> r2 = c.i.c.e.a
            if (r2 != 0) goto L5d
        L5b:
            r2 = r0
            goto L6e
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5b
            r7[r1] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L5b
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
        L6e:
            c.i.c.e.f1948e = r2
            java.lang.Class<?> r2 = c.i.c.e.a
            boolean r4 = a()
            if (r4 == 0) goto Laf
            if (r2 != 0) goto L7b
            goto Laf
        L7b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Laf
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Laf
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Laf
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Laf
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Laf
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Laf
            r0 = r2
        Laf:
            c.i.c.e.f1949f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.c.e.<clinit>():void");
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f1949f == null) {
            return false;
        } else {
            if (f1948e == null && f1947d == null) {
                return false;
            }
            try {
                Object obj2 = f1946c.get(activity);
                if (obj2 == null || (obj = f1945b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                c cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f1950g;
                handler.post(new a(cVar, obj2));
                if (a()) {
                    Method method = f1949f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
