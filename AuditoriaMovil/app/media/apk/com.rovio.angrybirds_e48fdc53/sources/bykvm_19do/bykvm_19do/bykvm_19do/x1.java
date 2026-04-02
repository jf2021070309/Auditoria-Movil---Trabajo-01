package bykvm_19do.bykvm_19do.bykvm_19do;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x1 extends a2 {
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a2, bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return this.g ? Long.MAX_VALUE : 0L;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a2, bykvm_19do.bykvm_19do.bykvm_19do.t1
    public boolean d() {
        boolean d = super.d();
        this.g = d;
        return d;
    }
}
