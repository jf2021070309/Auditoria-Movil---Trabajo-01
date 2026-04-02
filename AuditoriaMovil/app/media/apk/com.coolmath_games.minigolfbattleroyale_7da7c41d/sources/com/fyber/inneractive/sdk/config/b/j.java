package com.fyber.inneractive.sdk.config.b;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {
    public Integer a;
    public Integer b;
    public Set<Vendor> c = null;

    public static j a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optInt("pausePct", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("playPct", Integer.MIN_VALUE));
        j jVar = new j();
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.a = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray("vendor");
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i, null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            jVar.c = linkedHashSet;
        }
        return jVar;
    }
}
