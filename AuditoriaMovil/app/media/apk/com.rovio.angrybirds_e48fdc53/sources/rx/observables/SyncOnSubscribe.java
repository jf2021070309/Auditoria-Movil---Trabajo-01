package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public abstract class SyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {
    protected abstract S generateState();

    protected abstract S next(S s, Observer<? super T> observer);

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public final void call(Subscriber<? super T> subscriber) {
        try {
            a aVar = new a(subscriber, this, generateState());
            subscriber.add(aVar);
            subscriber.setProducer(aVar);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    protected void onUnsubscribe(S s) {
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action2<? super S, ? super Observer<? super T>> action2) {
        return new b(func0, new Func2<S, Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.1
            @Override // rx.functions.Func2
            /* renamed from: a */
            public S call(S s, Observer<? super T> observer) {
                Action2.this.call(s, observer);
                return s;
            }
        });
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action2<? super S, ? super Observer<? super T>> action2, Action1<? super S> action1) {
        return new b(func0, new Func2<S, Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.2
            @Override // rx.functions.Func2
            /* renamed from: a */
            public S call(S s, Observer<? super T> observer) {
                Action2.this.call(s, observer);
                return s;
            }
        }, action1);
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
        return new b(func0, func2, action1);
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
        return new b(func0, func2);
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(final Action1<? super Observer<? super T>> action1) {
        return new b(new Func2<Void, Observer<? super T>, Void>() { // from class: rx.observables.SyncOnSubscribe.3
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Void call(Void r2, Observer<? super T> observer) {
                Action1.this.call(observer);
                return r2;
            }
        });
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(final Action1<? super Observer<? super T>> action1, final Action0 action0) {
        return new b(new Func2<Void, Observer<? super T>, Void>() { // from class: rx.observables.SyncOnSubscribe.4
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Void call(Void r2, Observer<? super T> observer) {
                Action1.this.call(observer);
                return null;
            }
        }, new Action1<Void>() { // from class: rx.observables.SyncOnSubscribe.5
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Void r2) {
                Action0.this.call();
            }
        });
    }

    /* loaded from: classes4.dex */
    static final class b<S, T> extends SyncOnSubscribe<S, T> {
        private final Func0<? extends S> a;
        private final Func2<? super S, ? super Observer<? super T>, ? extends S> b;
        private final Action1<? super S> c;

        @Override // rx.observables.SyncOnSubscribe, rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) ((Subscriber) obj));
        }

        b(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
            this.a = func0;
            this.b = func2;
            this.c = action1;
        }

        public b(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
            this(func0, func2, null);
        }

        public b(Func2<S, Observer<? super T>, S> func2, Action1<? super S> action1) {
            this(null, func2, action1);
        }

        public b(Func2<S, Observer<? super T>, S> func2) {
            this(null, func2, null);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected S generateState() {
            if (this.a == null) {
                return null;
            }
            return this.a.call();
        }

        @Override // rx.observables.SyncOnSubscribe
        protected S next(S s, Observer<? super T> observer) {
            return this.b.call(s, observer);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected void onUnsubscribe(S s) {
            if (this.c != null) {
                this.c.call(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<S, T> extends AtomicLong implements Observer<T>, Producer, Subscription {
        private static final long serialVersionUID = -3736864024352728072L;
        private final Subscriber<? super T> a;
        private final SyncOnSubscribe<S, T> b;
        private boolean c;
        private boolean d;
        private S e;

        a(Subscriber<? super T> subscriber, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.a = subscriber;
            this.b = syncOnSubscribe;
            this.e = s;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0L, -1L)) {
                    b();
                    return;
                }
            } while (!compareAndSet(j, -2L));
        }

        private boolean a() {
            if (this.d || get() < -1) {
                set(-1L);
                b();
                return true;
            }
            return false;
        }

        private void b() {
            try {
                this.b.onUnsubscribe(this.e);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0 && BackpressureUtils.getAndAddRequest(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    c();
                } else {
                    a(j);
                }
            }
        }

        private void c() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.b;
            Subscriber<? super T> subscriber = this.a;
            do {
                try {
                    this.c = false;
                    a(syncOnSubscribe);
                } catch (Throwable th) {
                    a(subscriber, th);
                    return;
                }
            } while (!a());
        }

        private void a(Subscriber<? super T> subscriber, Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
                return;
            }
            this.d = true;
            subscriber.onError(th);
            unsubscribe();
        }

        private void a(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.b;
            Subscriber<? super T> subscriber = this.a;
            do {
                long j2 = j;
                do {
                    try {
                        this.c = false;
                        a(syncOnSubscribe);
                        if (!a()) {
                            if (this.c) {
                                j2--;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        a(subscriber, th);
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            a();
        }

        private void a(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.e = syncOnSubscribe.next(this.e, this);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if (!this.a.isUnsubscribed()) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if (!this.a.isUnsubscribed()) {
                this.a.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.c) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.c = true;
            this.a.onNext(t);
        }
    }
}
