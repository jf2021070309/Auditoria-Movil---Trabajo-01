package rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class ProducerObserverArbiter<T> implements Observer<T>, Producer {
    static final Producer j = new Producer() { // from class: rx.internal.producers.ProducerObserverArbiter.1
        @Override // rx.Producer
        public void request(long j2) {
        }
    };
    final Subscriber<? super T> a;
    boolean b;
    List<T> c;
    Producer d;
    long e;
    long f;
    Producer g;
    Object h;
    volatile boolean i;

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.a = subscriber;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        synchronized (this) {
            if (this.b) {
                List list = this.c;
                if (list == null) {
                    list = new ArrayList(4);
                    this.c = list;
                }
                list.add(t);
                return;
            }
            this.b = true;
            try {
                this.a.onNext(t);
                long j2 = this.e;
                if (j2 != Long.MAX_VALUE) {
                    this.e = j2 - 1;
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = false;
                    throw th;
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        boolean z;
        synchronized (this) {
            if (this.b) {
                this.h = th;
                z = false;
            } else {
                this.b = true;
                z = true;
            }
        }
        if (z) {
            this.a.onError(th);
        } else {
            this.i = true;
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        synchronized (this) {
            if (this.b) {
                this.h = true;
                return;
            }
            this.b = true;
            this.a.onCompleted();
        }
    }

    @Override // rx.Producer
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 != 0) {
            synchronized (this) {
                if (this.b) {
                    this.f += j2;
                } else {
                    this.b = true;
                    Producer producer = this.d;
                    try {
                        long j3 = this.e + j2;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                        this.e = j3;
                        a();
                        if (producer != null) {
                            producer.request(j2);
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.b = false;
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            if (this.b) {
                if (producer == null) {
                    producer = j;
                }
                this.g = producer;
                return;
            }
            this.b = true;
            this.d = producer;
            long j2 = this.e;
            try {
                a();
                if (producer != null && j2 != 0) {
                    producer.request(j2);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = false;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0007, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.ProducerObserverArbiter.a():void");
    }
}
