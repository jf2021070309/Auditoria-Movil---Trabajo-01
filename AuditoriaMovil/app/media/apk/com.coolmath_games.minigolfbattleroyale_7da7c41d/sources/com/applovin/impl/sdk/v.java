package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class v {
    private static final AtomicBoolean b = new AtomicBoolean();
    final k a;
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicBoolean d = new AtomicBoolean();
    private Date e;
    private Date f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(final k kVar) {
        this.a = kVar;
        final Application application = (Application) kVar.J();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.v.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                v.this.d();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.v.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                if (i == 20) {
                    v.this.e();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.v.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        v.this.d();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    v.this.e();
                }
            }
        }, intentFilter);
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cq)).booleanValue() && b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            kVar.ai().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.v.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent2, Map<String, Object> map) {
                    application.stopService(intent);
                    kVar.ai().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.d.compareAndSet(true, false)) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d.compareAndSet(false, true)) {
            f();
        }
    }

    private void f() {
        this.a.z().b("SessionTracker", "Application Paused");
        this.a.ai().sendBroadcastSync(new Intent("com.applovin.application_paused"), null);
        if (this.c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(com.applovin.impl.sdk.c.b.dp)).longValue());
        if (this.e == null || System.currentTimeMillis() - this.e.getTime() >= millis) {
            ((EventServiceImpl) this.a.u()).trackEvent("paused");
            if (booleanValue) {
                this.e = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.e = new Date();
    }

    private void g() {
        this.a.z().b("SessionTracker", "Application Resumed");
        boolean booleanValue = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue();
        long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.f0do)).longValue();
        this.a.ai().sendBroadcastSync(new Intent("com.applovin.application_resumed"), null);
        if (this.c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f == null || System.currentTimeMillis() - this.f.getTime() >= millis) {
            ((EventServiceImpl) this.a.u()).trackEvent("resumed");
            if (booleanValue) {
                this.f = new Date();
            }
        }
        if (!booleanValue) {
            this.f = new Date();
        }
        this.a.R().a(com.applovin.impl.sdk.d.f.k);
    }

    public boolean a() {
        return this.d.get();
    }

    public void b() {
        this.c.set(true);
    }

    public void c() {
        this.c.set(false);
    }
}
