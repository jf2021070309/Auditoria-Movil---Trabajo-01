package com.crunchyroll.player.presentation.controls;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.el.d0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerControlsLayout.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ PlayerControlsLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PlayerControlsLayout playerControlsLayout) {
        super(0);
        this.h = playerControlsLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        ComposeView composeView = (ComposeView) this.h.b.h;
        j.e(composeView, "binding.skipSegmentButtonContainer");
        composeView.clearAnimation();
        View view = new View[]{composeView}[0];
        view.animate().alpha(0.0f).setDuration(300L).withEndAction(new d0(view, 0)).setInterpolator(new DecelerateInterpolator()).start();
        return q.a;
    }
}
