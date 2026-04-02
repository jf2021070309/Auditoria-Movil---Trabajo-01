package i.a;
/* loaded from: classes2.dex */
public final class q0 extends h {
    public final p0 a;

    public q0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // i.a.i
    public void a(Throwable th) {
        this.a.dispose();
    }

    @Override // h.o.b.l
    public h.k invoke(Throwable th) {
        this.a.dispose();
        return h.k.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DisposeOnCancel[");
        y.append(this.a);
        y.append(']');
        return y.toString();
    }
}
