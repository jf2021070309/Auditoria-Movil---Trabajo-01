package com.vungle.publisher;

import android.os.SystemClock;
import com.ss.android.download.api.constant.BaseConstants;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class ul extends tx {
    @Inject
    protected bw b;
    private int e;
    private int c = 10;
    private int d = 5;
    private int f = 2000;
    private int g = BaseConstants.Time.MINUTE;

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        this.c = i;
    }

    @Override // com.vungle.publisher.tx
    protected void b(ub ubVar, tw twVar) {
        un b = ubVar.b();
        int b2 = b.b();
        if (!e(b2) && !a(b.a())) {
            int b3 = twVar.b();
            if (f(b3)) {
                int c = b.c();
                if (!b(b3)) {
                    c = b.e();
                }
                if (!g(c)) {
                    int h = h(b2);
                    Logger.d(Logger.NETWORK_TAG, "Retrying " + ubVar + " in " + (h / 1000) + " seconds");
                    this.b.b(new um(ubVar), ubVar.c(), h);
                    return;
                }
            }
        }
        super.b(ubVar, twVar);
    }

    protected final boolean e(int i) {
        return this.c > 0 && i > this.c;
    }

    protected final boolean a(long j) {
        return this.e > 0 && SystemClock.elapsedRealtime() - j >= ((long) this.e);
    }

    protected boolean f(int i) {
        return (a(i) || i == 601) ? false : true;
    }

    protected final boolean g(int i) {
        return this.d > 0 && i > this.d;
    }

    protected int h(int i) {
        return zn.a(i, this.f, this.g);
    }
}
