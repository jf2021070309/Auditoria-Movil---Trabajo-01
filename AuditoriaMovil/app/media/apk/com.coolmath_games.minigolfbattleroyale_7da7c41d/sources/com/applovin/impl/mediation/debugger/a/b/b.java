package com.applovin.impl.mediation.debugger.a.b;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
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
    private final k a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final String j;
    private final String k;
    private final String l;
    private String m;
    private final String n;
    private final String o;
    private final int p;
    private final List<MaxAdFormat> q;
    private final List<d> r;
    private final List<com.applovin.impl.mediation.debugger.a.b.a> s;
    private final List<String> t;
    private final c u;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        
        private final String e;

        a(String str) {
            this.e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0016b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        
        private final String f;
        private final int g;
        private final String h;

        EnumC0016b(String str, int i2, String str2) {
            this.f = str;
            this.g = i2;
            this.h = str2;
        }

        public String a() {
            return this.f;
        }

        public int b() {
            return this.g;
        }

        public String c() {
            return this.h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(org.json.JSONObject r12, com.applovin.impl.sdk.k r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.a.b.b.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
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
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<d> a(JSONObject jSONObject, k kVar) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), kVar.J()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.a.b.a> b(JSONObject jSONObject, k kVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.a.b.a(jSONObject2, kVar));
            }
        }
        return arrayList;
    }

    private a u() {
        if (this.d || this.e) {
            for (d dVar : this.r) {
                if (!dVar.c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            for (com.applovin.impl.mediation.debugger.a.b.a aVar : this.s) {
                if (!aVar.c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            if (!this.u.a() || this.u.b()) {
                if (this.d) {
                    if (this.e) {
                        return a.COMPLETE;
                    }
                    if (this.g) {
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
        return this.k.compareToIgnoreCase(bVar.k);
    }

    public a a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public EnumC0016b c() {
        return !this.h ? EnumC0016b.NOT_SUPPORTED : this.b == a.INVALID_INTEGRATION ? EnumC0016b.INVALID_INTEGRATION : !this.a.H().a() ? EnumC0016b.DISABLED : (this.i && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? EnumC0016b.NOT_INITIALIZED : EnumC0016b.READY;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String g() {
        return this.j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.m;
    }

    public String j() {
        return this.n;
    }

    public String k() {
        return this.o;
    }

    public String l() {
        return this.l;
    }

    public List<String> m() {
        return this.t;
    }

    public int n() {
        return this.p;
    }

    public List<MaxAdFormat> o() {
        return this.q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.l.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = com.applovin.impl.mediation.c.c.a(string, this.a);
            if (a2 == null || this.m.equals(a2.getSdkVersion())) {
                return;
            }
            this.m = a2.getSdkVersion();
            this.a.af().a(this.m, string);
        }
    }

    public List<d> p() {
        return this.r;
    }

    public List<com.applovin.impl.mediation.debugger.a.b.a> q() {
        return this.s;
    }

    public final c r() {
        return this.u;
    }

    public final k s() {
        return this.a;
    }

    public final String t() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.j);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.b.a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.d || TextUtils.isEmpty(this.m)) ? "UNAVAILABLE" : this.m);
        sb.append("\nAdapter - ");
        if (this.e && !TextUtils.isEmpty(this.n)) {
            str = this.n;
        }
        sb.append(str);
        if (this.u.a() && !this.u.b()) {
            sb.append("\n* ");
            sb.append(this.u.c());
        }
        for (d dVar : p()) {
            if (!dVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(dVar.a());
                sb.append(": ");
                sb.append(dVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.a.b.a aVar : q()) {
            if (!aVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(aVar.a());
                sb.append(": ");
                sb.append(aVar.b());
            }
        }
        return sb.toString();
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.j + ", displayName=" + this.k + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.m + ", adapterAvailable=" + this.e + ", adapterVersion=" + this.n + "}";
    }
}
