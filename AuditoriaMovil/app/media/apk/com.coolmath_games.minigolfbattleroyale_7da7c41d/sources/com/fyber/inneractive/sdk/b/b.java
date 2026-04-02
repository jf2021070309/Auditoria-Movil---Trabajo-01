package com.fyber.inneractive.sdk.b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class b extends a implements c.a {
    private InneractiveAdSpot a;
    private com.fyber.inneractive.sdk.e.c b;

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void destroy() {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final ViewGroup getLayout() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final boolean isCloseButtonDisplay() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void setActivityOrientation(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void showAdditionalCloseButton() {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void showCloseButton(boolean z, boolean z2) {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void showCloseCountdown() {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void updateCloseCountdown(int i) {
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final boolean wasDismissedByUser() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public final void dismissAd(boolean z) {
        com.fyber.inneractive.sdk.e.c cVar = this.b;
        if (cVar != null) {
            cVar.destroy();
            this.b = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.b.a
    public final void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2 = (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) ? null : null;
        this.a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                com.fyber.inneractive.sdk.e.c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    fullscreenRenderer.initialize(this.a);
                    try {
                        this.b.a(this, activity);
                    } catch (InneractiveUnitController.AdDisplayError e) {
                        IAlog.d("Interstitial Activity: %s", e.getMessage());
                    }
                }
            }
        }
    }
}
