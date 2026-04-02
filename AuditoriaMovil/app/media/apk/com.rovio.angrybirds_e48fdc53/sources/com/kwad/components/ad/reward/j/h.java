package com.kwad.components.ad.reward.j;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h implements com.kwad.sdk.core.webview.c.a {
    private a xE;

    /* loaded from: classes.dex */
    public interface a {
        void Q(int i);
    }

    public h(a aVar) {
        this.xE = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.xE != null) {
            int i = 0;
            try {
                i = new JSONObject(str).optInt("severCheckResult");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.xE.Q(i);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "hasReward";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xE = null;
    }
}
