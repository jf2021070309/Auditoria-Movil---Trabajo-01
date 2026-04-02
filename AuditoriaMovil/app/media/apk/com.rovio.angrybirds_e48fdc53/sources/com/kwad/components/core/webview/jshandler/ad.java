package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ad implements com.kwad.sdk.core.webview.c.a {
    private final WebView My;
    private Handler TW;
    private com.kwad.sdk.core.webview.c.c TX;
    private boolean UN;
    private b cI;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        public int bottomMargin;
        public int height;
        public int leftMargin;
        public int rightMargin;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.height = jSONObject.optInt("height");
            this.leftMargin = jSONObject.optInt("leftMargin");
            this.rightMargin = jSONObject.optInt("rightMargin");
            this.bottomMargin = jSONObject.optInt("bottomMargin");
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", this.height);
            com.kwad.sdk.utils.t.putValue(jSONObject, "leftMargin", this.leftMargin);
            com.kwad.sdk.utils.t.putValue(jSONObject, "rightMargin", this.rightMargin);
            com.kwad.sdk.utils.t.putValue(jSONObject, "bottomMargin", this.bottomMargin);
            return jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    public ad(com.kwad.sdk.core.webview.b bVar, b bVar2) {
        this(bVar, bVar2, true);
    }

    private ad(com.kwad.sdk.core.webview.b bVar, b bVar2, boolean z) {
        this.UN = true;
        this.TW = new Handler(Looper.getMainLooper());
        this.My = bVar.My;
        this.cI = bVar2;
        this.UN = true;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.TX = cVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            final a aVar = new a();
            aVar.parseJson(jSONObject);
            this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ad.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ad.this.My != null && ad.this.UN) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ad.this.My.getLayoutParams();
                        marginLayoutParams.width = -1;
                        marginLayoutParams.height = aVar.height;
                        marginLayoutParams.leftMargin = aVar.leftMargin;
                        marginLayoutParams.rightMargin = aVar.rightMargin;
                        marginLayoutParams.bottomMargin = aVar.bottomMargin;
                        ad.this.My.setLayoutParams(marginLayoutParams);
                    }
                    if (ad.this.cI != null) {
                        ad.this.cI.a(aVar);
                    }
                }
            });
            this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ad.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (ad.this.TX != null) {
                        ad.this.TX.a(null);
                    }
                }
            });
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            cVar.onError(-1, e.getMessage());
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "initKsAdFrame";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.TX = null;
        this.cI = null;
        this.TW.removeCallbacksAndMessages(null);
    }
}
