package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class aw implements com.kwad.sdk.core.webview.c.a {
    private a VE;

    /* loaded from: classes.dex */
    public interface a {
        void rr();
    }

    public aw(a aVar) {
        this.VE = aVar;
    }

    private void rI() {
        if (com.kwad.components.core.e.c.b.nd()) {
            return;
        }
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.aw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (aw.this.VE != null) {
                    aw.this.VE.rr();
                }
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        rI();
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showDownloadTips";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
