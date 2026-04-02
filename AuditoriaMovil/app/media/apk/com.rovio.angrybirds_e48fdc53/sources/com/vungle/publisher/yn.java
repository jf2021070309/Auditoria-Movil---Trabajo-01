package com.vungle.publisher;

import com.vungle.publisher.co;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class yn extends yj<dq> {
    @Inject
    co.a h;

    @Override // com.vungle.publisher.yj
    protected void a() {
    }

    public void onEvent(si siVar) {
        jf a2 = siVar.a();
        String b = siVar.b();
        Logger.d(Logger.REPORT_TAG, "received mraid user action event: " + a2.toString() + (b == null ? "" : ", w/ value " + b));
        a(a2, b);
        if (rx.mraidOpen.equals(a2) || rx.mraidClose.equals(a2)) {
            a(siVar.e());
        }
    }

    public void onEvent(sg sgVar) {
        Logger.d(Logger.REPORT_TAG, "received mraid tpat event: " + sgVar.a().toString());
        b(sgVar.a());
    }

    public void onEvent(sm smVar) {
        this.h.a((Integer) this.c.c_(), smVar.a()).d_();
    }

    @Override // com.vungle.publisher.yj
    public void onEvent(av<dq> avVar) {
        super.onEvent(avVar);
        try {
            this.b.a(Long.valueOf(avVar.e()));
            this.b.f_();
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error updating play start millis", e);
        }
    }

    private void b(jf jfVar) {
        if (this.a == 0) {
            Logger.w(Logger.REPORT_TAG, "null ad in AdReportingHandler - cannot track event " + jfVar);
            return;
        }
        Logger.v(Logger.REPORT_TAG, "tpat event " + jfVar.toString());
        this.f.a(this.a, jfVar, ((dq) this.a).a(jfVar));
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        yn a;

        public yn a(dq dqVar) {
            this.a.a((yn) dqVar);
            return this.a;
        }
    }
}
