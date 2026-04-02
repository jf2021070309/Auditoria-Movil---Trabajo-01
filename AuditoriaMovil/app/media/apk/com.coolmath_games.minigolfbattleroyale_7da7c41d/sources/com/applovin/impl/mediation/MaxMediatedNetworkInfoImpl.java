package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {
    private final JSONObject a;
    private final MaxError b;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject, MaxError maxError) {
        this.a = jSONObject;
        this.b = maxError;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.a, "class", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.a, "version", "");
    }

    public MaxError getLoadError() {
        return this.b;
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
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + ", loadError=" + getLoadError() + '}';
    }
}
