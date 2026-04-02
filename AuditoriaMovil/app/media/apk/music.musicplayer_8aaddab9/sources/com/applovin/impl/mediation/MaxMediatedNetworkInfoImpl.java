package com.applovin.impl.mediation;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {
    private final JSONObject a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.a, Action.CLASS_ATTRIBUTE, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.a, "sdk_version", "");
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MaxMediatedNetworkInfo{name=");
        y.append(getName());
        y.append(", adapterClassName=");
        y.append(getAdapterClassName());
        y.append(", adapterVersion=");
        y.append(getAdapterVersion());
        y.append(", sdkVersion=");
        y.append(getSdkVersion());
        y.append('}');
        return y.toString();
    }
}
