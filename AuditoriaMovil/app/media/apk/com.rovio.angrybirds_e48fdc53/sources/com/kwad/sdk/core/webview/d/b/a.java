package com.kwad.sdk.core.webview.d.b;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public boolean JJ;
    public String Ka;
    @Deprecated
    public boolean Va;
    public int Vc;
    public c Vd;
    public int azk;
    public int azl;
    public int jI;
    public boolean JR = true;
    public long creativeId = -1;
    public int adStyle = -1;

    public final boolean Ej() {
        return 1 == this.Vc;
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        super.parseJson(jSONObject);
        try {
            if (this.jI == 0 && this.azl == 0 && jSONObject != null && jSONObject.has("logParam")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("logParam");
                this.jI = optJSONObject.getInt("itemClickType");
                this.azl = optJSONObject.getInt("sceneType");
            }
        } catch (Throwable th) {
        }
    }
}
