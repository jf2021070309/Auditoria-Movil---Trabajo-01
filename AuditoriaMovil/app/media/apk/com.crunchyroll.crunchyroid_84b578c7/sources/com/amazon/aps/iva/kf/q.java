package com.amazon.aps.iva.kf;

import android.content.ActivityNotFoundException;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyAppAuthUrls;
/* compiled from: ConnectedAppsPresenter.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ThirdPartyAppAuthUrls, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(ThirdPartyAppAuthUrls thirdPartyAppAuthUrls) {
        v view;
        ThirdPartyAppAuthUrls thirdPartyAppAuthUrls2 = thirdPartyAppAuthUrls;
        com.amazon.aps.iva.yb0.j.f(thirdPartyAppAuthUrls2, "authUrl");
        o oVar = this.h;
        view = oVar.getView();
        view.o();
        try {
            oVar.getView().Nc(thirdPartyAppAuthUrls2.getMobileAuthorizeUrl());
        } catch (ActivityNotFoundException unused) {
            oVar.getView().r1(thirdPartyAppAuthUrls2.getAuthorizeUrl());
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
