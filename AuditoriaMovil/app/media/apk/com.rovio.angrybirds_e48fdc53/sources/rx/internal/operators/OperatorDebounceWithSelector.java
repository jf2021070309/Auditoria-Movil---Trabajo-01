package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.operators.OperatorDebounceWithTime;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OperatorDebounceWithSelector<T, U> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends Observable<U>> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorDebounceWithSelector(Func1<? super T, ? extends Observable<U>> func1) {
        this.a = func1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new AnonymousClass1(subscriber, serializedSubscriber, serialSubscription);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends Subscriber<T> {
        final OperatorDebounceWithTime.a<T> a;
        final Subscriber<?> b;
        final /* synthetic */ SerializedSubscriber c;
        final /* synthetic */ SerialSubscription d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Subscriber subscriber, SerializedSubscriber serializedSubscriber, SerialSubscription serialSubscription) {
            super(subscriber);
            this.c = serializedSubscriber;
            this.d = serialSubscription;
            this.a = new OperatorDebounceWithTime.a<>();
            this.b = this;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Observable<U> call = OperatorDebounceWithSelector.this.a.call(t);
                final int a = this.a.a(t);
                Subscriber<U> subscriber = new Subscriber<U>() { // from class: rx.internal.operators.OperatorDebounceWithSelector.1.1
                    @Override // rx.Observer
                    public void onNext(U u) {
                        onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        AnonymousClass1.this.b.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        AnonymousClass1.this.a.a(a, AnonymousClass1.this.c, AnonymousClass1.this.b);
                        unsubscribe();
                    }
                };
                this.d.set(subscriber);
                call.unsafeSubscribe(subscriber);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.c.onError(th);
            unsubscribe();
            this.a.a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.a(this.c, this);
        }
    }
}
