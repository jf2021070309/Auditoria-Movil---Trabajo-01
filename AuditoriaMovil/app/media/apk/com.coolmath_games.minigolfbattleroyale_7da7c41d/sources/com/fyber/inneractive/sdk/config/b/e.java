package com.fyber.inneractive.sdk.config.b;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e {
    public Set<Track> a = null;

    public static e a(JSONObject jSONObject) {
        Track fromValue;
        e eVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track");
        if (optJSONArray != null) {
            eVar = new e();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (fromValue = Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            eVar.a = linkedHashSet;
        }
        return eVar;
    }
}
