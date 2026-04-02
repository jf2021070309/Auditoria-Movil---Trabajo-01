package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: CastDeviceInteractor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ2\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;", "", "Lcom/ellation/crunchyroll/api/etp/account/model/UserCodeBody;", "userCodeBody", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", FirebaseAnalytics.Param.SUCCESS, "Lkotlin/Function1;", "", "failure", "authDevice", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastDeviceInteractor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastDeviceInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastDeviceInteractor$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;", "accountService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastDeviceInteractor create(EtpAccountService etpAccountService) {
            j.f(etpAccountService, "accountService");
            return new CastDeviceInteractorImpl(etpAccountService);
        }
    }

    void authDevice(UserCodeBody userCodeBody, com.amazon.aps.iva.xb0.a<q> aVar, l<? super Throwable, q> lVar);
}
