package e.d.b.e.a.a;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class a3 implements e.d.b.e.a.c.e0<Context> {
    public final v2 a;

    public a3(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // e.d.b.e.a.c.e0
    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
