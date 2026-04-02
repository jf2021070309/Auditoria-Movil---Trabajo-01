package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class CompletableOnSubscribeConcatArray implements Completable.OnSubscribe {
    final Completable[] a;

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.a = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.a);
        completableSubscriber.onSubscribe(aVar.d);
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber a;
        final Completable[] b;
        int c;
        final SerialSubscription d = new SerialSubscription();

        public a(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.a = completableSubscriber;
            this.b = completableArr;
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.d.set(subscription);
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
            if (!this.d.isUnsubscribed() && getAndIncrement() == 0) {
                Completable[] completableArr = this.b;
                while (!this.d.isUnsubscribed()) {
                    int i = this.c;
                    this.c = i + 1;
                    if (i == completableArr.length) {
                        this.a.onCompleted();
                        return;
                    }
                    completableArr[i].unsafeSubscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
