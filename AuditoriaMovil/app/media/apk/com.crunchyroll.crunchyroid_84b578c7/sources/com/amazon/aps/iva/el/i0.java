package com.amazon.aps.iva.el;

import androidx.lifecycle.LiveData;
import com.crunchyroll.cast.overlay.CastOverlayLayout;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
/* compiled from: PlayerViewLayout.kt */
/* loaded from: classes2.dex */
public interface i0 extends com.amazon.aps.iva.wy.h {
    void F1();

    void J5(boolean z, com.amazon.aps.iva.i5.v<MenuButtonData> vVar, com.amazon.aps.iva.cl.f fVar, b0 b0Var);

    boolean Ye();

    void Z1(LabelUiModel labelUiModel);

    CastOverlayLayout getCastOverlayLayout();

    LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> getExitFullscreenByTapEvent();

    LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> getFullScreenToggledEvent();

    LiveData<h0> getSizeState();

    void h0();

    void jf();

    void setToolbarListener(com.amazon.aps.iva.cl.b bVar);
}
