package e.d.d.w;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public class p0 implements Runnable {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f7695b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f7696c;

    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {
        @Nullable
        public p0 a;

        public a(p0 p0Var) {
            this.a = p0Var;
        }

        public void a() {
            p0.a();
            this.a.f7696c.f4737h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            p0 p0Var = this.a;
            if (p0Var != null && p0Var.b()) {
                p0.a();
                p0 p0Var2 = this.a;
                p0Var2.f7696c.b(p0Var2, 0L);
                this.a.f7696c.f4737h.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public p0(FirebaseMessaging firebaseMessaging, long j2) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f7696c = firebaseMessaging;
        this.a = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f4737h.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f7695b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f7696c.f4737h.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public boolean c() throws IOException {
        boolean z = true;
        try {
            if (this.f7696c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e2.getMessage();
                e.a.d.a.a.N(new StringBuilder(String.valueOf(message2).length() + 52), "Token retrieval failed: ", message2, ". Will retry token retrieval", "FirebaseMessaging");
                return false;
            } else if (e2.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (l0.a().c(this.f7696c.f4737h)) {
            this.f7695b.acquire();
        }
        try {
            try {
                this.f7696c.f(true);
                if (!this.f7696c.o.d()) {
                    this.f7696c.f(false);
                    if (!l0.a().c(this.f7696c.f4737h)) {
                        return;
                    }
                } else if (!l0.a().b(this.f7696c.f4737h) || b()) {
                    if (c()) {
                        this.f7696c.f(false);
                    } else {
                        this.f7696c.h(this.a);
                    }
                    if (!l0.a().c(this.f7696c.f4737h)) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!l0.a().c(this.f7696c.f4737h)) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb.toString());
                this.f7696c.f(false);
                if (!l0.a().c(this.f7696c.f4737h)) {
                    return;
                }
            }
            this.f7695b.release();
        } catch (Throwable th) {
            if (l0.a().c(this.f7696c.f4737h)) {
                this.f7695b.release();
            }
            throw th;
        }
    }
}
