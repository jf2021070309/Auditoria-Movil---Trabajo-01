package com.kwad.components.ad.reward.j;

import android.content.Context;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s implements com.kwad.sdk.core.webview.c.a {
    private AdTemplate mAdTemplate;
    private Context mContext;
    private com.kwad.components.ad.reward.j xK;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean xL;
    }

    public s(Context context, com.kwad.components.ad.reward.j jVar) {
        this.mContext = context;
        this.mAdTemplate = jVar.mAdTemplate;
        this.xK = jVar;
    }

    private void a(a aVar) {
        if (aVar.xL) {
            com.kwad.components.ad.reward.presenter.e.s(this.xK);
        } else {
            AdWebViewActivityProxy.launch(this.mContext, this.mAdTemplate);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            aVar.parseJson(jSONObject);
            a(aVar);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showLandingPage";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xK = null;
        this.mContext = null;
        this.mAdTemplate = null;
    }
}
