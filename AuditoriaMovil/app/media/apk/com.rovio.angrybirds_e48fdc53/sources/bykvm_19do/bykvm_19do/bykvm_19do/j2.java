package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j2 {
    private final Context a;
    private final h b;
    private final SharedPreferences c;
    private final SharedPreferences d;
    private final SharedPreferences e;
    private volatile JSONObject f;
    private volatile JSONObject g;

    public j2(Context context, h hVar) {
        this.a = context;
        this.b = hVar;
        this.e = context.getSharedPreferences("embed_applog_stats", 0);
        this.c = context.getSharedPreferences("embed_header_custom", 0);
        this.d = context.getSharedPreferences("embed_last_sp_session", 0);
    }

    public int A() {
        return this.e.getInt("bav_monitor_rate", 0);
    }

    public String B() {
        return this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String C() {
        return this.b.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String D() {
        return this.b.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String E() {
        return this.b.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F() {
        return this.b.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String G() {
        return this.c.getString("header_custom_info", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String H() {
        return this.c.getString("ab_sdk_version", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String I() {
        return this.c.getString("user_unique_id", null);
    }

    public boolean J() {
        if (this.b.p() == 0) {
            String a = m0.a(this.a);
            if (TextUtils.isEmpty(a)) {
                this.b.a(0);
            } else {
                this.b.a(a.contains(":") ? 2 : 1);
            }
        }
        return this.b.p() == 1;
    }

    public long K() {
        return this.e.getLong("abtest_fetch_interval", 0L);
    }

    public String L() {
        return !TextUtils.isEmpty(this.b.d()) ? this.b.d() : this.c.getString("ab_version", null);
    }

    public JSONObject M() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            synchronized (this) {
                try {
                    if (N()) {
                        jSONObject = new JSONObject(this.c.getString("ab_configure", ""));
                    }
                } catch (JSONException e) {
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                this.f = jSONObject;
            }
        }
        return jSONObject;
    }

    public boolean N() {
        return this.e.getBoolean("bav_ab_config", false);
    }

    public boolean O() {
        return this.e.getBoolean("bav_log_collect", false);
    }

    public long P() {
        return this.e.getLong("session_interval", 30000L);
    }

    public long Q() {
        return this.e.getLong("batch_event_interval", 30000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String R() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String S() {
        return this.b.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.e.getString("user_agent", null);
    }

    public void a(long j) {
    }

    public void a(String str, int i) {
        this.d.edit().putString("session_last_day", str).putInt("session_order", i).apply();
    }

    public void a(HashSet<String> hashSet, HashSet<String> hashSet2) {
    }

    public void a(JSONObject jSONObject) {
        if (l0.a) {
            l0.a("setConfig, " + jSONObject.toString(), null);
        }
        this.g = jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.e.edit();
        long optInt = jSONObject.optInt("session_interval", 0);
        if (optInt <= 0 || optInt > 604800) {
            edit.remove("session_interval");
        } else {
            edit.putLong("session_interval", optInt * 1000);
        }
        long optInt2 = jSONObject.optInt("batch_event_interval", 0);
        if (optInt2 <= 0 || optInt2 > 604800) {
            edit.remove("batch_event_interval");
        } else {
            edit.putLong("batch_event_interval", optInt2 * 1000);
        }
        int optInt3 = jSONObject.optInt("send_launch_timely", 0);
        if (optInt3 <= 0 || optInt3 > 604800) {
            edit.remove("send_launch_timely");
        } else {
            edit.putInt("send_launch_timely", optInt3);
        }
        long optInt4 = jSONObject.optInt("abtest_fetch_interval", 0);
        if (optInt4 <= 20 || optInt4 > 604800) {
            edit.remove("abtest_fetch_interval");
        } else {
            edit.putLong("abtest_fetch_interval", optInt4 * 1000);
        }
        if (jSONObject.optBoolean("bav_log_collect", true)) {
            edit.putBoolean("bav_log_collect", true);
        } else {
            edit.remove("bav_log_collect");
        }
        if (jSONObject.optBoolean("bav_ab_config", false)) {
            edit.putBoolean("bav_ab_config", true);
        } else {
            edit.remove("bav_ab_config");
        }
        int optInt5 = jSONObject.optInt("bav_monitor_rate", 0);
        if (optInt5 <= 0 || optInt5 > 100) {
            edit.remove("bav_monitor_rate");
            k0.a(false);
        } else {
            edit.putInt("bav_monitor_rate", optInt5);
            k0.a(true);
        }
        edit.putLong("app_log_last_config_time", currentTimeMillis);
        edit.apply();
    }

    public boolean a(ArrayList<u> arrayList) {
        return true;
    }

    public long b() {
        return 10000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(JSONObject jSONObject) {
        this.c.edit().putString("header_custom_info", jSONObject != null ? jSONObject.toString() : "").apply();
    }

    public String c() {
        return this.b.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(JSONObject jSONObject) {
        l0.a("setAbConfig, " + jSONObject.toString(), null);
        this.c.edit().putString("ab_configure", jSONObject.toString()).apply();
        this.f = null;
    }

    public int d() {
        return this.b.x();
    }

    public int e() {
        return this.b.u();
    }

    public int f() {
        return this.b.m();
    }

    public String g() {
        return this.b.w();
    }

    public String h() {
        return this.b.t();
    }

    public String i() {
        return this.b.a();
    }

    public String j() {
        return this.b.c();
    }

    public String k() {
        return this.b.b();
    }

    public String l() {
        return this.b.y();
    }

    public String m() {
        return this.b.h() == null ? "" : this.b.h();
    }

    public String n() {
        return this.b.g() == null ? "" : this.b.g();
    }

    public boolean o() {
        return this.b.B();
    }

    public h p() {
        return this.b;
    }

    public CharSequence q() {
        return this.b.z();
    }

    public String r() {
        return this.b.n();
    }

    public boolean s() {
        return this.b.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        return this.b.f();
    }

    public String u() {
        return this.d.getString("session_last_day", "");
    }

    public int v() {
        return this.d.getInt("session_order", 0);
    }

    public SharedPreferences w() {
        return this.e;
    }

    public boolean x() {
        return this.b.C();
    }

    public JSONObject y() {
        return this.g;
    }

    public long z() {
        return this.e.getLong("app_log_last_config_time", 0L);
    }
}
