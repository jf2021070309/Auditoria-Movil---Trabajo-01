package retrofit2.adapter.rxjava;

import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import rx.Observable;
import rx.Scheduler;
/* loaded from: classes4.dex */
final class f<R> implements CallAdapter<R, Object> {
    private final Type a;
    private final Scheduler b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Type type, Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = type;
        this.b = scheduler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.a;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call<R> call) {
        e dVar;
        if (this.c) {
            dVar = new c(call);
        } else {
            dVar = new d(call);
        }
        if (this.d) {
            dVar = new e(dVar);
        } else if (this.e) {
            dVar = new retrofit2.adapter.rxjava.a(dVar);
        }
        Observable create = Observable.create(dVar);
        if (this.b != null) {
            create = create.subscribeOn(this.b);
        }
        if (this.f) {
            return create.toSingle();
        }
        if (this.g) {
            return a.a(create);
        }
        return create;
    }

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        static Object a(Observable<?> observable) {
            return observable.toCompletable();
        }
    }
}
