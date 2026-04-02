package com.kwad.components.ad.reward.m;

import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.au;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.bc;
/* loaded from: classes.dex */
public class e extends com.kwad.sdk.core.download.a.a implements ad.b, ak.b {
    private KsAdWebView cB;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private com.kwad.sdk.core.webview.d.a.a cH;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private final com.kwad.components.ad.reward.e.j mRewardVerifyListener = new com.kwad.components.ad.reward.e.j() { // from class: com.kwad.components.ad.reward.m.e.1
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (e.this.yM != null) {
                e.this.yM.ah(true);
            }
        }
    };
    private View yL;
    private au yM;
    private f yN;

    public e(KsAdWebView ksAdWebView, View view, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar) {
        this.yL = view;
        this.cB = ksAdWebView;
        this.mApkDownloadHelper = cVar;
        this.cH = aVar;
    }

    private void a(com.kwad.components.core.webview.a aVar, String str) {
        aVar.a(new com.kwad.components.core.webview.jshandler.r(this.cE, this.mApkDownloadHelper, this.cH));
        aVar.a(new x(this.cE));
        aVar.a(new w(this.cE));
        aVar.a(new ak(this, str));
        au auVar = new au();
        this.yM = auVar;
        aVar.a(auVar);
        aVar.a(new ae(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new com.kwad.components.core.webview.b.a.f());
        aVar.a(new ad(this.cE, this));
        aVar.a(new as(this.cE, this.mApkDownloadHelper));
        aVar.a(new com.kwad.components.ad.reward.h.b(this.cB.getContext(), this.mAdTemplate, PlayableSource.ACTIONBAR_CLICK));
    }

    private void ad(boolean z) {
        com.kwad.sdk.core.e.c.d("BottomCardWebViewHelper", "switchWebView: " + z);
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView == null) {
            return;
        }
        ksAdWebView.setVisibility(z ? 0 : 8);
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    private void b(AdTemplate adTemplate, ViewGroup viewGroup) {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(adTemplate);
        this.cE.mScreenOrientation = 0;
        this.cE.aym = null;
        this.cE.MZ = viewGroup;
        this.cE.My = this.cB;
        this.cE.mReportExtData = null;
        this.cE.ayo = true;
    }

    private KsAdWebView.d getWebErrorListener() {
        return new KsAdWebView.d() { // from class: com.kwad.components.ad.reward.m.e.2
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                com.kwad.sdk.core.e.c.d("BottomCardWebViewHelper", "onReceivedHttpError: " + i + ", " + str);
                e.this.ka();
            }
        };
    }

    private void j(String str, int i) {
        f fVar = this.yN;
        if (fVar != null) {
            fVar.h(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        View view = this.yL;
        if (view != null) {
            view.setVisibility(0);
        }
        ad(false);
    }

    private void r(String str) {
        if (bc.isNullString(str)) {
            ka();
            return;
        }
        ay();
        this.cB.setClientConfig(this.cB.getClientConfig().cC(this.mAdTemplate).b(getWebErrorListener()));
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.cB);
        this.cD = aVar;
        a(aVar, str);
        this.cB.addJavascriptInterface(this.cD, "KwaiAd");
        this.cB.loadUrl(str);
    }

    public final void a(f fVar) {
        this.yN = fVar;
    }

    @Override // com.kwad.components.core.webview.jshandler.ad.b
    public final void a(ad.a aVar) {
        com.kwad.sdk.core.e.c.d("BottomCardWebViewHelper", "onAdFrameValid : " + aVar.toJson());
    }

    @Override // com.kwad.components.core.webview.jshandler.ak.b
    public final void a(ak.a aVar) {
        com.kwad.sdk.core.e.c.d("BottomCardWebViewHelper", getClass().getName() + " updatePageStatus: " + aVar);
        if (aVar.status == 1) {
            ad(true);
        } else {
            ka();
        }
    }

    public final void a(AdTemplate adTemplate, ViewGroup viewGroup) {
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView != null) {
            ksAdWebView.setBackgroundColor(0);
            if (this.cB.getBackground() != null) {
                this.cB.getBackground().setAlpha(0);
            }
        }
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.mAdTemplate = adTemplate;
        b(adTemplate, viewGroup);
        r(com.kwad.sdk.core.response.b.b.aZ(this.mAdTemplate));
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public final void jZ() {
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this);
        }
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFailed() {
        AdTemplate adTemplate = this.mAdTemplate;
        j(adTemplate != null ? com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即下载", 100);
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFinished() {
        AdTemplate adTemplate = this.mAdTemplate;
        j(adTemplate == null ? "" : com.kwad.sdk.core.response.b.a.aQ(adTemplate), 100);
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onIdle() {
        AdTemplate adTemplate = this.mAdTemplate;
        j(adTemplate != null ? com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即下载", 100);
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onInstalled() {
        AdTemplate adTemplate = this.mAdTemplate;
        j(adTemplate != null ? com.kwad.sdk.core.response.b.a.U(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即打开", 100);
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int i) {
        j(com.kwad.sdk.core.response.b.a.cw(i), i);
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onProgressUpdate(int i) {
        if (i != 0) {
            j(com.kwad.sdk.core.response.b.a.cv(i), i);
        }
    }
}
