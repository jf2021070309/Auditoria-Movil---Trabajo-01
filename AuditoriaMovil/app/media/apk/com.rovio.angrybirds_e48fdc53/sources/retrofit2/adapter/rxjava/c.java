package retrofit2.adapter.rxjava;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
final class c<T> implements Observable.OnSubscribe<Response<T>> {
    private final Call<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Call<T> call) {
        this.a = call;
    }

    @Override // rx.functions.Action1
    /* renamed from: a */
    public void call(Subscriber<? super Response<T>> subscriber) {
        Call<T> mo25clone = this.a.mo25clone();
        final b bVar = new b(mo25clone, subscriber);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        mo25clone.enqueue(new Callback<T>() { // from class: retrofit2.adapter.rxjava.c.1
            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                bVar.a(response);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                Exceptions.throwIfFatal(th);
                bVar.a(th);
            }
        });
    }
}
