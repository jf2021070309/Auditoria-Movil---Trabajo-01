package com.kwad.sdk.core.b.a;

import com.kwad.sdk.m.k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ih implements com.kwad.sdk.core.d<k.a.C0270a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(k.a.C0270a c0270a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0270a.aMV = jSONObject.optString("s_cn");
        if (c0270a.aMV == JSONObject.NULL) {
            c0270a.aMV = "";
        }
        c0270a.aMW = jSONObject.optString("s_mn");
        if (c0270a.aMW == JSONObject.NULL) {
            c0270a.aMW = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(k.a.C0270a c0270a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0270a.aMV != null && !c0270a.aMV.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "s_cn", c0270a.aMV);
        }
        if (c0270a.aMW != null && !c0270a.aMW.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "s_mn", c0270a.aMW);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(k.a.C0270a c0270a, JSONObject jSONObject) {
        a2(c0270a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(k.a.C0270a c0270a, JSONObject jSONObject) {
        return b2(c0270a, jSONObject);
    }
}
