package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {
    private com.applovin.impl.sdk.utils.m a;
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean();
    private final k d;
    private final WeakReference<a> e;
    private long f;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public d(k kVar, a aVar) {
        this.e = new WeakReference<>(aVar);
        this.d = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.b) {
            this.a = null;
            if (!((Boolean) this.d.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.d.ai().unregisterReceiver(this);
            }
        }
    }

    private void i() {
        if (((Boolean) this.d.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
            d();
        }
    }

    private void j() {
        if (((Boolean) this.d.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
            synchronized (this.b) {
                if (this.d.ab().a()) {
                    this.d.z().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    return;
                }
                if (this.a != null) {
                    this.a.c();
                }
            }
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            c();
            this.f = j;
            this.a = com.applovin.impl.sdk.utils.m.a(j, this.d, new Runnable() { // from class: com.applovin.impl.sdk.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.h();
                    a aVar = (a) d.this.e.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.d.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.d.a(com.applovin.impl.sdk.c.a.r)).booleanValue() && (this.d.ac().b() || this.d.ab().a())) {
                this.a.b();
            }
            if (this.c.compareAndSet(true, false) && ((Boolean) this.d.a(com.applovin.impl.sdk.c.a.t)).booleanValue()) {
                this.d.z().b("AdRefreshManager", "Pausing refresh for a previous request.");
                this.a.b();
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.a != null;
        }
        return z;
    }

    public long b() {
        long a2;
        synchronized (this.b) {
            a2 = this.a != null ? this.a.a() : -1L;
        }
        return a2;
    }

    public void c() {
        synchronized (this.b) {
            if (this.a != null) {
                this.a.d();
                h();
            }
        }
    }

    public void d() {
        synchronized (this.b) {
            if (this.a != null) {
                this.a.b();
            } else {
                this.d.z().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                this.c.set(true);
            }
        }
    }

    public void e() {
        synchronized (this.b) {
            if (this.a != null) {
                this.a.c();
            } else {
                this.c.set(false);
            }
        }
    }

    public void f() {
        if (((Boolean) this.d.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            d();
        }
    }

    public void g() {
        a aVar;
        if (((Boolean) this.d.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            synchronized (this.b) {
                if (this.d.ac().b()) {
                    this.d.z().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    return;
                }
                boolean z = false;
                if (this.a != null) {
                    long b = this.f - b();
                    long longValue = ((Long) this.d.a(com.applovin.impl.sdk.c.a.p)).longValue();
                    if (longValue < 0 || b <= longValue) {
                        this.a.c();
                    } else {
                        c();
                        z = true;
                    }
                }
                if (!z || (aVar = this.e.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            f();
        } else if ("com.applovin.application_resumed".equals(action)) {
            g();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            i();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            j();
        }
    }
}
