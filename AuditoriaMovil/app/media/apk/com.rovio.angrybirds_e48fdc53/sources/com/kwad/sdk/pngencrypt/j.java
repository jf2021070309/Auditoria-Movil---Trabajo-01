package com.kwad.sdk.pngencrypt;

import com.flurry.android.Constants;
import java.util.Arrays;
import java.util.zip.Inflater;
/* loaded from: classes3.dex */
public final class j extends DeflatedChunksSet {
    protected final e aDO;
    protected byte[] aEI;
    protected byte[] aEJ;
    protected final k aEK;
    final p aEL;
    protected int[] aEM;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.pngencrypt.j$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aEN;

        static {
            int[] iArr = new int[FilterType.values().length];
            aEN = iArr;
            try {
                iArr[FilterType.FILTER_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                aEN[FilterType.FILTER_SUB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                aEN[FilterType.FILTER_UP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                aEN[FilterType.FILTER_AVERAGE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                aEN[FilterType.FILTER_PAETH.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public j(String str, boolean z, k kVar, e eVar) {
        this(str, z, kVar, eVar, null, null);
    }

    private j(String str, boolean z, k kVar, e eVar, Inflater inflater, byte[] bArr) {
        super(str, z, (eVar != null ? eVar.GI() : kVar.aEW) + 1, kVar.aEW + 1, null, null);
        this.aEM = new int[5];
        this.aEK = kVar;
        this.aDO = eVar;
        this.aEL = new p(kVar, eVar);
        com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", "Creating IDAT set ");
    }

    private void GJ() {
        cL(this.aEL.aFs);
    }

    private int GK() {
        int GI;
        e eVar = this.aDO;
        int i = 0;
        if (eVar == null) {
            if (GA() < this.aEK.aEv - 1) {
                GI = this.aEK.aEW;
                i = GI + 1;
            }
        } else if (eVar.GB()) {
            GI = this.aDO.GI();
            i = GI + 1;
        }
        if (!this.aDR) {
            cH(i);
        }
        return i;
    }

    private void cL(int i) {
        byte[] bArr = this.aEI;
        if (bArr == null || bArr.length < this.aEh.length) {
            this.aEI = new byte[this.aEh.length];
            this.aEJ = new byte[this.aEh.length];
        }
        if (this.aEL.aFp == 0) {
            Arrays.fill(this.aEI, (byte) 0);
        }
        byte[] bArr2 = this.aEI;
        this.aEI = this.aEJ;
        this.aEJ = bArr2;
        byte b = this.aEh[0];
        if (!FilterType.isValidStandard(b)) {
            throw new PngjException("Filter type " + ((int) b) + " invalid");
        }
        FilterType byVal = FilterType.getByVal(b);
        int[] iArr = this.aEM;
        iArr[b] = iArr[b] + 1;
        this.aEI[0] = this.aEh[0];
        int i2 = AnonymousClass1.aEN[byVal.ordinal()];
        if (i2 == 1) {
            cN(i);
        } else if (i2 == 2) {
            cP(i);
        } else if (i2 == 3) {
            cQ(i);
        } else if (i2 == 4) {
            cM(i);
        } else if (i2 == 5) {
            cO(i);
        } else {
            throw new PngjException("Filter type " + ((int) b) + " not implemented");
        }
    }

    private void cM(int i) {
        int i2 = 1;
        int i3 = 1 - this.aEK.aEV;
        while (i2 <= i) {
            this.aEI[i2] = (byte) (this.aEh[i2] + (((i3 > 0 ? this.aEI[i3] & Constants.UNKNOWN : 0) + (this.aEJ[i2] & Constants.UNKNOWN)) / 2));
            i2++;
            i3++;
        }
    }

    private void cN(int i) {
        for (int i2 = 1; i2 <= i; i2++) {
            this.aEI[i2] = this.aEh[i2];
        }
    }

    private void cO(int i) {
        int i2 = 1;
        int i3 = 1 - this.aEK.aEV;
        while (i2 <= i) {
            int i4 = 0;
            int i5 = i3 > 0 ? this.aEI[i3] & Constants.UNKNOWN : 0;
            if (i3 > 0) {
                i4 = this.aEJ[i3] & Constants.UNKNOWN;
            }
            this.aEI[i2] = (byte) (this.aEh[i2] + n.b(i5, this.aEJ[i2] & Constants.UNKNOWN, i4));
            i2++;
            i3++;
        }
    }

    private void cP(int i) {
        for (int i2 = 1; i2 <= this.aEK.aEV; i2++) {
            this.aEI[i2] = this.aEh[i2];
        }
        int i3 = this.aEK.aEV + 1;
        int i4 = 1;
        while (i3 <= i) {
            this.aEI[i3] = (byte) (this.aEh[i3] + this.aEI[i4]);
            i3++;
            i4++;
        }
    }

    private void cQ(int i) {
        for (int i2 = 1; i2 <= i; i2++) {
            this.aEI[i2] = (byte) (this.aEh[i2] + this.aEJ[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    public final void Gx() {
        super.Gx();
        this.aEL.update(GA());
        GJ();
        p pVar = this.aEL;
        pVar.h(this.aEI, pVar.aFs + 1);
    }

    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    protected final int Gy() {
        return GK();
    }

    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    public final void close() {
        super.close();
        this.aEI = null;
        this.aEJ = null;
    }
}
