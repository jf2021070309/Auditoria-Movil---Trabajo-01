package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Subscriber;
import rx.internal.producers.SingleProducer;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorSingle<T> implements Observable.Operator<T, T> {
    private final boolean a;
    private final T b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorSingle<?> a = new OperatorSingle<>();

        a() {
        }
    }

    public static <T> OperatorSingle<T> instance() {
        return (OperatorSingle<T>) a.a;
    }

    OperatorSingle() {
        this(false, null);
    }

    public OperatorSingle(T t) {
        this(true, t);
    }

    private OperatorSingle(boolean z, T t) {
        this.a = z;
        this.b = t;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.a, this.b);
        subscriber.add(bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> {
        private final Subscriber<? super T> a;
        private final boolean b;
        private final T c;
        private T d;
        private boolean e;
        private boolean f;

        b(Subscriber<? super T> subscriber, boolean z, T t) {
            this.a = subscriber;
            this.b = z;
            this.c = t;
            request(2L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.f) {
                if (this.e) {
                    this.f = true;
                    this.a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.d = t;
                this.e = true;
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.f) {
                if (this.e) {
                    this.a.setProducer(new SingleProducer(this.a, this.d));
                } else if (this.b) {
                    this.a.setProducer(new SingleProducer(this.a, this.c));
                } else {
                    this.a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.a.onError(th);
            }
        }
    }
}
