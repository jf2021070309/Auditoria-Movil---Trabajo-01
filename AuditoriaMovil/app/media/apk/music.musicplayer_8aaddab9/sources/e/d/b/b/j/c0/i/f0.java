package e.d.b.b.j.c0.i;

import java.util.Objects;
/* loaded from: classes.dex */
public final class f0 implements g.a.a {

    /* loaded from: classes.dex */
    public static final class a {
        public static final f0 a = new f0();
    }

    @Override // g.a.a
    public Object get() {
        b0 b0Var = b0.a;
        Objects.requireNonNull(b0Var, "Cannot return null from a non-@Nullable @Provides method");
        return b0Var;
    }
}
