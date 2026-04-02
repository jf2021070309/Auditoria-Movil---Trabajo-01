package com.fyber.inneractive.sdk.e;

import android.app.Activity;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
/* loaded from: classes.dex */
public interface c extends InneractiveAdRenderer {

    /* loaded from: classes.dex */
    public interface a {
        void destroy();

        void dismissAd(boolean z);

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void setActivityOrientation(boolean z, Orientation orientation);

        void showAdditionalCloseButton();

        void showCloseButton(boolean z, boolean z2);

        void showCloseCountdown();

        void updateCloseCountdown(int i);

        boolean wasDismissedByUser();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    void a(a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError;

    void a(b bVar);

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void destroy();

    boolean i();

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void initialize(InneractiveAdSpot inneractiveAdSpot);

    void j();

    void k();

    boolean q();

    void w();

    void x();
}
