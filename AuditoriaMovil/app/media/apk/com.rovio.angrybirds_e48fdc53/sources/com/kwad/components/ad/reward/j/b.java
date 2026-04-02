package com.kwad.components.ad.reward.j;
/* loaded from: classes.dex */
public class b implements com.kwad.sdk.core.webview.c.a {
    private a xw;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        jf();
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "callButtonImpressionWhenFinish";
    }

    public void jf() {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xw = null;
    }
}
