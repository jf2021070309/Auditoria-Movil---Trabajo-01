package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
/* loaded from: classes4.dex */
public final class OperatorSampleWithTime<T> implements Observable.Operator<T, T> {
    final long a;
    final TimeUnit b;
    final Scheduler c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSampleWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Scheduler.Worker createWorker = this.c.createWorker();
        subscriber.add(createWorker);
        a aVar = new a(serializedSubscriber);
        subscriber.add(aVar);
        createWorker.schedulePeriodically(aVar, this.a, this.a, this.b);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Action0 {
        private static final Object c = new Object();
        final AtomicReference<Object> a = new AtomicReference<>(c);
        private final Subscriber<? super T> b;

        public a(Subscriber<? super T> subscriber) {
            this.b = subscriber;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.set(t);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onCompleted() {
            a();
            this.b.onCompleted();
            unsubscribe();
        }

        @Override // rx.functions.Action0
        public void call() {
            a();
        }

        private void a() {
            Object andSet = this.a.getAndSet(c);
            if (andSet != c) {
                try {
                    this.b.onNext(andSet);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }
    }
}
