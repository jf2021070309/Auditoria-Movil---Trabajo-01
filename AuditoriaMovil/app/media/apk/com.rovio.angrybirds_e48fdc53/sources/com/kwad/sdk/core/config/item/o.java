package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o extends b<a> {
    private String amP;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        public Map<Integer, String> amQ = new HashMap();
        public List<String> amR = new ArrayList();
        public List<String> amS = new ArrayList();
        public List<String> amT = new ArrayList();
        public int amU;
        private JSONObject amV;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.amV = jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject("platformInfo");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.amQ.put(Integer.valueOf(next), optJSONObject.optString(next));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keyStacks");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.amR.add(optJSONArray.optString(i));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("extendClassNames");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    this.amS.add(optJSONArray2.optString(i2));
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("keyNames");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.amT.add(optJSONArray3.optString(i3));
                }
            }
            this.amU = jSONObject.optInt("handleType");
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            return this.amV;
        }
    }

    public o() {
        super("sdkPackInfo", null);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        String cw = cw(sharedPreferences.getString("sdkPackInfo", null));
        this.amP = cw;
        try {
            if (TextUtils.isEmpty(cw)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(this.amP);
            a aVar = new a();
            aVar.parseJson(jSONObject);
            setValue(aVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putString("sdkPackInfo", cv(this.amP));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("sdkPackInfo");
        if (optJSONObject == null) {
            return;
        }
        this.amP = optJSONObject.toString();
        a aVar = new a();
        aVar.parseJson(optJSONObject);
        setValue(aVar);
    }
}
