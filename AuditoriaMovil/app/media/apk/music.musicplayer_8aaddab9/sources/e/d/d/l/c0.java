package e.d.d.l;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class c0<T> implements e.d.d.t.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f7093b = null;
    public volatile Set<e.d.d.t.b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public c0(Collection<e.d.d.t.b<T>> collection) {
        this.a.addAll(collection);
    }

    public static c0<?> b(Collection<e.d.d.t.b<?>> collection) {
        return new c0<>((Set) collection);
    }

    public synchronized void a(e.d.d.t.b<T> bVar) {
        if (this.f7093b == null) {
            this.a.add(bVar);
        } else {
            this.f7093b.add(bVar.get());
        }
    }

    @Override // e.d.d.t.b
    public Object get() {
        if (this.f7093b == null) {
            synchronized (this) {
                if (this.f7093b == null) {
                    this.f7093b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        for (e.d.d.t.b<T> bVar : this.a) {
                            this.f7093b.add(bVar.get());
                        }
                        this.a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f7093b);
    }
}
