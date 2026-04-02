package com.kwad.components.ad.splashscreen.c;

import android.view.View;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class a extends e implements com.kwad.sdk.widget.c {
    private View CH;
    private boolean CI;

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        this.CS.c(1, view.getContext(), 53, 2);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.CS == null) {
            return;
        }
        this.CI = com.kwad.sdk.core.response.b.c.bZ(this.CS.mAdTemplate);
        boolean m = com.kwad.components.ad.splashscreen.h.m(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate));
        this.CH.setVisibility(m ? 0 : 8);
        if (m) {
            new com.kwad.sdk.widget.f(this.CH.getContext(), this.CH, this);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        com.kwad.sdk.core.e.c.d("FullScreenTouchConvertPresenter", "onSlide: enableSlickClick: " + this.CI);
        if (this.CI) {
            this.CS.c(1, view.getContext(), 153, 2);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.CH = findViewById(R.id.ksad_splash_actionbar_full_screen);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
