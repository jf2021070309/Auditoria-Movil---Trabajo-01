package com.kwad.components.core.page.b;

import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public final class b extends Presenter {
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private ak.b cK = new ak.b() { // from class: com.kwad.components.core.page.b.b.1
        @Override // com.kwad.components.core.webview.jshandler.ak.b
        public final void a(ak.a aVar) {
        }
    };
    private AdTemplate mAdTemplate;
    private KsAdWebView mAdWebView;

    private void a(com.kwad.components.core.webview.a aVar) {
        aVar.a(new x(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new ak(this.cK, com.kwad.sdk.core.response.b.a.aK(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))));
        aVar.a(new ae(this.cE));
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.mAdTemplate);
        this.cE.mScreenOrientation = 0;
        this.cE.My = this.mAdWebView;
    }

    private void ax() {
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.mAdWebView);
        this.cD = aVar;
        a(aVar);
        this.mAdWebView.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mAdTemplate = ((com.kwad.components.core.page.recycle.e) Gh()).adTemplate;
        KsAdWebView ksAdWebView = (KsAdWebView) getRootView().findViewById(R.id.ksad_video_webView);
        this.mAdWebView = ksAdWebView;
        this.mAdWebView.setClientConfig(ksAdWebView.getClientConfig().bm(true).cC(this.mAdTemplate));
        av();
        ax();
        this.mAdWebView.loadUrl(com.kwad.sdk.core.response.b.a.aK(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)));
        this.mAdWebView.onActivityCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        ay();
        KsAdWebView ksAdWebView = this.mAdWebView;
        if (ksAdWebView != null) {
            ksAdWebView.onActivityDestroy();
            this.mAdWebView = null;
        }
    }
}
