package e.c.a.m.s.c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class i implements e.c.a.m.s.c0.b {
    public final g<a, Object> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f5603b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f5604c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, e.c.a.m.s.c0.a<?>> f5605d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f5606e;

    /* renamed from: f  reason: collision with root package name */
    public int f5607f;

    /* loaded from: classes.dex */
    public static final class a implements l {
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public int f5608b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f5609c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // e.c.a.m.s.c0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f5608b == aVar.f5608b && this.f5609c == aVar.f5609c;
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.f5608b * 31;
            Class<?> cls = this.f5609c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Key{size=");
            y.append(this.f5608b);
            y.append("array=");
            y.append(this.f5609c);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c<a> {
        @Override // e.c.a.m.s.c0.c
        public a a() {
            return new a(this);
        }

        public a d(int i2, Class<?> cls) {
            a b2 = b();
            b2.f5608b = i2;
            b2.f5609c = cls;
            return b2;
        }
    }

    public i(int i2) {
        this.f5606e = i2;
    }

    @Override // e.c.a.m.s.c0.b
    public synchronized void a(int i2) {
        if (i2 >= 40) {
            synchronized (this) {
                g(0);
            }
        } else if (i2 >= 20 || i2 == 15) {
            g(this.f5606e / 2);
        }
    }

    @Override // e.c.a.m.s.c0.b
    public synchronized void b() {
        g(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.a.m.s.c0.b
    public synchronized <T> T c(int i2, Class<T> cls) {
        a b2;
        b2 = this.f5603b.b();
        b2.f5608b = i2;
        b2.f5609c = cls;
        return (T) i(b2, cls);
    }

    @Override // e.c.a.m.s.c0.b
    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        e.c.a.m.s.c0.a<T> h2 = h(cls);
        int b2 = h2.b(t);
        int a2 = h2.a() * b2;
        int i2 = 1;
        if (a2 <= this.f5606e / 2) {
            a d2 = this.f5603b.d(b2, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> j2 = j(cls);
            Integer num = (Integer) j2.get(Integer.valueOf(d2.f5608b));
            Integer valueOf = Integer.valueOf(d2.f5608b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            j2.put(valueOf, Integer.valueOf(i2));
            this.f5607f += a2;
            g(this.f5606e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    @Override // e.c.a.m.s.c0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T> T e(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f5607f     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L20
            int r4 = r5.f5606e     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L3a
            e.c.a.m.s.c0.i$b r6 = r5.f5603b     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            e.c.a.m.s.c0.i$a r6 = r6.d(r0, r7)     // Catch: java.lang.Throwable -> L4d
            goto L47
        L3a:
            e.c.a.m.s.c0.i$b r0 = r5.f5603b     // Catch: java.lang.Throwable -> L4d
            e.c.a.m.s.c0.l r0 = r0.b()     // Catch: java.lang.Throwable -> L4d
            e.c.a.m.s.c0.i$a r0 = (e.c.a.m.s.c0.i.a) r0     // Catch: java.lang.Throwable -> L4d
            r0.f5608b = r6     // Catch: java.lang.Throwable -> L4d
            r0.f5609c = r7     // Catch: java.lang.Throwable -> L4d
            r6 = r0
        L47:
            java.lang.Object r6 = r5.i(r6, r7)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            return r6
        L4d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.s.c0.i.e(int, java.lang.Class):java.lang.Object");
    }

    public final void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> j2 = j(cls);
        Integer num = (Integer) j2.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                j2.remove(Integer.valueOf(i2));
                return;
            } else {
                j2.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    public final void g(int i2) {
        while (this.f5607f > i2) {
            Object c2 = this.a.c();
            Objects.requireNonNull(c2, "Argument must not be null");
            e.c.a.m.s.c0.a h2 = h(c2.getClass());
            this.f5607f -= h2.a() * h2.b(c2);
            f(h2.b(c2), c2.getClass());
            if (Log.isLoggable(h2.f(), 2)) {
                h2.f();
                h2.b(c2);
            }
        }
    }

    public final <T> e.c.a.m.s.c0.a<T> h(Class<T> cls) {
        h hVar = (e.c.a.m.s.c0.a<T>) this.f5605d.get(cls);
        if (hVar == null) {
            if (cls.equals(int[].class)) {
                hVar = new h();
            } else if (!cls.equals(byte[].class)) {
                StringBuilder y = e.a.d.a.a.y("No array pool found for: ");
                y.append(cls.getSimpleName());
                throw new IllegalArgumentException(y.toString());
            } else {
                hVar = new f();
            }
            this.f5605d.put(cls, hVar);
        }
        return hVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        e.c.a.m.s.c0.a<T> h2 = h(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f5607f -= h2.a() * h2.b(t);
            f(h2.b(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(h2.f(), 2)) {
                h2.f();
            }
            return h2.newArray(aVar.f5608b);
        }
        return t;
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f5604c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f5604c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }
}
