package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class j implements h {
    private Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> b = new HashMap();
    private f0 a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.X();

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.h
    public void a(Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> map) {
        String b;
        JSONArray jSONArray = new JSONArray();
        this.b.clear();
        for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> entry : map.entrySet()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c value = entry.getValue();
            if (value != null && value.w() == 3 && value.v() != null) {
                this.b.put(value.u(), value);
                jSONArray.put(value.v());
            }
        }
        if (jSONArray.length() <= 0 || (b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONArray.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) == null || TextUtils.isEmpty(b)) {
            return;
        }
        this.a.b("splash_config", b);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.h
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b(String str) {
        String a;
        if (!TextUtils.isEmpty(str)) {
            Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> map = this.b;
            if (map != null && map.get(str) != null) {
                return this.b.get(str);
            }
            f0 f0Var = this.a;
            if (f0Var != null && (a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(f0Var.d("splash_config"), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null && !TextUtils.isEmpty(a)) {
                this.b.clear();
                try {
                    JSONArray jSONArray = new JSONArray(a);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.b(jSONArray.getJSONObject(i));
                        if (b != null) {
                            this.b.put(b.u(), b);
                        }
                    }
                    return this.b.get(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
