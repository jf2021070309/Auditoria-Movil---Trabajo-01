package rx.internal.operators;

import java.util.Arrays;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class SingleOnSubscribeUsing<T, Resource> implements Single.OnSubscribe<T> {
    final Func0<Resource> a;
    final Func1<? super Resource, ? extends Single<? extends T>> b;
    final Action1<? super Resource> c;
    final boolean d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public SingleOnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.a = func0;
        this.b = func1;
        this.c = action1;
        this.d = z;
    }

    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        try {
            final Resource call = this.a.call();
            try {
                Single<? extends T> call2 = this.b.call(call);
                if (call2 == null) {
                    a(singleSubscriber, call, new NullPointerException("The single"));
                    return;
                }
                SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeUsing.1
                    @Override // rx.SingleSubscriber
                    public void onSuccess(T t) {
                        if (SingleOnSubscribeUsing.this.d) {
                            try {
                                SingleOnSubscribeUsing.this.c.call((Object) call);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                singleSubscriber.onError(th);
                                return;
                            }
                        }
                        singleSubscriber.onSuccess(t);
                        if (!SingleOnSubscribeUsing.this.d) {
                            try {
                                SingleOnSubscribeUsing.this.c.call((Object) call);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                RxJavaHooks.onError(th2);
                            }
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // rx.SingleSubscriber
                    public void onError(Throwable th) {
                        SingleOnSubscribeUsing.this.a(singleSubscriber, call, th);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                call2.subscribe((SingleSubscriber<? super Object>) singleSubscriber2);
            } catch (Throwable th) {
                a(singleSubscriber, call, th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }

    void a(SingleSubscriber<? super T> singleSubscriber, Resource resource, Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.d) {
            try {
                this.c.call(resource);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(Arrays.asList(th, th2));
            }
        }
        singleSubscriber.onError(th);
        if (!this.d) {
            try {
                this.c.call(resource);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaHooks.onError(th3);
            }
        }
    }
}
