package com.kwad.components.core.webview.b;

import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public class f implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c nE;

    @Override // com.kwad.sdk.core.webview.c.a
    public void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.nE = cVar;
    }

    public final void b(final com.kwad.sdk.core.response.a.a aVar) {
        if (this.nE != null) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.nE.a(aVar);
                }
            });
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerConvertStatusListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.nE = null;
    }
}
