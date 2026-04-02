package com.kwad.components.ad.reward.presenter;

import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public class a extends Presenter {
    public com.kwad.components.ad.reward.j qB;

    @Override // com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        this.qB = (com.kwad.components.ad.reward.j) Gh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void hy() {
        this.qB.hy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean hz() {
        return com.kwad.sdk.core.response.b.a.aV(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate));
    }
}
