package com.kwad.components.ad.interstitial.f;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.ad.interstitial.d.i;
import com.kwad.components.ad.interstitial.d.k;
import com.kwad.components.ad.interstitial.f.f;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class e extends a {
    private KsAdVideoPlayConfig dJ;
    private com.kwad.components.core.webview.b.e.e gv;
    protected KsInterstitialAd.AdInteractionListener hB;
    private com.kwad.components.ad.interstitial.d hI;
    protected com.kwad.components.ad.interstitial.d.c jh;
    private boolean jm;
    private c.a jn;
    private int jw;
    protected com.kwad.components.ad.interstitial.d.b lL;
    private boolean lM;
    protected ViewGroup lN;
    protected AdInfo mAdInfo;
    protected AdTemplate mAdTemplate;

    public e(Context context) {
        this(context, null);
    }

    private e(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.jw = -1;
        this.gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.interstitial.f.e.1
            @Override // com.kwad.components.core.webview.b.e.b
            public final void q(String str) {
                if (j.b("ksad-interstitial-card", e.this.mAdTemplate).equals(str)) {
                    e.a(e.this, false);
                    if (e.this.lL != null) {
                        e.this.lL.lM();
                    }
                    e eVar = e.this;
                    eVar.lL = eVar.et();
                    e.this.lL.F(e.this.lN);
                    e.this.lL.k(e.this.jh);
                }
            }
        };
        this.lN = (ViewGroup) l.inflate(context, getLayoutId(), this);
    }

    private f a(Context context, AdInfo adInfo, com.kwad.components.ad.interstitial.d.c cVar) {
        boolean a = com.kwad.components.ad.interstitial.d.c.a(this.mContext, adInfo);
        f.a aVar = new f.a();
        aVar.v(a);
        boolean z = true;
        aVar.w(!cVar.M(context) && com.kwad.components.ad.interstitial.a.b.cC());
        aVar.E(com.kwad.components.ad.interstitial.a.b.cD());
        if (com.kwad.sdk.core.response.b.a.aO(adInfo) && ai.IK()) {
            z = false;
        }
        aVar.x(z);
        return new f(context, aVar);
    }

    static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.lM = false;
        return false;
    }

    private com.kwad.components.ad.interstitial.d.c es() {
        com.kwad.components.ad.interstitial.d.c cVar = new com.kwad.components.ad.interstitial.d.c();
        cVar.mAdTemplate = this.mAdTemplate;
        cVar.hB = this.hB;
        cVar.hI = this.hI;
        cVar.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        cVar.dJ = this.dJ;
        cVar.ex = new com.kwad.sdk.core.video.videoview.a(this.mContext);
        cVar.jq = (KSFrameLayout) this.lN.findViewById(R.id.ksad_container);
        cVar.hz = new com.kwad.components.ad.interstitial.e.b(cVar.jq, 100);
        cVar.hz.sB();
        cVar.jw = this.jw;
        cVar.jm = this.jm;
        cVar.jn = this.jn;
        cVar.gv = this.gv;
        cVar.ji = a(this.mContext, com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate), cVar);
        return cVar;
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void a(AdTemplate adTemplate, com.kwad.components.ad.interstitial.d dVar, KsAdVideoPlayConfig ksAdVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        adTemplate.realShowType = 2;
        this.dJ = ksAdVideoPlayConfig;
        this.hI = dVar;
        this.lM = com.kwad.sdk.core.response.b.b.bE(this.mAdTemplate);
        this.hB = adInteractionListener;
        this.jh = es();
        if (this.lL == null) {
            this.lL = et();
        }
        this.lL.F(this.lN);
        this.lL.k(this.jh);
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void co() {
        com.kwad.components.ad.interstitial.d.b bVar = this.lL;
        if (bVar != null) {
            bVar.cO();
        }
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void cp() {
        com.kwad.components.ad.interstitial.d.b bVar = this.lL;
        if (bVar != null) {
            bVar.cP();
        }
    }

    public final com.kwad.components.ad.interstitial.d.b et() {
        Presenter gVar;
        com.kwad.components.ad.interstitial.d.b bVar = new com.kwad.components.ad.interstitial.d.b();
        if (!this.lM) {
            bVar.a(new com.kwad.components.ad.interstitial.d.d());
            if (com.kwad.sdk.core.response.b.a.aU(this.mAdInfo)) {
                bVar.a(new com.kwad.components.ad.interstitial.d.j());
            }
            bVar.a(new k());
            bVar.a(new com.kwad.components.ad.interstitial.d.f());
            if (com.kwad.sdk.core.response.b.a.aH(this.mAdInfo)) {
                bVar.a(new com.kwad.components.ad.interstitial.d.a());
            }
            if (this.jh.M(getContext())) {
                gVar = new com.kwad.components.ad.interstitial.d.g();
            }
            bVar.a(new i());
            return bVar;
        }
        gVar = new com.kwad.components.ad.interstitial.d.a.b();
        bVar.a(gVar);
        bVar.a(new i());
        return bVar;
    }

    protected final int getLayoutId() {
        return R.layout.ksad_interstitial_vertical;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            cVar.release();
        }
        com.kwad.components.ad.interstitial.d.b bVar = this.lL;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    public final void setAdConvertListener(c.a aVar) {
        this.jn = aVar;
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            cVar.jn = aVar;
        }
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void setAdInteractionListener(KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.hB = adInteractionListener;
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            cVar.hB = adInteractionListener;
        }
    }

    public final void setAggregateAdView(boolean z) {
        this.jm = z;
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            cVar.jm = z;
        }
    }

    public final void setAggregateShowTriggerType(int i) {
        this.jw = i;
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            cVar.jw = i;
        }
    }
}
