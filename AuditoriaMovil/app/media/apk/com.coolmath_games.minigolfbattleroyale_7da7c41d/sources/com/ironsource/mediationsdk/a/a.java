package com.ironsource.mediationsdk.a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
abstract class a {
    JSONObject a;
    int b;
    String c;
    private final String d = "eventId";
    private final String e = VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP;
    private final String f = "InterstitialEvents";
    private final String g = "events";
    private final String h = "events";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(com.ironsource.mediationsdk.adunit.a.a aVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(aVar.c()) ? new JSONObject(aVar.c()) : new JSONObject();
            jSONObject.put("eventId", aVar.a());
            jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, aVar.b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return TextUtils.isEmpty(this.c) ? b() : this.c;
    }

    public abstract String a(ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(JSONArray jSONArray) {
        try {
            if (this.a != null) {
                JSONObject jSONObject = new JSONObject(this.a.toString());
                jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, IronSourceUtils.getTimeStamp());
                String str = "events";
                if (this.b == 2) {
                    str = "InterstitialEvents";
                }
                jSONObject.put(str, jSONArray);
                return jSONObject.toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    protected abstract String b();

    public abstract String c();
}
