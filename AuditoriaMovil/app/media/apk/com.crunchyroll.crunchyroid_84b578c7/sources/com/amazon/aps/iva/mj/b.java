package com.amazon.aps.iva.mj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.crunchyroll.cast.overlay.CastOverlayLayout;
import com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView;
import com.crunchyroll.player.presentation.buffering.PlayerBufferingLayout;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
import com.crunchyroll.player.presentation.controls.maturityrestrictionlabel.PlayerMaturityLabelLayout;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
import com.crunchyroll.player.presentation.playerview.PlayerGesturesLayout;
/* compiled from: LayoutInternalPlayerBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final CastOverlayLayout b;
    public final PlayerControlsLayout c;
    public final PlayerMaturityLabelLayout d;
    public final PlayerToolbar e;
    public final OctopusSubtitlesView f;
    public final FrameLayout g;

    public b(FrameLayout frameLayout, CastOverlayLayout castOverlayLayout, PlayerControlsLayout playerControlsLayout, PlayerGesturesLayout playerGesturesLayout, PlayerBufferingLayout playerBufferingLayout, PlayerMaturityLabelLayout playerMaturityLabelLayout, PlayerToolbar playerToolbar, ComposeView composeView, ComposeView composeView2, OctopusSubtitlesView octopusSubtitlesView, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = castOverlayLayout;
        this.c = playerControlsLayout;
        this.d = playerMaturityLabelLayout;
        this.e = playerToolbar;
        this.f = octopusSubtitlesView;
        this.g = frameLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
