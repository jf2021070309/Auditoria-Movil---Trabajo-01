package com.amazon.aps.iva.f8;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import com.amazon.aps.iva.f8.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: RegisteredMediaRouteProviderWatcher.java */
/* loaded from: classes.dex */
public final class u0 {
    public final Context a;
    public final d b;
    public final PackageManager d;
    public boolean f;
    public final ArrayList<t0> e = new ArrayList<>();
    public final a g = new a();
    public final b h = new b();
    public final Handler c = new Handler();

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u0.this.a();
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u0.this.a();
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i);
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    public u0(Context context, f0.d dVar) {
        this.a = context;
        this.b = dVar;
        this.d = context.getPackageManager();
    }

    public final void a() {
        ArrayList<t0> arrayList;
        d dVar;
        boolean g;
        int i;
        boolean z;
        boolean z2;
        if (!this.f) {
            return;
        }
        ArrayList<ServiceInfo> arrayList2 = new ArrayList();
        int i2 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.d;
        if (i2 >= 30) {
            Intent intent = new Intent("android.media.MediaRoute2ProviderService");
            ArrayList arrayList3 = new ArrayList();
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                arrayList3.add(resolveInfo.serviceInfo);
            }
            arrayList2 = arrayList3;
        }
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.e;
            boolean z3 = true;
            dVar = this.b;
            if (!hasNext) {
                break;
            }
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null) {
                if (f0.c == null) {
                    g = false;
                } else {
                    g = f0.c().g();
                }
                if (g) {
                    if (!arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList2) {
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        ComponentName componentName = arrayList.get(i4).j;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    t0 t0Var = new t0(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    t0Var.q = new com.amazon.aps.iva.n4.e(4, this, t0Var);
                    if (!t0Var.m) {
                        t0Var.m = true;
                        t0Var.v();
                    }
                    i = i3 + 1;
                    arrayList.add(i3, t0Var);
                    ((f0.d) dVar).a(t0Var, false);
                } else if (i4 >= i3) {
                    t0 t0Var2 = arrayList.get(i4);
                    if (!t0Var2.m) {
                        t0Var2.m = true;
                        t0Var2.v();
                    }
                    if (t0Var2.o == null) {
                        if (!t0Var2.m || (t0Var2.f == null && t0Var2.l.isEmpty())) {
                            z3 = false;
                        }
                        if (z3) {
                            t0Var2.u();
                            t0Var2.r();
                        }
                    }
                    i = i3 + 1;
                    Collections.swap(arrayList, i4, i3);
                }
                i3 = i;
            }
        }
        if (i3 < arrayList.size()) {
            for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                t0 t0Var3 = arrayList.get(size2);
                ((f0.d) dVar).j(t0Var3);
                arrayList.remove(t0Var3);
                t0Var3.q = null;
                if (t0Var3.m) {
                    t0Var3.m = false;
                    t0Var3.v();
                }
            }
        }
    }
}
