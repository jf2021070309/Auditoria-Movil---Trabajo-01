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
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class u0 implements Runnable {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f7718b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f7719c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f7720d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f7721e;

    /* renamed from: f  reason: collision with root package name */
    public final PowerManager.WakeLock f7722f;

    /* renamed from: g  reason: collision with root package name */
    public final t0 f7723g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7724h;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public u0 a;

        public a(u0 u0Var) {
            this.a = u0Var;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            u0 u0Var = this.a;
            if (u0Var == null) {
                return;
            }
            if (u0Var.e()) {
                u0.a();
                u0 u0Var2 = this.a;
                u0Var2.f7723g.f7715h.schedule(u0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public u0(t0 t0Var, Context context, d0 d0Var, long j2) {
        this.f7723g = t0Var;
        this.f7720d = context;
        this.f7724h = j2;
        this.f7721e = d0Var;
        this.f7722f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (a) {
            Boolean bool = f7719c;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f7719c = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        str.length();
        return false;
    }

    public static boolean d(Context context) {
        boolean booleanValue;
        synchronized (a) {
            Boolean bool = f7718b;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f7718b = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean e() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f7720d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (d(this.f7720d)) {
            this.f7722f.acquire(b.a);
        }
        try {
            try {
                this.f7723g.e(true);
                if (!this.f7721e.d()) {
                    this.f7723g.e(false);
                    if (d(this.f7720d)) {
                        try {
                            this.f7722f.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                } else if (!b(this.f7720d) || e()) {
                    if (this.f7723g.f()) {
                        this.f7723g.e(false);
                    } else {
                        this.f7723g.g(this.f7724h);
                    }
                    if (d(this.f7720d)) {
                        try {
                            this.f7722f.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } else {
                    a aVar = new a(this);
                    a();
                    this.f7720d.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (d(this.f7720d)) {
                        try {
                            this.f7722f.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                }
            } catch (IOException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f7723g.e(false);
                if (d(this.f7720d)) {
                    try {
                        this.f7722f.release();
                    } catch (RuntimeException unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (d(this.f7720d)) {
                try {
                    this.f7722f.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}
