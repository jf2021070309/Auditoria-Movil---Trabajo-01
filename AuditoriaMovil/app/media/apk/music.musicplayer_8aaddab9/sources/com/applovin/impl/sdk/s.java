package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class s {
    private final m a;

    /* renamed from: c  reason: collision with root package name */
    private long f4279c;

    /* renamed from: f  reason: collision with root package name */
    private long f4282f;

    /* renamed from: g  reason: collision with root package name */
    private Object f4283g;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f4278b = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final Object f4280d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f4281e = new AtomicBoolean();

    public s(m mVar) {
        this.a = mVar;
    }

    public void a(final Object obj) {
        this.a.ak().a(obj);
        if (!com.applovin.impl.mediation.c.c.a(obj) && this.f4278b.compareAndSet(false, true)) {
            this.f4283g = obj;
            this.f4279c = System.currentTimeMillis();
            v B = this.a.B();
            StringBuilder y = e.a.d.a.a.y("Setting fullscreen ad displayed: ");
            y.append(this.f4279c);
            B.b("FullScreenAdTracker", y.toString());
            this.a.aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.cl)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (s.this.f4278b.get() && System.currentTimeMillis() - s.this.f4279c >= longValue) {
                            s.this.a.B().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            s.this.b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    public void a(boolean z) {
        synchronized (this.f4280d) {
            this.f4281e.set(z);
            if (z) {
                this.f4282f = System.currentTimeMillis();
                v B = this.a.B();
                B.b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f4282f);
                final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.b.ck)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (s.this.a() && System.currentTimeMillis() - s.this.f4282f >= longValue) {
                                s.this.a.B().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                s.this.f4281e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f4282f = 0L;
                v B2 = this.a.B();
                B2.b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
            }
        }
    }

    public boolean a() {
        return this.f4281e.get();
    }

    public void b(Object obj) {
        this.a.ak().b(obj);
        if (!com.applovin.impl.mediation.c.c.a(obj) && this.f4278b.compareAndSet(true, false)) {
            this.f4283g = null;
            v B = this.a.B();
            StringBuilder y = e.a.d.a.a.y("Setting fullscreen ad hidden: ");
            y.append(System.currentTimeMillis());
            B.b("FullScreenAdTracker", y.toString());
            this.a.aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public boolean b() {
        return this.f4278b.get();
    }

    public Object c() {
        return this.f4283g;
    }
}
