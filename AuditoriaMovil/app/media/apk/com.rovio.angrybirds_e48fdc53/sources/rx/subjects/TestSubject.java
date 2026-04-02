package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.schedulers.TestScheduler;
import rx.subjects.SubjectSubscriptionManager;
/* loaded from: classes4.dex */
public final class TestSubject<T> extends Subject<T, T> {
    private final SubjectSubscriptionManager<T> b;
    private final Scheduler.Worker c;

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.d = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.TestSubject.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
                subjectObserver.b(SubjectSubscriptionManager.this.a(), SubjectSubscriptionManager.this.f);
            }
        };
        subjectSubscriptionManager.e = subjectSubscriptionManager.d;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    protected TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.b = subjectSubscriptionManager;
        this.c = testScheduler.createWorker();
    }

    @Override // rx.Observer
    public void onCompleted() {
        onCompleted(0L);
    }

    void a() {
        if (this.b.b) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.c(NotificationLite.instance().completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    public void onCompleted(long j) {
        this.c.schedule(new Action0() { // from class: rx.subjects.TestSubject.2
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.a();
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        onError(th, 0L);
    }

    void a(Throwable th) {
        if (this.b.b) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.c(NotificationLite.instance().error(th))) {
                subjectObserver.onError(th);
            }
        }
    }

    public void onError(final Throwable th, long j) {
        this.c.schedule(new Action0() { // from class: rx.subjects.TestSubject.3
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.a(th);
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        onNext(t, 0L);
    }

    void a(T t) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.b()) {
            subjectObserver.onNext(t);
        }
    }

    public void onNext(final T t, long j) {
        this.c.schedule(new Action0() { // from class: rx.subjects.TestSubject.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.a((TestSubject) t);
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.b().length > 0;
    }
}
