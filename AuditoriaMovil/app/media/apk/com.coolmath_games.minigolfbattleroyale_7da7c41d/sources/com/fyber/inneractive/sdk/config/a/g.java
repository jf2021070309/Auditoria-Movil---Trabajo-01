package com.fyber.inneractive.sdk.config.a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g {
    public static JSONArray a(Map<Class, com.fyber.inneractive.sdk.config.a.a.d> map, boolean z) {
        d a;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.a.a.d dVar : map.values()) {
                List<b> list = dVar.b;
                Map<String, k> map2 = dVar.d;
                for (b bVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", bVar.a);
                    if (map2.containsKey(bVar.a)) {
                        jSONObject.put("v", map2.get(bVar.a).a);
                    } else {
                        jSONObject.put("v", "control");
                    }
                    if (z && (a = bVar.a(c.class)) != null && ((c) a).b) {
                        Set<Long> set = ((c) a).a;
                        JSONArray jSONArray2 = new JSONArray();
                        for (Long l : set) {
                            jSONArray2.put(l);
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject.put("d", jSONArray2);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.b("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.a <= 3) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }
}
