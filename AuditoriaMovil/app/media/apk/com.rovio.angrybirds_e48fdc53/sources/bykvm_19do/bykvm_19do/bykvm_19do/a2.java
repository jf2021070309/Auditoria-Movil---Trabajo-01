package bykvm_19do.bykvm_19do.bykvm_19do;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes.dex */
class a2 extends t1 {
    private static final long[] f = {60000};
    private long d;
    private long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    boolean a() {
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        long Q = this.a.c().Q();
        if (Q > 60000 || Q <= 0) {
            Q = 60000;
        }
        f[0] = Q;
        return Q + this.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    long[] c() {
        return f;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    public boolean d() {
        z a;
        if (System.currentTimeMillis() > this.e + this.a.c().Q()) {
            JSONObject b = this.a.d().b();
            b2 e = this.a.e();
            if (e != null && b != null && (a = e.a()) != null) {
                this.a.b().a(b, a, e.b());
                this.e = System.currentTimeMillis();
            }
        }
        ArrayList<a0> a2 = this.a.b().a();
        ArrayList<a0> arrayList = new ArrayList<>(a2.size());
        ArrayList<a0> arrayList2 = new ArrayList<>(a2.size());
        v1 v1Var = this.a;
        String[] a3 = t.a(v1Var, v1Var.a(), this.a.d().a());
        Iterator<a0> it = a2.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            int a4 = s.a(a3, next.i, this.a.c());
            if (a4 == 200) {
                arrayList.add(next);
            } else {
                next.k = a4;
                arrayList2.add(next);
            }
        }
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.a.b().a(arrayList, arrayList2);
        }
        l0.d(e() + arrayList.size() + " " + a2.size(), null);
        if (arrayList.size() == a2.size()) {
            this.d = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.t1
    String e() {
        return "s";
    }
}
