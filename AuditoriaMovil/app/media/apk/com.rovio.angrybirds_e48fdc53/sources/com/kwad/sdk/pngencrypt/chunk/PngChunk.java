package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes3.dex */
public abstract class PngChunk {
    protected final com.kwad.sdk.pngencrypt.k aEK;
    public final boolean aFK;
    public final boolean aFL;
    public final boolean aFM;
    protected d aFN;
    private boolean aFO = false;
    protected int aFP = -1;
    public final String adQ;

    /* loaded from: classes3.dex */
    public enum ChunkOrderingConstraint {
        NONE,
        BEFORE_PLTE_AND_IDAT,
        AFTER_PLTE_BEFORE_IDAT,
        AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED,
        BEFORE_IDAT,
        AFTER_IDAT,
        NA;

        public final boolean isOk(int i, boolean z) {
            if (this == NONE) {
                return true;
            }
            return this == BEFORE_IDAT ? i < 4 : this == BEFORE_PLTE_AND_IDAT ? i < 2 : this == AFTER_PLTE_BEFORE_IDAT ? z ? i < 4 : i < 4 && i > 2 : this == AFTER_IDAT && i > 4;
        }

        public final boolean mustGoAfterIDAT() {
            return this == AFTER_IDAT;
        }

        public final boolean mustGoAfterPLTE() {
            return this == AFTER_PLTE_BEFORE_IDAT || this == AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED;
        }

        public final boolean mustGoBeforeIDAT() {
            return this == BEFORE_IDAT || this == BEFORE_PLTE_AND_IDAT || this == AFTER_PLTE_BEFORE_IDAT;
        }

        public final boolean mustGoBeforePLTE() {
            return this == BEFORE_PLTE_AND_IDAT;
        }
    }

    public PngChunk(String str, com.kwad.sdk.pngencrypt.k kVar) {
        this.adQ = str;
        this.aEK = kVar;
        this.aFK = b.fh(str);
        this.aFL = b.fi(str);
        this.aFM = b.fj(str);
    }

    private long GW() {
        d dVar = this.aFN;
        if (dVar != null) {
            return dVar.GW();
        }
        return -1L;
    }

    private int GY() {
        d dVar = this.aFN;
        if (dVar != null) {
            return dVar.len;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(d dVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(d dVar) {
        this.aFN = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cR(int i) {
        this.aFP = i;
    }

    public String toString() {
        return "chunk id= " + this.adQ + " (len=" + GY() + " offset=" + GW() + ")";
    }
}
