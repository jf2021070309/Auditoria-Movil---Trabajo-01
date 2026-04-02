package com.ellation.crunchyroll.cast.overlay.toolbar;

import com.amazon.aps.iva.df.a;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastOverlayToolbarPresenter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarView;", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "onBackButtonClick", "onSkipToNext", "Lcom/amazon/aps/iva/df/a;", "viewModel", "Lcom/amazon/aps/iva/df/a;", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarView;Lcom/amazon/aps/iva/df/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastOverlayToolbarPresenterImpl extends b<CastOverlayToolbarView> implements CastOverlayToolbarPresenter {
    private final a viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayToolbarPresenterImpl(CastOverlayToolbarView castOverlayToolbarView, a aVar) {
        super(castOverlayToolbarView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(castOverlayToolbarView, "view");
        com.amazon.aps.iva.yb0.j.f(aVar, "viewModel");
        this.viewModel = aVar;
    }

    @Override // com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarPresenter
    public void onBackButtonClick() {
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onCreate() {
        this.viewModel.t4().e(getView(), new CastOverlayToolbarPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastOverlayToolbarPresenterImpl$onCreate$1(this)));
    }

    @Override // com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarPresenter
    public void onSkipToNext() {
        getView().hideSkipToNextButton();
        String d = this.viewModel.t4().d();
        if (d != null) {
            this.viewModel.i4(d);
        }
    }
}
