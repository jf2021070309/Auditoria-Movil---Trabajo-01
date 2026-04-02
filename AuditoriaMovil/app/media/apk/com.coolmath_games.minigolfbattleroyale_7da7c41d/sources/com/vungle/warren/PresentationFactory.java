package com.vungle.warren;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.FullAdWidget;
import com.vungle.warren.ui.view.VungleWebClient;
/* loaded from: classes2.dex */
public interface PresentationFactory {

    /* loaded from: classes2.dex */
    public interface FullScreenCallback {
        void onResult(Pair<AdContract.AdView, AdContract.AdvertisementPresenter> pair, VungleException vungleException);
    }

    /* loaded from: classes2.dex */
    public interface ViewCallback {
        void onResult(Pair<WebAdContract.WebAdPresenter, VungleWebClient> pair, VungleException vungleException);
    }

    void destroy();

    void getFullScreenPresentation(Context context, AdRequest adRequest, FullAdWidget fullAdWidget, OptionsState optionsState, CloseDelegate closeDelegate, OrientationDelegate orientationDelegate, Bundle bundle, FullScreenCallback fullScreenCallback);

    void getNativeViewPresentation(AdRequest adRequest, AdConfig adConfig, CloseDelegate closeDelegate, ViewCallback viewCallback);

    void saveState(Bundle bundle);
}
