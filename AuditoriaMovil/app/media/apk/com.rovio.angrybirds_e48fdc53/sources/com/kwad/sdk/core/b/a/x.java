package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x implements com.kwad.sdk.core.d<WebCardRegisterLiveMessageListener.AdLiveMessageInfoList.AdLiveMessageItemInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebCardRegisterLiveMessageListener.AdLiveMessageInfoList.AdLiveMessageItemInfo adLiveMessageItemInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adLiveMessageItemInfo.userName = jSONObject.optString("userName");
        if (adLiveMessageItemInfo.userName == JSONObject.NULL) {
            adLiveMessageItemInfo.userName = "";
        }
        adLiveMessageItemInfo.content = jSONObject.optString("content");
        if (adLiveMessageItemInfo.content == JSONObject.NULL) {
            adLiveMessageItemInfo.content = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebCardRegisterLiveMessageListener.AdLiveMessageInfoList.AdLiveMessageItemInfo adLiveMessageItemInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adLiveMessageItemInfo.userName != null && !adLiveMessageItemInfo.userName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userName", adLiveMessageItemInfo.userName);
        }
        if (adLiveMessageItemInfo.content != null && !adLiveMessageItemInfo.content.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "content", adLiveMessageItemInfo.content);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebCardRegisterLiveMessageListener.AdLiveMessageInfoList.AdLiveMessageItemInfo adLiveMessageItemInfo, JSONObject jSONObject) {
        a2(adLiveMessageItemInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebCardRegisterLiveMessageListener.AdLiveMessageInfoList.AdLiveMessageItemInfo adLiveMessageItemInfo, JSONObject jSONObject) {
        return b2(adLiveMessageItemInfo, jSONObject);
    }
}
