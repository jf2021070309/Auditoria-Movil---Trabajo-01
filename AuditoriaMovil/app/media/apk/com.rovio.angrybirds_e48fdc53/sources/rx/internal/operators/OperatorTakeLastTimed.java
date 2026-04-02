package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OperatorTakeLastTimed<T> implements Observable.Operator<T, T> {
    final long a;
    final Scheduler b;
    final int c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
        this.c = -1;
    }

    public OperatorTakeLastTimed(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
        this.c = i;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final a aVar = new a(subscriber, this.c, this.a, this.b);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLastTimed.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.b(j);
            }
        });
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> a;
        final long b;
        final Scheduler c;
        final int d;
        final AtomicLong e = new AtomicLong();
        final ArrayDeque<Object> f = new ArrayDeque<>();
        final ArrayDeque<Long> g = new ArrayDeque<>();
        final NotificationLite<T> h = NotificationLite.instance();

        public a(Subscriber<? super T> subscriber, int i, long j, Scheduler scheduler) {
            this.a = subscriber;
            this.d = i;
            this.b = j;
            this.c = scheduler;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.d != 0) {
                long now = this.c.now();
                if (this.f.size() == this.d) {
                    this.f.poll();
                    this.g.poll();
                }
                a(now);
                this.f.offer(this.h.next(t));
                this.g.offer(Long.valueOf(now));
            }
        }

        protected void a(long j) {
            long j2 = j - this.b;
            while (true) {
                Long peek = this.g.peek();
                if (peek != null && peek.longValue() < j2) {
                    this.f.poll();
                    this.g.poll();
                } else {
                    return;
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.clear();
            this.g.clear();
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            a(this.c.now());
            this.g.clear();
            BackpressureUtils.postCompleteDone(this.e, this.f, this.a, this);
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return this.h.getValue(obj);
        }

        void b(long j) {
            BackpressureUtils.postCompleteRequest(this.e, j, this.f, this.a, this);
        }
    }
}
