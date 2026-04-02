package e.d.d.w;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public class t0 {
    public static final long a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f7709b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7710c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f7711d;

    /* renamed from: e  reason: collision with root package name */
    public final z f7712e;

    /* renamed from: f  reason: collision with root package name */
    public final FirebaseMessaging f7713f;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledExecutorService f7715h;

    /* renamed from: j  reason: collision with root package name */
    public final r0 f7717j;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f7714g = new c.f.a();

    /* renamed from: i  reason: collision with root package name */
    public boolean f7716i = false;

    public t0(FirebaseMessaging firebaseMessaging, d0 d0Var, r0 r0Var, z zVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7713f = firebaseMessaging;
        this.f7711d = d0Var;
        this.f7717j = r0Var;
        this.f7712e = zVar;
        this.f7710c = context;
        this.f7715h = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final void b(String str) throws IOException {
        z zVar = this.f7712e;
        String a2 = this.f7713f.a();
        Objects.requireNonNull(zVar);
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str);
        a(zVar.a(zVar.c(a2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    public final void c(String str) throws IOException {
        z zVar = this.f7712e;
        String a2 = this.f7713f.a();
        Objects.requireNonNull(zVar);
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str);
        a(zVar.a(zVar.c(a2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    public synchronized void e(boolean z) {
        this.f7716i = z;
    }

    public boolean f() throws IOException {
        char c2;
        while (true) {
            synchronized (this) {
                q0 a2 = this.f7717j.a();
                boolean z = true;
                if (a2 == null) {
                    d();
                    return true;
                }
                try {
                    String str = a2.f7698c;
                    int hashCode = str.hashCode();
                    if (hashCode != 83) {
                        if (hashCode == 85 && str.equals("U")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    } else {
                        if (str.equals("S")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    }
                    if (c2 == 0) {
                        b(a2.f7697b);
                        if (d()) {
                            String.valueOf(a2.f7697b).length();
                        }
                    } else if (c2 == 1) {
                        c(a2.f7697b);
                        if (d()) {
                            String.valueOf(a2.f7697b).length();
                        }
                    } else if (d()) {
                        a2.toString().length();
                    }
                } catch (IOException e2) {
                    if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 53);
                        sb.append("Topic operation failed: ");
                        sb.append(message);
                        sb.append(". Will retry Topic operation.");
                        Log.e("FirebaseMessaging", sb.toString());
                    } else if (e2.getMessage() != null) {
                        throw e2;
                    } else {
                        Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    }
                    z = false;
                }
                if (!z) {
                    return false;
                }
                r0 r0Var = this.f7717j;
                synchronized (r0Var) {
                    final n0 n0Var = r0Var.f7703c;
                    String str2 = a2.f7699d;
                    synchronized (n0Var.f7689d) {
                        if (n0Var.f7689d.remove(str2)) {
                            n0Var.f7690e.execute(new Runnable() { // from class: e.d.d.w.m0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    n0 n0Var2 = n0.this;
                                    synchronized (n0Var2.f7689d) {
                                        SharedPreferences.Editor edit = n0Var2.a.edit();
                                        String str3 = n0Var2.f7687b;
                                        StringBuilder sb2 = new StringBuilder();
                                        Iterator<String> it = n0Var2.f7689d.iterator();
                                        while (it.hasNext()) {
                                            sb2.append(it.next());
                                            sb2.append(n0Var2.f7688c);
                                        }
                                        edit.putString(str3, sb2.toString()).commit();
                                    }
                                }
                            });
                        }
                    }
                }
                synchronized (this.f7714g) {
                    String str3 = a2.f7699d;
                    if (this.f7714g.containsKey(str3)) {
                        ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f7714g.get(str3);
                        TaskCompletionSource<Void> poll = arrayDeque.poll();
                        if (poll != null) {
                            poll.setResult(null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.f7714g.remove(str3);
                        }
                    }
                }
            }
        }
    }

    public void g(long j2) {
        this.f7715h.schedule(new u0(this, this.f7710c, this.f7711d, Math.min(Math.max(30L, j2 + j2), a)), j2, TimeUnit.SECONDS);
        e(true);
    }
}
