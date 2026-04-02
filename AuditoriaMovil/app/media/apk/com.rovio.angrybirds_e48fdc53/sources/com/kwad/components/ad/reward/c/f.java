package com.kwad.components.ad.reward.c;

import com.kwad.sdk.utils.bj;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f implements com.kwad.sdk.core.webview.c.a {
    private d qt;

    public f(d dVar) {
        this.qt = dVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            final b bVar = new b();
            bVar.parseJson(new JSONObject(str));
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.c.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (f.this.qt != null) {
                        f.this.qt.a(bVar);
                    }
                }
            });
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "updateExtraReward";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.qt = null;
    }
}
