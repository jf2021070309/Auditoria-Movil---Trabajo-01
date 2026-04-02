package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ac implements com.kwad.sdk.core.webview.c.a {
    private final Handler TW = new Handler(Looper.getMainLooper());
    private com.kwad.sdk.core.webview.c.c TX;
    private b cJ;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int UM = -1;
        public int type;
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    public ac(b bVar) {
        this.cJ = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        b bVar = this.cJ;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            this.TX = cVar;
            final a aVar = new a();
            if (!TextUtils.isEmpty(str)) {
                aVar.parseJson(new JSONObject(str));
            }
            this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ac.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.TX != null) {
                        ac.this.TX.a(null);
                    }
                    ac.this.b(aVar);
                }
            });
        } catch (Exception e) {
            this.TX.onError(-1, e.getMessage());
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return MessengerShareContentUtility.SHARE_BUTTON_HIDE;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.cJ = null;
        this.TX = null;
        this.TW.removeCallbacksAndMessages(null);
    }
}
