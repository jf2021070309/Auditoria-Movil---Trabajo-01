package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.AsyncEmitter;
import rx.Completable;
import rx.CompletableEmitter;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.OnSubscribeFromEmitter;
import rx.internal.subscriptions.SequentialSubscription;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class CompletableFromEmitter implements Completable.OnSubscribe {
    final Action1<CompletableEmitter> a;

    public CompletableFromEmitter(Action1<CompletableEmitter> action1) {
        this.a = action1;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber);
        completableSubscriber.onSubscribe(aVar);
        try {
            this.a.call(aVar);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            aVar.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AtomicBoolean implements CompletableEmitter, Subscription {
        private static final long serialVersionUID = 5539301318568668881L;
        final CompletableSubscriber a;
        final SequentialSubscription b = new SequentialSubscription();

        public a(CompletableSubscriber completableSubscriber) {
            this.a = completableSubscriber;
        }

        @Override // rx.CompletableEmitter
        public void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.a.onCompleted();
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        @Override // rx.CompletableEmitter
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                try {
                    this.a.onError(th);
                    return;
                } finally {
                    this.b.unsubscribe();
                }
            }
            RxJavaHooks.onError(th);
        }

        @Override // rx.CompletableEmitter
        public void setSubscription(Subscription subscription) {
            this.b.update(subscription);
        }

        @Override // rx.CompletableEmitter
        public void setCancellation(AsyncEmitter.Cancellable cancellable) {
            setSubscription(new OnSubscribeFromEmitter.c(cancellable));
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.unsubscribe();
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }
    }
}
