package com.kwad.components.ad.interstitial.d.a;

import com.kwad.components.core.webview.b.a.i;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.widget.e;
/* loaded from: classes.dex */
public abstract class a extends com.kwad.components.ad.interstitial.d.b implements i {
    private h lt;

    @Override // com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
        m mVar = new m();
        mVar.Xg = !this.jh.dJ.isVideoSoundEnable();
        oVar.c(mVar);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void a(t tVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        lVar.c(new com.kwad.components.core.webview.b.a.i(new i.a() { // from class: com.kwad.components.ad.interstitial.d.a.a.1
            @Override // com.kwad.components.core.webview.b.a.i.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                a.this.a(aVar);
            }
        }));
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        this.jh.jk = true;
        this.jh.hB.onAdClicked();
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        this.lt.a(getActivity(), this.jh.mAdTemplate, this);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void b(ap apVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void b(WebCloseStatus webCloseStatus) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public e getTouchCoordsView() {
        return this.jh.jq;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onCreate() {
        super.onCreate();
        this.lt = new h(-1L, getContext());
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
        super.onUnbind();
        this.lt.jx();
    }
}
