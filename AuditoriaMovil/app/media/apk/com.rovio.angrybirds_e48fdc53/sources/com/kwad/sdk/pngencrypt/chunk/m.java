package com.kwad.sdk.pngencrypt.chunk;

import com.flurry.android.Constants;
import com.kwad.sdk.pngencrypt.PngjException;
/* loaded from: classes3.dex */
public final class m extends p {
    private int aGb;
    private int[] aGc;

    public m(com.kwad.sdk.pngencrypt.k kVar) {
        super("PLTE", kVar);
        this.aGb = 0;
    }

    private void a(int i, int i2, int i3, int i4) {
        this.aGc[i] = (i2 << 16) | (i3 << 8) | i4;
    }

    private void cZ(int i) {
        this.aGb = i;
        if (i <= 0 || i > 256) {
            throw new PngjException("invalid pallette - nentries=" + this.aGb);
        }
        int[] iArr = this.aGc;
        if (iArr == null || iArr.length != i) {
            this.aGc = new int[i];
        }
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        cZ(dVar.len / 3);
        int i = 0;
        int i2 = 0;
        while (i < this.aGb) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            a(i, dVar.data[i2] & Constants.UNKNOWN, dVar.data[i3] & Constants.UNKNOWN, dVar.data[i4] & Constants.UNKNOWN);
            i++;
            i2 = i4 + 1;
        }
    }
}
