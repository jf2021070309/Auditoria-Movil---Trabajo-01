package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.splashscreen.SplashPreloadManager;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gu implements com.kwad.sdk.core.d<SplashPreloadManager.PreLoadItem> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SplashPreloadManager.PreLoadItem preLoadItem, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        preLoadItem.cacheTime = jSONObject.optLong("cacheTime");
        preLoadItem.expiredTime = jSONObject.optLong("expiredTime");
        preLoadItem.preloadId = jSONObject.optString("preloadId");
        if (preLoadItem.preloadId == JSONObject.NULL) {
            preLoadItem.preloadId = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SplashPreloadManager.PreLoadItem preLoadItem, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (preLoadItem.cacheTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cacheTime", preLoadItem.cacheTime);
        }
        if (preLoadItem.expiredTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "expiredTime", preLoadItem.expiredTime);
        }
        if (preLoadItem.preloadId != null && !preLoadItem.preloadId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "preloadId", preLoadItem.preloadId);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SplashPreloadManager.PreLoadItem preLoadItem, JSONObject jSONObject) {
        a2(preLoadItem, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SplashPreloadManager.PreLoadItem preLoadItem, JSONObject jSONObject) {
        return b2(preLoadItem, jSONObject);
    }
}
