package rx.observables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Action3;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func3;
import rx.internal.operators.BufferUntilSubscriber;
import rx.observers.SerializedObserver;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public abstract class AsyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {
    protected abstract S generateState();

    protected abstract S next(S s, long j, Observer<Observable<? extends T>> observer);

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    protected void onUnsubscribe(S s) {
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3) {
        return new a(func0, new Func3<S, Long, Observer<Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.1
            @Override // rx.functions.Func3
            /* renamed from: a */
            public S call(S s, Long l, Observer<Observable<? extends T>> observer) {
                Action3.this.call(s, l, observer);
                return s;
            }
        });
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3, Action1<? super S> action1) {
        return new a(func0, new Func3<S, Long, Observer<Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.2
            @Override // rx.functions.Func3
            /* renamed from: a */
            public S call(S s, Long l, Observer<Observable<? extends T>> observer) {
                Action3.this.call(s, l, observer);
                return s;
            }
        }, action1);
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
        return new a(func0, func3, action1);
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
        return new a(func0, func3);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(final Action2<Long, ? super Observer<Observable<? extends T>>> action2) {
        return new a(new Func3<Void, Long, Observer<Observable<? extends T>>, Void>() { // from class: rx.observables.AsyncOnSubscribe.3
            @Override // rx.functions.Func3
            /* renamed from: a */
            public Void call(Void r2, Long l, Observer<Observable<? extends T>> observer) {
                Action2.this.call(l, observer);
                return r2;
            }
        });
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(final Action2<Long, ? super Observer<Observable<? extends T>>> action2, final Action0 action0) {
        return new a(new Func3<Void, Long, Observer<Observable<? extends T>>, Void>() { // from class: rx.observables.AsyncOnSubscribe.4
            @Override // rx.functions.Func3
            /* renamed from: a */
            public Void call(Void r2, Long l, Observer<Observable<? extends T>> observer) {
                Action2.this.call(l, observer);
                return null;
            }
        }, new Action1<Void>() { // from class: rx.observables.AsyncOnSubscribe.5
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Void r2) {
                Action0.this.call();
            }
        });
    }

    /* loaded from: classes4.dex */
    static final class a<S, T> extends AsyncOnSubscribe<S, T> {
        private final Func0<? extends S> a;
        private final Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> b;
        private final Action1<? super S> c;

        @Override // rx.observables.AsyncOnSubscribe, rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) ((Subscriber) obj));
        }

        a(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
            this.a = func0;
            this.b = func3;
            this.c = action1;
        }

        public a(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
            this(func0, func3, null);
        }

        public a(Func3<S, Long, Observer<Observable<? extends T>>, S> func3, Action1<? super S> action1) {
            this(null, func3, action1);
        }

        public a(Func3<S, Long, Observer<Observable<? extends T>>, S> func3) {
            this(null, func3, null);
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected S generateState() {
            if (this.a == null) {
                return null;
            }
            return this.a.call();
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected S next(S s, long j, Observer<Observable<? extends T>> observer) {
            return this.b.call(s, Long.valueOf(j), observer);
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected void onUnsubscribe(S s) {
            if (this.c != null) {
                this.c.call(s);
            }
        }
    }

    public final void call(final Subscriber<? super T> subscriber) {
        try {
            S generateState = generateState();
            c a2 = c.a();
            final b bVar = new b(this, generateState, a2);
            Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.observables.AsyncOnSubscribe.6
                @Override // rx.Observer
                public void onNext(T t) {
                    subscriber.onNext(t);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }

                @Override // rx.Subscriber
                public void setProducer(Producer producer) {
                    bVar.a(producer);
                }
            };
            a2.onBackpressureBuffer().concatMap(new Func1<Observable<T>, Observable<T>>() { // from class: rx.observables.AsyncOnSubscribe.7
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Observable<T> call(Observable<T> observable) {
                    return observable.onBackpressureBuffer();
                }
            }).unsafeSubscribe(subscriber2);
            subscriber.add(subscriber2);
            subscriber.add(bVar);
            subscriber.setProducer(bVar);
        } catch (Throwable th) {
            subscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<S, T> implements Observer<Observable<? extends T>>, Producer, Subscription {
        boolean c;
        List<Long> d;
        Producer e;
        long f;
        private final AsyncOnSubscribe<S, T> g;
        private boolean i;
        private boolean j;
        private S k;
        private final c<Observable<T>> l;
        final CompositeSubscription b = new CompositeSubscription();
        private final SerializedObserver<Observable<? extends T>> h = new SerializedObserver<>(this);
        final AtomicBoolean a = new AtomicBoolean();

        public b(AsyncOnSubscribe<S, T> asyncOnSubscribe, S s, c<Observable<T>> cVar) {
            this.g = asyncOnSubscribe;
            this.k = s;
            this.l = cVar;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.a.compareAndSet(false, true)) {
                synchronized (this) {
                    if (this.c) {
                        this.d = new ArrayList();
                        this.d.add(0L);
                    } else {
                        this.c = true;
                        a();
                    }
                }
            }
        }

        void a(Producer producer) {
            if (this.e != null) {
                throw new IllegalStateException("setConcatProducer may be called at most once!");
            }
            this.e = producer;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.get();
        }

        public void a(long j) {
            this.k = this.g.next(this.k, j, this.h);
        }

        void a() {
            this.b.unsubscribe();
            try {
                this.g.onUnsubscribe(this.k);
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            boolean z = true;
            if (j != 0) {
                if (j < 0) {
                    throw new IllegalStateException("Request can't be negative! " + j);
                }
                synchronized (this) {
                    if (this.c) {
                        List list = this.d;
                        if (list == null) {
                            list = new ArrayList();
                            this.d = list;
                        }
                        list.add(Long.valueOf(j));
                    } else {
                        this.c = true;
                        z = false;
                    }
                }
                this.e.request(j);
                if (z || c(j)) {
                    return;
                }
                while (true) {
                    synchronized (this) {
                        List<Long> list2 = this.d;
                        if (list2 == null) {
                            this.c = false;
                            return;
                        }
                        this.d = null;
                        for (Long l : list2) {
                            if (c(l.longValue())) {
                                return;
                            }
                        }
                    }
                }
            }
        }

        public void b(long j) {
            if (j != 0) {
                if (j < 0) {
                    throw new IllegalStateException("Request can't be negative! " + j);
                }
                synchronized (this) {
                    if (this.c) {
                        List list = this.d;
                        if (list == null) {
                            list = new ArrayList();
                            this.d = list;
                        }
                        list.add(Long.valueOf(j));
                        return;
                    }
                    this.c = true;
                    if (c(j)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            List<Long> list2 = this.d;
                            if (list2 == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                            for (Long l : list2) {
                                if (c(l.longValue())) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        boolean c(long j) {
            boolean z = true;
            if (isUnsubscribed()) {
                a();
            } else {
                try {
                    this.j = false;
                    this.f = j;
                    a(j);
                    if (this.i || isUnsubscribed()) {
                        a();
                    } else if (this.j) {
                        z = false;
                    } else {
                        a(new IllegalStateException("No events emitted!"));
                    }
                } catch (Throwable th) {
                    a(th);
                }
            }
            return z;
        }

        private void a(Throwable th) {
            if (this.i) {
                RxJavaHooks.onError(th);
                return;
            }
            this.i = true;
            this.l.onError(th);
            a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.i) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.i = true;
            this.l.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.i) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.i = true;
            this.l.onError(th);
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Observable<? extends T> observable) {
            if (this.j) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.j = true;
            if (!this.i) {
                b(observable);
            }
        }

        private void b(Observable<? extends T> observable) {
            final BufferUntilSubscriber create = BufferUntilSubscriber.create();
            final long j = this.f;
            final Subscriber subscriber = (Subscriber<T>) new Subscriber<T>() { // from class: rx.observables.AsyncOnSubscribe.b.1
                long a;

                {
                    this.a = j;
                }

                @Override // rx.Observer
                public void onNext(T t) {
                    this.a--;
                    create.onNext(t);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    create.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    create.onCompleted();
                    long j2 = this.a;
                    if (j2 > 0) {
                        b.this.b(j2);
                    }
                }
            };
            this.b.add(subscriber);
            observable.doOnTerminate(new Action0() { // from class: rx.observables.AsyncOnSubscribe.b.2
                @Override // rx.functions.Action0
                public void call() {
                    b.this.b.remove(subscriber);
                }
            }).subscribe((Subscriber<? super Object>) subscriber);
            this.l.onNext(create);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Observable<T> implements Observer<T> {
        private final a<T> b;

        public static <T> c<T> a() {
            return new c<>(new a());
        }

        protected c(a<T> aVar) {
            super(aVar);
            this.b = aVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.a.onNext(t);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Observable.OnSubscribe<T> {
            Subscriber<? super T> a;

            a() {
            }

            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super T> subscriber) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = subscriber;
                    } else {
                        subscriber.onError(new IllegalStateException("There can be only one subscriber"));
                    }
                }
            }
        }
    }
}
