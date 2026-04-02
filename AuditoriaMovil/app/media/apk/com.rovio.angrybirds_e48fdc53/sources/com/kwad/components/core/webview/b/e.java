package com.kwad.components.core.webview.b;

import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public class e implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c nE;

    @Override // com.kwad.sdk.core.webview.c.a
    public void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.nE = cVar;
    }

    public final void b(final com.kwad.sdk.core.response.a.a aVar) {
        if (this.nE != null) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.nE.a(aVar);
                }
            });
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "giveRewardInAdvance";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
