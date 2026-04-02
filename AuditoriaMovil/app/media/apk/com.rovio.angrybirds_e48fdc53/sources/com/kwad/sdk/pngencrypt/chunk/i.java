package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
import java.io.ByteArrayInputStream;
/* loaded from: classes3.dex */
public final class i extends p {
    private int aEv;
    private int aEw;
    private int aFQ;
    private int aFR;
    private int aFS;
    private int aFT;
    private int aFU;

    public i(com.kwad.sdk.pngencrypt.k kVar) {
        super("IHDR", kVar);
        if (kVar != null) {
            Hd();
        }
    }

    private int GF() {
        return this.aEv;
    }

    private int GG() {
        return this.aEw;
    }

    private int GZ() {
        return this.aFQ;
    }

    private int Ha() {
        return this.aFR;
    }

    private int Hb() {
        return this.aFU;
    }

    private void Hd() {
        cS(this.aEK.aEw);
        cT(this.aEK.aEv);
        cU(this.aEK.aEO);
        int i = this.aEK.aEQ ? 4 : 0;
        if (this.aEK.aES) {
            i++;
        }
        if (!this.aEK.aER) {
            i += 2;
        }
        cV(i);
        cW(0);
        cX(0);
        cY(0);
    }

    private void Hf() {
        if (this.aEw <= 0 || this.aEv <= 0 || this.aFS != 0 || this.aFT != 0) {
            throw new PngjException("bad IHDR: col/row/compmethod/filmethod invalid");
        }
        int i = this.aFQ;
        if (i != 1 && i != 2 && i != 4 && i != 8 && i != 16) {
            throw new PngjException("bad IHDR: bitdepth invalid");
        }
        int i2 = this.aFU;
        if (i2 < 0 || i2 > 1) {
            throw new PngjException("bad IHDR: interlace invalid");
        }
        int i3 = this.aFR;
        if (i3 != 0) {
            if (i3 != 6 && i3 != 2) {
                if (i3 == 3) {
                    if (i == 16) {
                        throw new PngjException("bad IHDR: bitdepth invalid");
                    }
                    return;
                } else if (i3 != 4) {
                    throw new PngjException("bad IHDR: invalid colormodel");
                }
            }
            if (i != 8 && i != 16) {
                throw new PngjException("bad IHDR: bitdepth invalid");
            }
        }
    }

    private void cS(int i) {
        this.aEw = i;
    }

    private void cT(int i) {
        this.aEv = i;
    }

    private void cU(int i) {
        this.aFQ = i;
    }

    private void cV(int i) {
        this.aFR = i;
    }

    private void cW(int i) {
        this.aFS = 0;
    }

    private void cX(int i) {
        this.aFT = 0;
    }

    private void cY(int i) {
        this.aFU = 0;
    }

    public final boolean Hc() {
        return Hb() == 1;
    }

    public final com.kwad.sdk.pngencrypt.k He() {
        Hf();
        return new com.kwad.sdk.pngencrypt.k(GG(), GF(), GZ(), (Ha() & 4) != 0, Ha() == 0 || Ha() == 4, (Ha() & 1) != 0);
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        if (dVar.len != 13) {
            throw new PngjException("Bad IDHR len " + dVar.len);
        }
        ByteArrayInputStream GV = dVar.GV();
        this.aEw = com.kwad.sdk.pngencrypt.n.f(GV);
        this.aEv = com.kwad.sdk.pngencrypt.n.f(GV);
        this.aFQ = com.kwad.sdk.pngencrypt.n.e(GV);
        this.aFR = com.kwad.sdk.pngencrypt.n.e(GV);
        this.aFS = com.kwad.sdk.pngencrypt.n.e(GV);
        this.aFT = com.kwad.sdk.pngencrypt.n.e(GV);
        this.aFU = com.kwad.sdk.pngencrypt.n.e(GV);
    }
}
