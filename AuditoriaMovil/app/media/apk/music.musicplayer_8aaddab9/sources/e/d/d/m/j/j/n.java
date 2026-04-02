package e.d.d.m.j.j;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class n implements Callable<Void> {
    public final /* synthetic */ Runnable a;

    public n(m mVar, Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.a.run();
        return null;
    }
}
