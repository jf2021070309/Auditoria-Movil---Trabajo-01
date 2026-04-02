package e.d.b.b.j.c0.i;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d0 implements g.a.a {
    public final g.a.a<Context> a;

    public d0(g.a.a<Context> aVar) {
        this.a = aVar;
    }

    @Override // g.a.a
    public Object get() {
        String packageName = this.a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
