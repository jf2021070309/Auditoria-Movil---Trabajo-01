package e.d.d.w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes2.dex */
public class b1 implements ServiceConnection {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f7631b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f7632c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<a> f7633d;

    /* renamed from: e  reason: collision with root package name */
    public y0 f7634e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7635f;

    /* loaded from: classes2.dex */
    public static class a {
        public final Intent a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f7636b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.a = intent;
        }

        public void a() {
            this.f7636b.trySetResult(null);
        }
    }

    public b1(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f7633d = new ArrayDeque();
        this.f7635f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f7631b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f7632c = scheduledThreadPoolExecutor;
    }

    public final void a() {
        while (!this.f7633d.isEmpty()) {
            this.f7633d.poll().a();
        }
    }

    public final synchronized void b() {
        Log.isLoggable("FirebaseMessaging", 3);
        while (!this.f7633d.isEmpty()) {
            Log.isLoggable("FirebaseMessaging", 3);
            y0 y0Var = this.f7634e;
            if (y0Var == null || !y0Var.isBinderAlive()) {
                Log.isLoggable("FirebaseMessaging", 3);
                if (!this.f7635f) {
                    this.f7635f = true;
                    try {
                    } catch (SecurityException e2) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e2);
                    }
                    if (!ConnectionTracker.getInstance().bindService(this.a, this.f7631b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f7635f = false;
                        a();
                    }
                }
                return;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            this.f7634e.a(this.f7633d.poll());
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            valueOf.length();
            "onServiceConnected: ".concat(valueOf);
        }
        this.f7635f = false;
        if (iBinder instanceof y0) {
            this.f7634e = (y0) iBinder;
            b();
            return;
        }
        String valueOf2 = String.valueOf(iBinder);
        valueOf2.length();
        Log.e("FirebaseMessaging", "Invalid service connection: ".concat(valueOf2));
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            valueOf.length();
            "onServiceDisconnected: ".concat(valueOf);
        }
        b();
    }
}
