package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class k2 {
    private static final String[] h = {"channel", "package", "app_version"};
    private boolean a;
    private final Context b;
    private final j2 c;
    private final SharedPreferences f;
    private final ArrayList<e2> e = new ArrayList<>(32);
    private int g = 0;
    private JSONObject d = new JSONObject();

    public k2(Context context, j2 j2Var) {
        this.b = context;
        this.c = j2Var;
        this.f = j2Var.w();
        s0.a(j2Var.r());
        s0.a(j2Var.s());
        s0.a(context);
    }

    private String a(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private boolean a(e2 e2Var) {
        boolean z = !this.c.J() && e2Var.d;
        if (l0.a) {
            l0.a("needSyncFromSub " + e2Var + " " + z, null);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        int length = str != null ? str.length() : 0;
        if (length < 13 || length > 128) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    private void b(JSONObject jSONObject) {
        synchronized (this) {
            if (jSONObject == null) {
                l0.b("null abconfig", null);
            } else {
                String optString = n().optString("ab_version");
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split(",");
                    Set<String> hashSet = new HashSet<>();
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            hashSet.add(str);
                        }
                    }
                    Iterator<String> keys = jSONObject.keys();
                    HashSet hashSet2 = new HashSet();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next instanceof String) {
                            String str2 = next;
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    hashSet2.add(jSONObject.getJSONObject(str2).optString("vid"));
                                } catch (JSONException e) {
                                    l0.a(e);
                                }
                            }
                        }
                    }
                    hashSet.retainAll(hashSet2);
                    b("ab_version", a(hashSet));
                }
            }
        }
    }

    public static boolean b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            } else if (str.charAt(i) != '0') {
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    private boolean b(String str, Object obj) {
        boolean z;
        Object opt = n().opt(str);
        if ((obj == null || obj.equals(opt)) && (obj != null || opt == null)) {
            z = false;
        } else {
            synchronized (this) {
                try {
                    JSONObject jSONObject = this.d;
                    JSONObject jSONObject2 = new JSONObject();
                    m0.b(jSONObject2, jSONObject);
                    jSONObject2.put(str, obj);
                    this.d = jSONObject2;
                } catch (JSONException e) {
                    l0.a(e);
                }
            }
            z = true;
        }
        l0.a("updateHeader, " + str + ", " + opt + ", " + obj, null);
        return z;
    }

    private JSONObject n() {
        return this.d;
    }

    public <T> T a(String str, T t) {
        JSONObject n = n();
        Object obj = (n == null || (obj = n.opt(str)) == null) ? null : null;
        return obj == null ? t : (T) obj;
    }

    public JSONObject a() {
        if (this.a) {
            return n();
        }
        return null;
    }

    public void a(HashMap<String, Object> hashMap) {
        JSONObject jSONObject = null;
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                jSONObject = n().optJSONObject("custom");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (JSONException e) {
                l0.a(e);
            }
        }
        if (b("custom", jSONObject)) {
            this.c.b(jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.c.c(jSONObject);
        b(jSONObject);
    }

    public boolean a(JSONObject jSONObject, String str, String str2, String str3) {
        boolean z;
        boolean z2;
        if (l0.a) {
            l0.a("saveRegisterInfo, " + str + ", " + str2 + ", " + str3 + ", " + jSONObject, null);
        }
        boolean b = b(str);
        boolean b2 = b(str2);
        boolean z3 = false;
        try {
            boolean b3 = b(str3);
            int i = this.f.getInt("version_code", 0);
            try {
                try {
                    int optInt = n().optInt("version_code", 0);
                    SharedPreferences.Editor edit = this.f.edit();
                    if (i != optInt) {
                        edit.putInt("version_code", optInt);
                    }
                    if (b) {
                        long currentTimeMillis = System.currentTimeMillis();
                        edit.putLong("register_time", currentTimeMillis);
                        b("register_time", Long.valueOf(currentTimeMillis));
                    } else if (!b) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("response", jSONObject);
                        a.a("tt_fetch_did_error", jSONObject2);
                    }
                    String optString = n().optString("device_id", "");
                    if (b && b("device_id", str)) {
                        edit.putString("device_id", str);
                        z = true;
                    } else {
                        z = false;
                    }
                    String optString2 = n().optString("install_id", "");
                    if (b2 && b("install_id", str2)) {
                        edit.putString("install_id", str2);
                        z = true;
                    }
                    String optString3 = n().optString("ssid", "");
                    z3 = false;
                    if (b3 && b("ssid", str3)) {
                        edit.putString("ssid", str3);
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    a.f().a(z2, optString, str, optString2, str2, optString3, str3);
                    edit.apply();
                } catch (JSONException e) {
                    e = e;
                    z3 = false;
                    l0.a(e);
                    if (b) {
                    }
                    return z3;
                }
            } catch (JSONException e2) {
                e = e2;
                z3 = false;
            }
        } catch (JSONException e3) {
            e = e3;
        }
        if (b || !b2) {
            return z3;
        }
        return true;
    }

    public JSONObject b() {
        JSONObject a = a();
        if (a != null) {
            try {
                String a2 = s0.a(a.optJSONObject("oaid"));
                if (TextUtils.isEmpty(a2)) {
                    return a;
                }
                JSONObject jSONObject = new JSONObject();
                m0.b(jSONObject, a);
                jSONObject.put("oaid", a2);
                return jSONObject;
            } catch (Exception e) {
                l0.a(e);
                return a;
            }
        }
        return a;
    }

    public int c() {
        l0.a("D.getVC", null);
        int optInt = this.a ? n().optInt("version_code", -1) : -1;
        for (int i = 0; i < 3 && optInt == -1; i++) {
            e();
            optInt = this.a ? n().optInt("version_code", -1) : -1;
        }
        return optInt;
    }

    public String d() {
        l0.a("D.getVN", null);
        String optString = this.a ? n().optString("app_version", null) : null;
        for (int i = 0; i < 3 && optString == null; i++) {
            e();
            optString = this.a ? n().optString("app_version", null) : null;
        }
        return optString;
    }

    public boolean e() {
        String[] strArr;
        l0.a("D.load", null);
        synchronized (this.e) {
            if (this.e.size() == 0) {
                this.e.add(new f2(this.b, this.c));
                this.e.add(new h2(this.b));
                this.e.add(new i2(this.b, this.c));
                this.e.add(new l2(this.b));
                this.e.add(new m2(this.b));
                this.e.add(new n2(this.b, this.c));
                this.e.add(new j(this.b));
                this.e.add(new l(this.b));
                this.e.add(new m(this.b, this.c));
                this.e.add(new n());
                this.e.add(new o(this.c));
                this.e.add(new p(this.b));
                this.e.add(new q(this.b));
                this.e.add(new r(this.b, this.c));
                this.e.add(new c2(this.b, this.c));
                this.e.add(new k(this.b, this.c));
                this.e.add(new g2(this.b, this.c));
            }
        }
        JSONObject n = n();
        JSONObject jSONObject = new JSONObject();
        m0.b(jSONObject, n);
        Iterator<e2> it = this.e.iterator();
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (it.hasNext()) {
            e2 next = it.next();
            if (!next.a || next.c || a(next)) {
                try {
                    next.a = next.a(jSONObject);
                } catch (SecurityException e) {
                    if (!next.b) {
                        i2++;
                        l0.b("loadHeader, " + this.g, e);
                        if (!next.a && this.g > 10) {
                            next.a = true;
                        }
                    }
                } catch (JSONException e2) {
                    l0.a(e2);
                }
                if (!next.a && !next.b) {
                    i++;
                }
            }
            z &= next.a || next.b;
        }
        if (z) {
            int length = h.length;
            for (int i3 = 0; i3 < length; i3++) {
                z &= !TextUtils.isEmpty(jSONObject.optString(strArr[i3]));
            }
            String optString = jSONObject.optString("user_unique_id", null);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    jSONObject.put("user_unique_id", optString);
                } catch (JSONException e3) {
                }
            }
        }
        this.d = jSONObject;
        this.a = z;
        if (l0.a) {
            l0.a("loadHeader, " + this.a + ", " + this.g + ", " + this.d.toString(), null);
        } else {
            l0.d("loadHeader, " + this.a + ", " + this.g, null);
        }
        if (i2 > 0 && i2 == i) {
            this.g++;
            if (k() != 0) {
                this.g += 10;
            }
        }
        if (this.a) {
            a.f().a(g(), h(), i());
        }
        return this.a;
    }

    public String f() {
        return n().optString("user_unique_id", "");
    }

    public String g() {
        return n().optString("device_id", "");
    }

    public String h() {
        return n().optString("install_id", "");
    }

    public String i() {
        return n().optString("ssid", "");
    }

    public String j() {
        return n().optString("user_unique_id", "");
    }

    public int k() {
        String optString = n().optString("device_id", "");
        n().optString("install_id", "");
        if (b(optString)) {
            return this.f.getInt("version_code", 0) == n().optInt("version_code", -1) ? 1 : 2;
        }
        return 0;
    }

    public long l() {
        return n().optLong("register_time", 0L);
    }

    public String m() {
        return n().optString("ab_sdk_version", "");
    }
}
