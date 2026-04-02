package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
    final Observable<? extends T> a;
    final Func1<? super T, ? extends Iterable<? extends R>> b;
    final int c;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    protected OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        this.a = observable;
        this.b = func1;
        this.c = i;
    }

    public void call(Subscriber<? super R> subscriber) {
        final a aVar = new a(subscriber, this.b, this.c);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeFlattenIterable.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.a(j);
            }
        });
        this.a.unsafeSubscribe(aVar);
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        return observable instanceof ScalarSynchronousObservable ? Observable.create(new b(((ScalarSynchronousObservable) observable).get(), func1)) : Observable.create(new OnSubscribeFlattenIterable(observable, func1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        final Subscriber<? super R> a;
        final Func1<? super T, ? extends Iterable<? extends R>> b;
        final long c;
        final Queue<Object> d;
        volatile boolean i;
        long j;
        Iterator<? extends R> k;
        final AtomicReference<Throwable> e = new AtomicReference<>();
        final AtomicInteger g = new AtomicInteger();
        final AtomicLong f = new AtomicLong();
        final NotificationLite<T> h = NotificationLite.instance();

        public a(Subscriber<? super R> subscriber, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
            this.a = subscriber;
            this.b = func1;
            if (i == Integer.MAX_VALUE) {
                this.c = Long.MAX_VALUE;
                this.d = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.c = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.d = new SpscArrayQueue(i);
                } else {
                    this.d = new SpscAtomicArrayQueue(i);
                }
            }
            request(i);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.d.offer(this.h.next(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            a();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (ExceptionsUtils.addThrowable(this.e, th)) {
                this.i = true;
                a();
                return;
            }
            RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.i = true;
            a();
        }

        void a(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.f, j);
                a();
            } else if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0008 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeFlattenIterable.a.a():void");
        }

        boolean a(boolean z, boolean z2, Subscriber<?> subscriber, Queue<?> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.k = null;
                return true;
            }
            if (z) {
                if (this.e.get() != null) {
                    Throwable terminate = ExceptionsUtils.terminate(this.e);
                    unsubscribe();
                    queue.clear();
                    this.k = null;
                    subscriber.onError(terminate);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T, R> implements Observable.OnSubscribe<R> {
        final T a;
        final Func1<? super T, ? extends Iterable<? extends R>> b;

        public b(T t, Func1<? super T, ? extends Iterable<? extends R>> func1) {
            this.a = t;
            this.b = func1;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super R> subscriber) {
            try {
                Iterator<? extends R> it = this.b.call((T) this.a).iterator();
                if (!it.hasNext()) {
                    subscriber.onCompleted();
                } else {
                    subscriber.setProducer(new OnSubscribeFromIterable.a(subscriber, it));
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, this.a);
            }
        }
    }
}
