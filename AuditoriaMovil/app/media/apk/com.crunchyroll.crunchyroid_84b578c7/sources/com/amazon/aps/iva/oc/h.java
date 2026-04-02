package com.amazon.aps.iva.oc;

import android.util.Log;
import com.amazon.aps.iva.ga.m;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.oc.b {
    public final f<a, Object> a = new f<>();
    public final b b = new b();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class a implements k {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.amazon.aps.iva.oc.k
        public final void a() {
            this.a.g(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b || this.c != aVar.c) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int i2 = this.b * 31;
            Class<?> cls = this.c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class b extends m {
        @Override // com.amazon.aps.iva.ga.m
        public final k b() {
            return new a(this);
        }
    }

    public h(int i) {
        this.e = i;
    }

    @Override // com.amazon.aps.iva.oc.b
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.oc.b
    public final synchronized void b() {
        f(0);
    }

    @Override // com.amazon.aps.iva.oc.b
    public final synchronized Object c(Class cls, int i) {
        a aVar;
        boolean z;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i));
        boolean z2 = false;
        if (ceilingKey != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2) {
                z = false;
                if (!z || ceilingKey.intValue() <= i * 8) {
                    z2 = true;
                }
            }
            z = true;
            if (!z) {
            }
            z2 = true;
        }
        if (z2) {
            b bVar = this.b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.f();
            aVar.b = intValue;
            aVar.c = cls;
        } else {
            a aVar2 = (a) this.b.f();
            aVar2.b = i;
            aVar2.c = cls;
            aVar = aVar2;
        }
        return h(aVar, cls);
    }

    @Override // com.amazon.aps.iva.oc.b
    public final synchronized Object d() {
        a aVar;
        aVar = (a) this.b.f();
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(Class cls, int i) {
        NavigableMap<Integer, Integer> i2 = i(cls);
        Integer num = i2.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                i2.remove(Integer.valueOf(i));
                return;
            } else {
                i2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object c = this.a.c();
            defpackage.i.l(c);
            com.amazon.aps.iva.oc.a g = g(c.getClass());
            this.f -= g.a() * g.b(c);
            e(c.getClass(), g.b(c));
            if (Log.isLoggable(g.getTag(), 2)) {
                g.getTag();
                g.b(c);
            }
        }
    }

    public final <T> com.amazon.aps.iva.oc.a<T> g(Class<T> cls) {
        HashMap hashMap = this.d;
        com.amazon.aps.iva.oc.a<T> aVar = (com.amazon.aps.iva.oc.a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        com.amazon.aps.iva.oc.a<T> g = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= g.a() * g.b(t);
            e(cls, g.b(t));
        }
        if (t == null) {
            if (Log.isLoggable(g.getTag(), 2)) {
                g.getTag();
            }
            return g.newArray(aVar.b);
        }
        return t;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.amazon.aps.iva.oc.b
    public final synchronized <T> void put(T t) {
        boolean z;
        Class<?> cls = t.getClass();
        com.amazon.aps.iva.oc.a<T> g = g(cls);
        int b2 = g.b(t);
        int a2 = g.a() * b2;
        int i = 1;
        if (a2 <= this.e / 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        a aVar = (a) this.b.f();
        aVar.b = b2;
        aVar.c = cls;
        this.a.b(aVar, t);
        NavigableMap<Integer, Integer> i2 = i(cls);
        Integer num = i2.get(Integer.valueOf(aVar.b));
        Integer valueOf = Integer.valueOf(aVar.b);
        if (num != null) {
            i = 1 + num.intValue();
        }
        i2.put(valueOf, Integer.valueOf(i));
        this.f += a2;
        f(this.e);
    }
}
