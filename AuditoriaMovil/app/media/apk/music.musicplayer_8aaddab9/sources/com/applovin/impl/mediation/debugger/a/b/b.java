package com.applovin.impl.mediation.debugger.a.b;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3492b;

    /* renamed from: c  reason: collision with root package name */
    private int f3493c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3494d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3495e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3496f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3497g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3498h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f3499i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3500j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f3501k;

    /* renamed from: l  reason: collision with root package name */
    private final String f3502l;

    /* renamed from: m  reason: collision with root package name */
    private final String f3503m;

    /* renamed from: n  reason: collision with root package name */
    private final String f3504n;
    private String o;
    private final String p;
    private final String q;
    private final String r;
    private final int s;
    private final List<MaxAdFormat> t;
    private final List<d> u;
    private final List<com.applovin.impl.mediation.debugger.a.b.a> v;
    private final List<String> w;
    private final c x;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3509e;

        a(String str) {
            this.f3509e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f3509e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0077b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f  reason: collision with root package name */
        private final String f3515f;

        /* renamed from: g  reason: collision with root package name */
        private final int f3516g;

        /* renamed from: h  reason: collision with root package name */
        private final String f3517h;

        EnumC0077b(String str, int i2, String str2) {
            this.f3515f = str;
            this.f3516g = i2;
            this.f3517h = str2;
        }

        public String a() {
            return this.f3515f;
        }

        public int b() {
            return this.f3516g;
        }

        public String c() {
            return this.f3517h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(org.json.JSONObject r19, com.applovin.impl.sdk.m r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.a.b.b.<init>(org.json.JSONObject, com.applovin.impl.sdk.m):void");
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<d> a(JSONObject jSONObject, m mVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f3504n.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            d dVar = new d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", mVar.L());
            if (dVar.c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), mVar.L()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.a.b.a> a(JSONObject jSONObject, String str, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.a.b.a(jSONObject2, mVar));
            }
        }
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.mediation.debugger.a.b.a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.mediation.debugger.a.b.a(jSONObject3, mVar));
            }
        }
        return arrayList;
    }

    private a x() {
        if (this.f3494d || this.f3495e) {
            for (d dVar : this.u) {
                if (!dVar.c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            for (com.applovin.impl.mediation.debugger.a.b.a aVar : this.v) {
                if (!aVar.c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            if (!this.x.a() || this.x.b()) {
                if (this.f3494d) {
                    if (this.f3495e) {
                        return a.COMPLETE;
                    }
                    if (this.f3497g) {
                        return a.MISSING;
                    }
                }
                return a.INCOMPLETE_INTEGRATION;
            }
            return a.INVALID_INTEGRATION;
        }
        return a.MISSING;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(b bVar) {
        return this.f3503m.compareToIgnoreCase(bVar.f3503m);
    }

    public a a() {
        return this.f3492b;
    }

    public int b() {
        return this.f3493c;
    }

    public EnumC0077b c() {
        return !this.f3498h ? EnumC0077b.NOT_SUPPORTED : this.f3492b == a.INVALID_INTEGRATION ? EnumC0077b.INVALID_INTEGRATION : !this.a.J().a() ? EnumC0077b.DISABLED : (this.f3499i && (this.f3493c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f3493c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? EnumC0077b.NOT_INITIALIZED : EnumC0077b.READY;
    }

    public boolean d() {
        return this.f3494d;
    }

    public boolean e() {
        return this.f3495e;
    }

    public boolean f() {
        return this.f3496f;
    }

    public boolean g() {
        return this.f3492b == a.MISSING && this.f3500j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.f3502l;
    }

    public String i() {
        return this.f3503m;
    }

    public String j() {
        return this.o;
    }

    public String k() {
        return this.p;
    }

    public String l() {
        return this.q;
    }

    public String m() {
        return this.f3504n;
    }

    public List<String> n() {
        return this.w;
    }

    public int o() {
        return this.s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f3504n.equals(string)) {
            this.f3493c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b2 = com.applovin.impl.mediation.c.c.b(string, this.a);
            if (b2 == null || this.o.equals(b2.getSdkVersion())) {
                return;
            }
            this.o = b2.getSdkVersion();
            this.a.ag().a(this.o, string);
        }
    }

    public List<MaxAdFormat> p() {
        return this.t;
    }

    public boolean q() {
        return this.f3501k;
    }

    public List<d> r() {
        return this.u;
    }

    public List<com.applovin.impl.mediation.debugger.a.b.a> s() {
        return this.v;
    }

    public final c t() {
        return this.x;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediatedNetwork{name=");
        y.append(this.f3502l);
        y.append(", displayName=");
        y.append(this.f3503m);
        y.append(", sdkAvailable=");
        y.append(this.f3494d);
        y.append(", sdkVersion=");
        y.append(this.o);
        y.append(", adapterAvailable=");
        y.append(this.f3495e);
        y.append(", adapterVersion=");
        return e.a.d.a.a.r(y, this.p, "}");
    }

    public String u() {
        return this.r;
    }

    public final m v() {
        return this.a;
    }

    public final String w() {
        StringBuilder y = e.a.d.a.a.y("\n---------- ");
        e.a.d.a.a.L(y, this.f3502l, " ----------", "\nStatus  - ");
        y.append(this.f3492b.a());
        y.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        y.append((!this.f3494d || TextUtils.isEmpty(this.o)) ? "UNAVAILABLE" : this.o);
        y.append("\nAdapter - ");
        if (this.f3495e && !TextUtils.isEmpty(this.p)) {
            str = this.p;
        }
        y.append(str);
        if (this.x.a() && !this.x.b()) {
            y.append("\n* ");
            y.append(this.x.c());
        }
        for (d dVar : r()) {
            if (!dVar.c()) {
                y.append("\n* MISSING ");
                y.append(dVar.a());
                y.append(": ");
                y.append(dVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.a.b.a aVar : s()) {
            if (!aVar.c()) {
                y.append("\n* MISSING ");
                y.append(aVar.a());
                y.append(": ");
                y.append(aVar.b());
            }
        }
        return y.toString();
    }
}
