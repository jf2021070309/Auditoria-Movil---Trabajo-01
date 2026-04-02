package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OperatorTakeUntilPredicate<T> implements Observable.Operator<T, T> {
    final Func1<? super T, Boolean> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeUntilPredicate(Func1<? super T, Boolean> func1) {
        this.a = func1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final a aVar = new a(subscriber);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeUntilPredicate.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.a(j);
            }
        });
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends Subscriber<T> {
        private final Subscriber<? super T> b;
        private boolean c;

        a(Subscriber<? super T> subscriber) {
            this.b = subscriber;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.onNext(t);
            try {
                if (OperatorTakeUntilPredicate.this.a.call(t).booleanValue()) {
                    this.c = true;
                    this.b.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.c = true;
                Exceptions.throwOrReport(th, this.b, t);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.c) {
                this.b.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.c) {
                this.b.onError(th);
            }
        }

        void a(long j) {
            request(j);
        }
    }
}
