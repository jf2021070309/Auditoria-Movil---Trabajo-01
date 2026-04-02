package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {
    private Bundle a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private boolean e;
    private String f;
    private String g;
    private long h;
    private MaxAdFormat i;

    private MaxAdapterParametersImpl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl a = a((com.applovin.impl.mediation.a.e) aVar);
        a.f = aVar.j();
        a.g = aVar.h();
        a.h = aVar.i();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.e eVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.b = eVar.N();
        maxAdapterParametersImpl.c = eVar.O();
        maxAdapterParametersImpl.d = eVar.P();
        maxAdapterParametersImpl.a = eVar.R();
        maxAdapterParametersImpl.e = eVar.M();
        return maxAdapterParametersImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.g gVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(gVar);
        a.i = maxAdFormat;
        return a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.e;
    }
}
