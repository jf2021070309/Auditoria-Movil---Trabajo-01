package com.ellation.crunchyroll.cast;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.cj.b;
import com.amazon.aps.iva.mt.m;
import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ye.f;
import com.amazon.aps.iva.ye.h;
import com.amazon.aps.iva.ye.i;
import com.amazon.aps.iva.ye.j;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.cast.CastMediaProvider;
import com.ellation.crunchyroll.cast.ChromecastMessengerInternal;
import com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal;
import com.ellation.crunchyroll.cast.analytics.CastAnalytics;
import com.ellation.crunchyroll.cast.castbutton.CastButtonFactory;
import com.ellation.crunchyroll.cast.castlistener.VideoCastControllerFactory;
import com.ellation.crunchyroll.cast.dependencies.CastDependencies;
import com.ellation.crunchyroll.cast.dependencies.CastResources;
import com.ellation.crunchyroll.cast.dependencies.CastRouters;
import com.ellation.crunchyroll.cast.dialog.CustomMediaRouteDialogFactory;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import com.ellation.crunchyroll.cast.session.CastMediaLoaderInternal;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderHolder;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderImpl;
import com.ellation.crunchyroll.cast.session.audio.ChromecastAudioReaderImpl;
import com.ellation.crunchyroll.cast.sessionmanagerlistener.SessionManagerEventHandler;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CastFeature.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010o\u001a\u00020\u0002¢\u0006\u0004\bp\u0010qJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00101R\u0014\u0010<\u001a\u0002098\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\"0.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u00101R\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010Z\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006r"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastFeatureImpl;", "Lcom/ellation/crunchyroll/cast/CastFeature;", "Lcom/ellation/crunchyroll/cast/dependencies/CastDependencies;", "Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteDialogFactory;", "createMediaRouteDialogFactory", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/amazon/aps/iva/kb0/q;", "addCastButton", "Landroidx/fragment/app/h;", "activity", "Landroid/view/Menu;", "menu", "endCastingSession", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "sessionManagerListener", "addCastSessionListener", "removeCastSessionListener", "Landroid/app/Activity;", "Lcom/crunchyroll/cast/castlistener/VideoCastController;", "createCastController", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "getAccountService", "()Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/amazon/aps/iva/cj/b;", "getAdvertisingInfoProvider", "()Lcom/amazon/aps/iva/cj/b;", "advertisingInfoProvider", "Lcom/amazon/aps/iva/ts/c;", "getApiConfiguration", "()Lcom/amazon/aps/iva/ts/c;", "apiConfiguration", "", "getCastId", "()Ljava/lang/String;", "castId", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "getContentService", "()Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "contentService", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "getGetAutoplaySetting", "()Lcom/amazon/aps/iva/xb0/a;", "getAutoplaySetting", "Ljava/util/Locale;", "getGetLocale", "getLocale", "getHasPremiumBenefit", "hasPremiumBenefit", "isClosedCaptionsEnabled", "Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "getMaturePreferenceInteractor", "()Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "maturePreferenceInteractor", "", "getMediaRouteMenuItemId", "()I", "mediaRouteMenuItemId", "Lcom/amazon/aps/iva/bf/a;", "getNextAssetInteractor", "()Lcom/amazon/aps/iva/bf/a;", "nextAssetInteractor", "Lcom/amazon/aps/iva/cj/l;", "getPlayerFeature", "()Lcom/amazon/aps/iva/cj/l;", "playerFeature", "Lcom/ellation/crunchyroll/cast/dependencies/CastResources;", "getResources", "()Lcom/ellation/crunchyroll/cast/dependencies/CastResources;", "resources", "Lcom/ellation/crunchyroll/cast/dependencies/CastRouters;", "getRouters", "()Lcom/ellation/crunchyroll/cast/dependencies/CastRouters;", "routers", "getSubtitleLanguage", "subtitleLanguage", "Lcom/amazon/aps/iva/ye/h;", "getSubtitleChromecastMessenger", "()Lcom/amazon/aps/iva/ye/h;", "subtitleChromecastMessenger", "getPreferencesChromecastMessenger", "preferencesChromecastMessenger", "getVersionsChromecastMessenger", "versionsChromecastMessenger", "Lcom/amazon/aps/iva/ye/i;", "getPlayServicesStatusChecker", "()Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lcom/amazon/aps/iva/ef/a;", "getCastMediaLoader", "()Lcom/amazon/aps/iva/ef/a;", "castMediaLoader", "Lcom/amazon/aps/iva/ye/j;", "getSessionManagerProvider", "()Lcom/amazon/aps/iva/ye/j;", "sessionManagerProvider", "Lcom/amazon/aps/iva/ye/f;", "getCastStateProvider", "()Lcom/amazon/aps/iva/ye/f;", "castStateProvider", "Lcom/amazon/aps/iva/ze/c;", "getChromecastAudioReader", "()Lcom/amazon/aps/iva/ze/c;", "chromecastAudioReader", "dependencies", "<init>", "(Lcom/ellation/crunchyroll/cast/dependencies/CastDependencies;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastFeatureImpl implements CastFeature, CastDependencies {
    private final /* synthetic */ CastDependencies $$delegate_0;

    /* compiled from: CastFeature.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/ye/j;", "invoke", "()Lcom/amazon/aps/iva/ye/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.CastFeatureImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.a<j> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            return new SessionManagerProviderImpl(CastFeatureImpl.this.getContext(), null, 2, null);
        }
    }

    public CastFeatureImpl(CastDependencies castDependencies) {
        com.amazon.aps.iva.yb0.j.f(castDependencies, "dependencies");
        this.$$delegate_0 = castDependencies;
        SessionManagerProviderHolder.init(getContext(), PlayServicesStatusCheckerInternal.Holder.get(), new AnonymousClass1(), new SessionManagerEventHandler(new CastAuthenticator(GsonHolder.getInstance(), getApiConfiguration(), CastDeviceInteractor.Companion.create(getAccountService()), ChromecastMessengerInternal.Companion.create$default(ChromecastMessengerInternal.Companion, CastAuthenticator.CAST_AUTH_NAMESPACE, null, null, 6, null))), new SessionManagerEventHandler(new CastUserPreferenceProvider(getPreferencesChromecastMessenger(), getGetLocale(), getGetAutoplaySetting(), castDependencies.getAdvertisingInfoProvider())), new SessionManagerEventHandler(new CastAnalytics(null, 1, null)));
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public void addCastButton(Toolbar toolbar) {
        com.amazon.aps.iva.yb0.j.f(toolbar, "toolbar");
        com.ellation.crunchyroll.mvp.lifecycle.a.b(CastButtonFactory.Companion.create(toolbar).getPresenter(), toolbar);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public void addCastSessionListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
        SessionManagerProviderHolder.get().addSessionManagerListener(sessionManagerListener);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public VideoCastController createCastController(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        return VideoCastControllerFactory.create$default(VideoCastControllerFactory.INSTANCE, activity, getPlayServicesStatusChecker(), null, 4, null);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public void endCastingSession() {
        SessionManagerProviderHolder.get().endCastingSession();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public EtpAccountService getAccountService() {
        return this.$$delegate_0.getAccountService();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public b getAdvertisingInfoProvider() {
        return this.$$delegate_0.getAdvertisingInfoProvider();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public c getApiConfiguration() {
        return this.$$delegate_0.getApiConfiguration();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public String getCastId() {
        return this.$$delegate_0.getCastId();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public com.amazon.aps.iva.ef.a getCastMediaLoader() {
        m mVar;
        CastMediaLoaderInternal.Companion companion = CastMediaLoaderInternal.Companion;
        CastMediaProvider.Companion companion2 = CastMediaProvider.Companion;
        int i = n.a;
        Context context = getContext();
        if (true & true) {
            int i2 = com.amazon.aps.iva.mt.l.a;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            mVar = new m(context);
        } else {
            mVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(mVar, "seasonAndEpisodeFormatter");
        return CastMediaLoaderInternal.Companion.create$default(companion, CastMediaProvider.Companion.create$default(companion2, new o(context, mVar), null, null, 6, null), null, 2, null);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public f getCastStateProvider() {
        return SessionManagerProviderHolder.get();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public com.amazon.aps.iva.ze.c getChromecastAudioReader() {
        return new ChromecastAudioReaderImpl(getSessionManagerProvider(), GsonHolder.getInstance());
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public EtpContentService getContentService() {
        return this.$$delegate_0.getContentService();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public Context getContext() {
        return this.$$delegate_0.getContext();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.xb0.a<Boolean> getGetAutoplaySetting() {
        return this.$$delegate_0.getGetAutoplaySetting();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.xb0.a<Locale> getGetLocale() {
        return this.$$delegate_0.getGetLocale();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.xb0.a<Boolean> getHasPremiumBenefit() {
        return this.$$delegate_0.getHasPremiumBenefit();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public ChromecastMaturePreferenceInteractor getMaturePreferenceInteractor() {
        return this.$$delegate_0.getMaturePreferenceInteractor();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public int getMediaRouteMenuItemId() {
        return this.$$delegate_0.getMediaRouteMenuItemId();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.bf.a getNextAssetInteractor() {
        return this.$$delegate_0.getNextAssetInteractor();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public i getPlayServicesStatusChecker() {
        return PlayServicesStatusCheckerInternal.Holder.get();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.cj.l getPlayerFeature() {
        return this.$$delegate_0.getPlayerFeature();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public h getPreferencesChromecastMessenger() {
        return ChromecastMessengerInternal.Companion.create$default(ChromecastMessengerInternal.Companion, "urn:x-cast:etp.preferences", null, null, 6, null);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public CastResources getResources() {
        return this.$$delegate_0.getResources();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public CastRouters getRouters() {
        return this.$$delegate_0.getRouters();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public j getSessionManagerProvider() {
        return SessionManagerProviderHolder.get();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public h getSubtitleChromecastMessenger() {
        return ChromecastMessengerInternal.Companion.create$default(ChromecastMessengerInternal.Companion, "urn:x-cast:etp.subtitle_language", null, null, 6, null);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.xb0.a<String> getSubtitleLanguage() {
        return this.$$delegate_0.getSubtitleLanguage();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature, com.amazon.aps.iva.ye.a
    public h getVersionsChromecastMessenger() {
        return ChromecastMessengerInternal.Companion.create$default(ChromecastMessengerInternal.Companion, "urn:x-cast:etp.video_version", null, null, 6, null);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public com.amazon.aps.iva.xb0.a<Boolean> isClosedCaptionsEnabled() {
        return this.$$delegate_0.isClosedCaptionsEnabled();
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public void removeCastSessionListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
        SessionManagerProviderHolder.get().removeSessionManagerListener(sessionManagerListener);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public void addCastButton(androidx.fragment.app.h hVar, Menu menu) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        com.amazon.aps.iva.yb0.j.f(menu, "menu");
        com.ellation.crunchyroll.mvp.lifecycle.a.a(CastButtonFactory.Companion.create(hVar, menu).getPresenter(), hVar);
    }

    @Override // com.ellation.crunchyroll.cast.CastFeature
    public CustomMediaRouteDialogFactory createMediaRouteDialogFactory() {
        return new CustomMediaRouteDialogFactory();
    }
}
