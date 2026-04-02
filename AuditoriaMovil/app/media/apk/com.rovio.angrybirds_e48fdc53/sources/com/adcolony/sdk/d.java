package com.adcolony.sdk;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d {
    private String a;
    private JSONObject b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(JSONObject jSONObject) {
        try {
            this.b = jSONObject;
            this.a = jSONObject.getString("m_type");
        } catch (JSONException e) {
            au.h.a("JSON Error in ADCMessage constructor: ").b(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, int i) {
        try {
            this.a = str;
            this.b = new JSONObject();
            this.b.put("m_target", i);
        } catch (JSONException e) {
            au.h.a("JSON Error in ADCMessage constructor: ").b(e.toString());
        }
    }

    d(String str, int i, String str2) {
        try {
            this.a = str;
            this.b = as.a(str2);
            this.b.put("m_target", i);
        } catch (JSONException e) {
            au.h.a("JSON Error in ADCMessage constructor: ").b(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, int i, JSONObject jSONObject) {
        try {
            this.a = str;
            this.b = jSONObject == null ? new JSONObject() : jSONObject;
            this.b.put("m_target", i);
        } catch (JSONException e) {
            au.h.a("JSON Error in ADCMessage constructor: ").b(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d a(JSONObject jSONObject) {
        try {
            d dVar = new d("reply", this.b.getInt("m_origin"), jSONObject);
            dVar.b.put("m_id", this.b.getInt("m_id"));
            return dVar;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCMessage's create_reply(): ").b(e.toString());
            return new d("JSONException", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        a.a(this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.a;
    }
}
