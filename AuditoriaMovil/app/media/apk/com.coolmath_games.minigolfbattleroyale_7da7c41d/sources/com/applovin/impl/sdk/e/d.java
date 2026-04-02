package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;
/* loaded from: classes.dex */
public class d extends c {
    private final com.applovin.impl.sdk.a.a c;
    private boolean d;
    private boolean e;

    public d(com.applovin.impl.sdk.a.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.c = aVar;
    }

    private void j() {
        a("Caching HTML resources...");
        this.c.a(a(this.c.c(), this.c.J(), this.c));
        this.c.a(true);
        a("Finish caching non-video resources for ad #" + this.c.getAdIdNumber());
        com.applovin.impl.sdk.r z = this.b.z();
        String e = e();
        z.a(e, "Ad updated with cachedHTML = " + this.c.c());
    }

    private void k() {
        Uri e;
        if (b() || (e = e(this.c.i())) == null) {
            return;
        }
        if (this.c.aN()) {
            this.c.a(this.c.c().replaceFirst(this.c.e(), e.toString()));
            a("Replaced video URL with cached video URI in HTML for web video ad");
        }
        this.c.g();
        this.c.a(e);
    }

    @Override // com.applovin.impl.sdk.e.c, com.applovin.impl.mediation.h.a
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.mediation.a.a aVar) {
        super.a(aVar);
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean f = this.c.f();
        boolean z = this.e;
        if (f || z) {
            a("Begin caching for streaming ad #" + this.c.getAdIdNumber() + "...");
            c();
            if (f) {
                if (this.d) {
                    i();
                }
                j();
                if (!this.d) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        } else {
            a("Begin processing for non-streaming ad #" + this.c.getAdIdNumber() + "...");
            c();
            j();
            k();
            i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.c, this.b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.c, this.b);
        a(this.c);
        a();
    }
}
