package rx.observers;

import rx.Observer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {
    private final Observer<T> a;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.a = new SerializedObserver(subscriber);
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
