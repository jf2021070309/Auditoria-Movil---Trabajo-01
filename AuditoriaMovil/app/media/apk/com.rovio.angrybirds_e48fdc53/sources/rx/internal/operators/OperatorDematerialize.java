package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {
    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorDematerialize<Object> a = new OperatorDematerialize<>();

        a() {
        }
    }

    public static OperatorDematerialize instance() {
        return a.a;
    }

    OperatorDematerialize() {
    }

    public Subscriber<? super Notification<T>> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<Notification<T>>(subscriber) { // from class: rx.internal.operators.OperatorDematerialize.1
            boolean a;

            @Override // rx.Observer
            /* renamed from: a */
            public void onNext(Notification<T> notification) {
                switch (AnonymousClass2.a[notification.getKind().ordinal()]) {
                    case 1:
                        if (!this.a) {
                            subscriber.onNext(notification.getValue());
                            return;
                        }
                        return;
                    case 2:
                        onError(notification.getThrowable());
                        return;
                    case 3:
                        onCompleted();
                        return;
                    default:
                        onError(new IllegalArgumentException("Unsupported notification type: " + notification));
                        return;
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    subscriber.onError(th);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    subscriber.onCompleted();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorDematerialize$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[Notification.Kind.values().length];

        static {
            try {
                a[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }
}
