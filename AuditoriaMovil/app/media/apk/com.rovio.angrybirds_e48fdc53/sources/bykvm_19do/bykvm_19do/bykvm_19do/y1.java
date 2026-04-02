package bykvm_19do.bykvm_19do.bykvm_19do;

import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y1 extends t1 {
    private static final long[] e = {60000};
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return this.d + 60000;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        return e;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    public boolean d() {
        Bundle a;
        long currentTimeMillis = System.currentTimeMillis();
        b2 e2 = this.a.e();
        if (e2 != null && (a = e2.a(currentTimeMillis, 50000L)) != null) {
            a.a("play_session", a);
            a.a();
        }
        if (this.a.d().k() != 0) {
            JSONObject b = this.a.d().b();
            if (b == null) {
                l0.a(null);
                return false;
            }
            boolean a2 = this.a.b().a(b);
            this.d = System.currentTimeMillis();
            return a2;
        }
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return "p";
    }
}
