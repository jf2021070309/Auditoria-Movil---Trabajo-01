package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ct.d;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.nz.e;
import com.amazon.aps.iva.nz.f;
import com.amazon.aps.iva.uy.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z40.c;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.drm.DrmProxyService;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthInterceptor;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.auth.JwtProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
import com.ellation.crunchyroll.api.etp.externalparteners.ExternalPartnersService;
import com.ellation.crunchyroll.api.etp.funmigration.FunMigrationService;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexService;
import com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.api.etp.playback.SkipEventsService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyOauthService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010pR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/EtpNetworkModule;", "", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "getEtpIndexProvider", "()Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "etpIndexProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "getEtpIndexService", "()Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "etpIndexService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "getAccountService", "()Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "getAccountAuthService", "()Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "accountAuthService", "Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "getAssetsService", "()Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "assetsService", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "getEtpContentService", "()Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "etpContentService", "Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "getTalkboxService", "()Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "talkboxService", "Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "getContentReviewService", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "contentReviewService", "Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "getSubscriptionProcessorService", "()Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "subscriptionProcessorService", "Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "getExternalPartnersService", "()Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "externalPartnersService", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "getThirdPartyOauthService", "()Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "thirdPartyOauthService", "Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "getFunMigrationService", "()Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "funMigrationService", "Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "getPlayService", "()Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "playService", "Lcom/ellation/crunchyroll/api/etp/playback/SkipEventsService;", "getSkipEventsService", "()Lcom/ellation/crunchyroll/api/etp/playback/SkipEventsService;", "skipEventsService", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "getRefreshTokenProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "refreshTokenProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpServiceAvailabilityMonitor;", "getEtpServiceMonitor", "()Lcom/ellation/crunchyroll/api/etp/index/EtpServiceAvailabilityMonitor;", "etpServiceMonitor", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "getRefreshTokenMonitor", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "refreshTokenMonitor", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "getRefreshTokenStorage", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "refreshTokenStorage", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "getPolicyChangeMonitor", "()Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "policyChangeMonitor", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "getJwtInvalidator", "()Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "jwtInvalidator", "Lcom/amazon/aps/iva/z40/c;", "getInactiveClientMonitor", "()Lcom/amazon/aps/iva/z40/c;", "inactiveClientMonitor", "Lcom/amazon/aps/iva/nz/e;", "getPlayheadsSynchronizer", "()Lcom/amazon/aps/iva/nz/e;", "playheadsSynchronizer", "Lcom/amazon/aps/iva/nz/f;", "getPlayheadsSynchronizerAgent", "()Lcom/amazon/aps/iva/nz/f;", "playheadsSynchronizerAgent", "Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "getJwtProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "jwtProvider", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "getAuthInterceptor", "()Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "authInterceptor", "Lcom/amazon/aps/iva/ct/l;", "getUserBenefitsSynchronizer", "()Lcom/amazon/aps/iva/ct/l;", "userBenefitsSynchronizer", "Lcom/amazon/aps/iva/ct/d;", "getUserBenefitsChangeMonitor", "()Lcom/amazon/aps/iva/ct/d;", "userBenefitsChangeMonitor", "Lokhttp3/OkHttpClient;", "getSimpleOkHttpClient", "()Lokhttp3/OkHttpClient;", "simpleOkHttpClient", "getEtpOkHttpClient", "etpOkHttpClient", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "getCountryCodeProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "countryCodeProvider", "Lcom/ellation/crunchyroll/api/AccountStateProvider;", "getAccountStateProvider", "()Lcom/ellation/crunchyroll/api/AccountStateProvider;", "accountStateProvider", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "getUserTokenInteractor", "()Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "getDrmProxyService", "()Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "drmProxyService", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpNetworkModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: EtpNetworkModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/EtpNetworkModule$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/api/etp/EtpNetworkModule;", "okHttpClientFactory", "Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final EtpNetworkModule create(OkHttpClientFactory okHttpClientFactory) {
            j.f(okHttpClientFactory, "okHttpClientFactory");
            EtpNetworkModule$Companion$create$1 etpNetworkModule$Companion$create$1 = new EtpNetworkModule$Companion$create$1(a.a);
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            return new EtpNetworkModuleImpl(etpNetworkModule$Companion$create$1, okHttpClientFactory, CrunchyrollApplication.a.a());
        }
    }

    EtpAccountAuthService getAccountAuthService();

    EtpAccountService getAccountService();

    AccountStateProvider getAccountStateProvider();

    DigitalAssetManagementService getAssetsService();

    EtpAuthInterceptor getAuthInterceptor();

    ContentReviewsService getContentReviewService();

    CountryCodeProvider getCountryCodeProvider();

    DrmProxyService getDrmProxyService();

    EtpContentService getEtpContentService();

    EtpIndexProvider getEtpIndexProvider();

    EtpIndexService getEtpIndexService();

    OkHttpClient getEtpOkHttpClient();

    EtpServiceAvailabilityMonitor getEtpServiceMonitor();

    ExternalPartnersService getExternalPartnersService();

    FunMigrationService getFunMigrationService();

    c getInactiveClientMonitor();

    JwtInvalidator getJwtInvalidator();

    JwtProvider getJwtProvider();

    PlayService getPlayService();

    e getPlayheadsSynchronizer();

    f getPlayheadsSynchronizerAgent();

    PolicyChangeMonitor getPolicyChangeMonitor();

    RefreshTokenMonitor getRefreshTokenMonitor();

    RefreshTokenProvider getRefreshTokenProvider();

    RefreshTokenStorage getRefreshTokenStorage();

    OkHttpClient getSimpleOkHttpClient();

    SkipEventsService getSkipEventsService();

    SubscriptionProcessorService getSubscriptionProcessorService();

    TalkboxService getTalkboxService();

    ThirdPartyOauthService getThirdPartyOauthService();

    d getUserBenefitsChangeMonitor();

    l getUserBenefitsSynchronizer();

    UserTokenInteractor getUserTokenInteractor();
}
