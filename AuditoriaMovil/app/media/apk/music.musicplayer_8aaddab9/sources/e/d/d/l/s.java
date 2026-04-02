package e.d.d.l;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class s extends m implements e.d.d.o.a {

    /* renamed from: d  reason: collision with root package name */
    public final List<e.d.d.t.b<r>> f7120d;

    /* renamed from: e  reason: collision with root package name */
    public final z f7121e;
    public final Map<n<?>, e.d.d.t.b<?>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.t.b<?>> f7118b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, c0<?>> f7119c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Boolean> f7122f = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static final class a {
        public final Executor a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e.d.d.t.b<r>> f7123b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final List<n<?>> f7124c = new ArrayList();

        public a(Executor executor) {
            this.a = executor;
        }

        public a a(n<?> nVar) {
            this.f7124c.add(nVar);
            return this;
        }

        public a b(final r rVar) {
            this.f7123b.add(new e.d.d.t.b() { // from class: e.d.d.l.e
                @Override // e.d.d.t.b
                public final Object get() {
                    return r.this;
                }
            });
            return this;
        }

        public a c(Collection<e.d.d.t.b<r>> collection) {
            this.f7123b.addAll(collection);
            return this;
        }

        public s d() {
            return new s(this.a, this.f7123b, this.f7124c);
        }
    }

    public s(Executor executor, Iterable<e.d.d.t.b<r>> iterable, Collection<n<?>> collection) {
        z zVar = new z(executor);
        this.f7121e = zVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.h(zVar, z.class, e.d.d.q.d.class, e.d.d.q.c.class));
        arrayList.add(n.h(this, e.d.d.o.a.class, new Class[0]));
        for (n<?> nVar : collection) {
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (e.d.d.t.b<r> bVar : iterable) {
            arrayList2.add(bVar);
        }
        this.f7120d = arrayList2;
        g(arrayList);
    }

    public static a f(Executor executor) {
        return new a(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object j(n nVar) {
        return nVar.c().a(new f0(nVar, this));
    }

    @Override // e.d.d.l.o
    public synchronized <T> e.d.d.t.b<T> b(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return (e.d.d.t.b<T>) this.f7118b.get(cls);
    }

    @Override // e.d.d.l.o
    public synchronized <T> e.d.d.t.b<Set<T>> c(Class<T> cls) {
        c0<?> c0Var = this.f7119c.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        return new e.d.d.t.b() { // from class: e.d.d.l.i
            @Override // e.d.d.t.b
            public final Object get() {
                return Collections.emptySet();
            }
        };
    }

    @Override // e.d.d.l.o
    public <T> e.d.d.t.a<T> e(Class<T> cls) {
        e.d.d.t.b<T> b2 = b(cls);
        return b2 == null ? e0.a() : b2 instanceof e0 ? (e0) b2 : e0.b(b2);
    }

    public final void g(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.d.d.t.b<r>> it = this.f7120d.iterator();
            while (it.hasNext()) {
                try {
                    r rVar = it.next().get();
                    if (rVar != null) {
                        list.addAll(rVar.getComponents());
                        it.remove();
                    }
                } catch (a0 e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.a.isEmpty()) {
                c.i.g.h.b(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                c.i.g.h.b(arrayList2);
            }
            for (final n<?> nVar : list) {
                this.a.put(nVar, new b0(new e.d.d.t.b() { // from class: e.d.d.l.d
                    @Override // e.d.d.t.b
                    public final Object get() {
                        return s.this.j(nVar);
                    }
                }));
            }
            arrayList.addAll(l(list));
            arrayList.addAll(m());
            k();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        Boolean bool = this.f7122f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    public final void h(Map<n<?>, e.d.d.t.b<?>> map, boolean z) {
        for (Map.Entry<n<?>, e.d.d.t.b<?>> entry : map.entrySet()) {
            n<?> key = entry.getKey();
            e.d.d.t.b<?> value = entry.getValue();
            if (key.e() || (key.f() && z)) {
                value.get();
            }
        }
        this.f7121e.c();
    }

    public final void k() {
        for (n<?> nVar : this.a.keySet()) {
            for (w wVar : nVar.b()) {
                if (wVar.c() && !this.f7119c.containsKey(wVar.a())) {
                    this.f7119c.put(wVar.a(), c0.b(Collections.emptySet()));
                } else if (this.f7118b.containsKey(wVar.a())) {
                    continue;
                } else if (wVar.b()) {
                    throw new d0(String.format("Unsatisfied dependency for component %s: %s", nVar, wVar.a()));
                } else {
                    if (!wVar.c()) {
                        this.f7118b.put(wVar.a(), e0.a());
                    }
                }
            }
        }
    }

    public final List<Runnable> l(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (n<?> nVar : list) {
            if (nVar.g()) {
                final e.d.d.t.b<?> bVar = this.a.get(nVar);
                for (Class<? super Object> cls : nVar.d()) {
                    if (this.f7118b.containsKey(cls)) {
                        final e0 e0Var = (e0) this.f7118b.get(cls);
                        arrayList.add(new Runnable() { // from class: e.d.d.l.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                e0.this.c(bVar);
                            }
                        });
                    } else {
                        this.f7118b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> m() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<n<?>, e.d.d.t.b<?>> entry : this.a.entrySet()) {
            n<?> key = entry.getKey();
            if (!key.g()) {
                e.d.d.t.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.d()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f7119c.containsKey(entry2.getKey())) {
                final c0<?> c0Var = this.f7119c.get(entry2.getKey());
                for (final e.d.d.t.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: e.d.d.l.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            c0.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f7119c.put((Class) entry2.getKey(), c0.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
