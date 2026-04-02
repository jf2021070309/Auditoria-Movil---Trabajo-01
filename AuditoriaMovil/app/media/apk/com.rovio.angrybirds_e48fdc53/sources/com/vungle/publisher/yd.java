package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import rx.Observable;
import rx.Scheduler;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;
@Singleton
/* loaded from: classes4.dex */
public class yd {
    Scheduler a = Schedulers.io();

    public Func1<Observable<? extends Throwable>, Observable<?>> a(String str) {
        return a(100, str);
    }

    public Func1<Observable<? extends Throwable>, Observable<?>> a(int i, String str) {
        return ye.a(this, i + 1, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Observable a(final int i, final String str, Observable observable) {
        return observable.zipWith(Observable.range(1, i), new Func2<Throwable, Integer, Integer>() { // from class: com.vungle.publisher.yd.2
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Integer call(Throwable th, Integer num) {
                if (num.intValue() >= i) {
                    throw Exceptions.propagate(th);
                }
                return num;
            }
        }).flatMap(new Func1<Integer, Observable<Long>>() { // from class: com.vungle.publisher.yd.1
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Observable<Long> call(Integer num) {
                int a = zn.a(num.intValue(), 2000, 300000);
                Logger.d(Logger.PREPARE_TAG, "retry in " + a + " millis - " + str);
                return Observable.timer(a, TimeUnit.MILLISECONDS, yd.this.a);
            }
        });
    }
}
