package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class av implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c TX;
    private b VB;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int visibility;
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    public av(b bVar) {
        this.VB = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        b bVar = this.VB;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.TX = cVar;
        final a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.av.1
            @Override // java.lang.Runnable
            public final void run() {
                av.this.b(aVar);
                if (av.this.TX != null) {
                    av.this.TX.a(null);
                }
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "setHeaderBar";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.VB = null;
        this.TX = null;
    }
}
