package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.schedulers.ImmediateScheduler;
import rx.internal.schedulers.TrampolineScheduler;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;
/* loaded from: classes4.dex */
public final class OperatorObserveOn<T> implements Observable.Operator<T, T> {
    private final Scheduler a;
    private final boolean b;
    private final int c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z) {
        this(scheduler, z, RxRingBuffer.SIZE);
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z, int i) {
        this.a = scheduler;
        this.b = z;
        this.c = i <= 0 ? RxRingBuffer.SIZE : i;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        if (!(this.a instanceof ImmediateScheduler) && !(this.a instanceof TrampolineScheduler)) {
            a aVar = new a(this.a, subscriber, this.b, this.c);
            aVar.a();
            return aVar;
        }
        return subscriber;
    }

    public static <T> Observable.Operator<T, T> rebatch(final int i) {
        return new Observable.Operator<T, T>() { // from class: rx.internal.operators.OperatorObserveOn.1
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                a aVar = new a(Schedulers.immediate(), subscriber, false, i);
                aVar.a();
                return aVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> a;
        final Scheduler.Worker b;
        final boolean d;
        final Queue<Object> e;
        final int f;
        volatile boolean g;
        Throwable j;
        long k;
        final AtomicLong h = new AtomicLong();
        final AtomicLong i = new AtomicLong();
        final NotificationLite<T> c = NotificationLite.instance();

        public a(Scheduler scheduler, Subscriber<? super T> subscriber, boolean z, int i) {
            this.a = subscriber;
            this.b = scheduler.createWorker();
            this.d = z;
            i = i <= 0 ? RxRingBuffer.SIZE : i;
            this.f = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.e = new SpscArrayQueue(i);
            } else {
                this.e = new SpscAtomicArrayQueue(i);
            }
            request(i);
        }

        void a() {
            Subscriber<? super T> subscriber = this.a;
            subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorObserveOn.a.1
                @Override // rx.Producer
                public void request(long j) {
                    if (j > 0) {
                        BackpressureUtils.getAndAddRequest(a.this.h, j);
                        a.this.b();
                    }
                }
            });
            subscriber.add(this.b);
            subscriber.add(this);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!isUnsubscribed() && !this.g) {
                if (!this.e.offer(this.c.next(t))) {
                    onError(new MissingBackpressureException());
                } else {
                    b();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!isUnsubscribed() && !this.g) {
                this.g = true;
                b();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.g) {
                RxJavaHooks.onError(th);
                return;
            }
            this.j = th;
            this.g = true;
            b();
        }

        protected void b() {
            if (this.i.getAndIncrement() == 0) {
                this.b.schedule(this);
            }
        }

        @Override // rx.functions.Action0
        public void call() {
            long j;
            long j2 = 1;
            long j3 = this.k;
            Queue<Object> queue = this.e;
            Subscriber<? super T> subscriber = this.a;
            NotificationLite<T> notificationLite = this.c;
            do {
                long j4 = this.h.get();
                while (j4 != j3) {
                    boolean z = this.g;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, subscriber, queue)) {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext((T) notificationLite.getValue(poll));
                        long j5 = 1 + j3;
                        if (j5 == this.f) {
                            j = BackpressureUtils.produced(this.h, j5);
                            request(j5);
                            j5 = 0;
                        } else {
                            j = j4;
                        }
                        j4 = j;
                        j3 = j5;
                    } else {
                        return;
                    }
                }
                if (j4 != j3 || !a(this.g, queue.isEmpty(), subscriber, queue)) {
                    this.k = j3;
                    j2 = this.i.addAndGet(-j2);
                } else {
                    return;
                }
            } while (j2 != 0);
        }

        boolean a(boolean z, boolean z2, Subscriber<? super T> subscriber, Queue<Object> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                if (this.d) {
                    if (z2) {
                        Throwable th = this.j;
                        try {
                            if (th != null) {
                                subscriber.onError(th);
                            } else {
                                subscriber.onCompleted();
                            }
                        } finally {
                        }
                    }
                } else {
                    Throwable th2 = this.j;
                    if (th2 != null) {
                        queue.clear();
                        try {
                            subscriber.onError(th2);
                            return true;
                        } finally {
                        }
                    } else if (z2) {
                        try {
                            subscriber.onCompleted();
                            return true;
                        } finally {
                        }
                    }
                }
            }
            return false;
        }
    }
}
