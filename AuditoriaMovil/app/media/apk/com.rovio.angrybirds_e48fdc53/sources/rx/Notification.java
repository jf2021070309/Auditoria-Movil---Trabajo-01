package rx;
/* loaded from: classes4.dex */
public final class Notification<T> {
    private static final Notification<Void> d = new Notification<>(Kind.OnCompleted, null, null);
    private final Kind a;
    private final Throwable b;
    private final T c;

    /* loaded from: classes4.dex */
    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public static <T> Notification<T> createOnNext(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    public static <T> Notification<T> createOnError(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    public static <T> Notification<T> createOnCompleted() {
        return (Notification<T>) d;
    }

    @Deprecated
    public static <T> Notification<T> createOnCompleted(Class<T> cls) {
        return (Notification<T>) d;
    }

    private Notification(Kind kind, T t, Throwable th) {
        this.c = t;
        this.b = th;
        this.a = kind;
    }

    public Throwable getThrowable() {
        return this.b;
    }

    public T getValue() {
        return this.c;
    }

    public boolean hasValue() {
        return isOnNext() && this.c != null;
    }

    public boolean hasThrowable() {
        return isOnError() && this.b != null;
    }

    public Kind getKind() {
        return this.a;
    }

    public boolean isOnError() {
        return getKind() == Kind.OnError;
    }

    public boolean isOnCompleted() {
        return getKind() == Kind.OnCompleted;
    }

    public boolean isOnNext() {
        return getKind() == Kind.OnNext;
    }

    public void accept(Observer<? super T> observer) {
        if (this.a == Kind.OnNext) {
            observer.onNext(getValue());
        } else if (this.a == Kind.OnCompleted) {
            observer.onCompleted();
        } else {
            observer.onError(getThrowable());
        }
    }

    public String toString() {
        StringBuilder append = new StringBuilder(64).append('[').append(super.toString()).append(' ').append(getKind());
        if (hasValue()) {
            append.append(' ').append(getValue());
        }
        if (hasThrowable()) {
            append.append(' ').append(getThrowable().getMessage());
        }
        append.append(']');
        return append.toString();
    }

    public int hashCode() {
        int hashCode = getKind().hashCode();
        if (hasValue()) {
            hashCode = (hashCode * 31) + getValue().hashCode();
        }
        if (hasThrowable()) {
            return (hashCode * 31) + getThrowable().hashCode();
        }
        return hashCode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == getClass()) {
            Notification notification = (Notification) obj;
            if (notification.getKind() != getKind() || ((this.c != notification.c && (this.c == null || !this.c.equals(notification.c))) || (this.b != notification.b && (this.b == null || !this.b.equals(notification.b))))) {
                z = false;
            }
            return z;
        }
        return false;
    }
}
