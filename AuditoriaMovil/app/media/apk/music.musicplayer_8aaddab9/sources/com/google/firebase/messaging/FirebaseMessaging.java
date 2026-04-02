package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e.d.b.b.g;
import e.d.d.f;
import e.d.d.q.b;
import e.d.d.q.d;
import e.d.d.s.a.a;
import e.d.d.u.h;
import e.d.d.w.d0;
import e.d.d.w.j0;
import e.d.d.w.n;
import e.d.d.w.o0;
import e.d.d.w.p0;
import e.d.d.w.t0;
import e.d.d.w.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public class FirebaseMessaging {
    public static final long a = TimeUnit.HOURS.toSeconds(8);
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: b  reason: collision with root package name */
    public static o0 f4731b;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: c  reason: collision with root package name */
    public static g f4732c;
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: d  reason: collision with root package name */
    public static ScheduledExecutorService f4733d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.g f4734e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.s.a.a f4735f;

    /* renamed from: g  reason: collision with root package name */
    public final h f4736g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f4737h;

    /* renamed from: i  reason: collision with root package name */
    public final z f4738i;

    /* renamed from: j  reason: collision with root package name */
    public final j0 f4739j;

    /* renamed from: k  reason: collision with root package name */
    public final a f4740k;

    /* renamed from: l  reason: collision with root package name */
    public final Executor f4741l;

    /* renamed from: m  reason: collision with root package name */
    public final Executor f4742m;

    /* renamed from: n  reason: collision with root package name */
    public final Task<t0> f4743n;
    public final d0 o;
    @GuardedBy("this")
    public boolean p;
    public final Application.ActivityLifecycleCallbacks q;

    /* loaded from: classes2.dex */
    public class a {
        public final d a;
        @GuardedBy("this")

        /* renamed from: b  reason: collision with root package name */
        public boolean f4744b;
        @GuardedBy("this")

        /* renamed from: c  reason: collision with root package name */
        public b<f> f4745c;
        @GuardedBy("this")

        /* renamed from: d  reason: collision with root package name */
        public Boolean f4746d;

        public a(d dVar) {
            this.a = dVar;
        }

        public synchronized void a() {
            if (this.f4744b) {
                return;
            }
            Boolean c2 = c();
            this.f4746d = c2;
            if (c2 == null) {
                b<f> bVar = new b() { // from class: e.d.d.w.v
                    @Override // e.d.d.q.b
                    public final void a(e.d.d.q.a aVar) {
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        if (aVar2.b()) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            o0 o0Var = FirebaseMessaging.f4731b;
                            firebaseMessaging.g();
                        }
                    }
                };
                this.f4745c = bVar;
                this.a.a(f.class, bVar);
            }
            this.f4744b = true;
        }

        public synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f4746d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f4734e.i();
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            e.d.d.g gVar = FirebaseMessaging.this.f4734e;
            gVar.a();
            Context context = gVar.f7040d;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(e.d.d.g gVar, e.d.d.s.a.a aVar, e.d.d.t.b<e.d.d.x.h> bVar, e.d.d.t.b<e.d.d.r.f> bVar2, h hVar, g gVar2, d dVar) {
        gVar.a();
        final d0 d0Var = new d0(gVar.f7040d);
        final z zVar = new z(gVar, d0Var, bVar, bVar2, hVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        this.p = false;
        f4732c = gVar2;
        this.f4734e = gVar;
        this.f4735f = aVar;
        this.f4736g = hVar;
        this.f4740k = new a(dVar);
        gVar.a();
        final Context context = gVar.f7040d;
        this.f4737h = context;
        n nVar = new n();
        this.q = nVar;
        this.o = d0Var;
        this.f4742m = newSingleThreadExecutor;
        this.f4738i = zVar;
        this.f4739j = new j0(newSingleThreadExecutor);
        this.f4741l = scheduledThreadPoolExecutor;
        gVar.a();
        Context context2 = gVar.f7040d;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(nVar);
        } else {
            String valueOf = String.valueOf(context2);
            e.a.d.a.a.N(new StringBuilder(valueOf.length() + 125), "Context ", valueOf, " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.", "FirebaseMessaging");
        }
        if (aVar != null) {
            aVar.b(new a.InterfaceC0162a(this) { // from class: e.d.d.w.s
            });
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: e.d.d.w.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                if (firebaseMessaging.f4740k.b()) {
                    firebaseMessaging.g();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i2 = t0.f7709b;
        Task<t0> call = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: e.d.d.w.s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                r0 r0Var;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                d0 d0Var2 = d0Var;
                z zVar2 = zVar;
                synchronized (r0.class) {
                    WeakReference<r0> weakReference = r0.a;
                    r0Var = weakReference != null ? weakReference.get() : null;
                    if (r0Var == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        r0 r0Var2 = new r0(sharedPreferences, scheduledExecutorService);
                        synchronized (r0Var2) {
                            r0Var2.f7703c = n0.a(sharedPreferences, "topic_operation_queue", scheduledExecutorService);
                        }
                        r0.a = new WeakReference<>(r0Var2);
                        r0Var = r0Var2;
                    }
                }
                return new t0(firebaseMessaging, d0Var2, r0Var, zVar2, context3, scheduledExecutorService);
            }
        });
        this.f4743n = call;
        call.addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: e.d.d.w.o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                boolean z;
                t0 t0Var = (t0) obj;
                if (FirebaseMessaging.this.f4740k.b()) {
                    if (t0Var.f7717j.a() != null) {
                        synchronized (t0Var) {
                            z = t0Var.f7716i;
                        }
                        if (z) {
                            return;
                        }
                        t0Var.g(0L);
                    }
                }
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: e.d.d.w.u
            /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r5 = this;
                    com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.this
                    android.content.Context r0 = r0.f4737h
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 == 0) goto Lb
                    goto Lc
                Lb:
                    r1 = r0
                Lc:
                    r2 = 0
                    java.lang.String r3 = "com.google.firebase.messaging"
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
                    java.lang.String r3 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r3, r2)
                    if (r1 == 0) goto L1c
                    goto L61
                L1c:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r2 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    if (r3 == 0) goto L45
                    java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    r4 = 128(0x80, float:1.794E-43)
                    android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    if (r2 == 0) goto L45
                    android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    if (r3 == 0) goto L45
                    boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    if (r3 == 0) goto L45
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                    goto L46
                L45:
                    r1 = 1
                L46:
                    boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
                    if (r2 != 0) goto L51
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                    goto L61
                L51:
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    e.d.d.w.f0 r3 = new e.d.d.w.f0
                    r3.<init>()
                    r3.run()
                    r2.getTask()
                L61:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: e.d.d.w.u.run():void");
            }
        });
    }

    public static synchronized o0 c(Context context) {
        o0 o0Var;
        synchronized (FirebaseMessaging.class) {
            if (f4731b == null) {
                f4731b = new o0(context);
            }
            o0Var = f4731b;
        }
        return o0Var;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(e.d.d.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            gVar.a();
            firebaseMessaging = (FirebaseMessaging) gVar.f7043g.a(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public String a() throws IOException {
        Task<String> task;
        e.d.d.s.a.a aVar = this.f4735f;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.a());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        final o0.a e3 = e();
        if (i(e3)) {
            final String b2 = d0.b(this.f4734e);
            final j0 j0Var = this.f4739j;
            synchronized (j0Var) {
                task = j0Var.f7679b.get(b2);
                if (task == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String valueOf = String.valueOf(b2);
                        if (valueOf.length() != 0) {
                            "Making new request for: ".concat(valueOf);
                        } else {
                            new String("Making new request for: ");
                        }
                    }
                    z zVar = this.f4738i;
                    task = zVar.a(zVar.c(d0.b(zVar.a), Marker.ANY_MARKER, new Bundle())).onSuccessTask(new Executor() { // from class: e.d.d.w.q
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            runnable.run();
                        }
                    }, new SuccessContinuation() { // from class: e.d.d.w.r
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            String str = b2;
                            o0.a aVar2 = e3;
                            String str2 = (String) obj;
                            o0 c2 = FirebaseMessaging.c(firebaseMessaging.f4737h);
                            String d2 = firebaseMessaging.d();
                            String a2 = firebaseMessaging.o.a();
                            synchronized (c2) {
                                String a3 = o0.a.a(str2, a2, System.currentTimeMillis());
                                if (a3 != null) {
                                    SharedPreferences.Editor edit = c2.a.edit();
                                    edit.putString(c2.a(d2, str), a3);
                                    edit.commit();
                                }
                            }
                            if (aVar2 == null || !str2.equals(aVar2.f7691b)) {
                                e.d.d.g gVar = firebaseMessaging.f4734e;
                                gVar.a();
                                if ("[DEFAULT]".equals(gVar.f7041e)) {
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        e.d.d.g gVar2 = firebaseMessaging.f4734e;
                                        gVar2.a();
                                        String valueOf2 = String.valueOf(gVar2.f7041e);
                                        if (valueOf2.length() != 0) {
                                            "Invoking onNewToken for app: ".concat(valueOf2);
                                        } else {
                                            new String("Invoking onNewToken for app: ");
                                        }
                                    }
                                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                    intent.putExtra("token", str2);
                                    new m(firebaseMessaging.f4737h).b(intent);
                                }
                            }
                            return Tasks.forResult(str2);
                        }
                    }).continueWithTask(j0Var.a, new Continuation() { // from class: e.d.d.w.i0
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task2) {
                            j0 j0Var2 = j0.this;
                            String str = b2;
                            synchronized (j0Var2) {
                                j0Var2.f7679b.remove(str);
                            }
                            return task2;
                        }
                    });
                    j0Var.f7679b.put(b2, task);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf2 = String.valueOf(b2);
                    if (valueOf2.length() != 0) {
                        "Joining ongoing request for: ".concat(valueOf2);
                    } else {
                        new String("Joining ongoing request for: ");
                    }
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e4) {
                throw new IOException(e4);
            }
        }
        return e3.f7691b;
    }

    public void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f4733d == null) {
                f4733d = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f4733d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final String d() {
        e.d.d.g gVar = this.f4734e;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f7041e) ? "" : this.f4734e.d();
    }

    public o0.a e() {
        o0.a b2;
        o0 c2 = c(this.f4737h);
        String d2 = d();
        String b3 = d0.b(this.f4734e);
        synchronized (c2) {
            b2 = o0.a.b(c2.a.getString(c2.a(d2, b3), null));
        }
        return b2;
    }

    public synchronized void f(boolean z) {
        this.p = z;
    }

    public final void g() {
        e.d.d.s.a.a aVar = this.f4735f;
        if (aVar != null) {
            aVar.c();
        } else if (i(e())) {
            synchronized (this) {
                if (!this.p) {
                    h(0L);
                }
            }
        }
    }

    public synchronized void h(long j2) {
        b(new p0(this, Math.min(Math.max(30L, j2 + j2), a)), j2);
        this.p = true;
    }

    public boolean i(o0.a aVar) {
        if (aVar != null) {
            if (!(System.currentTimeMillis() > aVar.f7693d + o0.a.a || !this.o.a().equals(aVar.f7692c))) {
                return false;
            }
        }
        return true;
    }
}
