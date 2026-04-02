package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.CouponInfo;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ab implements com.kwad.sdk.core.d<AdProductInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdProductInfo adProductInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adProductInfo.icon = jSONObject.optString("icon");
        if (adProductInfo.icon == JSONObject.NULL) {
            adProductInfo.icon = "";
        }
        adProductInfo.name = jSONObject.optString("name");
        if (adProductInfo.name == JSONObject.NULL) {
            adProductInfo.name = "";
        }
        adProductInfo.price = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        if (adProductInfo.price == JSONObject.NULL) {
            adProductInfo.price = "";
        }
        adProductInfo.originPrice = jSONObject.optString("originPrice");
        if (adProductInfo.originPrice == JSONObject.NULL) {
            adProductInfo.originPrice = "";
        }
        adProductInfo.couponList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("couponList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                CouponInfo couponInfo = new CouponInfo();
                couponInfo.parseJson(optJSONArray.optJSONObject(i));
                adProductInfo.couponList.add(couponInfo);
            }
        }
        adProductInfo.volume = jSONObject.optString("volume");
        if (adProductInfo.volume == JSONObject.NULL) {
            adProductInfo.volume = "";
        }
        adProductInfo.rating = jSONObject.optString("rating");
        if (adProductInfo.rating == JSONObject.NULL) {
            adProductInfo.rating = "";
        }
        adProductInfo.seckillInfo = new AdProductInfo.SpikeInfo();
        adProductInfo.seckillInfo.parseJson(jSONObject.optJSONObject("seckillInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdProductInfo adProductInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adProductInfo.icon != null && !adProductInfo.icon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "icon", adProductInfo.icon);
        }
        if (adProductInfo.name != null && !adProductInfo.name.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "name", adProductInfo.name);
        }
        if (adProductInfo.price != null && !adProductInfo.price.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, InAppPurchaseMetaData.KEY_PRICE, adProductInfo.price);
        }
        if (adProductInfo.originPrice != null && !adProductInfo.originPrice.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "originPrice", adProductInfo.originPrice);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "couponList", adProductInfo.couponList);
        if (adProductInfo.volume != null && !adProductInfo.volume.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "volume", adProductInfo.volume);
        }
        if (adProductInfo.rating != null && !adProductInfo.rating.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rating", adProductInfo.rating);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "seckillInfo", adProductInfo.seckillInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdProductInfo adProductInfo, JSONObject jSONObject) {
        a2(adProductInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdProductInfo adProductInfo, JSONObject jSONObject) {
        return b2(adProductInfo, jSONObject);
    }
}
