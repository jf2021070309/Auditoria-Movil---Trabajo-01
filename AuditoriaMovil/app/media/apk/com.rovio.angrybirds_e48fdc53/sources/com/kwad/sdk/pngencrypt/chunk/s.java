package com.kwad.sdk.pngencrypt.chunk;

import com.flurry.android.Constants;
/* loaded from: classes3.dex */
public final class s extends p {
    private int aGk;
    private int aGl;
    private int aGm;
    private int aGn;
    private int[] aGo;

    public s(com.kwad.sdk.pngencrypt.k kVar) {
        super("tRNS", kVar);
        this.aGo = new int[0];
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        if (this.aEK.aER) {
            this.aGk = com.kwad.sdk.pngencrypt.n.f(dVar.data, 0);
        } else if (!this.aEK.aES) {
            this.aGl = com.kwad.sdk.pngencrypt.n.f(dVar.data, 0);
            this.aGm = com.kwad.sdk.pngencrypt.n.f(dVar.data, 2);
            this.aGn = com.kwad.sdk.pngencrypt.n.f(dVar.data, 4);
        } else {
            int length = dVar.data.length;
            this.aGo = new int[length];
            for (int i = 0; i < length; i++) {
                this.aGo[i] = dVar.data[i] & Constants.UNKNOWN;
            }
        }
    }
}
