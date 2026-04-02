package com.applovin.impl.sdk.ad;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f extends AppLovinAdImpl {
    private AppLovinAd a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3886b;

    public f(d dVar, m mVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, mVar);
        this.f3886b = dVar;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.Z().c(this.f3886b);
    }

    private String d() {
        d adZone = getAdZone();
        if (adZone == null || adZone.e()) {
            return null;
        }
        return adZone.a();
    }

    public AppLovinAd a() {
        return this.a;
    }

    public void a(AppLovinAd appLovinAd) {
        this.a = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.a;
        return appLovinAd != null ? appLovinAd : c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        AppLovinAd b2 = b();
        return b2 != null ? b2.equals(obj) : super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.a.a
    public com.applovin.impl.sdk.a.b getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd b2 = b();
        if (b2 != null) {
            return b2.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f3886b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b2 = b();
        if (b2 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b2).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd b2 = b();
        if (b2 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b2).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f3886b.e()) {
            return null;
        }
        return this.f3886b.a();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd b2 = b();
        return b2 != null ? b2.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd b2 = b();
        return b2 != null && b2.isVideoAd();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinAd{ #");
        y.append(getAdIdNumber());
        y.append(", adType=");
        y.append(getType());
        y.append(", adSize=");
        y.append(getSize());
        y.append(", zoneId='");
        y.append(d());
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
