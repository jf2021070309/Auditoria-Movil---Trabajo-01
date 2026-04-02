package com.applovin.impl.adview.activity.b;

import android.os.SystemClock;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b extends a {
    private final com.applovin.impl.adview.activity.a.b r;
    private com.applovin.impl.sdk.utils.d s;
    private long t;
    private AtomicBoolean u;

    public b(com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.r = new com.applovin.impl.adview.activity.a.b(this.a, this.d, this.b);
        this.u = new AtomicBoolean();
    }

    private long c() {
        if (this.a instanceof com.applovin.impl.sdk.a.a) {
            float l = ((com.applovin.impl.sdk.a.a) this.a).l();
            if (l <= 0.0f) {
                l = (float) this.a.u();
            }
            return (long) (Utils.secondsToMillisLong(l) * (this.a.Q() / 100.0d));
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        this.r.a(this.g, this.f);
        a(false);
        this.f.renderAd(this.a);
        a("javascript:al_onPoststitialShow();", this.a.R());
        if (r()) {
            long c = c();
            this.t = c;
            if (c > 0) {
                r rVar = this.c;
                rVar.b("InterActivityV2", "Scheduling timer for ad fully watched in " + this.t + "ms...");
                this.s = com.applovin.impl.sdk.utils.d.a(this.t, this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.c.b("InterActivityV2", "Marking ad as fully watched");
                        b.this.u.set(true);
                    }
                });
            }
        }
        if (this.g != null) {
            if (this.a.u() >= 0) {
                a(this.g, this.a.u(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.g.setVisibility(0);
            }
        }
        s();
        super.b(t());
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        l();
        com.applovin.impl.sdk.utils.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
            this.s = null;
        }
        super.g();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void l() {
        com.applovin.impl.sdk.utils.d dVar;
        boolean p = p();
        int i = 100;
        if (r()) {
            if (!p && (dVar = this.s) != null) {
                i = (int) Math.min(100.0d, ((this.t - dVar.b()) / this.t) * 100.0d);
            }
            r rVar = this.c;
            rVar.b("InterActivityV2", "Ad engaged at " + i + "%");
        }
        super.a(i, false, p, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean p() {
        if (r()) {
            return this.u.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean q() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void s() {
        long ad;
        int l;
        long j = 0;
        if (this.a.ac() >= 0 || this.a.ad() >= 0) {
            if (this.a.ac() >= 0) {
                ad = this.a.ac();
            } else {
                if (this.a.ae() && ((l = (int) ((com.applovin.impl.sdk.a.a) this.a).l()) > 0 || (l = (int) this.a.u()) > 0)) {
                    j = 0 + TimeUnit.SECONDS.toMillis(l);
                }
                ad = (long) (j * (this.a.ad() / 100.0d));
            }
            a(ad);
        }
    }
}
