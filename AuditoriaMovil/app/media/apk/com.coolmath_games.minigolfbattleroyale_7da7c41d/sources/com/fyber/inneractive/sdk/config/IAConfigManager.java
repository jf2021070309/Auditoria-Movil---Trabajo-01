package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.config.l;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.h.ac;
import com.fyber.inneractive.sdk.h.ai;
import com.fyber.inneractive.sdk.h.aj;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ab;
import com.fyber.inneractive.sdk.util.ae;
import com.fyber.inneractive.sdk.util.ag;
import com.fyber.inneractive.sdk.util.an;
import com.fyber.inneractive.sdk.util.ao;
import com.fyber.inneractive.sdk.util.h;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.s;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class IAConfigManager {
    private static long G;
    public static final IAConfigManager n = new IAConfigManager();
    private com.fyber.inneractive.sdk.config.a.a A;
    private com.fyber.inneractive.sdk.h.y<a> C;
    private com.fyber.inneractive.sdk.h.y<com.fyber.inneractive.sdk.config.a.l> D;
    private d E;
    private final com.fyber.inneractive.sdk.dv.c.a F;
    private final com.fyber.inneractive.sdk.a.d H;
    private final com.fyber.inneractive.sdk.h.c I;
    private final Map<r.b, r.a> J;
    public String d;
    String f;
    String g;
    InneractiveUserConfig i;
    public String k;
    public List<String> l;
    private String p;
    private String q;
    private Context r;
    private List<OnConfigurationReadyAndValidListener> s;
    private j w;
    private k x;
    private an z;
    String a = null;
    Map<String, s> b = new HashMap();
    Map<String, t> c = new HashMap();
    private c o = new c();
    boolean e = false;
    public final m h = new m();
    boolean j = true;
    private boolean t = false;
    private boolean u = true;
    private final com.fyber.inneractive.sdk.h.t v = new com.fyber.inneractive.sdk.h.t();
    public String m = "";
    private final y y = new y();
    private final ab B = new ab();

    /* loaded from: classes.dex */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* loaded from: classes.dex */
    public static class a {
        String a;
        String b;
        String c;
        String d;
        Map<String, s> e = new HashMap();
        Map<String, t> f = new HashMap();
        c g = new c();
    }

    static /* synthetic */ boolean v() {
        return w();
    }

    IAConfigManager() {
        this.F = com.fyber.inneractive.sdk.util.l.a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback") ? new com.fyber.inneractive.sdk.dv.c.b() : new com.fyber.inneractive.sdk.dv.c.c();
        this.H = new com.fyber.inneractive.sdk.a.d();
        this.I = new com.fyber.inneractive.sdk.h.c();
        this.J = new HashMap();
        this.s = new CopyOnWriteArrayList();
    }

    public static void a(final Context context, String str, String str2, String str3) {
        IAConfigManager iAConfigManager = n;
        if (iAConfigManager.e) {
            return;
        }
        com.fyber.inneractive.sdk.h.t tVar = iAConfigManager.v;
        if (!tVar.b) {
            tVar.b = true;
            for (int i = 0; i < 6; i++) {
                tVar.c.submit(tVar.d);
            }
        }
        com.fyber.inneractive.sdk.m.i.a();
        com.fyber.inneractive.sdk.m.i.b();
        final an anVar = new an();
        iAConfigManager.z = anVar;
        anVar.b = context.getApplicationContext();
        com.fyber.inneractive.sdk.util.m.a.execute(new Runnable() { // from class: com.fyber.inneractive.sdk.util.an.2
            @Override // java.lang.Runnable
            public final void run() {
                if (anVar.b != null) {
                    SharedPreferences sharedPreferences = anVar.b.getSharedPreferences("fyber.ua", 0);
                    anVar.a = sharedPreferences.getString("ua", null);
                    if (!TextUtils.isEmpty(anVar.a)) {
                        IAlog.b("UserAgentProvider | populated user agent form shared prefs", new Object[0]);
                        anVar.c.compareAndSet(false, true);
                    }
                    an.a(anVar);
                }
            }
        });
        iAConfigManager.E = new d();
        iAConfigManager.w = new j(context);
        iAConfigManager.x = new k(iAConfigManager.w);
        iAConfigManager.w.a();
        final com.fyber.inneractive.sdk.h.c cVar = iAConfigManager.I;
        Application application = (Application) context.getApplicationContext();
        if (!cVar.f) {
            cVar.f = true;
            cVar.b.start();
            cVar.c = new ag(cVar.b.getLooper(), cVar);
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.fyber.inneractive.sdk.h.c.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (cVar.c != null) {
                    cVar.c.removeMessages(20150330);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (cVar.c != null) {
                    cVar.c.sendEmptyMessageDelayed(20150330, 3500L);
                }
            }
        });
        iAConfigManager.w.a(new j.a() { // from class: com.fyber.inneractive.sdk.config.IAConfigManager.1
            @Override // com.fyber.inneractive.sdk.config.j.a
            public final void onGlobalConfigChanged(j jVar, i iVar) {
                IAConfigManager.this.H.a();
                com.fyber.inneractive.sdk.h.c cVar2 = IAConfigManager.this.I;
                int a2 = IAConfigManager.c().a.a("send_events_batch_interval", 30, -1);
                int i2 = a2 >= 0 ? a2 : 30;
                cVar2.e = true;
                cVar2.d = i2;
                cVar2.a();
                if (cVar2.c != null) {
                    cVar2.c.sendEmptyMessageDelayed(12312329, cVar2.d * 1000);
                }
            }
        });
        iAConfigManager.A = new com.fyber.inneractive.sdk.config.a.a(new com.fyber.inneractive.sdk.config.a.r());
        IAlog.b("Initializing config manager", new Object[0]);
        IAlog.b("Config manager: lib name = %s", str2);
        IAlog.b("Config manager: app version = %s", str3);
        final com.fyber.inneractive.sdk.util.s a2 = s.a.a();
        a2.a = context.getApplicationContext();
        if (a2.a != null && n.u) {
            a2.c = new h.a() { // from class: com.fyber.inneractive.sdk.util.s.1
                @Override // com.fyber.inneractive.sdk.util.h.a
                public final void a(Location location) {
                    a2.b = location;
                }
            };
            com.fyber.inneractive.sdk.util.h.a(a2.a, a2.c);
        }
        final l lVar = l.a.a;
        if (lVar.a == null) {
            lVar.a = context;
            new Thread(new Runnable() { // from class: com.fyber.inneractive.sdk.config.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient") != null) {
                            Context context2 = context;
                            a aVar = lVar;
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context2);
                                String id = advertisingIdInfo.getId();
                                IAlog.a("advertising id: %s", id);
                                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                                IAlog.a("limit ad tracking: %s", Boolean.valueOf(isLimitAdTrackingEnabled));
                                aVar.a(id, isLimitAdTrackingEnabled, false);
                            } catch (Exception e) {
                                IAlog.a("Handled Exception:", new Object[0]);
                                IAlog.a(com.fyber.inneractive.sdk.util.q.a(e), new Object[0]);
                                IAlog.c("Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)", new Object[0]);
                            }
                        }
                        if (TextUtils.isEmpty(l.a())) {
                            Context context3 = context;
                            a aVar2 = lVar;
                            try {
                                ContentResolver contentResolver = context3.getContentResolver();
                                aVar2.a(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0, true);
                            } catch (Settings.SettingNotFoundException unused) {
                            }
                        }
                    } catch (ClassNotFoundException e2) {
                        IAlog.e("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + e2.toString(), new Object[0]);
                    }
                }
            }).start();
        }
        if (!str.matches("[0-9]+")) {
            IAlog.e("************************************************************************************************************************", new Object[0]);
            IAlog.e("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
            IAlog.e("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
            IAlog.e("************************************************************************************************************************", new Object[0]);
        }
        iAConfigManager.r = context;
        iAConfigManager.d = str;
        iAConfigManager.f = str2;
        iAConfigManager.g = str3;
        iAConfigManager.i = new InneractiveUserConfig();
        iAConfigManager.e = true;
        y yVar = iAConfigManager.y;
        yVar.b = new com.fyber.inneractive.sdk.config.b(yVar);
        com.fyber.inneractive.sdk.config.b bVar = yVar.b;
        if (!n.w.c) {
            n.w.a(bVar);
        }
        bVar.c = new ao(TimeUnit.MINUTES, n.w.a.a("session_duration", 30, 1));
        bVar.c.b = bVar.f;
        yVar.b("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
        yVar.a = new com.fyber.inneractive.sdk.a.a.a((byte) 0);
        final com.fyber.inneractive.sdk.a.a.a aVar = yVar.a;
        com.fyber.inneractive.sdk.util.m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.a.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                Application p = com.fyber.inneractive.sdk.util.l.p();
                String a3 = com.fyber.inneractive.sdk.util.l.a("session_details.json", p);
                if (!TextUtils.isEmpty(a3)) {
                    final JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(a3);
                    } catch (Throwable unused) {
                        IAlog.d("Failed parsing SessionCache", new Object[0]);
                    }
                    if (jSONObject != null) {
                        m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.a.a.a.2.1
                            {
                                AnonymousClass2.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.fyber.inneractive.sdk.a.a.a.b[] values;
                                a aVar2 = aVar;
                                JSONObject jSONObject2 = jSONObject;
                                for (com.fyber.inneractive.sdk.a.a.a.b bVar2 : com.fyber.inneractive.sdk.a.a.a.b.values()) {
                                    if (bVar2 != com.fyber.inneractive.sdk.a.a.a.b.NONE) {
                                        JSONArray a4 = ae.a(jSONObject2, bVar2.name());
                                        for (int i2 = 0; i2 < a4.length(); i2++) {
                                            b a5 = b.a(a4.optJSONObject(i2));
                                            if (a5 != null && a5.a != 0) {
                                                aVar2.a(bVar2, a5);
                                            }
                                        }
                                    }
                                }
                                JSONObject optJSONObject = jSONObject2.optJSONObject("currentSession");
                                if (optJSONObject != null) {
                                    c cVar2 = new c();
                                    JSONArray a6 = ae.a(optJSONObject, "content");
                                    for (int i3 = 0; i3 < a6.length(); i3++) {
                                        JSONObject a7 = ae.a(a6, i3);
                                        com.fyber.inneractive.sdk.a.a.a.b a8 = com.fyber.inneractive.sdk.a.a.a.b.a(a7.optString("type"), a7.optString("subType"));
                                        b a9 = b.a(a7.optJSONObject("session_data"));
                                        if (a9 != null) {
                                            cVar2.a.put(a8, a9);
                                        }
                                    }
                                    aVar2.a(cVar2);
                                }
                                aVar.d = true;
                            }
                        });
                        return;
                    }
                    p.deleteFile("session_details.json");
                    aVar.d = true;
                    return;
                }
                aVar.d = true;
            }
        });
        ac acVar = new ac(new com.fyber.inneractive.sdk.h.r<a>() { // from class: com.fyber.inneractive.sdk.config.IAConfigManager.2
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(a aVar2, Exception exc, boolean z) {
                a aVar3 = aVar2;
                if (IAConfigManager.this.l == null) {
                    IAConfigManager iAConfigManager2 = IAConfigManager.this;
                    Context context2 = iAConfigManager2.r;
                    HashSet hashSet = new HashSet();
                    e.a(context2, hashSet);
                    if (hashSet.isEmpty()) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                        } else {
                            Locale locale = Locale.getDefault();
                            if (locale != null) {
                                hashSet.add(locale.toString().replace("_", "-"));
                            }
                        }
                    }
                    iAConfigManager2.l = new ArrayList(hashSet);
                }
                if (aVar3 != null) {
                    if (aVar3.d != null) {
                        IAConfigManager.this.a = aVar3.d;
                    }
                    if (z) {
                        IAConfigManager.this.a(aVar3);
                    } else {
                        long unused = IAConfigManager.G = System.currentTimeMillis();
                        IAConfigManager.b(IAConfigManager.this, aVar3);
                    }
                } else if (exc instanceof com.fyber.inneractive.sdk.h.d) {
                    long unused2 = IAConfigManager.G = System.currentTimeMillis();
                }
                if (z) {
                    return;
                }
                IAConfigManager.a(IAConfigManager.this, IAConfigManager.v(), exc);
                if (IAConfigManager.v()) {
                    IAConfigManager.d(IAConfigManager.this);
                }
            }
        }, iAConfigManager.r, new com.fyber.inneractive.sdk.config.c());
        iAConfigManager.C = acVar;
        iAConfigManager.v.a(acVar);
        iAConfigManager.k = e.a();
        iAConfigManager.F.a();
    }

    public static void a() {
        n.e = false;
        com.fyber.inneractive.sdk.util.s a2 = s.a.a();
        IAlog.b("%sdestroy called", "Location Manager: ");
        a2.b();
        a2.a(a2.e);
        a2.a(a2.f);
        a2.e = null;
        a2.f = null;
        a2.a = null;
        a2.c = null;
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        n.s.add(onConfigurationReadyAndValidListener);
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        n.s.remove(onConfigurationReadyAndValidListener);
    }

    private void b(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.s) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean w = w();
                IAlog.a("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, w, !w ? exc : null);
            }
        }
    }

    public static an b() {
        return n.z;
    }

    public static j c() {
        return n.w;
    }

    public static com.fyber.inneractive.sdk.dv.c.a d() {
        return n.F;
    }

    public static com.fyber.inneractive.sdk.config.a.a e() {
        return n.A;
    }

    public static k f() {
        return n.x;
    }

    public static d g() {
        return n.E;
    }

    public static com.fyber.inneractive.sdk.h.s h() {
        return n.v;
    }

    public static void i() {
        IAConfigManager iAConfigManager = n;
        com.fyber.inneractive.sdk.h.y<a> yVar = iAConfigManager.C;
        if (yVar != null) {
            iAConfigManager.v.a(yVar);
        }
        if (n.w.c) {
            return;
        }
        n.w.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        this.q = aVar.c;
        this.p = aVar.b;
        this.b = aVar.e;
        this.c = aVar.f;
        this.o = aVar.g;
    }

    public static void a(InneractiveUserConfig inneractiveUserConfig) {
        n.i = inneractiveUserConfig;
        IAlog.b("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1 = com.fyber.inneractive.sdk.config.IAConfigManager.n.w;
        r1.c = false;
        com.fyber.inneractive.sdk.util.l.a(r1.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        i();
        com.fyber.inneractive.sdk.config.IAConfigManager.n.H.a();
        r1 = com.fyber.inneractive.sdk.m.i.a();
        com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.m.i.AnonymousClass1(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((java.lang.System.currentTimeMillis() - com.fyber.inneractive.sdk.config.IAConfigManager.G <= 3600000) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j() {
        /*
            boolean r0 = w()
            java.lang.Boolean r1 = com.fyber.inneractive.sdk.config.f.j()
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r0 == 0) goto L22
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = com.fyber.inneractive.sdk.config.IAConfigManager.G
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L24
        L22:
            if (r1 == 0) goto L47
        L24:
            if (r1 == 0) goto L31
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.n
            com.fyber.inneractive.sdk.config.j r1 = r1.w
            r1.c = r2
            com.fyber.inneractive.sdk.a.b r1 = r1.d
            com.fyber.inneractive.sdk.util.l.a(r1)
        L31:
            i()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.n
            com.fyber.inneractive.sdk.a.d r1 = r1.H
            r1.a()
            com.fyber.inneractive.sdk.m.i r1 = com.fyber.inneractive.sdk.m.i.a()
            com.fyber.inneractive.sdk.m.i$1 r2 = new com.fyber.inneractive.sdk.m.i$1
            r2.<init>()
            com.fyber.inneractive.sdk.util.m.a(r2)
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.j():boolean");
    }

    private static boolean w() {
        return n.q != null;
    }

    public static String k() {
        return n.p;
    }

    public static void a(boolean z) {
        n.t = z;
        IAlog.b("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (com.fyber.inneractive.sdk.util.p.a() || z) {
            return;
        }
        IAlog.d("************************************************************************************************************************", new Object[0]);
        IAlog.d("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.d("***  The traffic will be Secured  ", new Object[0]);
        IAlog.d("************************************************************************************************************************", new Object[0]);
    }

    public static boolean l() {
        return n.t;
    }

    public static void a(String str) {
        n.m = str;
    }

    public static ab m() {
        return n.B;
    }

    public static y n() {
        return n.y;
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        /* synthetic */ b(byte b) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        Set<Vendor> a = new HashSet();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Set<Vendor> set) {
            if (set != null) {
                for (Vendor vendor : set) {
                    if (vendor != null && !this.a.contains(vendor)) {
                        this.a.add(vendor);
                    }
                }
            }
        }
    }

    public static void b(String str) {
        if (com.fyber.inneractive.sdk.util.l.p() == null) {
            IAlog.d("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        d dVar = n.E;
        if (com.fyber.inneractive.sdk.util.l.p() != null) {
            dVar.a();
            dVar.d = str;
            if (dVar.f != null) {
                if (!TextUtils.isEmpty(str)) {
                    dVar.f.edit().putString("keyUserID", str).apply();
                } else {
                    dVar.f.edit().remove("keyUserID").apply();
                }
            }
        }
    }

    public static String o() {
        return n.E.d;
    }

    public static String p() {
        return n.d;
    }

    public static void b(boolean z) {
        n.u = z;
    }

    public static boolean q() {
        return n.u;
    }

    public static void c(String str) {
        IAConfigManager iAConfigManager = n;
        iAConfigManager.d = str;
        iAConfigManager.a = "";
        Map<String, s> map = iAConfigManager.b;
        if (map != null) {
            map.clear();
        }
        Map<String, t> map2 = n.c;
        if (map2 != null) {
            map2.clear();
        }
        IAConfigManager iAConfigManager2 = n;
        iAConfigManager2.q = null;
        iAConfigManager2.p = "";
    }

    public static com.fyber.inneractive.sdk.a.d r() {
        return n.H;
    }

    public static com.fyber.inneractive.sdk.h.c s() {
        return n.I;
    }

    public static void a(r.a aVar) {
        n.J.put(aVar.a(), aVar);
    }

    public static boolean a(r.b bVar, String str) {
        r.a aVar = n.J.get(bVar);
        if (aVar != null) {
            return aVar.a(str);
        }
        return false;
    }

    public static boolean t() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.l.p().getSharedPreferences("IAConfigurationPreferences", 0);
        return sharedPreferences != null && sharedPreferences.contains("IAConfigFQE");
    }

    public static void u() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.l.p().getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    static /* synthetic */ void b(IAConfigManager iAConfigManager, a aVar) {
        if (aVar != null) {
            IAlog.b("Got new remote configuration from server:", new Object[0]);
            iAConfigManager.a(aVar);
        }
    }

    static /* synthetic */ void a(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        int i;
        if (z) {
            iAConfigManager.b((Exception) null);
            return;
        }
        boolean z2 = true;
        if (!(exc instanceof InvalidAppIdException) && !(exc instanceof FileNotFoundException) && (!(exc instanceof aj) ? !TextUtils.isEmpty(iAConfigManager.d.trim()) : (i = ((aj) exc).a) < 400 || i >= 500)) {
            z2 = false;
        }
        if (z2) {
            iAConfigManager.b(new InvalidAppIdException());
        } else if (exc instanceof com.fyber.inneractive.sdk.h.b) {
            iAConfigManager.b(exc);
        } else {
            iAConfigManager.b(new b((byte) 0));
        }
    }

    static /* synthetic */ void d(IAConfigManager iAConfigManager) {
        if (iAConfigManager.D == null) {
            iAConfigManager.D = new ac(new com.fyber.inneractive.sdk.h.r<com.fyber.inneractive.sdk.config.a.l>() { // from class: com.fyber.inneractive.sdk.config.IAConfigManager.3
                @Override // com.fyber.inneractive.sdk.h.r
                public final /* synthetic */ void a(com.fyber.inneractive.sdk.config.a.l lVar, Exception exc, boolean z) {
                    com.fyber.inneractive.sdk.config.a.l lVar2 = lVar;
                    if (lVar2 != null) {
                        IAlog.b("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
                        IAConfigManager.this.A.b = lVar2;
                    } else if (exc != null) {
                        if (exc instanceof com.fyber.inneractive.sdk.h.d) {
                            IAlog.b("remote features config not modified", new Object[0]);
                            return;
                        }
                        IAlog.b("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
                        IAConfigManager.a(exc);
                    }
                }
            }, iAConfigManager.r, new com.fyber.inneractive.sdk.config.a.m());
        }
        int p = iAConfigManager.D.p();
        if (p == ai.c || p == ai.b) {
            return;
        }
        iAConfigManager.v.a(iAConfigManager.D);
    }

    static /* synthetic */ void a(Exception exc) {
        new n.a(com.fyber.inneractive.sdk.h.l.FATAL_FEATURES_CONFIG_ERROR).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).b(null);
    }
}
