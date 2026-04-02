package e.h.e;

import e.h.g.j0;
import e.h.g.l0;
import e.h.g.r0;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements j0.b {
    public static final /* synthetic */ c a = new c();

    @Override // e.h.g.j0.b
    public final void a() {
        r0 r0Var = g.a;
        synchronized ("condayt5") {
            l0 g2 = l0.g();
            if (g2 != null) {
                long currentTimeMillis = System.currentTimeMillis() - g2.f("condayt4", 0L);
                TimeUnit timeUnit = TimeUnit.DAYS;
                if (currentTimeMillis > timeUnit.toMillis(2L)) {
                    g2.n("condayt5", 1);
                    g2.o("condayt4", System.currentTimeMillis());
                } else if (currentTimeMillis > timeUnit.toMillis(1L)) {
                    int e2 = g2.e("condayt5", 0) + 1;
                    g2.n("condayt5", e2);
                    g2.o("condayt4", System.currentTimeMillis());
                    if (e2 >= 2 && e2 <= 7 && e2 > g2.e("condayt6", 0)) {
                        g.g("consecutivePlay" + e2);
                        g2.n("condayt6", e2);
                    }
                }
            }
        }
    }
}
