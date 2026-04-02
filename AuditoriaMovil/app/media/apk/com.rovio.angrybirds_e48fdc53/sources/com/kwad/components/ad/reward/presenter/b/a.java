package com.kwad.components.ad.reward.presenter.b;

import com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a {
    private AdLiveHandleClickListener tO = new AdLiveHandleClickListener() { // from class: com.kwad.components.ad.reward.presenter.b.a.1
        @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener
        public final void handleAdLiveClick(int i) {
            if (i == 1) {
                a.this.qB.a(1, a.this.getContext(), 115, 1);
            } else if (i == 2) {
                a.this.qB.a(1, a.this.getContext(), 117, 1);
            }
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.qB.pa != null) {
            this.qB.pa.registerClickListener(this.tO);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (this.qB.pa != null) {
            this.qB.pa.unRegisterClickListener(this.tO);
        }
    }
}
