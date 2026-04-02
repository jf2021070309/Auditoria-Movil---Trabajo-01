package com.facebook.ads.internal.h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private final String a;
    private final JSONObject b;
    private final Map<e, List<String>> c = new HashMap();

    public a(String str, JSONObject jSONObject, JSONArray jSONArray) {
        int i = 0;
        this.a = str;
        this.b = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (e eVar : e.values()) {
            this.c.put(eVar, new LinkedList());
        }
        while (true) {
            int i2 = i;
            if (i2 >= jSONArray.length()) {
                return;
            }
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("type");
                String string2 = jSONObject2.getString("url");
                e valueOf = e.valueOf(string.toUpperCase(Locale.US));
                if (valueOf != null && !TextUtils.isEmpty(string2)) {
                    this.c.get(valueOf).add(string2);
                }
            } catch (Exception e) {
            }
            i = i2 + 1;
        }
    }

    public String a() {
        return this.a;
    }

    public List<String> a(e eVar) {
        return this.c.get(eVar);
    }

    public JSONObject b() {
        return this.b;
    }
}
