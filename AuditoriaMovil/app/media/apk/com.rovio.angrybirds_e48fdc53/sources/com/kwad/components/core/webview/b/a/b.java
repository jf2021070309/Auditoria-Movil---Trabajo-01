package com.kwad.components.core.webview.b.a;

import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    protected final com.kwad.sdk.core.webview.b TO;
    private AdTemplate mAdTemplate;

    public b(com.kwad.sdk.core.webview.b bVar, AdTemplate adTemplate) {
        this.TO = bVar;
        this.mAdTemplate = adTemplate;
    }

    private void ac(AdTemplate adTemplate) {
        adTemplate.mIsForceJumpLandingPage = true;
        com.kwad.components.core.e.d.a.a(new a.C0197a(this.TO.MZ.getContext()).S(adTemplate).ao(1).an(false));
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("adTemplate")) {
                String string = jSONObject.getString("adTemplate");
                AdTemplate adTemplate = new AdTemplate();
                adTemplate.parseJson(new JSONObject(string));
                ac(adTemplate);
            } else {
                ac(this.mAdTemplate);
            }
            cVar.a(null);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "activityMiddlePageConvert";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
