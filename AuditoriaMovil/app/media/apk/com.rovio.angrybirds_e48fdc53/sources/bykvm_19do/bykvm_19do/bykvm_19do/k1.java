package bykvm_19do.bykvm_19do.bykvm_19do;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k1 extends t1 {
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        long K = this.a.c().K();
        if (K < TTAdConstant.AD_MAX_EVENT_TIME) {
            K = 600000;
        }
        return K + this.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        return z1.e;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean d() {
        JSONObject a = this.a.d().a();
        if (this.a.d().k() != 0 && a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.a.d().a());
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("_gen_time", currentTimeMillis);
            JSONObject d = s.d(s.a(t.a(this.a.a(), this.a.d().a(), this.a.f().a(), true, a.j()), s.e), jSONObject);
            if (d != null) {
                a.f().b(!m0.a(a.b(), d), d);
                if (l0.a) {
                    l0.a("getAbConfig " + d, null);
                }
                this.a.d().a(d);
                this.d = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return "ab";
    }
}
