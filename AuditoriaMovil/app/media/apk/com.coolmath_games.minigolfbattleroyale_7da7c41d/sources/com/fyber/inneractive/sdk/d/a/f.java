package com.fyber.inneractive.sdk.d.a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f {
    public static n.b a(Map<m, c> map) {
        Set<m> keySet = map.keySet();
        if (keySet == null || keySet.size() <= 0) {
            return null;
        }
        n.b bVar = new n.b();
        JSONArray jSONArray = new JSONArray();
        for (m mVar : keySet) {
            try {
                c cVar = map.get(mVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", mVar.j);
                jSONObject.put("bitrate", mVar.f);
                jSONObject.put("mime", TextUtils.isEmpty(mVar.d) ? "na" : mVar.d);
                jSONObject.put("delivery", mVar.a);
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, cVar.a != null ? cVar.a.h : 0);
                jSONObject.put("required_value", cVar.b);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
                IAlog.b("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                return null;
            }
        }
        bVar.a("media_files", jSONArray);
        return bVar;
    }
}
