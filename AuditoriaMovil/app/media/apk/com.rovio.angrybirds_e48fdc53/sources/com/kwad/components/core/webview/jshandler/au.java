package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class au implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int VA;

        public a(int i) {
            this.VA = i;
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
    }

    public final void ah(boolean z) {
        if (this.Tx != null) {
            this.Tx.a(new a(z ? 1 : 0));
            return;
        }
        com.kwad.sdk.core.e.c.d("WebCardRewardTaskStatusHandler", "notifyTaskStatus , status:" + (z ? 1 : 0));
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "rewardTaskStatus";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
