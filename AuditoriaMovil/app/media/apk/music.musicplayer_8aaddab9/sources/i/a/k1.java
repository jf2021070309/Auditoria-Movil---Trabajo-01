package i.a;
/* loaded from: classes2.dex */
public abstract class k1 extends y implements p0, b1 {

    /* renamed from: d  reason: collision with root package name */
    public l1 f9096d;

    @Override // i.a.b1
    public boolean a() {
        return true;
    }

    @Override // i.a.b1
    public q1 c() {
        return null;
    }

    @Override // i.a.p0
    public void dispose() {
        Object A;
        l1 p = p();
        do {
            A = p.A();
            if (!(A instanceof k1)) {
                if (!(A instanceof b1) || ((b1) A).c() == null) {
                    return;
                }
                n();
                return;
            } else if (A != this) {
                return;
            }
        } while (!l1.a.compareAndSet(p, A, m1.f9151g));
    }

    public final l1 p() {
        l1 l1Var = this.f9096d;
        if (l1Var != null) {
            return l1Var;
        }
        h.o.c.j.k("job");
        throw null;
    }

    @Override // i.a.i2.i
    public String toString() {
        return getClass().getSimpleName() + '@' + e.j.d.w.M(this) + "[job@" + e.j.d.w.M(p()) + ']';
    }
}
