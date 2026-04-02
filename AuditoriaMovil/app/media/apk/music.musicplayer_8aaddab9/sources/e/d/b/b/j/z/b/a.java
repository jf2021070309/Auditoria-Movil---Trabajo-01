package e.d.b.b.j.z.b;
/* loaded from: classes.dex */
public final class a<T> implements g.a.a<T>, e.d.b.b.j.z.a<T> {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile g.a.a<T> f6308b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f6309c = a;

    public a(g.a.a<T> aVar) {
        this.f6308b = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // g.a.a
    public T get() {
        T t = (T) this.f6309c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.f6309c;
                if (t == obj) {
                    t = this.f6308b.get();
                    a(this.f6309c, t);
                    this.f6309c = t;
                    this.f6308b = null;
                }
            }
        }
        return t;
    }
}
