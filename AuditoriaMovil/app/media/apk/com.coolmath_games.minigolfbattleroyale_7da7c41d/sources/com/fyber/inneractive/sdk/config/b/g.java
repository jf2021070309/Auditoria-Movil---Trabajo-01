package com.fyber.inneractive.sdk.config.b;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.b.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements c.a, c.b {
    public String a;
    String b;
    public b c;
    public e d;
    f e;
    public i f;
    public j g;
    public List<h> h = null;

    @Override // com.fyber.inneractive.sdk.config.b.c.b
    public final i a() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.config.b.c.a
    public final String b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<h> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                h hVar = null;
                if (optJSONObject != null) {
                    h hVar2 = new h();
                    hVar2.a = optJSONObject.optString("id", null);
                    hVar2.b = optJSONObject.optString(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, null);
                    hVar2.c = b.a(optJSONObject.optJSONObject(ServerProtocol.DIALOG_PARAM_DISPLAY));
                    hVar2.d = e.a(optJSONObject.optJSONObject("monitor"));
                    hVar2.e = f.a(optJSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE));
                    hVar2.f = i.a(optJSONObject.optJSONObject("video"));
                    hVar2.g = j.a(optJSONObject.optJSONObject("viewability"));
                    hVar = hVar2;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }
}
