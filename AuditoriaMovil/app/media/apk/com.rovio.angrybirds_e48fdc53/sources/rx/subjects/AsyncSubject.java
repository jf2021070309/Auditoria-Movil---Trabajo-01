package rx.subjects;

import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.internal.producers.SingleProducer;
import rx.subjects.SubjectSubscriptionManager;
/* loaded from: classes4.dex */
public final class AsyncSubject<T> extends Subject<T, T> {
    final SubjectSubscriptionManager<T> b;
    volatile Object c;
    private final NotificationLite<T> d;

    public static <T> AsyncSubject<T> create() {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.e = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.AsyncSubject.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
                Object a = SubjectSubscriptionManager.this.a();
                NotificationLite<T> notificationLite = SubjectSubscriptionManager.this.f;
                if (a == null || notificationLite.isCompleted(a)) {
                    subjectObserver.onCompleted();
                } else if (notificationLite.isError(a)) {
                    subjectObserver.onError(notificationLite.getError(a));
                } else {
                    subjectObserver.a.setProducer(new SingleProducer(subjectObserver.a, notificationLite.getValue(a)));
                }
            }
        };
        return new AsyncSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    protected AsyncSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.d = NotificationLite.instance();
        this.b = subjectSubscriptionManager;
    }

    @Override // rx.Observer
    public void onCompleted() {
        SubjectSubscriptionManager.SubjectObserver<T>[] c;
        if (this.b.b) {
            Object obj = this.c;
            if (obj == null) {
                obj = this.d.completed();
            }
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.c(obj)) {
                if (obj == this.d.completed()) {
                    subjectObserver.onCompleted();
                } else {
                    subjectObserver.a.setProducer(new SingleProducer(subjectObserver.a, this.d.getValue(obj)));
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.b.b) {
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.c(this.d.error(th))) {
                try {
                    subjectObserver.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.c = this.d.next(t);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.b().length > 0;
    }

    public boolean hasValue() {
        return !this.d.isError(this.b.a()) && this.d.isNext(this.c);
    }

    public boolean hasThrowable() {
        return this.d.isError(this.b.a());
    }

    public boolean hasCompleted() {
        Object a = this.b.a();
        return (a == null || this.d.isError(a)) ? false : true;
    }

    public T getValue() {
        Object obj = this.c;
        if (this.d.isError(this.b.a()) || !this.d.isNext(obj)) {
            return null;
        }
        return this.d.getValue(obj);
    }

    public Throwable getThrowable() {
        Object a = this.b.a();
        if (this.d.isError(a)) {
            return this.d.getError(a);
        }
        return null;
    }
}
