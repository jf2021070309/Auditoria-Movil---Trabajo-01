package bykvm_19do.bykvm_19do.bykvm_19do;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s1 extends t1 {
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return this.d ? Long.MAX_VALUE : 0L;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        return z1.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean d() {
        if (this.a.d().k() != 0) {
            JSONObject a = this.a.d().a();
            if (a != null) {
                this.d = s.b(t.a(this.a.a(), this.a.d().a(), this.a.f().b(), true, a.j()), a);
            } else {
                l0.a(null);
            }
        }
        return this.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return "ac";
    }
}
