package com.kwad.sdk.pngencrypt;

import java.util.zip.Inflater;
/* loaded from: classes3.dex */
public class DeflatedChunksSet {
    protected final boolean aDR;
    protected byte[] aEh;
    private int aEi;
    private int aEj;
    private int aEk;
    State aEl;
    private final boolean aEm;
    private d aEn;
    private long aEo = 0;
    private long aEp = 0;
    int aEq = -1;
    int aEr = -1;
    public final String aEs;
    private Inflater inf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum State {
        WAITING_FOR_INPUT,
        ROW_READY,
        DONE,
        CLOSED;

        public final boolean isClosed() {
            return this == CLOSED;
        }

        public final boolean isDone() {
            return this == DONE || this == CLOSED;
        }
    }

    public DeflatedChunksSet(String str, boolean z, int i, int i2, Inflater inflater, byte[] bArr) {
        boolean z2;
        this.aEl = State.WAITING_FOR_INPUT;
        this.aEs = str;
        this.aDR = z;
        this.aEj = i;
        if (i <= 0 || i2 < i) {
            throw new PngjException("bad inital row len " + i);
        }
        if (inflater != null) {
            this.inf = inflater;
            z2 = false;
        } else {
            this.inf = new Inflater();
            z2 = true;
        }
        this.aEm = z2;
        this.aEh = (bArr == null || bArr.length < i) ? new byte[i2] : bArr;
        this.aEk = -1;
        this.aEl = State.WAITING_FOR_INPUT;
        try {
            cH(i);
        } catch (RuntimeException e) {
            close();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[Catch: RuntimeException -> 0x0083, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0083, blocks: (B:2:0x0000, B:4:0x0006, B:5:0x0010, B:8:0x001a, B:10:0x001e, B:13:0x0029, B:15:0x002f, B:17:0x0037, B:21:0x0051, B:20:0x0046, B:22:0x005c, B:24:0x0062, B:32:0x0077, B:34:0x007d, B:25:0x0065, B:27:0x006d, B:28:0x0070, B:31:0x0075, B:12:0x0023), top: B:41:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean Gw() {
        /*
            r6 = this;
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r0 = r6.aEl     // Catch: java.lang.RuntimeException -> L83
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r1 = com.kwad.sdk.pngencrypt.DeflatedChunksSet.State.ROW_READY     // Catch: java.lang.RuntimeException -> L83
            if (r0 != r1) goto L10
            com.kwad.sdk.pngencrypt.PngjException r0 = new com.kwad.sdk.pngencrypt.PngjException     // Catch: java.lang.RuntimeException -> L83
            java.lang.String r1 = "invalid state"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L83
            com.kwad.sdk.core.e.c.printStackTrace(r0)     // Catch: java.lang.RuntimeException -> L83
        L10:
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r0 = r6.aEl     // Catch: java.lang.RuntimeException -> L83
            boolean r0 = r0.isDone()     // Catch: java.lang.RuntimeException -> L83
            r1 = 0
            if (r0 == 0) goto L1a
            return r1
        L1a:
            byte[] r0 = r6.aEh     // Catch: java.lang.RuntimeException -> L83
            if (r0 == 0) goto L23
            int r0 = r0.length     // Catch: java.lang.RuntimeException -> L83
            int r2 = r6.aEj     // Catch: java.lang.RuntimeException -> L83
            if (r0 >= r2) goto L29
        L23:
            int r0 = r6.aEj     // Catch: java.lang.RuntimeException -> L83
            byte[] r0 = new byte[r0]     // Catch: java.lang.RuntimeException -> L83
            r6.aEh = r0     // Catch: java.lang.RuntimeException -> L83
        L29:
            int r0 = r6.aEi     // Catch: java.lang.RuntimeException -> L83
            int r2 = r6.aEj     // Catch: java.lang.RuntimeException -> L83
            if (r0 >= r2) goto L5c
            java.util.zip.Inflater r0 = r6.inf     // Catch: java.lang.RuntimeException -> L83
            boolean r0 = r0.finished()     // Catch: java.lang.RuntimeException -> L83
            if (r0 != 0) goto L5c
            java.util.zip.Inflater r0 = r6.inf     // Catch: java.util.zip.DataFormatException -> L45 java.lang.RuntimeException -> L83
            byte[] r2 = r6.aEh     // Catch: java.util.zip.DataFormatException -> L45 java.lang.RuntimeException -> L83
            int r3 = r6.aEi     // Catch: java.util.zip.DataFormatException -> L45 java.lang.RuntimeException -> L83
            int r4 = r6.aEj     // Catch: java.util.zip.DataFormatException -> L45 java.lang.RuntimeException -> L83
            int r4 = r4 - r3
            int r0 = r0.inflate(r2, r3, r4)     // Catch: java.util.zip.DataFormatException -> L45 java.lang.RuntimeException -> L83
            goto L51
        L45:
            r0 = move-exception
            com.kwad.sdk.pngencrypt.PngjException r2 = new com.kwad.sdk.pngencrypt.PngjException     // Catch: java.lang.RuntimeException -> L83
            java.lang.String r3 = "error decompressing zlib stream "
            r2.<init>(r3, r0)     // Catch: java.lang.RuntimeException -> L83
            com.kwad.sdk.core.e.c.printStackTrace(r2)     // Catch: java.lang.RuntimeException -> L83
            r0 = r1
        L51:
            int r2 = r6.aEi     // Catch: java.lang.RuntimeException -> L83
            int r2 = r2 + r0
            r6.aEi = r2     // Catch: java.lang.RuntimeException -> L83
            long r2 = r6.aEp     // Catch: java.lang.RuntimeException -> L83
            long r4 = (long) r0     // Catch: java.lang.RuntimeException -> L83
            long r2 = r2 + r4
            r6.aEp = r2     // Catch: java.lang.RuntimeException -> L83
        L5c:
            int r0 = r6.aEi     // Catch: java.lang.RuntimeException -> L83
            int r2 = r6.aEj     // Catch: java.lang.RuntimeException -> L83
            if (r0 != r2) goto L65
        L62:
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r0 = com.kwad.sdk.pngencrypt.DeflatedChunksSet.State.ROW_READY     // Catch: java.lang.RuntimeException -> L83
            goto L77
        L65:
            java.util.zip.Inflater r0 = r6.inf     // Catch: java.lang.RuntimeException -> L83
            boolean r0 = r0.finished()     // Catch: java.lang.RuntimeException -> L83
            if (r0 != 0) goto L70
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r0 = com.kwad.sdk.pngencrypt.DeflatedChunksSet.State.WAITING_FOR_INPUT     // Catch: java.lang.RuntimeException -> L83
            goto L77
        L70:
            int r0 = r6.aEi     // Catch: java.lang.RuntimeException -> L83
            if (r0 <= 0) goto L75
            goto L62
        L75:
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r0 = com.kwad.sdk.pngencrypt.DeflatedChunksSet.State.DONE     // Catch: java.lang.RuntimeException -> L83
        L77:
            r6.aEl = r0     // Catch: java.lang.RuntimeException -> L83
            com.kwad.sdk.pngencrypt.DeflatedChunksSet$State r2 = com.kwad.sdk.pngencrypt.DeflatedChunksSet.State.ROW_READY     // Catch: java.lang.RuntimeException -> L83
            if (r0 != r2) goto L82
            r6.Gx()     // Catch: java.lang.RuntimeException -> L83
            r0 = 1
            return r0
        L82:
            return r1
        L83:
            r0 = move-exception
            r6.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.pngencrypt.DeflatedChunksSet.Gw():boolean");
    }

    public final int GA() {
        return this.aEk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Gx() {
    }

    protected int Gy() {
        throw new PngjException("not implemented");
    }

    public final void Gz() {
        if (isDone()) {
            return;
        }
        this.aEl = State.DONE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(d dVar) {
        if (!this.aEs.equals(dVar.Gj().adQ)) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk inside IdatSet, id:" + dVar.Gj().adQ + ", expected:" + this.aEs));
        }
        this.aEn = dVar;
        int i = this.aEq + 1;
        this.aEq = i;
        int i2 = this.aEr;
        if (i2 >= 0) {
            dVar.cG(i + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(byte[] bArr, int i, int i2) {
        this.aEo += i2;
        if (i2 <= 0 || this.aEl.isDone()) {
            return;
        }
        if (this.aEl == State.ROW_READY) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("this should only be called if waitingForMoreInput"));
        }
        if (this.inf.needsDictionary() || !this.inf.needsInput()) {
            throw new RuntimeException("should not happen");
        }
        this.inf.setInput(bArr, i, i2);
        if (!this.aDR) {
            Gw();
            return;
        }
        while (Gw()) {
            cH(Gy());
            isDone();
        }
    }

    public final void cH(int i) {
        this.aEi = 0;
        this.aEk++;
        if (i <= 0 || this.inf.finished()) {
            this.aEj = 0;
            Gz();
            return;
        }
        this.aEl = State.WAITING_FOR_INPUT;
        this.aEj = i;
        if (this.aDR) {
            return;
        }
        Gw();
    }

    public void close() {
        Inflater inflater;
        try {
            if (!this.aEl.isClosed()) {
                this.aEl = State.CLOSED;
            }
            if (!this.aEm || (inflater = this.inf) == null) {
                return;
            }
            inflater.end();
            this.inf = null;
        } catch (Exception e) {
        }
    }

    public final boolean ff(String str) {
        if (this.aEl.isClosed()) {
            return false;
        }
        if (str.equals(this.aEs)) {
            return true;
        }
        if (this.aEl.isDone()) {
            if (!this.aEl.isClosed()) {
                close();
            }
            return false;
        }
        throw new PngjException("Unexpected chunk " + str + " while " + this.aEs + " set is not done");
    }

    public final boolean isClosed() {
        return this.aEl.isClosed();
    }

    public final boolean isDone() {
        return this.aEl.isDone();
    }

    public String toString() {
        return new StringBuilder("idatSet : " + this.aEn.Gj().adQ + " state=" + this.aEl + " rows=" + this.aEk + " bytes=" + this.aEo + "/" + this.aEp).toString();
    }
}
