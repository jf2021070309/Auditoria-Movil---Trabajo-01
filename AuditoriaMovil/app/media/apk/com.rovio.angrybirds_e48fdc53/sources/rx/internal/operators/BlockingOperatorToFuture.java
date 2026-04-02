package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
/* loaded from: classes4.dex */
public final class BlockingOperatorToFuture {
    private BlockingOperatorToFuture() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Future<T> toFuture(Observable<? extends T> observable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final Subscription subscribe = observable.single().subscribe((Subscriber<? super Object>) ((Subscriber<T>) new Subscriber<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.1
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                atomicReference2.compareAndSet(null, th);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                atomicReference.set(t);
            }
        }));
        return new Future<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.2
            private volatile boolean e;

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (countDownLatch.getCount() > 0) {
                    this.e = true;
                    subscribe.unsubscribe();
                    countDownLatch.countDown();
                    return true;
                }
                return false;
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return this.e;
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return countDownLatch.getCount() == 0;
            }

            @Override // java.util.concurrent.Future
            public T get() {
                countDownLatch.await();
                return a();
            }

            @Override // java.util.concurrent.Future
            public T get(long j, TimeUnit timeUnit) {
                if (countDownLatch.await(j, timeUnit)) {
                    return a();
                }
                throw new TimeoutException("Timed out after " + timeUnit.toMillis(j) + "ms waiting for underlying Observable.");
            }

            private T a() {
                Throwable th = (Throwable) atomicReference2.get();
                if (th != null) {
                    throw new ExecutionException("Observable onError", th);
                }
                if (this.e) {
                    throw new CancellationException("Subscription unsubscribed");
                }
                return (T) atomicReference.get();
            }
        };
    }
}
