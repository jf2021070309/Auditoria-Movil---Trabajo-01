package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class OnSubscribeSkipTimed<T> implements Observable.OnSubscribe<T> {
    final long a;
    final TimeUnit b;
    final Scheduler c;
    final Observable<T> d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeSkipTimed(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.d = observable;
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.c.createWorker();
        a aVar = new a(subscriber);
        aVar.add(createWorker);
        subscriber.add(aVar);
        createWorker.schedule(aVar, this.a, this.b);
        this.d.unsafeSubscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> a;
        volatile boolean b;

        a(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.b = true;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.b) {
                this.a.onNext(t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.a.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.a.onCompleted();
            } finally {
                unsubscribe();
            }
        }
    }
}
