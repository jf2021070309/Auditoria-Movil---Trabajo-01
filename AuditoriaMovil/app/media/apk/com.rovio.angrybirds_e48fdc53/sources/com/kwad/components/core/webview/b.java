package com.kwad.components.core.webview;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.kwad.components.core.e.c.b;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.webview.b.a.f;
import com.kwad.components.core.webview.b.a.j;
import com.kwad.components.core.webview.b.a.k;
import com.kwad.components.core.webview.b.a.l;
import com.kwad.components.core.webview.b.a.s;
import com.kwad.components.core.webview.b.b.g;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ab;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.aj;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.am;
import com.kwad.components.core.webview.jshandler.ao;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.aw;
import com.kwad.components.core.webview.jshandler.h;
import com.kwad.components.core.webview.jshandler.i;
import com.kwad.components.core.webview.jshandler.m;
import com.kwad.components.core.webview.jshandler.n;
import com.kwad.components.core.webview.jshandler.o;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.s;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.download.e;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.v;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private KsAdWebView GX;
    private KsAdWebView.c Ne;
    private ViewGroup Th;
    private com.kwad.components.core.webview.a.a Ti;
    private ao Tj;
    private e Tk;
    private boolean Tl;
    private ak.b Tm = new ak.b() { // from class: com.kwad.components.core.webview.b.12
        @Override // com.kwad.components.core.webview.jshandler.ak.b
        public final void a(ak.a aVar) {
            if (b.this.fH != null) {
                b.this.fH.a(aVar);
            }
        }
    };
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private c fH;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private String mPageUrl;

    /* loaded from: classes.dex */
    public static class a {
        private KsAdWebView GX;
        private KsAdWebView.c Ne;
        private ViewGroup Th;
        private boolean Tl;
        private c fH;
        private AdTemplate mAdTemplate;
        private com.kwad.components.core.e.d.c mApkDownloadHelper;
        private String mPageUrl;
        private JSONObject mReportExtData;

        public final a a(c cVar) {
            this.fH = cVar;
            return this;
        }

        public final a aE(String str) {
            this.mPageUrl = str;
            return this;
        }

        public final a aL(boolean z) {
            this.Tl = z;
            return this;
        }

        public final a aa(AdTemplate adTemplate) {
            this.mAdTemplate = adTemplate;
            return this;
        }

        public final a b(KsAdWebView.c cVar) {
            this.Ne = cVar;
            return this;
        }

        public final a d(KsAdWebView ksAdWebView) {
            this.GX = ksAdWebView;
            return this;
        }

        public final a e(JSONObject jSONObject) {
            this.mReportExtData = jSONObject;
            return this;
        }

        public final a f(com.kwad.components.core.e.d.c cVar) {
            this.mApkDownloadHelper = cVar;
            return this;
        }

        public final AdTemplate getAdTemplate() {
            return this.mAdTemplate;
        }

        public final com.kwad.components.core.e.d.c hk() {
            return this.mApkDownloadHelper;
        }

        public final a k(ViewGroup viewGroup) {
            this.Th = viewGroup;
            return this;
        }

        public final String oB() {
            return this.mPageUrl;
        }

        public final KsAdWebView.c oV() {
            return this.Ne;
        }

        public final ViewGroup rs() {
            return this.Th;
        }

        public final KsAdWebView rt() {
            return this.GX;
        }

        public final c ru() {
            return this.fH;
        }

        public final boolean rv() {
            return this.Tl;
        }
    }

    private static void a(c cVar, WebView webView) {
        if (cVar == null || !cVar.pa()) {
            return;
        }
        webView.getSettings().setAllowFileAccess(true);
    }

    private void a(ap apVar) {
        c cVar = this.fH;
        if (cVar == null) {
            return;
        }
        cVar.a(apVar);
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.mAdTemplate);
        this.cE.mScreenOrientation = 0;
        this.cE.My = this.GX;
        this.cE.MZ = this.Th;
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
        com.kwad.components.core.webview.a.a aVar2 = this.Ti;
        if (aVar2 != null) {
            aVar2.destroy();
            this.Ti = null;
        }
    }

    private void b(com.kwad.components.core.webview.a aVar, com.kwad.sdk.core.webview.b bVar) {
        ap apVar = new ap();
        aVar.a(apVar);
        a(apVar);
        aVar.a(new n());
        aVar.a(new com.kwad.components.core.webview.jshandler.a());
        aVar.a(new o());
        aVar.a(new ae(bVar));
        aVar.a(new x(bVar));
        aVar.a(new f());
        if (this.mApkDownloadHelper == null) {
            this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        }
        if (!this.Tl) {
            aVar.a(new u(this.cE, this.mApkDownloadHelper, getClickListener(), rl(), false));
            aVar.a(new r(this.cE, this.mApkDownloadHelper, getClickListener(), rl(), 0, rm()));
        }
        aVar.a(new as(this.cE, this.mApkDownloadHelper));
        aVar.a(new am(this.cE));
        aVar.a(new aj(this.cE.My.getContext(), this.mAdTemplate));
        aVar.a(new aw(new aw.a() { // from class: com.kwad.components.core.webview.b.1
            @Override // com.kwad.components.core.webview.jshandler.aw.a
            public final void rr() {
                if (com.kwad.sdk.core.response.b.b.bL(b.this.mAdTemplate)) {
                    com.kwad.components.core.e.c.b.a(b.this.cE.My.getContext(), new b.a().R(b.this.mAdTemplate).am(com.kwad.sdk.core.response.b.b.bK(b.this.mAdTemplate)).ng());
                }
            }
        }));
        aVar.a(new ab(this.cE));
        aVar.a(new ak(this.Tm, this.mPageUrl));
        ao aoVar = new ao();
        this.Tj = aoVar;
        aVar.a(aoVar);
        aVar.a(new s(new com.kwad.sdk.core.webview.d.a.b() { // from class: com.kwad.components.core.webview.b.5
            @Override // com.kwad.sdk.core.webview.d.a.b
            public final void a(WebCloseStatus webCloseStatus) {
                if (b.this.fH != null) {
                    b.this.fH.b(webCloseStatus);
                }
            }
        }));
        com.kwad.components.core.webview.b.a.s sVar = new com.kwad.components.core.webview.b.a.s();
        sVar.a(new s.a() { // from class: com.kwad.components.core.webview.b.6
            @Override // com.kwad.components.core.webview.b.a.s.a
            public final void a(com.kwad.components.core.webview.b.b.s sVar2) {
                if (TextUtils.isEmpty(sVar2.message)) {
                    return;
                }
                v.d(b.this.cE.My.getContext(), sVar2.message, 0L);
            }
        });
        aVar.a(sVar);
        aVar.a(new k());
        aVar.a(new aa(bVar));
        if (com.kwad.sdk.core.response.b.a.ax(d.ck(this.mAdTemplate))) {
            final l lVar = new l();
            aVar.a(lVar);
            this.Tk = new e(this.mAdTemplate) { // from class: com.kwad.components.core.webview.b.7
                @Override // com.kwad.sdk.core.download.e, com.kwad.sdk.core.download.d
                public final void a(String str, int i, com.kwad.sdk.core.download.f fVar) {
                    super.a(str, i, fVar);
                    com.kwad.components.core.webview.b.b.b bVar2 = new com.kwad.components.core.webview.b.b.b();
                    bVar2.WX = 1;
                    lVar.a(bVar2);
                }
            };
            com.kwad.sdk.core.download.c.Av().a(this.Tk, this.mAdTemplate);
        }
        aVar.a(new com.kwad.components.core.webview.b.a.d() { // from class: com.kwad.components.core.webview.b.8
            @Override // com.kwad.components.core.webview.b.a.d
            public final void a(g gVar) {
                super.a(gVar);
                com.kwad.components.core.p.a.pC().a(gVar.UR, b.this.mAdTemplate, gVar.US);
            }
        });
        aVar.a(new j() { // from class: com.kwad.components.core.webview.b.9
            @Override // com.kwad.components.core.webview.b.a.j
            public final void a(com.kwad.components.core.webview.b.b.n nVar) {
                super.a(nVar);
                AdWebViewActivityProxy.launch(b.this.cE.My.getContext(), new AdWebViewActivityProxy.a.C0206a().as(nVar.title).at(nVar.url).ax(true).V(b.this.mAdTemplate).oE());
            }
        });
        aVar.a(new com.kwad.components.core.webview.jshandler.c());
        aVar.a(new com.kwad.components.core.webview.jshandler.e());
        aVar.a(new h());
        aVar.a(new com.kwad.components.core.webview.jshandler.b());
        w wVar = new w(this.cE);
        wVar.a(new w.b() { // from class: com.kwad.components.core.webview.b.10
            @Override // com.kwad.components.core.webview.jshandler.w.b
            public final void c(w.a aVar2) {
                if (b.this.fH != null) {
                    b.this.fH.a(aVar2);
                }
            }
        });
        aVar.a(wVar);
        aVar.a(new i(this.cE.My.getContext(), this.mAdTemplate));
        aVar.a(new ad(this.cE, new ad.b() { // from class: com.kwad.components.core.webview.b.11
            @Override // com.kwad.components.core.webview.jshandler.ad.b
            public final void a(ad.a aVar2) {
                if (b.this.fH != null) {
                    b.this.fH.a(aVar2);
                }
            }
        }));
        aVar.a(new com.kwad.components.core.webview.jshandler.g());
        aVar.a(new m());
        aVar.a(new com.kwad.components.core.webview.jshandler.l());
        aVar.a(new com.kwad.components.core.webview.jshandler.k());
    }

    private void b(KsAdWebView ksAdWebView) {
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(ksAdWebView);
        this.cD = aVar;
        b(aVar, this.cE);
        c cVar = this.fH;
        if (cVar != null) {
            cVar.a(this.cD, this.cE);
        }
        ksAdWebView.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void c(KsAdWebView ksAdWebView) {
        ay();
        com.kwad.components.core.webview.a.a aVar = new com.kwad.components.core.webview.a.a(ksAdWebView, this.cE);
        this.Ti = aVar;
        ksAdWebView.addJavascriptInterface(aVar, "KwaiAdForThird");
    }

    private void eM() {
        this.GX.setClientConfig(this.GX.getClientConfig().cC(this.mAdTemplate).b(ro()).b(rp()).a(rn()).c(this.Ne));
    }

    private com.kwad.sdk.core.webview.d.a.a getClickListener() {
        return new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.core.webview.b.2
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (b.this.fH != null) {
                    b.this.fH.a(aVar);
                }
            }
        };
    }

    private boolean rl() {
        c cVar = this.fH;
        if (cVar == null) {
            return false;
        }
        return cVar.pb();
    }

    private boolean rm() {
        c cVar = this.fH;
        return false;
    }

    private KsAdWebView.b rn() {
        return new KsAdWebView.b() { // from class: com.kwad.components.core.webview.b.3
            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onFailed() {
                if (b.this.Tj != null) {
                    b.this.Tj.onFailed();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onSuccess() {
                if (b.this.Tj != null) {
                    b.this.Tj.onSuccess();
                }
            }
        };
    }

    private z.b ro() {
        z.b bVar = new z.b();
        bVar.atp = 0;
        bVar.atB = rq();
        return bVar;
    }

    private KsAdWebView.d rp() {
        return new KsAdWebView.d() { // from class: com.kwad.components.core.webview.b.4
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                if (b.this.fH != null) {
                    b.this.fH.onPageFinished();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                if (b.this.fH != null) {
                    b.this.fH.by();
                }
            }
        };
    }

    private int rq() {
        return com.kwad.sdk.core.response.b.a.N(d.ck(this.mAdTemplate)) ? 5 : 1;
    }

    public final void a(a aVar) {
        this.mPageUrl = aVar.oB();
        this.mAdTemplate = aVar.getAdTemplate();
        this.Th = aVar.rs();
        this.GX = aVar.rt();
        this.fH = aVar.ru();
        this.mApkDownloadHelper = aVar.hk();
        this.Tl = aVar.rv();
        this.Ne = aVar.oV();
        eM();
        a(this.fH, this.GX);
        av();
        if (com.kwad.sdk.core.response.b.a.J(d.ck(this.mAdTemplate))) {
            c(this.GX);
        } else if (com.kwad.sdk.core.response.b.b.dD(this.mPageUrl)) {
            b(this.GX);
        }
    }

    public final void jx() {
        ay();
        if (this.Tk != null) {
            com.kwad.sdk.core.download.c.Av().a(this.Tk);
        }
    }
}
