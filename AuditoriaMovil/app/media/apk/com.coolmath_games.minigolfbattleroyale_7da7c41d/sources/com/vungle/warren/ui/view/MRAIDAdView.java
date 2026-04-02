package com.vungle.warren.ui.view;

import android.content.Context;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.WebAdContract;
/* loaded from: classes2.dex */
public class MRAIDAdView extends BaseAdView<WebAdContract.WebAdPresenter> implements WebAdContract.WebAdView {
    private WebAdContract.WebAdPresenter presenter;

    public MRAIDAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        super(context, fullAdWidget, orientationDelegate, closeDelegate);
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void updateWindow() {
        this.view.updateWindow();
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void setVisibility(boolean z) {
        this.view.setVisibility(z ? 0 : 8);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(WebAdContract.WebAdPresenter webAdPresenter) {
        this.presenter = webAdPresenter;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        this.view.showWebsite(str);
    }
}
