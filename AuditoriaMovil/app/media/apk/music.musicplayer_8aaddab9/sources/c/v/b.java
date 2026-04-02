package c.v;
/* loaded from: classes.dex */
public abstract class b<T> extends j {
    public b(f fVar) {
        super(fVar);
    }

    public abstract void d(c.x.a.f.f fVar, T t);

    public final void e(T t) {
        c.x.a.f.f a = a();
        try {
            d(a, t);
            a.f2845b.executeInsert();
            if (a == this.f2803c) {
                this.a.set(false);
            }
        } catch (Throwable th) {
            c(a);
            throw th;
        }
    }
}
