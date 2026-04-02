package c.c0.d0.t;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class j implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public final Executor f1540b;

    /* renamed from: d  reason: collision with root package name */
    public volatile Runnable f1542d;
    public final ArrayDeque<a> a = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final Object f1541c = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final j a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f1543b;

        public a(j jVar, Runnable runnable) {
            this.a = jVar;
            this.f1543b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1543b.run();
            } finally {
                this.a.a();
            }
        }
    }

    public j(Executor executor) {
        this.f1540b = executor;
    }

    public void a() {
        synchronized (this.f1541c) {
            a poll = this.a.poll();
            this.f1542d = poll;
            if (poll != null) {
                this.f1540b.execute(this.f1542d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f1541c) {
            this.a.add(new a(this, runnable));
            if (this.f1542d == null) {
                a();
            }
        }
    }
}
