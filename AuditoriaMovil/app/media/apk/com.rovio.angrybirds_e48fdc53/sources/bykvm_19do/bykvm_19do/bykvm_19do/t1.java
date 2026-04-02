package bykvm_19do.bykvm_19do.bykvm_19do;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t1 {
    final v1 a;
    private int b = 0;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(v1 v1Var) {
        this.a = v1Var;
    }

    abstract boolean a();

    abstract long b();

    abstract long[] c();

    abstract boolean d();

    abstract String e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long h() {
        boolean z;
        long j;
        if (!a() || h0.a(this.a.a())) {
            long b = b();
            long currentTimeMillis = System.currentTimeMillis();
            if (b <= 1000 + currentTimeMillis) {
                try {
                    z = d();
                } catch (Exception e) {
                    l0.a(e);
                    z = false;
                }
                if (z) {
                    this.b = 0;
                    j = b() - System.currentTimeMillis();
                } else {
                    long[] c = c();
                    int i = this.b;
                    this.b = i + 1;
                    j = c[i % c.length];
                }
                l0.d(e() + " worked:" + z + " " + j, null);
                return j;
            }
            return b - currentTimeMillis;
        }
        return 60000L;
    }
}
