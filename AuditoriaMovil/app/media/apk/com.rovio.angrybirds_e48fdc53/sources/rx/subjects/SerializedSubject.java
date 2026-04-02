package rx.subjects;

import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedObserver;
/* loaded from: classes4.dex */
public class SerializedSubject<T, R> extends Subject<T, R> {
    private final SerializedObserver<T> b;
    private final Subject<T, R> c;

    public SerializedSubject(final Subject<T, R> subject) {
        super(new Observable.OnSubscribe<R>() { // from class: rx.subjects.SerializedSubject.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super R> subscriber) {
                Subject.this.unsafeSubscribe(subscriber);
            }
        });
        this.c = subject;
        this.b = new SerializedObserver<>(subject);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.c.hasObservers();
    }
}
