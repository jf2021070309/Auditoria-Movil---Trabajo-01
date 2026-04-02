package e.d.d.l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class f0 extends m {
    public final Set<Class<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<?>> f7098b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Class<?>> f7099c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<?>> f7100d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Class<?>> f7101e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f7102f;

    /* renamed from: g  reason: collision with root package name */
    public final o f7103g;

    /* loaded from: classes2.dex */
    public static class a implements e.d.d.q.c {
        public final e.d.d.q.c a;

        public a(Set<Class<?>> set, e.d.d.q.c cVar) {
            this.a = cVar;
        }
    }

    public f0(n<?> nVar, o oVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (w wVar : nVar.f7107b) {
            int i2 = wVar.f7129c;
            if (!(i2 == 0)) {
                if (i2 == 2) {
                    hashSet3.add(wVar.a);
                } else if (wVar.c()) {
                    hashSet5.add(wVar.a);
                } else {
                    hashSet2.add(wVar.a);
                }
            } else if (wVar.c()) {
                hashSet4.add(wVar.a);
            } else {
                hashSet.add(wVar.a);
            }
        }
        if (!nVar.f7111f.isEmpty()) {
            hashSet.add(e.d.d.q.c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f7098b = Collections.unmodifiableSet(hashSet2);
        this.f7099c = Collections.unmodifiableSet(hashSet3);
        this.f7100d = Collections.unmodifiableSet(hashSet4);
        this.f7101e = Collections.unmodifiableSet(hashSet5);
        this.f7102f = nVar.f7111f;
        this.f7103g = oVar;
    }

    @Override // e.d.d.l.m, e.d.d.l.o
    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = (T) this.f7103g.a(cls);
            return !cls.equals(e.d.d.q.c.class) ? t : (T) new a(this.f7102f, (e.d.d.q.c) t);
        }
        throw new y(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // e.d.d.l.o
    public <T> e.d.d.t.b<T> b(Class<T> cls) {
        if (this.f7098b.contains(cls)) {
            return this.f7103g.b(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // e.d.d.l.o
    public <T> e.d.d.t.b<Set<T>> c(Class<T> cls) {
        if (this.f7101e.contains(cls)) {
            return this.f7103g.c(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // e.d.d.l.m, e.d.d.l.o
    public <T> Set<T> d(Class<T> cls) {
        if (this.f7100d.contains(cls)) {
            return this.f7103g.d(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // e.d.d.l.o
    public <T> e.d.d.t.a<T> e(Class<T> cls) {
        if (this.f7099c.contains(cls)) {
            return this.f7103g.e(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
