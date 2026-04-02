package com.fyber.inneractive.sdk.config.b;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Skip d;
    public Boolean e;
    public TapAction f;
    public Orientation g;
    public Integer h;
    public Integer i;
    public UnitDisplayType j;
    public List<Integer> k = new ArrayList();

    public static i a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        i iVar = new i();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("maxBitrate", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("minBitrate", Integer.MIN_VALUE));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        iVar.b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        iVar.c = valueOf2;
        iVar.d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        iVar.e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        iVar.a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        iVar.g = Orientation.fromValue(jSONObject.optString(AdUnitActivity.EXTRA_ORIENTATION));
        iVar.f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        iVar.h = valueOf3;
        iVar.i = valueOf4.intValue() != Integer.MIN_VALUE ? valueOf4 : null;
        iVar.j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt != Integer.MIN_VALUE) {
                    iVar.k.add(Integer.valueOf(optInt));
                }
            }
        }
        return iVar;
    }
}
