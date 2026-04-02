package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.env.r;
import com.vungle.publisher.wd;
import com.vungle.publisher.yg;
import java.util.AbstractMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import org.json.JSONException;
import rx.Observable;
import rx.Scheduler;
import rx.exceptions.Exceptions;
import rx.schedulers.Schedulers;
/* loaded from: classes4.dex */
public class xg {
    Scheduler a = Schedulers.computation();
    @Inject
    uz b;
    @Inject
    xq c;
    @Inject
    uw d;
    @Inject
    yg.a e;
    @Inject
    xd f;
    @Inject
    r g;
    @Inject
    yd h;
    @Inject
    com.vungle.publisher.env.k i;
    @Inject
    qg j;
    @Inject
    com.vungle.publisher.env.o k;
    @Inject
    bw l;
    @Inject
    ct.a m;
    @Inject
    wd.a n;
    @Inject
    com.vungle.publisher.log.g o;

    public Observable<dr<?>> a(String str) {
        return qw.a(str).delay(this.g.c(str), TimeUnit.MILLISECONDS, this.a).subscribeOn(Schedulers.io()).flatMap(xh.a(this)).doOnNext(xi.a(this, str)).flatMap(this.e).filter(xj.a()).flatMap(xk.a(this)).flatMap(xl.a(this, str)).flatMap(this.c).doOnError(xm.a(this)).retryWhen(this.h.a("ad prep chain failure"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Observable b(String str) {
        try {
            return Observable.just(this.n.a(str));
        } catch (JSONException e) {
            throw Exceptions.propagate(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(String str, wd wdVar) {
        if (wdVar.n()) {
            this.i.a(wdVar.i());
            return;
        }
        this.j.a(new bl(str));
        this.g.a(str, wdVar.j().longValue());
        this.g.b((String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Observable a(wc wcVar) {
        return Observable.zip(this.f.call(wcVar), Observable.just(wcVar.l()), xn.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Observable a(String str, AbstractMap.SimpleEntry simpleEntry) {
        dr drVar = (dr) simpleEntry.getKey();
        this.m.a(this.m.a(str, drVar.d()));
        return Observable.just(drVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(Throwable th) {
        this.o.b.severe("Prepare ERR: " + th.getMessage());
    }

    Observable<dr<?>> a(Observable<? extends dr<?>> observable) {
        return observable.flatMap(this.c);
    }

    public Observable<dr<?>> a(dr<?> drVar) {
        return a(Observable.just(drVar));
    }
}
