package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.eb;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
@Singleton
/* loaded from: classes4.dex */
public class xd implements Func1<wc, Observable<dr<cn>>> {
    @Inject
    cn.b a;
    @Inject
    eb.b b;

    @Override // rx.functions.Func1
    /* renamed from: a */
    public Observable<dr<cn>> call(wc wcVar) {
        dr drVar;
        Exception e;
        ea a = this.a.a(wcVar.d());
        String g = wcVar.g();
        dr a2 = a.a(g, true);
        if (a2 == null) {
            try {
                drVar = (dr) a.a(wcVar);
                try {
                    Logger.i(Logger.PREPARE_TAG, "received new " + drVar.B());
                    drVar.m_().d_();
                } catch (Exception e2) {
                    e = e2;
                    Logger.e(Logger.PREPARE_TAG, "error preparing ad " + g + ", retrying", e);
                    Exceptions.propagate(e);
                    return Observable.just(drVar);
                }
            } catch (Exception e3) {
                drVar = a2;
                e = e3;
            }
        } else {
            try {
                a.b(a2.m_(), wcVar);
            } catch (Exception e4) {
                Logger.w(Logger.PREPARE_TAG, "error updating ad " + g, e4);
            }
            cn.c g2 = a2.g();
            String str = "received " + a2.B() + " in status " + g2;
            switch (g2) {
                case aware:
                case failed:
                case preparing:
                case viewed:
                    Logger.i(Logger.PREPARE_TAG, str);
                    drVar = a2;
                    break;
                case invalid:
                case deleting:
                    Logger.w(Logger.PREPARE_TAG, str + " - retrying");
                    throw new RuntimeException("received invalid ad in status: " + g2);
                default:
                    Logger.i(Logger.PREPARE_TAG, str + " - ignoring");
                    drVar = a2;
                    break;
            }
        }
        return Observable.just(drVar);
    }
}
