package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class CompletableOnSubscribeMergeDelayErrorArray implements Completable.OnSubscribe {
    final Completable[] a;

    public CompletableOnSubscribeMergeDelayErrorArray(Completable[] completableArr) {
        this.a = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(final CompletableSubscriber completableSubscriber) {
        Completable[] completableArr;
        final CompositeSubscription compositeSubscription = new CompositeSubscription();
        final AtomicInteger atomicInteger = new AtomicInteger(this.a.length + 1);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (Completable completable : this.a) {
            if (!compositeSubscription.isUnsubscribed()) {
                if (completable == null) {
                    concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray.1
                        @Override // rx.CompletableSubscriber
                        public void onSubscribe(Subscription subscription) {
                            compositeSubscription.add(subscription);
                        }

                        @Override // rx.CompletableSubscriber
                        public void onError(Throwable th) {
                            concurrentLinkedQueue.offer(th);
                            a();
                        }

                        @Override // rx.CompletableSubscriber
                        public void onCompleted() {
                            a();
                        }

                        void a() {
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (concurrentLinkedQueue.isEmpty()) {
                                    completableSubscriber.onCompleted();
                                } else {
                                    completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
                                }
                            }
                        }
                    });
                }
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber.onCompleted();
            } else {
                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
            }
        }
    }
}
