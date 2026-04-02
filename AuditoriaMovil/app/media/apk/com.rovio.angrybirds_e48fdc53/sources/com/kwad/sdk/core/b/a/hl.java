package com.kwad.sdk.core.b.a;

import com.kwad.sdk.i.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hl implements com.kwad.sdk.core.d<b.C0268b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.C0268b c0268b, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0268b.aDh = jSONObject.optInt("enable_monitor");
        c0268b.aDi = jSONObject.optString("c_sc_name");
        if (c0268b.aDi == JSONObject.NULL) {
            c0268b.aDi = "";
        }
        c0268b.aDj = jSONObject.optString("c_pcl_name");
        if (c0268b.aDj == JSONObject.NULL) {
            c0268b.aDj = "";
        }
        c0268b.aDk = jSONObject.optString("m_gam_name");
        if (c0268b.aDk == JSONObject.NULL) {
            c0268b.aDk = "";
        }
        c0268b.aDl = jSONObject.optString("m_gsv_name");
        if (c0268b.aDl == JSONObject.NULL) {
            c0268b.aDl = "";
        }
        c0268b.aDm = jSONObject.optString("m_gpv_name");
        if (c0268b.aDm == JSONObject.NULL) {
            c0268b.aDm = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.C0268b c0268b, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0268b.aDh != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enable_monitor", c0268b.aDh);
        }
        if (c0268b.aDi != null && !c0268b.aDi.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "c_sc_name", c0268b.aDi);
        }
        if (c0268b.aDj != null && !c0268b.aDj.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "c_pcl_name", c0268b.aDj);
        }
        if (c0268b.aDk != null && !c0268b.aDk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "m_gam_name", c0268b.aDk);
        }
        if (c0268b.aDl != null && !c0268b.aDl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "m_gsv_name", c0268b.aDl);
        }
        if (c0268b.aDm != null && !c0268b.aDm.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "m_gpv_name", c0268b.aDm);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.C0268b c0268b, JSONObject jSONObject) {
        a2(c0268b, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.C0268b c0268b, JSONObject jSONObject) {
        return b2(c0268b, jSONObject);
    }
}
