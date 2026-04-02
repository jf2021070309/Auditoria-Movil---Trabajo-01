package com.kwad.sdk.core.network.idc.a;

import android.text.TextUtils;
import com.kwad.sdk.core.b;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a implements b {
    private final Map<String, List<String>> aqf = new ConcurrentHashMap();

    private Map<String, List<String>> Bp() {
        return this.aqf;
    }

    public static a de(String str) {
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            c.printStackTraceOnly(e);
        }
        return aVar;
    }

    public final Set<String> Bq() {
        return this.aqf.keySet();
    }

    public final void b(a aVar) {
        this.aqf.clear();
        if (aVar != null) {
            this.aqf.putAll(aVar.Bp());
        }
    }

    public final List<String> dd(String str) {
        List<String> list = this.aqf.get(str);
        return list == null ? Collections.emptyList() : list;
    }

    public final boolean isEmpty() {
        return this.aqf.isEmpty();
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, t.h(jSONObject.optJSONArray(next)));
            }
        }
        this.aqf.clear();
        this.aqf.putAll(hashMap);
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        Map<String, List<String>> map = this.aqf;
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            t.putValue(jSONObject, str, t.I(map.get(str)));
        }
        return jSONObject;
    }
}
