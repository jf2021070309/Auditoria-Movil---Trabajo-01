package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ax implements com.kwad.sdk.core.webview.c.a {
    private static Handler VK;
    private com.kwad.components.core.e.d.c JN;
    private com.kwad.sdk.core.webview.b VJ;
    private b VL;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int jI;
    }

    /* loaded from: classes.dex */
    public interface b {
        void P(int i);
    }

    public ax(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, b bVar2) {
        this.VJ = bVar;
        this.JN = cVar;
        this.VL = bVar2;
        if (VK == null) {
            VK = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a aVar = new a();
            aVar.parseJson(new JSONObject(str));
            final int i = aVar.jI;
            VK.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ax.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ax.this.VL != null) {
                        ax.this.VL.P(i);
                    }
                }
            });
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "playableConvert";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
