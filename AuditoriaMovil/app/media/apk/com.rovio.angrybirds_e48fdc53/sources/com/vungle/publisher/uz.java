package com.vungle.publisher;

import javax.inject.Inject;
import rx.Observable;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public class uz implements Func1<tr, Observable<tw>> {
    @Inject
    ue a;

    @Override // rx.functions.Func1
    /* renamed from: a */
    public Observable<tw> call(tr trVar) {
        return Observable.just(b(trVar));
    }

    protected tw b(tr trVar) {
        return this.a.a(trVar);
    }
}
