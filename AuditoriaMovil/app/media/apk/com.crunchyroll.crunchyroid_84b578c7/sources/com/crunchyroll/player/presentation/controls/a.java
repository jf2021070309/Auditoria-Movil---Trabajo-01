package com.crunchyroll.player.presentation.controls;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m6.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerControlsLayout.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ PlayerControlsLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PlayerControlsLayout playerControlsLayout) {
        super(0);
        this.h = playerControlsLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        ComposeView composeView = (ComposeView) this.h.b.h;
        j.e(composeView, "binding.skipSegmentButtonContainer");
        composeView.clearAnimation();
        View view = new View[]{composeView}[0];
        view.animate().alpha(1.0f).setDuration(300L).withStartAction(new e(view, 7)).setInterpolator(new DecelerateInterpolator()).start();
        return q.a;
    }
}
