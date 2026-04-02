package rx.internal.operators;

import java.io.Serializable;
import rx.Notification;
import rx.Observer;
/* loaded from: classes4.dex */
public final class NotificationLite<T> {
    private static final NotificationLite a = new NotificationLite();
    private static final Object b = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object c = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    private NotificationLite() {
    }

    public static <T> NotificationLite<T> instance() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 3;
        final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.a;
        }
    }

    public Object next(T t) {
        if (t == null) {
            return c;
        }
        return t;
    }

    public Object completed() {
        return b;
    }

    public Object error(Throwable th) {
        return new a(th);
    }

    public boolean accept(Observer<? super T> observer, Object obj) {
        if (obj == b) {
            observer.onCompleted();
            return true;
        } else if (obj == c) {
            observer.onNext(null);
            return false;
        } else if (obj != null) {
            if (obj.getClass() == a.class) {
                observer.onError(((a) obj).a);
                return true;
            }
            observer.onNext(obj);
            return false;
        } else {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public boolean isCompleted(Object obj) {
        return obj == b;
    }

    public boolean isError(Object obj) {
        return obj instanceof a;
    }

    public boolean isNull(Object obj) {
        return obj == c;
    }

    public boolean isNext(Object obj) {
        return (obj == null || isError(obj) || isCompleted(obj)) ? false : true;
    }

    public Notification.Kind kind(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj == b) {
            return Notification.Kind.OnCompleted;
        }
        if (obj instanceof a) {
            return Notification.Kind.OnError;
        }
        return Notification.Kind.OnNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T getValue(Object obj) {
        if (obj == c) {
            return null;
        }
        return obj;
    }

    public Throwable getError(Object obj) {
        return ((a) obj).a;
    }
}
