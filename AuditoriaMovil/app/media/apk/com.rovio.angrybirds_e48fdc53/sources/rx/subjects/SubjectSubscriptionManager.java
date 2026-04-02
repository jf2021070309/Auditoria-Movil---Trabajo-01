package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.NotificationLite;
import rx.subscriptions.Subscriptions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SubjectSubscriptionManager<T> extends AtomicReference<State<T>> implements Observable.OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    volatile Object a;
    boolean b;
    Action1<SubjectObserver<T>> c;
    Action1<SubjectObserver<T>> d;
    Action1<SubjectObserver<T>> e;
    public final NotificationLite<T> f;

    @Override // rx.functions.Action1
    public /* synthetic */ void call(Object obj) {
        a((Subscriber) ((Subscriber) obj));
    }

    public SubjectSubscriptionManager() {
        super(State.e);
        this.b = true;
        this.c = Actions.empty();
        this.d = Actions.empty();
        this.e = Actions.empty();
        this.f = NotificationLite.instance();
    }

    public void a(Subscriber<? super T> subscriber) {
        SubjectObserver<T> subjectObserver = new SubjectObserver<>(subscriber);
        a(subscriber, subjectObserver);
        this.c.call(subjectObserver);
        if (!subscriber.isUnsubscribed() && a((SubjectObserver) subjectObserver) && subscriber.isUnsubscribed()) {
            b((SubjectObserver) subjectObserver);
        }
    }

    void a(Subscriber<? super T> subscriber, final SubjectObserver<T> subjectObserver) {
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.subjects.SubjectSubscriptionManager.1
            @Override // rx.functions.Action0
            public void call() {
                SubjectSubscriptionManager.this.b((SubjectObserver) subjectObserver);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Object obj) {
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubjectObserver<T>[] b() {
        return get().b;
    }

    boolean a(SubjectObserver<T> subjectObserver) {
        State<T> state;
        do {
            state = get();
            if (state.a) {
                this.e.call(subjectObserver);
                return false;
            }
        } while (!compareAndSet(state, state.add(subjectObserver)));
        this.d.call(subjectObserver);
        return true;
    }

    void b(SubjectObserver<T> subjectObserver) {
        State<T> state;
        State<T> remove;
        do {
            state = get();
            if (state.a || (remove = state.remove(subjectObserver)) == state) {
                return;
            }
        } while (!compareAndSet(state, remove));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubjectObserver<T>[] b(Object obj) {
        a(obj);
        return get().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubjectObserver<T>[] c(Object obj) {
        a(obj);
        this.b = false;
        return get().a ? State.c : getAndSet(State.d).b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static final class State<T> {
        static final SubjectObserver[] c = new SubjectObserver[0];
        static final State d = new State(true, c);
        static final State e = new State(false, c);
        final boolean a;
        final SubjectObserver[] b;

        public State(boolean z, SubjectObserver[] subjectObserverArr) {
            this.a = z;
            this.b = subjectObserverArr;
        }

        public State add(SubjectObserver subjectObserver) {
            int length = this.b.length;
            SubjectObserver[] subjectObserverArr = new SubjectObserver[length + 1];
            System.arraycopy(this.b, 0, subjectObserverArr, 0, length);
            subjectObserverArr[length] = subjectObserver;
            return new State(this.a, subjectObserverArr);
        }

        public State remove(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr;
            int i;
            SubjectObserver[] subjectObserverArr2 = this.b;
            int length = subjectObserverArr2.length;
            if (length == 1 && subjectObserverArr2[0] == subjectObserver) {
                return e;
            }
            if (length != 0) {
                SubjectObserver[] subjectObserverArr3 = new SubjectObserver[length - 1];
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    SubjectObserver subjectObserver2 = subjectObserverArr2[i2];
                    if (subjectObserver2 == subjectObserver) {
                        i = i3;
                    } else if (i3 != length - 1) {
                        i = i3 + 1;
                        subjectObserverArr3[i3] = subjectObserver2;
                    } else {
                        return this;
                    }
                    i2++;
                    i3 = i;
                }
                if (i3 == 0) {
                    return e;
                }
                if (i3 < length - 1) {
                    subjectObserverArr = new SubjectObserver[i3];
                    System.arraycopy(subjectObserverArr3, 0, subjectObserverArr, 0, i3);
                } else {
                    subjectObserverArr = subjectObserverArr3;
                }
                return new State(this.a, subjectObserverArr);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static final class SubjectObserver<T> implements Observer<T> {
        final Subscriber<? super T> a;
        boolean b = true;
        boolean c;
        List<Object> d;
        boolean e;
        private volatile Object f;

        public SubjectObserver(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(Object obj, NotificationLite<T> notificationLite) {
            if (!this.e) {
                synchronized (this) {
                    this.b = false;
                    if (this.c) {
                        if (this.d == null) {
                            this.d = new ArrayList();
                        }
                        this.d.add(obj);
                        return;
                    }
                    this.e = true;
                }
            }
            notificationLite.accept(this.a, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Object obj, NotificationLite<T> notificationLite) {
            synchronized (this) {
                if (this.b && !this.c) {
                    this.b = false;
                    this.c = obj != null;
                    if (obj != null) {
                        a(null, obj, notificationLite);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a(java.util.List<java.lang.Object> r6, java.lang.Object r7, rx.internal.operators.NotificationLite<T> r8) {
            /*
                r5 = this;
                r1 = 1
                r2 = 0
                r0 = r1
            L3:
                if (r6 == 0) goto L20
                java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r4 == 0) goto L20
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L17
                r5.c(r4, r8)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r0 = move-exception
            L18:
                if (r2 != 0) goto L1f
                monitor-enter(r5)
                r1 = 0
                r5.c = r1     // Catch: java.lang.Throwable -> L3c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            L1f:
                throw r0
            L20:
                if (r0 == 0) goto L26
                r5.c(r7, r8)     // Catch: java.lang.Throwable -> L17
                r0 = r2
            L26:
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r6 = r5.d     // Catch: java.lang.Throwable -> L35
                r3 = 0
                r5.d = r3     // Catch: java.lang.Throwable -> L35
                if (r6 != 0) goto L33
                r0 = 0
                r5.c = r0     // Catch: java.lang.Throwable -> L35
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
                return
            L33:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L35
                goto L3
            L35:
                r0 = move-exception
                r1 = r2
            L37:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
                throw r0     // Catch: java.lang.Throwable -> L39
            L39:
                r0 = move-exception
                r2 = r1
                goto L18
            L3c:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
                throw r0
            L3f:
                r0 = move-exception
                goto L37
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.SubjectSubscriptionManager.SubjectObserver.a(java.util.List, java.lang.Object, rx.internal.operators.NotificationLite):void");
        }

        void c(Object obj, NotificationLite<T> notificationLite) {
            if (obj != null) {
                notificationLite.accept(this.a, obj);
            }
        }

        public <I> I index() {
            return (I) this.f;
        }

        public void index(Object obj) {
            this.f = obj;
        }
    }
}
