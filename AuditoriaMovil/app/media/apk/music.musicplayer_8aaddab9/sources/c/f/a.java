package c.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public g<K, V> f1633h;

    /* renamed from: c.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0028a extends g<K, V> {
        public C0028a() {
        }

        @Override // c.f.g
        public void a() {
            a.this.clear();
        }

        @Override // c.f.g
        public Object b(int i2, int i3) {
            return a.this.f1664f[(i2 << 1) + i3];
        }

        @Override // c.f.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // c.f.g
        public int d() {
            return a.this.f1665g;
        }

        @Override // c.f.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // c.f.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // c.f.g
        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // c.f.g
        public void h(int i2) {
            a.this.j(i2);
        }

        @Override // c.f.g
        public V i(int i2, V v) {
            return a.this.k(i2, v);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public a(h hVar) {
        if (hVar != null) {
            i(hVar);
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().k();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().l();
    }

    public final g<K, V> m() {
        if (this.f1633h == null) {
            this.f1633h = new C0028a();
        }
        return this.f1633h;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f1665g);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().m();
    }
}
