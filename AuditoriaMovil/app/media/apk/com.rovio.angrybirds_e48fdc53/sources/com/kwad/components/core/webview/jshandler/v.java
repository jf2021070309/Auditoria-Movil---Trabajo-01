package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class v implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private a Ud;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void bz();
    }

    public v(com.kwad.sdk.core.webview.b bVar, a aVar) {
        this.TO = bVar;
        this.Ud = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.mHandler.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.v.1
            @Override // java.lang.Runnable
            public final void run() {
                v.this.Ud.bz();
            }
        });
        cVar.a(null);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "dislike";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
