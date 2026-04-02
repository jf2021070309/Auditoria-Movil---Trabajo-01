package com.kwad.sdk.pngencrypt;
/* loaded from: classes3.dex */
public final class e {
    int aEA;
    int aEB;
    int aEC;
    private boolean aEH;
    final k aEt;
    private int aEv;
    private int aEw;
    int aEx;
    int aEy;
    int aEz;
    private int aEu = 0;
    private int aED = -1;
    private int aEE = -1;
    private int aEF = 0;
    int aEG = 0;

    public e(k kVar) {
        this.aEH = false;
        this.aEt = kVar;
        this.aEH = false;
        cJ(1);
        cI(0);
    }

    private int GH() {
        return GG();
    }

    private void cI(int i) {
        this.aED = i;
        int i2 = (i * this.aEx) + this.aEz;
        this.aEE = i2;
        if (i2 < 0 || i2 >= this.aEt.aEv) {
            throw new PngjException("bad row - this should not happen");
        }
    }

    private void cJ(int i) {
        int i2;
        int i3;
        if (this.aEu == i) {
            return;
        }
        this.aEu = i;
        byte[] cK = cK(i);
        this.aEy = cK[0];
        this.aEx = cK[1];
        this.aEA = cK[2];
        this.aEz = cK[3];
        if (this.aEt.aEv > this.aEz) {
            int i4 = this.aEt.aEv;
            int i5 = this.aEx;
            i2 = (((i4 + i5) - 1) - this.aEz) / i5;
        } else {
            i2 = 0;
        }
        this.aEv = i2;
        if (this.aEt.aEw > this.aEA) {
            int i6 = this.aEt.aEw;
            int i7 = this.aEy;
            i3 = (((i6 + i7) - 1) - this.aEA) / i7;
        } else {
            i3 = 0;
        }
        this.aEw = i3;
        if (i3 == 0) {
            this.aEv = 0;
        }
        this.aEC = this.aEy * this.aEt.aEP;
        this.aEB = this.aEA * this.aEt.aEP;
    }

    private static byte[] cK(int i) {
        switch (i) {
            case 1:
                return new byte[]{8, 8, 0, 0};
            case 2:
                return new byte[]{8, 8, 4, 0};
            case 3:
                return new byte[]{4, 8, 0, 4};
            case 4:
                return new byte[]{4, 4, 2, 0};
            case 5:
                return new byte[]{2, 4, 0, 2};
            case 6:
                return new byte[]{2, 2, 1, 0};
            case 7:
                return new byte[]{1, 2, 0, 1};
            default:
                throw new PngjException("bad interlace pass" + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean GB() {
        int i;
        while (true) {
            this.aEF++;
            int i2 = this.aEv;
            if (i2 != 0 && (i = this.aED) < i2 - 1) {
                cI(i + 1);
                break;
            }
            int i3 = this.aEu;
            if (i3 != 7) {
                cJ(i3 + 1);
                if (this.aEv != 0) {
                    cI(0);
                    break;
                }
                this.aEF--;
            } else {
                this.aEH = true;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int GC() {
        return this.aED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int GD() {
        return this.aEE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int GE() {
        return this.aEu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int GF() {
        return this.aEv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int GG() {
        return this.aEw;
    }

    public final int GI() {
        return ((this.aEt.aEU * GH()) + 7) / 8;
    }
}
