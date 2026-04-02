package c.f;

import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
public class b<E> extends g<E, E> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f1635d;

    public b(c cVar) {
        this.f1635d = cVar;
    }

    @Override // c.f.g
    public void a() {
        this.f1635d.clear();
    }

    @Override // c.f.g
    public Object b(int i2, int i3) {
        return this.f1635d.f1642h[i2];
    }

    @Override // c.f.g
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // c.f.g
    public int d() {
        return this.f1635d.f1643i;
    }

    @Override // c.f.g
    public int e(Object obj) {
        return this.f1635d.indexOf(obj);
    }

    @Override // c.f.g
    public int f(Object obj) {
        return this.f1635d.indexOf(obj);
    }

    @Override // c.f.g
    public void g(E e2, E e3) {
        this.f1635d.add(e2);
    }

    @Override // c.f.g
    public void h(int i2) {
        this.f1635d.e(i2);
    }

    @Override // c.f.g
    public E i(int i2, E e2) {
        throw new UnsupportedOperationException("not a map");
    }
}
