package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import com.vungle.publisher.wg;
import com.vungle.publisher.wj;
import com.vungle.publisher.wr;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public class yg {

    @Singleton
    /* loaded from: classes4.dex */
    public static class a implements Func1<wd, Observable<wc>> {
        @Inject
        wg.a a;
        @Inject
        wj.a b;
        @Inject
        wr.a c;

        protected wc a(wd wdVar) {
            boolean n = wdVar.n();
            m d = wdVar.d();
            if (!n) {
                return null;
            }
            if (wdVar.k()) {
                Logger.i(Logger.PREPARE_TAG, "received expired ad from server, tossing it and getting a new one");
                throw new RuntimeException("ad is expired");
            } else if (d == null) {
                Logger.w(Logger.PREPARE_TAG, "received null adType from server, tossing it and getting a new one");
                throw new RuntimeException("adType is null");
            } else {
                Logger.v(Logger.PREPARE_TAG, "received a valid ad, continue processing ad with type: " + d);
                return a(d, wdVar.o());
            }
        }

        private wc a(m mVar, final JSONObject jSONObject) {
            return new q<wc>() { // from class: com.vungle.publisher.yg.a.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.vungle.publisher.q
                /* renamed from: e */
                public wc a() {
                    try {
                        return a.this.a.e(jSONObject);
                    } catch (JSONException e) {
                        throw Exceptions.propagate(e);
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.vungle.publisher.q
                /* renamed from: f */
                public wc b() {
                    Logger.i(Logger.PREPARE_TAG, "received invalid ad from server, tossing it and getting a new one");
                    throw new RuntimeException("received invalid ad from server, tossing it and getting a new one");
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.vungle.publisher.q
                /* renamed from: g */
                public wc c() {
                    try {
                        return a.this.c.c(jSONObject);
                    } catch (JSONException e) {
                        throw Exceptions.propagate(e);
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.vungle.publisher.q
                /* renamed from: h */
                public wc d() {
                    try {
                        return a.this.b.c(jSONObject);
                    } catch (JSONException e) {
                        throw Exceptions.propagate(e);
                    }
                }
            }.a(mVar);
        }

        @Override // rx.functions.Func1
        /* renamed from: b */
        public Observable<wc> call(wd wdVar) {
            return Observable.just(a(wdVar));
        }
    }
}
