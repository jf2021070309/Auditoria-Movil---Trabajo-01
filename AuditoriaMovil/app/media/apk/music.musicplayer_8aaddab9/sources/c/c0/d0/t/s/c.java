package c.c0.d0.t.s;

import c.c0.d0.t.s.a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public boolean j(V v) {
        if (v == null) {
            v = (V) a.f1577d;
        }
        if (a.f1576c.b(this, null, v)) {
            a.c(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        Objects.requireNonNull(th);
        if (a.f1576c.b(this, null, new a.d(th))) {
            a.c(this);
            return true;
        }
        return false;
    }

    public boolean l(e.d.c.a.a.a<? extends V> aVar) {
        a.d dVar;
        Objects.requireNonNull(aVar);
        Object obj = this.f1578e;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!a.f1576c.b(this, null, a.f(aVar))) {
                    return false;
                }
                a.c(this);
            } else {
                a.g gVar = new a.g(this, aVar);
                if (a.f1576c.b(this, null, gVar)) {
                    try {
                        aVar.a(gVar, b.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            dVar = new a.d(th);
                        } catch (Throwable unused) {
                            dVar = a.d.a;
                        }
                        a.f1576c.b(this, gVar, dVar);
                    }
                } else {
                    obj = this.f1578e;
                }
            }
            return true;
        }
        if (obj instanceof a.c) {
            aVar.cancel(((a.c) obj).f1582c);
            return false;
        }
        return false;
    }
}
