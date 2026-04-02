package com.kwad.components.ad.reward.j;
/* loaded from: classes.dex */
public final class e implements com.kwad.sdk.core.webview.c.a {
    private a xz;

    /* loaded from: classes.dex */
    public interface a {
        void je();
    }

    public final void a(a aVar) {
        this.xz = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        a aVar = this.xz;
        if (aVar != null) {
            aVar.je();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "clickGift";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xz = null;
    }
}
