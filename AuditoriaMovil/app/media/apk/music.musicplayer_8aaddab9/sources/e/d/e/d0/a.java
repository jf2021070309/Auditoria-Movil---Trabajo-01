package e.d.e.d0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
/* loaded from: classes2.dex */
public class a<T> {
    public final Class<? super T> a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f7896b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7897c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type a = e.d.e.c0.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f7896b = a;
        this.a = (Class<? super T>) e.d.e.c0.a.e(a);
        this.f7897c = a.hashCode();
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a = e.d.e.c0.a.a(type);
        this.f7896b = a;
        this.a = (Class<? super T>) e.d.e.c0.a.e(a);
        this.f7897c = a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && e.d.e.c0.a.c(this.f7896b, ((a) obj).f7896b);
    }

    public final int hashCode() {
        return this.f7897c;
    }

    public final String toString() {
        return e.d.e.c0.a.i(this.f7896b);
    }
}
