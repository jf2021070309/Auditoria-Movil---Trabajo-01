package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.a.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class r implements d.a {
    private final String a;
    private final String b;
    private final com.facebook.ads.internal.a.c c;
    private final Collection<String> d;
    private final Map<String, String> e;
    private final String f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;

    private r(String str, String str2, com.facebook.ads.internal.a.c cVar, Collection<String> collection, Map<String, String> map, String str3, int i, int i2, int i3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = collection;
        this.e = map;
        this.f = str3;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str4;
    }

    public static r a(Bundle bundle) {
        return new r(com.facebook.ads.internal.j.c.a(bundle.getByteArray("markup")), null, com.facebook.ads.internal.a.c.NONE, null, null, bundle.getString("request_id"), bundle.getInt("viewability_check_initial_delay"), bundle.getInt("viewability_check_interval"), bundle.getInt("skip_after_seconds", 0), bundle.getString("ct"));
    }

    public static r a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("markup");
        String optString2 = jSONObject.optString("activation_command");
        String optString3 = jSONObject.optString("request_id");
        String a = com.facebook.ads.internal.q.a.j.a(jSONObject, "ct");
        com.facebook.ads.internal.a.c a2 = com.facebook.ads.internal.a.c.a(jSONObject.optString("invalidation_behavior"));
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        Collection<String> a3 = com.facebook.ads.internal.a.d.a(jSONArray);
        JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new r(optString, optString2, a2, a3, hashMap, optString3, hashMap.containsKey("viewability_check_initial_delay") ? Integer.parseInt((String) hashMap.get("viewability_check_initial_delay")) : 0, hashMap.containsKey("viewability_check_interval") ? Integer.parseInt((String) hashMap.get("viewability_check_interval")) : 1000, hashMap.containsKey("skip_after_seconds") ? Integer.parseInt((String) hashMap.get("skip_after_seconds")) : 0, a);
    }

    public static r b(Intent intent) {
        return new r(com.facebook.ads.internal.j.c.a(intent.getByteArrayExtra("markup")), intent.getStringExtra("activation_command"), com.facebook.ads.internal.a.c.NONE, null, null, intent.getStringExtra("request_id"), intent.getIntExtra("viewability_check_initial_delay", 0), intent.getIntExtra("viewability_check_interval", 1000), intent.getIntExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, 0), intent.getStringExtra("ct"));
    }

    @Override // com.facebook.ads.internal.a.d.a
    public com.facebook.ads.internal.a.c a() {
        return this.c;
    }

    public void a(Intent intent) {
        intent.putExtra("markup", com.facebook.ads.internal.j.c.a(this.a));
        intent.putExtra("activation_command", this.b);
        intent.putExtra("request_id", this.f);
        intent.putExtra("viewability_check_initial_delay", this.g);
        intent.putExtra("viewability_check_interval", this.h);
        intent.putExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, this.i);
        intent.putExtra("ct", this.j);
    }

    @Override // com.facebook.ads.internal.a.d.a
    public Collection<String> b() {
        return this.d;
    }

    @Override // com.facebook.ads.internal.a.d.a
    public String c() {
        return this.j;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public Map<String, String> f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("markup", com.facebook.ads.internal.j.c.a(this.a));
        bundle.putString("request_id", this.f);
        bundle.putInt("viewability_check_initial_delay", this.g);
        bundle.putInt("viewability_check_interval", this.h);
        bundle.putInt("skip_after_seconds", this.i);
        bundle.putString("ct", this.j);
        return bundle;
    }
}
