package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q implements com.kwad.sdk.core.webview.c.a {
    private List<AdTemplate> TN;
    private com.kwad.sdk.core.webview.b cE;
    private b oU;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public long creativeId = -1;
        public int adStyle = -1;
    }

    /* loaded from: classes.dex */
    public interface b {
        void A(AdTemplate adTemplate);
    }

    public q(com.kwad.sdk.core.webview.b bVar) {
        this.cE = bVar;
    }

    public q(List<AdTemplate> list) {
        this.TN = list;
    }

    private List<AdTemplate> rx() {
        List<AdTemplate> list = this.TN;
        if (list != null) {
            return list;
        }
        com.kwad.sdk.core.webview.b bVar = this.cE;
        if (bVar != null) {
            return bVar.DW();
        }
        return null;
    }

    public final void a(b bVar) {
        this.oU = bVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            a aVar = new a();
            aVar.parseJson(new JSONObject(str));
            AdTemplate a2 = com.kwad.sdk.core.response.b.d.a(rx(), aVar.creativeId, aVar.adStyle);
            b bVar = this.oU;
            if (bVar != null) {
                bVar.A(a2);
            }
        } catch (JSONException e) {
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "adImpression";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
