package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class dw {
    dr<?> a;

    public void a(cn.c cVar, cn.c cVar2) {
        if (cVar2 != cVar && cVar2 != cn.c.failed) {
            Logger.v(Logger.PREPARE_TAG, "resetting prepare_retry_count from " + this.a.j() + " to 0 for " + this.a.B());
            this.a.a(0);
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<dw> a;

        public dw a(dr<?> drVar) {
            dw dwVar = this.a.get();
            dwVar.a = drVar;
            return dwVar;
        }
    }
}
