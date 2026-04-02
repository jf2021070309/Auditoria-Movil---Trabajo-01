package rx.observers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Notification;
import rx.Observer;
import rx.exceptions.CompositeException;
@Deprecated
/* loaded from: classes4.dex */
public class TestObserver<T> implements Observer<T> {
    private static final Observer<Object> e = new Observer<Object>() { // from class: rx.observers.TestObserver.1
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    };
    private final Observer<T> a;
    private final List<T> b;
    private final List<Throwable> c;
    private final List<Notification<T>> d;

    public TestObserver(Observer<T> observer) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = observer;
    }

    public TestObserver() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = (Observer<T>) e;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.d.add(Notification.createOnCompleted());
        this.a.onCompleted();
    }

    public List<Notification<T>> getOnCompletedEvents() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.c.add(th);
        this.a.onError(th);
    }

    public List<Throwable> getOnErrorEvents() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.add(t);
        this.a.onNext(t);
    }

    public List<T> getOnNextEvents() {
        return Collections.unmodifiableList(this.b);
    }

    public List<Object> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        return Collections.unmodifiableList(arrayList);
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.b.size() != list.size()) {
            a("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.b.size() + ".\nProvided values: " + list + "\nActual values: " + this.b + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            T t2 = this.b.get(i);
            if (t == null) {
                if (t2 != null) {
                    a("Value at index: " + i + " expected to be [null] but was: [" + t2 + "]\n");
                }
            } else if (!t.equals(t2)) {
                a("Value at index: " + i + " expected to be [" + t + "] (" + t.getClass().getSimpleName() + ") but was: [" + t2 + "] (" + (t2 != null ? t2.getClass().getSimpleName() : "null") + ")\n");
            }
        }
    }

    public void assertTerminalEvent() {
        if (this.c.size() > 1) {
            a("Too many onError events: " + this.c.size());
        }
        if (this.d.size() > 1) {
            a("Too many onCompleted events: " + this.d.size());
        }
        if (this.d.size() == 1 && this.c.size() == 1) {
            a("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.d.isEmpty() && this.c.isEmpty()) {
            a("No terminal events received.");
        }
    }

    final void a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str).append(" (");
        int size = this.d.size();
        sb.append(size).append(" completion");
        if (size != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.c.isEmpty()) {
            int size2 = this.c.size();
            sb.append(" (+").append(size2).append(" error");
            if (size2 != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.c.isEmpty()) {
            if (this.c.size() == 1) {
                assertionError.initCause(this.c.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.c));
            }
        }
        throw assertionError;
    }
}
