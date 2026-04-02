package e.h.d;

import e.a.c.j6;
import e.h.g.j0;
import e.h.g.t1;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements j0.b {
    public final /* synthetic */ m0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8149b;

    public /* synthetic */ n(m0 m0Var, int i2) {
        this.a = m0Var;
        this.f8149b = i2;
    }

    @Override // e.h.g.j0.b
    public final void a() {
        m0 m0Var = this.a;
        int i2 = this.f8149b;
        Objects.requireNonNull(m0Var);
        if (c.i.g.b.f2069b != null) {
            Objects.requireNonNull((j6) c.i.g.b.f());
            t1.h("Memory trim called = " + i2);
            if (i2 == 5) {
                m0Var.H0(true);
            } else if (i2 == 10) {
                m0Var.H0(true);
            } else if (i2 == 15) {
                m0Var.p0();
                m0Var.H0(true);
            } else if (i2 != 20) {
                if (i2 == 40) {
                    m0Var.H0(false);
                } else if (i2 == 60) {
                    m0Var.H0(true);
                } else if (i2 == 80) {
                    m0Var.p0();
                    m0Var.H0(true);
                } else {
                    t1.h("unknown trim memory called = " + i2);
                    m0Var.H0(true);
                }
            }
        }
    }
}
