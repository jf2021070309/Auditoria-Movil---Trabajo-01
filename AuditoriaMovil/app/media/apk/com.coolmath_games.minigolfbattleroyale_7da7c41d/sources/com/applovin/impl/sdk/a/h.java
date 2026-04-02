package com.applovin.impl.sdk.a;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h extends AppLovinAdBase {
    private AppLovinAd a;
    private final d b;

    public h(d dVar, k kVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, kVar);
        this.b = dVar;
    }

    private AppLovinAd c() {
        return this.sdk.X().d(this.b);
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

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b = b();
        return b != null ? b.equals(obj) : super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd b = b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public d getAdZone() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) b();
        return appLovinAdBase != null ? appLovinAdBase.getAdZone() : this.b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b = b();
        if (b instanceof AppLovinAdBase) {
            return ((AppLovinAdBase) b).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().c();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public b getSource() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) b();
        return appLovinAdBase != null ? appLovinAdBase.getSource() : b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().d();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.b.e()) {
            return null;
        }
        return this.b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public int hashCode() {
        AppLovinAd b = b();
        return b != null ? b.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd b = b();
        return b != null && b.isVideoAd();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + d() + "'}";
    }
}
