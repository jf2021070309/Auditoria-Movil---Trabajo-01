package e.d.d.w;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zzi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.w.y0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class g extends Service {
    public final ExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    public Binder f7673b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7674c;

    /* renamed from: d  reason: collision with root package name */
    public int f7675d;

    /* renamed from: e  reason: collision with root package name */
    public int f7676e;

    /* loaded from: classes2.dex */
    public class a implements y0.a {
        public a() {
        }
    }

    public g() {
        zzi.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f7674c = new Object();
        this.f7676e = 0;
    }

    /* renamed from: a */
    public final void d(Intent intent) {
        if (intent != null) {
            synchronized (v0.f7726b) {
                if (v0.f7727c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    v0.f7727c.release();
                }
            }
        }
        synchronized (this.f7674c) {
            try {
                int i2 = this.f7676e - 1;
                this.f7676e = i2;
                if (i2 == 0) {
                    stopSelfResult(this.f7675d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public boolean c() {
        return false;
    }

    public final Task<Void> e(final Intent intent) {
        if (c()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.execute(new Runnable() { // from class: e.d.d.w.e
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                Intent intent2 = intent;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Objects.requireNonNull(gVar);
                try {
                    gVar.b(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.f7673b == null) {
            this.f7673b = new y0(new a());
        }
        return this.f7673b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.f7674c) {
            this.f7675d = i3;
            this.f7676e++;
        }
        Intent poll = l0.a().f7684e.poll();
        if (poll == null) {
            d(intent);
            return 2;
        }
        Task<Void> e2 = e(poll);
        if (e2.isComplete()) {
            d(intent);
            return 2;
        }
        e2.addOnCompleteListener(new Executor() { // from class: e.d.d.w.f
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OnCompleteListener() { // from class: e.d.d.w.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                g.this.d(intent);
            }
        });
        return 3;
    }
}
