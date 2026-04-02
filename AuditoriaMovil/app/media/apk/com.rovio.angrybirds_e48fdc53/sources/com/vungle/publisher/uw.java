package com.vungle.publisher;

import java.io.IOException;
import javax.inject.Inject;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public class uw implements Func1<tw, Observable<String>> {
    @Inject
    uj a;

    @Override // rx.functions.Func1
    /* renamed from: a */
    public Observable<String> call(tw twVar) {
        try {
            return Observable.just(this.a.a(twVar.a()));
        } catch (IOException e) {
            throw Exceptions.propagate(e);
        }
    }
}
