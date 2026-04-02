package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.a.a;
import com.applovin.impl.a.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.a.a f4035c;

    public e(com.applovin.impl.a.a aVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, mVar, appLovinAdLoadListener);
        this.f4035c = aVar;
    }

    private void j() {
        String str;
        String str2;
        String str3;
        if (b()) {
            return;
        }
        if (this.f4035c.aO()) {
            com.applovin.impl.a.d aK = this.f4035c.aK();
            if (aK != null) {
                com.applovin.impl.a.h b2 = aK.b();
                if (b2 != null) {
                    Uri b3 = b2.b();
                    String uri = b3 != null ? b3.toString() : "";
                    String c2 = b2.c();
                    if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(c2)) {
                        c("Companion ad does not have any resources attached. Skipping...");
                        return;
                    } else if (b2.a() == h.a.STATIC) {
                        a("Caching static companion ad at " + uri + "...");
                        Uri b4 = b(uri, Collections.emptyList(), false);
                        if (b4 != null) {
                            b2.a(b4);
                            this.f4035c.a(true);
                            return;
                        }
                        str2 = "Failed to cache static companion ad";
                    } else if (b2.a() == h.a.HTML) {
                        if (StringUtils.isValidString(uri)) {
                            a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                            c2 = f(uri);
                            if (StringUtils.isValidString(c2)) {
                                str3 = "HTML fetched. Caching HTML now...";
                            } else {
                                str2 = "Unable to load companion ad resources from " + uri;
                            }
                        } else {
                            str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c2;
                        }
                        a(str3);
                        b2.a(a(c2, Collections.emptyList(), this.f4035c));
                        this.f4035c.a(true);
                        return;
                    } else if (b2.a() != h.a.IFRAME) {
                        return;
                    } else {
                        str = "Skip caching of iFrame resource...";
                    }
                } else {
                    str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                }
                d(str2);
                return;
            }
            str = "No companion ad provided. Skipping...";
        } else {
            str = "Companion ad caching disabled. Skipping...";
        }
        a(str);
    }

    private void k() {
        com.applovin.impl.a.n aJ;
        Uri b2;
        if (b()) {
            return;
        }
        if (!this.f4035c.aP()) {
            a("Video caching disabled. Skipping...");
        } else if (this.f4035c.m() == null || (aJ = this.f4035c.aJ()) == null || (b2 = aJ.b()) == null) {
        } else {
            Uri a = a(b2.toString(), Collections.emptyList(), false);
            if (a == null) {
                d("Failed to cache video file: " + aJ);
                return;
            }
            a("Video file successfully cached into: " + a);
            aJ.a(a);
        }
    }

    private void l() {
        String aM;
        String str;
        if (b()) {
            return;
        }
        if (this.f4035c.aN() != null) {
            StringBuilder y = e.a.d.a.a.y("Begin caching HTML template. Fetching from ");
            y.append(this.f4035c.aN());
            y.append("...");
            a(y.toString());
            aM = a(this.f4035c.aN().toString(), this.f4035c.F());
        } else {
            aM = this.f4035c.aM();
        }
        if (StringUtils.isValidString(aM)) {
            com.applovin.impl.a.a aVar = this.f4035c;
            aVar.a(a(aM, aVar.F(), this.f4035c));
            str = "Finish caching HTML template " + this.f4035c.aM() + " for ad #" + this.f4035c.getAdIdNumber();
        } else {
            str = "Unable to load HTML template";
        }
        a(str);
    }

    @Override // com.applovin.impl.sdk.e.c
    public void h() {
        this.f4035c.getAdEventTracker().e();
        super.h();
    }

    @Override // com.applovin.impl.sdk.e.c
    public void i() {
        this.f4035c.getAdEventTracker().c();
        super.i();
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        if (this.f4035c.e()) {
            StringBuilder y = e.a.d.a.a.y("Begin caching for VAST streaming ad #");
            y.append(((c) this).a.getAdIdNumber());
            y.append("...");
            a(y.toString());
            c();
            if (this.f4035c.k()) {
                i();
            }
            a.b h2 = this.f4035c.h();
            a.b bVar = a.b.COMPANION_AD;
            if (h2 == bVar) {
                j();
                l();
            } else {
                k();
            }
            if (!this.f4035c.k()) {
                i();
            }
            if (this.f4035c.h() == bVar) {
                k();
            } else {
                j();
                l();
            }
        } else {
            StringBuilder y2 = e.a.d.a.a.y("Begin caching for VAST ad #");
            y2.append(((c) this).a.getAdIdNumber());
            y2.append("...");
            a(y2.toString());
            c();
            j();
            k();
            l();
            i();
        }
        StringBuilder y3 = e.a.d.a.a.y("Finished caching VAST ad #");
        y3.append(this.f4035c.getAdIdNumber());
        a(y3.toString());
        long currentTimeMillis = System.currentTimeMillis() - this.f4035c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f4035c, this.f4020b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f4035c, this.f4020b);
        a(this.f4035c);
        this.f4035c.b();
        a();
    }
}
