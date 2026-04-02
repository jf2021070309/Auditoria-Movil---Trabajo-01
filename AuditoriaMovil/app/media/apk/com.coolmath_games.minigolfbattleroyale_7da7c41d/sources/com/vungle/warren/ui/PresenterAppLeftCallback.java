package com.vungle.warren.ui;

import com.vungle.warren.model.Placement;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.utility.ActivityManager;
/* loaded from: classes2.dex */
public class PresenterAppLeftCallback implements ActivityManager.LeftApplicationCallback {
    private final AdContract.AdvertisementPresenter.EventListener bus;
    private final Placement placement;

    public PresenterAppLeftCallback(AdContract.AdvertisementPresenter.EventListener eventListener, Placement placement) {
        this.bus = eventListener;
        this.placement = placement;
    }

    @Override // com.vungle.warren.utility.ActivityManager.LeftApplicationCallback
    public void onLeftApplication() {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            Placement placement = this.placement;
            eventListener.onNext("open", "adLeftApplication", placement == null ? null : placement.getId());
        }
    }
}
