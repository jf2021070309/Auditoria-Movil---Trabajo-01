package com.applovin.impl.adview.activity.b;

import android.graphics.PointF;
import android.net.Uri;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.a.a;
import com.applovin.impl.a.h;
import com.applovin.impl.a.i;
import com.applovin.impl.a.j;
import com.applovin.impl.adview.k;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.ui.JavascriptBridge;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c extends e {
    private final Set<com.applovin.impl.a.g> A;
    private final com.applovin.impl.a.a z;

    public c(com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.A = new HashSet();
        com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) gVar;
        this.z = aVar;
        this.A.addAll(aVar.a(a.c.VIDEO, h.a));
        a(a.c.IMPRESSION);
        a(a.c.VIDEO, "creativeView");
    }

    private void C() {
        if (!p() || this.A.isEmpty()) {
            return;
        }
        r rVar = this.c;
        rVar.d("InterActivityV2", "Firing " + this.A.size() + " un-fired video progress trackers when video was completed.");
        a(this.A);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.a.d dVar) {
        a(cVar, "", dVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, com.applovin.impl.a.d dVar) {
        a(this.z.a(cVar, str), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<com.applovin.impl.a.g> set) {
        a(set, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(Set<com.applovin.impl.a.g> set, com.applovin.impl.a.d dVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.s.getCurrentPosition());
        com.applovin.impl.a.k m = this.z.m();
        Uri a = m != null ? m.a() : null;
        r rVar = this.c;
        rVar.b("InterActivityV2", "Firing " + set.size() + " tracker(s): " + set);
        i.a(set, seconds, a, dVar, this.b);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        super.a(pointF);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void c() {
        this.t.c();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.a.d.MEDIA_FILE_ERROR);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void d() {
        super.d();
        this.t.a("PROGRESS_TRACKING", ((Long) this.b.a(com.applovin.impl.sdk.c.b.eg)).longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.c.1
            @Override // com.applovin.impl.adview.k.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(c.this.v - (c.this.s.getDuration() - c.this.s.getCurrentPosition()));
                HashSet hashSet = new HashSet();
                for (com.applovin.impl.a.g gVar : new HashSet(c.this.A)) {
                    if (gVar.a(seconds, c.this.B())) {
                        hashSet.add(gVar);
                        c.this.A.remove(gVar);
                    }
                }
                c.this.a(hashSet);
            }

            @Override // com.applovin.impl.adview.k.a
            public boolean b() {
                return !c.this.x;
            }
        });
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        super.e();
        a(this.x ? a.c.COMPANION : a.c.VIDEO, "resume");
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.x ? a.c.COMPANION : a.c.VIDEO, "pause");
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void g() {
        a(a.c.VIDEO, JavascriptBridge.MraidHandler.CLOSE_ACTION);
        a(a.c.COMPANION, JavascriptBridge.MraidHandler.CLOSE_ACTION);
        super.g();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    protected void s() {
        long ad;
        int u;
        long j = 0;
        if (this.z.ac() >= 0 || this.z.ad() >= 0) {
            if (this.z.ac() >= 0) {
                ad = this.z.ac();
            } else {
                com.applovin.impl.a.a aVar = this.z;
                j l = aVar.l();
                if (l != null && l.b() > 0) {
                    j = 0 + TimeUnit.SECONDS.toMillis(l.b());
                } else if (this.v > 0) {
                    j = 0 + this.v;
                }
                if (aVar.ae() && (u = (int) aVar.u()) > 0) {
                    j += TimeUnit.SECONDS.toMillis(u);
                }
                ad = (long) (j * (this.z.ad() / 100.0d));
            }
            a(ad);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void u() {
        a(a.c.VIDEO, "skip");
        super.u();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void v() {
        super.v();
        a(a.c.VIDEO, this.u ? AnalyticsEvent.Ad.mute : AnalyticsEvent.Ad.unmute);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void w() {
        C();
        if (!i.c(this.z)) {
            this.c.b("InterActivityV2", "VAST ad does not have valid companion ad - dismissing...");
            g();
        } else if (this.x) {
        } else {
            a(a.c.COMPANION, "creativeView");
            super.w();
        }
    }
}
