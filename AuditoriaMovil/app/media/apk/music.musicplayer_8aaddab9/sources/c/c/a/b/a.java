package c.c.a.b;

import c.c.a.b.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f1302e = new HashMap<>();

    @Override // c.c.a.b.b
    public b.c<K, V> a(K k2) {
        return this.f1302e.get(k2);
    }

    public boolean contains(K k2) {
        return this.f1302e.containsKey(k2);
    }

    @Override // c.c.a.b.b
    public V d(K k2, V v) {
        b.c<K, V> cVar = this.f1302e.get(k2);
        if (cVar != null) {
            return cVar.f1306b;
        }
        this.f1302e.put(k2, c(k2, v));
        return null;
    }

    @Override // c.c.a.b.b
    public V e(K k2) {
        V v = (V) super.e(k2);
        this.f1302e.remove(k2);
        return v;
    }
}
