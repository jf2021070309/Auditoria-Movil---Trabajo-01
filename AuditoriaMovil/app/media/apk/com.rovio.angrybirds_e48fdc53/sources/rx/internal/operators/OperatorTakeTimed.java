package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
/* loaded from: classes4.dex */
public final class OperatorTakeTimed<T> implements Observable.Operator<T, T> {
    final long a;
    final TimeUnit b;
    final Scheduler c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.c.createWorker();
        subscriber.add(createWorker);
        a aVar = new a(new SerializedSubscriber(subscriber));
        createWorker.schedule(aVar, this.a, this.b);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> a;

        public a(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.a = subscriber;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
            unsubscribe();
        }

        @Override // rx.functions.Action0
        public void call() {
            onCompleted();
        }
    }
}
