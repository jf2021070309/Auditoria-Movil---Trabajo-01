package com.kwad.components.core.r;
/* loaded from: classes.dex */
public class a {
    private static volatile a QH;
    private int Nu;
    private int QI;
    private boolean QJ;
    private boolean QK;
    private int QL;
    private boolean QM;

    private a() {
    }

    public static a pU() {
        if (QH == null) {
            synchronized (a.class) {
                if (QH == null) {
                    QH = new a();
                }
            }
        }
        return QH;
    }

    public final void aE(int i) {
        this.QI = i;
    }

    public final void aF(int i) {
        this.QL = i;
    }

    public final void aF(boolean z) {
        this.QJ = true;
    }

    public final void aG(int i) {
        this.Nu = i;
    }

    public final void aG(boolean z) {
        this.QK = z;
    }

    public final void aH(boolean z) {
        this.QM = z;
    }

    public final void clear() {
        this.QK = false;
        this.QJ = false;
        this.QL = 0;
        this.QM = false;
        this.QI = -1;
        this.Nu = 0;
    }

    public final int pV() {
        return this.QI;
    }

    public final boolean pW() {
        return this.QJ;
    }

    public final boolean pX() {
        return this.QK;
    }

    public final boolean pY() {
        int i = this.QL;
        return i == 1 || i == 3;
    }

    public final int pZ() {
        return this.QL;
    }

    public final boolean qa() {
        return this.QM;
    }

    public final int qb() {
        return this.Nu;
    }
}
