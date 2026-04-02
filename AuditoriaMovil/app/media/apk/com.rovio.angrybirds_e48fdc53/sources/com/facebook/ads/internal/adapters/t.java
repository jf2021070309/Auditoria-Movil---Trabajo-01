package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.sdk.InMobiSdk;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class t extends ab implements x {
    private ac a;
    private InMobiNative b;
    private boolean c;
    private View d;
    private String e;
    private String f;
    private String g;
    private com.facebook.ads.internal.n.g h;
    private com.facebook.ads.internal.n.f i;
    private com.facebook.ads.internal.n.f j;

    @Override // com.facebook.ads.internal.adapters.ab
    public String A() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public List<com.facebook.ads.internal.n.e> B() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int C() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int D() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.c E() {
        return com.facebook.ads.internal.n.c.INMOBI;
    }

    @Override // com.facebook.ads.internal.adapters.x
    public g F() {
        return g.INMOBI;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(int i) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(final Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar) {
        com.facebook.ads.internal.q.a.d.a(context, y.a(F()) + " Loading");
        JSONObject jSONObject = (JSONObject) map.get(ShareConstants.WEB_DIALOG_PARAM_DATA);
        String optString = jSONObject.optString("account_id");
        Long valueOf = Long.valueOf(jSONObject.optLong("placement_id"));
        if (TextUtils.isEmpty(optString) || valueOf == null) {
            acVar.a(this, new com.facebook.ads.internal.protocol.a(AdErrorType.MEDIATION_ERROR, "Mediation Error"));
            return;
        }
        this.a = acVar;
        InMobiSdk.init(context, optString);
        this.b = new InMobiNative(valueOf.longValue(), new InMobiNative.NativeAdListener() { // from class: com.facebook.ads.internal.adapters.t.1
            public void onAdDismissed(InMobiNative inMobiNative) {
            }

            public void onAdDisplayed(InMobiNative inMobiNative) {
            }

            public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
                com.facebook.ads.internal.q.a.d.a(context, y.a(t.this.F()) + " Failed with InMobi error: " + inMobiAdRequestStatus.getMessage());
                if (t.this.a != null) {
                    t.this.a.a(t.this, new com.facebook.ads.internal.protocol.a(AdErrorType.MEDIATION_ERROR.getErrorCode(), inMobiAdRequestStatus.getMessage()));
                }
            }

            public void onAdLoadSucceeded(InMobiNative inMobiNative) {
                try {
                    JSONObject jSONObject2 = new JSONObject((String) inMobiNative.getAdContent());
                    t.this.e = jSONObject2.optString("title");
                    t.this.f = jSONObject2.optString("description");
                    t.this.g = jSONObject2.optString("cta");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("icon");
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("width");
                        int optInt2 = optJSONObject.optInt("height");
                        String optString2 = optJSONObject.optString("url");
                        t.this.i = new com.facebook.ads.internal.n.f(optString2, optInt, optInt2);
                    }
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("screenshots");
                    if (optJSONObject2 != null) {
                        int optInt3 = optJSONObject2.optInt("width");
                        int optInt4 = optJSONObject2.optInt("height");
                        String optString3 = optJSONObject2.optString("url");
                        t.this.j = new com.facebook.ads.internal.n.f(optString3, optInt3, optInt4);
                    }
                    try {
                        double parseDouble = Double.parseDouble(jSONObject2.optString("rating"));
                        t.this.h = new com.facebook.ads.internal.n.g(parseDouble, 5.0d);
                    } catch (Exception e) {
                    }
                    t.this.c = true;
                    if (t.this.d != null) {
                        InMobiNative unused = t.this.b;
                        InMobiNative.bind(t.this.d, inMobiNative);
                    }
                    if (t.this.a != null) {
                        com.facebook.ads.internal.q.a.d.a(context, y.a(t.this.F()) + " Loaded");
                        t.this.a.a(t.this);
                    }
                } catch (Exception e2) {
                    if (t.this.a != null) {
                        com.facebook.ads.internal.q.a.d.a(context, y.a(t.this.F()) + " Failed. Internal AN SDK error");
                        t.this.a.a(t.this, com.facebook.ads.internal.protocol.a.a(AdErrorType.INTERNAL_ERROR, "Internal Error"));
                    }
                }
            }

            public void onUserLeftApplication(InMobiNative inMobiNative) {
            }
        });
        this.b.load();
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(View view, List<View> list) {
        this.d = view;
        if (c_()) {
            InMobiNative inMobiNative = this.b;
            InMobiNative.bind(this.d, this.b);
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(ac acVar) {
        this.a = acVar;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Map<String, String> map) {
        this.a.b(this);
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b(Map<String, String> map) {
        if (c_()) {
            this.a.c(this);
            this.b.reportAdClickAndOpenLandingPage((Map) null);
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b_() {
        if (c_()) {
            InMobiNative inMobiNative = this.b;
            InMobiNative.unbind(this.d);
        }
        this.d = null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String c() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean c_() {
        return this.b != null && this.c;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean d() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean e() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean f() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean g() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean h() {
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int i() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int j() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int k() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f l() {
        return this.i;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f m() {
        return this.j;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.h n() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String o() {
        return this.e;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        b_();
        this.b = null;
        this.a = null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String p() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String q() {
        return this.f;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String r() {
        return this.g;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String s() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.g t() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f u() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String v() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String w() {
        return "Ad";
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String x() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String y() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.j z() {
        return com.facebook.ads.internal.n.j.DEFAULT;
    }
}
