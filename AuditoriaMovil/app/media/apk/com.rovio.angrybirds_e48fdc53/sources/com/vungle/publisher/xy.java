package com.vungle.publisher;

import com.vungle.publisher.ei;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.th;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
@Singleton
/* loaded from: classes4.dex */
public class xy implements Func1<gd<?>, Observable<? extends gd<?>>> {
    @Inject
    th.a a;
    @Inject
    uu b;
    @Inject
    uz c;
    @Inject
    yd d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // rx.functions.Func1
    /* renamed from: a */
    public Observable<? extends gd<?>> call(gd<?> gdVar) {
        ei.b o = gdVar.o();
        ei.a j = gdVar.j();
        String f = gdVar.f();
        Logger.d(Logger.PREPARE_TAG, "preparing viewable: " + gdVar);
        Observable<? extends gd<?>> just = Observable.just(gdVar);
        switch (j) {
            case ready:
                return just;
            case downloaded:
                break;
            case aware:
            case failed:
                Logger.d(Logger.PREPARE_TAG, o + " will begin downloading for ad_id " + f);
                just = just.flatMap(this.a).flatMap(this.c).zipWith(Observable.just(gdVar), this.b);
                break;
            default:
                throw new IllegalStateException("unexpected " + o + " status: " + j);
        }
        return just.flatMap(a()).doOnError(b(gdVar)).retryWhen(this.d.a(3, "viewable prep failed"));
    }

    Action1<Throwable> b(gd<?> gdVar) {
        return xz.a(gdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(gd gdVar, Throwable th) {
        Logger.i(Logger.PREPARE_TAG, "viewable prep error, update status to failed for " + gdVar);
        gdVar.b(ei.a.failed);
    }

    Func1<gd<?>, Observable<? extends gd<?>>> a() {
        return ya.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Observable c(gd gdVar) {
        if (!gdVar.m()) {
            throw new RuntimeException(gdVar.o() + " post processing failed for ad_id " + gdVar.f());
        }
        return Observable.just(gdVar);
    }
}
