package c.p;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import h.m.f;
import i.a.o0;
import i.a.p1;
import i.a.w1;
/* loaded from: classes.dex */
public final class q {
    public static final k a(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        h.o.c.j.e(pVar, "<this>");
        j lifecycle = pVar.getLifecycle();
        h.o.c.j.d(lifecycle, "lifecycle");
        h.o.c.j.e(lifecycle, "<this>");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                w1 w1Var = new w1(null);
                i.a.c0 c0Var = o0.a;
                p1 p1Var = i.a.i2.l.f9078c;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, f.a.C0201a.d(w1Var, p1Var.h0()));
                if (lifecycle.a.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    e.j.d.w.Y(lifecycleCoroutineScopeImpl, p1Var.h0(), null, new l(lifecycleCoroutineScopeImpl, null), 2, null);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }
}
