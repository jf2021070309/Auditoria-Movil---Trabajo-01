package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action1;
/* loaded from: classes4.dex */
public class OperatorDoOnRequest<T> implements Observable.Operator<T, T> {
    final Action1<Long> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorDoOnRequest(Action1<Long> action1) {
        this.a = action1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final a aVar = new a(subscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorDoOnRequest.1
            @Override // rx.Producer
            public void request(long j) {
                OperatorDoOnRequest.this.a.call(Long.valueOf(j));
                aVar.a(j);
            }
        });
        subscriber.add(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        private final Subscriber<? super T> a;

        a(Subscriber<? super T> subscriber) {
            this.a = subscriber;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            request(j);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }
    }
}
