package com.kwad.components.core.video;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class i {
    private volatile boolean SX;
    private long SY;
    private a SZ = new a();

    /* loaded from: classes.dex */
    public static class a {
        private long Ta = 0;
        private int Tb = 0;

        public final void accumulate(long j) {
            this.Ta += j;
            this.Tb++;
        }

        public final int ri() {
            return this.Tb;
        }

        public final long rj() {
            return this.Ta;
        }
    }

    public final void rd() {
        if (this.SX) {
            return;
        }
        this.SX = true;
        this.SY = SystemClock.elapsedRealtime();
        com.kwad.sdk.core.video.a.a.a.dI("videoStartBlock");
    }

    public final void re() {
        if (this.SX) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.SY;
            this.SZ.accumulate(elapsedRealtime);
            this.SX = false;
            com.kwad.sdk.core.video.a.a.a.dI("videoEndBlock");
            com.kwad.sdk.core.video.a.a.a.dI("videoBlockTime_" + elapsedRealtime);
        }
    }

    public final boolean rf() {
        return this.SX;
    }

    public final a rg() {
        if (this.SX) {
            this.SZ.accumulate(SystemClock.elapsedRealtime() - this.SY);
            this.SX = false;
        }
        return this.SZ;
    }

    public final long rh() {
        return this.SY;
    }
}
