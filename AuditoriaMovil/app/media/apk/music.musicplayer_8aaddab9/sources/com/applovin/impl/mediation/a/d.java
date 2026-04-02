package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3333c;

    private d(d dVar, com.applovin.impl.mediation.g gVar) {
        super(dVar.W(), dVar.N(), dVar.M(), gVar, dVar.f3334b);
        this.f3333c = new AtomicBoolean();
    }

    public d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
        this.f3333c = new AtomicBoolean();
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new d(this, gVar);
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        ((a) this).a.a(maxNativeAdView);
    }

    public MaxNativeAd v() {
        return ((a) this).a.b();
    }

    public MaxNativeAdView w() {
        return ((a) this).a.c();
    }

    public String x() {
        return BundleUtils.getString("template", "", X());
    }

    public boolean y() {
        return ((a) this).a == null;
    }

    public AtomicBoolean z() {
        return this.f3333c;
    }
}
