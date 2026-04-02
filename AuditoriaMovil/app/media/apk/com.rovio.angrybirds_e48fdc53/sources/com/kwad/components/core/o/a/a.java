package com.kwad.components.core.o.a;

import android.os.SystemClock;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class a {
    private String Pt;
    private long Pu;
    private long Pv;
    private long Pw;
    private boolean Px;

    public final void av(String str) {
        this.Pt = str;
    }

    public final void pB() {
        if (this.Px) {
            return;
        }
        this.Px = true;
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.o.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.Pw = SystemClock.uptimeMillis();
                a.this.report();
            }
        });
    }

    public final void report() {
        b bVar = new b();
        bVar.Pt = this.Pt;
        long j = this.Pu;
        bVar.PA = j != 0 ? this.Pv - j : 0L;
        long j2 = this.Pv;
        bVar.PB = j2 != 0 ? this.Pw - j2 : 0L;
        long j3 = this.Pu;
        bVar.Pz = j3 != 0 ? this.Pw - j3 : 0L;
        com.kwad.components.core.p.a.pC().a(bVar);
        c.d("PageMonitor", bVar.toString());
    }

    public final void y(long j) {
        this.Pu = j;
        this.Pv = SystemClock.uptimeMillis();
    }
}
