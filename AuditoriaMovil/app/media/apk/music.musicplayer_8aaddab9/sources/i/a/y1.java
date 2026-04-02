package i.a;
/* loaded from: classes2.dex */
public final class y1 {
    public static final y1 a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<t0> f9180b = new ThreadLocal<>();

    public static final t0 a() {
        ThreadLocal<t0> threadLocal = f9180b;
        t0 t0Var = threadLocal.get();
        if (t0Var == null) {
            f fVar = new f(Thread.currentThread());
            threadLocal.set(fVar);
            return fVar;
        }
        return t0Var;
    }
}
