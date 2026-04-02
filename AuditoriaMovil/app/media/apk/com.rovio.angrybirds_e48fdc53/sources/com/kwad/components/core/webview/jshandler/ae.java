package com.kwad.components.core.webview.jshandler;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ae implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private int UQ = 0;
    private a kf;

    /* loaded from: classes.dex */
    public interface a {
        void onAdShow();
    }

    /* loaded from: classes.dex */
    public static final class b extends com.kwad.sdk.core.report.b implements com.kwad.sdk.core.b {
        private int UR;
        private String US;
        private int UT;
        private AdTemplate adTemplate;

        public final int getActionType() {
            return this.UR;
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.UR = jSONObject.optInt("actionType");
            this.UT = jSONObject.optInt("refreshType");
            this.US = jSONObject.optString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
            try {
                if (jSONObject.has("adTemplate")) {
                    String string = jSONObject.getString("adTemplate");
                    if (this.adTemplate == null) {
                        this.adTemplate = new AdTemplate();
                    }
                    this.adTemplate.parseJson(new JSONObject(string));
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
        }

        public final String rz() {
            return this.US;
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "actionType", this.UR);
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, this.US);
            com.kwad.sdk.utils.t.putValue(jSONObject, "refreshType", this.UT);
            com.kwad.sdk.utils.t.a(jSONObject, "adTemplate", this.adTemplate);
            return jSONObject;
        }
    }

    public ae(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
    }

    private AdTemplate c(b bVar) {
        return bVar.adTemplate != null ? bVar.adTemplate : this.TO.getAdTemplate();
    }

    public final void a(a aVar) {
        this.kf = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(b bVar) {
        com.kwad.sdk.core.e.c.d("WebCardLogHandler", "handleH5Log actionType actionType" + bVar.UR);
        if (bVar.UR == 1) {
            com.kwad.sdk.core.report.j dt = new com.kwad.sdk.core.report.j().dt(bVar.US);
            a aVar = this.kf;
            if (aVar != null) {
                aVar.onAdShow();
            }
            if (bVar.adTemplate == null) {
                com.kwad.components.core.t.b.ql().a(this.TO.getAdTemplate(), null, dt);
                return;
            }
            dt.cj(this.UQ);
            com.kwad.components.core.t.b.ql().a(bVar.adTemplate, null, dt);
        } else if (bVar.UR != 2) {
            if (bVar.UR == 12006) {
                com.kwad.components.core.p.a.pC().a(c(bVar), bVar.UT, this.UQ);
                return;
            }
            com.kwad.sdk.core.report.a.a(c(bVar), bVar.UR, this.TO.mReportExtData, bVar.US);
            com.kwad.components.core.webview.b.d.a.se().aR(bVar.US);
        } else {
            com.kwad.sdk.widget.e eVar = this.TO.aym;
            com.kwad.sdk.core.report.j dt2 = new com.kwad.sdk.core.report.j().cj(this.UQ).dt(bVar.US);
            if (eVar != null) {
                dt2.c(eVar.getTouchCoords());
            }
            a(dt2);
            com.kwad.sdk.core.report.a.a(c(bVar), dt2, this.TO.mReportExtData);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.kwad.sdk.core.report.j jVar) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.TO.DX()) {
            cVar.onError(-1, "native adTemplate is null");
        }
        try {
            b bVar = new b();
            bVar.parseJson(new JSONObject(str));
            a(bVar);
            cVar.a(null);
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            cVar.onError(-1, e.getMessage());
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "log";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
