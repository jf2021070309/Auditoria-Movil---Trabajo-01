package rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.FuncN;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorWithLatestFromMany<T, R> implements Observable.OnSubscribe<R> {
    final Observable<T> a;
    final Observable<?>[] b;
    final Iterable<Observable<?>> c;
    final FuncN<R> d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.a = observable;
        this.b = observableArr;
        this.c = iterable;
        this.d = funcN;
    }

    public void call(Subscriber<? super R> subscriber) {
        int i;
        Observable<?>[] observableArr;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.b != null) {
            observableArr = this.b;
            i = observableArr.length;
        } else {
            i = 0;
            observableArr = new Observable[8];
            for (Observable<?> observable : this.c) {
                if (i == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i >> 2) + i);
                }
                Observable<?>[] observableArr2 = observableArr;
                observableArr2[i] = observable;
                i++;
                observableArr = observableArr2;
            }
        }
        a aVar = new a(subscriber, this.d, i);
        serializedSubscriber.add(aVar);
        for (int i2 = 0; i2 < i; i2++) {
            if (!serializedSubscriber.isUnsubscribed()) {
                b bVar = new b(aVar, i2 + 1);
                aVar.add(bVar);
                observableArr[i2].unsafeSubscribe(bVar);
            } else {
                return;
            }
        }
        this.a.unsafeSubscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        static final Object d = new Object();
        final Subscriber<? super R> a;
        final FuncN<R> b;
        final AtomicReferenceArray<Object> c;
        final AtomicInteger e;
        boolean f;

        public a(Subscriber<? super R> subscriber, FuncN<R> funcN, int i) {
            this.a = subscriber;
            this.b = funcN;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, d);
            }
            this.c = atomicReferenceArray;
            this.e = new AtomicInteger(i);
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.f) {
                if (this.e.get() == 0) {
                    AtomicReferenceArray<Object> atomicReferenceArray = this.c;
                    int length = atomicReferenceArray.length();
                    atomicReferenceArray.lazySet(0, t);
                    Object[] objArr = new Object[atomicReferenceArray.length()];
                    for (int i = 0; i < length; i++) {
                        objArr[i] = atomicReferenceArray.get(i);
                    }
                    try {
                        this.a.onNext(this.b.call(objArr));
                        return;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        onError(th);
                        return;
                    }
                }
                request(1L);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
                return;
            }
            this.f = true;
            unsubscribe();
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.f) {
                this.f = true;
                unsubscribe();
                this.a.onCompleted();
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.a.setProducer(producer);
        }

        void a(int i, Object obj) {
            if (this.c.getAndSet(i, obj) == d) {
                this.e.decrementAndGet();
            }
        }

        void a(int i, Throwable th) {
            onError(th);
        }

        void a(int i) {
            if (this.c.get(i) == d) {
                onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends Subscriber<Object> {
        final a<?, ?> a;
        final int b;

        public b(a<?, ?> aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
            this.a.a(this.b, obj);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.a(this.b, th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.a(this.b);
        }
    }
}
