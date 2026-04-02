package e.d.e.c0;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
/* loaded from: classes2.dex */
public final class g {
    public final Map<Type, e.d.e.k<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.e.c0.a0.b f7812b = e.d.e.c0.a0.b.a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> implements t<T> {
        public final /* synthetic */ e.d.e.k a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f7813b;

        public a(g gVar, e.d.e.k kVar, Type type) {
            this.a = kVar;
            this.f7813b = type;
        }

        @Override // e.d.e.c0.t
        public T a() {
            return (T) this.a.a(this.f7813b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class b<T> implements t<T> {
        public final /* synthetic */ e.d.e.k a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f7814b;

        public b(g gVar, e.d.e.k kVar, Type type) {
            this.a = kVar;
            this.f7814b = type;
        }

        @Override // e.d.e.c0.t
        public T a() {
            return (T) this.a.a(this.f7814b);
        }
    }

    public g(Map<Type, e.d.e.k<?>> map) {
        this.a = map;
    }

    public <T> t<T> a(e.d.e.d0.a<T> aVar) {
        h hVar;
        Type type = aVar.f7896b;
        Class<? super T> cls = aVar.a;
        e.d.e.k<?> kVar = this.a.get(type);
        if (kVar != null) {
            return new a(this, kVar, type);
        }
        e.d.e.k<?> kVar2 = this.a.get(cls);
        if (kVar2 != null) {
            return new b(this, kVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f7812b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            tVar = SortedSet.class.isAssignableFrom(cls) ? new i<>(this) : EnumSet.class.isAssignableFrom(cls) ? new j<>(this, type) : Set.class.isAssignableFrom(cls) ? new k<>(this) : Queue.class.isAssignableFrom(cls) ? new l<>(this) : new m<>(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new n<>(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new e.d.e.c0.b<>(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new c<>(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a2 = e.d.e.c0.a.a(type2);
                    Class<?> e2 = e.d.e.c0.a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e2)) {
                        tVar = new d<>(this);
                    }
                }
                tVar = new e<>(this);
            }
        }
        return tVar != null ? tVar : new f(this, cls, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
