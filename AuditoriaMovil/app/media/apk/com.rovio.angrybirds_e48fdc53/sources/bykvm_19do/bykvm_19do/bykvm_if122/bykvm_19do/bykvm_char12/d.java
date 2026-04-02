package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    public static final Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> a = new ConcurrentHashMap();

    public static int a(String str, int i, Map<String, Object> map) {
        f e;
        int i2;
        if (TextUtils.isEmpty(str) || i != 1 || (e = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().e(str)) == null) {
            return 0;
        }
        int a2 = e.a();
        String c = e.c();
        if (a2 <= 0 || TextUtils.isEmpty(c)) {
            return 0;
        }
        double a3 = b.d().a(3, str, a2);
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().d(String.valueOf(i));
        if (d != null && d.size() > 0) {
            for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e eVar : d) {
                if (a3 > eVar.d() && a3 <= eVar.f()) {
                    i2 = e.a(String.valueOf(eVar.a()));
                    map.put("refresh_time", Integer.valueOf(i2));
                    break;
                }
            }
        }
        i2 = 0;
        if (i2 < 10000 || i2 > 180000) {
            return 0;
        }
        return i2;
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (cVar != null && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            if (i == 101) {
                return a.get(cVar.u());
            }
            if (i == 100 && cVar.i() == 2) {
                List<k> a2 = c.a(cVar, cVar.u());
                Object obj = cVar.h().get("rule_in_use");
                int intValue = obj != null ? ((Integer) obj).intValue() : -1;
                cVar.h().put("cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                if (a2 == null || intValue == 0) {
                    return cVar;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c m9clone = cVar.m9clone();
                if (m9clone.N()) {
                    m9clone.a(a2);
                } else {
                    m9clone.b(a2);
                }
                Object obj2 = m9clone.h().get("max_ecpm");
                Object obj3 = m9clone.h().get("min_ecpm");
                if (obj2 != null) {
                    m9clone.b(((Double) obj2).doubleValue());
                }
                if (obj3 != null) {
                    m9clone.c(((Double) obj3).doubleValue());
                }
                a.put(cVar.u(), m9clone);
                m9clone.h().put("cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return m9clone;
            }
        }
        return null;
    }

    public static void a(double d, String str, int i) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            a(2, str, i, d);
        }
    }

    public static void a(int i, String str, int i2, double d) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b;
        f e;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() && (b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b(str, 101)) != null) {
            if (b.i() == 1 && i == 1) {
                e.e().b(i2, d);
            } else if (b.i() != 2 || (e = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().e(str)) == null) {
            } else {
                if (i == 2 && e.a() == 2) {
                    b.d().a(str, 2, d);
                } else if (i != 1 || e.a() == 2) {
                } else {
                    b.d().a(str, e.a(), d);
                }
            }
        }
    }

    public static void a(int i, String str, JSONObject jSONObject) {
        f e;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() && i == 2 && (e = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().e(str)) != null) {
            try {
                jSONObject.putOpt("dynamic_rule_id", e.c());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i, List<k> list, Map<String, Object> map) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (k kVar : list) {
            if (kVar != null && kVar.f() == 0) {
                jSONArray.put(kVar.d());
            }
        }
        if (map != null) {
            map.put("rit_ids", jSONArray);
        }
    }

    public static void a(String str, String str2, int i, JSONObject jSONObject) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a2;
        a d;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() && (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101)) != null) {
            if ("mediation_request".equals(str2)) {
                if (a2.i() == 1) {
                    d = e.e();
                } else if (a2.i() != 2) {
                    return;
                } else {
                    d = b.d();
                }
                d.b(String.valueOf(i), jSONObject, a2.h());
            } else if (a2.i() != 2 || "sdk_init".equals(str2) || "sdk_init_end".equals(str2) || "get_config_start".equals(str2) || "get_config_final".equals(str2)) {
            } else {
                b.d().c(String.valueOf(i), jSONObject, a2.h());
            }
        }
    }

    public static void a(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar) {
        Map<String, Object> mediaExtraInfo;
        String d;
        Object obj;
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() || list == null || cVar == null) {
            return;
        }
        for (TTBaseAd tTBaseAd : list) {
            if (tTBaseAd != null) {
                if (cVar.i() == 1) {
                    mediaExtraInfo = tTBaseAd.getMediaExtraInfo();
                    d = e.d(cVar.w());
                } else if (cVar.i() == 2 && (obj = cVar.h().get("user_label_value")) != null) {
                    mediaExtraInfo = tTBaseAd.getMediaExtraInfo();
                    d = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e) obj).b();
                }
                mediaExtraInfo.put(MediationConstant.KEY_GM_USB, d);
            }
        }
    }

    public static void a(boolean z, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d dVar, JSONObject jSONObject, Map<String, Object> map) {
        if (dVar == null || !bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            return;
        }
        e.e().a(z, dVar, jSONObject, map);
    }
}
