package e.d.d.l;
/* loaded from: classes.dex */
public class b0<T> implements e.d.d.t.b<T> {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f7091b = a;

    /* renamed from: c  reason: collision with root package name */
    public volatile e.d.d.t.b<T> f7092c;

    public b0(e.d.d.t.b<T> bVar) {
        this.f7092c = bVar;
    }

    @Override // e.d.d.t.b
    public T get() {
        T t = (T) this.f7091b;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.f7091b;
                if (t == obj) {
                    t = this.f7092c.get();
                    this.f7091b = t;
                    this.f7092c = null;
                }
            }
        }
        return t;
    }
}
