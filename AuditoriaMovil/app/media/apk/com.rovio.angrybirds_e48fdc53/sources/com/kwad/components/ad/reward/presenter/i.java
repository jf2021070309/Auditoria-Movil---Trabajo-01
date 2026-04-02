package com.kwad.components.ad.reward.presenter;

import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class i extends a {
    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        try {
            this.qB.oZ.jP();
        } catch (Throwable th) {
            bj.postOnUiThread(new aw() { // from class: com.kwad.components.ad.reward.presenter.i.1
                @Override // com.kwad.sdk.utils.aw
                public final void doTask() {
                    com.kwad.sdk.crash.b.l(th);
                    i.this.hy();
                }
            });
        }
    }
}
