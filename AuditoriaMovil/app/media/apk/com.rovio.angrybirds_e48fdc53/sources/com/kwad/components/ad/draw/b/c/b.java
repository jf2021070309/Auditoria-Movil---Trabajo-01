package com.kwad.components.ad.draw.b.c;

import android.widget.FrameLayout;
import com.kwad.components.ad.k.b;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.draw.a.a {
    private com.kwad.components.ad.k.b bY;
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.draw.b.c.b.1
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            if (b.this.bE.bD != null) {
                b.this.bE.bD.onAdClicked();
            }
        }
    };
    private FrameLayout cQ;

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.components.ad.k.b bVar = this.bE.bY;
        this.bY = bVar;
        if (bVar == null) {
            return;
        }
        bVar.a(this.cH);
        this.bY.a(this.cQ, this.bE.mRootContainer, this.bE.mAdTemplate, this.bE.mApkDownloadHelper);
        this.bY.a((b.InterfaceC0162b) null);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cQ = (FrameLayout) findViewById(R.id.ksad_play_end_web_card_container);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.k.b bVar = this.bY;
        if (bVar != null) {
            bVar.lM();
        }
    }
}
