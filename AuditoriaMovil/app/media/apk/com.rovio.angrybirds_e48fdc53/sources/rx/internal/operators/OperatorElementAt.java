package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {
    final int a;
    final boolean b;
    final T c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    private OperatorElementAt(int i, T t, boolean z) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(i + " is out of bounds");
        }
        this.a = i;
        this.c = t;
        this.b = z;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>() { // from class: rx.internal.operators.OperatorElementAt.1
            private int c;

            @Override // rx.Observer
            public void onNext(T t) {
                int i = this.c;
                this.c = i + 1;
                if (i == OperatorElementAt.this.a) {
                    subscriber.onNext(t);
                    subscriber.onCompleted();
                    unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.c <= OperatorElementAt.this.a) {
                    if (OperatorElementAt.this.b) {
                        subscriber.onNext(OperatorElementAt.this.c);
                        subscriber.onCompleted();
                        return;
                    }
                    subscriber.onError(new IndexOutOfBoundsException(OperatorElementAt.this.a + " is out of bounds"));
                }
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(new a(producer));
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }

    /* loaded from: classes4.dex */
    static class a extends AtomicBoolean implements Producer {
        private static final long serialVersionUID = 1;
        final Producer a;

        public a(Producer producer) {
            this.a = producer;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j > 0 && compareAndSet(false, true)) {
                this.a.request(Long.MAX_VALUE);
            }
        }
    }
}
