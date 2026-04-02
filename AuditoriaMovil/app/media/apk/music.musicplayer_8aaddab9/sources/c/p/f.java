package c.p;

import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2453b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2454c;
    public boolean a = true;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Runnable> f2455d = new ArrayDeque();

    public final boolean a() {
        return this.f2453b || !this.a;
    }

    public final void b() {
        if (this.f2454c) {
            return;
        }
        try {
            this.f2454c = true;
            while ((!this.f2455d.isEmpty()) && a()) {
                Runnable poll = this.f2455d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f2454c = false;
        }
    }

    public final void c(Runnable runnable) {
        if (!this.f2455d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        b();
    }
}
