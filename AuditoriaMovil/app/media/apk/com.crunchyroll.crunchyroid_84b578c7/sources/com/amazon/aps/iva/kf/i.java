package com.amazon.aps.iva.kf;

import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ConnectedPlatforms;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyAppAuthUrls;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyOauthService;
/* compiled from: ConnectedAppsInteractor.kt */
/* loaded from: classes.dex */
public final class i implements h {
    public final ThirdPartyOauthService b;

    public i(ThirdPartyOauthService thirdPartyOauthService) {
        this.b = thirdPartyOauthService;
    }

    @Override // com.amazon.aps.iva.kf.h
    public final Object N0(ThirdPartyApp thirdPartyApp, com.amazon.aps.iva.ob0.d<? super ThirdPartyAppAuthUrls> dVar) {
        return ThirdPartyOauthService.DefaultImpls.getAuthenticationUrls$default(this.b, thirdPartyApp.getPlatform(), null, dVar, 2, null);
    }

    @Override // com.amazon.aps.iva.kf.h
    public final Object N1(ThirdPartyApp thirdPartyApp, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object disconnectPlatform = this.b.disconnectPlatform(thirdPartyApp.getPlatform(), dVar);
        if (disconnectPlatform == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return disconnectPlatform;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.kf.h
    public final Object getConnectedPlatforms(com.amazon.aps.iva.ob0.d<? super ConnectedPlatforms> dVar) {
        return this.b.getConnectedPlatforms(dVar);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }
}
