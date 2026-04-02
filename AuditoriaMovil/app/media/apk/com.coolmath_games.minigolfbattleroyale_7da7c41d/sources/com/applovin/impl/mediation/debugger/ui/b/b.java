package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b extends d implements AppLovinCommunicatorSubscriber {
    private k a;
    private List<com.applovin.impl.mediation.debugger.a.a.a> b;
    private String d;
    private String e;
    private String f;
    private final StringBuilder g;
    private final AtomicBoolean h;
    private boolean i;
    private List<com.applovin.impl.mediation.debugger.a.b.b> j;
    private List<com.applovin.impl.mediation.debugger.a.b.b> k;
    private List<com.applovin.impl.mediation.debugger.a.b.b> l;
    private List<com.applovin.impl.mediation.debugger.a.b.b> m;
    private List<c> n;
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
    public enum EnumC0021b {
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
        this.g = new StringBuilder("");
        this.h = new AtomicBoolean();
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
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
            a2.c(e.a(R.color.applovin_sdk_xmarkColor, this.c));
        }
        return a2.a();
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(e.a(R.color.applovin_sdk_xmarkColor, this.c)).a(true);
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.a.a(com.applovin.impl.sdk.c.b.ak)).intValue()) {
            r.f("MediationDebuggerListAdapter", sb2);
            this.g.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.a.b.b> list) {
        List<com.applovin.impl.mediation.debugger.a.b.b> list2;
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : list) {
            if (bVar.a() == b.a.INCOMPLETE_INTEGRATION || bVar.a() == b.a.INVALID_INTEGRATION) {
                list2 = this.j;
            } else if (bVar.a() == b.a.COMPLETE) {
                this.k.add(bVar);
                list2 = this.m;
            } else if (bVar.a() == b.a.MISSING) {
                list2 = this.l;
            }
            list2.add(bVar);
        }
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.a.b.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this.c));
        }
        return arrayList;
    }

    private void j() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.c));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.a.H().a() ? "enabled" : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.a.T().g().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.a.a(com.applovin.impl.sdk.c.b.dz);
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
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(h.a(this.c));
        sb.append("\n========== NETWORKS ==========");
        for (com.applovin.impl.mediation.debugger.a.b.b bVar : this.k) {
            a(sb, bVar.t());
        }
        for (com.applovin.impl.mediation.debugger.a.b.b bVar2 : this.j) {
            a(sb, bVar2.t());
        }
        sb.append("\n========== AD UNITS ==========");
        for (com.applovin.impl.mediation.debugger.a.a.a aVar : this.b) {
            a(sb, aVar.f());
        }
        sb.append("\n========== END ==========");
        r.f("MediationDebuggerListAdapter", sb.toString());
        this.g.append(sb.toString());
    }

    private List<c> k() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.c.getPackageName()).a());
        c.a a2 = c.p().a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(a2.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        arrayList.add(c.p().a("Account").b(StringUtils.isValidString(this.f) ? this.f : "None").a());
        arrayList.add(c.p().a("Mediation Provider").b(StringUtils.isValidString(this.a.s()) ? this.a.s() : "None").a());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
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
            com.applovin.impl.sdk.k r1 = r6.a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.c.b.dz
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
            if (r3 == 0) goto L96
            java.lang.String r3 = com.applovin.impl.sdk.utils.Utils.getSafedkSdkKey()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L92
            com.applovin.impl.sdk.k r5 = r6.a
            java.lang.String r5 = r5.x()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            goto L92
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.k r3 = r6.a
            boolean r3 = r3.g()
            if (r3 == 0) goto L83
            java.lang.String r3 = "SDK key is downloaded"
            goto L85
        L83:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L85:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L98
        L92:
            r1.b(r2)
            goto L9b
        L96:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L98:
            r6.a(r1, r2)
        L9b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.k r1 = r6.a
            boolean r1 = r1.g()
            if (r1 == 0) goto Lce
            com.applovin.impl.sdk.k r1 = r6.a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto Lce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto Lc5
            r4 = r1
        Lc5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.a(r1, r4)
            r0.add(r1)
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.ui.b.b.l():java.util.List");
    }

    private List<c> m() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(h.a(), true, this.c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(h.b(), false, this.c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(h.c(), true, this.c));
        return arrayList;
    }

    private List<c> n() {
        ArrayList arrayList = new ArrayList(2);
        c.a p = c.p();
        arrayList.add(p.a("View Ad Units (" + this.b.size() + ")").a(this.c).a(true).a());
        arrayList.add(o());
        return arrayList;
    }

    private c o() {
        c.a p = c.p();
        if (!this.a.H().a()) {
            p.a(this.c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.H().c() != null ? "" : "Select ");
        sb.append("Live Network");
        return p.a(sb.toString()).b(this.a.H().a() ? "Enable" : null).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        return (i == EnumC0021b.APP_INFO.ordinal() ? this.n : i == EnumC0021b.MAX.ordinal() ? this.o : i == EnumC0021b.PRIVACY.ordinal() ? this.p : i == EnumC0021b.ADS.ordinal() ? this.q : i == EnumC0021b.INCOMPLETE_NETWORKS.ordinal() ? this.r : i == EnumC0021b.COMPLETED_NETWORKS.ordinal() ? this.s : this.t).size();
    }

    public void a(List<com.applovin.impl.mediation.debugger.a.b.b> list, List<com.applovin.impl.mediation.debugger.a.a.a> list2, String str, String str2, String str3, k kVar) {
        this.a = kVar;
        this.b = list2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        if (list != null && this.h.compareAndSet(false, true)) {
            kVar.z().b("MediationDebuggerListAdapter", "Populating networks...");
            a(list);
            this.n.addAll(k());
            this.o.addAll(l());
            this.p.addAll(m());
            this.q.addAll(n());
            this.r = b(this.j);
            this.s = b(this.k);
            this.t = b(this.l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.c).subscribe(this, arrayList);
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
        this.i = z;
    }

    public boolean a() {
        return this.h.get();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return EnumC0021b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i) {
        return i == EnumC0021b.APP_INFO.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("APP INFO") : i == EnumC0021b.MAX.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("MAX") : i == EnumC0021b.PRIVACY.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("PRIVACY") : i == EnumC0021b.ADS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("ADS") : i == EnumC0021b.INCOMPLETE_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INCOMPLETE INTEGRATIONS") : i == EnumC0021b.COMPLETED_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("COMPLETED INTEGRATIONS") : new com.applovin.impl.mediation.debugger.ui.d.e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i) {
        return i == EnumC0021b.APP_INFO.ordinal() ? this.n : i == EnumC0021b.MAX.ordinal() ? this.o : i == EnumC0021b.PRIVACY.ordinal() ? this.p : i == EnumC0021b.ADS.ordinal() ? this.q : i == EnumC0021b.INCOMPLETE_NETWORKS.ordinal() ? this.r : i == EnumC0021b.COMPLETED_NETWORKS.ordinal() ? this.s : this.t;
    }

    public boolean c() {
        return this.i;
    }

    public k d() {
        return this.a;
    }

    public List<com.applovin.impl.mediation.debugger.a.a.a> e() {
        return this.b;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public List<com.applovin.impl.mediation.debugger.a.b.b> h() {
        return this.m;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.p = m();
        } else if (!"network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        } else {
            this.r = b(this.j);
            this.s = b(this.k);
        }
        i();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.h.get() + "}";
    }
}
