package rx.internal.operators;

import java.util.Arrays;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public class OnSubscribeDoOnEach<T> implements Observable.OnSubscribe<T> {
    private final Observer<? super T> a;
    private final Observable<T> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeDoOnEach(Observable<T> observable, Observer<? super T> observer) {
        this.b = observable;
        this.a = observer;
    }

    public void call(Subscriber<? super T> subscriber) {
        this.b.unsafeSubscribe(new a(subscriber, this.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        private final Subscriber<? super T> a;
        private final Observer<? super T> b;
        private boolean c;

        a(Subscriber<? super T> subscriber, Observer<? super T> observer) {
            super(subscriber);
            this.a = subscriber;
            this.b = observer;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.c) {
                try {
                    this.b.onCompleted();
                    this.c = true;
                    this.a.onCompleted();
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
                return;
            }
            this.c = true;
            try {
                this.b.onError(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.a.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.c) {
                try {
                    this.b.onNext(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this, t);
                }
            }
        }
    }
}
