package com.fyber.inneractive.sdk.config.b;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f {
    public UnitDisplayType a;

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        f fVar = new f();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue != null) {
            fVar.a = fromValue;
            return fVar;
        }
        return null;
    }
}
