package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {
    final int a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSkipLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.a = i;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLast.1
            private final NotificationLite<T> c = NotificationLite.instance();
            private final Deque<Object> d = new ArrayDeque();

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (OperatorSkipLast.this.a == 0) {
                    subscriber.onNext(t);
                    return;
                }
                if (this.d.size() == OperatorSkipLast.this.a) {
                    subscriber.onNext(this.c.getValue(this.d.removeFirst()));
                } else {
                    request(1L);
                }
                this.d.offerLast(this.c.next(t));
            }
        };
    }
}
