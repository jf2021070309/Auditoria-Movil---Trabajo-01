package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private int a;
    private int b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", this.a);
            jSONObject.put("fill_error_code", this.b);
            jSONObject.put("fill_error_msg", this.c);
            jSONObject.put("mediation_rit", this.d);
            jSONObject.put("load_sort", this.e);
            jSONObject.put("show_sort", this.f);
            jSONObject.put("has_shown", this.g);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"name\": \"json err\"}";
        }
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(int i) {
        this.g = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public void c(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.a = i;
    }

    public void e(int i) {
        this.f = i;
    }
}
