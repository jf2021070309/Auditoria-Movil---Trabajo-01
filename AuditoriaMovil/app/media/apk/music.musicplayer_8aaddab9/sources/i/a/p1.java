package i.a;
/* loaded from: classes2.dex */
public abstract class p1 extends c0 {
    public abstract p1 h0();

    public final String i0() {
        p1 p1Var;
        c0 c0Var = o0.a;
        p1 p1Var2 = i.a.i2.l.f9078c;
        if (this == p1Var2) {
            return "Dispatchers.Main";
        }
        try {
            p1Var = p1Var2.h0();
        } catch (UnsupportedOperationException unused) {
            p1Var = null;
        }
        if (this == p1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // i.a.c0
    public String toString() {
        String i0 = i0();
        if (i0 == null) {
            return getClass().getSimpleName() + '@' + e.j.d.w.M(this);
        }
        return i0;
    }
}
