package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.Scheduler;
/* loaded from: classes4.dex */
public final class NewThreadScheduler extends Scheduler {
    private final ThreadFactory b;

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.b);
    }
}
