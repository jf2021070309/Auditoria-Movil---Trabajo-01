package e.d.b.e.a.a;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class z2 implements e.d.b.e.a.c.e0<e3> {
    public final e.d.b.e.a.c.e0<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<o> f6989b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<p1> f6990c;

    public z2(e.d.b.e.a.c.e0<Context> e0Var, e.d.b.e.a.c.e0<o> e0Var2, e.d.b.e.a.c.e0<p1> e0Var3) {
        this.a = e0Var;
        this.f6989b = e0Var2;
        this.f6990c = e0Var3;
    }

    @Override // e.d.b.e.a.c.e0
    public final e3 a() {
        e3 e3Var = (e3) (v2.a(((a3) this.a).a()) == null ? e.d.b.e.a.c.d0.b(this.f6989b).a() : e.d.b.e.a.c.d0.b(this.f6990c).a());
        Objects.requireNonNull(e3Var, "Cannot return null from a non-@Nullable @Provides method");
        return e3Var;
    }
}
