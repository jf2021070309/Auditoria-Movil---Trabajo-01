package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final com.applovin.impl.mediation.a.a a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3282b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3283c;

    /* renamed from: d  reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f3284d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3285e;

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, long j2, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.n(), aVar.o(), j2, list);
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, String str, String str2, long j2, List<MaxNetworkResponseInfo> list) {
        this.a = aVar;
        this.f3282b = str;
        this.f3283c = str2;
        this.f3284d = list;
        this.f3285e = j2;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f3285e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f3282b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f3284d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f3283c;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MaxAdWaterfallInfo{name=");
        y.append(this.f3282b);
        y.append(", testName=");
        y.append(this.f3283c);
        y.append(", networkResponses=");
        y.append(this.f3284d);
        y.append(", latencyMillis=");
        y.append(this.f3285e);
        y.append('}');
        return y.toString();
    }
}
