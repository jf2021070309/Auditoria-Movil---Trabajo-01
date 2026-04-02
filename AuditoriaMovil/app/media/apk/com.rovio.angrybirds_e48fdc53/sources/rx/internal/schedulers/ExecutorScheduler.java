package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.MultipleAssignmentSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class ExecutorScheduler extends Scheduler {
    final Executor b;

    public ExecutorScheduler(Executor executor) {
        this.b = executor;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a(this.b);
    }

    /* loaded from: classes4.dex */
    static final class a extends Scheduler.Worker implements Runnable {
        final Executor a;
        final ConcurrentLinkedQueue<ScheduledAction> c = new ConcurrentLinkedQueue<>();
        final AtomicInteger d = new AtomicInteger();
        final CompositeSubscription b = new CompositeSubscription();
        final ScheduledExecutorService e = GenericScheduledExecutorService.getInstance();

        public a(Executor executor) {
            this.a = executor;
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), this.b);
            this.b.add(scheduledAction);
            this.c.offer(scheduledAction);
            if (this.d.getAndIncrement() == 0) {
                try {
                    this.a.execute(this);
                    return scheduledAction;
                } catch (RejectedExecutionException e) {
                    this.b.remove(scheduledAction);
                    this.d.decrementAndGet();
                    RxJavaHooks.onError(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.b.isUnsubscribed()) {
                ScheduledAction poll = this.c.poll();
                if (poll != null) {
                    if (!poll.isUnsubscribed()) {
                        if (!this.b.isUnsubscribed()) {
                            poll.run();
                        } else {
                            this.c.clear();
                            return;
                        }
                    }
                    if (this.d.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.c.clear();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(action0);
            }
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            final Action0 onScheduledAction = RxJavaHooks.onScheduledAction(action0);
            MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
            final MultipleAssignmentSubscription multipleAssignmentSubscription2 = new MultipleAssignmentSubscription();
            multipleAssignmentSubscription2.set(multipleAssignmentSubscription);
            this.b.add(multipleAssignmentSubscription2);
            final Subscription create = Subscriptions.create(new Action0() { // from class: rx.internal.schedulers.ExecutorScheduler.a.1
                @Override // rx.functions.Action0
                public void call() {
                    a.this.b.remove(multipleAssignmentSubscription2);
                }
            });
            ScheduledAction scheduledAction = new ScheduledAction(new Action0() { // from class: rx.internal.schedulers.ExecutorScheduler.a.2
                @Override // rx.functions.Action0
                public void call() {
                    if (!multipleAssignmentSubscription2.isUnsubscribed()) {
                        Subscription schedule = a.this.schedule(onScheduledAction);
                        multipleAssignmentSubscription2.set(schedule);
                        if (schedule.getClass() == ScheduledAction.class) {
                            ((ScheduledAction) schedule).add(create);
                        }
                    }
                }
            });
            multipleAssignmentSubscription.set(scheduledAction);
            try {
                scheduledAction.add(this.e.schedule(scheduledAction, j, timeUnit));
                return create;
            } catch (RejectedExecutionException e) {
                RxJavaHooks.onError(e);
                throw e;
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.b.unsubscribe();
            this.c.clear();
        }
    }
}
