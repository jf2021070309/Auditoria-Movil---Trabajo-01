package m;

import j.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.a;
import m.c;
import m.j;
/* loaded from: classes.dex */
public final class c0 {
    public final Map<Method, d0<?>> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f9846b;

    /* renamed from: c  reason: collision with root package name */
    public final j.s f9847c;

    /* renamed from: d  reason: collision with root package name */
    public final List<j.a> f9848d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f9849e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Executor f9850f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9851g;

    public c0(d.a aVar, j.s sVar, List<j.a> list, List<c.a> list2, @Nullable Executor executor, boolean z) {
        this.f9846b = aVar;
        this.f9847c = sVar;
        this.f9848d = list;
        this.f9849e = list2;
        this.f9850f = executor;
        this.f9851g = z;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f9849e.indexOf(null) + 1;
        int size = this.f9849e.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            c<?, ?> a = this.f9849e.get(i2).a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f9849e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9849e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public d0<?> b(Method method) {
        d0<?> d0Var;
        d0<?> d0Var2 = this.a.get(method);
        if (d0Var2 != null) {
            return d0Var2;
        }
        synchronized (this.a) {
            d0Var = this.a.get(method);
            if (d0Var == null) {
                d0Var = d0.b(this, method);
                this.a.put(method, d0Var);
            }
        }
        return d0Var;
    }

    public <T> j<T, j.c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f9848d.indexOf(null) + 1;
        int size = this.f9848d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            j<T, j.c0> jVar = (j<T, j.c0>) this.f9848d.get(i2).a(type, annotationArr, annotationArr2, this);
            if (jVar != null) {
                return jVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f9848d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9848d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> j<j.f0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f9848d.indexOf(null) + 1;
        int size = this.f9848d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            j<j.f0, T> jVar = (j<j.f0, T>) this.f9848d.get(i2).b(type, annotationArr, this);
            if (jVar != null) {
                return jVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f9848d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9848d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> j<T, String> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f9848d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(this.f9848d.get(i2));
        }
        return a.d.a;
    }
}
