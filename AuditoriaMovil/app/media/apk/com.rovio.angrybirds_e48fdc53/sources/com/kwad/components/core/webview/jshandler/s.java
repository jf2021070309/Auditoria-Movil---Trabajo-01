package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s implements com.kwad.sdk.core.webview.c.a {
    private Handler TW = new Handler(Looper.getMainLooper());
    private com.kwad.sdk.core.webview.c.c TX;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;

    public s(com.kwad.sdk.core.webview.d.a.b bVar) {
        this.mWebCardCloseListener = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(WebCloseStatus webCloseStatus) {
        com.kwad.sdk.core.webview.d.a.b bVar = this.mWebCardCloseListener;
        if (bVar != null) {
            bVar.a(webCloseStatus);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.TX = cVar;
        final WebCloseStatus webCloseStatus = new WebCloseStatus();
        try {
            webCloseStatus.parseJson(new JSONObject(str));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.s.1
            @Override // java.lang.Runnable
            public final void run() {
                s.this.c(webCloseStatus);
                if (s.this.TX != null) {
                    s.this.TX.a(null);
                }
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "close";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.mWebCardCloseListener = null;
        this.TX = null;
        this.TW.removeCallbacksAndMessages(null);
    }
}
