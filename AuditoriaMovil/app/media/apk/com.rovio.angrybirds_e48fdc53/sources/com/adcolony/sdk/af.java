package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.adcolony.sdk.aj;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class af implements aj.a {
    private String B;
    private String C;
    private String D;
    private String E;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private Application.ActivityLifecycleCallbacks U;
    ah a;
    h b;
    boolean d;
    private ag e;
    private e f;
    private ak g;
    private k h;
    private ab i;
    private ai j;
    private an k;
    private o l;
    private m m;
    private ADCCrashReportManager n;
    private b o;
    private aa p;
    private u q;
    private AdColonyInterstitial r;
    private AdColonyRewardListener s;
    private AdColonyAppOptions u;
    private d v;
    private boolean w;
    private d x;
    private JSONObject y;
    static String c = "https://adc3-launcg.adcolony.col/v4/launch";
    private static volatile String F = "";
    private HashMap<String, AdColonyCustomMessageListener> t = new HashMap<>();
    private HashMap<String, AdColonyZone> z = new HashMap<>();
    private HashMap<Integer, s> A = new HashMap<>();
    private int S = 1;
    private final int T = 120;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAppOptions adColonyAppOptions, boolean z) {
        this.I = z;
        this.u = adColonyAppOptions;
        this.n = new ADCCrashReportManager();
        this.f = new e();
        this.e = new ag();
        this.g = new ak();
        this.g.a();
        this.h = new k();
        this.h.a();
        this.i = new ab();
        this.i.a();
        this.j = new ai();
        this.k = new an();
        this.k.a();
        this.o = new b();
        b bVar = this.o;
        b.a();
        this.m = new m();
        this.m.a();
        this.l = new o();
        this.l.a();
        this.a = new ah();
        this.a.d();
        this.b = new h();
        this.B = this.b.c();
        AdColony.a(a.c(), adColonyAppOptions);
        if (!z) {
            this.M = new File(this.m.g() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").exists();
            this.N = new File(this.m.g() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").exists();
            this.L = this.M && this.N && as.b(as.c(new StringBuilder().append(this.m.g()).append("026ae9c9824b3e483fa6c71fa88f57ae27816141").toString()), "sdkVersion").equals(this.a.y());
            if (this.M) {
                this.y = as.c(this.m.g() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
                b(this.y);
            }
            e(this.L);
            F();
        }
        a.a("Module.load", new f() { // from class: com.adcolony.sdk.af.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.a(dVar);
            }
        });
        a.a("Module.unload", new f() { // from class: com.adcolony.sdk.af.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.f(dVar);
            }
        });
        a.a("AdColony.on_configured", new f() { // from class: com.adcolony.sdk.af.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.J = true;
                if (af.this.P) {
                    JSONObject a = as.a();
                    JSONObject a2 = as.a();
                    as.a(a2, "app_version", q.b());
                    as.a(a, "app_bundle_info", a2);
                    new d("AdColony.on_update", 1, a).a();
                    af.this.P = false;
                }
                if (af.this.Q) {
                    new d("AdColony.on_update", 1).a();
                }
                if (b.e != null) {
                    b.e.b(as.b(dVar.b(), "app_session_id"));
                }
                if (AdColonyEventTracker.b()) {
                    AdColonyEventTracker.a();
                }
            }
        });
        a.a("AdColony.get_app_info", new f() { // from class: com.adcolony.sdk.af.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.g(dVar);
            }
        });
        a.a("AdColony.v4vc_reward", new f() { // from class: com.adcolony.sdk.af.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.d(dVar);
            }
        });
        a.a("AdColony.zone_info", new f() { // from class: com.adcolony.sdk.af.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.e(dVar);
            }
        });
        a.a("AdColony.probe_launch_server", new f() { // from class: com.adcolony.sdk.af.9
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.a(true, true);
            }
        });
        a.a("Crypto.sha1", new f() { // from class: com.adcolony.sdk.af.10
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject a = as.a();
                as.a(a, "sha1", q.c(as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_DATA)));
                dVar.a(a).a();
            }
        });
        a.a("Crypto.crc32", new f() { // from class: com.adcolony.sdk.af.11
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject a = as.a();
                as.b(a, "crc32", q.b(as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_DATA)));
                dVar.a(a).a();
            }
        });
        a.a("Crypto.uuid", new f() { // from class: com.adcolony.sdk.af.12
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                int c2 = as.c(dVar.b(), "number");
                JSONObject a = as.a();
                as.a(a, "uuids", q.a(c2));
                dVar.a(a).a();
            }
        });
        a.a("Device.query_advertiser_info", new f() { // from class: com.adcolony.sdk.af.13
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                if (a.d()) {
                    q.a.execute(new Runnable() { // from class: com.adcolony.sdk.af.13.1
                        @Override // java.lang.Runnable
                        public void run() {
                            af.this.a(a.c(), dVar);
                        }
                    });
                }
            }
        });
        a.a("AdColony.controller_version", new f() { // from class: com.adcolony.sdk.af.14
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                af.this.a.f = as.b(dVar.b(), "version");
                if (b.e != null) {
                    b.e.a(af.this.a.f);
                }
                au.d.b("Controller version: " + af.this.a.f);
            }
        });
        int a = q.a(this.m);
        this.P = a == 1;
        this.Q = a == 2;
    }

    private boolean A() {
        if (this.I || !this.a.c().contains("arm") || ADCNative.nativeNeonSupported()) {
            return true;
        }
        au.g.b("ARM architechture without NEON support. Disabling AdColony.");
        a(true);
        return false;
    }

    private boolean e(boolean z) {
        return a(z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z, boolean z2) {
        if (a.d()) {
            q.e(a.c().getFilesDir().getAbsolutePath() + "/../");
            au.b.a(">").b(a.c().getFilesDir().getAbsolutePath() + "/../");
            File file = new File(this.m.c() + "/../lib/libImmEndpointWarpJ.so");
            this.a.d = file.exists();
            this.O = z2;
            this.L = z;
            if (!z || z2 || E()) {
                B();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        new Thread(new Runnable() { // from class: com.adcolony.sdk.af.15
            @Override // java.lang.Runnable
            public void run() {
                JSONObject a = as.a();
                as.a(a, "url", af.c);
                as.a(a, "content_type", "application/json");
                as.a(a, "content", af.this.a.a(af.this.a).toString());
                au.b.b("Launch: " + af.this.a.a(af.this.a).toString());
                au.d.a("Saving Launch to ").a(af.this.m.g()).b("026ae9c9824b3e483fa6c71fa88f57ae27816141");
                new aj(new d("WebServices.post", 0, a), af.this);
            }
        }).start();
    }

    private boolean a(JSONObject jSONObject) {
        if (!this.L) {
            au.f.b("Non-standard launch. Downloading new controller.");
            return true;
        } else if (this.y != null && as.b(as.f(this.y, "controller"), "sha1").equals(as.b(as.f(jSONObject, "controller"), "sha1"))) {
            return false;
        } else {
            au.f.b("Controller sha1 does not match, downloading new controller.");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(d dVar) {
        a(as.c(dVar.b(), "id"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.I = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(d dVar) {
        JSONObject jSONObject = this.u.d;
        as.a(jSONObject, "app_id", this.u.a);
        as.a(jSONObject, "zone_ids", this.u.c);
        JSONObject a = as.a();
        as.a(a, "options", jSONObject);
        dVar.a(a).a();
    }

    boolean a(final d dVar) {
        if (a.d()) {
            try {
                final int c2 = dVar.b().has("id") ? as.c(dVar.b(), "id") : 0;
                if (c2 <= 0) {
                    c2 = this.f.d();
                }
                a(c2);
                boolean d = as.d(dVar.b(), "is_webview");
                final boolean d2 = as.d(dVar.b(), "is_display_module");
                if (d) {
                    q.a(new Runnable() { // from class: com.adcolony.sdk.af.16
                        @Override // java.lang.Runnable
                        public void run() {
                            s sVar = new s(a.c().getApplicationContext(), af.this.f.d(), d2);
                            sVar.a(true, dVar);
                            af.this.A.put(Integer.valueOf(sVar.a()), sVar);
                        }
                    });
                } else {
                    final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    newSingleThreadExecutor.submit(new Runnable() { // from class: com.adcolony.sdk.af.17
                        @Override // java.lang.Runnable
                        public void run() {
                            JSONObject f = as.f(dVar.b(), DBDefinition.SEGMENT_INFO);
                            af a = a.a();
                            if (c2 == 1 && a.b() != null) {
                                as.a(f, "options", a.b().d());
                            }
                            af.this.f.a(new ADCVMModule(a.c(), c2, as.b(dVar.b(), "filepath"), f, newSingleThreadExecutor));
                        }
                    });
                    JSONObject a = as.a();
                    as.a(a, "success", true);
                    as.b(a, "id", c2);
                    dVar.a(a).a();
                }
                return true;
            } catch (RuntimeException e) {
                au.h.b("Failed to create AdUnit file://" + as.b(dVar.b(), "filepath"));
                au.h.b(e.toString());
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        this.v = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(d dVar) {
        this.x = dVar;
    }

    private void C() {
        if (a.a().i().f()) {
            this.R++;
            this.S = this.S * this.R <= 120 ? this.S * this.R : 120;
            q.a(new Runnable() { // from class: com.adcolony.sdk.af.18
                @Override // java.lang.Runnable
                public void run() {
                    new Handler().postDelayed(new Runnable() { // from class: com.adcolony.sdk.af.18.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a.a().i().f()) {
                                af.this.B();
                            }
                        }
                    }, af.this.S * 1000);
                }
            });
            return;
        }
        au.f.b("Max launch server download attempts hit, or AdColony is no longer active.");
    }

    @Override // com.adcolony.sdk.aj.a
    public void a(aj ajVar, d dVar, Map<String, List<String>> map) {
        if (ajVar.b.equals(c)) {
            if (ajVar.d) {
                au.b.b("Launch: " + ajVar.c);
                JSONObject a = as.a(ajVar.c);
                as.a(a, "sdkVersion", this.a.y());
                if (a != null) {
                    as.h(a, this.m.g() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
                    if (!c(a)) {
                        if (!this.L) {
                            au.g.b("Incomplete or disabled launch server response. Disabling AdColony until next launch.");
                            a(true);
                            return;
                        }
                        return;
                    }
                    if (a(a)) {
                        au.d.b("Controller missing or out of date. Downloading new controller.");
                        JSONObject a2 = as.a();
                        as.a(a2, "url", this.C);
                        as.a(a2, "filepath", this.m.g() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                        new aj(new d("WebServices.download", 0, a2), this);
                    }
                    this.y = a;
                    return;
                }
                return;
            }
            C();
        } else if (ajVar.b.equals(this.C)) {
            if (!b(this.D)) {
                au.e.b("Downloaded controller sha1 does not match expected value, retrying.");
                C();
            } else if (!this.L && !this.O) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.af.19
                    @Override // java.lang.Runnable
                    public void run() {
                        au.b.b("Loaded library. Success=" + af.this.E());
                    }
                });
            }
        }
    }

    private boolean D() {
        if (!this.K) {
            try {
                System.loadLibrary("js");
                System.loadLibrary("adcolony");
            } catch (UnsatisfiedLinkError e) {
                a(true);
                au.g.b("Expecting libadcolony.so in libs folder but it was not found. Disabling AdColony until next launch.");
                return false;
            }
        }
        this.K = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        if (!D()) {
            return false;
        }
        this.n.a();
        this.n.b();
        this.f.a();
        A();
        return true;
    }

    private boolean b(String str) {
        if (a.d()) {
            File file = new File(a.c().getFilesDir().getAbsolutePath() + "/adc3/7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            if (file.exists()) {
                return q.a(str, file);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Context context, d dVar) {
        if (context == null) {
            return false;
        }
        AdvertisingIdClient.Info info = null;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Exception e) {
            e.printStackTrace();
            if (Build.MANUFACTURER.equals("Amazon")) {
                return false;
            }
            au.e.b("Advertising ID is not available. Collecting Android ID instead of Advertising ID.");
            return false;
        } catch (NoClassDefFoundError e2) {
            au.e.b("Google Play Services ads dependencies are missing. Collecting Android ID instead of Advertising ID.");
            return false;
        } catch (NoSuchMethodError e3) {
            au.e.b("Google Play Services is out of date, please update to GPS 4.0+. Collecting Android ID instead of Advertising ID.");
        }
        if (info != null) {
            this.a.a = info.getId();
            b.e.e.put("advertisingId", this.a.a);
            this.a.c = info.isLimitAdTrackingEnabled();
            this.a.b = true;
            if (dVar != null) {
                JSONObject a = as.a();
                as.a(a, "advertiser_id", this.a.b());
                as.a(a, "limit_ad_tracking", this.a.f());
                dVar.a(a).a();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAppOptions adColonyAppOptions) {
        synchronized (this.i.c()) {
            for (Map.Entry<String, AdColonyInterstitial> entry : this.i.c().entrySet()) {
                AdColonyInterstitial value = entry.getValue();
                value.a(true);
                value.getListener().onExpiring(value);
            }
            this.i.c().clear();
        }
        this.J = false;
        a(1);
        this.z.clear();
        this.u = adColonyAppOptions;
        this.f.a();
        a(true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        if (this.f.a(i) == null) {
            return false;
        }
        if (this.A.containsKey(Integer.valueOf(i))) {
            s sVar = this.A.get(Integer.valueOf(i));
            if (sVar.g()) {
                sVar.loadUrl("about:blank");
                sVar.clearCache(true);
                sVar.removeAllViews();
                sVar.a(true);
            }
            this.A.remove(Integer.valueOf(i));
        }
        if (this.x != null) {
            this.x.a();
            this.x = null;
            this.w = false;
        }
        au.d.a("Destroying module with id = ").b(i);
        return true;
    }

    private void b(JSONObject jSONObject) {
        if (!ADCVMModule.a) {
            JSONObject f = as.f(jSONObject, "logging");
            b.d = as.a(f, "send_level", 1);
            b.a = as.d(f, "log_private");
            b.b = as.a(f, "print_level", 3);
            ADCCrashReportManager.a = as.d(f, "enable_crash_reporting");
            if (ADCCrashReportManager.a && D()) {
                this.n.a();
                this.n.b();
            }
            this.o.a(as.g(f, "modules"));
        }
    }

    private boolean c(JSONObject jSONObject) {
        if (jSONObject == null) {
            au.d.b("Launch response verification failed - response is null or unknown");
            return false;
        }
        try {
            JSONObject f = as.f(jSONObject, "controller");
            this.C = as.b(f, "url");
            this.D = as.b(f, "sha1");
            this.E = as.b(jSONObject, "status");
            F = as.b(jSONObject, "pie");
            if (AdColonyEventTracker.b()) {
                AdColonyEventTracker.a();
            }
            b(jSONObject);
        } catch (Exception e) {
            try {
                new File(this.m.g() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
            } catch (Exception e2) {
            }
        }
        if (this.E.equals("disable")) {
            try {
                new File(this.m.g() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").delete();
            } catch (Exception e3) {
            }
            au.f.b("Launch server response with disabled status. Disabling AdColony until next launch.");
            a(true);
            return false;
        } else if (this.C.equals("") || this.E.equals("")) {
            au.g.b("Missing controller status or URL. Disabling AdColony until next launch.");
            return false;
        } else {
            return true;
        }
    }

    boolean d(final d dVar) {
        if (this.s != null) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.af.2
                @Override // java.lang.Runnable
                public void run() {
                    af.this.s.onReward(new AdColonyReward(dVar));
                }
            });
            return true;
        }
        return false;
    }

    void e(d dVar) {
        AdColonyZone adColonyZone;
        if (this.I) {
            au.f.b("AdColony is disabled. Ignoring zone_info message.");
            return;
        }
        String b = as.b(dVar.b(), "zone_id");
        if (this.z.containsKey(b)) {
            adColonyZone = this.z.get(b);
        } else {
            adColonyZone = new AdColonyZone(b);
            this.z.put(b, adColonyZone);
        }
        adColonyZone.a(dVar);
    }

    private void F() {
        if (a.d() && this.U == null) {
            this.U = new Application.ActivityLifecycleCallbacks() { // from class: com.adcolony.sdk.af.3
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    a.b = true;
                    a.a(activity);
                    if (a.d() && af.this.h.e() && (a.c() instanceof t) && !((t) a.c()).i) {
                        au.d.b("Ignoring onActivityResumed");
                        return;
                    }
                    au.d.b("onActivityResumed() Activity Lifecycle Callback");
                    a.a(activity);
                    if (af.this.v != null) {
                        af.this.v.a(af.this.v.b()).a();
                        af.this.v = null;
                    }
                    af.this.H = false;
                    af.this.h.d(true);
                    af.this.h.e(true);
                    af.this.h.f(false);
                    if (af.this.d && !af.this.h.f()) {
                        af.this.h.a(true);
                    }
                    af.this.j.a();
                    if (b.e == null || b.e.b == null || b.e.b.isShutdown()) {
                        AdColony.a(activity, a.a().u);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    a.b = false;
                    af.this.h.d(false);
                    af.this.h.e(true);
                    a.a().a.z();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!af.this.h.f()) {
                        af.this.h.a(true);
                    }
                    a.a(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }
            };
            a.c().getApplication().registerActivityLifecycleCallbacks(this.U);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAppOptions b() {
        if (this.u == null) {
            this.u = new AdColonyAppOptions();
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AdColonyAppOptions adColonyAppOptions) {
        this.u = adColonyAppOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, AdColonyZone> c() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.H = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyRewardListener f() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyRewardListener adColonyRewardListener) {
        this.s = adColonyRewardListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public an g() {
        if (this.k == null) {
            this.k = new an();
            this.k.a();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ADCCrashReportManager h() {
        if (this.n == null) {
            this.n = new ADCCrashReportManager();
        }
        this.n.a();
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        if (this.h == null) {
            this.h = new k();
            this.h.a();
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab j() {
        if (this.i == null) {
            this.i = new ab();
            this.i.a();
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah k() {
        if (this.a == null) {
            this.a = new ah();
            this.a.d();
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m l() {
        if (this.m == null) {
            this.m = new m();
            this.m.a();
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h m() {
        if (this.b == null) {
            this.b = new h();
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e n() {
        if (this.f == null) {
            this.f = new e();
            this.f.a();
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai o() {
        if (this.j == null) {
            this.j = new ai();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa p() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(aa aaVar) {
        this.p = aaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(u uVar) {
        this.q = uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyInterstitial r() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyInterstitial adColonyInterstitial) {
        this.r = adColonyInterstitial;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.B = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        this.G = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, s> u() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z) {
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, AdColonyCustomMessageListener> w() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String z() {
        return F;
    }
}
