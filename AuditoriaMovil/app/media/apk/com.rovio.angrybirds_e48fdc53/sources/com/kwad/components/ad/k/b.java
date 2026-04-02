package com.kwad.components.ad.k;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.webview.b;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ag;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.au;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    protected View Hj;
    private String Hl;
    private a Hm;
    private InterfaceC0162b Hn;
    protected KsAdWebView cB;
    protected com.kwad.sdk.core.webview.b cE;
    protected ap cG;
    private com.kwad.sdk.core.webview.d.a.a cH;
    private FrameLayout cQ;
    private AdBaseFrameLayout dr;
    private com.kwad.components.core.webview.b fG;
    protected AdTemplate mAdTemplate;
    private JSONObject mReportExtData;
    private au yM;
    private List<AdTemplate> Hh = new ArrayList();
    private List<c> Hi = new ArrayList();
    private int cF = -1;
    protected boolean Hk = false;
    private com.kwad.components.core.webview.c fH = new com.kwad.components.core.webview.c() { // from class: com.kwad.components.ad.k.b.1
        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.a aVar, com.kwad.sdk.core.webview.b bVar) {
            b.this.b(bVar);
            b.this.a(aVar);
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ak.a aVar) {
            b.this.cF = aVar.status;
            com.kwad.sdk.core.e.c.i("PlayEndWebCard", b.this.getName() + "updatePageStatus mPageState: " + aVar + "，targetUrl: " + b.this.Hl);
            if (aVar.isSuccess() && b.this.Hn != null) {
                b.this.Hn.hT();
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ap apVar) {
            b.this.cG = apVar;
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            if (b.this.cH != null) {
                b.this.cH.a(aVar);
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void b(WebCloseStatus webCloseStatus) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.k.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.Hm != null) {
                        b.this.Hm.iI();
                    }
                }
            });
        }

        @Override // com.kwad.components.core.webview.c
        public final void by() {
            b.this.Hk = false;
        }

        @Override // com.kwad.components.core.webview.c
        public final void onPageFinished() {
            b.this.Hk = true;
            b.this.fH();
        }
    };
    private ac.b cJ = new ac.b() { // from class: com.kwad.components.ad.k.b.2
        @Override // com.kwad.components.core.webview.jshandler.ac.b
        public final void a(ac.a aVar) {
            b.this.lZ();
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void iI();
    }

    /* renamed from: com.kwad.components.ad.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0162b {
        void hT();
    }

    public b() {
    }

    public b(JSONObject jSONObject, String str) {
        this.mReportExtData = jSONObject;
        this.Hl = str;
    }

    private void aF() {
        int i = this.cF;
        String str = i == -1 ? "timeout" : i != 1 ? "h5error" : "others";
        com.kwad.sdk.core.e.c.w("PlayEndWebCard", "show webCard fail, reason: " + str);
    }

    private static int getLayoutId() {
        return R.layout.ksad_ad_web_card_layout;
    }

    public final void a(FrameLayout frameLayout, AdBaseFrameLayout adBaseFrameLayout, AdTemplate adTemplate, c cVar) {
        a(frameLayout, adBaseFrameLayout, adTemplate, cVar, 0);
    }

    @Deprecated
    public void a(FrameLayout frameLayout, AdBaseFrameLayout adBaseFrameLayout, AdTemplate adTemplate, c cVar, int i) {
        this.Hi.add(cVar);
        this.dr = adBaseFrameLayout;
        this.cQ = frameLayout;
        this.mAdTemplate = adTemplate;
        fC();
    }

    public final void a(FrameLayout frameLayout, AdBaseFrameLayout adBaseFrameLayout, List<AdTemplate> list, List<c> list2) {
        this.Hi = list2;
        this.dr = adBaseFrameLayout;
        this.cQ = frameLayout;
        if (list != null && list.size() > 0) {
            this.Hh = list;
            this.mAdTemplate = list.get(0);
        }
        fC();
    }

    public final void a(a aVar) {
        this.Hm = aVar;
    }

    public final void a(InterfaceC0162b interfaceC0162b) {
        this.Hn = interfaceC0162b;
        this.cQ.setVisibility(4);
        this.cF = -1;
        String q = q(this.mAdTemplate);
        com.kwad.sdk.core.e.c.d("PlayEndWebCard", "startPreloadWebView url : " + q);
        if (TextUtils.isEmpty(q) || this.cB == null) {
            return;
        }
        fG();
        this.cB.loadUrl(q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.kwad.components.core.webview.a aVar) {
        if (this.Hi.size() > 1 && this.Hh.size() > 1) {
            aVar.a(new u(this.cE, this.Hi.get(0), this.cH));
            aVar.a(new r(this.cE, this.Hi, this.cH));
            aVar.a(new ag(this.Hh, this.Hi));
        }
        au auVar = new au();
        this.yM = auVar;
        aVar.a(auVar);
        aVar.a(new ac(this.cJ));
    }

    public final void a(com.kwad.sdk.core.webview.d.a.a aVar) {
        this.cH = aVar;
    }

    public final void ah(boolean z) {
        this.yM.ah(true);
    }

    public final boolean ap() {
        if (!bv()) {
            FrameLayout frameLayout = this.cQ;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
            aF();
            return false;
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rC();
        }
        FrameLayout frameLayout2 = this.cQ;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (this.cG == null || !fD()) {
            return true;
        }
        this.cG.rD();
        return true;
    }

    protected void b(com.kwad.sdk.core.webview.b bVar) {
        bVar.setAdTemplate(this.mAdTemplate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean bv() {
        return this.cF == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fC() {
        this.cQ.removeAllViews();
        this.cQ.setVisibility(4);
        this.Hj = l.inflate(this.cQ.getContext(), getLayoutId(), this.cQ);
        KsAdWebView ksAdWebView = (KsAdWebView) this.cQ.findViewById(R.id.ksad_web_card_webView);
        this.cB = ksAdWebView;
        if (ksAdWebView != null) {
            boolean z = false;
            ksAdWebView.setBackgroundColor(0);
            this.cB.getBackground().setAlpha(0);
            this.fG = new com.kwad.components.core.webview.b();
            b.a f = new b.a().aa(this.mAdTemplate).aE(q(this.mAdTemplate)).d(this.cB).e(this.mReportExtData).k(this.dr).f(this.Hi.get(0));
            if (this.Hi.size() > 1 && this.Hh.size() > 1) {
                z = true;
            }
            this.fG.a(f.aL(z).a(this.fH));
            this.cB.loadUrl(q(this.mAdTemplate));
            fF();
        }
    }

    protected boolean fD() {
        return true;
    }

    protected void fF() {
    }

    protected void fG() {
    }

    protected void fH() {
    }

    public final long getLoadTime() {
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView != null) {
            return ksAdWebView.getLoadTime();
        }
        return -1L;
    }

    protected String getName() {
        return "PlayEndWebCard";
    }

    public final void lM() {
        com.kwad.components.core.webview.b bVar = this.fG;
        if (bVar != null) {
            bVar.jx();
        }
    }

    public final void lZ() {
        if (bm.a(this.cB, 50, false)) {
            ap apVar = this.cG;
            if (apVar != null) {
                apVar.rE();
            }
            this.cQ.setVisibility(4);
            ap apVar2 = this.cG;
            if (apVar2 != null) {
                apVar2.rF();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String q(AdTemplate adTemplate) {
        String str = this.Hl;
        return str == null ? com.kwad.sdk.core.response.b.b.bn(this.mAdTemplate) : str;
    }

    public final void release() {
        this.Hn = null;
    }
}
