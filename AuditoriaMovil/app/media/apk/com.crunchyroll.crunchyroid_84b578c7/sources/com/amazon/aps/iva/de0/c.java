package com.amazon.aps.iva.de0;

import com.amazon.aps.iva.ee0.h;
import com.amazon.aps.iva.me0.e;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.oe0.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes4.dex */
public class c implements com.amazon.aps.iva.de0.l {
    public static final String d = q.N0(c.class.getCanonicalName(), ".", "");
    public static final a e = new a();
    public final com.amazon.aps.iva.de0.k a;
    public final d b;
    public final String c;

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class a extends c {
        public a() {
            super("NO_LOCKS", defpackage.i.c);
        }

        @Override // com.amazon.aps.iva.de0.c
        public final m k(Object obj, String str) {
            return new m(null, true);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class b<K, V> extends C0195c<K, V> implements com.amazon.aps.iva.de0.a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, ConcurrentHashMap concurrentHashMap) {
            super(cVar, concurrentHashMap);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                    }
                } else {
                    objArr[0] = "computation";
                }
            } else {
                objArr[0] = "map";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i != 2) {
                if (i != 3) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "computeIfAbsent";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final V c(K k, com.amazon.aps.iva.xb0.a<? extends V> aVar) {
            V invoke = invoke(new e(k, aVar));
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: com.amazon.aps.iva.de0.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0195c<K, V> extends j<e<K, V>, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0195c(c cVar, ConcurrentHashMap concurrentHashMap) {
            super(cVar, concurrentHashMap, new com.amazon.aps.iva.de0.f());
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                if (i != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "computation";
                }
            } else {
                objArr[0] = "map";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public interface d {
        public static final a a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* loaded from: classes4.dex */
        public static class a implements d {
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class e<K, V> {
        public final K a;
        public final com.amazon.aps.iva.xb0.a<? extends V> b;

        public e(K k, com.amazon.aps.iva.xb0.a<? extends V> aVar) {
            this.a = k;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass() && this.a.equals(((e) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static abstract class g<T> extends f<T> {
        public volatile n3 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c cVar, h.b bVar) {
            super(cVar, bVar);
            if (cVar != null) {
                this.e = null;
                return;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.de0.c.f
        public final void b(T t) {
            this.e = new n3(t);
            try {
                com.amazon.aps.iva.de0.e eVar = (com.amazon.aps.iva.de0.e) this;
                if (t != null) {
                    eVar.g.invoke(t);
                } else {
                    com.amazon.aps.iva.de0.e.a(2);
                    throw null;
                }
            } finally {
                this.e = null;
            }
        }

        @Override // com.amazon.aps.iva.de0.c.f, com.amazon.aps.iva.xb0.a
        public T invoke() {
            boolean z;
            n3 n3Var = this.e;
            if (n3Var != null) {
                boolean z2 = true;
                if (((Thread) n3Var.b) == Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((Thread) n3Var.b) != Thread.currentThread()) {
                        z2 = false;
                    }
                    if (z2) {
                        return (T) n3Var.c;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return (T) super.invoke();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class h<T> extends f<T> implements com.amazon.aps.iva.de0.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c cVar, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
            super(cVar, aVar);
            if (cVar != null) {
                if (aVar != null) {
                    return;
                } else {
                    a(1);
                    throw null;
                }
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 2) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // com.amazon.aps.iva.de0.c.f, com.amazon.aps.iva.xb0.a
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static abstract class i<T> extends g<T> implements com.amazon.aps.iva.de0.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c cVar, h.b bVar) {
            super(cVar, bVar);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 2) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // com.amazon.aps.iva.de0.c.g, com.amazon.aps.iva.de0.c.f, com.amazon.aps.iva.xb0.a
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class j<K, V> implements com.amazon.aps.iva.de0.h<K, V> {
        public final c b;
        public final ConcurrentMap<K, Object> c;
        public final com.amazon.aps.iva.xb0.l<? super K, ? extends V> d;

        public j(c cVar, ConcurrentHashMap concurrentHashMap, com.amazon.aps.iva.xb0.l lVar) {
            if (cVar != null) {
                this.b = cVar;
                this.c = concurrentHashMap;
                this.d = lVar;
                return;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 3 && i != 4) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3 && i != 4) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                    }
                } else {
                    objArr[0] = "compute";
                }
            } else {
                objArr[0] = "map";
            }
            if (i != 3) {
                if (i != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                } else {
                    objArr[1] = "raceCondition";
                }
            } else {
                objArr[1] = "recursionDetected";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3 || i == 4) {
                throw new IllegalStateException(format);
            }
        }

        public final AssertionError b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.b);
            c.l(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public V invoke(K k) {
            V v;
            ConcurrentMap<K, Object> concurrentMap = this.c;
            V v2 = (V) concurrentMap.get(k);
            e.a aVar = com.amazon.aps.iva.me0.e.a;
            Object obj = null;
            if (v2 != null && v2 != l.COMPUTING) {
                com.amazon.aps.iva.me0.e.a(v2);
                if (v2 == aVar) {
                    return null;
                }
                return v2;
            }
            c cVar = this.b;
            com.amazon.aps.iva.de0.k kVar = cVar.a;
            com.amazon.aps.iva.de0.k kVar2 = cVar.a;
            kVar.lock();
            try {
                Object obj2 = concurrentMap.get(k);
                l lVar = l.COMPUTING;
                if (obj2 == lVar) {
                    obj2 = l.RECURSION_WAS_DETECTED;
                    m k2 = cVar.k(k, "");
                    if (k2 != null) {
                        if (!k2.b) {
                            v = (V) k2.a;
                            return v;
                        }
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 == l.RECURSION_WAS_DETECTED) {
                    m k3 = cVar.k(k, "");
                    if (k3 != null) {
                        if (!k3.b) {
                            v = (V) k3.a;
                            return v;
                        }
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 != null) {
                    com.amazon.aps.iva.me0.e.a(obj2);
                    if (obj2 != aVar) {
                        obj = obj2;
                    }
                    v = (V) obj;
                    return v;
                }
                concurrentMap.put(k, lVar);
                V invoke = this.d.invoke(k);
                if (invoke != 0) {
                    aVar = invoke;
                }
                Object put = concurrentMap.put(k, aVar);
                if (put == lVar) {
                    return invoke;
                }
                throw b(k, put);
            } finally {
                kVar2.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class k<K, V> extends j<K, V> implements com.amazon.aps.iva.de0.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c cVar, ConcurrentHashMap concurrentHashMap, com.amazon.aps.iva.xb0.l lVar) {
            super(cVar, concurrentHashMap, lVar);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
                    }
                } else {
                    objArr[0] = "compute";
                }
            } else {
                objArr[0] = "map";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // com.amazon.aps.iva.de0.c.j, com.amazon.aps.iva.xb0.l
        public final V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v != null) {
                return v;
            }
            a(3);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public enum l {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class m<T> {
        public final T a;
        public final boolean b;

        public m(T t, boolean z) {
            this.a = t;
            this.b = z;
        }

        public final String toString() {
            if (this.b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.a);
        }
    }

    public c() {
        throw null;
    }

    public c(String str, com.amazon.aps.iva.de0.k kVar) {
        d.a aVar = d.a;
        this.a = kVar;
        this.b = aVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void i(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.de0.c.i(int):void");
    }

    public static void l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (!stackTrace[i2].getClassName().startsWith(d)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i2, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    @Override // com.amazon.aps.iva.de0.l
    public final b a() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // com.amazon.aps.iva.de0.l
    public final f b(com.amazon.aps.iva.xb0.a aVar) {
        return new f(this, aVar);
    }

    @Override // com.amazon.aps.iva.de0.l
    public final com.amazon.aps.iva.de0.d c(com.amazon.aps.iva.xb0.a aVar) {
        return new com.amazon.aps.iva.de0.d(this, aVar);
    }

    @Override // com.amazon.aps.iva.de0.l
    public final com.amazon.aps.iva.de0.e d(h.c cVar, h.d dVar, h.b bVar) {
        return new com.amazon.aps.iva.de0.e(this, bVar, cVar, dVar);
    }

    @Override // com.amazon.aps.iva.de0.l
    public final C0195c e() {
        return new C0195c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // com.amazon.aps.iva.de0.l
    public final k f(com.amazon.aps.iva.xb0.l lVar) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // com.amazon.aps.iva.de0.l
    public final h g(com.amazon.aps.iva.xb0.a aVar) {
        if (aVar != null) {
            return new h(this, aVar);
        }
        i(23);
        throw null;
    }

    @Override // com.amazon.aps.iva.de0.l
    public final j h(com.amazon.aps.iva.xb0.l lVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    public final Object j(com.amazon.aps.iva.lc0.j jVar) {
        com.amazon.aps.iva.de0.k kVar = this.a;
        kVar.lock();
        try {
            jVar.invoke();
            kVar.unlock();
            return null;
        } finally {
        }
    }

    public m k(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return defpackage.b.c(sb, this.c, ")");
    }

    public c(String str) {
        this(str, new com.amazon.aps.iva.de0.b(0));
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes4.dex */
    public static class f<T> implements com.amazon.aps.iva.de0.j<T> {
        public final c b;
        public final com.amazon.aps.iva.xb0.a<? extends T> c;
        public volatile Object d;

        public f(c cVar, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
            if (cVar != null) {
                if (aVar != null) {
                    this.d = l.NOT_COMPUTED;
                    this.b = cVar;
                    this.c = aVar;
                    return;
                }
                a(1);
                throw null;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 2 && i != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 2 && i != 3) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i != 2) {
                if (i != 3) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                } else {
                    objArr[1] = "renderDebugInformation";
                }
            } else {
                objArr[1] = "recursionDetected";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2 || i == 3) {
                throw new IllegalStateException(format);
            }
        }

        public m<T> c(boolean z) {
            m<T> k = this.b.k(null, "in a lazy value");
            if (k != null) {
                return k;
            }
            a(2);
            throw null;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public T invoke() {
            T t = (T) this.d;
            if (!(t instanceof l)) {
                com.amazon.aps.iva.me0.e.a(t);
                return t;
            }
            this.b.a.lock();
            try {
                T t2 = (T) this.d;
                if (!(t2 instanceof l)) {
                    com.amazon.aps.iva.me0.e.a(t2);
                } else {
                    l lVar = l.COMPUTING;
                    if (t2 == lVar) {
                        this.d = l.RECURSION_WAS_DETECTED;
                        m<T> c = c(true);
                        if (!c.b) {
                            t2 = c.a;
                        }
                    }
                    if (t2 == l.RECURSION_WAS_DETECTED) {
                        m<T> c2 = c(false);
                        if (!c2.b) {
                            t2 = c2.a;
                        }
                    }
                    this.d = lVar;
                    t2 = this.c.invoke();
                    b(t2);
                    this.d = t2;
                }
                return t2;
            } finally {
                this.b.a.unlock();
            }
        }

        public void b(T t) {
        }
    }
}
