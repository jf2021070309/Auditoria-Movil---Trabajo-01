package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class CompletableOnSubscribeConcat implements Completable.OnSubscribe {
    final Observable<Completable> a;
    final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i) {
        this.a = observable;
        this.b = i;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b);
        completableSubscriber.onSubscribe(aVar);
        this.a.subscribe((Subscriber<? super Completable>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends Subscriber<Completable> {
        final CompletableSubscriber a;
        final SpscArrayQueue<Completable> c;
        volatile boolean d;
        final SerialSubscription b = new SerialSubscription();
        final C0359a f = new C0359a();
        final AtomicInteger g = new AtomicInteger();
        final AtomicBoolean e = new AtomicBoolean();

        public a(CompletableSubscriber completableSubscriber, int i) {
            this.a = completableSubscriber;
            this.c = new SpscArrayQueue<>(i);
            add(this.b);
            request(i);
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Completable completable) {
            if (!this.c.offer(completable)) {
                onError(new MissingBackpressureException());
            } else if (this.g.getAndIncrement() == 0) {
                b();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.e.compareAndSet(false, true)) {
                this.a.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d) {
                this.d = true;
                if (this.g.getAndIncrement() == 0) {
                    b();
                }
            }
        }

        void a(Throwable th) {
            unsubscribe();
            onError(th);
        }

        void a() {
            if (this.g.decrementAndGet() != 0) {
                b();
            }
            if (!this.d) {
                request(1L);
            }
        }

        void b() {
            boolean z = this.d;
            Completable poll = this.c.poll();
            if (poll == null) {
                if (z) {
                    if (this.e.compareAndSet(false, true)) {
                        this.a.onCompleted();
                        return;
                    }
                    return;
                }
                RxJavaHooks.onError(new IllegalStateException("Queue is empty?!"));
                return;
            }
            poll.unsafeSubscribe(this.f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0359a implements CompletableSubscriber {
            C0359a() {
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                a.this.b.set(subscription);
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                a.this.a(th);
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                a.this.a();
            }
        }
    }
}
