package com.kwad.components.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.sdk.core.c.b;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.i;
import com.kwad.sdk.core.report.r;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a {
    private String HY;
    private String HZ;
    private long Ia;
    private long Ib;
    private Timer Ic;
    private boolean Id = false;
    private final long period;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0184a {
        private static final a If = new a();
    }

    public a() {
        this.Ia = -1L;
        try {
            this.Ia = SystemClock.elapsedRealtime();
        } catch (Throwable th) {
            this.Ia = System.currentTimeMillis();
            c.printStackTraceOnly(th);
        }
        this.period = TimeUnit.MINUTES.toMillis(d.zb());
        com.kwad.sdk.core.c.d dVar = new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.core.a.a.1
            @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
            public final void onBackToBackground() {
                super.onBackToBackground();
                a.this.mi();
            }

            @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
            public final void onBackToForeground() {
                super.onBackToForeground();
                a.this.eZ();
            }
        };
        b.AT();
        b.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.Ia;
        this.Ia = elapsedRealtime;
        if (i == 1) {
            this.Ib = 0L;
            this.HZ = UUID.randomUUID().toString();
            if (TextUtils.isEmpty(this.HY)) {
                this.HY = this.HZ;
            }
        }
        this.Ib++;
        r rVar = new r(10220L);
        rVar.anz = this.Ib;
        if (j > 0) {
            rVar.asC = j;
        }
        rVar.asD = i;
        rVar.HY = this.HY;
        rVar.HZ = this.HZ;
        i.a2(rVar);
    }

    public static a mh() {
        return C0184a.If;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mi() {
        this.Id = false;
        if (this.period <= 0) {
            return;
        }
        Timer timer = this.Ic;
        if (timer != null) {
            timer.cancel();
        }
        aj(3);
    }

    public final void eZ() {
        if (this.Id) {
            return;
        }
        this.Id = true;
        if (this.period <= 0) {
            return;
        }
        this.Ic = new Timer();
        aj(1);
        TimerTask timerTask = new TimerTask() { // from class: com.kwad.components.core.a.a.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                a.this.aj(2);
            }
        };
        try {
            Timer timer = this.Ic;
            long j = this.period;
            timer.schedule(timerTask, j, j);
        } catch (Throwable th) {
        }
    }
}
