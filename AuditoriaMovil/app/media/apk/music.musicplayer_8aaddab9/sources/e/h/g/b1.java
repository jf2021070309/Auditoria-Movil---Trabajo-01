package e.h.g;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public abstract class b1<T> {
    public Thread a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<T> f8251b = new LinkedBlockingQueue();

    public b1() {
        Thread thread = new Thread(new Runnable() { // from class: e.h.g.t
            @Override // java.lang.Runnable
            public final void run() {
                b1 b1Var = b1.this;
                Objects.requireNonNull(b1Var);
                Thread.currentThread().setPriority(1);
                while (true) {
                    try {
                        b1Var.a(b1Var.f8251b.take());
                    } catch (InterruptedException unused) {
                    } catch (Exception e2) {
                        s1.l(e2, true);
                    }
                }
            }
        });
        this.a = thread;
        thread.start();
    }

    public abstract void a(T t);

    public void b(T t) {
        try {
            this.f8251b.put(t);
        } catch (InterruptedException e2) {
            s1.l(e2, true);
        }
    }
}
