package com.amazon.aps.iva.dx;

import com.amazon.aps.iva.kf.e;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyOauthService;
/* compiled from: ConnectedAppsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class a implements e {
    public final ThirdPartyOauthService a = com.ellation.crunchyroll.application.e.c().getThirdPartyOauthService();

    @Override // com.amazon.aps.iva.kf.e
    public final ThirdPartyOauthService getThirdPartyOauthService() {
        return this.a;
    }
}
