package com.fyber.inneractive.sdk.config.a;

import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l {
    final Map<String, q> a = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static l a(JSONObject jSONObject) throws Exception {
        l lVar = new l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            q qVar = new q();
            qVar.a = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            if (optJSONObject != null) {
                qVar.a(optJSONObject);
            } else {
                IAlog.b("RemoteFeature fromJson. feature %s has no params!", qVar.a);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    b a = b.a(optJSONArray2.getJSONObject(i2));
                    qVar.b.put(a.a, a);
                }
            }
            lVar.a.put(qVar.a, qVar);
        }
        return lVar;
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.a.values());
    }
}
