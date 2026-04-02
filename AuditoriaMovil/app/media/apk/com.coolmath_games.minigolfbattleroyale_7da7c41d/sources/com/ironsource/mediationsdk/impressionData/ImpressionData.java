package com.ironsource.mediationsdk.impressionData;

import com.facebook.appevents.UserDataStore;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ImpressionData {
    private String A;
    private JSONObject n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private Double x;
    private String y;
    private Double z;
    private final String a = IronSourceConstants.EVENTS_AUCTION_ID;
    private final String b = IronSourceConstants.EVENTS_AD_UNIT;
    private final String c = UserDataStore.COUNTRY;
    private final String d = "ab";
    private final String e = "segmentName";
    private final String f = "placement";
    private final String g = "adNetwork";
    private final String h = "instanceName";
    private final String i = "instanceId";
    private final String j = "revenue";
    private final String k = "precision";
    private final String l = "lifetimeRevenue";
    private final String m = "encryptedCPM";
    private DecimalFormat B = new DecimalFormat("#.#####");

    public ImpressionData(JSONObject jSONObject) {
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        if (jSONObject != null) {
            try {
                this.n = jSONObject;
                this.o = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID, null);
                this.p = jSONObject.optString(IronSourceConstants.EVENTS_AD_UNIT, null);
                this.q = jSONObject.optString(UserDataStore.COUNTRY, null);
                this.r = jSONObject.optString("ab", null);
                this.s = jSONObject.optString("segmentName", null);
                this.t = jSONObject.optString("placement", null);
                this.u = jSONObject.optString("adNetwork", null);
                this.v = jSONObject.optString("instanceName", null);
                this.w = jSONObject.optString("instanceId", null);
                this.y = jSONObject.optString("precision", null);
                this.A = jSONObject.optString("encryptedCPM", null);
                double optDouble = jSONObject.optDouble("lifetimeRevenue");
                this.z = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble("revenue");
                this.x = Double.isNaN(optDouble2) ? null : Double.valueOf(optDouble2);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.r;
    }

    public String getAdNetwork() {
        return this.u;
    }

    public String getAdUnit() {
        return this.p;
    }

    public JSONObject getAllData() {
        return this.n;
    }

    public String getAuctionId() {
        return this.o;
    }

    public String getCountry() {
        return this.q;
    }

    public String getEncryptedCPM() {
        return this.A;
    }

    public String getInstanceId() {
        return this.w;
    }

    public String getInstanceName() {
        return this.v;
    }

    public Double getLifetimeRevenue() {
        return this.z;
    }

    public String getPlacement() {
        return this.t;
    }

    public String getPrecision() {
        return this.y;
    }

    public Double getRevenue() {
        return this.x;
    }

    public String getSegmentName() {
        return this.s;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.t;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.t = replace;
            JSONObject jSONObject = this.n;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImpressionData{auctionId='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", adUnit='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", country='");
        sb.append(this.q);
        sb.append('\'');
        sb.append(", ab='");
        sb.append(this.r);
        sb.append('\'');
        sb.append(", segmentName='");
        sb.append(this.s);
        sb.append('\'');
        sb.append(", placement='");
        sb.append(this.t);
        sb.append('\'');
        sb.append(", adNetwork='");
        sb.append(this.u);
        sb.append('\'');
        sb.append(", instanceName='");
        sb.append(this.v);
        sb.append('\'');
        sb.append(", instanceId='");
        sb.append(this.w);
        sb.append('\'');
        sb.append(", revenue=");
        Double d = this.x;
        sb.append(d == null ? null : this.B.format(d));
        sb.append(", precision='");
        sb.append(this.y);
        sb.append('\'');
        sb.append(", lifetimeRevenue=");
        Double d2 = this.z;
        sb.append(d2 != null ? this.B.format(d2) : null);
        sb.append(", encryptedCPM='");
        sb.append(this.A);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
