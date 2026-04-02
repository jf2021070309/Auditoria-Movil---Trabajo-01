package com.kwad.sdk.pngencrypt.chunk;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class e {
    final com.kwad.sdk.pngencrypt.k aDM;
    List<PngChunk> aFF = new ArrayList();
    boolean aFG = false;

    public e(com.kwad.sdk.pngencrypt.k kVar) {
        this.aDM = kVar;
    }

    private static List<PngChunk> a(List<PngChunk> list, final String str, final String str2) {
        return str2 == null ? b.a(list, new c() { // from class: com.kwad.sdk.pngencrypt.chunk.e.1
            @Override // com.kwad.sdk.pngencrypt.chunk.c
            public final boolean a(PngChunk pngChunk) {
                return pngChunk.adQ.equals(str);
            }
        }) : b.a(list, new c() { // from class: com.kwad.sdk.pngencrypt.chunk.e.2
            @Override // com.kwad.sdk.pngencrypt.chunk.c
            public final boolean a(PngChunk pngChunk) {
                if (pngChunk.adQ.equals(str)) {
                    if (!(pngChunk instanceof t) || ((t) pngChunk).getKey().equals(str2)) {
                        return !(pngChunk instanceof n) || ((n) pngChunk).Hg().equals(str2);
                    }
                    return false;
                }
                return false;
            }
        });
    }

    public final List<PngChunk> GX() {
        return this.aFF;
    }

    public final void a(PngChunk pngChunk, int i) {
        pngChunk.cR(i);
        this.aFF.add(pngChunk);
        if (pngChunk.adQ.equals("PLTE")) {
            this.aFG = true;
        }
    }

    public final List<? extends PngChunk> ag(String str, String str2) {
        return a(this.aFF, str, str2);
    }

    public String toString() {
        return "ChunkList: read: " + this.aFF.size();
    }
}
