package bykvm_19do.bykvm_19do.bykvm_19do;

import org.json.JSONObject;
/* loaded from: classes.dex */
class u1 extends t1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return this.a.c().z() + 21600000;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        return z1.e;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    public boolean d() {
        JSONObject a = this.a.d().a();
        if (this.a.d().k() != 0 && a != null && this.a.c().z() + 21600000 <= System.currentTimeMillis()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("header", a);
            jSONObject.put("_gen_time", System.currentTimeMillis());
            JSONObject c = s.c(s.a(t.a(this.a.a(), this.a.d().a(), this.a.f().e(), true, a.j()), s.e), jSONObject);
            a.f().a(!m0.a(c, this.a.c().y()), c);
            if (c != null) {
                this.a.c().a(c);
                return true;
            }
        }
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return "c";
    }
}
