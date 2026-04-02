package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public final class jt extends BroadcastReceiver {
    private static jt c;
    boolean a;
    public boolean b;
    private boolean d;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {a, b, c, d};
    }

    private jt() {
        this.d = false;
        Context context = ka.a().a;
        this.d = context.checkCallingOrSelfPermission(g.b) == 0;
        this.b = a(context);
        if (this.d) {
            c();
        }
    }

    private boolean a(Context context) {
        if (!this.d || context == null) {
            return true;
        }
        d().getActiveNetworkInfo();
        NetworkInfo networkInfo = null;
        return 0 != 0 && networkInfo.isConnected();
    }

    private synchronized void c() {
        if (!this.a) {
            Context context = ka.a().a;
            this.b = a(context);
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.a = true;
        }
    }

    private static ConnectivityManager d() {
        return (ConnectivityManager) ka.a().a.getSystemService("connectivity");
    }

    public static synchronized jt a() {
        jt jtVar;
        synchronized (jt.class) {
            if (c == null) {
                c = new jt();
            }
            jtVar = c;
        }
        return jtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean a2 = a(context);
        if (this.b != a2) {
            this.b = a2;
            js jsVar = new js();
            jsVar.a = a2;
            jsVar.b = b();
            kk.a().a(jsVar);
        }
    }

    public final int b() {
        if (!this.d) {
            return a.a;
        }
        d().getActiveNetworkInfo();
        NetworkInfo networkInfo = null;
        if (0 == 0 || !networkInfo.isConnected()) {
            return a.a;
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                return a.d;
            case 1:
                return a.c;
            case 6:
            case 7:
            default:
                if (networkInfo.isConnected()) {
                    return a.b;
                }
                return a.a;
            case 8:
                return a.a;
        }
    }
}
