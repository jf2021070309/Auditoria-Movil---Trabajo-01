package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class n extends a {
    private final com.applovin.impl.sdk.m a;

    public n(com.applovin.impl.sdk.m mVar) {
        super("TaskInitializeSdk", mVar);
        this.a = mVar;
    }

    private void a() {
        if (this.a.D().a()) {
            return;
        }
        Activity ao = this.a.ao();
        if (ao != null) {
            this.a.D().a(ao);
        } else {
            this.a.S().a(new z(this.a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.a.D().a(n.this.a.ae().a());
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void b() {
        if (this.a.e()) {
            return;
        }
        boolean d2 = this.a.K().d();
        String r = d2 ? e.a.d.a.a.r(new StringBuilder(), this.a.V().l().f4259b, " (use this for test devices)") : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        Map<String, Object> d3 = this.a.V().d();
        Map<String, Object> c2 = this.a.V().c();
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.a().a("=====AppLovin SDK=====");
        kVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(com.applovin.impl.sdk.c.b.dA)).a("Ad Review Version", Utils.getSafedkVersion()).a("OM SDK Version", this.a.am().c());
        kVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a("GAID", r).a("Model", d3.get("model")).a("Locale", d3.get("locale")).a("Emulator", d3.get("sim")).a("WVVC", d3.get("wvvc")).a("Tablet", d3.get("is_tablet"));
        kVar.a("===App Info===").a("Application ID", c2.get("package_name")).a("Target SDK", c2.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        kVar.a("===SDK Settings===").a("SDK Key", this.a.z()).a("Mediation Provider", this.a.t()).a("TG", com.applovin.impl.sdk.utils.o.a(this.a)).a("Test Mode On", Boolean.valueOf(this.a.J().a())).a("Verbose Logging On", Boolean.valueOf(d2));
        kVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.sdk.j.a(f()));
        kVar.a();
        com.applovin.impl.sdk.v.f("AppLovinSdk", kVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x013f, code lost:
        if (r12.a.d() != false) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.n.run():void");
    }
}
