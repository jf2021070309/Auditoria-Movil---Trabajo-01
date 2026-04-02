package i.a.g2;

import i.a.g2.g;
import i.a.i2.p;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class a<E> extends c<E> implements f<E> {
    public a(h.o.b.l<? super E, h.k> lVar) {
        super(lVar);
    }

    @Override // i.a.g2.j
    public final Object a() {
        Object f2 = f();
        if (f2 == b.f8989b) {
            return g.f8995b;
        }
        if (f2 instanceof h) {
            Objects.requireNonNull((h) f2);
            return new g.a(null);
        }
        return f2;
    }

    @Override // i.a.g2.j
    public E b() {
        Throwable th;
        E e2 = (E) a();
        boolean z = e2 instanceof g.c;
        if (!z) {
            if (z) {
                if (!(e2 instanceof g.a) || (th = ((g.a) e2).a) == null) {
                    throw new IllegalStateException(h.o.c.j.i("Trying to call 'getOrThrow' on a failed channel result: ", e2).toString());
                }
                throw th;
            }
            return e2;
        }
        g.a aVar = e2 instanceof g.a ? (g.a) e2 : null;
        Throwable th2 = aVar == null ? null : aVar.a;
        if (th2 == null) {
            return null;
        }
        String str = p.a;
        throw th2;
    }

    public Object f() {
        l e2;
        do {
            e2 = e();
            if (e2 == null) {
                return b.f8989b;
            }
        } while (e2.q(null) == null);
        e2.o();
        return e2.p();
    }
}
