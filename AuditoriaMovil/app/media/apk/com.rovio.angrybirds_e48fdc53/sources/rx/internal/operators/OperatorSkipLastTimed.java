package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;
/* loaded from: classes4.dex */
public class OperatorSkipLastTimed<T> implements Observable.Operator<T, T> {
    final long a;
    final Scheduler b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSkipLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLastTimed.1
            private Deque<Timestamped<T>> c = new ArrayDeque();

            private void a(long j) {
                long j2 = j - OperatorSkipLastTimed.this.a;
                while (!this.c.isEmpty()) {
                    Timestamped<T> first = this.c.getFirst();
                    if (first.getTimestampMillis() < j2) {
                        this.c.removeFirst();
                        subscriber.onNext(first.getValue());
                    } else {
                        return;
                    }
                }
            }

            @Override // rx.Observer
            public void onNext(T t) {
                long now = OperatorSkipLastTimed.this.b.now();
                a(now);
                this.c.offerLast(new Timestamped<>(now, t));
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                a(OperatorSkipLastTimed.this.b.now());
                subscriber.onCompleted();
            }
        };
    }
}
