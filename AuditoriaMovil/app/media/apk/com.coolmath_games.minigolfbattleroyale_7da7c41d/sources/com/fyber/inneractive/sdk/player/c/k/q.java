package com.fyber.inneractive.sdk.player.c.k;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class q implements g {
    public boolean a;
    public long b;
    private long c;
    private com.fyber.inneractive.sdk.player.c.m d = com.fyber.inneractive.sdk.player.c.m.a;

    public final void a() {
        if (this.a) {
            a(v());
            this.a = false;
        }
    }

    public final void a(long j) {
        this.c = j;
        if (this.a) {
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void a(g gVar) {
        a(gVar.v());
        this.d = gVar.w();
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final long v() {
        long j;
        long j2 = this.c;
        if (this.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            if (this.d.b == 1.0f) {
                j = com.fyber.inneractive.sdk.player.c.b.b(elapsedRealtime);
            } else {
                j = elapsedRealtime * this.d.d;
            }
            return j2 + j;
        }
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final com.fyber.inneractive.sdk.player.c.m a(com.fyber.inneractive.sdk.player.c.m mVar) {
        if (this.a) {
            a(v());
        }
        this.d = mVar;
        return mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final com.fyber.inneractive.sdk.player.c.m w() {
        return this.d;
    }
}
