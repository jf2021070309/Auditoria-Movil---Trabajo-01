package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.a.a;
import com.applovin.impl.a.e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
/* loaded from: classes.dex */
class e extends c {
    private final com.applovin.impl.a.a c;

    public e(com.applovin.impl.a.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, kVar, appLovinAdLoadListener);
        this.c = aVar;
    }

    private void j() {
        String str;
        String str2;
        String str3;
        if (b()) {
            return;
        }
        if (this.c.aQ()) {
            com.applovin.impl.a.b n = this.c.n();
            if (n != null) {
                com.applovin.impl.a.e b = n.b();
                if (b != null) {
                    Uri b2 = b.b();
                    String uri = b2 != null ? b2.toString() : "";
                    String c = b.c();
                    if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(c)) {
                        c("Companion ad does not have any resources attached. Skipping...");
                        return;
                    } else if (b.a() == e.a.STATIC) {
                        a("Caching static companion ad at " + uri + "...");
                        Uri b3 = b(uri, Collections.emptyList(), false);
                        if (b3 != null) {
                            b.a(b3);
                            this.c.a(true);
                            return;
                        }
                        str2 = "Failed to cache static companion ad";
                    } else if (b.a() == e.a.HTML) {
                        if (StringUtils.isValidString(uri)) {
                            a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                            c = f(uri);
                            if (StringUtils.isValidString(c)) {
                                str3 = "HTML fetched. Caching HTML now...";
                            } else {
                                str2 = "Unable to load companion ad resources from " + uri;
                            }
                        } else {
                            str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c;
                        }
                        a(str3);
                        b.a(a(c, Collections.emptyList(), this.c));
                        this.c.a(true);
                        return;
                    } else if (b.a() != e.a.IFRAME) {
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
        com.applovin.impl.a.k m;
        Uri b;
        if (b()) {
            return;
        }
        if (!this.c.aR()) {
            a("Video caching disabled. Skipping...");
        } else if (this.c.l() == null || (m = this.c.m()) == null || (b = m.b()) == null) {
        } else {
            Uri a = a(b.toString(), Collections.emptyList(), false);
            if (a == null) {
                d("Failed to cache video file: " + m);
                return;
            }
            a("Video file successfully cached into: " + a);
            m.a(a);
        }
    }

    private void l() {
        String aO;
        String str;
        if (b()) {
            return;
        }
        if (this.c.aP() != null) {
            a("Begin caching HTML template. Fetching from " + this.c.aP() + "...");
            aO = a(this.c.aP().toString(), this.c.J());
        } else {
            aO = this.c.aO();
        }
        if (StringUtils.isValidString(aO)) {
            com.applovin.impl.a.a aVar = this.c;
            aVar.a(a(aO, aVar.J(), this.c));
            str = "Finish caching HTML template " + this.c.aO() + " for ad #" + this.c.getAdIdNumber();
        } else {
            str = "Unable to load HTML template";
        }
        a(str);
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        if (this.c.f()) {
            a("Begin caching for VAST streaming ad #" + this.a.getAdIdNumber() + "...");
            c();
            if (this.c.g()) {
                i();
            }
            if (this.c.e() == a.b.COMPANION_AD) {
                j();
                l();
            } else {
                k();
            }
            if (!this.c.g()) {
                i();
            }
            if (this.c.e() == a.b.COMPANION_AD) {
                k();
            } else {
                j();
                l();
            }
        } else {
            a("Begin caching for VAST ad #" + this.a.getAdIdNumber() + "...");
            c();
            j();
            k();
            l();
            i();
        }
        a("Finished caching VAST ad #" + this.c.getAdIdNumber());
        long currentTimeMillis = System.currentTimeMillis() - this.c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.c, this.b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.c, this.b);
        a(this.c);
        this.c.c();
        a();
    }
}
