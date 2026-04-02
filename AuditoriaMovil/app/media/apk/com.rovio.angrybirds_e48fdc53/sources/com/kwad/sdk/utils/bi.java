package com.kwad.sdk.utils;

import android.os.SystemClock;
/* loaded from: classes3.dex */
public final class bi {
    private long aKu;
    private long aKv;
    private boolean aKw;

    public bi() {
        reset();
    }

    private void reset() {
        this.aKu = 0L;
        this.aKv = -1L;
    }

    public final void JZ() {
        if (this.aKw && this.aKv < 0) {
            this.aKv = SystemClock.elapsedRealtime();
        }
    }

    public final void Ka() {
        if (this.aKw && this.aKv > 0) {
            this.aKu += SystemClock.elapsedRealtime() - this.aKv;
            this.aKv = -1L;
        }
    }

    public final long Kb() {
        if (this.aKw) {
            this.aKw = false;
            if (this.aKv > 0) {
                this.aKu += SystemClock.elapsedRealtime() - this.aKv;
                this.aKv = -1L;
            }
            return this.aKu;
        }
        return 0L;
    }

    public final long getTime() {
        return this.aKv > 0 ? (this.aKu + SystemClock.elapsedRealtime()) - this.aKv : this.aKu;
    }

    public final void startTiming() {
        reset();
        this.aKw = true;
        this.aKv = SystemClock.elapsedRealtime();
    }
}
