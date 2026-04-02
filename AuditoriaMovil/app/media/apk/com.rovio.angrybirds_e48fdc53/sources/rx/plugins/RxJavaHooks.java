package rx.plugins;

import java.util.concurrent.ScheduledExecutorService;
import rx.Completable;
import rx.Observable;
import rx.Scheduler;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.OnSubscribeOnAssembly;
import rx.internal.operators.OnSubscribeOnAssemblyCompletable;
import rx.internal.operators.OnSubscribeOnAssemblySingle;
/* loaded from: classes4.dex */
public final class RxJavaHooks {
    static volatile boolean a;
    static volatile Action1<Throwable> b;
    static volatile Func1<Observable.OnSubscribe, Observable.OnSubscribe> c;
    static volatile Func1<Single.OnSubscribe, Single.OnSubscribe> d;
    static volatile Func1<Completable.OnSubscribe, Completable.OnSubscribe> e;
    static volatile Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> f;
    static volatile Func2<Single, Observable.OnSubscribe, Observable.OnSubscribe> g;
    static volatile Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> h;
    static volatile Func1<Scheduler, Scheduler> i;
    static volatile Func1<Scheduler, Scheduler> j;
    static volatile Func1<Scheduler, Scheduler> k;
    static volatile Func1<Action0, Action0> l;
    static volatile Func1<Subscription, Subscription> m;
    static volatile Func1<Subscription, Subscription> n;
    static volatile Func0<? extends ScheduledExecutorService> o;
    static volatile Func1<Throwable, Throwable> p;
    static volatile Func1<Throwable, Throwable> q;
    static volatile Func1<Throwable, Throwable> r;
    static volatile Func1<Observable.Operator, Observable.Operator> s;
    static volatile Func1<Observable.Operator, Observable.Operator> t;
    static volatile Func1<Completable.Operator, Completable.Operator> u;

    static {
        a();
    }

    private RxJavaHooks() {
        throw new IllegalStateException("No instances!");
    }

    static void a() {
        b = new Action1<Throwable>() { // from class: rx.plugins.RxJavaHooks.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Throwable th) {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
            }
        };
        f = new Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.12
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Observable.OnSubscribe call(Observable observable, Observable.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeStart(observable, onSubscribe);
            }
        };
        m = new Func1<Subscription, Subscription>() { // from class: rx.plugins.RxJavaHooks.13
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Subscription call(Subscription subscription) {
                return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeReturn(subscription);
            }
        };
        g = new Func2<Single, Observable.OnSubscribe, Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.14
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Observable.OnSubscribe call(Single single, Observable.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeStart(single, onSubscribe);
            }
        };
        n = new Func1<Subscription, Subscription>() { // from class: rx.plugins.RxJavaHooks.15
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Subscription call(Subscription subscription) {
                return RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeReturn(subscription);
            }
        };
        h = new Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.16
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Completable.OnSubscribe call(Completable completable, Completable.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeStart(completable, onSubscribe);
            }
        };
        l = new Func1<Action0, Action0>() { // from class: rx.plugins.RxJavaHooks.17
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Action0 call(Action0 action0) {
                return RxJavaPlugins.getInstance().getSchedulersHook().onSchedule(action0);
            }
        };
        p = new Func1<Throwable, Throwable>() { // from class: rx.plugins.RxJavaHooks.18
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Throwable call(Throwable th) {
                return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeError(th);
            }
        };
        s = new Func1<Observable.Operator, Observable.Operator>() { // from class: rx.plugins.RxJavaHooks.19
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Observable.Operator call(Observable.Operator operator) {
                return RxJavaPlugins.getInstance().getObservableExecutionHook().onLift(operator);
            }
        };
        q = new Func1<Throwable, Throwable>() { // from class: rx.plugins.RxJavaHooks.2
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Throwable call(Throwable th) {
                return RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeError(th);
            }
        };
        t = new Func1<Observable.Operator, Observable.Operator>() { // from class: rx.plugins.RxJavaHooks.3
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Observable.Operator call(Observable.Operator operator) {
                return RxJavaPlugins.getInstance().getSingleExecutionHook().onLift(operator);
            }
        };
        r = new Func1<Throwable, Throwable>() { // from class: rx.plugins.RxJavaHooks.4
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Throwable call(Throwable th) {
                return RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeError(th);
            }
        };
        u = new Func1<Completable.Operator, Completable.Operator>() { // from class: rx.plugins.RxJavaHooks.5
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Completable.Operator call(Completable.Operator operator) {
                return RxJavaPlugins.getInstance().getCompletableExecutionHook().onLift(operator);
            }
        };
        b();
    }

    static void b() {
        c = new Func1<Observable.OnSubscribe, Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.6
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Observable.OnSubscribe call(Observable.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getObservableExecutionHook().onCreate(onSubscribe);
            }
        };
        d = new Func1<Single.OnSubscribe, Single.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.7
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Single.OnSubscribe call(Single.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getSingleExecutionHook().onCreate(onSubscribe);
            }
        };
        e = new Func1<Completable.OnSubscribe, Completable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.8
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Completable.OnSubscribe call(Completable.OnSubscribe onSubscribe) {
                return RxJavaPlugins.getInstance().getCompletableExecutionHook().onCreate(onSubscribe);
            }
        };
    }

    public static void reset() {
        if (!a) {
            a();
            i = null;
            j = null;
            k = null;
            o = null;
        }
    }

    public static void clear() {
        if (!a) {
            b = null;
            c = null;
            f = null;
            m = null;
            p = null;
            s = null;
            d = null;
            g = null;
            n = null;
            q = null;
            t = null;
            e = null;
            h = null;
            r = null;
            u = null;
            i = null;
            j = null;
            k = null;
            l = null;
            o = null;
        }
    }

    public static void lockdown() {
        a = true;
    }

    public static boolean isLockdown() {
        return a;
    }

    public static void onError(Throwable th) {
        Action1<Throwable> action1 = b;
        if (action1 != null) {
            try {
                action1.call(th);
                return;
            } catch (Throwable th2) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => " + th2.getMessage());
                th2.printStackTrace();
                a(th2);
            }
        }
        a(th);
    }

    static void a(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static <T> Observable.OnSubscribe<T> onCreate(Observable.OnSubscribe<T> onSubscribe) {
        Func1<Observable.OnSubscribe, Observable.OnSubscribe> func1 = c;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static <T> Single.OnSubscribe<T> onCreate(Single.OnSubscribe<T> onSubscribe) {
        Func1<Single.OnSubscribe, Single.OnSubscribe> func1 = d;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static Completable.OnSubscribe onCreate(Completable.OnSubscribe onSubscribe) {
        Func1<Completable.OnSubscribe, Completable.OnSubscribe> func1 = e;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static Scheduler onComputationScheduler(Scheduler scheduler) {
        Func1<Scheduler, Scheduler> func1 = i;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static Scheduler onIOScheduler(Scheduler scheduler) {
        Func1<Scheduler, Scheduler> func1 = j;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static Scheduler onNewThreadScheduler(Scheduler scheduler) {
        Func1<Scheduler, Scheduler> func1 = k;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static Action0 onScheduledAction(Action0 action0) {
        Func1<Action0, Action0> func1 = l;
        return func1 != null ? func1.call(action0) : action0;
    }

    public static <T> Observable.OnSubscribe<T> onObservableStart(Observable<T> observable, Observable.OnSubscribe<T> onSubscribe) {
        Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> func2 = f;
        return func2 != null ? func2.call(observable, onSubscribe) : onSubscribe;
    }

    public static Subscription onObservableReturn(Subscription subscription) {
        Func1<Subscription, Subscription> func1 = m;
        return func1 != null ? func1.call(subscription) : subscription;
    }

    public static Throwable onObservableError(Throwable th) {
        Func1<Throwable, Throwable> func1 = p;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> Observable.Operator<R, T> onObservableLift(Observable.Operator<R, T> operator) {
        Func1<Observable.Operator, Observable.Operator> func1 = s;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static <T> Observable.OnSubscribe<T> onSingleStart(Single<T> single, Observable.OnSubscribe<T> onSubscribe) {
        Func2<Single, Observable.OnSubscribe, Observable.OnSubscribe> func2 = g;
        return func2 != null ? func2.call(single, onSubscribe) : onSubscribe;
    }

    public static Subscription onSingleReturn(Subscription subscription) {
        Func1<Subscription, Subscription> func1 = n;
        return func1 != null ? func1.call(subscription) : subscription;
    }

    public static Throwable onSingleError(Throwable th) {
        Func1<Throwable, Throwable> func1 = q;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> Observable.Operator<R, T> onSingleLift(Observable.Operator<R, T> operator) {
        Func1<Observable.Operator, Observable.Operator> func1 = t;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static <T> Completable.OnSubscribe onCompletableStart(Completable completable, Completable.OnSubscribe onSubscribe) {
        Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> func2 = h;
        return func2 != null ? func2.call(completable, onSubscribe) : onSubscribe;
    }

    public static Throwable onCompletableError(Throwable th) {
        Func1<Throwable, Throwable> func1 = r;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> Completable.Operator onCompletableLift(Completable.Operator operator) {
        Func1<Completable.Operator, Completable.Operator> func1 = u;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static void setOnError(Action1<Throwable> action1) {
        if (!a) {
            b = action1;
        }
    }

    public static void setOnCompletableCreate(Func1<Completable.OnSubscribe, Completable.OnSubscribe> func1) {
        if (!a) {
            e = func1;
        }
    }

    public static void setOnObservableCreate(Func1<Observable.OnSubscribe, Observable.OnSubscribe> func1) {
        if (!a) {
            c = func1;
        }
    }

    public static void setOnSingleCreate(Func1<Single.OnSubscribe, Single.OnSubscribe> func1) {
        if (!a) {
            d = func1;
        }
    }

    public static void setOnComputationScheduler(Func1<Scheduler, Scheduler> func1) {
        if (!a) {
            i = func1;
        }
    }

    public static void setOnIOScheduler(Func1<Scheduler, Scheduler> func1) {
        if (!a) {
            j = func1;
        }
    }

    public static void setOnNewThreadScheduler(Func1<Scheduler, Scheduler> func1) {
        if (!a) {
            k = func1;
        }
    }

    public static void setOnScheduleAction(Func1<Action0, Action0> func1) {
        if (!a) {
            l = func1;
        }
    }

    public static void setOnCompletableStart(Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> func2) {
        if (!a) {
            h = func2;
        }
    }

    public static void setOnObservableStart(Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> func2) {
        if (!a) {
            f = func2;
        }
    }

    public static void setOnSingleStart(Func2<Single, Observable.OnSubscribe, Observable.OnSubscribe> func2) {
        if (!a) {
            g = func2;
        }
    }

    public static void setOnObservableReturn(Func1<Subscription, Subscription> func1) {
        if (!a) {
            m = func1;
        }
    }

    public static void setOnSingleReturn(Func1<Subscription, Subscription> func1) {
        if (!a) {
            n = func1;
        }
    }

    public static void setOnSingleSubscribeError(Func1<Throwable, Throwable> func1) {
        if (!a) {
            q = func1;
        }
    }

    public static Func1<Throwable, Throwable> getOnSingleSubscribeError() {
        return q;
    }

    public static void setOnCompletableSubscribeError(Func1<Throwable, Throwable> func1) {
        if (!a) {
            r = func1;
        }
    }

    public static Func1<Throwable, Throwable> getOnCompletableSubscribeError() {
        return r;
    }

    public static void setOnObservableSubscribeError(Func1<Throwable, Throwable> func1) {
        if (!a) {
            p = func1;
        }
    }

    public static Func1<Throwable, Throwable> getOnObservableSubscribeError() {
        return p;
    }

    public static void setOnObservableLift(Func1<Observable.Operator, Observable.Operator> func1) {
        if (!a) {
            s = func1;
        }
    }

    public static Func1<Observable.Operator, Observable.Operator> getOnObservableLift() {
        return s;
    }

    public static void setOnSingleLift(Func1<Observable.Operator, Observable.Operator> func1) {
        if (!a) {
            t = func1;
        }
    }

    public static Func1<Observable.Operator, Observable.Operator> getOnSingleLift() {
        return t;
    }

    public static void setOnCompletableLift(Func1<Completable.Operator, Completable.Operator> func1) {
        if (!a) {
            u = func1;
        }
    }

    public static Func1<Completable.Operator, Completable.Operator> getOnCompletableLift() {
        return u;
    }

    public static Func1<Scheduler, Scheduler> getOnComputationScheduler() {
        return i;
    }

    public static Action1<Throwable> getOnError() {
        return b;
    }

    public static Func1<Scheduler, Scheduler> getOnIOScheduler() {
        return j;
    }

    public static Func1<Scheduler, Scheduler> getOnNewThreadScheduler() {
        return k;
    }

    public static Func1<Observable.OnSubscribe, Observable.OnSubscribe> getOnObservableCreate() {
        return c;
    }

    public static Func1<Action0, Action0> getOnScheduleAction() {
        return l;
    }

    public static Func1<Single.OnSubscribe, Single.OnSubscribe> getOnSingleCreate() {
        return d;
    }

    public static Func1<Completable.OnSubscribe, Completable.OnSubscribe> getOnCompletableCreate() {
        return e;
    }

    public static Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> getOnCompletableStart() {
        return h;
    }

    public static Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> getOnObservableStart() {
        return f;
    }

    public static Func2<Single, Observable.OnSubscribe, Observable.OnSubscribe> getOnSingleStart() {
        return g;
    }

    public static Func1<Subscription, Subscription> getOnObservableReturn() {
        return m;
    }

    public static Func1<Subscription, Subscription> getOnSingleReturn() {
        return n;
    }

    public static void resetAssemblyTracking() {
        if (!a) {
            b();
        }
    }

    public static void clearAssemblyTracking() {
        if (!a) {
            c = null;
            d = null;
            e = null;
        }
    }

    public static void enableAssemblyTracking() {
        if (!a) {
            c = new Func1<Observable.OnSubscribe, Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.9
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Observable.OnSubscribe call(Observable.OnSubscribe onSubscribe) {
                    return new OnSubscribeOnAssembly(onSubscribe);
                }
            };
            d = new Func1<Single.OnSubscribe, Single.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.10
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Single.OnSubscribe call(Single.OnSubscribe onSubscribe) {
                    return new OnSubscribeOnAssemblySingle(onSubscribe);
                }
            };
            e = new Func1<Completable.OnSubscribe, Completable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.11
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Completable.OnSubscribe call(Completable.OnSubscribe onSubscribe) {
                    return new OnSubscribeOnAssemblyCompletable(onSubscribe);
                }
            };
        }
    }

    public static void setOnGenericScheduledExecutorService(Func0<? extends ScheduledExecutorService> func0) {
        if (!a) {
            o = func0;
        }
    }

    public static Func0<? extends ScheduledExecutorService> getOnGenericScheduledExecutorService() {
        return o;
    }
}
