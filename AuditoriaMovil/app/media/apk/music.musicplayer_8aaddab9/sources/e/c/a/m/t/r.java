package e.c.a.m.t;

import e.c.a.g;
import e.c.a.m.t.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class r {
    public static final c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final n<Object, Object> f5815b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<b<?, ?>> f5816c;

    /* renamed from: d  reason: collision with root package name */
    public final c f5817d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<b<?, ?>> f5818e;

    /* renamed from: f  reason: collision with root package name */
    public final c.i.j.c<List<Throwable>> f5819f;

    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // e.c.a.m.t.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // e.c.a.m.t.n
        public n.a<Object> b(Object obj, int i2, int i3, e.c.a.m.m mVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        public final Class<Model> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f5820b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f5821c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.f5820b = cls2;
            this.f5821c = oVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public r(c.i.j.c<List<Throwable>> cVar) {
        c cVar2 = a;
        this.f5816c = new ArrayList();
        this.f5818e = new HashSet();
        this.f5819f = cVar;
        this.f5817d = cVar2;
    }

    public final <Model, Data> n<Model, Data> a(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f5821c.b(this);
        Objects.requireNonNull(nVar, "Argument must not be null");
        return nVar;
    }

    public synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f5816c) {
                if (this.f5818e.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.f5820b.isAssignableFrom(cls2)) {
                    this.f5818e.add(bVar);
                    arrayList.add(a(bVar));
                    this.f5818e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f5817d;
                c.i.j.c<List<Throwable>> cVar2 = this.f5819f;
                Objects.requireNonNull(cVar);
                return new q(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return (n<Model, Data>) f5815b;
            } else {
                throw new g.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f5818e.clear();
            throw th;
        }
    }

    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f5816c) {
                if (!this.f5818e.contains(bVar) && bVar.a.isAssignableFrom(cls)) {
                    this.f5818e.add(bVar);
                    n<? extends Object, ? extends Object> b2 = bVar.f5821c.b(this);
                    Objects.requireNonNull(b2, "Argument must not be null");
                    arrayList.add(b2);
                    this.f5818e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f5818e.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f5816c) {
            if (!arrayList.contains(bVar.f5820b) && bVar.a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f5820b);
            }
        }
        return arrayList;
    }
}
