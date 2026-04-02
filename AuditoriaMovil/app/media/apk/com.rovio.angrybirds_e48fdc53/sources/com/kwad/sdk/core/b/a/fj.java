package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fj implements com.kwad.sdk.core.d<AdInfo.MaterialSize> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.MaterialSize materialSize, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        materialSize.width = jSONObject.optInt("width");
        materialSize.height = jSONObject.optInt("height");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.MaterialSize materialSize, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (materialSize.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", materialSize.width);
        }
        if (materialSize.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", materialSize.height);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.MaterialSize materialSize, JSONObject jSONObject) {
        a2(materialSize, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.MaterialSize materialSize, JSONObject jSONObject) {
        return b2(materialSize, jSONObject);
    }
}
