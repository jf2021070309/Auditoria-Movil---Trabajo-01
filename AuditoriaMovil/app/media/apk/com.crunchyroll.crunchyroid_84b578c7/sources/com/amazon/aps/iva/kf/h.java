package com.amazon.aps.iva.kf;

import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ConnectedPlatforms;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyAppAuthUrls;
/* compiled from: ConnectedAppsInteractor.kt */
/* loaded from: classes.dex */
public interface h extends com.amazon.aps.iva.wy.j {
    Object N0(ThirdPartyApp thirdPartyApp, com.amazon.aps.iva.ob0.d<? super ThirdPartyAppAuthUrls> dVar);

    Object N1(ThirdPartyApp thirdPartyApp, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object getConnectedPlatforms(com.amazon.aps.iva.ob0.d<? super ConnectedPlatforms> dVar);
}
