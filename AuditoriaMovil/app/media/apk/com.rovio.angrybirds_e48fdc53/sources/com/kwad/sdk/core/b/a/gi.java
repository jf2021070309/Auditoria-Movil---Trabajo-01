package com.kwad.sdk.core.b.a;

import com.facebook.internal.ServerProtocol;
import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gi implements com.kwad.sdk.core.d<AdStyleInfo.PlayDetailInfo.PatchAdInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayDetailInfo.PatchAdInfo patchAdInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        patchAdInfo.weakStyleIcon = jSONObject.optString("weakStyleIcon");
        if (patchAdInfo.weakStyleIcon == JSONObject.NULL) {
            patchAdInfo.weakStyleIcon = "";
        }
        patchAdInfo.weakStyleTitle = jSONObject.optString("weakStyleTitle");
        if (patchAdInfo.weakStyleTitle == JSONObject.NULL) {
            patchAdInfo.weakStyleTitle = "";
        }
        patchAdInfo.weakStyleDownloadingTitle = jSONObject.optString("weakStyleDownloadingTitle");
        if (patchAdInfo.weakStyleDownloadingTitle == JSONObject.NULL) {
            patchAdInfo.weakStyleDownloadingTitle = "";
        }
        patchAdInfo.weakStyleAdMark = jSONObject.optString("weakStyleAdMark");
        if (patchAdInfo.weakStyleAdMark == JSONObject.NULL) {
            patchAdInfo.weakStyleAdMark = "";
        }
        patchAdInfo.weakStyleAppearTime = jSONObject.optLong("weakStyleAppearTime");
        patchAdInfo.weakStyleEnableClose = jSONObject.optBoolean("weakStyleEnableClose", new Boolean(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).booleanValue());
        patchAdInfo.typePortrait = jSONObject.optInt("typePortrait");
        patchAdInfo.strongStyleCardUrl = jSONObject.optString("strongStyleCardUrl");
        if (patchAdInfo.strongStyleCardUrl == JSONObject.NULL) {
            patchAdInfo.strongStyleCardUrl = "";
        }
        patchAdInfo.strongStyleAppearTime = jSONObject.optLong("strongStyleAppearTime");
        patchAdInfo.strongStyleTitle = jSONObject.optString("strongStyleTitle");
        if (patchAdInfo.strongStyleTitle == JSONObject.NULL) {
            patchAdInfo.strongStyleTitle = "";
        }
        patchAdInfo.strongStyleSubTitle = jSONObject.optString("strongStyleSubTitle");
        if (patchAdInfo.strongStyleSubTitle == JSONObject.NULL) {
            patchAdInfo.strongStyleSubTitle = "";
        }
        patchAdInfo.strongStyleAdMark = jSONObject.optString("strongStyleAdMark");
        if (patchAdInfo.strongStyleAdMark == JSONObject.NULL) {
            patchAdInfo.strongStyleAdMark = "";
        }
        patchAdInfo.strongStyleEnableClose = jSONObject.optBoolean("strongStyleEnableClose", new Boolean(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).booleanValue());
        patchAdInfo.weakStyleShowTime = jSONObject.optLong("weakStyleShowTime");
        patchAdInfo.strongStyleShowTime = jSONObject.optLong("strongStyleShowTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayDetailInfo.PatchAdInfo patchAdInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (patchAdInfo.weakStyleIcon != null && !patchAdInfo.weakStyleIcon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleIcon", patchAdInfo.weakStyleIcon);
        }
        if (patchAdInfo.weakStyleTitle != null && !patchAdInfo.weakStyleTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleTitle", patchAdInfo.weakStyleTitle);
        }
        if (patchAdInfo.weakStyleDownloadingTitle != null && !patchAdInfo.weakStyleDownloadingTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleDownloadingTitle", patchAdInfo.weakStyleDownloadingTitle);
        }
        if (patchAdInfo.weakStyleAdMark != null && !patchAdInfo.weakStyleAdMark.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleAdMark", patchAdInfo.weakStyleAdMark);
        }
        if (patchAdInfo.weakStyleAppearTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleAppearTime", patchAdInfo.weakStyleAppearTime);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleEnableClose", patchAdInfo.weakStyleEnableClose);
        if (patchAdInfo.typePortrait != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "typePortrait", patchAdInfo.typePortrait);
        }
        if (patchAdInfo.strongStyleCardUrl != null && !patchAdInfo.strongStyleCardUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleCardUrl", patchAdInfo.strongStyleCardUrl);
        }
        if (patchAdInfo.strongStyleAppearTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleAppearTime", patchAdInfo.strongStyleAppearTime);
        }
        if (patchAdInfo.strongStyleTitle != null && !patchAdInfo.strongStyleTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleTitle", patchAdInfo.strongStyleTitle);
        }
        if (patchAdInfo.strongStyleSubTitle != null && !patchAdInfo.strongStyleSubTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleSubTitle", patchAdInfo.strongStyleSubTitle);
        }
        if (patchAdInfo.strongStyleAdMark != null && !patchAdInfo.strongStyleAdMark.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleAdMark", patchAdInfo.strongStyleAdMark);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleEnableClose", patchAdInfo.strongStyleEnableClose);
        if (patchAdInfo.weakStyleShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "weakStyleShowTime", patchAdInfo.weakStyleShowTime);
        }
        if (patchAdInfo.strongStyleShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "strongStyleShowTime", patchAdInfo.strongStyleShowTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayDetailInfo.PatchAdInfo patchAdInfo, JSONObject jSONObject) {
        a2(patchAdInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayDetailInfo.PatchAdInfo patchAdInfo, JSONObject jSONObject) {
        return b2(patchAdInfo, jSONObject);
    }
}
