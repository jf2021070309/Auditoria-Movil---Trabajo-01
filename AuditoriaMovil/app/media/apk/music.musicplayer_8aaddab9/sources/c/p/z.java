package c.p;

import ch.qos.logback.core.CoreConstants;
import i.a.o0;
import i.a.p1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class z extends i.a.c0 {

    /* renamed from: b  reason: collision with root package name */
    public final f f2476b = new f();

    @Override // i.a.c0
    public void e0(h.m.f fVar, Runnable runnable) {
        h.o.c.j.e(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(runnable, "block");
        f fVar2 = this.f2476b;
        Objects.requireNonNull(fVar2);
        h.o.c.j.e(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(runnable, "runnable");
        i.a.c0 c0Var = o0.a;
        p1 h0 = i.a.i2.l.f9078c.h0();
        if (h0.g0(fVar) || fVar2.a()) {
            h0.e0(fVar, new e(fVar2, runnable));
        } else {
            fVar2.c(runnable);
        }
    }

    @Override // i.a.c0
    public boolean g0(h.m.f fVar) {
        h.o.c.j.e(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        i.a.c0 c0Var = o0.a;
        if (i.a.i2.l.f9078c.h0().g0(fVar)) {
            return true;
        }
        return !this.f2476b.a();
    }
}
