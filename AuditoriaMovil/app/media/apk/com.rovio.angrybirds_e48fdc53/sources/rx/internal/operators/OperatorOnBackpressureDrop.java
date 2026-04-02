package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public class OperatorOnBackpressureDrop<T> implements Observable.Operator<T, T> {
    final Action1<? super T> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorOnBackpressureDrop<Object> a = new OperatorOnBackpressureDrop<>();

        a() {
        }
    }

    public static <T> OperatorOnBackpressureDrop<T> instance() {
        return (OperatorOnBackpressureDrop<T>) a.a;
    }

    OperatorOnBackpressureDrop() {
        this(null);
    }

    public OperatorOnBackpressureDrop(Action1<? super T> action1) {
        this.a = action1;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        final AtomicLong atomicLong = new AtomicLong();
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorOnBackpressureDrop.1
            @Override // rx.Producer
            public void request(long j) {
                BackpressureUtils.getAndAddRequest(atomicLong, j);
            }
        });
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorOnBackpressureDrop.2
            boolean a;

            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    subscriber.onCompleted();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    subscriber.onError(th);
                    return;
                }
                RxJavaHooks.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (!this.a) {
                    if (atomicLong.get() > 0) {
                        subscriber.onNext(t);
                        atomicLong.decrementAndGet();
                    } else if (OperatorOnBackpressureDrop.this.a != null) {
                        try {
                            OperatorOnBackpressureDrop.this.a.call(t);
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, this, t);
                        }
                    }
                }
            }
        };
    }
}
