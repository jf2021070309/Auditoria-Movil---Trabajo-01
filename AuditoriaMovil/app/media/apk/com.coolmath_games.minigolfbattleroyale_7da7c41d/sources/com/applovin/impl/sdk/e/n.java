package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class n extends a {
    private final com.applovin.impl.sdk.k a;

    public n(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar);
        this.a = kVar;
    }

    private void a() {
        if (this.a.B().a()) {
            return;
        }
        Activity al = this.a.al();
        if (al != null) {
            this.a.B().a(al);
        } else {
            this.a.Q().a(new y(this.a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.a.B().a(n.this.a.ad().a());
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void b() {
        String str;
        if (this.a.e()) {
            return;
        }
        boolean d = this.a.I().d();
        if (d) {
            str = this.a.T().j().b + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        Map<String, Object> d2 = this.a.T().d();
        Map<String, Object> c = this.a.T().c();
        com.applovin.impl.sdk.utils.j jVar = new com.applovin.impl.sdk.utils.j();
        jVar.a().a("=====AppLovin SDK=====");
        jVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(com.applovin.impl.sdk.c.b.dz)).a("Ad Review Version", Utils.getSafedkVersion());
        jVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a(IronSourceConstants.TYPE_GAID, str).a("Model", d2.get("model")).a("Locale", d2.get("locale")).a("Emulator", d2.get("sim")).a("WVVC", d2.get("wvvc"));
        jVar.a("===App Info===").a("Application ID", c.get("package_name")).a("Target SDK", c.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        jVar.a("===SDK Settings===").a("SDK Key", this.a.x()).a("Mediation Provider", this.a.s()).a("TG", com.applovin.impl.sdk.utils.n.a(this.a)).a("Test Mode On", Boolean.valueOf(this.a.H().a())).a("Verbose Logging On", Boolean.valueOf(d));
        jVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.sdk.h.a(f()));
        jVar.a();
        com.applovin.impl.sdk.r.f("AppLovinSdk", jVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0146, code lost:
        if (r12.a.d() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0190, code lost:
        if (r12.a.d() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0193, code lost:
        r2 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0194, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        a(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ac, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.n.run():void");
    }
}
