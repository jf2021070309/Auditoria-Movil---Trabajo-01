package e.d.b.b.j;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class q implements Executor {
    public final Executor a;

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e2) {
                c.t.m.h("Executor", "Background execution failure.", e2);
            }
        }
    }

    public q(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
