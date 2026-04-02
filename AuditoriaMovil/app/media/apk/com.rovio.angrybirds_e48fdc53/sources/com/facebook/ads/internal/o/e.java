package com.facebook.ads.internal.o;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.ads.internal.o.f;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e {
    private static e a = new e();

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            eVar = a;
        }
        return eVar;
    }

    private g a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        com.facebook.ads.internal.h.c cVar = new com.facebook.ads.internal.h.c(com.facebook.ads.internal.h.d.a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"));
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                cVar.a(new com.facebook.ads.internal.h.a(jSONObject3.optString("adapter"), jSONObject3.optJSONObject(ShareConstants.WEB_DIALOG_PARAM_DATA), jSONObject3.optJSONArray("trackers")));
            }
        }
        return new g(cVar, jSONObject.optString("server_request_id"), jSONObject.optString("server_response"), jSONObject.optString("an_validation_uuid"));
    }

    private h b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
            return new h(jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, ""), jSONObject.optInt(PluginConstants.KEY_ERROR_CODE, 0), new com.facebook.ads.internal.h.c(com.facebook.ads.internal.h.d.a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config")));
        } catch (JSONException e) {
            return c(jSONObject);
        }
    }

    private h c(JSONObject jSONObject) {
        return new h(jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, ""), jSONObject.optInt(PluginConstants.KEY_ERROR_CODE, 0), null);
    }

    public f a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            char c = 65535;
            switch (optString.hashCode()) {
                case 96432:
                    if (optString.equals("ads")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96784904:
                    if (optString.equals("error")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return a(jSONObject);
                case 1:
                    return b(jSONObject);
                default:
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        return c(optJSONObject);
                    }
                    break;
            }
        }
        return new f(f.a.UNKNOWN);
    }
}
