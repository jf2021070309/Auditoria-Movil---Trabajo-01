package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h {
    public final Map<String, g> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(JSONObject jSONObject) {
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            JSONArray names2 = jSONObject.names();
            for (int i = 0; i < names2.length(); i++) {
                String optString = names2.optString(i, null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                g gVar = new g();
                if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString2 = names.optString(i2, null);
                        String optString3 = optJSONObject.optString(optString2, null);
                        if (optString2 != null && optString3 != null && optString2 != null && optString3 != null) {
                            gVar.a.put(optString2, optString3);
                        }
                    }
                }
                this.a.put(optString, gVar);
            }
        }
    }
}
