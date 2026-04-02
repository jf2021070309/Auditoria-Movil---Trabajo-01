package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.AssemblyStackTraceException;
/* loaded from: classes4.dex */
public final class OnSubscribeOnAssembly<T> implements Observable.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    final Observable.OnSubscribe<T> a;
    final String b = a();

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeOnAssembly(Observable.OnSubscribe<T> onSubscribe) {
        this.a = onSubscribe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder("Assembly trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (fullStackTrace || (stackTraceElement.getLineNumber() > 1 && !stackTraceElement2.contains("RxJavaHooks.") && !stackTraceElement2.contains("OnSubscribeOnAssembly") && !stackTraceElement2.contains(".junit.runner") && !stackTraceElement2.contains(".junit4.runner") && !stackTraceElement2.contains(".junit.internal") && !stackTraceElement2.contains("sun.reflect") && !stackTraceElement2.contains("java.lang.Thread.") && !stackTraceElement2.contains("ThreadPoolExecutor") && !stackTraceElement2.contains("org.apache.catalina.") && !stackTraceElement2.contains("org.apache.tomcat."))) {
                sb.append("\n at ").append(stackTraceElement2);
            }
        }
        return sb.append("\nOriginal exception:").toString();
    }

    public void call(Subscriber<? super T> subscriber) {
        this.a.call(new a(subscriber, this.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        final Subscriber<? super T> a;
        final String b;

        public a(Subscriber<? super T> subscriber, String str) {
            super(subscriber);
            this.a = subscriber;
            this.b = str;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.b).attachTo(th);
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }
    }
}
