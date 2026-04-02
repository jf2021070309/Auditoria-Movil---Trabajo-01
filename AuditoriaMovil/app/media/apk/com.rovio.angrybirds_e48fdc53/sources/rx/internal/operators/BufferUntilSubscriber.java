package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class BufferUntilSubscriber<T> extends Subject<T, T> {
    static final Observer c = new Observer() { // from class: rx.internal.operators.BufferUntilSubscriber.1
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    };
    final b<T> b;
    private boolean d;

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean b;
        final Object a = new Object();
        final ConcurrentLinkedQueue<Object> c = new ConcurrentLinkedQueue<>();
        final NotificationLite<T> d = NotificationLite.instance();

        b() {
        }

        boolean a(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    /* loaded from: classes4.dex */
    static final class a<T> implements Observable.OnSubscribe<T> {
        final b<T> a;

        public a(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            boolean z = true;
            if (this.a.a(null, subscriber)) {
                subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.BufferUntilSubscriber.a.1
                    @Override // rx.functions.Action0
                    public void call() {
                        a.this.a.set(BufferUntilSubscriber.c);
                    }
                }));
                synchronized (this.a.a) {
                    if (this.a.b) {
                        z = false;
                    } else {
                        this.a.b = true;
                    }
                }
                if (z) {
                    NotificationLite instance = NotificationLite.instance();
                    while (true) {
                        Object poll = this.a.c.poll();
                        if (poll != null) {
                            instance.accept(this.a.get(), poll);
                        } else {
                            synchronized (this.a.a) {
                                if (this.a.c.isEmpty()) {
                                    this.a.b = false;
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    private BufferUntilSubscriber(b<T> bVar) {
        super(new a(bVar));
        this.b = bVar;
    }

    private void a(Object obj) {
        synchronized (this.b.a) {
            this.b.c.add(obj);
            if (this.b.get() != null && !this.b.b) {
                this.d = true;
                this.b.b = true;
            }
        }
        if (!this.d) {
            return;
        }
        while (true) {
            Object poll = this.b.c.poll();
            if (poll != null) {
                this.b.d.accept(this.b.get(), poll);
            } else {
                return;
            }
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.d) {
            this.b.get().onCompleted();
        } else {
            a(this.b.d.completed());
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.d) {
            this.b.get().onError(th);
        } else {
            a(this.b.d.error(th));
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (this.d) {
            this.b.get().onNext(t);
        } else {
            a(this.b.d.next(t));
        }
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        boolean z;
        synchronized (this.b.a) {
            z = this.b.get() != null;
        }
        return z;
    }
}
