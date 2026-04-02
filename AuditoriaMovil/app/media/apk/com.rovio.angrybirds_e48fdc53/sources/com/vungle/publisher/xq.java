package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.cz;
import com.vungle.publisher.eb;
import com.vungle.publisher.ei;
import com.vungle.publisher.el;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
/* loaded from: classes4.dex */
public class xq implements Func1<dr<?>, Observable<? extends dr<?>>> {
    @Inject
    cz.b a;
    @Inject
    xy b;
    @Inject
    eb.b c;
    @Inject
    el.a d;

    @Override // rx.functions.Func1
    /* renamed from: a */
    public Observable<? extends dr<?>> call(dr<?> drVar) {
        if (drVar == null) {
            throw new IllegalArgumentException("no ad to prepare ");
        }
        String d = drVar.d();
        m a_ = drVar.a_();
        cn.c g = drVar.g();
        Logger.d(Logger.PREPARE_TAG, "run PrepareAdRunnable. adId = " + d + ", adType = " + a_);
        try {
            Logger.d(Logger.PREPARE_TAG, "local ad not prepared. has status: " + g);
            switch (g) {
                case deleting:
                case invalid:
                    throw new RuntimeException("ad status: " + g);
                case viewed:
                    Logger.d(Logger.PREPARE_TAG, "ad already " + cn.c.viewed + ", recycling: " + d);
                    c(drVar);
                    Logger.d(Logger.PREPARE_TAG, "ad already " + cn.c.ready + ": " + d);
                    return Observable.just(drVar);
                case ready:
                    Logger.d(Logger.PREPARE_TAG, "ad already " + cn.c.ready + ": " + d);
                    return Observable.just(drVar);
                case failed:
                    i(drVar);
                    b(drVar);
                    return e(drVar);
                default:
                    b(drVar);
                    return e(drVar);
            }
        } catch (Exception e) {
            Logger.e(Logger.PREPARE_TAG, "error processing ad.id: " + d, e);
            Exceptions.propagate(e);
            throw new RuntimeException("could not prepare ad");
        }
    }

    void b(dr<?> drVar) {
        this.a.a(drVar);
        drVar.a(cn.c.preparing);
        drVar.f_();
    }

    void c(dr<?> drVar) {
        String d = drVar.d();
        Logger.d(Logger.PREPARE_TAG, "re-verify prepare_retry_count " + drVar.j() + " for " + com.umeng.analytics.pro.bg.aw + " " + d);
        d(drVar);
        for (gd<?> gdVar : drVar.k_()) {
            a(gdVar);
        }
        cn.c cVar = cn.c.ready;
        Logger.i(Logger.PREPARE_TAG, "re-verified ad and set to " + cVar + ": " + d);
        this.a.a(drVar).a_(-1L);
        drVar.a(cVar);
        drVar.f_();
    }

    void d(dr<?> drVar) {
        if (!drVar.l_()) {
            throw new RuntimeException("invalid ad structure");
        }
    }

    void a(gd<?> gdVar) {
        if (!gdVar.n()) {
            throw new RuntimeException(gdVar.o() + " re-verification failed for ad_id " + gdVar.f());
        }
    }

    <C extends dr<?>> Observable<C> e(C c) {
        d(c);
        List<? extends gd<?>> k_ = c.k_();
        if (j(c)) {
            Logger.d(Logger.PREPARE_TAG, "skipping prepare as ad_token_hash already present");
            k(c);
            b(k_);
            return Observable.just(c);
        }
        return (Observable<C>) a(k_).doOnNext(h(c)).doOnError(g(c)).flatMap(f(c));
    }

    Observable<? extends List<gd<?>>> a(List<? extends gd<?>> list) {
        if (list == null || list.size() <= 0) {
            return Observable.just(new ArrayList());
        }
        return Observable.from(list).observeOn(Schedulers.io()).flatMap(this.b).doOnError(a()).doOnNext(b()).buffer(list.size());
    }

    public <C extends dr<?>> Func1<List<gd<?>>, Observable<C>> f(C c) {
        return xr.a(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Observable b(dr drVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((gd) it.next()).j() != ei.a.ready) {
                throw new RuntimeException("prepared ad somehow has non-ready viewables");
            }
        }
        return Observable.just(drVar);
    }

    public Action1<Throwable> a() {
        return xs.a();
    }

    public Action1<Throwable> g(dr<?> drVar) {
        return xt.a(this, drVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(dr drVar, Throwable th) {
        Logger.w(Logger.PREPARE_TAG, "ad prep error: " + th);
        if (th instanceof qn) {
            Logger.w(Logger.PREPARE_TAG, "deleting all ads due to IO failure");
            this.c.b();
            return;
        }
        Logger.d(Logger.PREPARE_TAG, "marking current ad as " + cn.c.failed);
        drVar.a(cn.c.failed);
        drVar.f_();
    }

    public Action1<gd<?>> b() {
        return xu.a();
    }

    public Action1<List<gd<?>>> h(dr<?> drVar) {
        return xv.a(this, drVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(dr drVar, List list) {
        Logger.i(Logger.PREPARE_TAG, "ad ready " + drVar.d());
        drVar.a(cn.c.ready);
        this.a.a(drVar, Long.valueOf(System.currentTimeMillis()));
        drVar.f_();
    }

    boolean i(dr<?> drVar) {
        cn.c cVar;
        String d = drVar.d();
        cn.c g = drVar.g();
        if (g == cn.c.failed) {
            cVar = cn.c.preparing;
            long currentTimeMillis = System.currentTimeMillis();
            long k = drVar.k();
            if (currentTimeMillis < k) {
                Logger.d(Logger.PREPARE_TAG, "clock change detected; updating ad.id " + d + " status from " + g + " to " + cVar);
                drVar.a(cVar);
            } else {
                long j = (currentTimeMillis - k) / 60000;
                if (j >= 1440) {
                    Logger.d(Logger.PREPARE_TAG, "retrying " + cn.c.failed + " " + com.umeng.analytics.pro.bg.aw + ".id " + d + " after " + j + "/1440 minutes; updating status from " + g + " to " + cVar);
                    drVar.a(cVar);
                } else {
                    throw new RuntimeException("could not update failed status");
                }
            }
        } else {
            cVar = g;
        }
        drVar.f_();
        return cVar != cn.c.failed;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vungle.publisher.cn] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.vungle.publisher.cn] */
    public boolean j(dr<?> drVar) {
        return this.d.a((String) drVar.m_().c_(), drVar.m_().m(), cn.c.ready);
    }

    void k(dr<?> drVar) {
        cn.c cVar = cn.c.ready;
        Logger.v(Logger.PREPARE_TAG, "updating and reusing cacheables for ad and set to " + cVar + ": " + drVar.d());
        this.a.a(drVar).a_(-1L);
        drVar.a(cVar);
        drVar.f_();
    }

    void b(List<? extends gd<?>> list) {
        for (gd<?> gdVar : list) {
            gdVar.b(ei.a.ready);
        }
    }
}
