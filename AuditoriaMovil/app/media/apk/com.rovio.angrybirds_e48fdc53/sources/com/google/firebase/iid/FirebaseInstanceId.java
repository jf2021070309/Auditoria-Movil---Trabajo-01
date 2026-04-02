package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public class FirebaseInstanceId {
    private static final long a = TimeUnit.HOURS.toSeconds(8);
    private static t b;
    private static ScheduledThreadPoolExecutor c;
    private final Executor d;
    private final FirebaseApp e;
    private final zzan f;
    private MessagingChannel g;
    private final n h;
    private final x i;
    private boolean j;
    private final a k;

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber) {
        this(firebaseApp, new zzan(firebaseApp.getApplicationContext()), ac.b(), ac.b(), subscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a {
        private final Subscriber c;
        private EventHandler<DataCollectionDefaultChange> d;
        private final boolean b = c();
        private Boolean e = b();

        a(Subscriber subscriber) {
            this.c = subscriber;
            if (this.e == null && this.b) {
                this.d = new EventHandler(this) { // from class: com.google.firebase.iid.aj
                    private final FirebaseInstanceId.a a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = this;
                    }

                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        FirebaseInstanceId.a aVar = this.a;
                        synchronized (aVar) {
                            if (aVar.a()) {
                                FirebaseInstanceId.this.j();
                            }
                        }
                    }
                };
                subscriber.subscribe(DataCollectionDefaultChange.class, this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final synchronized boolean a() {
            boolean z;
            if (this.e != null) {
                z = this.e.booleanValue();
            } else {
                z = this.b && FirebaseInstanceId.this.e.isDataCollectionDefaultEnabled();
            }
            return z;
        }

        final synchronized void a(boolean z) {
            if (this.d != null) {
                this.c.unsubscribe(DataCollectionDefaultChange.class, this.d);
                this.d = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.e.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.j();
            }
            this.e = Boolean.valueOf(z);
        }

        private final Boolean b() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseInstanceId.this.e.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            return null;
        }

        private final boolean c() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException e) {
                Context applicationContext = FirebaseInstanceId.this.e.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, zzan zzanVar, Executor executor, Executor executor2, Subscriber subscriber) {
        this.j = false;
        if (zzan.zza(firebaseApp) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new t(firebaseApp.getApplicationContext());
            }
        }
        this.e = firebaseApp;
        this.f = zzanVar;
        if (this.g == null) {
            MessagingChannel messagingChannel = (MessagingChannel) firebaseApp.get(MessagingChannel.class);
            if (messagingChannel != null && messagingChannel.isAvailable()) {
                this.g = messagingChannel;
            } else {
                this.g = new ak(firebaseApp, zzanVar, executor);
            }
        }
        this.g = this.g;
        this.d = executor2;
        this.i = new x(b);
        this.k = new a(subscriber);
        this.h = new n(executor);
        if (this.k.a()) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        u b2 = b();
        if (!g() || b2 == null || b2.b(this.f.zzad()) || this.i.a()) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FirebaseApp a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        this.j = z;
    }

    private final synchronized void k() {
        if (!this.j) {
            a(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        a(new v(this, this.f, this.i, Math.min(Math.max(30L, j << 1), a)), j);
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public String getId() {
        j();
        return l();
    }

    private static String l() {
        return zzan.zza(b.b("").a());
    }

    public long getCreationTime() {
        return b.b("").b();
    }

    public Task<InstanceIdResult> getInstanceId() {
        return a(zzan.zza(this.e), "*");
    }

    private final Task<InstanceIdResult> a(final String str, final String str2) {
        final String c2 = c(str2);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.execute(new Runnable(this, str, str2, taskCompletionSource, c2) { // from class: com.google.firebase.iid.ag
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;
            private final TaskCompletionSource d;
            private final String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = taskCompletionSource;
                this.e = c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c, this.d, this.e);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void deleteInstanceId() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        a(this.g.deleteInstanceId(l()));
        e();
    }

    @Deprecated
    public String getToken() {
        u b2 = b();
        if (b2 == null || b2.b(this.f.zzad())) {
            k();
        }
        if (b2 != null) {
            return b2.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final u b() {
        return b(zzan.zza(this.e), "*");
    }

    private static u b(String str, String str2) {
        return b.a("", str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return getToken(zzan.zza(this.e), "*");
    }

    public String getToken(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((InstanceIdResult) a(a(str, str2))).getToken();
    }

    private final <T> T a(Task<T> task) {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    e();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public void deleteToken(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String c2 = c(str2);
        a(this.g.deleteToken(l(), u.a(b(str, c2)), str, c2));
        b.b("", str, c2);
    }

    public final synchronized Task<Void> zza(String str) {
        Task<Void> a2;
        a2 = this.i.a(str);
        k();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        u b2 = b();
        if (b2 == null || b2.b(this.f.zzad())) {
            throw new IOException("token not available");
        }
        a(this.g.subscribeToTopic(l(), b2.a, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str) {
        u b2 = b();
        if (b2 == null || b2.b(this.f.zzad())) {
            throw new IOException("token not available");
        }
        a(this.g.unsubscribeFromTopic(l(), b2.a, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        b.b();
        if (this.k.a()) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return this.g.isAvailable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.g.isChannelBuilt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        a(this.g.buildChannel(l(), u.a(b())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        b.c("");
        k();
    }

    public final boolean zzr() {
        return this.k.a();
    }

    public final void zzb(boolean z) {
        this.k.a(z);
    }

    private static String c(String str) {
        if (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) {
            return "*";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(final String str, String str2, final TaskCompletionSource taskCompletionSource, final String str3) {
        final String l = l();
        u b2 = b(str, str2);
        if (b2 != null && !b2.b(this.f.zzad())) {
            taskCompletionSource.setResult(new ap(l, b2.a));
            return;
        }
        final String a2 = u.a(b2);
        this.h.a(str, str3, new p(this, l, a2, str, str3) { // from class: com.google.firebase.iid.ah
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;
            private final String d;
            private final String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = l;
                this.c = a2;
                this.d = str;
                this.e = str3;
            }

            @Override // com.google.firebase.iid.p
            public final Task a() {
                return this.a.a(this.b, this.c, this.d, this.e);
            }
        }).addOnCompleteListener(this.d, new OnCompleteListener(this, str, str3, taskCompletionSource, l) { // from class: com.google.firebase.iid.ai
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;
            private final TaskCompletionSource d;
            private final String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = str;
                this.c = str3;
                this.d = taskCompletionSource;
                this.e = l;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.a.a(this.b, this.c, this.d, this.e, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2, TaskCompletionSource taskCompletionSource, String str3, Task task) {
        if (task.isSuccessful()) {
            String str4 = (String) task.getResult();
            b.a("", str, str2, str4, this.f.zzad());
            taskCompletionSource.setResult(new ap(str3, str4));
            return;
        }
        taskCompletionSource.setException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task a(String str, String str2, String str3, String str4) {
        return this.g.getToken(str, str2, str3, str4);
    }
}
