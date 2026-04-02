package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorMulticast<T, R> extends ConnectableObservable<R> {
    final Observable<? extends T> b;
    final Object c;
    final Func0<? extends Subject<? super T, ? extends R>> d;
    final AtomicReference<Subject<? super T, ? extends R>> e;
    final List<Subscriber<? super R>> f;
    Subscriber<T> g;
    Subscription h;

    public OperatorMulticast(Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        this(new Object(), new AtomicReference(), new ArrayList(), observable, func0);
    }

    private OperatorMulticast(final Object obj, final AtomicReference<Subject<? super T, ? extends R>> atomicReference, final List<Subscriber<? super R>> list, Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        super(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorMulticast.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super R> subscriber) {
                synchronized (obj) {
                    if (atomicReference.get() == null) {
                        list.add(subscriber);
                    } else {
                        ((Subject) atomicReference.get()).unsafeSubscribe(subscriber);
                    }
                }
            }
        });
        this.c = obj;
        this.e = atomicReference;
        this.f = list;
        this.b = observable;
        this.d = func0;
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        Subscriber<T> subscriber;
        synchronized (this.c) {
            if (this.g != null) {
                action1.call(this.h);
                return;
            }
            Subject<? super T, ? extends R> call = this.d.call();
            this.g = Subscribers.from(call);
            final AtomicReference atomicReference = new AtomicReference();
            atomicReference.set(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorMulticast.2
                @Override // rx.functions.Action0
                public void call() {
                    synchronized (OperatorMulticast.this.c) {
                        if (OperatorMulticast.this.h == atomicReference.get()) {
                            Subscriber<T> subscriber2 = OperatorMulticast.this.g;
                            OperatorMulticast.this.g = null;
                            OperatorMulticast.this.h = null;
                            OperatorMulticast.this.e.set(null);
                            if (subscriber2 != null) {
                                subscriber2.unsubscribe();
                            }
                        }
                    }
                }
            }));
            this.h = (Subscription) atomicReference.get();
            for (final Subscriber<? super R> subscriber2 : this.f) {
                call.unsafeSubscribe(new Subscriber<R>(subscriber2) { // from class: rx.internal.operators.OperatorMulticast.3
                    @Override // rx.Observer
                    public void onNext(R r) {
                        subscriber2.onNext(r);
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        subscriber2.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber2.onCompleted();
                    }
                });
            }
            this.f.clear();
            this.e.set(call);
            action1.call(this.h);
            synchronized (this.c) {
                subscriber = this.g;
            }
            if (subscriber != null) {
                this.b.subscribe((Subscriber<? super Object>) subscriber);
            }
        }
    }
}
