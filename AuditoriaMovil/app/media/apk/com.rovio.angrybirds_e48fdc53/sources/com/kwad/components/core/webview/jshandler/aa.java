package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.KsAdSDKImpl;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class aa implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        private int screenOrientation;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenOrientation", this.screenOrientation);
            return jSONObject;
        }
    }

    public aa(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.TO.DX()) {
            cVar.onError(-1, "native adTemplate is null");
            return;
        }
        a aVar = new a();
        KsAdSDKImpl.get().getContext();
        aVar.screenOrientation = !com.kwad.sdk.utils.ai.IK() ? 1 : 0;
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getScreenOrientation";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
