package com.kwad.sdk.collector.a;

import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.collector.model.e;
import com.kwad.sdk.core.network.d;
import com.kwad.sdk.h;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends d {
    public b(Collection<e> collection) {
        putBody("collectData", a(collection));
        putBody("collectType", 1);
        putBody("sdkVersion", BuildConfig.VERSION_NAME);
        putBody("sdkVersionCode", BuildConfig.VERSION_CODE);
    }

    private static JSONArray a(Collection<e> collection) {
        JSONArray jSONArray = new JSONArray();
        for (e eVar : collection) {
            JSONObject yI = eVar.yI();
            if (yI != null) {
                jSONArray.put(yI);
            }
        }
        return jSONArray;
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return h.xi();
    }
}
