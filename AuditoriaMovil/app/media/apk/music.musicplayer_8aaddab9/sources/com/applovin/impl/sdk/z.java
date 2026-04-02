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
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class z {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f4394b = new AtomicBoolean();
    public final m a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f4395c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f4396d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f4397e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private Date f4398f;

    /* renamed from: g  reason: collision with root package name */
    private Date f4399g;

    public z(final m mVar) {
        this.a = mVar;
        final Application application = (Application) mVar.L();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.z.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                z.this.e();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.z.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i2) {
                z.this.f4397e.set(i2);
                if (i2 == 20) {
                    z.this.f();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.z.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        z.this.e();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    z.this.f();
                }
            }
        }, intentFilter);
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cu)).booleanValue() && f4394b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            mVar.aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.z.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent2, Map<String, Object> map) {
                    application.stopService(intent);
                    mVar.aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f4396d.compareAndSet(true, false)) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f4396d.compareAndSet(false, true)) {
            g();
        }
    }

    private void g() {
        this.a.B().b("SessionTracker", "Application Paused");
        this.a.aj().sendBroadcastSync(new Intent("com.applovin.application_paused"), null);
        if (this.f4395c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(com.applovin.impl.sdk.c.b.dp)).longValue());
        if (this.f4398f == null || System.currentTimeMillis() - this.f4398f.getTime() >= millis) {
            ((EventServiceImpl) this.a.w()).trackEvent("paused");
            if (booleanValue) {
                this.f4398f = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f4398f = new Date();
    }

    private void h() {
        this.a.B().b("SessionTracker", "Application Resumed");
        boolean booleanValue = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue();
        long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.f0do)).longValue();
        this.a.aj().sendBroadcastSync(new Intent("com.applovin.application_resumed"), null);
        if (this.f4395c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f4399g == null || System.currentTimeMillis() - this.f4399g.getTime() >= millis) {
            ((EventServiceImpl) this.a.w()).trackEvent("resumed");
            if (booleanValue) {
                this.f4399g = new Date();
            }
        }
        if (!booleanValue) {
            this.f4399g = new Date();
        }
        this.a.T().a(com.applovin.impl.sdk.d.f.f4004k);
    }

    public boolean a() {
        return this.f4396d.get();
    }

    public int b() {
        return this.f4397e.get();
    }

    public void c() {
        this.f4395c.set(true);
    }

    public void d() {
        this.f4395c.set(false);
    }
}
