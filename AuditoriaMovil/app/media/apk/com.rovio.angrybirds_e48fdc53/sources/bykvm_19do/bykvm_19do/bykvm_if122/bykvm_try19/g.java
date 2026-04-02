package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    public static JSONObject a() {
        Map<String, ITTAdapterConfiguration> a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a();
        if (a == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ITTAdapterConfiguration> entry : a.entrySet()) {
            if (entry.getKey() != null) {
                String[] split = entry.getKey().split("\\.");
                if (split.length >= 5) {
                    String str = split[4];
                    try {
                        jSONObject.put(str + "Adapter", entry.getValue().getAdapterVersion());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }
}
