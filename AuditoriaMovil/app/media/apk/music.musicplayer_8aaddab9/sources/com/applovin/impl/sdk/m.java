package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
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
public class m {
    public static Context a;

    /* renamed from: c  reason: collision with root package name */
    private static a f4135c;
    private com.applovin.impl.sdk.d.c A;
    private z B;
    private s C;
    private y D;
    private com.applovin.impl.sdk.network.d E;
    private i F;
    private com.applovin.impl.sdk.utils.m G;
    private h H;
    private p I;
    private n J;
    private com.applovin.impl.sdk.a.f K;
    private u L;
    private PostbackServiceImpl M;
    private com.applovin.impl.sdk.network.f N;
    private com.applovin.impl.mediation.f O;
    private com.applovin.impl.mediation.e P;
    private MediationServiceImpl Q;
    private com.applovin.impl.mediation.h R;
    private com.applovin.impl.mediation.debugger.a S;
    private w T;
    private com.applovin.impl.mediation.d U;
    private com.applovin.impl.mediation.debugger.ui.testmode.b V;
    private List<MaxAdFormat> W;
    private final Object X = new Object();
    private final AtomicBoolean Y = new AtomicBoolean(true);
    private boolean Z = false;
    private boolean aa = false;
    private boolean ab = false;
    private boolean ac = false;
    private boolean ad = false;
    private int ae = 0;
    private AppLovinSdk.SdkInitializationListener af;
    private AppLovinSdk.SdkInitializationListener ag;
    private AppLovinSdkConfiguration ah;

    /* renamed from: b  reason: collision with root package name */
    public com.applovin.impl.sdk.c.c f4136b;

    /* renamed from: d  reason: collision with root package name */
    private String f4137d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Activity> f4138e;

    /* renamed from: f  reason: collision with root package name */
    private long f4139f;

    /* renamed from: g  reason: collision with root package name */
    private AppLovinSdkSettings f4140g;

    /* renamed from: h  reason: collision with root package name */
    private AppLovinUserSegment f4141h;

    /* renamed from: i  reason: collision with root package name */
    private AppLovinTargetingData f4142i;

    /* renamed from: j  reason: collision with root package name */
    private String f4143j;

    /* renamed from: k  reason: collision with root package name */
    private AppLovinAdServiceImpl f4144k;

    /* renamed from: l  reason: collision with root package name */
    private AppLovinNativeAdService f4145l;

    /* renamed from: m  reason: collision with root package name */
    private EventServiceImpl f4146m;

    /* renamed from: n  reason: collision with root package name */
    private UserServiceImpl f4147n;
    private VariableServiceImpl o;
    private AppLovinSdk p;
    private v q;
    private com.applovin.impl.sdk.e.o r;
    private com.applovin.impl.sdk.network.b s;
    private com.applovin.impl.sdk.d.g t;
    private o u;
    private com.applovin.impl.sdk.c.e v;
    private l w;
    private com.applovin.impl.sdk.utils.o x;
    private c y;
    private r z;

    public static Context M() {
        return a;
    }

    public static a a(Context context) {
        if (f4135c == null) {
            f4135c = new a(context);
        }
        return f4135c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        for (String str : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            v.i("AppLovinSdk", str);
        }
    }

    private void ap() {
        this.E.a(new d.a() { // from class: com.applovin.impl.sdk.m.5
            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                m.this.q.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                synchronized (m.this.X) {
                    if (!m.this.Z) {
                        m.this.b();
                    }
                }
                m.this.E.b(this);
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

    public boolean A() {
        return this.ab;
    }

    public v B() {
        return this.q;
    }

    public com.applovin.impl.mediation.f C() {
        return this.O;
    }

    public com.applovin.impl.mediation.e D() {
        return this.P;
    }

    public MediationServiceImpl E() {
        return this.Q;
    }

    public w F() {
        return this.T;
    }

    public com.applovin.impl.mediation.debugger.a G() {
        return this.S;
    }

    public com.applovin.impl.mediation.h H() {
        return this.R;
    }

    public com.applovin.impl.mediation.d I() {
        return this.U;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.b J() {
        return this.V;
    }

    public com.applovin.impl.sdk.c.c K() {
        return this.f4136b;
    }

    public Context L() {
        return a;
    }

    public Activity N() {
        WeakReference<Activity> weakReference = this.f4138e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public long O() {
        return this.f4139f;
    }

    public boolean P() {
        return this.ac;
    }

    public boolean Q() {
        return this.ad;
    }

    public com.applovin.impl.sdk.network.b R() {
        return this.s;
    }

    public com.applovin.impl.sdk.e.o S() {
        return this.r;
    }

    public com.applovin.impl.sdk.d.g T() {
        return this.t;
    }

    public com.applovin.impl.sdk.network.f U() {
        return this.N;
    }

    public o V() {
        return this.u;
    }

    public l W() {
        return this.w;
    }

    public PostbackServiceImpl X() {
        return this.M;
    }

    public AppLovinSdk Y() {
        return this.p;
    }

    public c Z() {
        return this.y;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) this.f4136b.a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) null);
    }

    public <T> T a(String str, T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t, cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.X) {
            if (!this.Z && !this.aa) {
                b();
            }
        }
    }

    public void a(long j2) {
        this.w.a(j2);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.v.a(sharedPreferences);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (this.r.a()) {
            return;
        }
        List<String> b2 = b(com.applovin.impl.sdk.c.a.a);
        if (b2.size() <= 0 || !this.P.c().containsAll(b2)) {
            return;
        }
        this.q.b("AppLovinSdk", "All required adapters initialized");
        this.r.e();
        j();
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        this.v.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.v.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t, sharedPreferences);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.af = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.m.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(m.this.ah);
                }
            });
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.p = appLovinSdk;
    }

    public void a(String str) {
        v.f("AppLovinSdk", "Setting plugin version: " + str);
        this.f4136b.a(com.applovin.impl.sdk.c.b.dA, str);
        this.f4136b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0275, code lost:
        if (com.applovin.sdk.AppLovinSdk.VERSION_CODE > com.applovin.impl.sdk.utils.Utils.toVersionCode(r8)) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8, com.applovin.sdk.AppLovinSdkSettings r9, android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.lang.String, com.applovin.sdk.AppLovinSdkSettings, android.content.Context):void");
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        this.v.a(str, (String) t, editor);
    }

    public void a(boolean z) {
        synchronized (this.X) {
            this.Z = false;
            this.aa = z;
        }
        if (this.f4136b == null || this.r == null) {
            return;
        }
        List<String> b2 = b(com.applovin.impl.sdk.c.a.a);
        if (b2.isEmpty()) {
            this.r.e();
            j();
            return;
        }
        long longValue = ((Long) a(com.applovin.impl.sdk.c.a.f3915b)).longValue();
        com.applovin.impl.sdk.e.z zVar = new com.applovin.impl.sdk.e.z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.m.2
            @Override // java.lang.Runnable
            public void run() {
                if (m.this.r.a()) {
                    return;
                }
                m.this.q.b("AppLovinSdk", "Timing out adapters init...");
                m.this.r.e();
                m.this.j();
            }
        });
        v vVar = this.q;
        vVar.b("AppLovinSdk", "Waiting for required adapters to init: " + b2 + " - timing out in " + longValue + "ms...");
        this.r.a((com.applovin.impl.sdk.e.a) zVar, o.a.MEDIATION_TIMEOUT, longValue, true);
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.W;
        return (list == null || list.size() <= 0 || this.W.contains(maxAdFormat)) ? false : true;
    }

    public r aa() {
        return this.z;
    }

    public com.applovin.impl.sdk.d.c ab() {
        return this.A;
    }

    public z ac() {
        return this.B;
    }

    public s ad() {
        return this.C;
    }

    public a ae() {
        return f4135c;
    }

    public y af() {
        return this.D;
    }

    public i ag() {
        return this.F;
    }

    public com.applovin.impl.sdk.utils.m ah() {
        return this.G;
    }

    public h ai() {
        return this.H;
    }

    public AppLovinBroadcastManager aj() {
        return AppLovinBroadcastManager.getInstance(a);
    }

    public p ak() {
        return this.I;
    }

    public n al() {
        return this.J;
    }

    public com.applovin.impl.sdk.a.f am() {
        return this.K;
    }

    public u an() {
        return this.L;
    }

    public Activity ao() {
        Activity a2 = ae().a();
        if (a2 != null) {
            return a2;
        }
        Activity N = N();
        if (N != null) {
            return N;
        }
        return null;
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        return (T) this.v.b(dVar, t);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) this.v.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f4136b.b(bVar);
    }

    public void b() {
        synchronized (this.X) {
            this.Z = true;
            S().d();
            int i2 = this.ae + 1;
            this.ae = i2;
            S().a(new com.applovin.impl.sdk.e.i(i2, this, new i.a() { // from class: com.applovin.impl.sdk.m.3
                @Override // com.applovin.impl.sdk.e.i.a
                public void a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    com.applovin.impl.sdk.utils.h.d(jSONObject, m.this);
                    com.applovin.impl.sdk.utils.h.c(jSONObject, m.this);
                    e.a(m.this);
                    com.applovin.impl.sdk.utils.h.e(jSONObject, m.this);
                    com.applovin.impl.sdk.utils.h.a(jSONObject, z, m.this);
                    com.applovin.impl.mediation.c.b.a(jSONObject, m.this);
                    com.applovin.impl.mediation.c.b.b(jSONObject, m.this);
                    m.this.G().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue());
                    m mVar = m.this;
                    mVar.W = mVar.b(jSONObject);
                    com.applovin.impl.sdk.utils.h.f(jSONObject, m.this);
                    m.this.J().a(jSONObject);
                    m.this.a(jSONObject);
                    m.this.S().a(new com.applovin.impl.sdk.e.n(m.this));
                }
            }), o.a.MAIN, ((Integer) a(com.applovin.impl.sdk.c.b.dY)).intValue());
        }
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.v.a(dVar);
    }

    public void b(String str) {
        v vVar = this.q;
        vVar.b("AppLovinSdk", "Setting user id: " + str);
        this.x.a(str);
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f4136b.c(bVar);
    }

    public void c(String str) {
        this.f4143j = str;
        b(com.applovin.impl.sdk.c.d.B);
    }

    public boolean c() {
        boolean z;
        synchronized (this.X) {
            z = this.Z;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.X) {
            z = this.aa;
        }
        return z;
    }

    public boolean e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(z());
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(t(), AppLovinMediationProvider.MAX);
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public void h() {
        String str = (String) this.v.b(com.applovin.impl.sdk.c.d.f3939c, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
                v.i("AppLovinSdk", e.a.d.a.a.t(e.a.d.a.a.y("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public void i() {
        this.F.a();
    }

    public void j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.af;
        if (sdkInitializationListener != null) {
            if (d()) {
                this.af = null;
                this.ag = null;
            } else if (this.ag == sdkInitializationListener) {
                return;
            } else {
                if (((Boolean) a(com.applovin.impl.sdk.c.b.ap)).booleanValue()) {
                    this.af = null;
                } else {
                    this.ag = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.m.4
                @Override // java.lang.Runnable
                public void run() {
                    m.this.q.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    sdkInitializationListener.onSdkInitialized(m.this.ah);
                }
            }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.aq)).longValue()));
        }
    }

    public void k() {
        v.i("AppLovinSdk", "Resetting SDK state...");
        com.applovin.impl.sdk.d.g gVar = this.t;
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f4000g;
        long b2 = gVar.b(fVar);
        this.f4136b.c();
        this.f4136b.a();
        this.t.a();
        this.A.b();
        this.t.b(fVar, b2 + 1);
        if (this.Y.compareAndSet(true, false)) {
            b();
        } else {
            this.Y.set(true);
        }
    }

    public void l() {
        this.S.c();
    }

    public String m() {
        return this.x.a();
    }

    public String n() {
        return this.x.b();
    }

    public String o() {
        return this.x.c();
    }

    public AppLovinSdkSettings p() {
        return this.f4140g;
    }

    public AppLovinUserSegment q() {
        return this.f4141h;
    }

    public f r() {
        return (f) this.f4142i;
    }

    public AppLovinSdkConfiguration s() {
        return this.ah;
    }

    public String t() {
        String str = (String) a(com.applovin.impl.sdk.c.d.B);
        return StringUtils.isValidString(str) ? str : this.f4143j;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CoreSdk{sdkKey='");
        e.a.d.a.a.J(y, this.f4137d, CoreConstants.SINGLE_QUOTE_CHAR, ", enabled=");
        y.append(this.aa);
        y.append(", isFirstSession=");
        y.append(this.ac);
        y.append('}');
        return y.toString();
    }

    public AppLovinAdServiceImpl u() {
        return this.f4144k;
    }

    public AppLovinNativeAdService v() {
        return this.f4145l;
    }

    public AppLovinEventService w() {
        return this.f4146m;
    }

    public AppLovinUserService x() {
        return this.f4147n;
    }

    public VariableServiceImpl y() {
        return this.o;
    }

    public String z() {
        return this.f4137d;
    }
}
