package com.kwad.sdk.collector;

import com.facebook.internal.ServerProtocol;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g {
    private String ajP;
    private int state;
    public static int ajQ = 0;
    public static int PERMISSION_GRANTED = 1;
    public static int PERMISSION_DENIED = 2;

    public g(String str, int i) {
        this.state = ajQ;
        this.ajP = str;
        this.state = i;
    }

    public static JSONArray p(List<g> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        for (g gVar : list) {
            jSONArray.put(gVar.toJson());
        }
        return jSONArray;
    }

    private JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", yF());
            jSONObject.put(ServerProtocol.DIALOG_PARAM_STATE, this.state);
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        return jSONObject;
    }

    private String yF() {
        int lastIndexOf;
        String str = this.ajP;
        return ((str.startsWith("com.android.") || this.ajP.startsWith("android.permission")) && (lastIndexOf = this.ajP.lastIndexOf(".")) < this.ajP.length() + (-1)) ? this.ajP.substring(lastIndexOf + 1) : str;
    }
}
