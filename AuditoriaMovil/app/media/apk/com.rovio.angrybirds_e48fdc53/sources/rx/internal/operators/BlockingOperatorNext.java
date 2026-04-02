package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class BlockingOperatorNext {
    private BlockingOperatorNext() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> next(final Observable<? extends T> observable) {
        return new Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorNext.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new a(Observable.this, new b());
            }
        };
    }

    /* loaded from: classes4.dex */
    static final class a<T> implements Iterator<T> {
        private final b<T> a;
        private final Observable<? extends T> b;
        private T c;
        private boolean d = true;
        private boolean e = true;
        private Throwable f;
        private boolean g;

        a(Observable<? extends T> observable, b<T> bVar) {
            this.b = observable;
            this.a = bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f != null) {
                throw Exceptions.propagate(this.f);
            }
            if (this.d) {
                return !this.e || a();
            }
            return false;
        }

        private boolean a() {
            try {
                if (!this.g) {
                    this.g = true;
                    this.a.a(1);
                    this.b.materialize().subscribe((Subscriber<? super Notification<? extends T>>) this.a);
                }
                Notification<? extends T> a = this.a.a();
                if (a.isOnNext()) {
                    this.e = false;
                    this.c = a.getValue();
                    return true;
                }
                this.d = false;
                if (a.isOnCompleted()) {
                    return false;
                }
                if (a.isOnError()) {
                    this.f = a.getThrowable();
                    throw Exceptions.propagate(this.f);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.a.unsubscribe();
                Thread.currentThread().interrupt();
                this.f = e;
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f != null) {
                throw Exceptions.propagate(this.f);
            }
            if (hasNext()) {
                this.e = true;
                return this.c;
            }
            throw new NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<Notification<? extends T>> {
        private final BlockingQueue<Notification<? extends T>> b = new ArrayBlockingQueue(1);
        final AtomicInteger a = new AtomicInteger();

        b() {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Notification<? extends T> notification) {
            if (this.a.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.b.offer(notification)) {
                    Notification<? extends T> poll = this.b.poll();
                    if (poll != null && !poll.isOnNext()) {
                        notification = poll;
                    }
                }
            }
        }

        public Notification<? extends T> a() {
            a(1);
            return this.b.take();
        }

        void a(int i) {
            this.a.set(i);
        }
    }
}
