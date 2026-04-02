package com.kwad.sdk.pngencrypt;
/* loaded from: classes3.dex */
public final class k {
    public final int aEO;
    public final int aEP;
    public final boolean aEQ;
    public final boolean aER;
    public final boolean aES;
    public final boolean aET;
    public final int aEU;
    public final int aEV;
    public final int aEW;
    public final int aEX;
    public final int aEY;
    public final int aEv;
    public final int aEw;
    private long aEZ = -1;
    private long aFa = -1;

    public k(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.aEw = i;
        this.aEv = i2;
        this.aEQ = z;
        this.aES = z3;
        this.aER = z2;
        if (z2 && z3) {
            throw new PngjException("palette and greyscale are mutually exclusive");
        }
        int i4 = (z2 || z3) ? z ? 2 : 1 : z ? 4 : 3;
        this.aEP = i4;
        this.aEO = i3;
        boolean z4 = i3 < 8;
        this.aET = z4;
        int i5 = i4 * i3;
        this.aEU = i5;
        this.aEV = (i5 + 7) / 8;
        int i6 = ((i5 * i) + 7) / 8;
        this.aEW = i6;
        int i7 = i4 * i;
        this.aEX = i7;
        this.aEY = z4 ? i6 : i7;
        if (i3 == 1 || i3 == 2 || i3 == 4) {
            if (!z3 && !z2) {
                throw new PngjException("only indexed or grayscale can have bitdepth=" + i3);
            }
        } else if (i3 != 8) {
            if (i3 != 16) {
                throw new PngjException("invalid bitdepth=" + i3);
            } else if (z3) {
                throw new PngjException("indexed can't have bitdepth=" + i3);
            }
        }
        if (i <= 0 || i > 16777216) {
            throw new PngjException("invalid cols=" + i + " ???");
        } else if (i2 > 0 && i2 <= 16777216) {
            if (i7 <= 0) {
                throw new PngjException("invalid image parameters (overflow?)");
            }
        } else {
            throw new PngjException("invalid rows=" + i2 + " ???");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k kVar = (k) obj;
            return this.aEQ == kVar.aEQ && this.aEO == kVar.aEO && this.aEw == kVar.aEw && this.aER == kVar.aER && this.aES == kVar.aES && this.aEv == kVar.aEv;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.aEQ ? 1231 : 1237) + 31) * 31) + this.aEO) * 31) + this.aEw) * 31) + (this.aER ? 1231 : 1237)) * 31) + (this.aES ? 1231 : 1237)) * 31) + this.aEv;
    }

    public final String toString() {
        return "ImageInfo [cols=" + this.aEw + ", rows=" + this.aEv + ", bitDepth=" + this.aEO + ", channels=" + this.aEP + ", alpha=" + this.aEQ + ", greyscale=" + this.aER + ", indexed=" + this.aES + "]";
    }
}
