package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b extends a {
    private final com.applovin.impl.adview.activity.a.b t;
    private com.applovin.impl.sdk.utils.e u;
    private long v;
    private AtomicBoolean w;

    public b(com.applovin.impl.sdk.ad.e eVar, Activity activity, m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.t = new com.applovin.impl.adview.activity.a.b(this.a, this.f3169e, this.f3166b);
        this.w = new AtomicBoolean();
    }

    private long c() {
        com.applovin.impl.sdk.ad.e eVar = this.a;
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            float k2 = ((com.applovin.impl.sdk.ad.a) eVar).k();
            if (k2 <= 0.0f) {
                k2 = (float) this.a.q();
            }
            double secondsToMillisLong = Utils.secondsToMillisLong(k2);
            double M = this.a.M();
            Double.isNaN(M);
            Double.isNaN(secondsToMillisLong);
            return (long) ((M / 100.0d) * secondsToMillisLong);
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j2) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.t.a(this.f3171g, this.f3170f, viewGroup);
        a(false);
        this.f3170f.renderAd(this.a);
        a("javascript:al_onPoststitialShow();", this.a.N());
        if (t()) {
            long c2 = c();
            this.v = c2;
            if (c2 > 0) {
                this.f3167c.b("AppLovinFullscreenActivity", e.a.d.a.a.q(e.a.d.a.a.y("Scheduling timer for ad fully watched in "), this.v, "ms..."));
                this.u = com.applovin.impl.sdk.utils.e.a(this.v, this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f3167c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        b.this.w.set(true);
                    }
                });
            }
        }
        if (this.f3171g != null) {
            if (this.a.q() >= 0) {
                a(this.f3171g, this.a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f3173i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f3171g.setVisibility(0);
            }
        }
        u();
        super.b(Utils.isVideoMutedInitially(this.f3166b));
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        com.applovin.impl.sdk.utils.e eVar = this.u;
        if (eVar != null) {
            eVar.a();
            this.u = null;
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        com.applovin.impl.sdk.utils.e eVar;
        boolean r = r();
        int i2 = 100;
        if (t()) {
            if (!r && (eVar = this.u) != null) {
                double b2 = this.v - eVar.b();
                double d2 = this.v;
                Double.isNaN(b2);
                Double.isNaN(d2);
                i2 = (int) Math.min(100.0d, (b2 / d2) * 100.0d);
            }
            this.f3167c.b("AppLovinFullscreenActivity", "Ad engaged at " + i2 + "%");
        }
        super.a(i2, false, r, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        if (t()) {
            return this.w.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void u() {
        long j2;
        long millis;
        long j3 = 0;
        if (this.a.Y() >= 0 || this.a.Z() >= 0) {
            int i2 = (this.a.Y() > 0L ? 1 : (this.a.Y() == 0L ? 0 : -1));
            com.applovin.impl.sdk.ad.e eVar = this.a;
            if (i2 >= 0) {
                j2 = eVar.Y();
            } else {
                if (eVar.aa()) {
                    int k2 = (int) ((com.applovin.impl.sdk.ad.a) this.a).k();
                    if (k2 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(k2);
                    } else {
                        int q = (int) this.a.q();
                        if (q > 0) {
                            millis = TimeUnit.SECONDS.toMillis(q);
                        }
                    }
                    j3 = 0 + millis;
                }
                double d2 = j3;
                double Z = this.a.Z();
                Double.isNaN(Z);
                Double.isNaN(d2);
                j2 = (long) ((Z / 100.0d) * d2);
            }
            b(j2);
        }
    }
}
