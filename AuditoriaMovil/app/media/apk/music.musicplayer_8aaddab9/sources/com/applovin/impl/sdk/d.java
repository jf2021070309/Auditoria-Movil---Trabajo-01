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
    private com.applovin.impl.sdk.utils.n a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3953b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3954c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private boolean f3955d;

    /* renamed from: e  reason: collision with root package name */
    private final m f3956e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<a> f3957f;

    /* renamed from: g  reason: collision with root package name */
    private long f3958g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3959h;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public d(m mVar, a aVar) {
        this.f3957f = new WeakReference<>(aVar);
        this.f3956e = mVar;
    }

    private void i() {
        synchronized (this.f3953b) {
            com.applovin.impl.sdk.utils.n nVar = this.a;
            if (nVar != null) {
                nVar.b();
            } else {
                this.f3956e.B().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                this.f3954c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.f3953b) {
            com.applovin.impl.sdk.utils.n nVar = this.a;
            if (nVar != null) {
                nVar.c();
            } else {
                this.f3954c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f3953b) {
            this.a = null;
            if (!((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.f3956e.aj().unregisterReceiver(this);
            }
        }
    }

    private void l() {
        if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
            i();
        }
    }

    private void m() {
        if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
            synchronized (this.f3953b) {
                if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.u)).booleanValue() && this.f3955d) {
                    this.f3956e.B().b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                } else if (this.f3956e.ac().a()) {
                    this.f3956e.B().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                } else {
                    com.applovin.impl.sdk.utils.n nVar = this.a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
            }
        }
    }

    public void a(long j2) {
        synchronized (this.f3953b) {
            c();
            this.f3958g = j2;
            this.a = com.applovin.impl.sdk.utils.n.a(j2, this.f3956e, new Runnable() { // from class: com.applovin.impl.sdk.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.k();
                    a aVar = (a) d.this.f3957f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.f3956e.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f3956e.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f3956e.aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f3956e.aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.r)).booleanValue() && (this.f3956e.ad().b() || this.f3956e.ac().a())) {
                this.a.b();
            }
            if (this.f3954c.compareAndSet(true, false) && ((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.v)).booleanValue()) {
                this.f3956e.B().b("AdRefreshManager", "Pausing refresh for a previous request.");
                this.a.b();
            }
        }
    }

    public void a(boolean z) {
        this.f3959h = z;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f3953b) {
            z = this.a != null;
        }
        return z;
    }

    public long b() {
        long a2;
        synchronized (this.f3953b) {
            com.applovin.impl.sdk.utils.n nVar = this.a;
            a2 = nVar != null ? nVar.a() : -1L;
        }
        return a2;
    }

    public void c() {
        synchronized (this.f3953b) {
            com.applovin.impl.sdk.utils.n nVar = this.a;
            if (nVar != null) {
                nVar.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.f3953b) {
            i();
            this.f3955d = true;
        }
    }

    public void e() {
        synchronized (this.f3953b) {
            j();
            this.f3955d = false;
        }
    }

    public boolean f() {
        return this.f3955d;
    }

    public void g() {
        if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            i();
        }
    }

    public void h() {
        a aVar;
        if (((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            synchronized (this.f3953b) {
                if ((this.f3959h || ((Boolean) this.f3956e.a(com.applovin.impl.sdk.c.a.t)).booleanValue()) && this.f3955d) {
                    this.f3956e.B().b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                } else if (this.f3956e.ad().b()) {
                    this.f3956e.B().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                } else {
                    boolean z = false;
                    if (this.a != null) {
                        long b2 = this.f3958g - b();
                        long longValue = ((Long) this.f3956e.a(com.applovin.impl.sdk.c.a.p)).longValue();
                        if (longValue < 0 || b2 <= longValue) {
                            this.a.c();
                        } else {
                            c();
                            z = true;
                        }
                    }
                    if (!z || (aVar = this.f3957f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            g();
        } else if ("com.applovin.application_resumed".equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }
}
