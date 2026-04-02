package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
import java.io.Closeable;
import java.util.Arrays;
/* loaded from: classes3.dex */
public abstract class b implements f, Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int aDA;
    private byte[] aDB;
    private int aDC;
    protected boolean aDD;
    protected boolean aDE;
    private int aDF;
    private long aDG;
    private DeflatedChunksSet aDH;
    private ChunkReader aDI;
    private long aDJ;
    private ErrorBehaviour aDK;
    private final byte[] aDz;
    protected boolean closed;

    public b() {
        this(n.GN());
    }

    private b(byte[] bArr) {
        this.aDB = new byte[8];
        this.aDC = 0;
        this.aDD = false;
        this.aDE = false;
        this.closed = false;
        this.aDF = 0;
        this.aDG = 0L;
        this.aDK = ErrorBehaviour.STRICT;
        this.aDz = bArr;
        int length = bArr == null ? 0 : bArr.length;
        this.aDA = length;
        this.aDD = length <= 0;
    }

    private static String Go() {
        return "IHDR";
    }

    private static String Gp() {
        return "IEND";
    }

    private ChunkReader a(String str, int i, long j, boolean z) {
        return new ChunkReader(i, str, j, z ? ChunkReader.ChunkReaderMode.SKIP : ChunkReader.ChunkReaderMode.BUFFER) { // from class: com.kwad.sdk.pngencrypt.b.2
            @Override // com.kwad.sdk.pngencrypt.ChunkReader
            protected final void Gk() {
                b.this.a(this);
            }

            @Override // com.kwad.sdk.pngencrypt.ChunkReader
            protected final void a(int i2, byte[] bArr, int i3, int i4) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("should never happen"));
            }
        };
    }

    private static void h(byte[] bArr) {
        if (Arrays.equals(bArr, n.GN())) {
            return;
        }
        com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad signature:" + Arrays.toString(bArr)));
    }

    protected boolean Gl() {
        return true;
    }

    public final long Gm() {
        return this.aDG;
    }

    public final DeflatedChunksSet Gn() {
        return this.aDH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ChunkReader chunkReader) {
        if (this.aDF == 1 && !Go().equals(chunkReader.Gj().adQ)) {
            String str = "Bad first chunk: " + chunkReader.Gj().adQ + " expected: " + Go();
            if (this.aDK.c < ErrorBehaviour.SUPER_LENIENT.c) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException(str));
            } else {
                com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", str);
            }
        }
        Gp();
        if (chunkReader.Gj().adQ.equals(Gp())) {
            this.aDE = true;
            close();
        }
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public int b(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        long j2;
        if (this.closed) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen. Bad length: " + i2));
        }
        if (this.aDD) {
            ChunkReader chunkReader = this.aDI;
            if (chunkReader == null || chunkReader.isDone()) {
                int i4 = this.aDC;
                int i5 = 8 - i4;
                if (i5 <= i2) {
                    i2 = i5;
                }
                System.arraycopy(bArr, i, this.aDB, i4, i2);
                int i6 = this.aDC + i2;
                this.aDC = i6;
                i3 = i2 + 0;
                this.aDG += i2;
                if (i6 == 8) {
                    this.aDF++;
                    c(n.g(this.aDB, 0), com.kwad.sdk.pngencrypt.chunk.b.i(this.aDB, 4), this.aDG - 8);
                    this.aDC = 0;
                }
                return i3;
            }
            int b = this.aDI.b(bArr, i, i2);
            if (b < 0) {
                return -1;
            }
            i3 = b + 0;
            j = this.aDG;
            j2 = b;
        } else {
            int i7 = this.aDA;
            int i8 = this.aDC;
            int i9 = i7 - i8;
            if (i9 <= i2) {
                i2 = i9;
            }
            System.arraycopy(bArr, i, this.aDB, i8, i2);
            int i10 = this.aDC + i2;
            this.aDC = i10;
            if (i10 == this.aDA) {
                h(this.aDB);
                this.aDC = 0;
                this.aDD = true;
            }
            i3 = i2 + 0;
            j = this.aDG;
            j2 = i2;
        }
        this.aDG = j + j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i, String str, long j) {
        com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", "New chunk: " + str + " " + i + " off:" + j);
        if (str.length() != 4 || !com.kwad.sdk.pngencrypt.chunk.b.aFA.matcher(str).matches()) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk id: " + str));
        }
        if (i < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk len: " + i));
        }
        if (str.equals("IDAT")) {
            this.aDJ += i;
        }
        boolean Gl = Gl();
        boolean o = o(i, str);
        boolean fc = fc(str);
        DeflatedChunksSet deflatedChunksSet = this.aDH;
        boolean ff = (deflatedChunksSet == null || deflatedChunksSet.isClosed()) ? false : this.aDH.ff(str);
        if (!fc || o) {
            this.aDI = a(str, i, j, o);
        } else {
            if (!ff) {
                DeflatedChunksSet deflatedChunksSet2 = this.aDH;
                if (deflatedChunksSet2 != null && !deflatedChunksSet2.isDone()) {
                    com.kwad.sdk.core.e.c.printStackTrace(new PngjException("new IDAT-like chunk when previous was not done"));
                }
                this.aDH = fb(str);
            }
            this.aDI = new d(i, str, Gl, j, this.aDH) { // from class: com.kwad.sdk.pngencrypt.b.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.kwad.sdk.pngencrypt.d, com.kwad.sdk.pngencrypt.ChunkReader
                public final void Gk() {
                    super.Gk();
                    b.this.a(this);
                }
            };
        }
        ChunkReader chunkReader = this.aDI;
        if (chunkReader == null || Gl) {
            return;
        }
        chunkReader.bu(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DeflatedChunksSet deflatedChunksSet = this.aDH;
        if (deflatedChunksSet != null) {
            deflatedChunksSet.close();
        }
        this.closed = true;
    }

    protected abstract DeflatedChunksSet fb(String str);

    protected boolean fc(String str) {
        return false;
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public final boolean isDone() {
        return this.aDE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(int i, String str) {
        return false;
    }
}
