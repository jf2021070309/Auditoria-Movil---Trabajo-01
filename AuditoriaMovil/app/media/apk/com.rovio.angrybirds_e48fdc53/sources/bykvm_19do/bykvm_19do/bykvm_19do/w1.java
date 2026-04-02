package bykvm_19do.bykvm_19do.bykvm_19do;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w1 extends y1 {
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1(v1 v1Var) {
        super(v1Var);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.y1, bykvm_19do.bykvm_19do.bykvm_19do.t1
    long b() {
        return this.f ? Long.MAX_VALUE : 0L;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.y1, bykvm_19do.bykvm_19do.bykvm_19do.t1
    public boolean d() {
        boolean d = super.d();
        this.f = d;
        return d;
    }
}
