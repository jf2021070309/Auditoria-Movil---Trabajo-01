package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements Observable.OnSubscribe<R> {
    final Observable<TLeft> a;
    final Observable<TRight> b;
    final Func1<TLeft, Observable<TLeftDuration>> c;
    final Func1<TRight, Observable<TRightDuration>> d;
    final Func2<TLeft, TRight, R> e;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeJoin(Observable<TLeft> observable, Observable<TRight> observable2, Func1<TLeft, Observable<TLeftDuration>> func1, Func1<TRight, Observable<TRightDuration>> func12, Func2<TLeft, TRight, R> func2) {
        this.a = observable;
        this.b = observable2;
        this.c = func1;
        this.d = func12;
        this.e = func2;
    }

    public void call(Subscriber<? super R> subscriber) {
        new a(new SerializedSubscriber(subscriber)).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        final Subscriber<? super R> b;
        boolean c;
        int d;
        boolean e;
        int f;
        final CompositeSubscription a = new CompositeSubscription();
        final Map<Integer, TRight> g = new HashMap();

        public a(Subscriber<? super R> subscriber) {
            this.b = subscriber;
        }

        HashMap<Integer, TLeft> a() {
            return this;
        }

        public void b() {
            this.b.add(this.a);
            C0362a c0362a = new C0362a();
            b bVar = new b();
            this.a.add(c0362a);
            this.a.add(bVar);
            OnSubscribeJoin.this.a.unsafeSubscribe(c0362a);
            OnSubscribeJoin.this.b.unsafeSubscribe(bVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rx.internal.operators.OnSubscribeJoin$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0362a extends Subscriber<TLeft> {
            C0362a() {
            }

            protected void a(int i, Subscription subscription) {
                boolean z = false;
                synchronized (a.this) {
                    if (a.this.a().remove(Integer.valueOf(i)) != null && a.this.a().isEmpty() && a.this.c) {
                        z = true;
                    }
                }
                if (z) {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                    return;
                }
                a.this.a.remove(subscription);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public void onNext(TLeft tleft) {
                int i;
                int i2;
                synchronized (a.this) {
                    a aVar = a.this;
                    i = aVar.d;
                    aVar.d = i + 1;
                    a.this.a().put(Integer.valueOf(i), tleft);
                    i2 = a.this.f;
                }
                try {
                    C0363a c0363a = new C0363a(i);
                    a.this.a.add(c0363a);
                    OnSubscribeJoin.this.c.call(tleft).unsafeSubscribe(c0363a);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (a.this) {
                        for (Map.Entry<Integer, TRight> entry : a.this.g.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        a.this.b.onNext(OnSubscribeJoin.this.e.call(tleft, obj));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b.onError(th);
                a.this.b.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z = false;
                synchronized (a.this) {
                    a.this.c = true;
                    if (a.this.e || a.this.a().isEmpty()) {
                        z = true;
                    }
                }
                if (z) {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                    return;
                }
                a.this.a.remove(this);
            }

            /* renamed from: rx.internal.operators.OnSubscribeJoin$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            final class C0363a extends Subscriber<TLeftDuration> {
                final int a;
                boolean b = true;

                public C0363a(int i) {
                    this.a = i;
                }

                @Override // rx.Observer
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    C0362a.this.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.b) {
                        this.b = false;
                        C0362a.this.a(this.a, this);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class b extends Subscriber<TRight> {
            b() {
            }

            void a(int i, Subscription subscription) {
                boolean z = false;
                synchronized (a.this) {
                    if (a.this.g.remove(Integer.valueOf(i)) != null && a.this.g.isEmpty() && a.this.e) {
                        z = true;
                    }
                }
                if (z) {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                    return;
                }
                a.this.a.remove(subscription);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (a.this) {
                    a aVar = a.this;
                    i = aVar.f;
                    aVar.f = i + 1;
                    a.this.g.put(Integer.valueOf(i), tright);
                    i2 = a.this.d;
                }
                a.this.a.add(new SerialSubscription());
                try {
                    C0364a c0364a = new C0364a(i);
                    a.this.a.add(c0364a);
                    OnSubscribeJoin.this.d.call(tright).unsafeSubscribe(c0364a);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (a.this) {
                        for (Map.Entry<Integer, TLeft> entry : a.this.a().entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        a.this.b.onNext(OnSubscribeJoin.this.e.call(obj, tright));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b.onError(th);
                a.this.b.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z = false;
                synchronized (a.this) {
                    a.this.e = true;
                    if (a.this.c || a.this.g.isEmpty()) {
                        z = true;
                    }
                }
                if (z) {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                    return;
                }
                a.this.a.remove(this);
            }

            /* renamed from: rx.internal.operators.OnSubscribeJoin$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            final class C0364a extends Subscriber<TRightDuration> {
                final int a;
                boolean b = true;

                public C0364a(int i) {
                    this.a = i;
                }

                @Override // rx.Observer
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    b.this.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.b) {
                        this.b = false;
                        b.this.a(this.a, this);
                    }
                }
            }
        }
    }
}
