package e.d.d.w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e.d.d.w.b1;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
@KeepForSdk
/* loaded from: classes2.dex */
public class m {
    public static final Object a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public static b1 f7685b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7686c;

    public m(Context context) {
        this.f7686c = context;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        b1 b1Var;
        Task<Void> task;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (a) {
            if (f7685b == null) {
                f7685b = new b1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            b1Var = f7685b;
        }
        synchronized (b1Var) {
            Log.isLoggable("FirebaseMessaging", 3);
            final b1.a aVar = new b1.a(intent);
            ScheduledExecutorService scheduledExecutorService = b1Var.f7632c;
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: e.d.d.w.a1
                @Override // java.lang.Runnable
                public final void run() {
                    b1.a aVar2 = b1.a.this;
                    String action = aVar2.a.getAction();
                    StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                    sb.append("Service took too long to process intent: ");
                    sb.append(action);
                    sb.append(" App may get closed.");
                    Log.w("FirebaseMessaging", sb.toString());
                    aVar2.a();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            aVar.f7636b.getTask().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: e.d.d.w.z0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    schedule.cancel(false);
                }
            });
            b1Var.f7633d.add(aVar);
            b1Var.b();
            task = aVar.f7636b.getTask();
        }
        return task.continueWith(l.a, new Continuation() { // from class: e.d.d.w.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Object obj = m.a;
                return -1;
            }
        });
    }

    @KeepForSdk
    public Task<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f7686c;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return a(context, intent);
        }
        l lVar = l.a;
        return Tasks.call(lVar, new Callable() { // from class: e.d.d.w.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                Context context2 = context;
                Intent intent2 = intent;
                l0 a2 = l0.a();
                Objects.requireNonNull(a2);
                Log.isLoggable("FirebaseMessaging", 3);
                a2.f7684e.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (a2) {
                    str = a2.f7681b;
                    if (str == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    String valueOf = String.valueOf(context2.getPackageName());
                                    String valueOf2 = String.valueOf(serviceInfo.name);
                                    a2.f7681b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                } else {
                                    a2.f7681b = serviceInfo.name;
                                }
                                str = a2.f7681b;
                            }
                            String str3 = serviceInfo.packageName;
                            String str4 = serviceInfo.name;
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                            sb.append(str3);
                            sb.append("/");
                            sb.append(str4);
                            Log.e("FirebaseMessaging", sb.toString());
                            str = null;
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        if (str.length() != 0) {
                            "Restricting intent to a specific service: ".concat(str);
                        } else {
                            new String("Restricting intent to a specific service: ");
                        }
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if ((a2.c(context2) ? v0.a(context2, intent3) : context2.startService(intent3)) == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e2.toString()));
                    i2 = 402;
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).continueWithTask(lVar, new Continuation() { // from class: e.d.d.w.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? m.a(context, intent).continueWith(l.a, new Continuation() { // from class: e.d.d.w.j
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        Object obj = m.a;
                        return 403;
                    }
                }) : task;
            }
        });
    }
}
