package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k implements com.kwad.sdk.core.d<AdStyleInfo.AdBrowseInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.AdBrowseInfo adBrowseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adBrowseInfo.enableAdBrowse = jSONObject.optInt("enableAdBrowse");
        adBrowseInfo.adBrowseDuration = jSONObject.optInt("adBrowseDuration");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.AdBrowseInfo adBrowseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adBrowseInfo.enableAdBrowse != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enableAdBrowse", adBrowseInfo.enableAdBrowse);
        }
        if (adBrowseInfo.adBrowseDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adBrowseDuration", adBrowseInfo.adBrowseDuration);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.AdBrowseInfo adBrowseInfo, JSONObject jSONObject) {
        a2(adBrowseInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.AdBrowseInfo adBrowseInfo, JSONObject jSONObject) {
        return b2(adBrowseInfo, jSONObject);
    }
}
