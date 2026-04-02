package com.ellation.crunchyroll.cast.expanded;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.at.a;
import com.amazon.aps.iva.fs.b;
import com.amazon.aps.iva.hl.v;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.ll.g;
import com.amazon.aps.iva.rf.c;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModel;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateAnalytics;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/amazon/aps/iva/kb0/q;", "onSkipNextClick", "Lcom/amazon/aps/iva/fs/b;", "analyticsClickedView", "onPremiumCtaClick", "", "assetId", "onPlayFallbackAssetClick", "onEnableMatureContentClick", "onMaturityRestrictionOverlayClicked", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastControllerPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastControllerPresenter.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJf\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter$Companion;", "", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerView;", "view", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;", "castControllerViewModel", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;", "matureFlowViewModel", "Lcom/amazon/aps/iva/at/a;", "contentAvailabilityProvider", "Lcom/amazon/aps/iva/hl/v;", "restrictionOverlayMapper", "Lcom/amazon/aps/iva/ye/h;", "versionsChromecastMessenger", "Lcom/amazon/aps/iva/ll/g;", "playerSettingsMonitor", "Lcom/amazon/aps/iva/k50/j;", "subscriptionFlowRouter", "Lcom/amazon/aps/iva/k50/g;", "settingsRouter", "Lcom/amazon/aps/iva/rf/c;", "premiumDubFormatter", "", "isDeviceTablet", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "castContentStateAnalytics", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastControllerPresenter create(CastControllerView castControllerView, CastControllerViewModel castControllerViewModel, ChromecastMatureFlowViewModel chromecastMatureFlowViewModel, a aVar, v vVar, h hVar, g gVar, j jVar, com.amazon.aps.iva.k50.g gVar2, c cVar, boolean z, CastContentStateAnalytics castContentStateAnalytics) {
            com.amazon.aps.iva.yb0.j.f(castControllerView, "view");
            com.amazon.aps.iva.yb0.j.f(castControllerViewModel, "castControllerViewModel");
            com.amazon.aps.iva.yb0.j.f(chromecastMatureFlowViewModel, "matureFlowViewModel");
            com.amazon.aps.iva.yb0.j.f(aVar, "contentAvailabilityProvider");
            com.amazon.aps.iva.yb0.j.f(vVar, "restrictionOverlayMapper");
            com.amazon.aps.iva.yb0.j.f(hVar, "versionsChromecastMessenger");
            com.amazon.aps.iva.yb0.j.f(gVar, "playerSettingsMonitor");
            com.amazon.aps.iva.yb0.j.f(jVar, "subscriptionFlowRouter");
            com.amazon.aps.iva.yb0.j.f(gVar2, "settingsRouter");
            com.amazon.aps.iva.yb0.j.f(cVar, "premiumDubFormatter");
            com.amazon.aps.iva.yb0.j.f(castContentStateAnalytics, "castContentStateAnalytics");
            return new CastControllerPresenterImpl(castControllerView, castControllerViewModel, chromecastMatureFlowViewModel, aVar, vVar, hVar, gVar, jVar, gVar2, cVar, z, castContentStateAnalytics);
        }
    }

    /* compiled from: CastControllerPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastControllerPresenter castControllerPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastControllerPresenter castControllerPresenter, Configuration configuration) {
        }

        public static void onCreate(CastControllerPresenter castControllerPresenter) {
        }

        public static void onDestroy(CastControllerPresenter castControllerPresenter) {
        }

        public static void onNewIntent(CastControllerPresenter castControllerPresenter, Intent intent) {
            com.amazon.aps.iva.yb0.j.f(intent, "intent");
        }

        public static void onPause(CastControllerPresenter castControllerPresenter) {
        }

        public static void onResume(CastControllerPresenter castControllerPresenter) {
        }

        public static void onStart(CastControllerPresenter castControllerPresenter) {
        }

        public static void onStop(CastControllerPresenter castControllerPresenter) {
        }
    }

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onCreate();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onDestroy();

    void onEnableMatureContentClick(b bVar);

    void onMaturityRestrictionOverlayClicked(b bVar);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onNewIntent(Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPause();

    void onPlayFallbackAssetClick(String str);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPreDestroy();

    void onPremiumCtaClick(b bVar);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onResume();

    void onSkipNextClick();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStart();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStop();
}
