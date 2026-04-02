package com.kwad.sdk.ranger.b.a;

import com.kwad.sdk.utils.t;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    public List<a> aHz;
    public int avx;

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : this.aHz) {
            t.putValue(jSONObject, aVar.key, aVar.value);
        }
        t.putValue(jSONObject, "func_ratio_count", this.avx);
        JSONObject jSONObject2 = new JSONObject();
        t.putValue(jSONObject2, "ranger", jSONObject);
        return jSONObject2;
    }
}
