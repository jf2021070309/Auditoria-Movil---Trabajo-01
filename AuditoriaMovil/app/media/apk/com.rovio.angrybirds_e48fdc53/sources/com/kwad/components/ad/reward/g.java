package com.kwad.components.ad.reward;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kwad.components.core.webview.jshandler.q;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g extends com.kwad.components.ad.k.b {
    private List<AdTemplate> oR;
    private boolean oS;
    private List<com.kwad.components.core.e.d.c> oT;
    private q.b oU;

    public g(List<AdTemplate> list, JSONObject jSONObject, q.b bVar) {
        super(jSONObject, null);
        this.oS = false;
        this.oT = new ArrayList();
        this.oR = list;
        this.oU = bVar;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (AdTemplate adTemplate : this.oR) {
            this.oT.add(new com.kwad.components.core.e.d.c(adTemplate));
        }
    }

    @Override // com.kwad.components.ad.k.b
    public final void a(FrameLayout frameLayout, AdBaseFrameLayout adBaseFrameLayout, AdTemplate adTemplate, com.kwad.components.core.e.d.c cVar, int i) {
        super.a(frameLayout, adBaseFrameLayout, this.oR, this.oT);
    }

    @Override // com.kwad.components.ad.k.b
    public final void a(com.kwad.components.core.webview.a aVar) {
        super.a(aVar);
        List<AdTemplate> list = this.oR;
        com.kwad.components.core.webview.jshandler.q qVar = new com.kwad.components.core.webview.jshandler.q(new ArrayList(list.subList(1, list.size() - 1)));
        qVar.a(this.oU);
        aVar.a(qVar);
    }

    @Override // com.kwad.components.ad.k.b
    public final void b(com.kwad.sdk.core.webview.b bVar) {
        bVar.setAdTemplateList(this.oR);
    }

    @Override // com.kwad.components.ad.k.b
    public final boolean bv() {
        return this.oS ? this.Hk : super.bv();
    }

    @Override // com.kwad.components.ad.k.b
    public final void fC() {
        super.fC();
        this.cB.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.ad.reward.g.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return motionEvent.getAction() == 2;
            }
        });
    }

    @Override // com.kwad.components.ad.k.b
    public final boolean fD() {
        return false;
    }

    public final void fE() {
        if (this.cG != null) {
            this.cG.rD();
        }
    }

    @Override // com.kwad.components.ad.k.b
    public final void fF() {
        com.kwad.components.ad.reward.monitor.a.a(true, "middle_play_end_card");
    }

    @Override // com.kwad.components.ad.k.b
    public final void fG() {
        com.kwad.components.ad.reward.monitor.a.a(true, "middle_play_end_card", q(this.mAdTemplate));
    }

    @Override // com.kwad.components.ad.k.b
    public final void fH() {
        com.kwad.components.ad.reward.monitor.a.a(true, "middle_play_end_card", q(this.mAdTemplate), System.currentTimeMillis() - getLoadTime());
    }

    @Override // com.kwad.components.ad.k.b
    public final String getName() {
        return "MiddlePlayEndCard";
    }

    @Override // com.kwad.components.ad.k.b
    public final String q(AdTemplate adTemplate) {
        List<AdTemplate> list = this.oR;
        if (list == null || list.size() < 2) {
            return super.q(adTemplate);
        }
        String bd = com.kwad.sdk.core.response.b.b.bd(this.oR.get(1));
        new StringBuilder("getUrl: ").append(bd);
        return bd;
    }

    public final void setShowLandingPage(boolean z) {
        this.oS = z;
    }
}
