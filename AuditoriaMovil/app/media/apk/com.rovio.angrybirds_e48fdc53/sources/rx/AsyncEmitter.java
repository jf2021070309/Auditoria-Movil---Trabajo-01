package rx;
/* loaded from: classes4.dex */
public interface AsyncEmitter<T> extends Observer<T> {

    /* loaded from: classes4.dex */
    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    /* loaded from: classes4.dex */
    public interface Cancellable {
        void cancel();
    }

    long requested();

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
