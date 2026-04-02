package e.c.a.m.s.c0;

import ch.qos.logback.core.CoreConstants;
import e.c.a.m.s.c0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K extends l, V> {
    public final a<K, V> a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f5599b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f5600b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f5601c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f5602d;

        public a() {
            this(null);
        }

        public a(K k2) {
            this.f5602d = this;
            this.f5601c = this;
            this.a = k2;
        }

        public V a() {
            List<V> list = this.f5600b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f5600b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k2) {
        a<K, V> aVar = this.f5599b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f5599b.put(k2, aVar);
        } else {
            k2.a();
        }
        a<K, V> aVar2 = aVar.f5602d;
        aVar2.f5601c = aVar.f5601c;
        aVar.f5601c.f5602d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.f5602d = aVar3;
        a<K, V> aVar4 = aVar3.f5601c;
        aVar.f5601c = aVar4;
        aVar4.f5602d = aVar;
        aVar.f5602d.f5601c = aVar;
        return aVar.a();
    }

    public void b(K k2, V v) {
        a<K, V> aVar = this.f5599b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            a<K, V> aVar2 = aVar.f5602d;
            aVar2.f5601c = aVar.f5601c;
            aVar.f5601c.f5602d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.f5602d = aVar3.f5602d;
            aVar.f5601c = aVar3;
            aVar3.f5602d = aVar;
            aVar.f5602d.f5601c = aVar;
            this.f5599b.put(k2, aVar);
        } else {
            k2.a();
        }
        if (aVar.f5600b == null) {
            aVar.f5600b = new ArrayList();
        }
        aVar.f5600b.add(v);
    }

    public V c() {
        for (a aVar = this.a.f5602d; !aVar.equals(this.a); aVar = aVar.f5602d) {
            V v = (V) aVar.a();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f5602d;
            aVar2.f5601c = aVar.f5601c;
            aVar.f5601c.f5602d = aVar2;
            this.f5599b.remove(aVar.a);
            ((l) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.a.f5601c; !aVar.equals(this.a); aVar = aVar.f5601c) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(CoreConstants.COLON_CHAR);
            List<V> list = aVar.f5600b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
