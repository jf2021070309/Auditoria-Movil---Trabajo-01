package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OperatorTakeLast<T> implements Observable.Operator<T, T> {
    final int a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.a = i;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final a aVar = new a(subscriber, this.a);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLast.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.a(j);
            }
        });
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> a;
        final int d;
        final AtomicLong b = new AtomicLong();
        final ArrayDeque<Object> c = new ArrayDeque<>();
        final NotificationLite<T> e = NotificationLite.instance();

        public a(Subscriber<? super T> subscriber, int i) {
            this.a = subscriber;
            this.d = i;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.c.size() == this.d) {
                this.c.poll();
            }
            this.c.offer(this.e.next(t));
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.c.clear();
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.b, this.c, this.a, this);
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return this.e.getValue(obj);
        }

        void a(long j) {
            if (j > 0) {
                BackpressureUtils.postCompleteRequest(this.b, j, this.c, this.a, this);
            }
        }
    }
}
