package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class CompletableOnSubscribeConcatIterable implements Completable.OnSubscribe {
    final Iterable<? extends Completable> a;

    public CompletableOnSubscribeConcatIterable(Iterable<? extends Completable> iterable) {
        this.a = iterable;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        try {
            Iterator<? extends Completable> it = this.a.iterator();
            if (it == null) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                return;
            }
            a aVar = new a(completableSubscriber, it);
            completableSubscriber.onSubscribe(aVar.c);
            aVar.a();
        } catch (Throwable th) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber a;
        final Iterator<? extends Completable> b;
        final SerialSubscription c = new SerialSubscription();

        public a(CompletableSubscriber completableSubscriber, Iterator<? extends Completable> it) {
            this.a = completableSubscriber;
            this.b = it;
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.c.set(subscription);
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            a();
        }

        void a() {
            if (!this.c.isUnsubscribed() && getAndIncrement() == 0) {
                Iterator<? extends Completable> it = this.b;
                while (!this.c.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            this.a.onCompleted();
                            return;
                        }
                        try {
                            Completable next = it.next();
                            if (next == null) {
                                this.a.onError(new NullPointerException("The completable returned is null"));
                                return;
                            }
                            next.unsafeSubscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            this.a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.a.onError(th2);
                        return;
                    }
                }
            }
        }
    }
}
