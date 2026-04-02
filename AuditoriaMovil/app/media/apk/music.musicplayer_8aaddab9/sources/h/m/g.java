package h.m;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import h.m.f;
import h.o.b.p;
import h.o.c.j;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class g implements f, Serializable {
    public static final g a = new g();

    @Override // h.m.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        j.e(pVar, "operation");
        return r;
    }

    @Override // h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        j.e(bVar, Action.KEY_ATTRIBUTE);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // h.m.f
    public f minusKey(f.b<?> bVar) {
        j.e(bVar, Action.KEY_ATTRIBUTE);
        return this;
    }

    @Override // h.m.f
    public f plus(f fVar) {
        j.e(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
