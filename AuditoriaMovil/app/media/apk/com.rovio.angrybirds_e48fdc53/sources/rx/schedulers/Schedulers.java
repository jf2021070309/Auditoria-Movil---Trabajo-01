package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.internal.schedulers.ExecutorScheduler;
import rx.internal.schedulers.GenericScheduledExecutorService;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.internal.util.RxRingBuffer;
import rx.plugins.RxJavaHooks;
import rx.plugins.RxJavaPlugins;
import rx.plugins.RxJavaSchedulersHook;
/* loaded from: classes4.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> d = new AtomicReference<>();
    private final Scheduler a;
    private final Scheduler b;
    private final Scheduler c;

    private static Schedulers c() {
        Schedulers schedulers;
        while (true) {
            schedulers = d.get();
            if (schedulers == null) {
                schedulers = new Schedulers();
                if (d.compareAndSet(null, schedulers)) {
                    break;
                }
                schedulers.b();
            } else {
                break;
            }
        }
        return schedulers;
    }

    private Schedulers() {
        RxJavaSchedulersHook schedulersHook = RxJavaPlugins.getInstance().getSchedulersHook();
        Scheduler computationScheduler = schedulersHook.getComputationScheduler();
        if (computationScheduler != null) {
            this.a = computationScheduler;
        } else {
            this.a = RxJavaSchedulersHook.createComputationScheduler();
        }
        Scheduler iOScheduler = schedulersHook.getIOScheduler();
        if (iOScheduler != null) {
            this.b = iOScheduler;
        } else {
            this.b = RxJavaSchedulersHook.createIoScheduler();
        }
        Scheduler newThreadScheduler = schedulersHook.getNewThreadScheduler();
        if (newThreadScheduler != null) {
            this.c = newThreadScheduler;
        } else {
            this.c = RxJavaSchedulersHook.createNewThreadScheduler();
        }
    }

    public static Scheduler immediate() {
        return rx.internal.schedulers.ImmediateScheduler.INSTANCE;
    }

    public static Scheduler trampoline() {
        return rx.internal.schedulers.TrampolineScheduler.INSTANCE;
    }

    public static Scheduler newThread() {
        return RxJavaHooks.onNewThreadScheduler(c().c);
    }

    public static Scheduler computation() {
        return RxJavaHooks.onComputationScheduler(c().a);
    }

    public static Scheduler io() {
        return RxJavaHooks.onIOScheduler(c().b);
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static Scheduler from(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    public static void reset() {
        Schedulers andSet = d.getAndSet(null);
        if (andSet != null) {
            andSet.b();
        }
    }

    public static void start() {
        Schedulers c = c();
        c.a();
        synchronized (c) {
            GenericScheduledExecutorService.INSTANCE.start();
            RxRingBuffer.SPSC_POOL.start();
            RxRingBuffer.SPMC_POOL.start();
        }
    }

    public static void shutdown() {
        Schedulers c = c();
        c.b();
        synchronized (c) {
            GenericScheduledExecutorService.INSTANCE.shutdown();
            RxRingBuffer.SPSC_POOL.shutdown();
            RxRingBuffer.SPMC_POOL.shutdown();
        }
    }

    synchronized void a() {
        if (this.a instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.a).start();
        }
        if (this.b instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.b).start();
        }
        if (this.c instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.c).start();
        }
    }

    synchronized void b() {
        if (this.a instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.a).shutdown();
        }
        if (this.b instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.b).shutdown();
        }
        if (this.c instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.c).shutdown();
        }
    }
}
