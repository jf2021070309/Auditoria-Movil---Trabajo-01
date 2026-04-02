package com.kwad.components.core.video;
/* loaded from: classes.dex */
public final class d {
    private boolean SH = false;
    private boolean SI = false;
    private boolean SJ = false;
    private boolean SK = false;
    private boolean SL = false;
    private int SM = -1;

    public final void aK(boolean z) {
        this.SJ = z;
    }

    public final void aL(int i) {
        this.SM = i;
    }

    public final boolean qN() {
        return this.SM > 0;
    }

    public final int qO() {
        return this.SM;
    }

    public final boolean qP() {
        return this.SH;
    }

    public final boolean qQ() {
        return this.SI;
    }

    public final boolean qR() {
        return this.SJ;
    }

    public final boolean qS() {
        return this.SK;
    }

    public final boolean qT() {
        return this.SL;
    }

    public final void setAd(boolean z) {
        this.SI = z;
    }

    public final void setFillXY(boolean z) {
        this.SL = z;
    }

    public final void setForce(boolean z) {
        this.SH = z;
    }

    public final void setHorizontalVideo(boolean z) {
        this.SK = z;
    }
}
