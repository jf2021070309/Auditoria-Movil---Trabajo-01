package com.kwad.components.core.page.b;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ai;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class f extends c {
    private int MY = -1;
    private ViewGroup MZ;
    private WebView My;
    private final a Na;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private AdTemplate mAdTemplate;
    private final boolean mIsRewardLandPage;

    /* loaded from: classes.dex */
    public interface a {
        void ax(int i);
    }

    public f(a aVar, boolean z) {
        this.Na = aVar;
        this.mIsRewardLandPage = z;
    }

    private void a(com.kwad.components.core.webview.a aVar) {
        com.kwad.sdk.core.e.c.d("LandPageWebViewPresenter", "registerWebCardHandler");
        com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.MW.mAdTemplate);
        aVar.a(new x(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new as(this.cE, cVar));
        aVar.a(new w(this.cE));
        aVar.a(new ap());
        aVar.a(new ak(oM(), com.kwad.sdk.core.response.b.b.bl(this.mAdTemplate)));
        aVar.a(new ae(this.cE));
        aVar.a(new ai(getOpenNewPageListener()));
        aVar.a(new u(this.cE, cVar, null));
        aVar.a(new r(this.cE, cVar, null, 2, this.mIsRewardLandPage));
    }

    private void au(String str) {
        ax();
        this.My.loadUrl(str);
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.mAdTemplate);
        this.cE.MZ = this.MZ;
        this.cE.My = this.My;
    }

    private void ax() {
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.My);
        this.cD = aVar;
        a(aVar);
        this.My.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    private ai.a getOpenNewPageListener() {
        return new ai.a() { // from class: com.kwad.components.core.page.b.f.2
            @Override // com.kwad.components.core.webview.jshandler.ai.a
            public final void a(com.kwad.components.core.webview.a.b bVar) {
                AdWebViewActivityProxy.launch(f.this.My.getContext(), new AdWebViewActivityProxy.a.C0206a().as(bVar.title).at(bVar.url).ax(true).V(f.this.mAdTemplate).oE());
            }
        };
    }

    private ak.b oM() {
        return new ak.b() { // from class: com.kwad.components.core.page.b.f.1
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar) {
                f.this.MY = aVar.status;
                if (f.this.Na != null) {
                    f.this.Na.ax(aVar.status);
                }
                if (aVar.status == 1) {
                    f.this.MZ.setVisibility(0);
                } else {
                    f.this.My.setVisibility(8);
                }
            }
        };
    }

    @Override // com.kwad.components.core.page.b.c, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.MW.mAdTemplate;
        this.mAdTemplate = adTemplate;
        String bl = com.kwad.sdk.core.response.b.b.bl(adTemplate);
        if (!TextUtils.isEmpty(bl)) {
            av();
            au(bl);
            return;
        }
        a aVar = this.Na;
        if (aVar != null) {
            aVar.ax(this.MY);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.My = (WebView) findViewById(R.id.ksad_landing_page_webview);
        this.MZ = (ViewGroup) findViewById(R.id.ksad_web_card_container);
        this.My.setBackgroundColor(0);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        ay();
    }
}
