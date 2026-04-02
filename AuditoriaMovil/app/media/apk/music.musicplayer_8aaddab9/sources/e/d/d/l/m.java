package e.d.d.l;

import java.util.Set;
/* loaded from: classes.dex */
public abstract class m implements o {
    @Override // e.d.d.l.o
    public <T> T a(Class<T> cls) {
        e.d.d.t.b<T> b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    @Override // e.d.d.l.o
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
