package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.AssemblyStackTraceException;
/* loaded from: classes4.dex */
public final class OnSubscribeOnAssemblySingle<T> implements Single.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    final Single.OnSubscribe<T> a;
    final String b = OnSubscribeOnAssembly.a();

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public OnSubscribeOnAssemblySingle(Single.OnSubscribe<T> onSubscribe) {
        this.a = onSubscribe;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        this.a.call(new a(singleSubscriber, this.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends SingleSubscriber<T> {
        final SingleSubscriber<? super T> a;
        final String b;

        public a(SingleSubscriber<? super T> singleSubscriber, String str) {
            this.a = singleSubscriber;
            this.b = str;
            singleSubscriber.add(this);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.b).attachTo(th);
            this.a.onError(th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }
}
