package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public class OperatorCast<T, R> implements Observable.Operator<R, T> {
    final Class<R> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorCast(Class<R> cls) {
        this.a = cls;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.a);
        subscriber.add(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        final Subscriber<? super R> a;
        final Class<R> b;
        boolean c;

        public a(Subscriber<? super R> subscriber, Class<R> cls) {
            this.a = subscriber;
            this.b = cls;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.a.onNext(this.b.cast(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.c) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.setProducer(producer);
        }
    }
}
