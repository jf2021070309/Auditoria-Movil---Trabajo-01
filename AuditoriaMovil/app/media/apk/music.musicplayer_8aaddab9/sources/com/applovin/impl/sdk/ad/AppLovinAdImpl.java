package com.applovin.impl.sdk.ad;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {
    private d a;

    /* renamed from: b  reason: collision with root package name */
    private f f3840b;
    public final b source;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, b bVar, m mVar) {
        super(jSONObject, jSONObject2, mVar);
        this.source = bVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd b2;
        if ((obj instanceof f) && (b2 = ((f) obj).b()) != null) {
            obj = b2;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) obj;
        d dVar = this.a;
        if (dVar == null ? appLovinAdImpl.a == null : dVar.equals(appLovinAdImpl.a)) {
            return this.source == appLovinAdImpl.source && this.responseHash == appLovinAdImpl.responseHash;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    public d getAdZone() {
        d dVar = this.a;
        if (dVar != null) {
            if (dVar.c() != null && this.a.d() != null) {
                return this.a;
            }
            if (getSize() == null && getType() == null) {
                return this.a;
            }
        }
        d a = d.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null));
        this.a = a;
        return a;
    }

    public f getDummyAd() {
        return this.f3840b;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    public b getSource() {
        return this.source;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().e()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.B().e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return this.responseHash;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(f fVar) {
        this.f3840b = fVar;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinAd{adIdNumber=");
        y.append(getAdIdNumber());
        y.append(", source=");
        y.append(getSource());
        y.append(", zoneId=\"");
        y.append(getZoneId());
        y.append("\"");
        y.append('}');
        return y.toString();
    }
}
