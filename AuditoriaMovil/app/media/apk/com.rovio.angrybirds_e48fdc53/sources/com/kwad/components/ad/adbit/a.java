package com.kwad.components.ad.adbit;

import com.kwad.sdk.utils.t;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public JSONObject bt;
    public Map<String, String> bu;

    public a(JSONObject jSONObject, Map<String, String> map) {
        this.bt = jSONObject;
        this.bu = map;
    }

    public final String N() {
        for (String str : this.bu.keySet()) {
            t.putValue(this.bt, str, this.bu.get(str));
        }
        return this.bt.toString();
    }
}
