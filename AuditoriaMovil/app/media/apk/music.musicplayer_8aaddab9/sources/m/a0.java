package m;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class a0<T> {
    public final j.d0 a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f9842b;

    public a0(j.d0 d0Var, @Nullable T t, @Nullable j.f0 f0Var) {
        this.a = d0Var;
        this.f9842b = t;
    }

    public static <T> a0<T> b(@Nullable T t, j.d0 d0Var) {
        if (d0Var.a()) {
            return new a0<>(d0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public boolean a() {
        return this.a.a();
    }

    public String toString() {
        return this.a.toString();
    }
}
