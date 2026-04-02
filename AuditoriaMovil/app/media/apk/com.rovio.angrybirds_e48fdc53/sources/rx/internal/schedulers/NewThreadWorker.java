package rx.internal.schedulers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.util.PlatformDependent;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public class NewThreadWorker extends Scheduler.Worker implements Subscription {
    private static final boolean c;
    private static volatile Object f;
    volatile boolean a;
    private final ScheduledExecutorService b;
    private static final Object g = new Object();
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> d = new ConcurrentHashMap<>();
    private static final AtomicReference<ScheduledExecutorService> e = new AtomicReference<>();
    public static final int PURGE_FREQUENCY = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int androidApiVersion = PlatformDependent.getAndroidApiVersion();
        c = !z && (androidApiVersion == 0 || androidApiVersion >= 21);
    }

    public static void registerExecutor(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            if (e.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (e.compareAndSet(null, newScheduledThreadPool)) {
                newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: rx.internal.schedulers.NewThreadWorker.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NewThreadWorker.b();
                    }
                }, PURGE_FREQUENCY, PURGE_FREQUENCY, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        d.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static void deregisterExecutor(ScheduledExecutorService scheduledExecutorService) {
        d.remove(scheduledExecutorService);
    }

    static void b() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = d.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaHooks.onError(th);
        }
    }

    public static boolean tryEnableCancelPolicy(ScheduledExecutorService scheduledExecutorService) {
        Method a;
        if (c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f;
                if (obj == g) {
                    return false;
                }
                if (obj == null) {
                    a = a(scheduledExecutorService);
                    f = a != null ? a : g;
                } else {
                    a = (Method) obj;
                }
            } else {
                a = a(scheduledExecutorService);
            }
            if (a != null) {
                try {
                    a.invoke(scheduledExecutorService, true);
                    return true;
                } catch (IllegalAccessException e2) {
                    RxJavaHooks.onError(e2);
                } catch (IllegalArgumentException e3) {
                    RxJavaHooks.onError(e3);
                } catch (InvocationTargetException e4) {
                    RxJavaHooks.onError(e4);
                }
            }
        }
        return false;
    }

    static Method a(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods;
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!tryEnableCancelPolicy(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            registerExecutor((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.b = newScheduledThreadPool;
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0) {
        return schedule(action0, 0L, null);
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
        return this.a ? Subscriptions.unsubscribed() : scheduleActual(action0, j, timeUnit);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0));
        if (j <= 0) {
            schedule = this.b.submit(scheduledAction);
        } else {
            schedule = this.b.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit, CompositeSubscription compositeSubscription) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), compositeSubscription);
        compositeSubscription.add(scheduledAction);
        if (j <= 0) {
            schedule = this.b.submit(scheduledAction);
        } else {
            schedule = this.b.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit, SubscriptionList subscriptionList) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), subscriptionList);
        subscriptionList.add(scheduledAction);
        if (j <= 0) {
            schedule = this.b.submit(scheduledAction);
        } else {
            schedule = this.b.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.a = true;
        this.b.shutdownNow();
        deregisterExecutor(this.b);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a;
    }
}
