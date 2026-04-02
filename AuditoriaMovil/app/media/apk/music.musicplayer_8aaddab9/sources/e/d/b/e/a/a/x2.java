package e.d.b.e.a.a;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class x2 implements e.d.b.e.a.c.e0<Executor> {
    @Override // e.d.b.e.a.c.e0
    public final Executor a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(s2.a);
        Objects.requireNonNull(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }
}
