package com.kwad.sdk.pngencrypt;
/* loaded from: classes3.dex */
public abstract class ChunkReader implements f {
    public final ChunkReaderMode aDt;
    private final com.kwad.sdk.pngencrypt.chunk.d aDu;
    private boolean aDx;
    protected int aDv = 0;
    private int aDw = 0;
    protected ErrorBehaviour aDy = ErrorBehaviour.STRICT;

    /* loaded from: classes3.dex */
    public enum ChunkReaderMode {
        BUFFER,
        PROCESS,
        SKIP
    }

    public ChunkReader(int i, String str, long j, ChunkReaderMode chunkReaderMode) {
        if (chunkReaderMode == null || str.length() != 4 || i < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk paramenters: " + chunkReaderMode));
        }
        this.aDt = chunkReaderMode;
        com.kwad.sdk.pngencrypt.chunk.d dVar = new com.kwad.sdk.pngencrypt.chunk.d(i, str, chunkReaderMode == ChunkReaderMode.BUFFER);
        this.aDu = dVar;
        dVar.aq(j);
        this.aDx = chunkReaderMode != ChunkReaderMode.SKIP;
    }

    public final com.kwad.sdk.pngencrypt.chunk.d Gj() {
        return this.aDu;
    }

    protected abstract void Gk();

    protected abstract void a(int i, byte[] bArr, int i2, int i3);

    @Override // com.kwad.sdk.pngencrypt.f
    public final int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("negative length??"));
        }
        if (this.aDv == 0 && this.aDw == 0 && this.aDx) {
            com.kwad.sdk.pngencrypt.chunk.d dVar = this.aDu;
            dVar.f(dVar.aFB, 0, 4);
        }
        int i4 = this.aDu.len - this.aDv;
        if (i4 > i2) {
            i4 = i2;
        }
        if (i4 > 0 || this.aDw == 0) {
            if (this.aDx && this.aDt != ChunkReaderMode.BUFFER && i4 > 0) {
                this.aDu.f(bArr, i, i4);
            }
            if (this.aDt == ChunkReaderMode.BUFFER) {
                if (this.aDu.data != bArr && i4 > 0) {
                    System.arraycopy(bArr, i, this.aDu.data, this.aDv, i4);
                }
            } else if (this.aDt == ChunkReaderMode.PROCESS) {
                a(this.aDv, bArr, i, i4);
            }
            this.aDv += i4;
            i += i4;
            i2 -= i4;
        }
        if (this.aDv == this.aDu.len) {
            int i5 = 4 - this.aDw;
            if (i5 <= i2) {
                i2 = i5;
            }
            if (i2 > 0) {
                if (bArr != this.aDu.aFD) {
                    System.arraycopy(bArr, i, this.aDu.aFD, this.aDw, i2);
                }
                int i6 = this.aDw + i2;
                this.aDw = i6;
                if (i6 == 4) {
                    if (this.aDx) {
                        if (this.aDt == ChunkReaderMode.BUFFER) {
                            com.kwad.sdk.pngencrypt.chunk.d dVar2 = this.aDu;
                            dVar2.f(dVar2.data, 0, this.aDu.len);
                        }
                        this.aDu.bw(this.aDy == ErrorBehaviour.STRICT);
                    }
                    com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", "Chunk done");
                    Gk();
                }
            }
            i3 = i2;
        }
        if (i4 > 0 || i3 > 0) {
            return i4 + i3;
        }
        return -1;
    }

    public final void bu(boolean z) {
        this.aDx = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.kwad.sdk.pngencrypt.chunk.d dVar = this.aDu;
            com.kwad.sdk.pngencrypt.chunk.d dVar2 = ((ChunkReader) obj).aDu;
            if (dVar == null) {
                if (dVar2 != null) {
                    return false;
                }
            } else if (!dVar.equals(dVar2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        com.kwad.sdk.pngencrypt.chunk.d dVar = this.aDu;
        return (dVar == null ? 0 : dVar.hashCode()) + 31;
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public final boolean isDone() {
        return this.aDw == 4;
    }

    public String toString() {
        return this.aDu.toString();
    }
}
