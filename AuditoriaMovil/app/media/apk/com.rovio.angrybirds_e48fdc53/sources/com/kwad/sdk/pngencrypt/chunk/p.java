package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes3.dex */
public abstract class p extends PngChunk {
    /* JADX INFO: Access modifiers changed from: protected */
    public p(String str, com.kwad.sdk.pngencrypt.k kVar) {
        super(str, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p pVar = (p) obj;
            if (this.adQ == null) {
                if (pVar.adQ != null) {
                    return false;
                }
            } else if (!this.adQ.equals(pVar.adQ)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.adQ == null ? 0 : this.adQ.hashCode()) + 31;
    }
}
