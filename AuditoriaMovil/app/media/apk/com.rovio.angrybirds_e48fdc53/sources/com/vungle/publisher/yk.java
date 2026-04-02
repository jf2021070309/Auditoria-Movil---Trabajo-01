package com.vungle.publisher;

import com.vungle.publisher.cz;
import com.vungle.publisher.env.r;
import com.vungle.publisher.fg;
import com.vungle.publisher.ic;
import com.vungle.publisher.log.Logger;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class yk {
    @Inject
    qg a;
    @Inject
    cz.b b;
    @Inject
    fg.a c;
    @Inject
    vc d;
    @Inject
    r e;
    @Inject
    ic.a f;

    public void a() {
        this.b.d();
        b();
        c();
    }

    public void a(Integer num) {
        Logger.i(Logger.REPORT_TAG, "deleting report " + num);
        this.c.a((Object[]) new Integer[]{num});
    }

    void b() {
        if (this.e.b()) {
            Logger.v(Logger.REPORT_TAG, "install already reported");
            return;
        }
        Logger.d(Logger.REPORT_TAG, "reporting install");
        this.d.b();
    }

    void a(cz<?, ?, ?, ?> czVar) {
        String B = czVar.B();
        try {
            Logger.d(Logger.REPORT_TAG, "sending " + B);
            this.d.a(czVar);
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error sending " + B, e);
            czVar.a(cz.c.failed);
            czVar.f_();
        }
    }

    public void c() {
        try {
            List<cz<?, ?, ?, ?>> c = this.b.c();
            Logger.i(Logger.REPORT_TAG, "sending " + c.size() + " ad reports");
            for (cz<?, ?, ?, ?> czVar : c) {
                a(czVar);
            }
        } finally {
            this.a.a(new aj());
        }
    }
}
