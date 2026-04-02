package com.ellation.crunchyroll.api.notifications;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import kotlin.Metadata;
/* compiled from: NotificationSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/notifications/NotificationSettingsInteractor;", "", "", "optInMarketingNotifications", "Lcom/amazon/aps/iva/kb0/q;", "(ZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getDefaultMarketingOptInState", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface NotificationSettingsInteractor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: NotificationSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/notifications/NotificationSettingsInteractor$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/api/notifications/NotificationSettingsInteractor;", "accountService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "etpIndexProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final NotificationSettingsInteractor create(EtpAccountService etpAccountService, EtpIndexProvider etpIndexProvider) {
            j.f(etpAccountService, "accountService");
            j.f(etpIndexProvider, "etpIndexProvider");
            return new NotificationSettingsInteractorImpl(etpAccountService, etpIndexProvider);
        }
    }

    Object getDefaultMarketingOptInState(d<? super Boolean> dVar);

    Object optInMarketingNotifications(boolean z, d<? super q> dVar);
}
