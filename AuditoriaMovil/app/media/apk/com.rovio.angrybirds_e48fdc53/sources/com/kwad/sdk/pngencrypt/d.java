package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
/* loaded from: classes3.dex */
public abstract class d extends ChunkReader {
    protected final DeflatedChunksSet aEc;
    protected boolean aEd;
    protected boolean aEe;
    protected byte[] aEf;
    protected int aEg;

    public d(int i, String str, long j, DeflatedChunksSet deflatedChunksSet) {
        super(i, str, j, ChunkReader.ChunkReaderMode.PROCESS);
        this.aEd = false;
        this.aEe = false;
        this.aEg = -1;
        this.aEc = deflatedChunksSet;
        deflatedChunksSet.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.ChunkReader
    public void Gk() {
        int g;
        if (!this.aEe || this.aEg < 0 || (g = n.g(this.aEf, 0)) == this.aEg) {
            return;
        }
        com.kwad.sdk.core.e.c.printStackTrace(new PngjException("bad chunk sequence for fDAT chunk " + g + " expected " + this.aEg));
    }

    @Override // com.kwad.sdk.pngencrypt.ChunkReader
    protected final void a(int i, byte[] bArr, int i2, int i3) {
        if (this.aEe && i < 4) {
            while (i < 4 && i3 > 0) {
                this.aEf[i] = bArr[i2];
                i++;
                i2++;
                i3--;
            }
        }
        if (i3 > 0) {
            this.aEc.c(bArr, i2, i3);
            if (this.aEd) {
                System.arraycopy(bArr, i2, Gj().data, this.aDv, i3);
            }
        }
    }

    public final void cG(int i) {
        this.aEg = i;
    }
}
