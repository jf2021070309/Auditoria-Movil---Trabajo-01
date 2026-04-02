package com.amazon.aps.iva.t5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.amazon.aps.iva.b6.x0;
import com.amazon.aps.iva.b6.y0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes.dex */
public final class t {
    public static t e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<a>> b = new CopyOnWriteArrayList<>();
    public final Object c = new Object();
    public int d = 0;

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i;
            int i2;
            t tVar;
            Executor mainExecutor;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i = 1;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i = type != 9 ? 8 : 7;
                                    }
                                    i = 5;
                                }
                            }
                            i = 2;
                        }
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (g0.a >= 29) {
                                    i = 9;
                                    break;
                                }
                                break;
                        }
                    }
                } catch (SecurityException unused) {
                }
                i2 = g0.a;
                tVar = t.this;
                if (i2 < 31 && i == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        s sVar = new s(tVar);
                        mainExecutor = context.getMainExecutor();
                        x0.e(telephonyManager, mainExecutor, sVar);
                        y0.d(telephonyManager, sVar);
                        return;
                    } catch (RuntimeException unused2) {
                        t.a(tVar, 5);
                        return;
                    }
                }
                t.a(tVar, i);
            }
            i = 0;
            i2 = g0.a;
            tVar = t.this;
            if (i2 < 31) {
            }
            t.a(tVar, i);
        }
    }

    public t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new b(), intentFilter);
    }

    public static void a(t tVar, int i) {
        synchronized (tVar.c) {
            if (tVar.d != i) {
                tVar.d = i;
                Iterator<WeakReference<a>> it = tVar.b.iterator();
                while (it.hasNext()) {
                    WeakReference<a> next = it.next();
                    a aVar = next.get();
                    if (aVar != null) {
                        aVar.a(i);
                    } else {
                        tVar.b.remove(next);
                    }
                }
            }
        }
    }

    public static synchronized t b(Context context) {
        t tVar;
        synchronized (t.class) {
            if (e == null) {
                e = new t(context);
            }
            tVar = e;
        }
        return tVar;
    }
}
