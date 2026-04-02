package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.util.RxRingBuffer;
/* loaded from: classes4.dex */
public final class BlockingOperatorToIterator {
    private BlockingOperatorToIterator() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterator<T> toIterator(Observable<? extends T> observable) {
        SubscriberIterator subscriberIterator = new SubscriberIterator();
        observable.materialize().subscribe((Subscriber<? super Notification<? extends T>>) subscriberIterator);
        return subscriberIterator;
    }

    /* loaded from: classes4.dex */
    public static final class SubscriberIterator<T> extends Subscriber<Notification<? extends T>> implements Iterator<T> {
        static final int a = (RxRingBuffer.SIZE * 3) / 4;
        private final BlockingQueue<Notification<? extends T>> b = new LinkedBlockingQueue();
        private Notification<? extends T> c;
        private int d;

        @Override // rx.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Notification) ((Notification) obj));
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.offer(Notification.createOnError(th));
        }

        public void onNext(Notification<? extends T> notification) {
            this.b.offer(notification);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c == null) {
                this.c = a();
                this.d++;
                if (this.d >= a) {
                    request(this.d);
                    this.d = 0;
                }
            }
            if (this.c.isOnError()) {
                throw Exceptions.propagate(this.c.getThrowable());
            }
            return !this.c.isOnCompleted();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T value = this.c.getValue();
                this.c = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        private Notification<? extends T> a() {
            try {
                Notification<? extends T> poll = this.b.poll();
                return poll != null ? poll : this.b.take();
            } catch (InterruptedException e) {
                unsubscribe();
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }
    }
}
