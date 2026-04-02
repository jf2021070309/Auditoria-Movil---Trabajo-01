package com.ellation.crunchyroll.api.notifications;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.MarketingNotificationSettingsBody;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import java.io.IOException;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationSettingsInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/notifications/NotificationSettingsInteractorImpl;", "Lcom/ellation/crunchyroll/api/notifications/NotificationSettingsInteractor;", "", "optInMarketingNotifications", "Lcom/amazon/aps/iva/kb0/q;", "(ZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getDefaultMarketingOptInState", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "etpIndexProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NotificationSettingsInteractorImpl implements NotificationSettingsInteractor {
    private final EtpAccountService accountService;
    private final EtpIndexProvider etpIndexProvider;

    public NotificationSettingsInteractorImpl(EtpAccountService etpAccountService, EtpIndexProvider etpIndexProvider) {
        j.f(etpAccountService, "accountService");
        j.f(etpIndexProvider, "etpIndexProvider");
        this.accountService = etpAccountService;
        this.etpIndexProvider = etpIndexProvider;
    }

    @Override // com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor
    public Object getDefaultMarketingOptInState(d<? super Boolean> dVar) {
        boolean z = false;
        try {
            z = EtpIndexProvider.DefaultImpls.getEtpIndex$default(this.etpIndexProvider, false, 1, null).isMarketingOptInEnabled();
        } catch (IOException unused) {
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor
    public Object optInMarketingNotifications(boolean z, d<? super q> dVar) {
        Object updateMarketingNotificationSettings = this.accountService.updateMarketingNotificationSettings(new MarketingNotificationSettingsBody(!z, !z, !z), dVar);
        if (updateMarketingNotificationSettings == a.COROUTINE_SUSPENDED) {
            return updateMarketingNotificationSettings;
        }
        return q.a;
    }
}
