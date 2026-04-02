package e.d.b.e.a.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements g1 {
    public final h1 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6736b;

    public b1(h1 h1Var, int i2) {
        this.a = h1Var;
        this.f6736b = i2;
    }

    @Override // e.d.b.e.a.a.g1
    public final Object a() {
        h1 h1Var = this.a;
        int i2 = this.f6736b;
        e1 b2 = h1Var.b(i2);
        if (e.d.b.d.a.m(b2.f6773c.f6755c)) {
            z zVar = h1Var.f6810b;
            d1 d1Var = b2.f6773c;
            String str = d1Var.a;
            int i3 = b2.f6772b;
            long j2 = d1Var.f6754b;
            if (zVar.q(str, i3, j2).exists()) {
                z.j(zVar.q(str, i3, j2));
            }
            d1 d1Var2 = b2.f6773c;
            int i4 = d1Var2.f6755c;
            if (i4 == 5 || i4 == 6) {
                z zVar2 = h1Var.f6810b;
                String str2 = d1Var2.a;
                if (zVar2.o(str2).exists()) {
                    z.j(zVar2.o(str2));
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new p0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
    }
}
