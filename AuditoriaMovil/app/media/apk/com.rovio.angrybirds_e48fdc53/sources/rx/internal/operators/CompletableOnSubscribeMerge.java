package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class CompletableOnSubscribeMerge implements Completable.OnSubscribe {
    final Observable<Completable> a;
    final int b;
    final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeMerge(Observable<? extends Completable> observable, int i, boolean z) {
        this.a = observable;
        this.b = i;
        this.c = z;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b, this.c);
        completableSubscriber.onSubscribe(aVar);
        this.a.subscribe((Subscriber<? super Completable>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends Subscriber<Completable> {
        final CompletableSubscriber a;
        final boolean c;
        volatile boolean d;
        final CompositeSubscription b = new CompositeSubscription();
        final AtomicInteger g = new AtomicInteger(1);
        final AtomicBoolean f = new AtomicBoolean();
        final AtomicReference<Queue<Throwable>> e = new AtomicReference<>();

        public a(CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.a = completableSubscriber;
            this.c = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i);
            }
        }

        Queue<Throwable> a() {
            Queue<Throwable> queue = this.e.get();
            if (queue == null) {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                return !this.e.compareAndSet(null, concurrentLinkedQueue) ? this.e.get() : concurrentLinkedQueue;
            }
            return queue;
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Completable completable) {
            if (!this.d) {
                this.g.getAndIncrement();
                completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMerge.a.1
                    Subscription a;
                    boolean b;

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        this.a = subscription;
                        a.this.b.add(subscription);
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th) {
                        if (this.b) {
                            RxJavaHooks.onError(th);
                            return;
                        }
                        this.b = true;
                        a.this.b.remove(this.a);
                        a.this.a().offer(th);
                        a.this.b();
                        if (a.this.c && !a.this.d) {
                            a.this.request(1L);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        if (!this.b) {
                            this.b = true;
                            a.this.b.remove(this.a);
                            a.this.b();
                            if (!a.this.d) {
                                a.this.request(1L);
                            }
                        }
                    }
                });
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
                return;
            }
            a().offer(th);
            this.d = true;
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d) {
                this.d = true;
                b();
            }
        }

        void b() {
            Queue<Throwable> queue;
            if (this.g.decrementAndGet() == 0) {
                Queue<Throwable> queue2 = this.e.get();
                if (queue2 == null || queue2.isEmpty()) {
                    this.a.onCompleted();
                    return;
                }
                Throwable collectErrors = CompletableOnSubscribeMerge.collectErrors(queue2);
                if (this.f.compareAndSet(false, true)) {
                    this.a.onError(collectErrors);
                } else {
                    RxJavaHooks.onError(collectErrors);
                }
            } else if (!this.c && (queue = this.e.get()) != null && !queue.isEmpty()) {
                Throwable collectErrors2 = CompletableOnSubscribeMerge.collectErrors(queue);
                if (this.f.compareAndSet(false, true)) {
                    this.a.onError(collectErrors2);
                } else {
                    RxJavaHooks.onError(collectErrors2);
                }
            }
        }
    }

    public static Throwable collectErrors(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Throwable) arrayList.get(0);
        }
        return new CompositeException(arrayList);
    }
}
