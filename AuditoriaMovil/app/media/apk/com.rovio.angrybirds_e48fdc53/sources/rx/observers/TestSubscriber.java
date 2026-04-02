package rx.observers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
/* loaded from: classes4.dex */
public class TestSubscriber<T> extends Subscriber<T> {
    private static final Observer<Object> h = new Observer<Object>() { // from class: rx.observers.TestSubscriber.1
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
    private int d;
    private final CountDownLatch e;
    private volatile int f;
    private volatile Thread g;

    public TestSubscriber(long j) {
        this(h, j);
    }

    public TestSubscriber(Observer<T> observer, long j) {
        this.e = new CountDownLatch(1);
        if (observer == null) {
            throw new NullPointerException();
        }
        this.a = observer;
        if (j >= 0) {
            request(j);
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public TestSubscriber(Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static <T> TestSubscriber<T> create(long j) {
        return new TestSubscriber<>(j);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer, long j) {
        return new TestSubscriber<>(observer, j);
    }

    public static <T> TestSubscriber<T> create(Subscriber<T> subscriber) {
        return new TestSubscriber<>((Subscriber) subscriber);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer) {
        return new TestSubscriber<>(observer);
    }

    @Override // rx.Observer
    public void onCompleted() {
        try {
            this.d++;
            this.g = Thread.currentThread();
            this.a.onCompleted();
        } finally {
            this.e.countDown();
        }
    }

    @Deprecated
    public List<Notification<T>> getOnCompletedEvents() {
        int i = this.d;
        ArrayList arrayList = new ArrayList(i != 0 ? i : 1);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Notification.createOnCompleted());
        }
        return arrayList;
    }

    public final int getCompletions() {
        return this.d;
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        try {
            this.g = Thread.currentThread();
            this.c.add(th);
            this.a.onError(th);
        } finally {
            this.e.countDown();
        }
    }

    public List<Throwable> getOnErrorEvents() {
        return this.c;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.g = Thread.currentThread();
        this.b.add(t);
        this.f = this.b.size();
        this.a.onNext(t);
    }

    public final int getValueCount() {
        return this.f;
    }

    public void requestMore(long j) {
        request(j);
    }

    public List<T> getOnNextEvents() {
        return this.b;
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.b.size() != list.size()) {
            a("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.b.size() + ".\nProvided values: " + list + "\nActual values: " + this.b + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            a(list.get(i), i);
        }
    }

    private void a(T t, int i) {
        T t2 = this.b.get(i);
        if (t == null) {
            if (t2 != null) {
                a("Value at index: " + i + " expected to be [null] but was: [" + t2 + "]\n");
            }
        } else if (!t.equals(t2)) {
            a("Value at index: " + i + " expected to be [" + t + "] (" + t.getClass().getSimpleName() + ") but was: [" + t2 + "] (" + (t2 != null ? t2.getClass().getSimpleName() : "null") + ")\n");
        }
    }

    public final boolean awaitValueCount(int i, long j, TimeUnit timeUnit) {
        while (j != 0 && this.f < i) {
            try {
                timeUnit.sleep(1L);
                j--;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Interrupted", e);
            }
        }
        return this.f >= i;
    }

    public void assertTerminalEvent() {
        if (this.c.size() > 1) {
            a("Too many onError events: " + this.c.size());
        }
        if (this.d > 1) {
            a("Too many onCompleted events: " + this.d);
        }
        if (this.d == 1 && this.c.size() == 1) {
            a("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.d == 0 && this.c.isEmpty()) {
            a("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (!isUnsubscribed()) {
            a("Not unsubscribed.");
        }
    }

    public void assertNoErrors() {
        if (!getOnErrorEvents().isEmpty()) {
            a("Unexpected onError events");
        }
    }

    public void awaitTerminalEvent() {
        try {
            this.e.await();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            this.e.await(j, timeUnit);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j, TimeUnit timeUnit) {
        try {
            if (!this.e.await(j, timeUnit)) {
                unsubscribe();
            }
        } catch (InterruptedException e) {
            unsubscribe();
        }
    }

    public Thread getLastSeenThread() {
        return this.g;
    }

    public void assertCompleted() {
        int i = this.d;
        if (i == 0) {
            a("Not completed!");
        } else if (i > 1) {
            a("Completed multiple times: " + i);
        }
    }

    public void assertNotCompleted() {
        int i = this.d;
        if (i == 1) {
            a("Completed!");
        } else if (i > 1) {
            a("Completed multiple times: " + i);
        }
    }

    public void assertError(Class<? extends Throwable> cls) {
        List<Throwable> list = this.c;
        if (list.isEmpty()) {
            a("No errors");
        } else if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        } else if (!cls.isInstance(list.get(0))) {
            AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
            assertionError2.initCause(list.get(0));
            throw assertionError2;
        }
    }

    public void assertError(Throwable th) {
        List<Throwable> list = this.c;
        if (list.isEmpty()) {
            a("No errors");
        } else if (list.size() > 1) {
            a("Multiple errors");
        } else if (!th.equals(list.get(0))) {
            a("Exceptions differ; expected: " + th + ", actual: " + list.get(0));
        }
    }

    public void assertNoTerminalEvent() {
        List<Throwable> list = this.c;
        int i = this.d;
        if (!list.isEmpty() || i > 0) {
            if (list.isEmpty()) {
                a("Found " + list.size() + " errors and " + i + " completion events instead of none");
            } else if (list.size() == 1) {
                a("Found " + list.size() + " errors and " + i + " completion events instead of none");
            } else {
                a("Found " + list.size() + " errors and " + i + " completion events instead of none");
            }
        }
    }

    public void assertNoValues() {
        int size = this.b.size();
        if (size != 0) {
            a("No onNext events expected yet some received: " + size);
        }
    }

    public void assertValueCount(int i) {
        int size = this.b.size();
        if (size != i) {
            a("Number of onNext events differ; expected: " + i + ", actual: " + size);
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(Arrays.asList(tArr));
    }

    public void assertValue(T t) {
        assertReceivedOnNext(Collections.singletonList(t));
    }

    final void a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str).append(" (");
        int i = this.d;
        sb.append(i).append(" completion");
        if (i != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.c.isEmpty()) {
            int size = this.c.size();
            sb.append(" (+").append(size).append(" error");
            if (size != 1) {
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

    public final void assertValuesAndClear(T t, T... tArr) {
        assertValueCount(tArr.length + 1);
        a(t, 0);
        for (int i = 0; i < tArr.length; i++) {
            a(tArr[i], i + 1);
        }
        this.b.clear();
    }
}
