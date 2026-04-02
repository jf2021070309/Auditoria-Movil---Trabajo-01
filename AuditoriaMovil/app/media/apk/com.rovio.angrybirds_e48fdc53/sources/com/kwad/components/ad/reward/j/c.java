package com.kwad.components.ad.reward.j;
/* loaded from: classes.dex */
public class c implements com.kwad.sdk.core.webview.c.a {
    private a xx;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        jf();
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "callButtonImpressionWhenPlay";
    }

    public void jf() {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xx = null;
    }
}
