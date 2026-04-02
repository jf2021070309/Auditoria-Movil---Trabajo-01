package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f4032c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4033d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4034e;

    public d(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, mVar, appLovinAdLoadListener);
        this.f4032c = aVar;
    }

    private void j() {
        a("Caching HTML resources...");
        this.f4032c.a(a(this.f4032c.b(), this.f4032c.F(), this.f4032c));
        this.f4032c.a(true);
        a("Finish caching non-video resources for ad #" + this.f4032c.getAdIdNumber());
        com.applovin.impl.sdk.v B = this.f4020b.B();
        String e2 = e();
        StringBuilder y = e.a.d.a.a.y("Ad updated with cachedHTML = ");
        y.append(this.f4032c.b());
        B.a(e2, y.toString());
    }

    private void k() {
        Uri e2;
        if (b() || (e2 = e(this.f4032c.h())) == null) {
            return;
        }
        if (this.f4032c.aH()) {
            this.f4032c.a(this.f4032c.b().replaceFirst(this.f4032c.d(), e2.toString()));
            a("Replaced video URL with cached video URI in HTML for web video ad");
        }
        this.f4032c.f();
        this.f4032c.a(e2);
    }

    public void a(boolean z) {
        this.f4033d = z;
    }

    public void b(boolean z) {
        this.f4034e = z;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean e2 = this.f4032c.e();
        boolean z = this.f4034e;
        if (e2 || z) {
            StringBuilder y = e.a.d.a.a.y("Begin caching for streaming ad #");
            y.append(this.f4032c.getAdIdNumber());
            y.append("...");
            a(y.toString());
            c();
            if (e2) {
                if (this.f4033d) {
                    i();
                }
                j();
                if (!this.f4033d) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        } else {
            StringBuilder y2 = e.a.d.a.a.y("Begin processing for non-streaming ad #");
            y2.append(this.f4032c.getAdIdNumber());
            y2.append("...");
            a(y2.toString());
            c();
            j();
            k();
            i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f4032c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f4032c, this.f4020b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f4032c, this.f4020b);
        a(this.f4032c);
        a();
    }
}
