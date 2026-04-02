package i.a;
/* loaded from: classes2.dex */
public class j1 extends l1 implements u {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g1 g1Var) {
        super(true);
        boolean z = true;
        E(g1Var);
        o x = x();
        p pVar = x instanceof p ? (p) x : null;
        if (pVar != null) {
            l1 p = pVar.p();
            while (!p.r()) {
                o x2 = p.x();
                p pVar2 = x2 instanceof p ? (p) x2 : null;
                if (pVar2 != null) {
                    p = pVar2.p();
                }
            }
            this.f9087b = z;
        }
        z = false;
        this.f9087b = z;
    }

    @Override // i.a.l1
    public boolean r() {
        return this.f9087b;
    }

    @Override // i.a.l1
    public boolean s() {
        return true;
    }
}
