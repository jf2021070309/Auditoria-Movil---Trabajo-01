package com.facebook.ads.internal.adapters;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class v implements Serializable {
    private static final long serialVersionUID = 8751287062553772011L;
    private final List<d> a;
    private final String b;
    private final String c;
    private final j d;
    private final String e;
    private final String f;
    private final String g;
    private final j h;
    private final String i;
    private final int j;
    private final int k;

    private v(List<d> list, String str, String str2, String str3, String str4, String str5, String str6, j jVar, j jVar2, int i, int i2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = jVar2;
        this.e = str3;
        this.f = str4;
        this.g = str6;
        this.h = jVar;
        this.i = str5;
        this.j = i;
        this.k = i2;
    }

    public static v a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        String optString = jSONObject.optString("ad_choices_link_url");
        String optString2 = jSONObject.optString("ct");
        String optString3 = jSONObject.optString("title");
        int optInt = jSONObject.optInt("viewability_check_initial_delay", 0);
        int optInt2 = jSONObject.optInt("viewability_check_interval", 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        String optString4 = optJSONObject != null ? optJSONObject.optString("url") : "";
        JSONObject optJSONObject2 = jSONObject.optJSONObject("layout");
        if (optJSONObject2 != null) {
            jSONObject2 = optJSONObject2.optJSONObject("portrait");
            jSONObject3 = optJSONObject2.optJSONObject("landscape");
        } else {
            jSONObject2 = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("generic_text");
        String optString5 = optJSONObject3 != null ? optJSONObject3.optString("sponsored", "Sponsored") : "Sponsored";
        j a = j.a(jSONObject2);
        j a2 = j.a(jSONObject3);
        String optString6 = jSONObject.optString("request_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("carousel");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList.add(d.a(jSONObject));
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(d.a(optJSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    com.facebook.ads.internal.q.d.a.a(e, context);
                    e.printStackTrace();
                }
            }
        }
        return new v(arrayList, optString, optString2, optString3, optString4, optString6, optString5, a, a2, optInt, optInt2);
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public List<d> d() {
        return Collections.unmodifiableList(this.a);
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.g;
    }

    public j h() {
        return this.h;
    }

    public j i() {
        return this.d;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }
}
