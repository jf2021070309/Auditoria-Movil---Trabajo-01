package bykvm_19do.bykvm_19do.bykvm_19do;

import com.facebook.login.widget.ToolTipPopup;
import org.json.JSONObject;
/* loaded from: classes.dex */
class z1 extends t1 {
    static final long[] d = {60000, 60000, 60000, 120000, 120000, 120000, 180000, 180000};
    static final long[] e = {180000, 180000, 360000, 360000, 540000, 540000};
    private static final long[] f = {10000, 10000, 20000, 20000, 60000, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, 180000, 180000, 540000, 540000};

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return (this.a.e().c() ? 21600000 : 43200000) + this.a.d().l();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        int k = this.a.d().k();
        if (k != 0) {
            if (k != 1) {
                if (k == 2) {
                    return d;
                }
                l0.a(null);
            }
            return e;
        }
        return f;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean d() {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = this.a.d().a();
        if (a != null) {
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("header", a);
            jSONObject.put("_gen_time", System.currentTimeMillis());
            JSONObject a2 = s.a(t.a(this.a.a(), this.a.d().a(), this.a.f().c(), true, a.j()), jSONObject);
            if (a2 != null) {
                return this.a.d().a(a2, a2.optString("device_id", ""), a2.optString("install_id", ""), a2.optString("ssid", ""));
            }
        } else {
            l0.a(null);
        }
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return com.kuaishou.weapon.p0.t.k;
    }
}
