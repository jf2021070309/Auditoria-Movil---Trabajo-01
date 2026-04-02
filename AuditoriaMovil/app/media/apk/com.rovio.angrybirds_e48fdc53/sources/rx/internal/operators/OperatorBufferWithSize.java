package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
/* loaded from: classes4.dex */
public final class OperatorBufferWithSize<T> implements Observable.Operator<List<T>, T> {
    final int a;
    final int b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.a = i;
        this.b = i2;
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        if (this.b == this.a) {
            a aVar = new a(subscriber, this.a);
            subscriber.add(aVar);
            subscriber.setProducer(aVar.a());
            return aVar;
        } else if (this.b > this.a) {
            c cVar = new c(subscriber, this.a, this.b);
            subscriber.add(cVar);
            subscriber.setProducer(cVar.a());
            return cVar;
        } else {
            b bVar = new b(subscriber, this.a, this.b);
            subscriber.add(bVar);
            subscriber.setProducer(bVar.a());
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        final int b;
        List<T> c;

        public a(Subscriber<? super List<T>> subscriber, int i) {
            this.a = subscriber;
            this.b = i;
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            List list = this.c;
            if (list == null) {
                list = new ArrayList(this.b);
                this.c = list;
            }
            list.add(t);
            if (list.size() == this.b) {
                this.c = null;
                this.a.onNext(list);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.c = null;
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.c;
            if (list != null) {
                this.a.onNext(list);
            }
            this.a.onCompleted();
        }

        Producer a() {
            return new Producer() { // from class: rx.internal.operators.OperatorBufferWithSize.a.1
                @Override // rx.Producer
                public void request(long j) {
                    if (j < 0) {
                        throw new IllegalArgumentException("n >= required but it was " + j);
                    }
                    if (j != 0) {
                        a.this.request(BackpressureUtils.multiplyCap(j, a.this.b));
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        final int b;
        final int c;
        long d;
        List<T> e;

        public c(Subscriber<? super List<T>> subscriber, int i, int i2) {
            this.a = subscriber;
            this.b = i;
            this.c = i2;
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = this.d;
            List list = this.e;
            if (j == 0) {
                list = new ArrayList(this.b);
                this.e = list;
            }
            long j2 = j + 1;
            if (j2 == this.c) {
                this.d = 0L;
            } else {
                this.d = j2;
            }
            if (list != null) {
                list.add(t);
                if (list.size() == this.b) {
                    this.e = null;
                    this.a.onNext(list);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.e = null;
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.e;
            if (list != null) {
                this.e = null;
                this.a.onNext(list);
            }
            this.a.onCompleted();
        }

        Producer a() {
            return new a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(BackpressureUtils.multiplyCap(j, cVar.c));
                    } else {
                        cVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, cVar.b), BackpressureUtils.multiplyCap(cVar.c - cVar.b, j - 1)));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        final int b;
        final int c;
        long d;
        final ArrayDeque<List<T>> e = new ArrayDeque<>();
        final AtomicLong f = new AtomicLong();
        long g;

        public b(Subscriber<? super List<T>> subscriber, int i, int i2) {
            this.a = subscriber;
            this.b = i;
            this.c = i2;
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = this.d;
            if (j == 0) {
                this.e.offer(new ArrayList(this.b));
            }
            long j2 = j + 1;
            if (j2 == this.c) {
                this.d = 0L;
            } else {
                this.d = j2;
            }
            Iterator<List<T>> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            List<T> peek = this.e.peek();
            if (peek != null && peek.size() == this.b) {
                this.e.poll();
                this.g++;
                this.a.onNext(peek);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.e.clear();
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            long j = this.g;
            if (j != 0) {
                if (j > this.f.get()) {
                    this.a.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f.addAndGet(-j);
            }
            BackpressureUtils.postCompleteDone(this.f, this.e, this.a);
        }

        Producer a() {
            return new a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                b bVar = b.this;
                if (BackpressureUtils.postCompleteRequest(bVar.f, j, bVar.e, bVar.a) && j != 0) {
                    if (get() || !compareAndSet(false, true)) {
                        bVar.request(BackpressureUtils.multiplyCap(bVar.c, j));
                    } else {
                        bVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bVar.c, j - 1), bVar.b));
                    }
                }
            }
        }
    }
}
