package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class af implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private final Handler TW;
    private final b UU;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public boolean Va;
        public String Vb;
        public int Vc;
        public com.kwad.sdk.core.webview.d.b.c Vd;
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        final com.kwad.components.core.e.d.c cVar2;
        final a aVar = new a();
        final AdTemplate adTemplate = new AdTemplate();
        try {
            aVar.parseJson(new JSONObject(str));
            adTemplate.parseJson(new JSONObject(aVar.Vb));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (com.kwad.sdk.core.response.b.d.cc(adTemplate)) {
            if (this.TO.ayn != null) {
                cVar2 = (com.kwad.components.core.e.d.c) this.TO.ayn.fz(com.kwad.sdk.core.response.b.d.ck(adTemplate).downloadId);
            } else {
                cVar2 = null;
            }
            if (this.TO.ayo) {
                this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.af.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.b bVar = new z.b();
                        bVar.US = aVar.Vd.US;
                        com.kwad.components.core.e.d.a.a(new a.C0197a(af.this.TO.MZ.getContext()).S(adTemplate).b(cVar2).ao(aVar.Vc).al(true).a(bVar).an(true).a(new a.b() { // from class: com.kwad.components.core.webview.jshandler.af.1.1
                            @Override // com.kwad.components.core.e.d.a.b
                            public final void onAdClicked() {
                            }
                        }));
                    }
                });
            } else if (this.UU != null) {
                this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.af.2
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
            cVar.a(null);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "clickAction";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.TW.removeCallbacksAndMessages(null);
    }
}
