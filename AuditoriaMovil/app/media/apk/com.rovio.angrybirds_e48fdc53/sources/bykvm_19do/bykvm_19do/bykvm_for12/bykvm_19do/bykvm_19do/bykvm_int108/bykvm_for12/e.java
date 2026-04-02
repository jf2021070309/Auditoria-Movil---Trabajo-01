package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private static final Object e = new Object();
    private Context a;
    private d b = new d();
    private boolean c;
    private int d;

    public e(Context context, boolean z, int i) {
        this.c = true;
        this.a = context;
        this.c = z;
        this.d = i;
    }

    private d b(JSONObject jSONObject) {
        try {
            d dVar = new d();
            if (jSONObject.has("local_enable")) {
                dVar.a = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                dVar.b = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                dVar.c = hashMap;
            } else {
                dVar.c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                dVar.d = hashMap2;
            } else {
                dVar.d = null;
            }
            dVar.e = jSONObject.optInt("req_to_cnt", dVar.e);
            dVar.f = jSONObject.optInt("req_to_api_cnt", dVar.f);
            dVar.g = jSONObject.optInt("req_to_ip_cnt", dVar.g);
            dVar.h = jSONObject.optInt("req_err_cnt", dVar.h);
            dVar.i = jSONObject.optInt("req_err_api_cnt", dVar.i);
            dVar.j = jSONObject.optInt("req_err_ip_cnt", dVar.j);
            dVar.k = jSONObject.optInt("update_interval", dVar.k);
            dVar.l = jSONObject.optInt("update_random_range", dVar.l);
            dVar.m = jSONObject.optString("http_code_black", dVar.m);
            return dVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public d a() {
        return this.b;
    }

    public void a(JSONObject jSONObject) {
        String str;
        if (!this.c) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", "handleConfigChanged: no mainProc");
            return;
        }
        h.a().a(this.d).h();
        try {
            boolean z = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
            JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
            JSONObject jSONObject2 = null;
            if (h.a().a(this.d).g() && z && optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject3 = ((JSONObject) optJSONArray.get(i)).getJSONObject("param");
                    if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                        arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                    }
                }
                if (!arrayList.isEmpty()) {
                    jSONObject2 = new JSONObject();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject4 = (JSONObject) it.next();
                        Iterator<String> keys = jSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject4.getString(next));
                        }
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            if (optJSONObject == null && jSONObject2 == null) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.b("TNCConfigHandler", " tnc host_replace_map config is null");
            } else {
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    str = "host_replace_map";
                } else {
                    str = jSONObject2 != null ? "host_replace_map" : "host_replace_map";
                }
                optJSONObject.put(str, jSONObject2);
            }
            d b = b(optJSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("handleConfigChanged, newConfig: ");
            sb.append(b == null ? "null" : b.toString());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", sb.toString());
            if (b == null) {
                synchronized (e) {
                    this.a.getSharedPreferences(h.a().a(this.d).f(), 0).edit().putString("tnc_config_str", "").apply();
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(this.a, 1, "", this.d);
                }
                return;
            }
            this.b = b;
            String jSONObject5 = optJSONObject.toString();
            synchronized (e) {
                this.a.getSharedPreferences(h.a().a(this.d).f(), 0).edit().putString("tnc_config_str", jSONObject5).apply();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(this.a, 1, jSONObject5, this.d);
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                this.b = new d();
                synchronized (e) {
                    this.a.getSharedPreferences(h.a().a(this.d).f(), 0).edit().putString("tnc_config_str", "").apply();
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(this.a, 1, "", this.d);
                }
            } catch (Throwable th2) {
                synchronized (e) {
                    this.a.getSharedPreferences(h.a().a(this.d).f(), 0).edit().putString("tnc_config_str", "").apply();
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(this.a, 1, "", this.d);
                    throw th2;
                }
            }
        }
    }

    public void b() {
        String str;
        if (this.c) {
            String string = this.a.getSharedPreferences(h.a().a(this.d).f(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                str = "loadLocalConfig: no existed";
            } else {
                try {
                    d b = b(new JSONObject(string));
                    if (b != null) {
                        this.b = b;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadLocalConfig: ");
                    sb.append(b == null ? "null" : b.toString());
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", sb.toString());
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    str = "loadLocalConfig: except: " + th.getMessage();
                }
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", str);
        }
    }

    public void c() {
        try {
            String a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(this.a, 1, this.d);
            if (TextUtils.isEmpty(a)) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", "loadLocalConfigForOtherProcess, data empty");
                return;
            }
            d b = b(new JSONObject(a));
            StringBuilder sb = new StringBuilder();
            sb.append("loadLocalConfigForOtherProcess, config: ");
            sb.append(b == null ? "null" : b.toString());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", sb.toString());
            if (b != null) {
                this.b = b;
            }
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCConfigHandler", "loadLocalConfigForOtherProcess, except: " + th.getMessage());
        }
    }
}
