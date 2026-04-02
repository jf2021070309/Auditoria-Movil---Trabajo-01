package com.kwad.sdk.core.b.a;

import com.kwad.sdk.crash.model.message.AnrReason;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class aq implements com.kwad.sdk.core.d<AnrReason> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AnrReason anrReason, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        anrReason.mTag = jSONObject.optString("mTag");
        if (anrReason.mTag == JSONObject.NULL) {
            anrReason.mTag = "";
        }
        anrReason.mShortMsg = jSONObject.optString("mShortMsg");
        if (anrReason.mShortMsg == JSONObject.NULL) {
            anrReason.mShortMsg = "";
        }
        anrReason.mLongMsg = jSONObject.optString("mLongMsg");
        if (anrReason.mLongMsg == JSONObject.NULL) {
            anrReason.mLongMsg = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AnrReason anrReason, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (anrReason.mTag != null && !anrReason.mTag.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mTag", anrReason.mTag);
        }
        if (anrReason.mShortMsg != null && !anrReason.mShortMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mShortMsg", anrReason.mShortMsg);
        }
        if (anrReason.mLongMsg != null && !anrReason.mLongMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mLongMsg", anrReason.mLongMsg);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AnrReason anrReason, JSONObject jSONObject) {
        a2(anrReason, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AnrReason anrReason, JSONObject jSONObject) {
        return b2(anrReason, jSONObject);
    }
}
