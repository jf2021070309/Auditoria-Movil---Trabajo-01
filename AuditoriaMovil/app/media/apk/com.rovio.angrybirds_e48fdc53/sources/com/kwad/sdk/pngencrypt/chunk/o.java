package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
/* loaded from: classes3.dex */
public final class o extends p {
    private byte aGg;

    public o(com.kwad.sdk.pngencrypt.k kVar) {
        super("sTER", kVar);
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        if (dVar.len == 1) {
            this.aGg = dVar.data[0];
            return;
        }
        throw new PngjException("bad chunk length " + dVar);
    }
}
