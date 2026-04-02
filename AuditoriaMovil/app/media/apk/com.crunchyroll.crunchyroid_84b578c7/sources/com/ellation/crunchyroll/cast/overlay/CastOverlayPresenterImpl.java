package com.ellation.crunchyroll.cast.overlay;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.df.a;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.ye.f;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastOverlayPresenter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayView;", "Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "", "deviceName", "Lcom/amazon/aps/iva/kb0/q;", "updateCastingText", "onCreate", "Lcom/amazon/aps/iva/df/a;", "viewModel", "Lcom/amazon/aps/iva/df/a;", "Lcom/amazon/aps/iva/ye/f;", "castStateProvider", "Lcom/amazon/aps/iva/ye/f;", "getDeviceName", "()Ljava/lang/String;", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayView;Lcom/amazon/aps/iva/df/a;Lcom/amazon/aps/iva/ye/f;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastOverlayPresenterImpl extends b<InternalCastOverlayView> implements CastOverlayPresenter {
    private final f castStateProvider;
    private final a viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayPresenterImpl(InternalCastOverlayView internalCastOverlayView, a aVar, f fVar) {
        super(internalCastOverlayView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(internalCastOverlayView, "view");
        com.amazon.aps.iva.yb0.j.f(aVar, "viewModel");
        com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
        this.viewModel = aVar;
        this.castStateProvider = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceName() {
        com.amazon.aps.iva.ye.b castSession = this.castStateProvider.getCastSession();
        if (castSession != null) {
            return castSession.getDeviceName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCastingText(String str) {
        boolean z;
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            getView().setConnectingToCastDeviceText();
        } else {
            getView().setCastSessionFriendlyText(str);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onCreate() {
        this.viewModel.A6().e(getView(), new CastOverlayPresenterImpl$sam$androidx_lifecycle_Observer$0(new CastOverlayPresenterImpl$onCreate$1(this)));
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(this.castStateProvider.getCastStateFlow(), new CastOverlayPresenterImpl$onCreate$2(this, null)));
    }
}
