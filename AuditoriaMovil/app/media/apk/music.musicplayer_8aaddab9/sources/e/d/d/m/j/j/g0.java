package e.d.d.m.j.j;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public class g0 implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f7164b;

    /* loaded from: classes2.dex */
    public class a extends j {
        public final /* synthetic */ Runnable a;

        public a(g0 g0Var, Runnable runnable) {
            this.a = runnable;
        }

        @Override // e.d.d.m.j.j.j
        public void a() {
            this.a.run();
        }
    }

    public g0(String str, AtomicLong atomicLong) {
        this.a = str;
        this.f7164b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.a + this.f7164b.getAndIncrement());
        return newThread;
    }
}
