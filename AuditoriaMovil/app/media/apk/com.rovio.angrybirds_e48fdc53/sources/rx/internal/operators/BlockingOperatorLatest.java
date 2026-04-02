package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class BlockingOperatorLatest {
    private BlockingOperatorLatest() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> latest(final Observable<? extends T> observable) {
        return new Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorLatest.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                a aVar = new a();
                Observable.this.materialize().subscribe((Subscriber<? super Notification<T>>) aVar);
                return aVar;
            }
        };
    }

    /* loaded from: classes4.dex */
    static final class a<T> extends Subscriber<Notification<? extends T>> implements Iterator<T> {
        final Semaphore a = new Semaphore(0);
        final AtomicReference<Notification<? extends T>> b = new AtomicReference<>();
        Notification<? extends T> c;

        a() {
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Notification<? extends T> notification) {
            if (this.b.getAndSet(notification) == null) {
                this.a.release();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c != null && this.c.isOnError()) {
                throw Exceptions.propagate(this.c.getThrowable());
            }
            if ((this.c == null || !this.c.isOnCompleted()) && this.c == null) {
                try {
                    this.a.acquire();
                    this.c = this.b.getAndSet(null);
                    if (this.c.isOnError()) {
                        throw Exceptions.propagate(this.c.getThrowable());
                    }
                } catch (InterruptedException e) {
                    unsubscribe();
                    Thread.currentThread().interrupt();
                    this.c = Notification.createOnError(e);
                    throw Exceptions.propagate(e);
                }
            }
            return !this.c.isOnCompleted();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext() && this.c.isOnNext()) {
                T value = this.c.getValue();
                this.c = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }
}
