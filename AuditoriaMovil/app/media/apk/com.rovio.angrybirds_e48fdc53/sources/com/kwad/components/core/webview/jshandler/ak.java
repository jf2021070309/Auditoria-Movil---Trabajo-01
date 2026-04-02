package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ak implements com.kwad.sdk.core.webview.c.a {
    private Handler TW = new Handler(Looper.getMainLooper());
    private com.kwad.sdk.core.webview.c.c TX;
    private b cK;
    private String mUrl;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public String errorMsg;
        public int status;

        public final boolean isSuccess() {
            return this.status == 1;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    @Deprecated
    public ak(b bVar) {
        this.cK = bVar;
    }

    public ak(b bVar, String str) {
        this.cK = bVar;
        this.mUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        b bVar = this.cK;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.TX = cVar;
        try {
            final a aVar = new a();
            aVar.parseJson(new JSONObject(str));
            this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ak.1
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.b(aVar);
                    if (ak.this.TX != null) {
                        ak.this.TX.a(null);
                    }
                }
            });
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.e("WebCardPageStatusHandler", "handleJsCall error: " + e);
            com.kwad.sdk.core.webview.b.c.b.aa(this.mUrl, e.getMessage());
            cVar.onError(-1, e.getMessage());
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "pageStatus";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.cK = null;
        this.TX = null;
        this.TW.removeCallbacksAndMessages(null);
    }
}
