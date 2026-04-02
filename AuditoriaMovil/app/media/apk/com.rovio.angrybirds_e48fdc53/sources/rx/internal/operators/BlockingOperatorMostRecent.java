package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class BlockingOperatorMostRecent {
    private BlockingOperatorMostRecent() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> mostRecent(final Observable<? extends T> observable, final T t) {
        return new Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                a aVar = new a(t);
                observable.subscribe((Subscriber) aVar);
                return aVar.a();
            }
        };
    }

    /* loaded from: classes4.dex */
    static final class a<T> extends Subscriber<T> {
        final NotificationLite<T> a = NotificationLite.instance();
        volatile Object b;

        a(T t) {
            this.b = this.a.next(t);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b = this.a.completed();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b = this.a.error(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b = this.a.next(t);
        }

        public Iterator<T> a() {
            return new Iterator<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.a.1
                private Object b;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    this.b = a.this.b;
                    return !a.this.a.isCompleted(this.b);
                }

                @Override // java.util.Iterator
                public T next() {
                    try {
                        if (this.b == null) {
                            this.b = a.this.b;
                        }
                        if (a.this.a.isCompleted(this.b)) {
                            throw new NoSuchElementException();
                        }
                        if (a.this.a.isError(this.b)) {
                            throw Exceptions.propagate(a.this.a.getError(this.b));
                        }
                        return a.this.a.getValue(this.b);
                    } finally {
                        this.b = null;
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Read only iterator");
                }
            };
        }
    }
}
