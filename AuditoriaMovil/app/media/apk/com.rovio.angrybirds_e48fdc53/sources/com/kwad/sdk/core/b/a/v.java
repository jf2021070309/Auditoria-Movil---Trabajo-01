package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v implements com.kwad.sdk.core.d<WebCardRegisterLiveShopListener.AdLiveItemShopInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebCardRegisterLiveShopListener.AdLiveItemShopInfo adLiveItemShopInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adLiveItemShopInfo.status = jSONObject.optInt("status");
        adLiveItemShopInfo.title = jSONObject.optString("title");
        if (adLiveItemShopInfo.title == JSONObject.NULL) {
            adLiveItemShopInfo.title = "";
        }
        adLiveItemShopInfo.url = jSONObject.optString("url");
        if (adLiveItemShopInfo.url == JSONObject.NULL) {
            adLiveItemShopInfo.url = "";
        }
        adLiveItemShopInfo.price = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        if (adLiveItemShopInfo.price == JSONObject.NULL) {
            adLiveItemShopInfo.price = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebCardRegisterLiveShopListener.AdLiveItemShopInfo adLiveItemShopInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adLiveItemShopInfo.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", adLiveItemShopInfo.status);
        }
        if (adLiveItemShopInfo.title != null && !adLiveItemShopInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", adLiveItemShopInfo.title);
        }
        if (adLiveItemShopInfo.url != null && !adLiveItemShopInfo.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", adLiveItemShopInfo.url);
        }
        if (adLiveItemShopInfo.price != null && !adLiveItemShopInfo.price.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, InAppPurchaseMetaData.KEY_PRICE, adLiveItemShopInfo.price);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebCardRegisterLiveShopListener.AdLiveItemShopInfo adLiveItemShopInfo, JSONObject jSONObject) {
        a2(adLiveItemShopInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebCardRegisterLiveShopListener.AdLiveItemShopInfo adLiveItemShopInfo, JSONObject jSONObject) {
        return b2(adLiveItemShopInfo, jSONObject);
    }
}
