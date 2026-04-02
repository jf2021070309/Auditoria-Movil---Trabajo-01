package com.kwad.components.ad.splashscreen.c;
/* loaded from: classes.dex */
public final class k extends e implements com.kwad.sdk.core.h.c {
    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        this.CS.S(getContext());
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.CS.Cj.a(this);
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.H(this.CS.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.ck(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate))) {
            this.CS.S(getContext());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.CS.Cj.b(this);
    }
}
