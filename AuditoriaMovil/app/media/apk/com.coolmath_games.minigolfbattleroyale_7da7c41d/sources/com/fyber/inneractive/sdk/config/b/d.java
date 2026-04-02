package com.fyber.inneractive.sdk.config.b;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    public a a;
    public List<g> b = null;
    public String c;
    public String d;

    public static List<g> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("spots");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                g gVar = null;
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("id", null);
                    if (!TextUtils.isEmpty(optString)) {
                        g gVar2 = new g();
                        gVar2.a = optString;
                        gVar2.b = optJSONObject.optString("isActive", null);
                        gVar2.c = b.a(optJSONObject.optJSONObject(ServerProtocol.DIALOG_PARAM_DISPLAY));
                        gVar2.d = e.a(optJSONObject.optJSONObject("monitor"));
                        gVar2.e = f.a(optJSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE));
                        gVar2.f = i.a(optJSONObject.optJSONObject("video"));
                        gVar2.g = j.a(optJSONObject.optJSONObject("viewability"));
                        gVar2.h = g.a(optJSONObject.optJSONArray("units"));
                        gVar = gVar2;
                    }
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }
}
