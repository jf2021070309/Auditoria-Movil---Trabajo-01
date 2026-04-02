package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.at.a;
import com.amazon.aps.iva.ez.e;
import com.amazon.aps.iva.hl.v;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.ll.g;
import com.amazon.aps.iva.nf.c;
import com.amazon.aps.iva.rf.c;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.xw.b0;
import com.amazon.aps.iva.ye.h;
import com.amazon.aps.iva.ze.d;
import com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModel;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateAnalytics;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastControllerPresenter.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bg\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerView;", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "Lcom/amazon/aps/iva/kb0/q;", "bindCastContentStateLayer", "", "isVisible", "setSkipNextButtonVisibility", "updateDeviceOrientation", "onCreate", "onSkipNextClick", "Lcom/amazon/aps/iva/fs/b;", "analyticsClickedView", "onPremiumCtaClick", "", "assetId", "onPlayFallbackAssetClick", "onEnableMatureContentClick", "onMaturityRestrictionOverlayClicked", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;", "viewModel", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;", "matureFlowViewModel", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;", "Lcom/amazon/aps/iva/at/a;", "contentAvailabilityProvider", "Lcom/amazon/aps/iva/at/a;", "Lcom/amazon/aps/iva/hl/v;", "restrictionOverlayMapper", "Lcom/amazon/aps/iva/hl/v;", "Lcom/amazon/aps/iva/ye/h;", "versionsChromecastMessenger", "Lcom/amazon/aps/iva/ye/h;", "Lcom/amazon/aps/iva/ll/g;", "playerSettingsMonitor", "Lcom/amazon/aps/iva/ll/g;", "Lcom/amazon/aps/iva/k50/j;", "subscriptionFlowRouter", "Lcom/amazon/aps/iva/k50/j;", "Lcom/amazon/aps/iva/k50/g;", "settingsRouter", "Lcom/amazon/aps/iva/k50/g;", "Lcom/amazon/aps/iva/rf/c;", "premiumDubFormatter", "Lcom/amazon/aps/iva/rf/c;", "isDeviceTablet", "Z", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "castContentStateAnalytics", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "status", "Ljava/lang/String;", "getStatus$annotations", "()V", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/expanded/CastControllerView;Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;Lcom/amazon/aps/iva/at/a;Lcom/amazon/aps/iva/hl/v;Lcom/amazon/aps/iva/ye/h;Lcom/amazon/aps/iva/ll/g;Lcom/amazon/aps/iva/k50/j;Lcom/amazon/aps/iva/k50/g;Lcom/amazon/aps/iva/rf/c;ZLcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerPresenterImpl extends b<CastControllerView> implements CastControllerPresenter {
    private final CastContentStateAnalytics castContentStateAnalytics;
    private final a contentAvailabilityProvider;
    private final boolean isDeviceTablet;
    private final ChromecastMatureFlowViewModel matureFlowViewModel;
    private final g playerSettingsMonitor;
    private final c premiumDubFormatter;
    private final v restrictionOverlayMapper;
    private final com.amazon.aps.iva.k50.g settingsRouter;
    private String status;
    private final j subscriptionFlowRouter;
    private final h versionsChromecastMessenger;
    private final CastControllerViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerPresenterImpl(CastControllerView castControllerView, CastControllerViewModel castControllerViewModel, ChromecastMatureFlowViewModel chromecastMatureFlowViewModel, a aVar, v vVar, h hVar, g gVar, j jVar, com.amazon.aps.iva.k50.g gVar2, c cVar, boolean z, CastContentStateAnalytics castContentStateAnalytics) {
        super(castControllerView, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(castControllerView, "view");
        com.amazon.aps.iva.yb0.j.f(castControllerViewModel, "viewModel");
        com.amazon.aps.iva.yb0.j.f(chromecastMatureFlowViewModel, "matureFlowViewModel");
        com.amazon.aps.iva.yb0.j.f(aVar, "contentAvailabilityProvider");
        com.amazon.aps.iva.yb0.j.f(vVar, "restrictionOverlayMapper");
        com.amazon.aps.iva.yb0.j.f(hVar, "versionsChromecastMessenger");
        com.amazon.aps.iva.yb0.j.f(gVar, "playerSettingsMonitor");
        com.amazon.aps.iva.yb0.j.f(jVar, "subscriptionFlowRouter");
        com.amazon.aps.iva.yb0.j.f(gVar2, "settingsRouter");
        com.amazon.aps.iva.yb0.j.f(cVar, "premiumDubFormatter");
        com.amazon.aps.iva.yb0.j.f(castContentStateAnalytics, "castContentStateAnalytics");
        this.viewModel = castControllerViewModel;
        this.matureFlowViewModel = chromecastMatureFlowViewModel;
        this.contentAvailabilityProvider = aVar;
        this.restrictionOverlayMapper = vVar;
        this.versionsChromecastMessenger = hVar;
        this.playerSettingsMonitor = gVar;
        this.subscriptionFlowRouter = jVar;
        this.settingsRouter = gVar2;
        this.premiumDubFormatter = cVar;
        this.isDeviceTablet = z;
        this.castContentStateAnalytics = castContentStateAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindCastContentStateLayer(PlayableAsset playableAsset) {
        boolean z;
        this.status = this.contentAvailabilityProvider.a(playableAsset);
        com.amazon.aps.iva.nf.c b = this.restrictionOverlayMapper.b(playableAsset);
        if (b instanceof c.k) {
            getView().showUnavailableOverlay();
            getView().disableControls();
        } else if (b instanceof c.a) {
            getView().showComingSoonOverlay();
            getView().disableControls();
        } else if (b instanceof c.i) {
            getView().showRestrictedContentOverlay();
            getView().disableControls();
            this.status = "matureBlocked";
        } else if (b instanceof c.d) {
            getView().showMatureBlockedOverlay();
            getView().disableControls();
        } else {
            if (b instanceof c.f) {
                z = true;
            } else {
                z = b instanceof c.g;
            }
            if (z) {
                if (b instanceof c.g) {
                    getView().showPremiumDubOverlay(this.premiumDubFormatter, ((c.g) b).a);
                    getView().disableControls();
                    return;
                }
                getView().showPremiumOverlay();
                getView().disableControls();
                return;
            }
            getView().hideOverlay();
            getView().enableControls();
        }
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSkipNextButtonVisibility(boolean z) {
        if (z) {
            getView().showSkipNextButton();
        } else {
            getView().hideSkipNextButton();
        }
    }

    private final void updateDeviceOrientation() {
        if (!this.isDeviceTablet) {
            getView().setOrientationPortrait();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onCreate() {
        updateDeviceOrientation();
        this.viewModel.getTitle().e(getView(), new CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastControllerPresenterImpl$onCreate$1(getView())));
        this.viewModel.getImageUrl().e(getView(), new CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastControllerPresenterImpl$onCreate$2(getView())));
        this.viewModel.getSubtitle().e(getView(), new CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastControllerPresenterImpl$onCreate$3(getView())));
        this.viewModel.getCurrentAsset().e(getView(), new CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastControllerPresenterImpl$onCreate$4(this)));
        this.viewModel.getSkipButtonVisibility().e(getView(), new CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastControllerPresenterImpl$onCreate$5(this)));
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(this.matureFlowViewModel.getMatureFlowProcessing(), new CastControllerPresenterImpl$onCreate$6(this, null)));
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(this.matureFlowViewModel.getMatureFlowStatus(), new CastControllerPresenterImpl$onCreate$7(this, null)));
        e.a(this.playerSettingsMonitor.b(), getView(), new CastControllerPresenterImpl$onCreate$8(getView()));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerPresenter
    public void onEnableMatureContentClick(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
        CastContentStateAnalytics castContentStateAnalytics = this.castContentStateAnalytics;
        PlayableAsset playableAsset = (PlayableAsset) b0.a(this.viewModel.getCurrentAsset());
        String str = this.status;
        if (str != null) {
            castContentStateAnalytics.onActionClick(bVar, playableAsset, str);
            this.matureFlowViewModel.onEnableMatureContent((PlayableAsset) b0.a(this.viewModel.getCurrentAsset()));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("status");
        throw null;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerPresenter
    public void onMaturityRestrictionOverlayClicked(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
        CastContentStateAnalytics castContentStateAnalytics = this.castContentStateAnalytics;
        PlayableAsset playableAsset = (PlayableAsset) b0.a(this.viewModel.getCurrentAsset());
        String str = this.status;
        if (str != null) {
            castContentStateAnalytics.onActionClick(bVar, playableAsset, str);
            this.settingsRouter.a();
            return;
        }
        com.amazon.aps.iva.yb0.j.m("status");
        throw null;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerPresenter
    public void onPlayFallbackAssetClick(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        this.versionsChromecastMessenger.sendMessage(new d(str));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerPresenter
    public void onPremiumCtaClick(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
        CastContentStateAnalytics castContentStateAnalytics = this.castContentStateAnalytics;
        PlayableAsset playableAsset = (PlayableAsset) b0.a(this.viewModel.getCurrentAsset());
        String str = this.status;
        if (str != null) {
            castContentStateAnalytics.onActionClick(bVar, playableAsset, str);
            j.a.a(this.subscriptionFlowRouter, null, 3);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("status");
        throw null;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerPresenter
    public void onSkipNextClick() {
        this.viewModel.loadNextEpisode();
    }
}
