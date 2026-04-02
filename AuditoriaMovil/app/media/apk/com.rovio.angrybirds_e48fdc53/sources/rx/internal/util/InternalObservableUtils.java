package rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.Observable;
import rx.Scheduler;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.OperatorAny;
import rx.observables.ConnectableObservable;
/* loaded from: classes4.dex */
public enum InternalObservableUtils {
    ;
    
    public static final h LONG_COUNTER = new h();
    public static final f OBJECT_EQUALS = new f();
    public static final q TO_ARRAY = new q();
    static final o a = new o();
    public static final g COUNTER = new g();
    static final e b = new e();
    public static final Action1<Throwable> ERROR_NOT_IMPLEMENTED = new Action1<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.c
        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final Observable.Operator<Boolean, Object> IS_EMPTY = new OperatorAny(UtilityFunctions.alwaysTrue(), true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g implements Func2<Integer, Object, Integer> {
        g() {
        }

        @Override // rx.functions.Func2
        /* renamed from: a */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h implements Func2<Long, Object, Long> {
        h() {
        }

        @Override // rx.functions.Func2
        /* renamed from: a */
        public Long call(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f implements Func2<Object, Object, Boolean> {
        f() {
        }

        @Override // rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q implements Func1<List<? extends Observable<?>>, Observable<?>[]> {
        q() {
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<?>[] call(List<? extends Observable<?>> list) {
            return (Observable[]) list.toArray(new Observable[list.size()]);
        }
    }

    public static Func1<Object, Boolean> equalsWith(Object obj) {
        return new b(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements Func1<Object, Boolean> {
        final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return Boolean.valueOf(obj == this.a || (obj != null && obj.equals(this.a)));
        }
    }

    public static Func1<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new d(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d implements Func1<Object, Boolean> {
        final Class<?> a;

        public d(Class<?> cls) {
            this.a = cls;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.a.isInstance(obj));
        }
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRepeatDematerializer(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        return new i(func1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        final Func1<? super Observable<? extends Void>, ? extends Observable<?>> a;

        public i(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return this.a.call(observable.map(InternalObservableUtils.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o implements Func1<Object, Void> {
        o() {
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Void call(Object obj) {
            return null;
        }
    }

    public static <T, R> Func1<Observable<T>, Observable<R>> createReplaySelectorAndObserveOn(Func1<? super Observable<T>, ? extends Observable<R>> func1, Scheduler scheduler) {
        return new p(func1, scheduler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p<T, R> implements Func1<Observable<T>, Observable<R>> {
        final Func1<? super Observable<T>, ? extends Observable<R>> a;
        final Scheduler b;

        public p(Func1<? super Observable<T>, ? extends Observable<R>> func1, Scheduler scheduler) {
            this.a = func1;
            this.b = scheduler;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<R> call(Observable<T> observable) {
            return this.a.call(observable).observeOn(this.b);
        }
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRetryDematerializer(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return new n(func1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        final Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> a;

        public n(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return this.a.call(observable.map(InternalObservableUtils.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e implements Func1<Notification<?>, Throwable> {
        e() {
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Notification<?> notification) {
            return notification.getThrowable();
        }
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable) {
        return new l(observable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l<T> implements Func0<ConnectableObservable<T>> {
        private final Observable<T> a;

        l(Observable<T> observable) {
            this.a = observable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable<T> call() {
            return this.a.replay();
        }
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i2) {
        return new j(observable, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j<T> implements Func0<ConnectableObservable<T>> {
        private final Observable<T> a;
        private final int b;

        j(Observable<T> observable, int i) {
            this.a = observable;
            this.b = i;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable<T> call() {
            return this.a.replay(this.b);
        }
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return new k(observable, j2, timeUnit, scheduler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k<T> implements Func0<ConnectableObservable<T>> {
        private final TimeUnit a;
        private final Observable<T> b;
        private final long c;
        private final Scheduler d;

        k(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = timeUnit;
            this.b = observable;
            this.c = j;
            this.d = scheduler;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable<T> call() {
            return this.b.replay(this.c, this.a, this.d);
        }
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return new m(observable, i2, j2, timeUnit, scheduler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m<T> implements Func0<ConnectableObservable<T>> {
        private final long a;
        private final TimeUnit b;
        private final Scheduler c;
        private final int d;
        private final Observable<T> e;

        m(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = j;
            this.b = timeUnit;
            this.c = scheduler;
            this.d = i;
            this.e = observable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable<T> call() {
            return this.e.replay(this.d, this.a, this.b, this.c);
        }
    }

    public static <T, R> Func2<R, T, R> createCollectorCaller(Action2<R, ? super T> action2) {
        return new a(action2);
    }

    /* loaded from: classes4.dex */
    static final class a<T, R> implements Func2<R, T, R> {
        final Action2<R, ? super T> a;

        public a(Action2<R, ? super T> action2) {
            this.a = action2;
        }

        @Override // rx.functions.Func2
        public R call(R r, T t) {
            this.a.call(r, t);
            return r;
        }
    }
}
