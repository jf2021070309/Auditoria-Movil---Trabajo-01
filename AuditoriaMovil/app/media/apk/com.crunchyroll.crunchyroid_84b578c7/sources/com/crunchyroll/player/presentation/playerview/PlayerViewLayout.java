package com.crunchyroll.player.presentation.playerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.cl.b;
import com.amazon.aps.iva.cl.f;
import com.amazon.aps.iva.el.b0;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.el.i0;
import com.amazon.aps.iva.ez.d;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.cast.overlay.CastOverlayLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: PlayerViewLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/el/i0;", "Lcom/amazon/aps/iva/cl/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "setToolbarListener", "Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "getCastOverlayLayout", "()Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "castOverlayLayout", "Landroidx/lifecycle/LiveData;", "Lcom/amazon/aps/iva/ez/d;", "getExitFullscreenByTapEvent", "()Landroidx/lifecycle/LiveData;", "exitFullscreenByTapEvent", "getFullScreenToggledEvent", "fullScreenToggledEvent", "Lcom/amazon/aps/iva/el/h0;", "getSizeState", "sizeState", "player-api_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"InflateParams"})
/* loaded from: classes2.dex */
public final class PlayerViewLayout extends g implements i0 {
    public final /* synthetic */ i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_player, (ViewGroup) null, false);
        j.e(inflate, "from(context)\n        .i…yout_player, null, false)");
        this.b = (i0) inflate;
        addView(inflate);
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void F1() {
        this.b.F1();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void J5(boolean z, v<MenuButtonData> vVar, f fVar, b0 b0Var) {
        j.f(vVar, "buttonDataProviderLiveData");
        j.f(b0Var, "backButtonClickListener");
        this.b.J5(z, vVar, fVar, b0Var);
    }

    @Override // com.amazon.aps.iva.el.i0
    public final boolean Ye() {
        return this.b.Ye();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void Z1(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        this.b.Z1(labelUiModel);
    }

    @Override // com.amazon.aps.iva.el.i0
    public CastOverlayLayout getCastOverlayLayout() {
        return this.b.getCastOverlayLayout();
    }

    @Override // com.amazon.aps.iva.el.i0
    public LiveData<d<q>> getExitFullscreenByTapEvent() {
        return this.b.getExitFullscreenByTapEvent();
    }

    @Override // com.amazon.aps.iva.el.i0
    public LiveData<d<q>> getFullScreenToggledEvent() {
        return this.b.getFullScreenToggledEvent();
    }

    @Override // com.amazon.aps.iva.el.i0
    public LiveData<h0> getSizeState() {
        return this.b.getSizeState();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void h0() {
        this.b.h0();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void jf() {
        this.b.jf();
    }

    @Override // com.amazon.aps.iva.el.i0
    public void setToolbarListener(b bVar) {
        j.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.setToolbarListener(bVar);
    }
}
