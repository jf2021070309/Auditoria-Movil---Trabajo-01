package h.o.c;

import java.io.Serializable;
/* loaded from: classes2.dex */
public abstract class k<R> implements g<R>, Serializable {
    private final int arity;

    public k(int i2) {
        this.arity = i2;
    }

    @Override // h.o.c.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = r.a.a(this);
        j.d(a, "renderLambdaToString(this)");
        return a;
    }
}
