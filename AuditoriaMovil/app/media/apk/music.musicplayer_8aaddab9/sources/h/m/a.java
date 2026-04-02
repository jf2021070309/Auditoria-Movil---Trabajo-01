package h.m;

import ch.qos.logback.core.joran.action.Action;
import h.m.f;
import h.o.b.p;
import h.o.c.j;
/* loaded from: classes2.dex */
public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        j.e(bVar, Action.KEY_ATTRIBUTE);
        this.key = bVar;
    }

    @Override // h.m.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0201a.a(this, r, pVar);
    }

    @Override // h.m.f.a, h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0201a.b(this, bVar);
    }

    @Override // h.m.f.a
    public f.b<?> getKey() {
        return this.key;
    }

    @Override // h.m.f
    public f minusKey(f.b<?> bVar) {
        return f.a.C0201a.c(this, bVar);
    }

    @Override // h.m.f
    public f plus(f fVar) {
        return f.a.C0201a.d(this, fVar);
    }
}
