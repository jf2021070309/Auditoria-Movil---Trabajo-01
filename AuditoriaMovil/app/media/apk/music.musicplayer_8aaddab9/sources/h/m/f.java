package h.m;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e.j.d.w;
import h.o.b.p;
import h.o.c.j;
/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public interface a extends f {

        /* renamed from: h.m.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0201a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                j.e(aVar, "this");
                j.e(pVar, "operation");
                return pVar.i(r, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> bVar) {
                j.e(aVar, "this");
                j.e(bVar, Action.KEY_ATTRIBUTE);
                if (j.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                j.e(aVar, "this");
                j.e(bVar, Action.KEY_ATTRIBUTE);
                return j.a(aVar.getKey(), bVar) ? g.a : aVar;
            }

            public static f d(a aVar, f fVar) {
                j.e(aVar, "this");
                j.e(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
                return w.h0(aVar, fVar);
            }
        }

        @Override // h.m.f
        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    /* loaded from: classes2.dex */
    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);

    f plus(f fVar);
}
