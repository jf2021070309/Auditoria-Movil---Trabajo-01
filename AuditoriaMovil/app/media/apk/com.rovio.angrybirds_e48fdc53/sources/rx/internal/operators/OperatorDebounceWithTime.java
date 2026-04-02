package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OperatorDebounceWithTime<T> implements Observable.Operator<T, T> {
    final long a;
    final TimeUnit b;
    final Scheduler c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorDebounceWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.c.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(createWorker);
        serializedSubscriber.add(serialSubscription);
        return new AnonymousClass1(subscriber, serialSubscription, createWorker, serializedSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorDebounceWithTime$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends Subscriber<T> {
        final a<T> a;
        final Subscriber<?> b;
        final /* synthetic */ SerialSubscription c;
        final /* synthetic */ Scheduler.Worker d;
        final /* synthetic */ SerializedSubscriber e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Subscriber subscriber, SerialSubscription serialSubscription, Scheduler.Worker worker, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.c = serialSubscription;
            this.d = worker;
            this.e = serializedSubscriber;
            this.a = new a<>();
            this.b = this;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            final int a = this.a.a(t);
            this.c.set(this.d.schedule(new Action0() { // from class: rx.internal.operators.OperatorDebounceWithTime.1.1
                @Override // rx.functions.Action0
                public void call() {
                    AnonymousClass1.this.a.a(a, AnonymousClass1.this.e, AnonymousClass1.this.b);
                }
            }, OperatorDebounceWithTime.this.a, OperatorDebounceWithTime.this.b));
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.e.onError(th);
            unsubscribe();
            this.a.a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.a(this.e, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> {
        int a;
        T b;
        boolean c;
        boolean d;
        boolean e;

        public synchronized int a(T t) {
            int i;
            this.b = t;
            this.c = true;
            i = this.a + 1;
            this.a = i;
            return i;
        }

        public void a(int i, Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (!this.e && this.c && i == this.a) {
                    T t = this.b;
                    this.b = null;
                    this.c = false;
                    this.e = true;
                    try {
                        subscriber.onNext(t);
                        synchronized (this) {
                            if (!this.d) {
                                this.e = false;
                            } else {
                                subscriber.onCompleted();
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t);
                    }
                }
            }
        }

        public void a(Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (this.e) {
                    this.d = true;
                    return;
                }
                T t = this.b;
                boolean z = this.c;
                this.b = null;
                this.c = false;
                this.e = true;
                if (z) {
                    try {
                        subscriber.onNext(t);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t);
                        return;
                    }
                }
                subscriber.onCompleted();
            }
        }

        public synchronized void a() {
            this.a++;
            this.b = null;
            this.c = false;
        }
    }
}
