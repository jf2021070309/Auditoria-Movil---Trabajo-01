package com.fyber.inneractive.sdk.a.a;

import com.facebook.internal.ServerProtocol;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {
    HashMap<com.fyber.inneractive.sdk.a.a.a.b, b> a = new HashMap<com.fyber.inneractive.sdk.a.a.a.b, b>() { // from class: com.fyber.inneractive.sdk.a.a.c.1
        {
            com.fyber.inneractive.sdk.a.a.a.b[] values;
            for (com.fyber.inneractive.sdk.a.a.a.b bVar : com.fyber.inneractive.sdk.a.a.a.b.values()) {
                if (bVar != com.fyber.inneractive.sdk.a.a.a.b.NONE) {
                    put(bVar, new b());
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<com.fyber.inneractive.sdk.a.a.a.b, b> entry : this.a.entrySet()) {
                com.fyber.inneractive.sdk.a.a.a.b key = entry.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", key.h.value());
                    jSONObject2.put("subType", key.name().toLowerCase().contains("video") ? "video" : ServerProtocol.DIALOG_PARAM_DISPLAY);
                    jSONObject2.put("session_data", entry.getValue().a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
