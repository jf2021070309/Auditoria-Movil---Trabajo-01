package e.d.d.l;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class n<T> {
    public final Set<Class<? super T>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<w> f7107b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7108c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7109d;

    /* renamed from: e  reason: collision with root package name */
    public final q<T> f7110e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f7111f;

    /* loaded from: classes2.dex */
    public static class b<T> {
        public final Set<Class<? super T>> a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<w> f7112b;

        /* renamed from: c  reason: collision with root package name */
        public int f7113c;

        /* renamed from: d  reason: collision with root package name */
        public int f7114d;

        /* renamed from: e  reason: collision with root package name */
        public q<T> f7115e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f7116f;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.f7112b = new HashSet();
            this.f7113c = 0;
            this.f7114d = 0;
            this.f7116f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        public b<T> a(w wVar) {
            if (!this.a.contains(wVar.a)) {
                this.f7112b.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public n<T> b() {
            if (this.f7115e != null) {
                return new n<>(new HashSet(this.a), new HashSet(this.f7112b), this.f7113c, this.f7114d, this.f7115e, this.f7116f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> c(q<T> qVar) {
            this.f7115e = qVar;
            return this;
        }

        public final b<T> d(int i2) {
            if (this.f7113c == 0) {
                this.f7113c = i2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public n(Set set, Set set2, int i2, int i3, q qVar, Set set3, a aVar) {
        this.a = Collections.unmodifiableSet(set);
        this.f7107b = Collections.unmodifiableSet(set2);
        this.f7108c = i2;
        this.f7109d = i3;
        this.f7110e = qVar;
        this.f7111f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], null);
    }

    @SafeVarargs
    public static <T> n<T> h(final T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, null);
        bVar.c(new q() { // from class: e.d.d.l.b
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return t;
            }
        });
        return bVar.b();
    }

    public Set<w> b() {
        return this.f7107b;
    }

    public q<T> c() {
        return this.f7110e;
    }

    public Set<Class<? super T>> d() {
        return this.a;
    }

    public boolean e() {
        return this.f7108c == 1;
    }

    public boolean f() {
        return this.f7108c == 2;
    }

    public boolean g() {
        return this.f7109d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.f7108c + ", type=" + this.f7109d + ", deps=" + Arrays.toString(this.f7107b.toArray()) + "}";
    }
}
