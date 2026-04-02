package com.kwad.components.core.webview.b.a;

import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k extends v {
    b WH = new b() { // from class: com.kwad.components.core.webview.b.a.k.1
        @Override // com.kwad.components.core.webview.b.a.k.b
        public final void E(final long j) {
            if (k.this.nE != null) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.a.k.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar = new a((byte) 0);
                        aVar.creativeId = j;
                        k.this.nE.a(aVar);
                    }
                });
            }
        }
    };
    private com.kwad.sdk.core.webview.c.c nE;

    /* loaded from: classes.dex */
    static class a implements com.kwad.sdk.core.b {
        public long creativeId;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", this.creativeId);
            return jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void E(long j);
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.nE = cVar;
        com.kwad.components.core.e.d.a.a(this.WH);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerAdConvertListener";
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.components.core.e.d.a.b(this.WH);
    }
}
