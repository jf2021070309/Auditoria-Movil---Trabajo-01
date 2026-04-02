package com.amazon.aps.iva.k9;

import com.amazon.aps.iva.k9.v;
import com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker;
import java.util.concurrent.TimeUnit;
/* compiled from: PeriodicWorkRequest.java */
/* loaded from: classes.dex */
public final class r extends v {
    public r(a aVar) {
        super(aVar.a, aVar.b, aVar.c);
    }

    /* compiled from: PeriodicWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<a, r> {
        public a(TimeUnit timeUnit) {
            super(ContinueWatchingWorker.class);
            com.amazon.aps.iva.t9.p pVar = this.b;
            long millis = timeUnit.toMillis(30L);
            pVar.getClass();
            long j = 900000;
            int i = (millis > 900000L ? 1 : (millis == 900000L ? 0 : -1));
            int i2 = com.amazon.aps.iva.t9.p.s;
            if (i < 0) {
                m c = m.c();
                String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L);
                c.f(new Throwable[0]);
                millis = 900000;
            }
            if (millis < 900000) {
                m c2 = m.c();
                String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L);
                c2.f(new Throwable[0]);
            } else {
                j = millis;
            }
            if (millis < 300000) {
                m c3 = m.c();
                String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L);
                c3.f(new Throwable[0]);
                millis = 300000;
            }
            if (millis > j) {
                m c4 = m.c();
                String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j));
                c4.f(new Throwable[0]);
                millis = j;
            }
            pVar.h = j;
            pVar.i = millis;
        }

        @Override // com.amazon.aps.iva.k9.v.a
        public final r b() {
            if (!this.b.q) {
                return new r(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }

        @Override // com.amazon.aps.iva.k9.v.a
        public final a c() {
            return this;
        }
    }
}
