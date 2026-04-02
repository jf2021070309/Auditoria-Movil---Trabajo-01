package com.kwad.components.core.e.c;

import android.view.View;
import com.kwad.components.core.e.c.b;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.v;
import com.kwad.sdk.utils.w;
/* loaded from: classes.dex */
public final class e extends c implements View.OnClickListener {
    private Runnable JF;
    public b Jw;
    public b.C0196b Jx;
    private KsAdWebView cB;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private ap cG;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private boolean JG = false;
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.core.e.c.e.1
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            com.kwad.sdk.core.e.c.d("DownloadTipsDialogWebCardPresenter", "onAdClicked convertBridgeClicked: " + e.this.JG);
            e.a(e.this, true);
        }
    };
    private ad.b cI = new ad.b() { // from class: com.kwad.components.core.e.c.e.4
        @Override // com.kwad.components.core.webview.jshandler.ad.b
        public final void a(ad.a aVar) {
            com.kwad.sdk.core.e.c.d("DownloadTipsDialogWebCardPresenter", "onAdFrameValid=" + aVar);
            e.this.cB.setTranslationY((float) (aVar.height + aVar.bottomMargin));
        }
    };
    private ac.b cJ = new ac.b() { // from class: com.kwad.components.core.e.c.e.5
        @Override // com.kwad.components.core.webview.jshandler.ac.b
        public final void a(ac.a aVar) {
            com.kwad.sdk.core.e.c.d("DownloadTipsDialogWebCardPresenter", "handleWebCardHide");
            e.this.aD();
        }
    };
    private ak.b cK = new ak.b() { // from class: com.kwad.components.core.e.c.e.6
        @Override // com.kwad.components.core.webview.jshandler.ak.b
        public final void a(ak.a aVar) {
            com.kwad.sdk.core.e.c.i("DownloadTipsDialogWebCardPresenter", "updatePageStatus mPageState: " + aVar);
            if (aVar.status == 1) {
                e.this.nj();
                return;
            }
            e.this.aD();
            if (e.this.getContext() != null) {
                v.L(e.this.getContext(), w.bZ(e.this.getContext()));
            }
        }
    };

    private void a(com.kwad.components.core.webview.a aVar) {
        aVar.a(new u(this.cE, this.mApkDownloadHelper, this.cH, false, true));
        aVar.a(new r(this.cE, this.mApkDownloadHelper, this.cH, 1));
        aVar.a(new x(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new com.kwad.components.core.webview.jshandler.w(this.cE));
        aVar.a(new ad(this.cE, this.cI));
        aVar.a(new ak(this.cK, this.Jx.url));
        ap apVar = new ap();
        this.cG = apVar;
        aVar.a(apVar);
        aVar.a(new as(this.cE, this.mApkDownloadHelper, new com.kwad.sdk.core.download.a.c() { // from class: com.kwad.components.core.e.c.e.3
            @Override // com.kwad.sdk.core.download.a.c, com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                super.onInstalled();
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(e.this.mAdTemplate);
                String aq = com.kwad.sdk.core.response.b.a.aq(ck);
                if (com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.sdk.core.response.b.a.ax(ck) && com.kwad.sdk.utils.ak.ak(e.this.getContext(), aq) && com.kwad.components.core.r.a.pU().pY() && com.kwad.sdk.core.response.b.a.aF(ck) == 1) {
                    e.this.Jw.dismiss();
                }
            }
        }));
        aVar.a(new ac(this.cJ));
        aVar.a(new ae(this.cE));
    }

    static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.JG = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aD() {
        com.kwad.sdk.core.e.c.d("DownloadTipsDialogWebCardPresenter", "hideWithOutAnimation  convertBridgeClicked: " + this.JG);
        if (this.cB.getVisibility() != 0) {
            return;
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rE();
        }
        this.cB.setVisibility(4);
        ap apVar2 = this.cG;
        if (apVar2 != null) {
            apVar2.rF();
        }
        if (this.JG) {
            com.kwad.sdk.core.report.a.aH(this.mAdTemplate);
        }
        b bVar = this.Jw;
        if (bVar == null || !bVar.isShowing()) {
            return;
        }
        this.Jw.ak(this.JG);
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.Jy.mAdTemplate);
        this.cE.aym = this.Jy.mRootContainer;
        this.cE.MZ = this.Jy.mRootContainer;
        this.cE.My = this.cB;
    }

    private void ax() {
        com.kwad.sdk.core.e.c.d("DownloadTipsDialogWebCardPresenter", "setupJsBridge");
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.cB);
        this.cD = aVar;
        a(aVar);
        this.cB.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    private void nh() {
        ax();
        this.cB.loadUrl(this.Jx.url);
        this.cB.postDelayed(ni(), 1500L);
        this.cB.setBackgroundColor(0);
        this.cB.getBackground().setAlpha(0);
        this.cB.setVisibility(0);
    }

    private Runnable ni() {
        if (this.JF == null) {
            this.JF = new Runnable() { // from class: com.kwad.components.core.e.c.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.aD();
                    if (e.this.getContext() != null) {
                        v.L(e.this.getContext(), w.bZ(e.this.getContext()));
                    }
                }
            };
        }
        return this.JF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nj() {
        Runnable runnable = this.JF;
        if (runnable != null) {
            this.cB.removeCallbacks(runnable);
        }
    }

    private void release() {
        this.cB.setVisibility(8);
        this.cB.release();
        ay();
    }

    @Override // com.kwad.components.core.e.c.c, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Jw = this.Jy.Jw;
        this.Jx = this.Jy.Jx;
        this.mAdTemplate = this.Jy.mAdTemplate;
        this.Jy.mRootContainer.setOnClickListener(this);
        this.mApkDownloadHelper = this.Jy.mApkDownloadHelper;
        av();
        nh();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.kwad.sdk.core.report.a.aH(this.mAdTemplate);
        b bVar = this.Jw;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cB = (KsAdWebView) findViewById(R.id.ksad_download_tips_web_card_webView);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        release();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        nj();
    }
}
