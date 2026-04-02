package com.kwad.components.core.webview.jshandler;

import com.kwad.components.core.playable.PlayableSource;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;
    private j Ty;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String Tz;

        public final String getTarget() {
            return this.Tz;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int KX;
        public int TA;
        public int TB;
    }

    public f(j jVar) {
        this.Ty = jVar;
    }

    public final void a(com.kwad.sdk.core.response.a.a aVar) {
        com.kwad.sdk.core.webview.c.c cVar = this.Tx;
        if (cVar == null || aVar == null) {
            return;
        }
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
        try {
            a aVar = new a();
            aVar.parseJson(new JSONObject(str));
            String target = aVar.getTarget();
            j jVar = this.Ty;
            if (jVar != null) {
                jVar.a(this, target);
            }
        } catch (Exception e) {
        }
    }

    public final void aM(int i) {
        b bVar = new b();
        bVar.KX = i;
        a(bVar);
    }

    public final void aM(boolean z) {
        b bVar = new b();
        bVar.TB = z ? 1 : 0;
        a(bVar);
    }

    public final void f(PlayableSource playableSource) {
        if (playableSource == null) {
            return;
        }
        b bVar = new b();
        bVar.TA = playableSource.getCode();
        a(bVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getNativeData";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }
}
