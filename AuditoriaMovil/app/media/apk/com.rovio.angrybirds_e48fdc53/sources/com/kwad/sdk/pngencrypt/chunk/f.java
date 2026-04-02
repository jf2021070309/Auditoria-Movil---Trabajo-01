package com.kwad.sdk.pngencrypt.chunk;

import java.util.List;
/* loaded from: classes3.dex */
public final class f extends e {
    private final List<PngChunk> aFJ;

    @Override // com.kwad.sdk.pngencrypt.chunk.e
    public final String toString() {
        return "ChunkList: written: " + GX().size() + " queue: " + this.aFJ.size();
    }
}
