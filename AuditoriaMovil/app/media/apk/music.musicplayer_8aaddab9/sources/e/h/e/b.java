package e.h.e;

import e.h.g.j0;
import e.h.g.l0;
import e.h.g.r0;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements j0.b {
    public static final /* synthetic */ b a = new b();

    @Override // e.h.g.j0.b
    public final void a() {
        r0 r0Var = g.a;
        synchronized ("condayt2") {
            l0 g2 = l0.g();
            if (g2 != null) {
                long currentTimeMillis = System.currentTimeMillis() - g2.f("condayt", 0L);
                TimeUnit timeUnit = TimeUnit.DAYS;
                if (currentTimeMillis > timeUnit.toMillis(2L)) {
                    g2.n("condayt2", 1);
                    g2.o("condayt", System.currentTimeMillis());
                } else if (currentTimeMillis > timeUnit.toMillis(1L)) {
                    int e2 = g2.e("condayt2", 0) + 1;
                    g2.n("condayt2", e2);
                    g2.o("condayt", System.currentTimeMillis());
                    if (e2 >= 2 && e2 <= 7 && e2 > g2.e("condayt3", 0)) {
                        g.g("consecutiveOpen" + e2);
                        g2.n("condayt3", e2);
                    }
                }
            }
        }
    }
}
