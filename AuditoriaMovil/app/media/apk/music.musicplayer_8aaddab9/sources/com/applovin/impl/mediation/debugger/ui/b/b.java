package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b extends d implements AppLovinCommunicatorSubscriber {
    private m a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.a.a.a> f3569b;

    /* renamed from: d  reason: collision with root package name */
    private String f3570d;

    /* renamed from: e  reason: collision with root package name */
    private String f3571e;

    /* renamed from: f  reason: collision with root package name */
    private String f3572f;

    /* renamed from: g  reason: collision with root package name */
    private final StringBuilder f3573g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f3574h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3575i;

    /* renamed from: j  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.a.b.b> f3576j;

    /* renamed from: k  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.a.b.b> f3577k;

    /* renamed from: l  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.a.b.b> f3578l;

    /* renamed from: m  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.a.b.b> f3579m;

    /* renamed from: n  reason: collision with root package name */
    private List<c> f3580n;
    private List<c> o;
    private List<c> p;
    private List<c> q;
    private List<c> r;
    private List<c> s;
    private List<c> t;

    /* loaded from: classes.dex */
    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0082b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f3573g = new StringBuilder("");
        this.f3574h = new AtomicBoolean();
        this.f3575i = false;
        this.f3576j = new ArrayList();
        this.f3577k = new ArrayList();
        this.f3578l = new ArrayList();
        this.f3579m = new ArrayList();
        this.f3580n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
    }

    private c a(String str, String str2) {
        c.a a2 = c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            a2.b(str2);
        } else {
            a2.a(R.drawable.applovin_ic_x_mark);
            a2.c(f.a(R.color.applovin_sdk_xmarkColor, this.f3645c));
        }
        return a2.a();
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(f.a(R.color.applovin_sdk_xmarkColor, this.f3645c)).a(true);
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (str.length() + sb2.length() >= ((Integer) this.a.a(com.applovin.impl.sdk.c.b.ar)).intValue()) {
            v.f("MediationDebuggerListAdapter", sb2);
            this.f3573g.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.a.b.b> list) {
        List<com.applovin.impl.mediation.debugger.a.b.b> list2;
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : list) {
            if (!bVar.g()) {
                if (bVar.a() == b.a.INCOMPLETE_INTEGRATION || bVar.a() == b.a.INVALID_INTEGRATION) {
                    list2 = this.f3576j;
                } else if (bVar.a() == b.a.COMPLETE) {
                    this.f3577k.add(bVar);
                    list2 = this.f3579m;
                } else if (bVar.a() == b.a.MISSING) {
                    list2 = this.f3578l;
                }
                list2.add(bVar);
            }
        }
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.a.b.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this.f3645c));
        }
        return arrayList;
    }

    private void j() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        StringBuilder y = e.a.d.a.a.y("\nDev Build - ");
        y.append(Utils.isPubInDebugMode(this.f3645c));
        sb.append(y.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.a.J().a() ? "enabled" : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.a.V().h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.a.a(com.applovin.impl.sdk.c.b.dA);
        String safedkVersion = Utils.getSafedkVersion();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(safedkVersion)) {
            safedkVersion = "Disabled";
        }
        sb4.append(safedkVersion);
        sb.append(sb4.toString());
        if (this.a.g() && (metaData = Utils.getMetaData(this.a.p())) != null) {
            String str3 = metaData.get("UnityVersion");
            StringBuilder y2 = e.a.d.a.a.y("\nUnity Version - ");
            y2.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb.append(y2.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(j.a(this.f3645c));
        sb.append("\n========== NETWORKS ==========");
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : this.f3577k) {
            a(sb, bVar.w());
        }
        for (com.applovin.impl.mediation.debugger.a.b.b bVar2 : this.f3576j) {
            a(sb, bVar2.w());
        }
        sb.append("\n========== AD UNITS ==========");
        for (com.applovin.impl.mediation.debugger.a.a.a aVar : this.f3569b) {
            a(sb, aVar.f());
        }
        sb.append("\n========== END ==========");
        v.f("MediationDebuggerListAdapter", sb.toString());
        this.f3573g.append(sb.toString());
    }

    private List<c> k() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f3645c.getPackageManager().getPackageInfo(this.f3645c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.f3645c.getPackageName()).a());
        c.a a2 = c.p().a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(a2.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        arrayList.add(c.p().a("Account").b(StringUtils.isValidString(this.f3572f) ? this.f3572f : "None").a());
        arrayList.add(c.p().a("Mediation Provider").b(StringUtils.isValidString(this.a.t()) ? this.a.t() : "None").a());
        arrayList.add(c.p().a("OM SDK Version").b(this.a.am().c()).a());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.applovin.impl.mediation.debugger.ui.d.c> l() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a(r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.b(r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.c.b.dA
            java.lang.Object r1 = r1.a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.a(r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r4
        L3b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.b(r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a(r2)
            java.lang.String r2 = com.applovin.impl.sdk.utils.Utils.getSafedkVersion()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L90
            java.lang.String r3 = com.applovin.impl.sdk.utils.Utils.getSafedkSdkKey()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L8c
            com.applovin.impl.sdk.m r5 = r6.a
            java.lang.String r5 = r5.z()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            goto L8c
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.m r3 = r6.a
            boolean r3 = r3.g()
            if (r3 == 0) goto L83
            java.lang.String r3 = "SDK key is downloaded"
            goto L85
        L83:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L85:
            java.lang.String r5 = " from the correct account."
            java.lang.String r2 = e.a.d.a.a.r(r2, r3, r5)
            goto L92
        L8c:
            r1.b(r2)
            goto L95
        L90:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L92:
            r6.a(r1, r2)
        L95:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.a
            boolean r1 = r1.g()
            if (r1 == 0) goto Lc8
            com.applovin.impl.sdk.m r1 = r6.a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto Lc8
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto Lbf
            r4 = r1
        Lbf:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.a(r1, r4)
            r0.add(r1)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.ui.b.b.l():java.util.List");
    }

    private List<c> m() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.a(), true, this.f3645c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.b(), false, this.f3645c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.c(), true, this.f3645c));
        return arrayList;
    }

    private List<c> n() {
        ArrayList arrayList = new ArrayList(2);
        c.a p = c.p();
        StringBuilder y = e.a.d.a.a.y("View Ad Units (");
        y.append(this.f3569b.size());
        y.append(")");
        arrayList.add(p.a(y.toString()).a(this.f3645c).a(true).a());
        arrayList.add(o());
        return arrayList;
    }

    private c o() {
        c.a p = c.p();
        if (!this.a.J().a()) {
            p.a(this.f3645c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.J().c() != null ? "" : "Select ");
        sb.append("Live Network");
        return p.a(sb.toString()).b(this.a.J().a() ? "Enable" : null).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i2) {
        return (i2 == EnumC0082b.APP_INFO.ordinal() ? this.f3580n : i2 == EnumC0082b.MAX.ordinal() ? this.o : i2 == EnumC0082b.PRIVACY.ordinal() ? this.p : i2 == EnumC0082b.ADS.ordinal() ? this.q : i2 == EnumC0082b.INCOMPLETE_NETWORKS.ordinal() ? this.r : i2 == EnumC0082b.COMPLETED_NETWORKS.ordinal() ? this.s : this.t).size();
    }

    public void a(List<com.applovin.impl.mediation.debugger.a.b.b> list, List<com.applovin.impl.mediation.debugger.a.a.a> list2, String str, String str2, String str3, m mVar) {
        this.a = mVar;
        this.f3569b = list2;
        this.f3570d = str;
        this.f3571e = str2;
        this.f3572f = str3;
        if (list != null && this.f3574h.compareAndSet(false, true)) {
            mVar.B().b("MediationDebuggerListAdapter", "Populating networks...");
            a(list);
            this.f3580n.addAll(k());
            this.o.addAll(l());
            this.p.addAll(m());
            this.q.addAll(n());
            this.r = b(this.f3576j);
            this.s = b(this.f3577k);
            this.t = b(this.f3578l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.f3645c).subscribe(this, arrayList);
            j();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(boolean z) {
        this.f3575i = z;
    }

    public boolean a() {
        return this.f3574h.get();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int b() {
        return EnumC0082b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public c b(int i2) {
        return i2 == EnumC0082b.APP_INFO.ordinal() ? new e("APP INFO") : i2 == EnumC0082b.MAX.ordinal() ? new e("MAX") : i2 == EnumC0082b.PRIVACY.ordinal() ? new e("PRIVACY") : i2 == EnumC0082b.ADS.ordinal() ? new e("ADS") : i2 == EnumC0082b.INCOMPLETE_NETWORKS.ordinal() ? new e("INCOMPLETE INTEGRATIONS") : i2 == EnumC0082b.COMPLETED_NETWORKS.ordinal() ? new e("COMPLETED INTEGRATIONS") : new e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<c> c(int i2) {
        return i2 == EnumC0082b.APP_INFO.ordinal() ? this.f3580n : i2 == EnumC0082b.MAX.ordinal() ? this.o : i2 == EnumC0082b.PRIVACY.ordinal() ? this.p : i2 == EnumC0082b.ADS.ordinal() ? this.q : i2 == EnumC0082b.INCOMPLETE_NETWORKS.ordinal() ? this.r : i2 == EnumC0082b.COMPLETED_NETWORKS.ordinal() ? this.s : this.t;
    }

    public boolean c() {
        return this.f3575i;
    }

    public m d() {
        return this.a;
    }

    public List<com.applovin.impl.mediation.debugger.a.a.a> e() {
        return this.f3569b;
    }

    public String f() {
        return this.f3570d;
    }

    public String g() {
        return this.f3571e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public List<com.applovin.impl.mediation.debugger.a.b.b> h() {
        return this.f3579m;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.p = m();
        } else if (!"network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        } else {
            this.r = b(this.f3576j);
            this.s = b(this.f3577k);
        }
        i();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediationDebuggerListAdapter{isInitialized=");
        y.append(this.f3574h.get());
        y.append("}");
        return y.toString();
    }
}
