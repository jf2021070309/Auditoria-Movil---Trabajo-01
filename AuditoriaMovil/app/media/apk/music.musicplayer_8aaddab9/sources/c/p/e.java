package c.p;
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ f a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f2446b;

    public e(f fVar, Runnable runnable) {
        this.a = fVar;
        this.f2446b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.f2446b);
    }
}
