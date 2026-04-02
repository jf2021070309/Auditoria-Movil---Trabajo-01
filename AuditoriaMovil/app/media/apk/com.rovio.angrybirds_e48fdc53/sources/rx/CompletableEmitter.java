package rx;

import rx.AsyncEmitter;
/* loaded from: classes4.dex */
public interface CompletableEmitter {
    void onCompleted();

    void onError(Throwable th);

    void setCancellation(AsyncEmitter.Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
