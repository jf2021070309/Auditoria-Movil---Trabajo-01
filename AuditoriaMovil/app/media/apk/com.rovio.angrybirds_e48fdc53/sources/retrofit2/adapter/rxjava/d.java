package retrofit2.adapter.rxjava;

import retrofit2.Call;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
final class d<T> implements Observable.OnSubscribe<Response<T>> {
    private final Call<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Call<T> call) {
        this.a = call;
    }

    @Override // rx.functions.Action1
    /* renamed from: a */
    public void call(Subscriber<? super Response<T>> subscriber) {
        Call<T> mo25clone = this.a.mo25clone();
        b bVar = new b(mo25clone, subscriber);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        try {
            bVar.a(mo25clone.execute());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            bVar.a(th);
        }
    }
}
