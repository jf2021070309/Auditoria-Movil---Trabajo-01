package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.cz;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class yj<A extends cn> extends pi {
    protected A a;
    protected cy<?, ?, ?> b;
    protected cz<?, ?, ?, A> c;
    @Inject
    cz.b d;
    @Inject
    yk e;
    @Inject
    tj f;
    @Inject
    com.vungle.publisher.env.o g;

    protected abstract void a();

    void b() {
        this.a = null;
        this.c = null;
        this.b = null;
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ac<A> acVar) {
        a((yj<A>) acVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vungle.publisher.cy, com.vungle.publisher.cy<?, ?, ?>] */
    public void a(A a) {
        if (this.a == null || !this.a.a(a)) {
            Logger.i(Logger.REPORT_TAG, "new ad " + a.B());
            this.a = a;
            this.c = this.d.b((cz.b) a);
            this.b = this.c.x();
            Logger.d(Logger.REPORT_TAG, "current play: " + this.b.toString());
            a();
            return;
        }
        Logger.v(Logger.REPORT_TAG, "same ad " + a.B());
    }

    public void onEvent(av<A> avVar) {
        try {
            Logger.d(Logger.REPORT_TAG, "received play ad start");
            p a = avVar.a();
            String c = avVar.c();
            cz<?, ?, ?, A> czVar = this.c;
            czVar.a(cz.c.playing);
            s b = this.g.b(c);
            if (b != null) {
                czVar.b(b.c);
                if (b.c) {
                    czVar.b(a.getIncentivizedUserId());
                }
                if (a.getOrdinalViewCount() > 0) {
                    czVar.a(a.getOrdinalViewCount());
                }
            }
            czVar.c(Long.valueOf(avVar.e()));
            czVar.e_();
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error processing ad start event", e);
        }
    }

    public void onEvent(bs bsVar) {
        try {
            Logger.d(Logger.REPORT_TAG, "received destroyed ad end");
            a(bsVar.e());
        } catch (Exception e) {
            Logger.w(Logger.REPORT_TAG, "error processing destroyed ad end");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(jf jfVar) {
        a(jfVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(jf jfVar, Object obj) {
        try {
            this.b.a(jfVar, obj);
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error reporting event", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j) {
        unregister();
        cz<?, ?, ?, A> czVar = this.c;
        if (czVar == null) {
            Logger.d(Logger.REPORT_TAG, "no current ad report");
        } else {
            czVar.a(cz.c.reportable);
            czVar.a(Long.valueOf(j));
            czVar.e_();
        }
        this.e.c();
        b();
    }
}
