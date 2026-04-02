package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.utils.bj;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class p implements com.kwad.sdk.core.webview.c.a {
    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.kwad.components.core.webview.b.b.x xVar) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        final com.kwad.components.core.webview.b.b.x xVar = new com.kwad.components.core.webview.b.b.x();
        try {
            xVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.p.1
            @Override // java.lang.Runnable
            public final void run() {
                if (xVar.rX()) {
                    p.this.a(xVar);
                } else if (xVar.rZ()) {
                    p.this.b(xVar);
                } else if (xVar.rY()) {
                    p.this.c(xVar);
                } else if (xVar.isFailed()) {
                    p.this.d(xVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(com.kwad.components.core.webview.b.b.x xVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(com.kwad.components.core.webview.b.b.x xVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(com.kwad.components.core.webview.b.b.x xVar) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "updateVideoPlayStatus";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
