package c.i.j;
/* loaded from: classes.dex */
public class e<T> extends d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f2128c;

    public e(int i2) {
        super(i2);
        this.f2128c = new Object();
    }

    @Override // c.i.j.d, c.i.j.c
    public boolean a(T t) {
        boolean a;
        synchronized (this.f2128c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // c.i.j.d, c.i.j.c
    public T b() {
        T t;
        synchronized (this.f2128c) {
            t = (T) super.b();
        }
        return t;
    }
}
