package rx.internal.operators;

import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.AssemblyStackTraceException;
/* loaded from: classes4.dex */
public final class OnSubscribeOnAssemblyCompletable<T> implements Completable.OnSubscribe {
    public static volatile boolean fullStackTrace;
    final Completable.OnSubscribe a;
    final String b = OnSubscribeOnAssembly.a();

    public OnSubscribeOnAssemblyCompletable(Completable.OnSubscribe onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        this.a.call(new a(completableSubscriber, this.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a implements CompletableSubscriber {
        final CompletableSubscriber a;
        final String b;

        public a(CompletableSubscriber completableSubscriber, String str) {
            this.a = completableSubscriber;
            this.b = str;
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.onSubscribe(subscription);
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.b).attachTo(th);
            this.a.onError(th);
        }
    }
}
