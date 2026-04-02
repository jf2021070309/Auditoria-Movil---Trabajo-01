package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;
/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f3286b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3287c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f3288d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f3289e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f3290f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3291g;

    /* renamed from: h  reason: collision with root package name */
    private String f3292h;

    /* renamed from: i  reason: collision with root package name */
    private String f3293i;

    /* renamed from: j  reason: collision with root package name */
    private long f3294j;

    /* renamed from: k  reason: collision with root package name */
    private MaxAdFormat f3295k;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl a = a((com.applovin.impl.mediation.a.f) aVar);
        a.f3292h = aVar.m();
        a.f3293i = aVar.j();
        a.f3294j = aVar.k();
        return a;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f3288d = fVar.S();
        maxAdapterParametersImpl.f3289e = fVar.T();
        maxAdapterParametersImpl.f3290f = fVar.U();
        maxAdapterParametersImpl.f3286b = fVar.W();
        maxAdapterParametersImpl.f3287c = fVar.X();
        maxAdapterParametersImpl.f3291g = fVar.R();
        return maxAdapterParametersImpl;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(hVar);
        a.f3295k = maxAdFormat;
        return a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f3295k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f3294j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f3293i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f3286b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f3287c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f3292h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f3288d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f3289e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f3290f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f3291g;
    }
}
