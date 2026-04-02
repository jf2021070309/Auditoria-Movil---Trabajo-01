package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorTake<T> implements Observable.Operator<T, T> {
    final int a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTake(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("limit >= 0 required but it was " + i);
        }
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorTake$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends Subscriber<T> {
        int a;
        boolean b;
        final /* synthetic */ Subscriber c;

        AnonymousClass1(Subscriber subscriber) {
            this.c = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.b) {
                this.b = true;
                this.c.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.b) {
                this.b = true;
                try {
                    this.c.onError(th);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.a;
            this.a = i + 1;
            if (i < OperatorTake.this.a) {
                boolean z = this.a == OperatorTake.this.a;
                this.c.onNext(t);
                if (z && !this.b) {
                    this.b = true;
                    try {
                        this.c.onCompleted();
                    } finally {
                        unsubscribe();
                    }
                }
            }
        }

        @Override // rx.Subscriber
        public void setProducer(final Producer producer) {
            this.c.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTake.1.1
                final AtomicLong a = new AtomicLong(0);

                @Override // rx.Producer
                public void request(long j) {
                    long j2;
                    long min;
                    if (j > 0 && !AnonymousClass1.this.b) {
                        do {
                            j2 = this.a.get();
                            min = Math.min(j, OperatorTake.this.a - j2);
                            if (min == 0) {
                                return;
                            }
                        } while (!this.a.compareAndSet(j2, j2 + min));
                        producer.request(min);
                    }
                }
            });
        }
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(subscriber);
        if (this.a == 0) {
            subscriber.onCompleted();
            anonymousClass1.unsubscribe();
        }
        subscriber.add(anonymousClass1);
        return anonymousClass1;
    }
}
