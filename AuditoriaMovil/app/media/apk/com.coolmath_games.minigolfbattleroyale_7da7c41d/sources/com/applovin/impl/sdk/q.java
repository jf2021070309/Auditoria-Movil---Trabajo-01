package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class q {
    private final k a;
    private long c;
    private long f;
    private Object g;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Object d = new Object();
    private final AtomicBoolean e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(k kVar) {
        this.a = kVar;
    }

    public void a(final Object obj) {
        this.a.aj().a(obj);
        if (!com.applovin.impl.mediation.c.c.a(obj) && this.b.compareAndSet(false, true)) {
            this.g = obj;
            this.c = System.currentTimeMillis();
            r z = this.a.z();
            z.b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.c);
            this.a.ai().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.bW)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.q.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (q.this.b.get() && System.currentTimeMillis() - q.this.c >= longValue) {
                            q.this.a.z().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            q.this.b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    public void a(boolean z) {
        synchronized (this.d) {
            this.e.set(z);
            if (z) {
                this.f = System.currentTimeMillis();
                r z2 = this.a.z();
                z2.b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f);
                final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.bV)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.q.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (q.this.a() && System.currentTimeMillis() - q.this.f >= longValue) {
                                q.this.a.z().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                q.this.e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f = 0L;
                r z3 = this.a.z();
                z3.b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
            }
        }
    }

    public boolean a() {
        return this.e.get();
    }

    public void b(Object obj) {
        this.a.aj().b(obj);
        if (!com.applovin.impl.mediation.c.c.a(obj) && this.b.compareAndSet(true, false)) {
            this.g = null;
            r z = this.a.z();
            z.b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            this.a.ai().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public boolean b() {
        return this.b.get();
    }

    public Object c() {
        return this.g;
    }
}
