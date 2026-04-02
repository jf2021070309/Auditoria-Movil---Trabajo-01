package i.a.k2;

import i.a.h0;
import i.a.y0;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class e extends y0 implements j, Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9121b = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: c  reason: collision with root package name */
    public final c f9122c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9123d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9124e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9125f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f9126g = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int i2, String str, int i3) {
        this.f9122c = cVar;
        this.f9123d = i2;
        this.f9124e = str;
        this.f9125f = i3;
    }

    @Override // i.a.k2.j
    public int B() {
        return this.f9125f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // i.a.c0
    public void e0(h.m.f fVar, Runnable runnable) {
        h0(runnable, false);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h0(runnable, false);
    }

    @Override // i.a.c0
    public void f0(h.m.f fVar, Runnable runnable) {
        h0(runnable, true);
    }

    public final void h0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9121b;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f9123d) {
                c cVar = this.f9122c;
                Objects.requireNonNull(cVar);
                try {
                    cVar.f9120f.i(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    h0.f8996g.o0(cVar.f9120f.f(runnable, this));
                    return;
                }
            }
            this.f9126g.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f9123d) {
                return;
            }
            runnable = this.f9126g.poll();
        } while (runnable != null);
    }

    @Override // i.a.k2.j
    public void r() {
        Runnable poll = this.f9126g.poll();
        if (poll != null) {
            c cVar = this.f9122c;
            Objects.requireNonNull(cVar);
            try {
                cVar.f9120f.i(poll, this, true);
                return;
            } catch (RejectedExecutionException unused) {
                h0.f8996g.o0(cVar.f9120f.f(poll, this));
                return;
            }
        }
        f9121b.decrementAndGet(this);
        Runnable poll2 = this.f9126g.poll();
        if (poll2 == null) {
            return;
        }
        h0(poll2, true);
    }

    @Override // i.a.c0
    public String toString() {
        String str = this.f9124e;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f9122c + ']';
        }
        return str;
    }
}
