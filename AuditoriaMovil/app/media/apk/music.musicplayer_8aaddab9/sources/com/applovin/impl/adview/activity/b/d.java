package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a.a;
import com.applovin.impl.a.j;
import com.applovin.impl.a.k;
import com.applovin.impl.a.l;
import com.applovin.impl.a.n;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.t;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d extends f {
    private final com.applovin.impl.a.a D;
    private final Set<j> E;

    public d(com.applovin.impl.sdk.ad.e eVar, Activity activity, m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.E = hashSet;
        com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) eVar;
        this.D = aVar;
        a.c cVar = a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, k.a));
        a(a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.getAdEventTracker().d();
    }

    private void A() {
        if (!r() || this.E.isEmpty()) {
            return;
        }
        v vVar = this.f3167c;
        StringBuilder y = e.a.d.a.a.y("Firing ");
        y.append(this.E.size());
        y.append(" un-fired video progress trackers when video was completed.");
        vVar.d("AppLovinFullscreenActivity", y.toString());
        a(this.E);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.a.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, com.applovin.impl.a.f fVar) {
        a(this.D.a(cVar, str), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<j> set) {
        a(set, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(Set<j> set, com.applovin.impl.a.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) this).t.getCurrentPosition());
        n aJ = this.D.aJ();
        Uri a = aJ != null ? aJ.a() : null;
        v vVar = this.f3167c;
        StringBuilder y = e.a.d.a.a.y("Firing ");
        y.append(set.size());
        y.append(" tracker(s): ");
        y.append(set);
        vVar.b("AppLovinFullscreenActivity", y.toString());
        l.a(set, seconds, a, fVar, this.f3166b);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.D.getAdEventTracker().o();
        super.a(pointF);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ((f) this).z.a("PROGRESS_TRACKING", ((Long) this.f3166b.a(com.applovin.impl.sdk.c.b.em)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.d.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) d.this).B - (((f) d.this).t.getDuration() - ((f) d.this).t.getCurrentPosition()));
                int z = d.this.z();
                HashSet hashSet = new HashSet();
                Iterator it = new HashSet(d.this.E).iterator();
                while (it.hasNext()) {
                    com.applovin.impl.a.j jVar = (com.applovin.impl.a.j) it.next();
                    if (jVar.a(seconds, z)) {
                        hashSet.add(jVar);
                        d.this.E.remove(jVar);
                    }
                }
                d.this.a(hashSet);
                if (z >= 25 && z < 50) {
                    d.this.D.getAdEventTracker().f();
                } else if (z >= 50 && z < 75) {
                    d.this.D.getAdEventTracker().g();
                } else if (z >= 75) {
                    d.this.D.getAdEventTracker().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !d.this.C;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((f) this).u;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.m mVar = ((f) this).v;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((f) this).y;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((f) this).w;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        t tVar = ((f) this).x;
        if (tVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(tVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.D.getAdEventTracker().a(((f) this).t, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c() {
        a(a.c.VIDEO, "skip");
        this.D.getAdEventTracker().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(long j2) {
        super.c(j2);
        this.D.getAdEventTracker().a((float) TimeUnit.MILLISECONDS.toSeconds(j2), Utils.isVideoMutedInitially(this.f3166b));
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.a.f.MEDIA_FILE_ERROR);
        this.D.getAdEventTracker().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((f) this).z.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.C ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.D.getAdEventTracker().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(this.C ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.D.getAdEventTracker().j();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void h() {
        a(a.c.VIDEO, "close");
        a(a.c.COMPANION, "close");
        this.D.getAdEventTracker().e();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void u() {
        long j2;
        int q;
        long j3 = 0;
        if (this.D.Y() >= 0 || this.D.Z() >= 0) {
            int i2 = (this.D.Y() > 0L ? 1 : (this.D.Y() == 0L ? 0 : -1));
            com.applovin.impl.a.a aVar = this.D;
            if (i2 >= 0) {
                j2 = aVar.Y();
            } else {
                com.applovin.impl.a.m m2 = aVar.m();
                if (m2 == null || m2.b() <= 0) {
                    long j4 = ((f) this).B;
                    if (j4 > 0) {
                        j3 = 0 + j4;
                    }
                } else {
                    j3 = 0 + TimeUnit.SECONDS.toMillis(m2.b());
                }
                if (aVar.aa() && (q = (int) aVar.q()) > 0) {
                    j3 += TimeUnit.SECONDS.toMillis(q);
                }
                double d2 = j3;
                double Z = this.D.Z();
                Double.isNaN(Z);
                Double.isNaN(d2);
                j2 = (long) ((Z / 100.0d) * d2);
            }
            b(j2);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void v() {
        super.v();
        com.applovin.impl.a.a aVar = this.D;
        if (aVar != null) {
            aVar.getAdEventTracker().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void w() {
        super.w();
        com.applovin.impl.a.a aVar = this.D;
        if (aVar != null) {
            aVar.getAdEventTracker().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void x() {
        super.x();
        a(a.c.VIDEO, ((f) this).A ? "mute" : "unmute");
        this.D.getAdEventTracker().a(((f) this).A);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void y() {
        A();
        if (!l.c(this.D)) {
            this.f3167c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            h();
        } else if (this.C) {
        } else {
            a(a.c.COMPANION, "creativeView");
            this.D.getAdEventTracker().i();
            com.applovin.impl.sdk.a.g adEventTracker = this.D.getAdEventTracker();
            AppLovinAdView appLovinAdView = this.f3170f;
            adEventTracker.a(appLovinAdView, Collections.singletonList(new com.applovin.impl.sdk.a.d(appLovinAdView, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.y();
        }
    }
}
