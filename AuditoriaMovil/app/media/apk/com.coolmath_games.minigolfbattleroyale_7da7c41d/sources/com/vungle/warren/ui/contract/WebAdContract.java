package com.vungle.warren.ui.contract;

import com.vungle.warren.ui.contract.AdContract;
/* loaded from: classes2.dex */
public interface WebAdContract {

    /* loaded from: classes2.dex */
    public interface WebAdPresenter extends AdContract.AdvertisementPresenter<WebAdView> {
        void setAdVisibility(boolean z);
    }

    /* loaded from: classes2.dex */
    public interface WebAdView extends AdContract.AdView<WebAdPresenter> {
        void setVisibility(boolean z);

        void updateWindow();
    }
}
