package e.d.b.e.a.c;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class d0<T> implements e0, b0 {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile e0<T> f6991b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f6992c = a;

    public d0(e0<T> e0Var) {
        this.f6991b = e0Var;
    }

    public static <P extends e0<T>, T> b0<T> b(P p) {
        if (p instanceof b0) {
            return (b0) p;
        }
        Objects.requireNonNull(p);
        return new d0(p);
    }

    @Override // e.d.b.e.a.c.e0
    public final T a() {
        T t = (T) this.f6992c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.f6992c;
                if (t == obj) {
                    t = this.f6991b.a();
                    Object obj2 = this.f6992c;
                    if (obj2 != obj && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f6992c = t;
                    this.f6991b = null;
                }
            }
        }
        return t;
    }
}
