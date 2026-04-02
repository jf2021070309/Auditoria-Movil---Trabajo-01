package com.kwad.sdk.pngencrypt;
/* loaded from: classes3.dex */
final class p {
    public final e aDO;
    int aEA;
    public final k aEK;
    int aEu;
    int aEx;
    int aEy;
    int aEz;
    public final boolean aFm;
    int aFn;
    int aFo;
    int aFp;
    int aFq;
    int aFr;
    int aFs;
    int aFt;
    byte[] buf;

    public p(k kVar, e eVar) {
        this.aEK = kVar;
        this.aDO = eVar;
        this.aFm = eVar != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(byte[] bArr, int i) {
        this.buf = bArr;
        this.aFt = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void update(int i) {
        int i2;
        this.aFn = i;
        if (this.aFm) {
            this.aEu = this.aDO.GE();
            this.aEy = this.aDO.aEy;
            this.aEx = this.aDO.aEx;
            this.aEA = this.aDO.aEA;
            this.aEz = this.aDO.aEz;
            this.aFo = this.aDO.GD();
            this.aFp = this.aDO.GC();
            this.aFq = this.aDO.GF();
            this.aFr = this.aDO.GG();
            i2 = ((this.aEK.aEU * this.aFr) + 7) / 8;
        } else {
            this.aEu = 1;
            this.aEx = 1;
            this.aEy = 1;
            this.aEz = 0;
            this.aEA = 0;
            this.aFp = i;
            this.aFo = i;
            this.aFq = this.aEK.aEv;
            this.aFr = this.aEK.aEw;
            i2 = this.aEK.aEW;
        }
        this.aFs = i2;
    }
}
