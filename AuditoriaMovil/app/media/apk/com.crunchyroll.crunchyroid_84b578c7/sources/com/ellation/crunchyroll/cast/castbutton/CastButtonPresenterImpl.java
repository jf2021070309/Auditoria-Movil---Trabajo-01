package com.ellation.crunchyroll.cast.castbutton;

import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.ye.i;
import com.ellation.crunchyroll.cast.CastContextProxy;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastButtonPresenter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenterImpl;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;", "Lcom/amazon/aps/iva/kb0/q;", "showIntroductoryOverlay", "onCreate", "onResume", "", "newState", "onCastStateChanged", "onPause", "Lcom/ellation/crunchyroll/cast/CastContextProxy;", "castContext", "Lcom/ellation/crunchyroll/cast/CastContextProxy;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "castButtonMediaRouter", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lcom/amazon/aps/iva/ye/i;", "", "isCastApiAvailable", "()Z", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;Lcom/ellation/crunchyroll/cast/CastContextProxy;Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;Lcom/amazon/aps/iva/ye/i;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastButtonPresenterImpl extends b<CastButtonView> implements CastButtonPresenter {
    private final CastButtonMediaRouter castButtonMediaRouter;
    private final CastContextProxy castContext;
    private final i playServicesStatusChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastButtonPresenterImpl(CastButtonView castButtonView, CastContextProxy castContextProxy, CastButtonMediaRouter castButtonMediaRouter, i iVar) {
        super(castButtonView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(castButtonView, "view");
        com.amazon.aps.iva.yb0.j.f(castContextProxy, "castContext");
        com.amazon.aps.iva.yb0.j.f(castButtonMediaRouter, "castButtonMediaRouter");
        com.amazon.aps.iva.yb0.j.f(iVar, "playServicesStatusChecker");
        this.castContext = castContextProxy;
        this.castButtonMediaRouter = castButtonMediaRouter;
        this.playServicesStatusChecker = iVar;
    }

    private final void showIntroductoryOverlay() {
        getView().hideCastOverlay();
        if (getView().isCastButtonVisible()) {
            getView().showCastOverlay();
        }
    }

    public final boolean isCastApiAvailable() {
        return this.playServicesStatusChecker.isCastApiAvailable();
    }

    @Override // com.google.android.gms.cast.framework.CastStateListener
    public void onCastStateChanged(int i) {
        if (i != 1) {
            showIntroductoryOverlay();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onCreate() {
        if (isCastApiAvailable()) {
            this.castButtonMediaRouter.setUpMediaRouteButton();
            showIntroductoryOverlay();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onPause() {
        if (isCastApiAvailable()) {
            this.castContext.removeCastStateListener(this);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onResume() {
        if (isCastApiAvailable()) {
            this.castContext.addCastStateListener(this);
        }
    }
}
