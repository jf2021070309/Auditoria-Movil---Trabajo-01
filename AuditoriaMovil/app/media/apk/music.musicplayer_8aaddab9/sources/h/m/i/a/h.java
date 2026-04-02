package h.m.i.a;

import h.o.c.j;
import h.o.c.r;
/* loaded from: classes2.dex */
public abstract class h extends c implements h.o.c.g<Object> {
    private final int arity;

    public h(int i2) {
        this(i2, null);
    }

    public h(int i2, h.m.d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }

    @Override // h.o.c.g
    public int getArity() {
        return this.arity;
    }

    @Override // h.m.i.a.a
    public String toString() {
        if (getCompletion() == null) {
            String a = r.a.a(this);
            j.d(a, "renderLambdaToString(this)");
            return a;
        }
        return super.toString();
    }
}
