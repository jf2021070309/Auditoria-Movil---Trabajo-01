package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.subjects.SubjectSubscriptionManager;
/* loaded from: classes4.dex */
public final class BehaviorSubject<T> extends Subject<T, T> {
    private static final Object[] b = new Object[0];
    private final SubjectSubscriptionManager<T> c;
    private final NotificationLite<T> d;

    public static <T> BehaviorSubject<T> create() {
        return a((Object) null, false);
    }

    public static <T> BehaviorSubject<T> create(T t) {
        return a((Object) t, true);
    }

    private static <T> BehaviorSubject<T> a(T t, boolean z) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.a(NotificationLite.instance().next(t));
        }
        subjectSubscriptionManager.d = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.BehaviorSubject.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
                subjectObserver.b(SubjectSubscriptionManager.this.a(), SubjectSubscriptionManager.this.f);
            }
        };
        subjectSubscriptionManager.e = subjectSubscriptionManager.d;
        return new BehaviorSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    protected BehaviorSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.d = NotificationLite.instance();
        this.c = subjectSubscriptionManager;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.c.a() == null || this.c.b) {
            Object completed = this.d.completed();
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.c.c(completed)) {
                subjectObserver.a(completed, this.c.f);
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.c.a() == null || this.c.b) {
            Object error = this.d.error(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.c.c(error)) {
                try {
                    subjectObserver.a(error, this.c.f);
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
        if (this.c.a() == null || this.c.b) {
            Object next = this.d.next(t);
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.c.b(next)) {
                subjectObserver.a(next, this.c.f);
            }
        }
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.c.b().length > 0;
    }

    public boolean hasValue() {
        return this.d.isNext(this.c.a());
    }

    public boolean hasThrowable() {
        return this.d.isError(this.c.a());
    }

    public boolean hasCompleted() {
        return this.d.isCompleted(this.c.a());
    }

    public T getValue() {
        Object a = this.c.a();
        if (this.d.isNext(a)) {
            return this.d.getValue(a);
        }
        return null;
    }

    public Throwable getThrowable() {
        Object a = this.c.a();
        if (this.d.isError(a)) {
            return this.d.getError(a);
        }
        return null;
    }

    public T[] getValues(T[] tArr) {
        Object a = this.c.a();
        if (this.d.isNext(a)) {
            T[] tArr2 = tArr.length == 0 ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1)) : tArr;
            tArr2[0] = this.d.getValue(a);
            if (tArr2.length > 1) {
                tArr2[1] = null;
                return tArr2;
            }
            return tArr2;
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] values = getValues(b);
        if (values == b) {
            return new Object[0];
        }
        return values;
    }
}
