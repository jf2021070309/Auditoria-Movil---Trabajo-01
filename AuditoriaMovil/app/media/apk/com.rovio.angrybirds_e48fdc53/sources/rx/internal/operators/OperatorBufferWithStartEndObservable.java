package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class OperatorBufferWithStartEndObservable<T, TOpening, TClosing> implements Observable.Operator<List<T>, T> {
    final Observable<? extends TOpening> a;
    final Func1<? super TOpening, ? extends Observable<? extends TClosing>> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorBufferWithStartEndObservable(Observable<? extends TOpening> observable, Func1<? super TOpening, ? extends Observable<? extends TClosing>> func1) {
        this.a = observable;
        this.b = func1;
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        final a aVar = new a(new SerializedSubscriber(subscriber));
        Subscriber<TOpening> subscriber2 = new Subscriber<TOpening>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.1
            @Override // rx.Observer
            public void onNext(TOpening topening) {
                aVar.a((a) topening);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                aVar.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                aVar.onCompleted();
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(subscriber2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        boolean c;
        final List<List<T>> b = new LinkedList();
        final CompositeSubscription d = new CompositeSubscription();

        public a(Subscriber<? super List<T>> subscriber) {
            this.a = subscriber;
            add(this.d);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this) {
                for (List<T> list : this.b) {
                    list.add(t);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    this.b.clear();
                    this.a.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (!this.c) {
                        this.c = true;
                        LinkedList<List> linkedList = new LinkedList(this.b);
                        this.b.clear();
                        for (List list : linkedList) {
                            this.a.onNext(list);
                        }
                        this.a.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
        }

        void a(TOpening topening) {
            final ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (!this.c) {
                    this.b.add(arrayList);
                    try {
                        Observable<? extends TClosing> call = OperatorBufferWithStartEndObservable.this.b.call(topening);
                        Subscriber<TClosing> subscriber = new Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.a.1
                            @Override // rx.Observer
                            public void onNext(TClosing tclosing) {
                                a.this.d.remove(this);
                                a.this.a((List) arrayList);
                            }

                            @Override // rx.Observer
                            public void onError(Throwable th) {
                                a.this.onError(th);
                            }

                            @Override // rx.Observer
                            public void onCompleted() {
                                a.this.d.remove(this);
                                a.this.a((List) arrayList);
                            }
                        };
                        this.d.add(subscriber);
                        call.unsafeSubscribe(subscriber);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this);
                    }
                }
            }
        }

        void a(List<T> list) {
            boolean z;
            synchronized (this) {
                if (!this.c) {
                    Iterator<List<T>> it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == list) {
                            z = true;
                            it.remove();
                            break;
                        }
                    }
                    if (z) {
                        this.a.onNext(list);
                    }
                }
            }
        }
    }
}
