package com.umeng.analytics.pro;

import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: Action.java */
/* loaded from: classes3.dex */
public class z implements af {
    private String a;
    private ArrayList<aa> b;
    private String c = "";
    private String d = "";

    public z(String str, ArrayList<aa> arrayList) {
        this.a = null;
        this.b = new ArrayList<>();
        this.a = str;
        this.b = arrayList;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.d = str;
    }

    @Override // com.umeng.analytics.pro.af
    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            int size = this.b.size();
            if (size <= 0) {
                return null;
            }
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b()) {
                    return null;
                }
            }
            aa aaVar = this.b.get(size - 1);
            if (aaVar == null || !(aaVar instanceof ab)) {
                return null;
            }
            long c = aaVar.c();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("actionName", this.a);
                jSONObject2.put("sdk", this.d);
                jSONObject2.put(com.umeng.ccg.a.n, this.c);
                jSONObject2.put("delay", c);
                return jSONObject2;
            } catch (Throwable th) {
                return jSONObject2;
            }
        } catch (Throwable th2) {
            return null;
        }
    }
}
