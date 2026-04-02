package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class ar implements com.kwad.sdk.core.webview.c.a {
    private final a Vu;

    /* loaded from: classes.dex */
    public interface a {
        void bA();
    }

    public ar(a aVar) {
        this.Vu = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, final com.kwad.sdk.core.webview.c.c cVar) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ar.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ar.this.Vu != null) {
                    ar.this.Vu.bA();
                }
                cVar.a(null);
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerMotionListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
