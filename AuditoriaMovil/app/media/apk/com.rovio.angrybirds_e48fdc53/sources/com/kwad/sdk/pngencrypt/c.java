package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
import com.kwad.sdk.pngencrypt.chunk.ChunkLoadBehaviour;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public final class c extends b {
    protected k aDM;
    protected k aDN;
    protected e aDO;
    protected int aDP = -1;
    protected com.kwad.sdk.pngencrypt.chunk.e aDQ = null;
    private long aDS = 0;
    private boolean aDT = true;
    private boolean aDU = false;
    private Set<String> aDV = new HashSet();
    private long aDW = 0;
    private long aDX = 0;
    private long aDY = 0;
    private ChunkLoadBehaviour aEa = ChunkLoadBehaviour.LOAD_CHUNK_ALWAYS;
    protected final boolean aDR = false;
    private g aDZ = new com.kwad.sdk.pngencrypt.chunk.a();

    /* renamed from: com.kwad.sdk.pngencrypt.c$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aEb;

        static {
            int[] iArr = new int[ChunkLoadBehaviour.values().length];
            aEb = iArr;
            try {
                iArr[ChunkLoadBehaviour.LOAD_CHUNK_IF_SAFE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                aEb[ChunkLoadBehaviour.LOAD_CHUNK_NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public c(boolean z) {
    }

    private int Gq() {
        return this.aDP;
    }

    private k Gv() {
        return this.aDN;
    }

    private void fd(String str) {
        if (str.equals("IHDR")) {
            if (this.aDP < 0) {
                this.aDP = 0;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else if (str.equals("PLTE")) {
            int i = this.aDP;
            if (i == 0 || i == 1) {
                this.aDP = 2;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk here " + str));
        } else if (str.equals("IDAT")) {
            int i2 = this.aDP;
            if (i2 >= 0 && i2 <= 4) {
                this.aDP = 4;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else if (str.equals("IEND")) {
            if (this.aDP >= 4) {
                this.aDP = 6;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else {
            int i3 = this.aDP;
            if (i3 <= 1) {
                this.aDP = 1;
            } else if (i3 <= 3) {
                this.aDP = 3;
            } else {
                this.aDP = 5;
            }
        }
    }

    private static boolean fe(String str) {
        return !com.kwad.sdk.pngencrypt.chunk.b.fh(str);
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final boolean Gl() {
        return this.aDT;
    }

    public final boolean Gr() {
        return Gq() < 4;
    }

    public final j Gs() {
        DeflatedChunksSet Gn = Gn();
        if (Gn instanceof j) {
            return (j) Gn;
        }
        return null;
    }

    public final k Gt() {
        return this.aDM;
    }

    public final e Gu() {
        return this.aDO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.b
    public final void a(ChunkReader chunkReader) {
        super.a(chunkReader);
        if (chunkReader.Gj().adQ.equals("IHDR")) {
            com.kwad.sdk.pngencrypt.chunk.i iVar = new com.kwad.sdk.pngencrypt.chunk.i(null);
            iVar.a(chunkReader.Gj());
            k He = iVar.He();
            this.aDM = He;
            this.aDN = He;
            if (iVar.Hc()) {
                this.aDO = new e(this.aDN);
            }
            this.aDQ = new com.kwad.sdk.pngencrypt.chunk.e(this.aDM);
        }
        if (chunkReader.aDt == ChunkReader.ChunkReaderMode.BUFFER && fe(chunkReader.Gj().adQ)) {
            this.aDS += chunkReader.Gj().len;
        }
        if (chunkReader.aDt == ChunkReader.ChunkReaderMode.BUFFER || this.aDU) {
            try {
                this.aDQ.a(this.aDZ.a(chunkReader.Gj(), Gt()), this.aDP);
            } catch (PngjException e) {
                throw e;
            }
        }
    }

    public final void an(long j) {
        this.aDW = j;
    }

    public final void ao(long j) {
        this.aDX = j;
    }

    public final void ap(long j) {
        this.aDY = j;
    }

    @Override // com.kwad.sdk.pngencrypt.b, com.kwad.sdk.pngencrypt.f
    public final int b(byte[] bArr, int i, int i2) {
        return super.b(bArr, i, i2);
    }

    public final void bv(boolean z) {
        this.aDT = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.b
    public final void c(int i, String str, long j) {
        fd(str);
        super.c(i, str, j);
    }

    @Override // com.kwad.sdk.pngencrypt.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.aDP != 6) {
            this.aDP = 6;
        }
        super.close();
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final DeflatedChunksSet fb(String str) {
        return new j(str, this.aDR, Gv(), this.aDO);
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final boolean fc(String str) {
        return str.equals("IDAT");
    }

    @Override // com.kwad.sdk.pngencrypt.b
    public final boolean o(int i, String str) {
        if (super.o(i, str)) {
            return true;
        }
        if (this.aDW > 0 && i + Gm() > this.aDW) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Maximum total bytes to read exceeeded: " + this.aDW + " offset:" + Gm() + " len=" + i));
        }
        if (this.aDV.contains(str)) {
            return true;
        }
        if (com.kwad.sdk.pngencrypt.chunk.b.fh(str)) {
            return false;
        }
        long j = this.aDX;
        if (j <= 0 || i <= j) {
            long j2 = this.aDY;
            if (j2 <= 0 || i <= j2 - this.aDS) {
                int i2 = AnonymousClass1.aEb[this.aEa.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return true;
                    }
                } else if (!com.kwad.sdk.pngencrypt.chunk.b.fj(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
