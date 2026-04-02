package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class y implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public String playableExtraData;
    }

    public y(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.TO.DX()) {
            cVar.onError(-1, "native adTemplate is null");
            return;
        }
        a aVar = new a();
        try {
            aVar.playableExtraData = this.TO.getAdTemplate().adInfoList.get(0).adStyleInfo.playableExtraData;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getKsPlayableAdData";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
