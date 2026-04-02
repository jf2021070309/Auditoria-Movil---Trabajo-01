package e.c.a.s;
/* loaded from: classes.dex */
public final class b<K, V> extends c.f.a<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public int f6021i;

    @Override // c.f.h, java.util.Map
    public void clear() {
        this.f6021i = 0;
        super.clear();
    }

    @Override // c.f.h, java.util.Map
    public int hashCode() {
        if (this.f6021i == 0) {
            this.f6021i = super.hashCode();
        }
        return this.f6021i;
    }

    @Override // c.f.h
    public void i(c.f.h<? extends K, ? extends V> hVar) {
        this.f6021i = 0;
        super.i(hVar);
    }

    @Override // c.f.h
    public V j(int i2) {
        this.f6021i = 0;
        return (V) super.j(i2);
    }

    @Override // c.f.h
    public V k(int i2, V v) {
        this.f6021i = 0;
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1664f;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    @Override // c.f.h, java.util.Map
    public V put(K k2, V v) {
        this.f6021i = 0;
        return (V) super.put(k2, v);
    }
}
