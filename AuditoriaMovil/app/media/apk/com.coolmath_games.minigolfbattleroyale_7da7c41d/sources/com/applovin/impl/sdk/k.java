package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class k {
    protected static Context a;
    private a A;
    private q B;
    private u C;
    private com.applovin.impl.sdk.network.d D;
    private g E;
    private com.applovin.impl.sdk.utils.l F;
    private f G;
    private n H;
    private l I;
    private PostbackServiceImpl J;
    private com.applovin.impl.sdk.network.f K;
    private com.applovin.impl.mediation.f L;
    private com.applovin.impl.mediation.e M;
    private MediationServiceImpl N;
    private com.applovin.impl.mediation.h O;
    private com.applovin.impl.mediation.debugger.a P;
    private s Q;
    private com.applovin.impl.mediation.d R;
    private com.applovin.impl.mediation.debugger.ui.testmode.b S;
    private List<MaxAdFormat> T;
    private final Object U = new Object();
    private final AtomicBoolean V = new AtomicBoolean(true);
    private boolean W = false;
    private boolean X = false;
    private boolean Y = false;
    private boolean Z = false;
    private boolean aa = false;
    private int ab = 0;
    private AppLovinSdk.SdkInitializationListener ac;
    private AppLovinSdk.SdkInitializationListener ad;
    private AppLovinSdkConfiguration ae;
    protected com.applovin.impl.sdk.c.c b;
    private String c;
    private WeakReference<Activity> d;
    private long e;
    private AppLovinSdkSettings f;
    private AppLovinUserSegment g;
    private String h;
    private AppLovinAdServiceImpl i;
    private EventServiceImpl j;
    private UserServiceImpl k;
    private VariableServiceImpl l;
    private AppLovinSdk m;
    private r n;
    private com.applovin.impl.sdk.e.o o;
    private com.applovin.impl.sdk.network.b p;
    private com.applovin.impl.sdk.d.g q;
    private m r;
    private com.applovin.impl.sdk.c.e s;
    private j t;
    private com.applovin.impl.sdk.utils.n u;
    private c v;
    private p w;
    private com.applovin.impl.sdk.a.e x;
    private com.applovin.impl.sdk.d.c y;
    private v z;

    public static Context K() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        for (String str : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            r.i("AppLovinSdk", str);
        }
    }

    private void am() {
        this.D.a(new d.a() { // from class: com.applovin.impl.sdk.k.4
            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                k.this.n.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                synchronized (k.this.U) {
                    if (!k.this.W) {
                        k.this.b();
                    }
                }
                k.this.D.b(this);
            }

            @Override // com.applovin.impl.sdk.network.d.a
            public void b() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MaxAdFormat> b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String str : asList) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(str);
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public com.applovin.impl.mediation.f A() {
        return this.L;
    }

    public com.applovin.impl.mediation.e B() {
        return this.M;
    }

    public MediationServiceImpl C() {
        return this.N;
    }

    public s D() {
        return this.Q;
    }

    public com.applovin.impl.mediation.debugger.a E() {
        return this.P;
    }

    public com.applovin.impl.mediation.h F() {
        return this.O;
    }

    public com.applovin.impl.mediation.d G() {
        return this.R;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.b H() {
        return this.S;
    }

    public com.applovin.impl.sdk.c.c I() {
        return this.b;
    }

    public Context J() {
        return a;
    }

    public Activity L() {
        WeakReference<Activity> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public long M() {
        return this.e;
    }

    public boolean N() {
        return this.Z;
    }

    public boolean O() {
        return this.aa;
    }

    public com.applovin.impl.sdk.network.b P() {
        return this.p;
    }

    public com.applovin.impl.sdk.e.o Q() {
        return this.o;
    }

    public com.applovin.impl.sdk.d.g R() {
        return this.q;
    }

    public com.applovin.impl.sdk.network.f S() {
        return this.K;
    }

    public m T() {
        return this.r;
    }

    public j U() {
        return this.t;
    }

    public PostbackServiceImpl V() {
        return this.J;
    }

    public AppLovinSdk W() {
        return this.m;
    }

    public c X() {
        return this.v;
    }

    public p Y() {
        return this.w;
    }

    public com.applovin.impl.sdk.a.e Z() {
        return this.x;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) this.b.a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) null);
    }

    public <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t, cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.U) {
            if (!this.W && !this.X) {
                b();
            }
        }
    }

    public void a(long j) {
        this.t.a(j);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.s.a(sharedPreferences);
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        if (this.o.a()) {
            return;
        }
        List<String> b = b(com.applovin.impl.sdk.c.a.a);
        if (b.size() <= 0 || !this.M.c().containsAll(b)) {
            return;
        }
        this.n.b("AppLovinSdk", "All required adapters initialized");
        this.o.d();
        j();
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        this.s.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.s.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t, sharedPreferences);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.ac = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            sdkInitializationListener.onSdkInitialized(this.ae);
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.m = appLovinSdk;
    }

    public void a(String str) {
        r.f("AppLovinSdk", "Setting plugin version: " + str);
        this.b.a(com.applovin.impl.sdk.c.b.dz, str);
        this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x027e, code lost:
        if (com.applovin.sdk.AppLovinSdk.VERSION_CODE > com.applovin.impl.sdk.utils.Utils.toVersionCode(r7)) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r7, com.applovin.sdk.AppLovinSdkSettings r8, android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.a(java.lang.String, com.applovin.sdk.AppLovinSdkSettings, android.content.Context):void");
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        this.s.a(str, (String) t, editor);
    }

    public void a(boolean z) {
        synchronized (this.U) {
            this.W = false;
            this.X = z;
        }
        if (this.b == null || this.o == null) {
            return;
        }
        List<String> b = b(com.applovin.impl.sdk.c.a.a);
        if (b.isEmpty()) {
            this.o.d();
            j();
            return;
        }
        long longValue = ((Long) a(com.applovin.impl.sdk.c.a.b)).longValue();
        com.applovin.impl.sdk.e.y yVar = new com.applovin.impl.sdk.e.y(this, true, new Runnable() { // from class: com.applovin.impl.sdk.k.1
            @Override // java.lang.Runnable
            public void run() {
                if (k.this.o.a()) {
                    return;
                }
                k.this.n.b("AppLovinSdk", "Timing out adapters init...");
                k.this.o.d();
                k.this.j();
            }
        });
        r rVar = this.n;
        rVar.b("AppLovinSdk", "Waiting for required adapters to init: " + b + " - timing out in " + longValue + "ms...");
        this.o.a((com.applovin.impl.sdk.e.a) yVar, o.a.MEDIATION_TIMEOUT, longValue, true);
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.T;
        return (list == null || list.size() <= 0 || this.T.contains(maxAdFormat)) ? false : true;
    }

    public com.applovin.impl.sdk.d.c aa() {
        return this.y;
    }

    public v ab() {
        return this.z;
    }

    public q ac() {
        return this.B;
    }

    public a ad() {
        return this.A;
    }

    public u ae() {
        return this.C;
    }

    public g af() {
        return this.E;
    }

    public com.applovin.impl.sdk.utils.l ag() {
        return this.F;
    }

    public f ah() {
        return this.G;
    }

    public AppLovinBroadcastManager ai() {
        return AppLovinBroadcastManager.getInstance(a);
    }

    public n aj() {
        return this.H;
    }

    public l ak() {
        return this.I;
    }

    public Activity al() {
        Activity L = L();
        if (L != null) {
            return L;
        }
        Activity a2 = ad().a();
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        return (T) this.s.b(dVar, t);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) this.s.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.b.b(bVar);
    }

    public void b() {
        synchronized (this.U) {
            this.W = true;
            Q().c();
            int i = this.ab + 1;
            this.ab = i;
            Q().a(new com.applovin.impl.sdk.e.h(i, this, new h.a() { // from class: com.applovin.impl.sdk.k.2
                @Override // com.applovin.impl.sdk.e.h.a
                public void a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    com.applovin.impl.sdk.utils.g.d(jSONObject, k.this);
                    com.applovin.impl.sdk.utils.g.c(jSONObject, k.this);
                    com.applovin.impl.sdk.utils.g.e(jSONObject, k.this);
                    com.applovin.impl.sdk.utils.g.a(jSONObject, z, k.this);
                    com.applovin.impl.mediation.c.b.a(jSONObject, k.this);
                    com.applovin.impl.mediation.c.b.b(jSONObject, k.this);
                    k.this.E().a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue());
                    k kVar = k.this;
                    kVar.T = kVar.b(jSONObject);
                    com.applovin.impl.sdk.utils.g.h(jSONObject, k.this);
                    com.applovin.impl.sdk.utils.g.f(jSONObject, k.this);
                    k.this.H().a(jSONObject);
                    k.this.a(jSONObject);
                    k.this.Q().a(new com.applovin.impl.sdk.e.n(k.this));
                    com.applovin.impl.sdk.utils.g.g(jSONObject, k.this);
                }
            }), o.a.MAIN);
        }
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.s.a(dVar);
    }

    public void b(String str) {
        r rVar = this.n;
        rVar.b("AppLovinSdk", "Setting user id: " + str);
        this.u.a(str);
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.b.c(bVar);
    }

    public void c(String str) {
        this.h = str;
        b(com.applovin.impl.sdk.c.d.z);
    }

    public boolean c() {
        boolean z;
        synchronized (this.U) {
            z = this.W;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.U) {
            z = this.X;
        }
        return z;
    }

    public boolean e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(x());
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(s(), "max");
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public void h() {
        String str = (String) this.s.b(com.applovin.impl.sdk.c.d.c, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
                r.i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void i() {
        this.E.a();
    }

    public void j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.ac;
        if (sdkInitializationListener != null) {
            if (d()) {
                this.ac = null;
                this.ad = null;
            } else if (this.ad == sdkInitializationListener) {
                return;
            } else {
                if (((Boolean) a(com.applovin.impl.sdk.c.b.ai)).booleanValue()) {
                    this.ac = null;
                } else {
                    this.ad = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.k.3
                @Override // java.lang.Runnable
                public void run() {
                    k.this.n.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    sdkInitializationListener.onSdkInitialized(k.this.ae);
                }
            }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.aj)).longValue()));
        }
    }

    public void k() {
        r.i("AppLovinSdk", "Resetting SDK state...");
        long b = this.q.b(com.applovin.impl.sdk.d.f.g);
        this.b.c();
        this.b.a();
        this.q.a();
        this.y.b();
        this.q.b(com.applovin.impl.sdk.d.f.g, b + 1);
        if (this.V.compareAndSet(true, false)) {
            b();
        } else {
            this.V.set(true);
        }
    }

    public void l() {
        this.P.c();
    }

    public String m() {
        return this.u.a();
    }

    public String n() {
        return this.u.b();
    }

    public String o() {
        return this.u.c();
    }

    public AppLovinSdkSettings p() {
        return this.f;
    }

    public AppLovinUserSegment q() {
        return this.g;
    }

    public AppLovinSdkConfiguration r() {
        return this.ae;
    }

    public String s() {
        String str = (String) a(com.applovin.impl.sdk.c.d.z);
        return StringUtils.isValidString(str) ? str : this.h;
    }

    public AppLovinAdServiceImpl t() {
        return this.i;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.c + "', enabled=" + this.X + ", isFirstSession=" + this.Z + '}';
    }

    public AppLovinEventService u() {
        return this.j;
    }

    public AppLovinUserService v() {
        return this.k;
    }

    public VariableServiceImpl w() {
        return this.l;
    }

    public String x() {
        return this.c;
    }

    public boolean y() {
        return this.Y;
    }

    public r z() {
        return this.n;
    }
}
