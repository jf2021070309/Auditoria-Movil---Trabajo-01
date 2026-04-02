package h.m.i.a;

import h.m.e;
import h.m.f;
import h.o.c.j;
/* loaded from: classes2.dex */
public abstract class c extends a {
    private final h.m.f _context;
    private transient h.m.d<Object> intercepted;

    public c(h.m.d<Object> dVar) {
        this(dVar, dVar == null ? null : dVar.getContext());
    }

    public c(h.m.d<Object> dVar, h.m.f fVar) {
        super(dVar);
        this._context = fVar;
    }

    @Override // h.m.d
    public h.m.f getContext() {
        h.m.f fVar = this._context;
        j.c(fVar);
        return fVar;
    }

    public final h.m.d<Object> intercepted() {
        h.m.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            h.m.f context = getContext();
            int i2 = h.m.e.R;
            h.m.e eVar = (h.m.e) context.get(e.a.a);
            dVar = eVar == null ? this : eVar.i(this);
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // h.m.i.a.a
    public void releaseIntercepted() {
        h.m.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            h.m.f context = getContext();
            int i2 = h.m.e.R;
            f.a aVar = context.get(e.a.a);
            j.c(aVar);
            ((h.m.e) aVar).f(dVar);
        }
        this.intercepted = b.a;
    }
}
