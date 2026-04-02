package com.kwai.adclient.kscommerciallogger.snapshot;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class d {
    private final String aNV;
    private final LinkedHashMap<String, String> aNW = new LinkedHashMap<>();
    private final long time = System.nanoTime();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str) {
        this.aNV = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized JSONObject Lh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.aNW.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("time", this.time);
            jSONObject.put("span_name", this.aNV);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
