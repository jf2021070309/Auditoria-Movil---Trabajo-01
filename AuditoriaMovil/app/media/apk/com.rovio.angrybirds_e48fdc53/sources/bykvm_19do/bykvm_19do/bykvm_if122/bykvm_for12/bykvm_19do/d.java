package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d implements c<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g> {
    private Context a;

    public d(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
    }

    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g a(String str, boolean z) {
        String string;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String[] split = jSONObject.getString("unity_id").split("_");
                String str3 = split.length > 0 ? split[0] : "";
                String str4 = split.length > 1 ? split[1] : "";
                if (z) {
                    str2 = jSONObject.getString("adn_rit_show_rules_version");
                    string = "";
                } else {
                    string = jSONObject.getString("waterfall_show_rules_version");
                    str2 = "";
                }
                return new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g(str3, str4, string, str2, jSONObject.getInt("timing_mode"), jSONObject.getString("show_freqctl_rules"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private JSONObject a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar, boolean z) {
        String str;
        String e;
        if (gVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unity_id", gVar.g());
                if (gVar.h()) {
                    str = "adn_rit_show_rules_version";
                    e = gVar.b();
                } else {
                    str = "waterfall_show_rules_version";
                    e = gVar.e();
                }
                jSONObject.put(str, e);
                jSONObject.put("timing_mode", gVar.f());
                jSONObject.put("show_freqctl_rules", z ? gVar.k() : gVar.j());
                return jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private void c(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar) {
        if (this.a == null || gVar == null) {
            return;
        }
        f0 a = f0.a("freqctl_" + gVar.d(), this.a);
        JSONObject a2 = a(gVar, false);
        if (a2 != null) {
            a.b(gVar.g(), a2.toString());
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.g
    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar) {
        synchronized (this) {
            if (this.a != null && gVar != null) {
                f0 a = f0.a("freqctl_" + gVar.d(), this.a);
                String g = gVar.g();
                JSONObject a2 = a(gVar, true);
                if (a2 != null) {
                    a.b(g, a2.toString());
                }
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.g
    public void a(String str) {
        synchronized (this) {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                f0.a("freqctl_" + str, this.a).f(str);
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.g
    public void a(String str, String str2) {
        synchronized (this) {
            if (this.a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                f0 a = f0.a("freqctl_" + str, this.a);
                a.f(str + "_" + str2);
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.g
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g b(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g a;
        synchronized (this) {
            if (this.a == null) {
                a = null;
            } else {
                a = a(f0.a("freqctl_" + str, this.a).a(str, ""), false);
            }
        }
        return a;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.g
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g b(String str, String str2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g a;
        synchronized (this) {
            if (this.a == null) {
                a = null;
            } else {
                f0 a2 = f0.a("freqctl_" + str, this.a);
                a = a(a2.a(str + "_" + str2, ""), true);
            }
        }
        return a;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.c
    public void b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar) {
        synchronized (this) {
            if (gVar != null) {
                c(gVar);
            }
        }
    }
}
