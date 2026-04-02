package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.functions.Functions;
import rx.internal.util.RxRingBuffer;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class OperatorZip<R> implements Observable.Operator<R, Observable<?>[]> {
    final FuncN<? extends R> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorZip(FuncN<? extends R> funcN) {
        this.a = funcN;
    }

    public OperatorZip(Func2 func2) {
        this.a = Functions.fromFunc(func2);
    }

    public OperatorZip(Func3 func3) {
        this.a = Functions.fromFunc(func3);
    }

    public OperatorZip(Func4 func4) {
        this.a = Functions.fromFunc(func4);
    }

    public OperatorZip(Func5 func5) {
        this.a = Functions.fromFunc(func5);
    }

    public OperatorZip(Func6 func6) {
        this.a = Functions.fromFunc(func6);
    }

    public OperatorZip(Func7 func7) {
        this.a = Functions.fromFunc(func7);
    }

    public OperatorZip(Func8 func8) {
        this.a = Functions.fromFunc(func8);
    }

    public OperatorZip(Func9 func9) {
        this.a = Functions.fromFunc(func9);
    }

    public Subscriber<? super Observable[]> call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.a);
        b bVar = new b(aVar);
        c cVar = new c(subscriber, aVar, bVar);
        subscriber.add(cVar);
        subscriber.setProducer(bVar);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class c extends Subscriber<Observable[]> {
        final Subscriber<? super R> a;
        final a<R> b;
        final b<R> c;
        boolean d;

        public c(Subscriber<? super R> subscriber, a<R> aVar, b<R> bVar) {
            this.a = subscriber;
            this.b = aVar;
            this.c = bVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Observable[] observableArr) {
            if (observableArr == null || observableArr.length == 0) {
                this.a.onCompleted();
                return;
            }
            this.d = true;
            this.b.a(observableArr, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<R> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        final a<R> a;

        public b(a<R> aVar) {
            this.a = aVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this, j);
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<R> extends AtomicLong {
        static final int b = (int) (RxRingBuffer.SIZE * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final Observer<? super R> a;
        int c;
        private final FuncN<? extends R> d;
        private final CompositeSubscription e = new CompositeSubscription();
        private volatile Object[] f;
        private AtomicLong g;

        public a(Subscriber<? super R> subscriber, FuncN<? extends R> funcN) {
            this.a = subscriber;
            this.d = funcN;
            subscriber.add(this.e);
        }

        public void a(Observable[] observableArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[observableArr.length];
            for (int i = 0; i < observableArr.length; i++) {
                C0377a c0377a = new C0377a();
                objArr[i] = c0377a;
                this.e.add(c0377a);
            }
            this.g = atomicLong;
            this.f = objArr;
            for (int i2 = 0; i2 < observableArr.length; i2++) {
                observableArr[i2].unsafeSubscribe((C0377a) objArr[i2]);
            }
        }

        void a() {
            boolean z;
            Object[] objArr = this.f;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                Observer<? super R> observer = this.a;
                AtomicLong atomicLong = this.g;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z2 = true;
                    int i = 0;
                    while (i < length) {
                        RxRingBuffer rxRingBuffer = ((C0377a) objArr[i]).a;
                        Object peek = rxRingBuffer.peek();
                        if (peek == null) {
                            z = false;
                        } else if (rxRingBuffer.isCompleted(peek)) {
                            observer.onCompleted();
                            this.e.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = rxRingBuffer.getValue(peek);
                            z = z2;
                        }
                        i++;
                        z2 = z;
                    }
                    if (atomicLong.get() > 0 && z2) {
                        try {
                            observer.onNext((R) this.d.call(objArr2));
                            atomicLong.decrementAndGet();
                            this.c++;
                            for (Object obj : objArr) {
                                RxRingBuffer rxRingBuffer2 = ((C0377a) obj).a;
                                rxRingBuffer2.poll();
                                if (rxRingBuffer2.isCompleted(rxRingBuffer2.peek())) {
                                    observer.onCompleted();
                                    this.e.unsubscribe();
                                    return;
                                }
                            }
                            if (this.c > b) {
                                for (Object obj2 : objArr) {
                                    ((C0377a) obj2).a(this.c);
                                }
                                this.c = 0;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, observer, objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rx.internal.operators.OperatorZip$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0377a extends Subscriber {
            final RxRingBuffer a = RxRingBuffer.getSpmcInstance();

            C0377a() {
            }

            @Override // rx.Subscriber
            public void onStart() {
                request(RxRingBuffer.SIZE);
            }

            public void a(long j) {
                request(j);
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.a.onCompleted();
                a.this.a();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.a.onError(th);
            }

            @Override // rx.Observer
            public void onNext(Object obj) {
                try {
                    this.a.onNext(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                a.this.a();
            }
        }
    }
}
