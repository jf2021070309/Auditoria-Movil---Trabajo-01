package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorThrottleFirst<T> implements Observable.Operator<T, T> {
    final long a;
    final Scheduler b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorThrottleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorThrottleFirst.1
            private long c = -1;

            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                long now = OperatorThrottleFirst.this.b.now();
                if (this.c == -1 || now - this.c >= OperatorThrottleFirst.this.a) {
                    this.c = now;
                    subscriber.onNext(t);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }
        };
    }
}
