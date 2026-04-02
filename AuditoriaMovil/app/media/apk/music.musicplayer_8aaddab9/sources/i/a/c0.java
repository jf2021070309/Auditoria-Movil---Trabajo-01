package i.a;

import ch.qos.logback.core.joran.action.Action;
import h.m.e;
import h.m.f;
/* loaded from: classes2.dex */
public abstract class c0 extends h.m.a implements h.m.e {
    public static final a a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a extends h.m.b<h.m.e, c0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h.o.c.f fVar) {
            super(e.a.a, b0.a);
            int i2 = h.m.e.R;
        }
    }

    public c0() {
        super(e.a.a);
    }

    public abstract void e0(h.m.f fVar, Runnable runnable);

    @Override // h.m.e
    public final void f(h.m.d<?> dVar) {
        ((i.a.i2.e) dVar).j();
    }

    public void f0(h.m.f fVar, Runnable runnable) {
        e0(fVar, runnable);
    }

    public boolean g0(h.m.f fVar) {
        return !(this instanceof b2);
    }

    @Override // h.m.a, h.m.f.a, h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        h.o.c.j.e(this, "this");
        h.o.c.j.e(bVar, Action.KEY_ATTRIBUTE);
        if (!(bVar instanceof h.m.b)) {
            if (e.a.a == bVar) {
                return this;
            }
            return null;
        }
        h.m.b bVar2 = (h.m.b) bVar;
        f.b<?> key = getKey();
        h.o.c.j.e(key, Action.KEY_ATTRIBUTE);
        if (key == bVar2 || bVar2.f8929b == key) {
            h.o.c.j.e(this, "element");
            E e2 = (E) bVar2.a.invoke(this);
            if (e2 instanceof f.a) {
                return e2;
            }
            return null;
        }
        return null;
    }

    @Override // h.m.e
    public final <T> h.m.d<T> i(h.m.d<? super T> dVar) {
        return new i.a.i2.e(this, dVar);
    }

    @Override // h.m.a, h.m.f
    public h.m.f minusKey(f.b<?> bVar) {
        h.o.c.j.e(this, "this");
        h.o.c.j.e(bVar, Action.KEY_ATTRIBUTE);
        if (bVar instanceof h.m.b) {
            h.m.b bVar2 = (h.m.b) bVar;
            f.b<?> key = getKey();
            h.o.c.j.e(key, Action.KEY_ATTRIBUTE);
            if (key == bVar2 || bVar2.f8929b == key) {
                h.o.c.j.e(this, "element");
                if (((f.a) bVar2.a.invoke(this)) != null) {
                    return h.m.g.a;
                }
            }
        } else if (e.a.a == bVar) {
            return h.m.g.a;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e.j.d.w.M(this);
    }
}
