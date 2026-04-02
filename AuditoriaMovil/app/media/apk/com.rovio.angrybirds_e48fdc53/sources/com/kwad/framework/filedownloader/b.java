package com.kwad.framework.filedownloader;

import android.os.SystemClock;
import com.kwad.framework.filedownloader.s;
/* loaded from: classes.dex */
public final class b implements s.a, s.b {
    private long aas;
    private long aat;
    private long aau;
    private int aav;
    private int aaw = 1000;
    private long mStartTime;

    @Override // com.kwad.framework.filedownloader.s.b
    public final void G(long j) {
        if (this.aaw <= 0) {
            return;
        }
        boolean z = true;
        if (this.aas != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.aas;
            if (uptimeMillis >= this.aaw || (this.aav == 0 && uptimeMillis > 0)) {
                int i = (int) ((j - this.aat) / uptimeMillis);
                this.aav = i;
                this.aav = Math.max(0, i);
            } else {
                z = false;
            }
        }
        if (z) {
            this.aat = j;
            this.aas = SystemClock.uptimeMillis();
        }
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void end(long j) {
        if (this.mStartTime <= 0) {
            return;
        }
        long j2 = j - this.aau;
        this.aas = 0L;
        long uptimeMillis = SystemClock.uptimeMillis() - this.mStartTime;
        if (uptimeMillis > 0) {
            j2 /= uptimeMillis;
        }
        this.aav = (int) j2;
    }

    @Override // com.kwad.framework.filedownloader.s.a
    public final int getSpeed() {
        return this.aav;
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void reset() {
        this.aav = 0;
        this.aas = 0L;
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void start(long j) {
        this.mStartTime = SystemClock.uptimeMillis();
        this.aau = j;
    }
}
