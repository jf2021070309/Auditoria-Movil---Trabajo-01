package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.aps.iva.ab.g0;
import com.amazon.aps.iva.ab.l;
import com.amazon.aps.iva.ab.m;
import com.amazon.aps.iva.ab.n;
import com.amazon.aps.iva.ab.q;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.rs.j;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.ab.a {
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile n3 d;
    public Context e;
    public n3 f;
    public volatile zze g;
    public volatile q h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ExecutorService t;

    public a(Context context, f0 f0Var) {
        String w = w();
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        this.b = w;
        this.e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(w);
        zzv.zzi(this.e.getPackageName());
        this.f = new n3(this.e, (zzfm) zzv.zzc());
        if (f0Var == null) {
            zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.d = new n3(this.e, f0Var, this.f);
        this.s = false;
    }

    @SuppressLint({"PrivateApi"})
    public static String w() {
        try {
            return (String) com.amazon.aps.iva.bb.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void f() {
        this.f.g(w.W(12));
        try {
            this.d.h();
            if (this.h != null) {
                q qVar = this.h;
                synchronized (qVar.b) {
                    qVar.d = null;
                    qVar.c = true;
                }
            }
            if (this.h != null && this.g != null) {
                zzb.zzi("BillingClient", "Unbinding from service.");
                this.e.unbindService(this.h);
                this.h = null;
            }
            this.g = null;
            ExecutorService executorService = this.t;
            if (executorService != null) {
                executorService.shutdownNow();
                this.t = null;
            }
        } catch (Exception e) {
            zzb.zzk("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.a = 3;
        }
    }

    @Override // com.amazon.aps.iva.ab.a
    public final boolean k() {
        if (this.a == 2 && this.g != null && this.h != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d5 A[Catch: CancellationException -> 0x0401, TimeoutException -> 0x0403, Exception -> 0x041f, TryCatch #4 {CancellationException -> 0x0401, TimeoutException -> 0x0403, Exception -> 0x041f, blocks: (B:172:0x03c1, B:174:0x03d5, B:180:0x0405), top: B:195:0x03c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0405 A[Catch: CancellationException -> 0x0401, TimeoutException -> 0x0403, Exception -> 0x041f, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0401, TimeoutException -> 0x0403, Exception -> 0x041f, blocks: (B:172:0x03c1, B:174:0x03d5, B:180:0x0405), top: B:195:0x03c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    @Override // com.amazon.aps.iva.ab.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.c l(android.app.Activity r26, final com.android.billingclient.api.b r27) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.l(android.app.Activity, com.android.billingclient.api.b):com.android.billingclient.api.c");
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void n(e eVar, final com.amazon.aps.iva.ab.b bVar) {
        if (!k()) {
            n3 n3Var = this.f;
            c cVar = f.h;
            n3Var.f(w.V(2, 7, cVar));
            bVar.a(cVar, new ArrayList());
        } else if (!this.p) {
            zzb.zzj("BillingClient", "Querying product details is not supported.");
            n3 n3Var2 = this.f;
            c cVar2 = f.n;
            n3Var2.f(w.V(20, 7, cVar2));
            bVar.a(cVar2, new ArrayList());
        } else if (x(new g0(this, eVar, bVar, 1), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new Runnable() { // from class: com.amazon.aps.iva.ab.y
            @Override // java.lang.Runnable
            public final void run() {
                n3 n3Var3 = com.android.billingclient.api.a.this.f;
                com.android.billingclient.api.c cVar3 = com.android.billingclient.api.f.i;
                n3Var3.f(com.amazon.aps.iva.e.w.V(24, 7, cVar3));
                ((b) bVar).a(cVar3, new ArrayList());
            }
        }, t()) == null) {
            c v = v();
            this.f.f(w.V(25, 7, v));
            bVar.a(v, new ArrayList());
        }
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void o(l lVar, final com.amazon.aps.iva.ab.c cVar) {
        if (!k()) {
            n3 n3Var = this.f;
            c cVar2 = f.h;
            n3Var.f(w.V(2, 11, cVar2));
            cVar.a(cVar2, null);
        } else if (x(new g0(this, lVar.a, cVar, 0), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new Runnable() { // from class: com.amazon.aps.iva.ab.z
            @Override // java.lang.Runnable
            public final void run() {
                n3 n3Var2 = com.android.billingclient.api.a.this.f;
                com.android.billingclient.api.c cVar3 = com.android.billingclient.api.f.i;
                n3Var2.f(com.amazon.aps.iva.e.w.V(24, 11, cVar3));
                ((c) cVar).a(cVar3, null);
            }
        }, t()) == null) {
            c v = v();
            this.f.f(w.V(25, 11, v));
            cVar.a(v, null);
        }
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void p(m mVar, final j jVar) {
        if (!k()) {
            n3 n3Var = this.f;
            c cVar = f.h;
            n3Var.f(w.V(2, 9, cVar));
            jVar.a(cVar, zzu.zzk());
            return;
        }
        String str = mVar.a;
        if (TextUtils.isEmpty(str)) {
            zzb.zzj("BillingClient", "Please provide a valid product type.");
            n3 n3Var2 = this.f;
            c cVar2 = f.d;
            n3Var2.f(w.V(50, 9, cVar2));
            jVar.a(cVar2, zzu.zzk());
        } else if (x(new com.amazon.aps.iva.ab.f0(this, str, jVar), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new Runnable() { // from class: com.amazon.aps.iva.ab.c0
            @Override // java.lang.Runnable
            public final void run() {
                n3 n3Var3 = com.android.billingclient.api.a.this.f;
                com.android.billingclient.api.c cVar3 = com.android.billingclient.api.f.i;
                n3Var3.f(com.amazon.aps.iva.e.w.V(24, 9, cVar3));
                jVar.a(cVar3, zzu.zzk());
            }
        }, t()) == null) {
            c v = v();
            this.f.f(w.V(25, 9, v));
            jVar.a(v, zzu.zzk());
        }
    }

    public final void s(com.amazon.aps.iva.rs.b bVar) {
        if (k()) {
            zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f.g(w.W(6));
            bVar.a(f.g);
            return;
        }
        int i = 1;
        if (this.a == 1) {
            zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            n3 n3Var = this.f;
            c cVar = f.c;
            n3Var.f(w.V(37, 6, cVar));
            bVar.a(cVar);
        } else if (this.a == 3) {
            zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            n3 n3Var2 = this.f;
            c cVar2 = f.h;
            n3Var2.f(w.V(38, 6, cVar2));
            bVar.a(cVar2);
        } else {
            this.a = 1;
            n3 n3Var3 = this.d;
            n3Var3.getClass();
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
            com.amazon.aps.iva.ab.w wVar = (com.amazon.aps.iva.ab.w) n3Var3.c;
            Context context = (Context) n3Var3.b;
            if (!wVar.c) {
                int i2 = Build.VERSION.SDK_INT;
                n3 n3Var4 = wVar.d;
                if (i2 >= 33) {
                    context.registerReceiver((com.amazon.aps.iva.ab.w) n3Var4.c, intentFilter, 2);
                } else {
                    context.registerReceiver((com.amazon.aps.iva.ab.w) n3Var4.c, intentFilter);
                }
                wVar.c = true;
            }
            zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.h = new q(this, bVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.b);
                        if (this.e.bindService(intent2, this.h, 1)) {
                            zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    } else {
                        zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    }
                }
            } else {
                i = 41;
            }
            this.a = 0;
            zzb.zzi("BillingClient", "Billing service unavailable on device.");
            n3 n3Var5 = this.f;
            c cVar3 = f.b;
            n3Var5.f(w.V(i, 6, cVar3));
            bVar.a(cVar3);
        }
    }

    public final Handler t() {
        if (Looper.myLooper() == null) {
            return this.c;
        }
        return new Handler(Looper.myLooper());
    }

    public final void u(final c cVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.amazon.aps.iva.ab.e0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.a aVar = com.android.billingclient.api.a.this;
                com.android.billingclient.api.c cVar2 = cVar;
                if (((w) aVar.d.c).a != null) {
                    ((w) aVar.d.c).a.b(cVar2, null);
                    return;
                }
                int i = w.e;
                ((w) aVar.d.c).getClass();
                zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
            }
        });
    }

    public final c v() {
        if (this.a != 0 && this.a != 3) {
            return f.f;
        }
        return f.h;
    }

    public final Future x(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.t == null) {
            this.t = Executors.newFixedThreadPool(zzb.zza, new n());
        }
        try {
            final Future submit = this.t.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.amazon.aps.iva.ab.d0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (!future.isDone() && !future.isCancelled()) {
                        future.cancel(true);
                        zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            zzb.zzk("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }
}
