package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.ae;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q implements ae.a {
    public Set<Track> a = null;

    @Override // com.fyber.inneractive.sdk.util.ae.a
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.a;
        if (set != null) {
            for (Track track : set) {
                jSONArray.put(track);
            }
        }
        ae.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
