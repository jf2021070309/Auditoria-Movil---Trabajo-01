package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.content.Context;
import com.kwad.components.ad.reward.presenter.f.g;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a {
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.c.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-bottom-card-v2", c.this.qB.mAdTemplate).equals(str) || j.b("ksad-fullscreen-video-card", c.this.qB.mAdTemplate).equals(str)) {
                c.this.qB.pN = true;
                c.this.qB.pc.P(true);
            }
        }
    };
    private AdTemplate mAdTemplate;
    private Context mContext;

    public c() {
        a(new f());
        a(new b());
        a(new g());
    }

    private void iq() {
        if (com.kwad.components.ad.reward.j.d(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mAdTemplate = this.qB.mAdTemplate;
        this.mContext = this.qB.mContext;
        iq();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
    }
}
