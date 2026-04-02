package com.kwad.components.ad.reward.presenter;

import com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener;
/* loaded from: classes.dex */
public final class j extends a {
    private final AdLiveCallerContextListener sn = new AdLiveCallerContextListener() { // from class: com.kwad.components.ad.reward.presenter.j.1
        @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener
        public final boolean isCloseDialogShowing() {
            return com.kwad.components.ad.reward.j.e(j.this.qB);
        }
    };
    private final com.kwad.components.core.l.a.a so = new com.kwad.components.core.l.a.b() { // from class: com.kwad.components.ad.reward.presenter.j.2
        @Override // com.kwad.components.core.l.a.b, com.kwad.components.core.l.a.a
        public final void c(com.kwad.components.core.o.c cVar) {
            super.c(cVar);
            if (j.this.qB.oZ.jT()) {
                j.this.qB.oZ.jU().onResume();
                if (com.kwad.components.core.t.a.ak(j.this.qB.mContext).qj()) {
                    j.this.qB.c(false, false);
                }
            }
        }

        @Override // com.kwad.components.core.l.a.b, com.kwad.components.core.l.a.a
        public final void d(com.kwad.components.core.o.c cVar) {
            super.d(cVar);
            if (j.this.qB.oZ.jT()) {
                j.this.qB.oZ.jU().onPause();
            }
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.qB.oZ.jT()) {
            this.qB.oZ.jU().registerAdLiveCallerContextListener(this.sn);
            this.qB.Lm.add(this.so);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        if (this.qB.oZ.jT()) {
            this.qB.oZ.jU().unRegisterAdLiveCallerContextListener(this.sn);
            this.qB.Lm.remove(this.so);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
