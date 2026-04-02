package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastDeviceInteractor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastDeviceInteractorImpl;", "Lcom/amazon/aps/iva/wy/i;", "Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;", "Lcom/ellation/crunchyroll/api/etp/account/model/UserCodeBody;", "userCodeBody", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", FirebaseAnalytics.Param.SUCCESS, "Lkotlin/Function1;", "", "failure", "authDevice", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastDeviceInteractorImpl extends i implements CastDeviceInteractor {
    private final EtpAccountService accountService;

    public CastDeviceInteractorImpl(EtpAccountService etpAccountService) {
        j.f(etpAccountService, "accountService");
        this.accountService = etpAccountService;
    }

    @Override // com.ellation.crunchyroll.cast.CastDeviceInteractor
    public void authDevice(UserCodeBody userCodeBody, com.amazon.aps.iva.xb0.a<q> aVar, l<? super Throwable, q> lVar) {
        j.f(userCodeBody, "userCodeBody");
        j.f(aVar, FirebaseAnalytics.Param.SUCCESS);
        j.f(lVar, "failure");
        com.amazon.aps.iva.se0.i.d(this, null, null, new CastDeviceInteractorImpl$authDevice$1(lVar, this, userCodeBody, aVar, null), 3);
    }
}
